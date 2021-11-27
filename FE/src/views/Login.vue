<template>    
  <div class="login">
    <table style="width: 100%">
	<tr>
		<td class="auto-style1" style="height: 282px">
		&nbsp;</td>
		<td class="auto-style1" style="height: 282px">
		<table align="center" class="auto-style8" style="width: 300px">
			<tr>
				<td>
		<router-link to="/">
		<img alt="" height="300" src="../assets/images/Logo01.png" width="300" class="auto-style7" /></router-link></td>
			</tr>
			<tr>
				<td>
		<img alt="" height="23" src="../assets/images/01TituloIS.png" width="176" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>
		<img alt="" height="15" src="../assets/images/01Usuario.png" width="75" /></td>
			</tr>
			<tr>
				<td>
			<input name="Usuario" style="height: 40px; width: 250px" type="text" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>
		<img alt="" class="auto-style2" height="15" src="../assets/images/01Contrasena.png" width="112" /></td>
			</tr>
			<tr>
				<td>
			<input class="auto-style4" name="Password1" style="height: 40px; width: 250px" type="password" /></td>
			</tr>
			<tr>
				<td>
			<input name="Checkbox1" type="checkbox" /><img alt="" class="auto-style6" height="15" src="../assets/images/01Recordatos.png" width="149" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>
		<router-link to="/main">
		<img id="img1" alt="" class="auto-style5" height="60" onclick="FP_swapImg(1,1,/*id*/'img1',/*url*/'../assets/images/00Iniciosesion03.png')" onmouseout="FP_swapImgRestore()" onmouseover="FP_swapImg(1,1,/*id*/'img1',/*url*/'../assets/images/00Iniciosesion02.png');" src="../assets/images/00Iniciosesion01.png" width="207" /></router-link></td>
			</tr>
			<tr>
				<td>
				&nbsp;</td>
			</tr>
			<tr>
				<td>
		<router-link to="/">
				<img id="img2" alt="" class="auto-style7" height="60" onclick="FP_swapImg(1,1,/*id*/'img2',/*url*/'../assets/images/00Cancelar03.png')" onmouseout="FP_swapImgRestore()" onmouseover="FP_swapImg(1,1,/*id*/'img2',/*url*/'../assets/images/00Cancelar02.png');" src="../assets/images/00Cancelar01.png" width="207" /></router-link></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
		</table>
		</td>
		<td class="auto-style1" style="height: 282px">
		&nbsp;</td>
	</tr>
	</table>
    </div>
</template>

<script>

</script>

<style>
.auto-style1 {
	text-align: center;
}
.auto-style2 {
	vertical-align: top;
}
.auto-style4 {
	margin-top: 10px;
	margin-bottom: 13px;
}
.auto-style5 {
	border-width: 0px;
	margin-top: 27px;
}
.auto-style6 {
	margin-left: 19px;
}
.auto-style7 {
	border-width: 0px;
}
.auto-style8 {
	border: 3px solid #808080;
	background-color: #FFFFFF;
}
</style>