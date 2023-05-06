<template>
  <el-input
      @keyup.enter="searchClick"
      placeholder="搜，搜啊，tnnd，为什么不搜？"
      style="width: 320px;margin-right: 20px"
      v-model="keywords"
  >
    <template #append>
      <el-button @click="searchClick"><el-icon><Search/></el-icon></el-button>
    </template>

  </el-input>

</template>

<script>
import { Search } from '@element-plus/icons-vue';
export default
{
  name: "SearchBar",
  components: { Search },
  data()
  {
    return{
      keywords: '',
      resources: [],
    }
  },
  methods:
      {
        searchClick()
        {
          this.$emit('onSearch')
        }
      }
}
</script>

<style scoped>

</style>
