<template>
  <el-card class="head-main-card">
    <el-card class="home-main-card">
      <el-row>
        <el-col :span="2"></el-col>
        <el-col :span="12">
          <div class="main-card-text-style">
            <h1>欢迎来到 SRIC 资源站</h1>
            <h3>或许可以找到不少有意思的东西，现在就开始吧 ！</h3>
          </div>
        </el-col>
        <el-col :span="8"></el-col>
        <el-col :span="2"></el-col>
      </el-row>
    </el-card>
  </el-card>
</template>

<script>
export default {
  name: "MainCard"
}
</script>

<style>

.head-main-card
{
  margin: 10px auto;
  background: rgba(255,255,255,0.75);
}

.home-main-card
{
  background: url("../../assets/home/main-image.png");
  height: 420px;
  width: 100%;
  background-size: cover;
}

.main-card-text-style
{
  margin: 100px auto;
  text-align: left;
  color: #ffffff;
  text-shadow: 0 0 2px #000000,0 0 10px #ffcccc;
}

</style>
