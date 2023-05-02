<template>

  <body id="login-background">
  <el-row>
    <el-col :span="4">
      <el-image class="sric-title" :src="sricUrl"></el-image>
    </el-col>
    <el-col :span="20"></el-col>
  </el-row>
  <el-row>
    <el-col :span="11">
      <div class="titles">
        <h1 class="h1Title">SRIC 资源站</h1>
        <h3 class="h3Title">或许会提供很多奇奇怪怪的功能？</h3>
      </div>
    </el-col>
    <el-col :span="1"></el-col>
    <el-col :span="12">
      <el-form class="login-container" label-position="left" label-width="0px">
        <h3 class="login_title">登录</h3>
        <el-form-item>
          <el-input type="text" v-model="loginForm.username" auto-complete="off" placeholder="账号"></el-input>
        </el-form-item>
        <el-form-item>
          <el-input type="password" v-model="loginForm.password" auto-complete="off" placeholder="密码"></el-input>
        </el-form-item>
        <el-form-item style="width: 100%">
          <el-button type="primary" style="width: 100%;background: #ffc8c8;border: none;color: black;font-weight: bold;" v-on:click="login">登录</el-button>
        </el-form-item>
      </el-form>
    </el-col>
  </el-row>
  </body>

</template>

<script>

export default
{
  name: 'Login',
  data ()
  {
    return{
      loginForm:
      {
        username: '',
        password: ''
      },
      responseResult: [],
      sricUrl : require('@/assets/logo/SRIC.png')
    }
  },
  methods:
  {
    login ()
    {
      var _this = this
      console.log(this.$store.state)
      this.$axios
          .post('/login', {
            username: this.loginForm.username,
            password: this.loginForm.password
          })
          .then(successResponse =>
          {
            if (successResponse.data.code === 200)
            {
              _this.$store.commit('login', _this.loginForm)
              var path = this.$route.query.redirect
              this.$router.replace({path: path === '/' || path === undefined ? '/index' : path})
              this.$message({
                message: '登录成功，欢迎回来喵 ~',
                type: 'success'
              })
            }
            else
            {
              this.$message.error({message: '戳啦，再试试 ？',})
            }
          })
          .catch(failResponse => {})
    }
  }
}
</script>

<style>

body
{
  margin: 0;
}

#login-background
{
  background: url("../assets/background/login-background.png") no-repeat center;
  height: 100%;
  width: 100%;
  background-size: cover;
  position: fixed;
}



.login-container
{
  border-radius: 10px;
  background-clip: padding-box;
  margin-top: 100px;
  margin-left: 80px;
  width: 300px;
  padding: 30px 30px 10px 30px;
  background: rgba(255,255,255,0.5);
  border: 1px solid #ffffff;
  box-shadow: 0 0 25px #ffcccc;
}

.login_title
{
  margin: 0px auto 30px auto;
  text-align: center;
  color: #ffffff;
}

.sric-title
{
  margin-top: 20px;
  margin-bottom: 50px;
  width: 150px;
}

.titles
{
  float: right;
}

.h1Title
{
  margin-top: 180px;
  color: white;
  text-align: left;
}

.h3Title
{
  color: white;
  text-align: left;
}
</style>
