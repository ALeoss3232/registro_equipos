<template>
    <div class="eliminar">

        <table style="width: 100%">
            <tr>
            <td>&nbsp;</td>
            <td>

                <table align="center" class="tabla_blanca" style="width: 400px">
                        <tr>
                        <td>
                    <img height="120" src="../assets/images/Logo01.png" width="120" /></td>
                        <td>
                    <img class="icono_titulo" width="120" src="../assets/images/03Eliminar02.png" /></td>
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
                    <img height="30" src="../assets/images/06TituloEL.png" width="180" />&nbsp;</td>
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
                        <td colspan="2">
                    <img height="140" src="../assets/images/06Elimin02.png" width="140" /></td>
                        </tr>
                        <tr>
                        <td>&nbsp;</td>
                        </tr>
                        <tr>
                    <td class="texto_general" colspan="2"><strong>ID de Equipo a eliminar&nbsp;</strong></td>
                        </tr>
                        <tr>
                        <td colspan="2">&nbsp;
                    <input name="Text1" type="text" /></td>
                        </tr>
                        <tr>
                        <td>&nbsp;</td>
                        </tr>
                        <tr>

                        <td>
                    <router-link to="/main">
                    <div id="img1_07" class="shadow" src="../assets/images/06Eliminar01.png"></div></router-link>&nbsp;</td>

                        <td>                    
                    <router-link to="/main">
                    <div id="img2_07" class="shadow" src="../assets/images/00Cancelar01.png"></div></router-link>&nbsp;</td>
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

    .eliminar button {
    	border-width: 0px;
		margin-top: 0px;

		width: 207;
        height: 60px;

        background: none;
    }

	#img1_07 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/06Eliminar01.png");
	}

	#img1_07:hover {
		background-image:url("../assets/images/06Eliminar02.png");
	}

	#img2_07 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/00Cancelar01.png");
	}

	#img2_07:hover {
		background-image:url("../assets/images/00Cancelar02.png");
	}


</style>