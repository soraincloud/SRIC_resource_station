import { createRouter, createWebHistory } from "vue-router"

const routes =
[
    {
        path: '/login',
        name: "Login",
        component: () => import('@/components/Login')
    },
    {
        path: '/home',
        name: 'Home',
        component: () => import('@/components/Home'),
        redirect: '/index',
        children:
        [
            {
                path: '/index',
                name: "AppIndex",
                component: () => import('@/components/home/AppIndex'),
                meta:
                    {
                        requireAuth: true
                    }
            },
            {
                path: '/resources',
                name: 'Resources',
                component: () => import('@/components/resources/ResourceIndex'),
                meta:
                    {
                        requireAuth: true
                    }
            }
        ]
    }
]
const router = createRouter(
{
    history: createWebHistory(process.env.BASE_URL),
    routes: routes,
})

export default router
