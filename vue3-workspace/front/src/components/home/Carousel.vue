<template>
<el-card class="carousel-main-card">
    <h1 class="carousel-main-text-style">电波来源</h1>
  <el-carousel :interval="4000" type="card" height="240px">
    <el-carousel-item v-for="item in items" :key="item.id">
      <el-image :src=item.img alt="" class="images" fit="contain"></el-image>
    </el-carousel-item>
  </el-carousel>
</el-card>
</template>

<script>
export default
{
  name: "Carousel",
  data: function ()
  {
        return{
          items:
          [
            {
              id: 1,
              img: require('@/assets/carousel/carousel-1.png')
            },
            {
              id: 2,
              img: require('@/assets/carousel/carousel-2.png')
            },
            {
              id: 3,
              img: require('@/assets/carousel/carousel-3.png')
            },
            {
              id: 4,
              img: require('@/assets/carousel/carousel-4.png')
            },
            {
              id: 5,
              img: require('@/assets/carousel/carousel-5.png')
            },
            {
              id: 6,
              img: require('@/assets/carousel/carousel-6.png')
            },
          ]
        }
      }
}
</script>

<style>

.carousel-main-card
{
  margin: 10px auto;
  background: rgba(255,255,255,0.75);
}

.carousel-main-text-style
{
  color: #505050;
  text-shadow: 0 0 3px #ffffff,0 0 10px #ffcccc;
}

.images
{
  height: 100%;
  width: 100%;
}

</style>
