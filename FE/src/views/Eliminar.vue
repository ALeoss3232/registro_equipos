<template>

    <div class="eliminar">
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
                        <td>&nbsp;</td>
                        </tr>
                        <tr>
                        <td class="auto-style2" colspan="2">
                    <img alt="" class="auto-style6" height="140" src="../assets/images/06Elimin02.png" width="140" /></td>
                        </tr>
                        <tr>
                        <td>&nbsp;</td>
                        </tr>
                        <tr>
                    <td class="auto-style7" colspan="2"><strong>ID de Equipo a eliminar&nbsp;</strong></td>
                        </tr>
                        <tr>
                        <td class="auto-style7" colspan="2">&nbsp;
                    <input name="Text1" type="text" /></td>
                        </tr>
                        <tr>
                        <td>&nbsp;</td>
                        </tr>
                        <tr>
                        <td class="auto-style7">
                    
                    <router-link to="/main">
                    <div id="img1" class="shadow" src="../assets/images/06Eliminar01.png"></div></router-link>&nbsp;</td>
                        <td class="auto-style7">
                    
                    <router-link to="/main">
                    <div id="img2" class="shadow" src="../assets/images/00Cancelar01.png"></div></router-link>&nbsp;</td>
                        </tr>
                        <tr>
                        <td></td>
                        </tr>
                </table>

            </td>
            <td>&nbsp;</td>
            </tr>
            <tr>
            </tr>
        </table>

    </div>
</template>


<script>

</script>


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

    .eliminar button {
    	border-width: 0px;
		margin-top: 0px;

		width: 207;
        height: 60px;

        background: none;
    }

	#img1 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/06Eliminar01.png");
	}

	#img1:hover {
		background-image:url("../assets/images/06Eliminar02.png");
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