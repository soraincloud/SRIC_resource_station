<template>
  <el-row>
    <el-col :span="2"></el-col>
    <el-col :span="4">
      <aside-card></aside-card>
    </el-col>
    <el-col :span="16">
      <el-scrollbar style="height: 40%">
        <div>
          <main-card id="main-card-jump"></main-card>
          <carousel-card id="carousel-card-jump"></carousel-card>
          <support-card id="support-card-jump"></support-card>
          <adoption-card id="adoption-card-jump"></adoption-card>
          <copyright-card id="copyright-card-jump"></copyright-card>
        </div>
      </el-scrollbar>
    </el-col>
    <el-col :span="2"></el-col>
  </el-row>
</template>

<script>
import CarouselCard from "@/components/home/CarouselCard";
import MainCard from "@/components/home/MainCard";
import SupportCard from "@/components/home/SupportCard";
import AdoptionCard from "@/components/home/AdoptionCard";
import CopyrightCard from "@/components/home/CopyrightCard"
import AsideCard from "@/components/home/AsideCard";
export default
{
  name: 'AppIndex',
  components: {MainCard,CarouselCard,SupportCard,AdoptionCard,CopyrightCard,AsideCard}
}
</script>

<style>



</style>
