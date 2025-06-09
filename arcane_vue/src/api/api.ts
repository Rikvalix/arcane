import axios from 'axios';
const API_URL = import.meta.env.VITE_API_URL;

const client = axios.create({
    baseURL : `${API_URL}/api/v1`,
    timeout : 10000,
    headers : {
        'Content-Type' : 'application/json',
    }
})

client.interceptors.response.use(
    config => {
        const token = sessionStorage.getItem('token')
        if (token) {
            config.headers.Authorization = `Bearer ${token}`;
        } else {
            delete client.defaults.headers.common.Authorization;
        }
        return config;
    },
    error => Promise.reject(error)
);
//TODO : Ajouter middleware pour intercepter les erreurs

export default client;
