import { createApp } from 'vue'
import App from './App.vue'

import router from './router'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import store from './store'

import axios from 'axios'               // 引入axios
import VueAxios from 'vue-axios'
axios.defaults.baseURL = 'http://localhost:8443/api'

const app = createApp(App)

app.config.globalProperties.$axios= axios
app.use(VueAxios, axios)
app.use(router)
app.use(ElementPlus)
app.use(store)

//跳转前会执行
router.beforeEach(
    (to, from, next) =>
    {
        if (to.meta.requireAuth)
        {
            if (store.state.user.username)
            {
                next()
            }
            else
            {
                next({
                    path: 'login',
                    query: {redirect: to.fullPath}
                })
            }
        }
        else
        {
            next()
        }
    }
)


app.mount('#app')
