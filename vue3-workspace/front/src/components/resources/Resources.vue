<template>
  <el-row style="height: 200px">
    <el-tooltip effect="light" placement="right" v-for="item in resources" :key="item.id">
      <template #content>
        <p style="font-size: 15px;"><span>{{item.title}}</span></p>
        <p style="font-size: 12px;"><span>version: {{item.version}}</span></p>
        <p style="font-size: 12px;"><span>{{item.description}}</span></p>
      </template>
      <el-card class="resources-card" body-style="padding:10px" shadow="hover">
        <div class="resources-cover">
          <el-image :src="require('@/assets/resources/shaders/' + item.cover)" alt="cover" class="resources-image-style"></el-image>
        </div>
        <div class="title">
          <a href="">{{item.title}}</a>
        </div>
      </el-card>
    </el-tooltip>
  </el-row>
  <el-row>
    <el-pagination
        :current-page="1"
        :page-size="10"
        :total="20">
    </el-pagination>
  </el-row>
</template>

<script>
export default
{
  name: "Resources",
  data()
  {
    return{
      resources:
          [
            {
              cover: 'photon-main-3.19.png',
              title: 'photon-main',
              version: '3.19',
              description: '模糊较少，色彩鲜明，体积云效果较强'
            }
          ]
    }
  }
}
</script>

<style>

.resources-card
{
  width: 212px;
  height: 148px;
  margin-top: 10px;
  margin-right: 15px;
  float: left;
  background: rgba(255,255,255,0.75);
}

.resources-image-style
{
  width: 192px;
  height: 108px;
}

a
{
  text-decoration: none;
}

a:link, a:visited, a:focus
{
  color: #505050;
}

</style>
