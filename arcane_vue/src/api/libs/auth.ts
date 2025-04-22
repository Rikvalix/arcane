import client from "../api.ts";
import type {RegisterType} from "../../types/RegisterType.ts";

/**
 * POST /auth/login
 * @param username
 * @param password
 */
export function postLogin(username: string, password: string) {
    return client.post('/auth/login', {username, password}).then(response => {
        sessionStorage.setItem('token', response.data.token)
    });
}

/**
 * POST /auth/signup
 * @param data
 */
export function postRegister(data: RegisterType){
    return client.post('/auth/signup', data).then(response => response.data);
}