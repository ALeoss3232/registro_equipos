<template>    
	<div class="crearhw">
		
		<div class="container_crearhw">
			<form v-on:submit.prevent="processCreatehw">
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
							<img class="icono_seccion" width="100" src="../assets/images/04Hdw02.png" /></td>
								<td>&nbsp;</td>
								</tr>
								<tr>
								<td>&nbsp;</td>
								<td>
							<img height="15" src="../assets/images/04Hdw.png" width="118" /></td>
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
							<td class="texto_general" width="260px"><strong>ID de Equipo</strong></td>
							<td class="texto_general" width="240px"><strong>XXXXXXXXXX</strong></td>
								</tr>
								<tr>
							<td class="texto_general" width="260px">Nombre</td>
							<td class="texto_general" width="240px">XXXXXXXXX</td>
								</tr>
								<tr>
							<td class="texto_general" width="260px">Ubicación</td>
							<td class="texto_general" width="240px">XXXXXX</td>
								</tr>
								<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								</tr>
								<tr>
									
								<td class="texto_formulario" width="260px">
							<strong>&nbsp; DATOS GENERALES</strong></td>
								<td>&nbsp;</td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 1. Tipo de Equipo</td>
								<td class="campo_formulario" style="width: 240px">
							<select v-model="equipohw.tipoEquipo">
								<option value="Computador de Escritorio">Computador de Escritorio</option>
								<option value="Laptop / Portátil">Laptop / Portátil</option>
								</select></td>
								</tr>
								<tr>
							
							<td class="texto_formulario" width="260px">&nbsp; 2. Marca</td>
								<td class="campo_formulario" style="width: 240px">
							<select v-model="equipohw.marca">
								<option value="Acer">Acer</option>
								<option value="Apple">Apple</option>
								<option value="Asus">Asus</option>
								<option value="Dell">Dell</option>
								<option value="HP">HP</option>
								<option value="Huawei">Huawei</option>
								<option value="Lenovo">Lenovo</option>
								<option value="LG">LG</option>
								<option value="Microsoft">Microsoft</option>
								<option value="MSI">MSI</option>
								<option value="Razer">Razer</option>
								<option value="Samsung">Samsung</option>
								<option value="Toshiba">Toshiba</option>
								<option value="Otro">Otro</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 3. Modelo</td>
								<td class="campo_formulario" style="width: 240px">
							<input type="text" v-model="equipohw.modelo"></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 4. Número de Serie</td>
								<td class="campo_formulario" style="width: 240px">
							<input type="text" v-model="equipohw.numSerie"></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 5. Número de Producto&nbsp;</td>
								<td class="campo_formulario" style="width: 240px">
							<input type="text" v-model="equipohw.numProducto"></td>
								</tr>
								<tr>
							
							<td class="texto_formulario" width="260px"><em>&nbsp; Manuales (URL)</em></td>
								<td class="campo_formulario" style="width: 240px">
							<input type="text" v-model="equipohw.urlManual"></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px"><em>&nbsp; Controladores (Drivers) (URL)</em></td>
								<td class="campo_formulario" style="width: 240px">
							<input type="text" v-model="equipohw.urlControladores"></td>
								</tr>
								<tr>

								<td class="auto-style3" style="width: 260px">&nbsp;</td>
								<td class="auto-style3" style="width: 240px">&nbsp;</td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px"><strong>&nbsp;Especificaciones</strong></td>
								<td></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 6. Procesador (Marca)</td>
								<td class="campo_formulario" style="width: 240px">
							<select v-model="equipohw.procesMarca">
								<option value="Intel">Intel</option>
								<option value="AMD">AMD</option>
								<option value="Otro">Otro</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 7. Procesador (Modelo)</td>
								<td class="campo_formulario" style="width: 240px">
							<input type="text" v-model="equipohw.procesModelo"></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 8. Procesador (Velocidad)</td>
								<td class="campo_formulario" style="width: 240px">
							<input type="number" v-model="equipohw.procesVelocidad"><span class="campo_formulario">&nbsp;GHz</span></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 9. Memoria RAM</td>
								<td class="campo_formulario" style="width: 240px">
							<input type="number" v-model="equipohw.memoriaRam"><span class="campo_formulario">&nbsp;GB</span></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 10. Disco Duro (Tipo)</td>
								<td class="campo_formulario" style="width: 240px">
							<select v-model="equipohw.ddTipo">
								<option value="Disco Duro">Disco Duro</option>
								<option value="Estado Solido">Estado Solido (SSD)</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 11. Disco Duro (Capacidad)</td>
								<td class="campo_formulario" style="width: 240px">
							<input type="number" v-model="equipohw.ddCapacidad"><span class="campo_formulario">&nbsp;GB</span></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 12. Tarjeta Gráfica Independiente</td>
								<td class="campo_formulario" style="width: 240px">
							<select v-model="equipohw.tarGrafica">
								<option value="NO">NO</option>
								<option value="SI">SI</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 13. Tarjeta Gráfica (Marca)</td>
								<td class="campo_formulario" style="width: 240px">
							<select v-model="equipohw.tarGraficaMarca">								
								<option value="ElGato">ElGato</option>
								<option value="Gigabyte">Gigabyte</option>
								<option value="Nvidia">Nvidia</option>
								<option value="Otra">Otra</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 14. Pantalla (Tamaño en pulgadas)</td>
								<td class="campo_formulario" style="width: 240px">
							<input type="number" v-model="equipohw.pantalla"></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 15. Puertos USB</td>
								<td class="campo_formulario" style="width: 240px">
							<select v-model="equipohw.puertosUsb">
								<option value="0">0</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 16. Puertos HDMI</td>
								<td class="campo_formulario" style="width: 240px">
							<select v-model="equipohw.puertosHdmi">
								<option value="0">0</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 17. Salidas de Audio</td>
								<td class="campo_formulario" style="width: 240px">
							<select v-model="equipohw.audioSalidas">								
								<option value="0">0</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 18. Entradas de Audio</td>
								<td class="campo_formulario" style="width: 240px">
							<select v-model="equipohw.audioEntradas">								
								<option value="0">0</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 19. Bluetooth</td>
								<td class="campo_formulario" style="width: 240px">
							<select v-model="equipohw.bluetooth">
								<option value="SI">SI</option>
								<option value="NO">NO</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 20. WiFi</td>
								<td class="campo_formulario" style="width: 240px">
							<select v-model="equipohw.wifi">								
								<option value="SI">SI</option>
								<option value="NO">NO</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 21. Ethernet</td>
								<td class="campo_formulario" style="width: 240px">
							<select v-model="equipohw.ethernet">								
								<option value="SI">SI</option>
								<option value="NO">NO</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 23. Camara Web</td>
								<td class="campo_formulario" style="width: 240px">
							<select v-model="equipohw.camaraWeb">								
								<option value="SI">SI</option>
								<option value="NO">NO</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 24. Ratón</td>
								<td class="campo_formulario" style="width: 240px">
							<select v-model="equipohw.raton">								
								<option value="SI">SI</option>
								<option value="NO">NO</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 25. Teclado</td>
								<td class="campo_formulario" style="width: 240px">
							<select v-model="equipohw.teclado">								
								<option value="SI">SI</option>
								<option value="NO">NO</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 26. Unidad CD/DVD</td>
								<td class="campo_formulario" style="width: 240px">
							<select v-model="equipohw.unidadCdDvd">								
								<option value="SI">SI</option>
								<option value="NO">NO</option>
								</select></td>
								</tr>
								<tr>

							<td class="texto_formulario" width="260px">&nbsp; 27. Otros</td>
								<td class="campo_formulario" style="width: 240px">
							<input type="text" v-model="equipohw.otros"></td>
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
    name: "Createhw",

    data: function() {
        return {
        equipohw: {
            tipoEquipo: "",
			marca: "",
			modelo: "",
			numSerie: "",
			numProducto: "",
			urlManual: "",
			urlControladores: "",
			procesMarca: "",
			procesModelo: "",
			procesVelocidad: "",
			memoriaRam: "",
			ddTipo: "",
			ddCapacidad: "",
			tarGrafica: "",
			tarGraficaMarca: "",
			pantalla: "",
			puertosUsb: "",
			puertosHdmi: "",
			audioSalidas: "",
			audioEntradas: "",
			bluetooth: "",
			wifi: "",
			ethernet: "",
			camaraWeb: "",
			raton:	"",
			teclado: "",
			unidadCdDvd: "",
            otros: "",
        	},
    	};
    },

  methods: {
    processCreatehw: async function() {
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

    .crearhw button {
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