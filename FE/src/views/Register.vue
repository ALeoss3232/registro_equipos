<template>
  <div class="register">
      <link rel="icon" type="image/png" href="https://pragmatti.com/PC24x7/images/favicon.png" />
       
    <table style="width: 100%">
	<tbody class="auto-style1">
		<tr>
			<td class="auto-style1">
			&nbsp;</td>
			<td class="auto-style1">
			<table align="center" class="auto-style10" style="width: 300px">
				<tr>
					<td>&nbsp;
				<router-link to="/"><img alt="" height="300" src="../assets/images/Logo01.png" width="300" class="auto-style8" /></router-link></td>
				</tr>
				<tr>
					<td>
				<img alt="" class="auto-style2" height="23" src="../assets/images/02TituloRU.png" width="229" />&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;<img alt="" class="auto-style9" height="20" src="../assets/images/02TUsuario.png" width="159" /></td>
				</tr>
				<tr>
					<td>
			<select name="Select1" style="width: 250px; height: 40px">
			<option></option>
			<option value="Administrador">Administrador</option>
			<option value="Consulta">Consulta</option>
			</select>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;<img alt="" class="auto-style9" height="20" src="../assets/images/02NombreApellido.png" width="209" /></td>
				</tr>
				<tr>
					<td>&nbsp;<input name="Text3" style="width: 250px; height: 40px" type="text" /></td>
				</tr>
				<tr>
					<td>&nbsp;<img alt="" class="auto-style4" height="15" src="../assets/images/02NombreUsuario.png" width="185" /></td>
				</tr>
				<tr>
					<td>&nbsp;<input name="Text1" style="height: 40px; width: 250px" type="text" /></td>
				</tr>
				<tr>
					<td>&nbsp;<img alt="" class="auto-style4" height="15" src="../assets/images/01Contrasena.png" width="112" /></td>
				</tr>
				<tr>
					<td>
				<input name="Password1" style="width: 250px; height: 40px" type="password" />&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;<img alt="" height="18" src="../assets/images/02RepContrasena.png" width="180" class="auto-style5" /></td>
				</tr>
				<tr>
					<td>&nbsp;<input name="Password2" style="width: 250px; height: 40px;" type="password" /></td>
				</tr>
				<tr>
					<td>&nbsp;<img alt="" class="auto-style4" height="15" src="../assets/images/02Correo.png" width="66" /></td>
				</tr>
				<tr>
					<td>
				<input name="Text2" style="width: 252px; height: 40px" type="text" />&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;
				<router-link to="/login"><img id="img1" alt="" height="60" onclick="FP_swapImg(1,1,/*id*/'img1',/*url*/'../assets/images/00Registrarse03.png')" onmouseout="FP_swapImgRestore()" onmouseover="FP_swapImg(1,1,/*id*/'img1',/*url*/'../assets/images/00Registrarse02.png');" src="../assets/images/00Registrarse01.png" width="207" class="auto-style8" /></router-link></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>
				<router-link to="/">
			<img id="img2" alt="" class="auto-style8" height="60" onclick="FP_swapImg(1,1,/*id*/'img2',/*url*/'../assets/images/00Cancelar03.png')" onmouseout="FP_swapImgRestore()" onmouseover="FP_swapImg(1,1,/*id*/'img2',/*url*/'../assets/images/00Cancelar02.png');" src="../assets/images/00Cancelar01.png" width="207" /></router-link></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
			</table>
			</td>
			<td class="auto-style1">
			&nbsp;</td>
		</tr>
        </tbody>
		</table>
  </div>
</template>




<style>
.auto-style1 {
	text-align: center;
}
.auto-style2 {
	margin-top: 10px;
	margin-bottom: 10px;
}
.auto-style3 {
	margin-top: 10px;
	margin-bottom: 3px;
}
.auto-style4 {
	margin-top: 10px;
	margin-bottom: 5px;
}
.auto-style5 {
	margin-top: 10px;
}
.auto-style8 {
	border-width: 0px;
}
.auto-style9 {
	margin-top: 10px;
	margin-bottom: 6px;
}
.auto-style10 {
	border: 3px solid #808080;
	background-color: #FFFFFF;
}
</style>