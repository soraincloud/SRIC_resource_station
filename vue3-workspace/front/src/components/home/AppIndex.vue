<template>
  <el-scrollbar style="height: 90%">
    <el-row>
      <el-col :span="2"></el-col>
      <el-col :span="4">

      </el-col>
      <el-col :span="16">
        <main-card></main-card>
        <carousel></carousel>
        <support-card></support-card>
        <adoption-card></adoption-card>
        <copyright-card></copyright-card>
      </el-col>
      <el-col :span="2"></el-col>
    </el-row>
  </el-scrollbar>

</template>

<script>
import Carousel from "@/components/home/Carousel";
import MainCard from "@/components/home/MainCard";
import SupportCard from "@/components/home/SupportCard";
import AdoptionCard from "@/components/home/AdoptionCard";
import CopyrightCard from "@/components/home/CopyrightCard";
export default {
  name: 'AppIndex',
  components: {MainCard,Carousel,SupportCard,AdoptionCard,CopyrightCard}
}
</script>

<style>



</style>
