<template>
  <el-card class="adoption-main-card">
    <h1 class="adoption-main-text-style">技术采用</h1>
    <el-row>
      <el-col :span="2"></el-col>
      <el-col :span="6">
        <div>
          <el-card class="adoption-card-style">
            <el-image :src="VueLogo"></el-image>
          </el-card>
          <h3>vue 3</h3>
        </div>
      </el-col>
      <el-col :span="1"></el-col>
      <el-col :span="6">
        <div>
          <el-card class="adoption-card-style">
            <el-image :src="SpringLogo"></el-image>
          </el-card>
          <h3>spring boot</h3>
        </div>
      </el-col>
      <el-col :span="1"></el-col>
      <el-col :span="6">
        <div>
          <el-card class="adoption-card-style">
            <el-image :src="ElementLogo"></el-image>
          </el-card>
          <h3>element ui</h3>
        </div>
      </el-col>
      <el-col :span="2"></el-col>
    </el-row>
  </el-card>
</template>

<script>
export default {
  name: "AdoptionCard",
  data()
  {
    return{
      VueLogo :require('@/assets/logo/vue-logo.png'),
      SpringLogo :require('@/assets/logo/springboot-logo.png'),
      ElementLogo :require('@/assets/logo/element-logo.png')
    }
  }
}
</script>

<style>

.adoption-main-card
{
  margin: 10px auto;
  background: rgba(255,255,255,0.75);
}

.adoption-main-text-style
{
  color: #505050;
  text-shadow: 0 0 3px #ffffff,0 0 10px #ffcccc;
}

.adoption-card-style
{
  background: #000000;
}

</style>
