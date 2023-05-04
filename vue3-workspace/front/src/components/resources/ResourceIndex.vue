<template>
  <el-row>
    <el-col :span="2"></el-col>
    <el-col :span="4">
      <resources-aside-menu></resources-aside-menu>
    </el-col>
    <el-col :span="16">
      <resources></resources>
    </el-col>
    <el-col :span="2"></el-col>
  </el-row>
</template>

<script>
import ResourcesAsideMenu from "@/components/resources/ResourcesAsideMenu";
import Resources from "@/components/resources/Resources";
export default
{
  name: "ResourceIndex",
  components: { ResourcesAsideMenu,Resources }
}
</script>

<style>

</style>
