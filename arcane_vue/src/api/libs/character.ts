import type {CharacterInterface} from "../../interfaces/characterInterface.ts";
import client from "../api.ts";

/**
 * GET /character
 */
export function getAllCharacters() : Promise<CharacterInterface[]>{
    return client.get('/character').then(response => response.data);
}

/**
 * GET /character/:id
 * @param id
 */
export function getCharacterById(id: number) : Promise<CharacterInterface>{
    return client.get(`/character/${id}`).then(response => response.data);
}