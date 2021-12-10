<template>
    <div class="menu_principal">

		<table style="width: 100%">
			<tr>
			<td>&nbsp;</td>
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
					<img id="titulo_04" height="25" src="../assets/images/04TituloCE.png" width="211" /></td>
						</tr>
				</table>

			</td>
			<td>&nbsp;</td>
			</tr>
			<tr>
			<td>&nbsp;</td>
			<td>

				<table align="center" class="tabla_blanca" style="width: 450px">
						<tr>
						<td>&nbsp;</td>
						</tr>
						<tr>
						<td>
					<img id="titulo_04a" height="20" src="../assets/images/03Crear.png" width="74" /></td>
						<td>
					<img id="titulo_04b" height="20" src="../assets/images/03Editar.png" width="77" /></td>
						</tr>
						<tr>
						<td>
					<img id="imgtitulo_04a" height="140" src="../assets/images/04Crear02.png" width="140" /></td>
						<td>
					<img id="imgtitulo_04b" height="140" src="../assets/images/04Editar02.png" width="140" /></td>
						</tr>
						<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						</tr>
						<tr>
					<td class="texto_general"><strong>ID de Equipo</strong></td>
						<td>&nbsp;</td>
						</tr>
						<tr>
					<td><input name="Text1" type="text" /></td>
						<td>&nbsp;</td>
						</tr>
						<tr>
					<td class="texto_general">Nombre del Equipo</td>
					<td class="texto_general"><strong>ID de Equipo</strong></td>
						</tr>
						<tr>
					<td><input name="Text2" type="text" /></td>
					<td><input name="Text4" type="text" /></td>
						</tr>
						<tr>
					<td class="texto_general">Ubicación</td>
						<td>&nbsp;</td>
						</tr>
						<tr>
					<td><input name="Text3" type="text" /></td>
						<td>&nbsp;</td>
						</tr>
						<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						</tr>
						<tr>
						<td>
					<router-link to="/crear">
					<div id="img1_04" class="shadow" src="../assets/images/04CECrear01.png"></div></router-link></td>
						<td>
					<router-link to="/crear">
					<div id="img2_04" class="shadow" src="../assets/images/04CEEditar01.png"></div></router-link></td>
						</tr>
						<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						</tr>
						<tr>
						<td colspan="2">
					<router-link to="/main">
					<div id="img3_04" class="shadow" src="../assets/images/00Cancelar01.png"></div></router-link></td>
						</tr>
						<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						</tr>
				</table>

			</td>
			</tr>
			<tr>
			</tr>
		</table>
    </div>
</template>


<script>

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

	.texto_general {	
		font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
		text-align: center;
	}


	#titulo_04a {
		border-width: 0px;
		margin-bottom: 10px;
		text-align: center;
	}

	#titulo_04b {
		border-width: 0px;
		margin-bottom: 10px;
		text-align: center;
	}

	#imgtitulo_04a {
		text-align: center;
	}

	#imgtitulo_04b {
		text-align: center;
	}

	#img1_04 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/04CECrear01.png");
	}

	#img1_04:hover {
		background-image:url("../assets/images/04CECrear02.png");
	}

	#img2_04 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/04CEEditar01.png");
	}

	#img2_04:hover {
		background-image:url("../assets/images/04CEEditar02.png");
	}

	
	#img3_04 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/00Cancelar01.png");
	}

	#img3_04:hover {
		background-image:url("../assets/images/00Cancelar02.png");
	}
</style>