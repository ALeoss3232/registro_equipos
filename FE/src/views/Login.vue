<template>

  	<div class="logIn_user">
	  	<div class="container_logIn_user">
			<form v-on:submit.prevent="processLogInUser" >
					<table style="width: 100%">
						<tr>
						<td class="auto-style1" style="height: 282px">
						&nbsp;</td>
					<td class="auto-style1" style="height: 282px">
					<table align="center" class="auto-style8" style="width: 300px">
						<tr>
						<td>
					<router-link to="/">
					<img alt="" height="300" src="../assets/images/Logo01.png" width="300" class="auto-style7" /></router-link></td>
						</tr>
						<tr>
						<td>
					<img alt="" height="23" src="../assets/images/01TituloIS.png" width="176" /></td>
						</tr>
						<tr>
						<td>&nbsp;</td>
						</tr>
						<tr>
						<td>
					<img alt="" height="15" src="../assets/images/01Usuario.png" width="75" /></td>
						</tr>
						<tr>
						<td>
					<input type="text" v-model="user.username"></td>
						</tr>
						<tr>
						<td>&nbsp;</td>
						</tr>
						<tr>
						<td>
					<img alt="" class="auto-style2" height="15" src="../assets/images/01Contrasena.png" width="112" /></td>
						</tr>
						<tr>
						<td>
					<input type="password" v-model="user.password"></td>
						</tr>
						<tr>
						</tr>
						<tr>
						<td>
					<button type="submit">
						<div id="img1" class="shadow" src="../assets/images/00Iniciosesion01.png"></div></button></td>
						</tr>
						<tr>
						<td></td>
						</tr>
						<tr>
						<td>
					<button onclick="/">
					<router-link to="/">
						<div id="img2" class="shadow" src="../assets/images/00Cancelar01.png"></div></router-link></button></td>
						</tr>
						<tr>
						<td>&nbsp;</td>
						</tr>
					</table>
					</td>
					<td class="auto-style1" style="height: 282px">
					&nbsp;</td>
					</tr>
				</table>
			</form>
    	</div>
	</div>
	
</template>

<script>
import gql from "graphql-tag";

export default {
  name: "LogIn",

  data: function() {
    return {
      user: {
        username: "",
        password: "",
      },
    };
  },

  methods: {
    processLogInUser: async function() {
      await this.$apollo
        .mutate({
          mutation: gql`
            mutation($credentials: CredentialsInput!) {
              logIn(credentials: $credentials) {
                refresh
                access
              }
            }
          `,
          variables: {
            credentials: this.user,
          },
        })
        .then((result) => {
          let dataLogIn = {
            username: this.user.username,
            token_access: result.data.logIn.access,
            token_refresh: result.data.logIn.refresh,
          };

          this.$emit("completedLogIn", dataLogIn);
        })
        .catch((error) => {
          alert("ERROR 401: Credenciales Incorrectas.");
        });
    },
  },
}
</script>

<style>
	.auto-style1 {
		text-align: center;
	}
	.auto-style2 {
		vertical-align: top;
	}
	.auto-style4 {
		margin-top: 10px;
		margin-bottom: 13px;
	}
	.auto-style5 {
		border-width: 0px;
		margin-top: 27px;
	}
	.auto-style6 {
		margin-left: 19px;
	}
	.auto-style7 {
		border-width: 0px;
	}
	.auto-style8 {
		border: 3px solid #808080;
		background-color: #FFFFFF;
	}

    .logIn_user{
        margin: 0;
        padding: 0%;
        height: 100%;
        width: 100%;
    
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container_logIn_user {
        border: 0px solid  #283747;
        border-radius: 10px;
        width: 25%;
        height: 60%;
        
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
    }

    .logIn_user h2{
        color: #283747;

    }

    .logIn_user form{
        width: 70%;
        
    }

    .logIn_user input{
        height: 40px;
        width: 250px;

        box-sizing: border-box;
        padding: 10px 20px;
        margin: 5px 0;

        border: 1px solid #283747;
    }

	.logIn_user button {
		border: none;
		background-color: #FFFFFF;
		width:207px;
		height:60px;
    	margin: 10px;
	}


	#img1 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/00Iniciosesion01.png");
	}

	#img1:hover {
		background-image:url("../assets/images/00Iniciosesion02.png");
	}

	#img2 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/00Cancelar01.png");
	}

	#img2:hover {
		background-image:url("../assets/images/00Cancelar02.png");
	}
</style>