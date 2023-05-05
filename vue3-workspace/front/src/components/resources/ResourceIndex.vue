<template>
  <el-row>
    <el-col :span="2"></el-col>
    <el-col :span="4">
      <switch></switch>
      <resources-aside-menu @indexSelect="listByCategory" ref="asideMenu"></resources-aside-menu>
    </el-col>
    <el-col :span="16">
      <el-scrollbar height="640px">
        <resources ref="resourcesArea"></resources>
      </el-scrollbar>

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
  components: { ResourcesAsideMenu,Resources },
  methods:
      {
        listByCategory()
        {
          var _this = this
          var cid = this.$refs.asideMenu.cid
          var url = 'categories/' + cid + '/resources'
          this.$axios.get(url).then(resp => {
            if (resp && resp.status === 200)
            {
              _this.$refs.resourcesArea.resources = resp.data
            }
              }
          )
        }
      }
}
</script>

<style>

</style>
