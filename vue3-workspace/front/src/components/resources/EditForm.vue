<template>
  <div>
    <el-icon @click="dialogFormVisible = true"><CirclePlus /></el-icon>
    <el-dialog
    title="- 添加 / 修改 -"
    v-model="dialogFormVisible"
    @close="clear">
      <el-form v-model="form" style="text-align: left" ref="dataForm">
        <el-form-item label="封面" :label-width="formLabelWidth">
          <el-input v-model="form.cover" placeholder="cover" clearable></el-input>
        </el-form-item>
        <el-form-item label="名称" :label-width="formLabelWidth">
          <el-input v-model="form.title" placeholder="name" clearable></el-input>
        </el-form-item>
        <el-form-item label="版本" :label-width="formLabelWidth">
          <el-input v-model="form.version" placeholder="version" clearable></el-input>
        </el-form-item>
        <el-form-item label="描述" :label-width="formLabelWidth">
          <el-input v-model="form.description" placeholder="description" type="textarea" :rows="2" clearable></el-input>
        </el-form-item>
        <el-form-item label="类别" :label-width="formLabelWidth">
          <el-select v-model="form.category.id" placeholder="选择分类">
            <el-option label="MC-shaders" value="1"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item style="height: 0">
          <el-input type="hidden" v-model="form.id"></el-input>
        </el-form-item>
      </el-form>
      <div class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取 消</el-button>
        <el-button type="primary" @click="onSubmit">确 定</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { CirclePlus } from '@element-plus/icons-vue';
export default
{
  name: "EditForm",
  components: { CirclePlus },
  data()
  {
    return{
      dialogFormVisible: false,
      form:
          {
            id: '',
            cover: '',
            title: '',
            version: '',
            description: '',
            category:
                {
                  id: '',
                  name: ''
                }
          },
      formLabelWidth: '100px'
    }
  },
  methods:
      {
        clear()
        {
          this.form=
              {
                id: '',
                cover: '',
                title: '',
                version: '',
                description: '',
                category:
                    {
                      id: '',
                      name: ''
                    }
              }
        },
        onSubmit()
        {
          if(this.form.cover == '')
          {
            this.form.cover = "NULL.png"
          }
          this.$axios
          .post('/resources', {
            id: this.form.id,
            cover: this.form.cover,
            title: this.form.title,
            version: this.form.version,
            description: this.form.description,
            category: this.form.category
          })
          .then(resp =>
          {
            if (resp && resp.status === 200)
            {
              this.dialogFormVisible = false
              this.$emit('onSubmit')
            }
          })
        }
      }
}
</script>

<style scoped>

</style>
