import client from "../api.ts";
import type {FactionInterface} from "../../interfaces/factionInterface.ts";

export function getAllFaction() : Promise<FactionInterface[]> {
    return client.get('/faction').then(response => response.data);
}