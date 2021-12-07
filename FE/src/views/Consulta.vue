<template>
    <div class="consulta">
     
		<table style="width: 100%">
			<tr>
			<td>&nbsp;</td>
			<td>

				<table align="center" class="tabla_blanca" style="width: 400px">
						<tr>
						<td>
					<img height="120" src="../assets/images/Logo01.png" width="120" /></td>
						<td>
					<img class="icono_titulo" width="120" src="../assets/images/03Consulta02.png" /></td>
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
					<img id="titulo_05b" height="25" src="../assets/images/05TituloCS.png" width="160"  /></td>
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
						</tr>
						<tr>
					<td rowspan="5" style="width: 200px">&nbsp;<img width="140" src="../assets/images/05Consult02.png" /></td>
					<td class="texto_general" style="width: 200px">&nbsp;Por <strong>Lista de Equipos</strong>&nbsp;</td>
						</tr>
						<tr>
					<td class="texto_general" style="height: 33px; width: 200px">&nbsp;<a href="consulta.html">Listado de Equipos</a></td>
						</tr>
						<tr>
						<td>&nbsp;</td>
						</tr>
						<tr>
					<td class="texto_general" style="width: 200px">&nbsp;&nbsp;Por <strong>ID de Equipo</strong></td>
						</tr>
						<tr>
					<td style="width: 200px">&nbsp;<input name="Text1" type="text" /></td>
						</tr>
						<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						</tr>
						<tr>
						<td>
					<router-link to="/main">
					<div id="img1_05" class="shadow" src="../assets/images/05Buscar01.png"></div></router-link>&nbsp;</td>
						<td>
					<router-link to="/main">
					<div id="img2_05" class="shadow" src="../assets/images/00Cancelar01.png"></div></router-link>&nbsp;</td>
						</tr>
						<tr>
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

	#img1_05 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/05Buscar01.png");
	}

	#img1_05:hover {
		background-image:url("../assets/images/05Buscar02.png");
	}

	#img2_05 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/00Cancelar01.png");
	}

	#img2_05:hover {
		background-image:url("../assets/images/00Cancelar02.png");
	}

</style>