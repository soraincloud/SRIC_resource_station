<template>
  <el-card class="support-main-card" shadow="hover">
    <h1 class="support-main-text-style">技术支持</h1>
    <el-row>
      <el-col :span="2"></el-col>
      <el-col :span="9">
        <div>
          <el-card class="support-card-style">
            <el-image :src="MegaLogo"></el-image>
          </el-card>
          <h3>MEGA-PROJECT</h3>
        </div>
      </el-col>
      <el-col :span="2"></el-col>
      <el-col :span="9">
        <div>
          <el-card class="support-card-style">
            <el-image :src="SricLogo"></el-image>
          </el-card >
          <h3>SRIC-Technology</h3>
        </div>
      </el-col>
      <el-col :span="2"></el-col>
    </el-row>
  </el-card>
</template>

<script>
export default
{
  name: "SupportCard",
  data()
  {
    return{
      MegaLogo: require('@/assets/logo/MEGA-logo.png'),
      SricLogo: require('@/assets/logo/SRIC-logo.png')
    }
  }
}
</script>

<style>

.support-main-card
{
  margin: 10px auto;
  background: rgba(255,255,255,0.75);
}

.support-main-text-style
{
  color: #505050;
  text-shadow: 0 0 3px #ffffff,0 0 10px #ffcccc;
}

.support-card-style
{
  background: #000000;
}

</style>
