<template>
    <div class="menu_principal">

		<table style="width: 100%">
			<tr>
			<td>&nbsp;</td>
			<td>

				<table align="center" class="auto-style2" style="width: 400px">
						<tr>
						<td class="auto-style1">
					<img alt="" height="120" src="../assets/images/Logo01.png" width="120" /></td>
						<td class="auto-style1">
					<img alt="" class="auto-style3" height="149" src="../assets/images/03Crear02.png" width="120" /></td>
						</tr>
				</table>

			</td>
			<td>&nbsp;</td>
			</tr>
			<tr>
			<td>&nbsp;</td>
			<td>

				<table align="center" class="auto-style2" style="width: 400px">
						<tr>
						<td class="auto-style1">
					<img alt="" class="auto-style4" height="23" src="../assets/images/04TituloCR01.png" width="299" /></td>
						</tr>
						<tr>
						<td class="auto-style1">
					<img alt="" height="25" src="../assets/images/04TituloCE.png" width="211" /></td>
						</tr>
				</table>

			</td>
			<td>&nbsp;</td>
			</tr>
			<tr>
			<td>&nbsp;</td>
			<td>

				<table align="center" class="auto-style2" style="width: 450px">
						<tr>
						<td class="auto-style6">&nbsp;</td>
						<td class="auto-style6">&nbsp;</td>
						</tr>
						<tr>
						<td class="auto-style1">
					<img alt="" class="auto-style5" height="20" src="../assets/images/03Crear.png" width="74" /></td>
						<td class="auto-style1">
					<img alt="" class="auto-style5" height="20" src="../assets/images/03Editar.png" width="77" /></td>
						</tr>
						<tr>
						<td class="auto-style1">
					<img alt="" class="auto-style6" height="140" src="../assets/images/04Crear02.png" width="140" /></td>
						<td class="auto-style1">
					<img alt="" class="auto-style6" height="140" src="../assets/images/04Editar02.png" width="140" /></td>
						</tr>
						<tr>
						<td class="auto-style6">&nbsp;</td>
						<td class="auto-style6">&nbsp;</td>
						</tr>
						<tr>
					<td class="auto-style7"><strong>ID de Equipo</strong></td>
						<td class="auto-style6">&nbsp;</td>
						</tr>
						<tr>
					<td class="auto-style7"><input name="Text1" type="text" /></td>
						<td class="auto-style6">&nbsp;</td>
						</tr>
						<tr>
					<td class="auto-style7">Nombre del Equipo</td>
					<td class="auto-style7"><strong>ID de Equipo</strong></td>
						</tr>
						<tr>
					<td class="auto-style7"><input name="Text2" type="text" /></td>
					<td class="auto-style7"><input name="Text4" type="text" /></td>
						</tr>
						<tr>
					<td class="auto-style7">Ubicación</td>
						<td class="auto-style6">&nbsp;</td>
						</tr>
						<tr>
					<td class="auto-style7"><input name="Text3" type="text" /></td>
						<td class="auto-style6">&nbsp;</td>
						</tr>
						<tr>
						<td class="auto-style6">&nbsp;</td>
						<td class="auto-style6">&nbsp;</td>
						</tr>
						<tr>
						<td class="auto-style7">
					<router-link to="/crear">
					<div id="img1" class="shadow" src="../assets/images/04CECrear01.png"></div></router-link></td>
						<td class="auto-style7">
					<router-link to="/crear">
					<div id="img2" class="shadow" src="../assets/images/04CEEditar01.png"></div></router-link></td>
						</tr>
						<tr>
						<td class="auto-style6">&nbsp;</td>
						<td class="auto-style6">&nbsp;</td>
						</tr>
						<tr>
						<td class="auto-style7" colspan="2">
					<router-link to="/main">
					<div id="img3" class="shadow" src="../assets/images/00Cancelar01.png"></div></router-link></td>
						</tr>
						<tr>
						<td class="auto-style6">&nbsp;</td>
						<td class="auto-style6">&nbsp;</td>
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
	border: 3px solid #808080;
	background-color: #FFFFFF;
}
.auto-style3 {
  	border-width: 0px;
	margin-top: 5px;
	margin-bottom: 5px;
}
.auto-style4 {
	margin-top: 10px;
	margin-bottom: 10px;
}
.auto-style5 {
	font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
	margin-bottom: 10px;
}
.auto-style6 {
	border-width: 0px;
	font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
}
.auto-style7 {
	font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
	text-align: center;
}
.auto-style8 {
	border-width: 0px;
}

	#img1 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/04CECrear01.png");
	}

	#img1:hover {
		background-image:url("../assets/images/04CECrear02.png");
	}

	#img2 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/04CEEditar01.png");
	}

	#img2:hover {
		background-image:url("../assets/images/04CEEditar02.png");
	}

	
	#img3 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/00Cancelar01.png");
	}

	#img3:hover {
		background-image:url("../assets/images/00Cancelar02.png");
	}
</style>