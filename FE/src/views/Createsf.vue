<template>
    <div class="crearsf">

      	<div class="container_crearsf">
		  	<form v-on:submit.prevent="processCreatesf">
				<table style="width: 100%">
					<tr>
					<td></td>
					<td>

						<table align="center" class="tabla_blanca" style="width: 400px">
								<tr>
								<td>
							<img height="120" src="../assets/images/Logo01.png" width="120" /></td>
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

						<table align="center" class="tabla_blanca" style="width: 400px" >
								<tr>
								<td>&nbsp;</td>
								<td>
							<img class="icono_seccion" width="100" src="../assets/images/04Sfw02.png" /></td>
								<td>&nbsp;</td>
								</tr>
								<tr>
								<td>&nbsp;</td>
								<td>
							<img height="15" src="../assets/images/04Sfw.png" width="109" />&nbsp;</td>
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
								<td>&nbsp;</td>
								</tr>
								<tr>

								<td class="texto_formulario" width="250px">
							<strong>&nbsp; Sistema Operativo</strong></td>
								<td>&nbsp;</td>
								</tr>
								<tr>

							<td class="texto_formulario" width="250px">&nbsp; 1. Edición</td>
								<td class="campo_formulario" style="width: 250px">
							<select v-model="equiposf.soEdicion">
								<option value="Windows 11">Windows 11</option>
								<option value="Windows 10">Windows 10</option>
								<option value="Windows 8.1">Windows 8.1</option>
								<option value="Windows 8">Windows 8</option>
								<option value="Windows 7">Windows 7</option>
								<option value="Windows Vista">Windows Vista</option>
								<option value="Windows XP">Windows XP</option>
								<option value="Mac OS 12.0">Mac OS 12.0</option>
								<option value="Mac OS 11.0">Mac OS 11.0</option>
								<option value="Mac OS 10.15">Mac OS 10.15</option>
								<option value="Mac OS 10.14">Mac OS 10.14</option>
								<option value="Mac OS 10.13">Mac OS 10.13</option>
								<option value="Mac OS 10.12">Mac OS 10.12</option>
								<option value="Mac OS 10.11">Mac OS 10.11</option>
								<option value="Mac OS 10.10">Mac OS 10.10</option>
								<option value="Mac OS 10.9">Mac OS 10.9</option>
								<option value="Mac OS 10.8">Mac OS 10.8</option>
								<option value="Mac OS 10.7">Mac OS 10.7</option>
								<option value="Mac OS 10.6">Mac OS 10.6</option>
								<option value="Mac OS 10.5">Mac OS 10.5</option>
								<option value="Mac OS 10.4">Mac OS 10.4</option>
								<option value="Mac OS 10.3">Mac OS 10.3</option>
								<option value="Mac OS 10.2">Mac OS 10.2</option>
								<option value="Mac OS 10.1">Mac OS 10.1</option>
								<option value="Mac OS 10.0">Mac OS 10.0</option>
								<option value="Linux">Linux</option>
								<option value="Otro">Otro</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="250px">&nbsp; 2. Tipo de Sistema</td>
								<td class="campo_formulario" style="width: 250px">
							<select v-model="equiposf.soTipo">
								<option value="64 bits">64 bits</option>
								<option value="32 bits">32 bits</option>
								</select></td>
								</tr>
								<tr>

								<td>&nbsp;</td>
								</tr>
								<tr>

								<td class="texto_formulario" width="250px">
							<strong>&nbsp; Antivirus</strong></td>
								<td>&nbsp;</td>
								</tr>
								<tr>

							<td class="texto_formulario" width="250px">&nbsp; 3. Marca</td>
								<td class="campo_formulario" style="width: 250px">
							<select v-model="equiposf.avirusMarca">
								<option value="Avast">Avast</option>
								<option value="Avira">Avira</option>
								<option value="AVG">AVG</option>
								<option value="Bitdefender">BitDefender</option>
								<option value="Kaspersky">Kaspersky</option>
								<option value="Malwarebytes ">Malwarebytes</option>
								<option value="McAfee">McAfee</option>
								<option value="Norton">Norton</option>
								<option value="Panda">Panda</option>
								<option value="TotalAV">TotalAV</option>
								<option value="Windows Defender">Windows Defender</option>
								<option value="ZoneAlarm">ZoneAlarm</option>
								<option value="Otro">Otro</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="250px">&nbsp; 4. Licencia</td>
								<td class="campo_formulario" style="width: 250px">
							<select v-model="equiposf.avirusLicencia">						
								<option value="Si">Si</option>
								<option value="No">No</option>
								</select></td>
								</tr>
								<tr>

								<td>&nbsp;</td>
								</tr>
								<tr>
								
								<td class="texto_formulario" width="250px">
							<strong>&nbsp; Software Instalado</strong></td>
								<td>&nbsp;</td>
								</tr>
								<tr>

							<td class="texto_formulario" width="250px">&nbsp; 5. Ofimática (Licencia)</td>
								<td class="campo_formulario" style="width: 250px">
							<select v-model="equiposf.ofiLicencia">
								<option value="No">No</option>
								<option value="Microsoft Office 365">Microsoft Office 365</option>
								<option value="Microsoft Office 2019">Microsoft Office 2019</option>
								<option value="Microsoft Office 2016">Microsoft Office 2016</option>
								<option value="Microsoft Office 2013">Microsoft Office 2013</option>
								<option value="Microsoft Office 2011 para Mac">Microsoft Office 2011 para Mac</option>
								<option value="Microsoft Office 2010">Microsoft Office 2010</option>
								<option value="Microsoft Office 2008 para Mac">Microsoft Office 2008 para Mac</option>
								<option value="Microsoft Office 2007">Microsoft Office 2007</option>
								<option value="Otro">Otro</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="250px">&nbsp; 6. Ofimática (Libre)</td>
								<td class="campo_formulario" style="width: 250px">
							<select v-model="equiposf.ofiLibre">							
								<option value="No">No</option>
								<option value="OpenOffice">OpenOffice</option>
								<option value="LibreOffice">LibreOffice</option>
								<option value="Otro">Otro</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="250px">&nbsp; 7. Otro 1</td>
								<td class="campo_formulario" style="width: 250px">
							<input type="text" v-model="equiposf.otro1"></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="250px">&nbsp; 8. Otro 1 (Licencia)</td>
								<td class="campo_formulario" style="width: 250px">
							<select v-model="equiposf.otro1Licencia">						
								<option value="Si">Si</option>
								<option value="No">No</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="250px">&nbsp; 9. Otro 2</td>
								<td class="campo_formulario" style="width: 250px">
							<input type="text" v-model="equiposf.otro2"></td>
								</tr>
								<tr>
								
							<td class="texto_formulario" width="250px">&nbsp; 10. Otro 2 (Licencia)</td>
								<td class="campo_formulario" style="width: 250px">
							<select v-model="equiposf.otro2Licencia">							
								<option value="Si">Si</option>
								<option value="No">No</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="250px">&nbsp; 11. Otro 3</td>
								<td class="campo_formulario" style="width: 250px">
							<input type="text" v-model="equiposf.otro3"></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="250px">&nbsp; 12. Otro 3 (Licencia)</td>
								<td class="campo_formulario" style="width: 250px">
							<select v-model="equiposf.otro3Licencia">							
								<option value="Si">Si</option>
								<option value="No">No</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="250px">&nbsp; 13. Notas</td>
								<td class="campo_formulario" style="width: 250px">
							<input type="text" v-model="equiposf.notas"></td>
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
    name: "Createsf",

    data: function() {
        return {
        equiposf: {
            soEdicion: "",
			soTipo: "",
			avirusMarca: "",
			avirusLicencia: "",
			ofiLicencia: "",
			ofiLibre: "",
			otro1: "",
			otro1Licencia: "",
			otro2: "",
			otro2Licencia: "",
			otro3: "",
			otro3Licencia: "",
			notas: "",
        	},
    	};
    },

  methods: {
    processCreatesf: async function() {
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


    .crearsf button {
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

	#img1:hover {
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