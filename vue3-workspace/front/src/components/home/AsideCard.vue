<template>
  <el-menu default-active="1" background-color=rgba(255,255,255,0.75) style="margin: 10px 10px 10px auto">
    <a href="#main-card-jump">
      <el-menu-item index="1">
        <el-icon><SwitchButton /></el-icon>
        <span class="home-aside-span-style">SRIC 资源站</span>
      </el-menu-item>
    </a>
    <a href="#carousel-card-jump">
      <el-menu-item index="2">
        <el-icon><MagicStick /></el-icon>
        <span class="home-aside-span-style">电波来源</span>
      </el-menu-item>
    </a>
    <a href="#support-card-jump">
      <el-menu-item index="3">
        <el-icon><Connection /></el-icon>
        <span class="home-aside-span-style">技术支持</span>
      </el-menu-item>
    </a>
    <a href="#adoption-card-jump">
      <el-menu-item index="4">
        <el-icon><FolderChecked /></el-icon>
        <span class="home-aside-span-style">技术采用</span>
      </el-menu-item>
    </a>
    <a href="#copyright-card-jump">
      <el-menu-item index="4">
        <el-icon><Key /></el-icon>
        <span class="home-aside-span-style">版权信息</span>
      </el-menu-item>
    </a>
  </el-menu>
</template>

<script>
import { SwitchButton,MagicStick,Connection,FolderChecked,Key } from '@element-plus/icons-vue';
export default
{
  name: "AsideCard",
  components: { SwitchButton,MagicStick,Connection,FolderChecked,Key }
}
</script>

<style>

a
{
  text-decoration: none;
  color: inherit;
}

.home-aside-span-style
{
  margin-left: 10px;
}

</style>
