<template>
  <div class="home">
    <table style="width: 100%">
    <tr>
      <td class="auto-style1">
      &nbsp;</td>
      <td class="auto-style1" style="width: 450px">
      <table style="width: 100%" class="auto-style3">
        <tr>
          <td>
      <img alt="" height="300" src="../assets/images/Logo01.png" width="300" /></td>
          <td>
      <img alt="" height="400" src="../assets/images/Inicio.jpg" width="448" /></td>
        </tr>
        <tr>
          <td>
      <router-link to="/login">
      <img id="img1" alt="" height="50" onclick="FP_swapImg(1,1,/*id*/'img1',/*url*/'../assets/images/00Iniciosesion03.png')" onmouseout="FP_swapImgRestore()" onmouseover="FP_swapImg(1,1,/*id*/'img1',/*url*/'../assets/images/00Iniciosesion02.png');" src="../assets/images/00Iniciosesion01.png" width="172" class="auto-style2" /></router-link></td>
          <td rowspan="4">
          <img alt="" height="100" src="../assets/images/00TituloSoft.png" width="379" /></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td>
      <router-link to="/register">
      <img id="img2" alt="" height="50" onclick="FP_swapImg(1,1,/*id*/'img2',/*url*/'../assets/images/00Registrarse03.png')" onmouseout="FP_swapImgRestore()" onmouseover="FP_swapImg(1,1,/*id*/'img2',/*url*/'../assets/images/00Registrarse02.png');" src="../assets/images/00Registrarse01.png" width="172" class="auto-style2" /></router-link></td>
        </tr>
        <tr>
          <td>
          &nbsp;</td>
        </tr>
      </table>
      </td>
      <td class="auto-style1">
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
	border-width: 0px;
}
.auto-style3 {
	border: 3px solid #808080;
	background-color: #FFFFFF;
}
</style>