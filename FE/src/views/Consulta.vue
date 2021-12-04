<template>
    <div class="consulta">
     
		<table style="width: 100%">
			<tr>
			<td>&nbsp;</td>
			<td>

				<table align="center" class="auto-style7" style="width: 400px">
						<tr>
						<td class="auto-style1">
					<img alt="" height="120" src="../assets/images/Logo01.png" width="120" /></td>
						<td class="auto-style1">
					<img alt="" height="151" src="../assets/images/03Consulta02.png" width="120" class="auto-style9" /></td>
						</tr>
				</table>

			</td>
			<td>&nbsp;</td>
			</tr>
			<tr>
			<td>&nbsp;</td>
			<td>

				<table class="auto-style10" style="width: 400px">
						<tr>
						<td class="auto-style1">
					<img alt="" class="auto-style2" height="23" src="../assets/images/04TituloCR01.png" width="299" /></td>
						</tr>
						<tr>
						<td class="auto-style1">
					<img alt="" height="25" src="../assets/images/05TituloCS.png" width="160" class="auto-style11" /></td>
						</tr>
				</table>

			</td>
			<td>&nbsp;</td>
			</tr>
			<tr>
			<td>&nbsp;</td>
			<td>

				<table class="auto-style10" style="width: 400px">
						<tr>
						<td class="auto-style4" style="width: 200px">&nbsp;</td>
						<td class="auto-style3" style="width: 200px">&nbsp;</td>
						</tr>
						<tr>
					<td class="auto-style4" rowspan="5" style="width: 200px">&nbsp;<img alt="" height="140" src="../assets/images/05Consult02.png" width="140" /></td>
					<td class="auto-style3" style="width: 200px">&nbsp;Por <strong>Lista de Equipos</strong>&nbsp;</td>
						</tr>
						<tr>
					<td class="auto-style4" style="height: 33px; width: 200px">&nbsp;<a href="consulta.html">Listado de Equipos</a></td>
						</tr>
						<tr>
						<td class="auto-style3" style="width: 200px">&nbsp;</td>
						</tr>
						<tr>
					<td class="auto-style3" style="width: 200px">&nbsp;&nbsp;Por <strong>ID de Equipo</strong></td>
						</tr>
						<tr>
						<td class="auto-style4" style="width: 200px">&nbsp;<input name="Text1" type="text" /></td>
						</tr>
						<tr>
						<td class="auto-style3" style="width: 200px">&nbsp;</td>
						<td class="auto-style3" style="width: 200px">&nbsp;</td>
						</tr>
						<tr>
						<td class="auto-style4" style="width: 200px">
					<router-link to="/main">
					<div id="img1" class="shadow" src="../assets/images/05Buscar01.png"></div></router-link>&nbsp;</td>
						<td class="auto-style4" style="width: 200px">
					<router-link to="/main">
					<div id="img2" class="shadow" src="../assets/images/00Cancelar01.png"></div></router-link>&nbsp;</td>
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



<style>
	.auto-style1 {
		text-align: center;
	}
	.auto-style2 {
		margin-bottom: 10px;
		margin-top: 10px;
	}
	.auto-style3 {
		font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
		border: 0px solid #808080;
	}
	.auto-style4 {
		font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
		text-align: center;
	}
	.auto-style5 {
		border-width: 0px;
	}
	.auto-style7 {
		margin-left: auto;
		margin-right: auto;
		border: 3px solid #808080;
		border-collapse: collapse;
		background-color: #FFFFFF;
	}
	.auto-style9 {
		margin-top: 5px;
		margin-bottom: 5px;
	}
	.auto-style10 {
		margin-left: auto;
		margin-right: auto;
		border: 3px solid #808080;
		background-color: #FFFFFF;
	}
	.auto-style11 {
		margin-bottom: 10px;
	}


	#img1 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/05Buscar01.png");
	}

	#img1:hover {
		background-image:url("../assets/images/05Buscar02.png");
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