<template>
  <el-tooltip effect="light" placement="right" v-for="item in resources" :key="item.id">
    <template #content>
      <p style="font-size: 15px;"><span>{{item.title}}</span></p>
      <p style="font-size: 12px;"><span>version: {{item.version}}</span></p>
      <p style="font-size: 12px;"><span>{{item.description}}</span></p>
      <el-tooltip placement="top" effect="light" content="查看">
        <el-button type="success" circle><el-icon><Search /></el-icon></el-button>
      </el-tooltip>
      <el-tooltip placement="top" effect="light" content="编辑">
        <el-button type="primary" circle @click="editResources(item)"><el-icon><Edit /></el-icon></el-button>
      </el-tooltip>
      <el-tooltip placement="top" effect="light" content="删除">
        <el-button type="danger" circle @click="deleteResources(item.id)"><el-icon><Delete /></el-icon></el-button>
      </el-tooltip>
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
  <el-affix :offset="64">
    <search-bar @onSearch="searchResult" ref="searchBar"></search-bar>
    <edit-form @onSubmit="loadResources()" ref="edit"></edit-form>
  </el-affix>

</template>

<script>
import { Search,Edit,Delete } from '@element-plus/icons-vue';
import EditForm from "@/components/resources/EditForm";
import SearchBar from "@/components/resources/SearchBar";
import { ElMessage, ElMessageBox } from 'element-plus'
import { markRaw } from 'vue'
export default
{
  name: "Resources",
  data()
  {
    return{
      resources: []
    }
  },
  components: { Search,Edit,Delete,EditForm,SearchBar },
  mounted:function()
  {
    this.loadResources()
  },
  methods:
      {
        searchResult()
        {
          var _this = this
          this.$axios.get('/search?keywords=' + this.$refs.searchBar.keywords, {})
              .then(resp => {
            if (resp && resp.status === 200)
            {
              _this.resources = resp.data
            }
          })
        },
        loadResources()
        {
          var _this = this
          this.$axios.get('/resources').then(resp => {
            if (resp && resp.status === 200)
            {
              _this.resources = resp.data
            }
          })
        },
        deleteResources(id)
        {
          ElMessageBox.confirm('要删除吗？这会让资源消失很久（真的很久）！', '问问',
              {
                confirmButtonText: '确定',
                cancelButtonText: '取消',
                type: 'error',
                icon: markRaw(Delete),
              }
          ).then(() => {
                this.$axios.post('/delete', {id: id}).then(resp => {
                  if (resp && resp.status === 200)
                  {
                    this.loadResources()
                  }
                })
            ElMessage({
              type: 'danger',
              message: '删除成功咧'
            })
              }
          ).catch(() => {
            ElMessage({
              type: 'info',
              message: '取消删除啦'
            })
          })
        },
        editResources(item)
        {
          this.$refs.edit.dialogFormVisible = true
          this.$refs.edit.form =
              {
                id : item.id,
                cover : item.cover,
                title : item.title,
                version : item.version,
                description : item.description,
                category :
                    {
                      id : item.category.id.toString(),
                      name : item.category.name
                    }
              }
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
