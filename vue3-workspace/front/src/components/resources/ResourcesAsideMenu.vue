<template>
  <el-menu default-active="0" background-color=rgba(255,255,255,0.75) style="margin: 10px 10px 10px auto" @select="handleSelect">
    <el-menu-item index="0">
      <el-icon><Menu /></el-icon>
      <span class="resources-aside-span-style">全部</span>
    </el-menu-item>
    <el-menu-item index="1">
      <el-icon><Menu /></el-icon>
      <span class="resources-aside-span-style">MC shaders</span>
    </el-menu-item>
  </el-menu>
</template>

<script>
import { Menu } from '@element-plus/icons-vue';
export default
{
  name: "ResourcesAsideMenu",
  components: { Menu },
  data()
  {
    return{
      cid:''
    }
  },
  methods:
      {
        handleSelect(key,keyPath)
        {
          this.cid = key
          this.$emit('indexSelect')
        }
      }
}
</script>

<style>

.resources-aside-span-style
{
  margin-left: 10px;
}

</style>
