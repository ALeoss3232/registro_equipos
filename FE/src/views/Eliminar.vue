<template>
    <div class="eliminar">
      <link rel="icon" type="image/png" href="https://pragmatti.com/PC24x7/images/favicon.png" />
    <table style="width: 100%">
        <tr>
            <td>&nbsp;</td>
            <td>
            <table align="center" class="auto-style1" style="width: 400px">
                <tr>
                    <td class="auto-style2">
                    <img alt="" height="120" src="../assets/images/Logo01.png" width="120" /></td>
                    <td class="auto-style2">
                    <img alt="" class="auto-style3" height="151" src="../assets/images/03Eliminar02.png" width="120" /></td>
                </tr>
            </table>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>
            <table align="center" class="auto-style1" style="width: 400px">
                <tr>
                    <td class="auto-style2">
                    <img alt="" class="auto-style4" height="23" src="../assets/images/04TituloCR01.png" width="299" /></td>
                </tr>
                <tr>
                    <td class="auto-style2">
                    <img alt="" class="auto-style5" height="30" src="../assets/images/06TituloEL.png" width="180" />&nbsp;</td>
                </tr>
            </table>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>
            <table align="center" class="auto-style1" style="width: 400px">
                <tr>
                    <td class="auto-style7" colspan="2">&nbsp;</td>
                </tr>
                <tr>
                    <td class="auto-style2" colspan="2">
                    <img alt="" class="auto-style6" height="140" src="../assets/images/06Elimin02.png" width="140" /><span class="auto-style6">&nbsp;</span></td>
                </tr>
                <tr>
                    <td class="auto-style6" colspan="2">&nbsp;</td>
                </tr>
                <tr>
                    <td class="auto-style7" colspan="2"><strong>ID de Equipo a 
                    eliminar&nbsp;</strong></td>
                </tr>
                <tr>
                    <td class="auto-style7" colspan="2">&nbsp;<input name="Text1" type="text" /></td>
                </tr>
                <tr>
                    <td class="auto-style6" colspan="2">&nbsp;</td>
                </tr>
                <tr>
                    <td class="auto-style7">
                        <router-link to="/main">
                    <img id="img1" alt="" height="40" onclick="FP_swapImg(1,1,/*id*/'img1',/*url*/'../assets/images/06Eliminar03.png')" onmouseout="FP_swapImgRestore()" onmouseover="FP_swapImg(1,1,/*id*/'img1',/*url*/'../assets/images/06Eliminar02.png');" src="../assets/images/06Eliminar01.png" width="138" /></router-link>&nbsp;</td>
                    <td class="auto-style7">
                        <router-link to="/main">
                    <img id="img2" alt="" class="auto-style8" height="40" onclick="FP_swapImg(1,1,/*id*/'img2',/*url*/'../assets/images/00Cancelar03.png')" onmouseout="FP_swapImgRestore()" onmouseover="FP_swapImg(1,1,/*id*/'img2',/*url*/'../assets/images/00Cancelar02.png');" src="../assets/images/00Cancelar01.png" width="138" /></router-link>&nbsp;</td>
                </tr>
                <tr>
                    <td class="auto-style6" colspan="2">&nbsp;</td>
                </tr>
            </table>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
    </table>

    </div>
</template>

<style>
.auto-style1 {
	border: 3px solid #808080;
	background-color: #FFFFFF;
}
.auto-style2 {
	text-align: center;
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
	margin-bottom: 10px;
}
.auto-style6 {
	font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
}
.auto-style7 {
	text-align: center;
	font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
}
.auto-style8 {
	border-width: 0px;
}
</style>