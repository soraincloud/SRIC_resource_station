<template>
  <el-card class="aside-main-card">
    <el-menu default-active="1" background-color=rgba(255,200,200,0.2)>
      <a href="#main-card-jump">
        <el-menu-item index="1">
          <span>SRIC 资源站</span>
        </el-menu-item>
      </a>
      <a href="#carousel-card-jump">
        <el-menu-item index="2">
          <span>电波来源</span>
        </el-menu-item>
      </a>
      <a href="#support-card-jump">
        <el-menu-item index="3">
          <span>技术支持</span>
        </el-menu-item>
      </a>
      <a href="#adoption-card-jump">
        <el-menu-item index="4">
          <span>技术采用</span>
        </el-menu-item>
      </a>
      <a href="#copyright-card-jump">
        <el-menu-item index="4">
          <span>版权信息</span>
        </el-menu-item>
      </a>
    </el-menu>
  </el-card>
</template>

<script>
export default {
  name: "AsideCard"
}
</script>

<style>

.aside-main-card
{
  background: rgba(255,255,255,0.75);
  margin: 10px 10px 10px auto;
}

a
{
  text-decoration: none;
  color: inherit;
}

</style>
