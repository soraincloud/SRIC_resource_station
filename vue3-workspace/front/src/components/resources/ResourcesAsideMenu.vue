<template>
  <el-menu default-active="1" background-color=rgba(255,255,255,0.75) style="margin: 10px 10px 10px auto">
    <el-menu-item index="1">
      <el-icon><Menu /></el-icon>
      <span class="resources-aside-span-style">全部</span>
    </el-menu-item>
  </el-menu>
</template>

<script>
import { Menu } from '@element-plus/icons-vue';
export default
{
  name: "ResourcesAsideMenu",
  components: { Menu }
}
</script>

<style>

.resources-aside-span-style
{
  margin-left: 10px;
}

</style>
