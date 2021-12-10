<template>
    <div class="crear">
    
		<table style="width: 100%">
			<tr>
			<td></td>
			<td>

				<table align="center" class="tabla_blanca" style="width: 400px" >
						<tr>
						<td>
					<img height="120" src="../assets/images/Logo01.png" width="120" /></td>
						<td>
					<img class="icono_titulo" width="120" src="../assets/images/03Crear02.png" /></td>
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
						<td>
					<img class="titulo_05a" height="23" src="../assets/images/04TituloCR01.png" width="299" /></td>
						</tr>
						<tr>
						<td>
					<img height="25" src="../assets/images/04TituloCE.png" width="211" />&nbsp;</td>
						</tr>
				</table>

			</td>
			<td></td>
			</tr>
			<tr>
			<td></td>
			<td>

				<table align="center" class="tabla_blanca" style="width: 450px">
						<tr>
						<td>&nbsp;</td>
						</tr>
						<tr>

					<td class="texto_general" width="225"><strong>ID de EQUIPO</strong></td>
					<td class="texto_general" width="225"><strong>XXXXXXXXXX</strong></td>
						</tr>
						<tr>

					<td class="texto_general" width="225">Nombre</td>
					<td class="texto_general" width="225">XXXXXXXXX</td>
						</tr>
						<tr>

					<td class="texto_general" width="225">Ubicación</td>
					<td class="texto_general" width="225">XXXXXX</td>
						</tr>
						<tr>

						<td>&nbsp;</td>
						<td>&nbsp;</td>
						</tr>
						<tr>							
						
						<td>
					<router-link to="/crearhw">
					<div id="img1_06" class="shadow" src="../assets/images/04Hdw02.png"></div></router-link><span>&nbsp;</span></td>

						<td>
					<router-link to="/crearsf">
					<div id="img2_06" class="shadow" src="../assets/images/04Sfw02.png"></div></router-link><span>&nbsp;</span></td>
						</tr>
						<tr>

						<td>
					<img height="15" src="../assets/images/04Hdw.png" width="117"/><span>&nbsp;</span></td>
						
						<td>
					<img height="15" src="../assets/images/04Sfw.png" width="109" /><span>&nbsp;</span></td>
						</tr>
						<tr>
						
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						</tr>
						<tr>

						<td>
					<router-link to="/creausr">
					<div id="img3_06" class="shadow" src="../assets/images/04Usr02.png"></div></router-link><span>&nbsp;</span></td>

						<td>
					<router-link to="/creacontb">
					<div id="img4_06" class="shadow" src="../assets/images/04Contb02.png"></div></router-link><span>&nbsp;</span></td>
						</tr>
						<tr>

						<td>
					<img height="15" src="../assets/images/04Usr.png" width="109"/><span>&nbsp;</span></td>

						<td>
					<img height="15" src="../assets/images/04Contb.png" width="147"/><span>&nbsp;</span></td>
						</tr>
						<tr>

						<td>&nbsp;</td>
						</tr>
						<tr>

						<td colspan="2">
					<router-link to="/main">
					<div id="img5_06" class="shadow" src="../assets/images/04MenuPrincipal01.png"></div></router-link></td>
						</tr>
						<tr>

						<td>&nbsp;</td>

					</tr>
				</table>

			</td>
			<td></td>
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

	.id_equipo {
		width: 225px;
		text-align: center;
		font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
		border-width: 0px;
	}

    .create button {
    	border-width: 0px;
		margin-top: 0px;

		width: 207;
        height: 60px;

        background: none;
    }


	#img1_06 {
		margin:0 auto;
		width:120px;
		height:120px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/04Hdw02.png");
	}

	#img1_06:hover {
		background-image:url("../assets/images/04Hdw03.png");
	}

	#img2_06 {
		margin:0 auto;
		width:120px;
		height:120px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/04Sfw02.png");
	}

	#img2_06:hover {
		background-image:url("../assets/images/04Sfw03.png");
	}

	#img3_06 {
		margin:0 auto;
		width:120px;
		height:120px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/04Usr02.png");
	}

	#img3_06:hover {
		background-image:url("../assets/images/04Usr03.png");
	}

	#img4_06 {
		margin:0 auto;
		width:120px;
		height:120px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/04Contb02.png");
	}

	#img4_06:hover {
		background-image:url("../assets/images/04Contb03.png");
	}

	#img5_06 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/04MenuPrincipal01.png");
	}

	#img5_06:hover {
		background-image:url("../assets/images/04MenuPrincipal02.png");
	}

</style>