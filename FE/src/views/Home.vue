<template>
  <div class="home">
    <table style="width: 100%">
      <tr>
      <td>&nbsp;</td>
      <td class="tabla_blanca" style="width: 450px">
        <table style="width: 100%">
              <tr>
              <td>
          <img alt="" height="300" src="../assets/images/Logo01.png" width="300" /></td>
              <td>
          <img alt="" height="400" src="../assets/images/Inicio.jpg" width="448" /></td>
              </tr>
              <tr>
              <td>
          <router-link to="/login">
          <div id="img1_00" class="shadow" src="../assets/images/00Iniciosesion01.png"></div></router-link></td>
              <td rowspan="4">
              <img alt="" height="100" src="../assets/images/00TituloSoft.png" width="379" /></td>
              </tr>
              <tr>
              <td>&nbsp;</td>
              </tr>
              <tr>
              <td>
          <router-link to="/register">
          <div id="img2_00" class="shadow" src="../assets/images/00Registrarse01.png" ></div></router-link></td>
              </tr>
              <tr>
              <td>
              &nbsp;</td>
              </tr>
        </table>
      </td>
      <td>
      &nbsp;</td>
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

  #img1_00 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/00Iniciosesion01.png");
	}

	#img1_00:hover {
		background-image:url("../assets/images/00Iniciosesion02.png");
	}

  #img2_00 {
		margin:0 auto;
		width:207px;
		height:60px;
		transition: background-image 0.5s ease-in-out;
		background-image:url("../assets/images/00Registrarse01.png");
	}

	#img2_00:hover {
		background-image:url("../assets/images/00Registrarse02.png");
	}
  
</style>