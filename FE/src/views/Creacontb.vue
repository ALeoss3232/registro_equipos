<template>
    <div class="creacontb">

		<div class="container_creacontb">
			<form v-on:submit.prevent="processCreacontb">
				<table style="width: 100%">
					<tr>
					<td></td>
					<td>

						<table align="center" class="tabla_blanca" style="width: 400px">
								<tr>
								<td>
							<img height="120" src="../assets/images/Logo01.png" width="120"/></td>
								<td>
							<img class="icono_titulo" width="120" src="../assets/images/03Crear02.png" /></td>
								</tr>
						</table>

					</td>
					<td>&nbsp;</td>
					</tr>
					<tr>
					<td>&nbsp;</td>
					<td>

						<table align="center" class="tabla_blanca" style="width: 400px">
								<tr>
								<td>
							<img class="titulo_05a" height="23" src="../assets/images/04TituloCR01.png" width="299" /></td>
								</tr>
								<tr>
								<td>
							<img height="30" src="../assets/images/04TituloCR.png" width="147" /></td>
								</tr>
						</table>

					</td>
					<td>&nbsp;</td>
					</tr>
					<tr>
					<td>&nbsp;</td>
					<td>

						<table align="center" class="tabla_blanca" style="width: 400px">
								<tr>
								<td>&nbsp;</td>
								<td>
							<img class="icono_seccion" width="100" src="../assets/images/04Contb02.png" /></td>
								<td>&nbsp;</td>
								</tr>
								<tr>
								<td>&nbsp;</td>
								<td>
							<img height="15" src="../assets/images/04Contb.png" width="147" /></td>
								<td>&nbsp;</td>
								</tr>
						</table>

					</td>
					<td></td>
					</tr>
					<tr>
					<td></td>
					<td>

						<table align="center" class="tabla_blanca" style="width: 500px" >
								<tr>
								<td>&nbsp;</td>
								</tr>
								<tr>
							<td class="texto_general" width="250px"><strong>ID de Equipo</strong></td>
							<td class="texto_general" width="250px"><strong>XXXXXXXXXX</strong></td>
								</tr>
								<tr>
							<td class="texto_general" width="250px">Nombre</td>
							<td class="texto_general" width="250px">XXXXXXXXX</td>
								</tr>
								<tr>
							<td class="texto_general" width="250px">Ubicación</td>
							<td class="texto_general" width="250px">XXXXXX</td>
								</tr>
								<tr>
								<td>&nbsp;</td>
								</tr>
								<tr>

							<td class="texto_formulario" width="250px">&nbsp; 1. Código de Registro Contable</td>
								<td class="campo_formulario" style="width: 250px">
							<input type="text" v-model="equipocontb.codRegCont"></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="250px">&nbsp; 2. Factura de Compra</td>
								<td class="campo_formulario" style="width: 250px">
							<input type="text" v-model="equipocontb.factCompra"></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="250px">&nbsp; 3. Fecha de Compra</td>
								<td class="campo_formulario" style="width: 250px">
							<input type="date" v-model="equipocontb.fechaCompra"></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="250px">&nbsp; 4. Precio sin IVA</td>
								<td class="campo_formulario" style="width: 250px">
							<input type="number" v-model="equipocontb.precioSinIva"></td>
								</tr>
								<tr>
							
							<td class="texto_formulario" width="250px">&nbsp; 5. IVA</td>
								<td class="campo_formulario" style="width: 250px">
							<input type="number" v-model="equipocontb.iva"></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="250px">&nbsp; 6. Establecimiento de Compra</td>
								<td class="campo_formulario" style="width: 250px">
							<input type="text" v-model="equipocontb.establCompra"></td>
								</tr>
								<tr>
							
							<td class="texto_formulario" width="250px">&nbsp; 7. Vencimiento garantía</td>
								<td class="campo_formulario" style="width: 250px">
							<input type="date" v-model="equipocontb.vencGarant"></td>
								</tr>
								<tr>
							
								<td>&nbsp;</td>
								</tr>
								<tr>
								<td>

							<button type="submit">
							<div id="img1_08" class="shadow" src="../assets/images/04Guardar01.png"></div></button></td>
								<td>

							<button onclick="/crear">	
							<router-link to="/crear">
							<div id="img2_08" class="shadow" src="../assets/images/00Cancelar01.png"></div></router-link></button></td>
								</tr>
								<tr>

								<td>&nbsp;</td>
								</tr>
						</table>

					</td>
					</tr>
					<tr>
					</tr>
				</table>

			</form>
		</div>
	</div>
</template>
 

<script>

import gql from "graphql-tag";

export default {
    name: "Creacontb",

    data: function() {
        return {
        equipocontb: {
            codRegCont: "",
			factCompra: "",
			fechaCompra: "",
			precioSinIva: "",
			iva: "",
			establCompra: "",
			vencGarant: "",
			},
    	};
    },

  methods: {
    processCreacontb: async function() {
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
	
	.icono_titulo {
		margin-top: 5px;
		margin-bottom: 5px;
	}

	.titulo_05a {
		margin-bottom: 10px;
		margin-top: 10px;
		border-width: 0px;
	}

	.icono_seccion {
		margin-top: 10px;
	}

	.texto_general {	
		font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
		text-align: center;
	}

	.texto_formulario {	
		font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
		text-align: left;
	}

	.campo_formulario {
		font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
		text-align: left;
	}

    .creacontb button {
    	border-width: 0px;
		margin-top: 0px;

		width: 207;
        height: 60px;

        background: none;
    }

	#img1_08 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/04Guardar01.png");
	}

	#img1_08:hover {
		background-image:url("../assets/images/04Guardar02.png");
	}

	#img2_08 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/00Cancelar01.png");
	}

	#img2_08:hover {
		background-image:url("../assets/images/00Cancelar02.png");
	}

</style>