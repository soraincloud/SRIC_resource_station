<template>
  <el-menu
      :default-active="'/index'"
      router
      mode="horizontal"
      background-color="rgba(255,255,255,0.8)"
      text-color="#222"
      active-text-color="#66ccff"
      style="min-width: 1300px">
    <el-image class="sric-logo" :src="sricLogoUrl"></el-image>
    <el-menu-item v-for="(item,i) in navList" :key="i" :index="item.name" class="menu-text">
      {{ item.navItem }}
    </el-menu-item>
    <span class="title-text">SRIC - resource station</span>
  </el-menu>
</template>

<script>
export default
{
  name: 'NavMenu',
  data ()
  {
    return {
      navList:
      [
        {name: '/index', navItem: '首页'},
        {name: '/note', navItem: '笔记'},
        {name: '/resource', navItem: '资源'},
        {name: '/admin', navItem: '个人中心'}
      ],
      sricLogoUrl : require('@/assets/logo/SRIC-pink.png')
    }
  }
}
</script>

<style scoped>

span
{
  pointer-events: none;
}

.title-text
{
  position: absolute;
  padding-top: 18px;
  right: 100px;
  font-size: 20px;
  font-weight: bold;
  color: #66ccff;
}

.sric-logo
{
  height: 40px;
  margin: 9px 10px 1px;
}

.menu-text
{
  font-weight: bold;
  font-size: 16px;
}

</style>
