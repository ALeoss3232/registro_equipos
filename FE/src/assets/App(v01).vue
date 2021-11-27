<template>
  <div id="nav">
    <router-link to="/">Inicio</router-link> |
    <router-link to="/crear">Crear/Editar</router-link> |
    <router-link to="/crearhw">C/E Hardware</router-link> |
    <router-link to="/crearsf">C/E Software</router-link> |
    <router-link to="/creausr">C/E Usuarios</router-link> |
    <router-link to="/creacontb">C/E Contabilidad</router-link>    
  </div>
  <router-view/>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}

body {
  background-image: url("assets/images/WordArt.png");
}
</style>
