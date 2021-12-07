<template>
	<div class="menu_principal">

		<table style="width: 100%">
			<tr>
			<td></td>
			<td>

				<table align="center" class="tabla_blanca" style="width: 350px">
						<tr>
						<td>
					<router-link to="/">
					<img id="titulo_03" height="300" src="../assets/images/Logo01.png" width="300" /></router-link></td>
						</tr>
						<tr>
						<td>
					<img height="30" src="../assets/images/03TituloMP01a.png" width="157" /></td>
						</tr>
						<tr>
						<td>
					<img height="15" src="../assets/images/03TituloMP01b.png" width="113" /></td>
						</tr>
						<tr>
						<td>&nbsp;</td>
						</tr>
				</table>

			</td>
			<td></td>
			</tr>
			<tr>
			<td></td>
			<td>

				<table align="center" class="tabla_blanca" style="width: 400px">
						<tr>
						<td>&nbsp;</td>
						</tr>
						<tr>
						<td colspan="2">
					<img height="15" src="../assets/images/03Consultar.png" width="95" />&nbsp;</td>
						</tr>
						<tr>
						<td colspan="2">
					<router-link to="/consulta">
					<div id="img7_03" class="shadow" src="../assets/images/03Consulta02.png"></div></router-link>&nbsp;</td>
						</tr>
						<tr>
						</tr>
						<tr>
						<td>
					<img height="15" src="../assets/images/03CrearEditar.png" width="130" />&nbsp;</td>
						<td>&nbsp;
					<img height="15" src="../assets/images/03Eliminar.png" width="79" /></td>
						</tr>
						<tr>
						<td>&nbsp;
					<router-link to="/creaideqp">
					<div id="img8_03" class="shadow" src="../assets/images/03Crear02.png"></div></router-link></td>
						<td>&nbsp;
					<router-link to="/eliminar">
					<div id="img9_03" class="shadow" src="../assets/images/03Eliminar02.png"></div></router-link></td>
						</tr>
						<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						</tr>
						<tr>
						<td colspan="2">
					<router-link to="/">
					<div id="img6_03" class="shadow" src="../assets/images/03Salir01.png"></div></router-link></td>
						</tr>
						<tr>
						<td colspan="2">&nbsp;</td>
						</tr>
				</table>
				
			</td>
			<td>&nbsp;</td>
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

	#titulo_03 {
		border-width: 0px;
	}

	#img6_03 {
		margin:0 auto;
		width: 207px;
		height: 60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/03Salir01.png");
	}

	#img6_03:hover {
		margin:0 auto;
		width:207px;
		height:60px;
		background-image:url("../assets/images/03Salir02.png");
	}

	#img7_03 {
		margin:0 auto;
		width:119px;
		height:150px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/03Consulta02.png");
	}

	#img7_03:hover {
		margin:0 auto;
		width:119px;
		height:150px;
		background-image:url("../assets/images/03Consulta03.png");
	}

	#img8_03 {
		margin:0 auto;
		width:119px;
		height:150px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/03Crear02.png");
	}

	#img8_03:hover {
		margin:0 auto;
		width:119px;
		height:150px;
		background-image:url("../assets/images/03Crear03.png");
	}

	#img9_03 {
		margin:0 auto;
		width:119px;
		height:150px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/03Eliminar02.png");
	}

	#img9_03:hover {
		margin:0 auto;
		width:119px;
		height:150px;
		background-image:url("../assets/images/03Eliminar03.png");
	}

</style>