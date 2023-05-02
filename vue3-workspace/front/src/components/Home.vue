<template>
  <body id="home-background">
    <nav-menu></nav-menu>
    <router-view/>
  </body>
</template>

<script>
import NavMenu from './common/NavMenu'
export default
{
  name: 'Home',
  components: {NavMenu}
}
</script>

<style>

body
{
  margin: 0;
}

#home-background
{
  background: url("../assets/background/login-background-white-64.png") no-repeat center;
  height: 100%;
  width: 100%;
  background-size: cover;
  position: fixed;
}

</style>
