import { createRouter, createWebHashHistory } from 'vue-router'
import Home from '../views/Home.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/register',
    name: 'Registro',
    component: () => import('../views/Register.vue')
  },
  {
    path: '/login',
    name: 'Login',
    component: () => import('../views/Login.vue')
  },
  {
    path: '/main',
    name: 'Menu Principal',
    component: () => import('../views/Main.vue')
  },
  {
    path: '/consulta',
    name: 'Consulta',
    component: () => import('../views/Consulta.vue')
  },
  {
    path: '/crear',
    name: 'CrearEditar',
    component: () => import('../views/Create.vue')
  },
  {
    path: '/crearhw',
    name: 'CrearEditarHw',
    component: () => import('../views/Createhw.vue')
  },
  {
    path: '/crearsf',
    name: 'CrearEditarsf',
    component: () => import('../views/Createsf.vue')
  },
  {
    path: '/creausr',
    name: 'CrearEditarus',
    component: () => import('../views/Creausr.vue')
  },
  {
    path: '/creacontb',
    name: 'CrearEditarcontb',
    component: () => import('../views/Creacontb.vue')
  },
  {
    path: '/eliminar',
    name: 'Eliminar',
    component: () => import('../views/Eliminar.vue')
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
