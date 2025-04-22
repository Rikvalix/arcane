import type {CharacterInterface} from "./characterInterface.ts";

export interface FactionInterface {
    id: number;
    name: string;
    description: string;
    symbol: string;
    image: string;
    characters: Pick<CharacterInterface, 'id' | 'firstName' | 'lastName' | 'nickName' | 'imageUrl'>[];
}