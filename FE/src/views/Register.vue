<template>

  	<div class="signUp_user">
        <div class="container_signUp_user">
			<form v-on:submit.prevent="processSignUp" >
				<table style="width: 100%">
					<tbody>
						<tr>
						<td></td>
						<td>

							<table align="center" class="tabla_blanca" style="width: 300px">
								<tr>
								<td>&nbsp;
								<router-link to="/">
								<img id="titulo_01" height="300" src="../assets/images/Logo01.png" width="300"  /></router-link></td>
									</tr>
									<tr>
									<td>
								<img id="titulo_01a" height="23" src="../assets/images/02TituloRU.png" width="229" />&nbsp;</td>
									</tr>
									<tr>
									<td>
								<img class="titulo_campo" height="20" src="../assets/images/02TUsuario.png" width="159" /></td>
									</tr>
									<tr>
									<td>
								<select v-model="user.usertype">
									<option disabled value="">Seleccione un elemento</option>
									<option>Administrador</option>
									<option>Consulta</option>
								</select>
									</td>
									</tr>
									<tr>
									<td>
								<img class="titulo_campo" height="15" src="../assets/images/02NombreUsuario.png" width="185" /></td>
									</tr>
									<tr>
									<td>									
								<input type="text" v-model="user.username"></td>
									</tr>
									<tr>
									<td>
								<img class="titulo_campo" height="15" src="../assets/images/01Contrasena.png" width="112" /></td>
									</tr>
									<tr>
									<td>
								<input type="password" v-model="user.password"></td>
									</tr>
									<tr>
									<td>										
								<img class="titulo_campo" height="20" src="../assets/images/02NombreApellido.png" width="209" /></td>
									</tr>
									<tr>
									<td>
								<input type="text" v-model="user.name"></td>
									</tr>
									<tr>
									<td>							
								<img class="titulo_campo" height="15" src="../assets/images/02Correo.png" width="66" /></td>
									</tr>
									<tr>
									<td>
								<input type="email" v-model="user.email"></td>
									</tr>
									<tr>
									</tr>
									<tr>
									<td>
								<button type="submit">								
								<div id="img1_01" class="shadow" src="../assets/images/00Registrarse01.png"></div></button></td>
									</tr>
									<tr>
									</tr>
									<tr>
									<td>
								<button onclick="/">
								<router-link to="/">
								<div id="img2_01" class="shadow" src="../assets/images/00Cancelar01.png"></div></router-link></button></td>
									</tr>
									<tr>
									<td>&nbsp;</td>
									</tr>
							</table>

						</td>
						<td></td>
						</tr>
					</tbody>
				</table>
			</form>
		</div>		
  	</div>

</template>


<script>
import gql from "graphql-tag";

export default {
    name: "SignUp",

    data: function() {
        return {
        user: {
            usertype: "",
			username: "",
            password: "",
            name: "",
            email: "",
        	},
    	};
    },
 
  methods: {
    processSignUp: async function() {
      await this.$apollo
        .mutate({
          mutation: gql`
            mutation($userInput: SignUpInput!) {
              signUpUser(userInput: $userInput) {
                refresh
                access
              }
            }
          `,
          variables: {
            userInput: this.user,
          },
        })
        .then((result) => {
          let dataLogIn = {
            username: this.user.username,
            token_access: result.data.signUpUser.access,
            token_refresh: result.data.signUpUser.refresh,
          };

          this.$emit("Registro Exitoso", dataLogIn);
        })
        .catch((error) => {
          alert("ERROR: Fallo en el registro.");
        });
    },

  },
}

</script>

<style>

	.tabla_blanca {
		border: 3px solid #808080;
		background-color: #FFFFFF;
	}

	.signUp_user{
        margin: 0;
        padding: 0%;
        height: 100%;
        width: 100%;
    
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container_signUp_user {
        border: 0px solid  #283747;
        border-radius: 10px;
        width: 25%;
        height: 60%;
        
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
    }

    .signUp_user h2{
        color: #283747;
    }

    .signUp_user form{
        width: 70%;   
    }

    .signUp_user input{
        height: 40px;
        width: 250px;

        box-sizing: border-box;
        padding: 10px 20px;
        margin: 5px 0;

        border: 1px solid #283747;
    }

    .signUp_user button{
    	border-width: 0px;
		margin-top: 27px;

		width: 207;
        height: 60px;

        background: none;
    }

	.titulo_campo {
		margin-top: 10px;
		margin-bottom: 5px;
	}

	#titulo_01 {
		border-width: 0px;
	}

	#titulo_01a {
		margin-top: 10px;
		margin-bottom: 10px;
		border-width: 0px;
	}

	#titulo_01b {
		margin-top: 10px;
		margin-bottom: 6px;
		border-width: 0px;
	}

	#img1_01 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/00Registrarse01.png");
	}

	#img1_01:hover {
		background-image:url("../assets/images/00Registrarse02.png");
	}

	#img2_01 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/00Cancelar01.png");
	}

	#img2_01:hover {
		background-image:url("../assets/images/00Cancelar02.png");
	}

</style>