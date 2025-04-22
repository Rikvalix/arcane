INSERT INTO character (
    first_name, last_name, nick_name, age, gender, race, faction_id, alignment,
    birthplace, occupation, appearance, personality, backstory,
    status, image_url, created_at
) VALUES
-- 1. Jayce
('Jayce', 'Talis', NULL, 24, 'Homme', 'Humain', 1, 'Loyal Bon',
 'Piltover', 'Inventeur / Conseiller',
 'Grand, cheveux bruns, armure technomagique.',
 'Déterminé, ambitieux, idéaliste.',
 'Issu d’un milieu modeste, il s’est hissé jusqu’au Conseil grâce à son génie en Hextech.',
 'ACTIVE', 'jayce.jpg', CURRENT_TIMESTAMP),

-- 2. Viktor
('Viktor', NULL, NULL, 25, 'Homme', 'Humain amélioré', 2, 'Neutre',
 'Zaun', 'Scientifique',
 'Mince, mécanique, regard intense.',
 'Curieux, rationnel, visionnaire.',
 'Né dans les bas quartiers, il cherche à transcender l’humanité via la technologie.',
 'ACTIVE', 'viktor.jpg', CURRENT_TIMESTAMP),

-- 3. Vi
('Violet', NULL, 'Vi', 22, 'Femme', 'Humaine', 3, 'Chaotique Bon',
 'Zaun', 'Enquêtrice / Ex-Combattante',
 'Musclée, cheveux roses, gantelets renforcés.',
 'Impulsive, protectrice, sarcastique.',
 'A grandi dans la rue avec sa sœur, avant d’être emprisonnée puis recrutée par Piltover.',
 'ACTIVE', 'vi.jpg', CURRENT_TIMESTAMP),

-- 4. Silco
('Silco', NULL, NULL, 45, 'Homme', 'Humain', 4, 'Chaotique Mauvais',
 'Zaun', 'Chef de réseau criminel',
 'Cicatrices sur le visage, œil injecté de Shimmer.',
 'Calculateur, manipulateur, froid.',
 'Ancien révolutionnaire devenu seigneur du crime, il rêve d’indépendance pour Zaun.',
 'ACTIVE', 'silco.jpg', CURRENT_TIMESTAMP),

-- 5. Ekko
('Ekko', NULL, 'Le Garçon du Temps', 17, 'Homme', 'Humaine', 5, 'Loyal Bon',
 'Zaun', 'Leader des Firelights',
 'Jeune, cheveux blancs, lunettes, batte à engrenages.',
 'Brillant, rebelle, altruiste.',
 'Inventeur de génie, il lutte contre le Shimmer et la violence imposée à Zaun.',
 'ACTIVE', 'ekko.jpg', CURRENT_TIMESTAMP),

-- 6. Mel
('Mel', 'Medarda', NULL, 28, 'Femme', 'Humaine', 6, 'Neutre Bon',
 'Noxus', 'Conseillère diplomate',
 'Élégante, parée d’or, regard mystérieux.',
 'Stratégique, douce, ambitieuse.',
 'Fille bannie d’une famille de guerre, elle cherche à influencer Piltover en douceur.',
 'ACTIVE', 'mel.jpg', CURRENT_TIMESTAMP),
      ('Caitlyn', 'Kiramman', NULL, 23, 'Femme', 'Humaine', 1, 'Loyal Neutre',
 'Piltover', 'Enquêtrice',
 'Cheveux bleu foncé, uniforme de l’Enforcée.',
 'Dévouée, méthodique, rusée.',
 'Issue d’une famille noble, elle rejoint les forces de l’ordre par vocation.',
 'ACTIVE', 'caitlyn.jpg', CURRENT_TIMESTAMP),

-- 8. Heimerdinger
('Heimerdinger', NULL, NULL, 307, 'Homme', 'Yordle', 2, 'Loyal Bon',
 'Bandle City', 'Scientifique & Professeur',
 'Petit, poilu, moustachu, oreilles pointues.',
 'Curieux, prudent, bienveillant.',
 'L’un des fondateurs de Piltover, défenseur d’un progrès éthique.',
 'ACTIVE', 'heimerdinger.jpg', CURRENT_TIMESTAMP),

-- 9. Jinx
('Powder', NULL, 'Jinx', 21, 'Femme', 'Humaine', 4, 'Chaotique Neutre',
 'Zaun', 'Anarchiste',
 'Cheveux bleus, maquillage de guerre, lourdement armée.',
 'Instable, explosive, imprévisible.',
 'Ex-sœur de Vi, tombée dans la folie après un traumatisme d’enfance.',
 'ACTIVE', 'jinx.jpg', CURRENT_TIMESTAMP),

-- 10. Sevika
('Sevika', NULL, NULL, 40, 'Femme', 'Humaine', 4, 'Neutre Mauvais',
 'Zaun', 'Lieutenante de Silco',
 'Grande, bras mécanique, air menaçant.',
 'Féroce, pragmatique, loyale à Silco.',
 'Fidèle exécutante du Syndicat, elle applique les ordres sans pitié.',
 'ACTIVE', 'sevika.jpg', CURRENT_TIMESTAMP),

-- 11. Arlo
('Arlo', 'Grenn', 'Le Sablier', 26, 'Homme', 'Humaine', 5, 'Chaotique Bon',
 'Zaun', 'Chrono-artificier',
 'Tenue de bricoleur, montre à gousset magique.',
 'Discret, philosophique, joueur.',
 'Il bidouille des objets temporels pour aider les Firelights à éviter les patrouilles.',
 'ACTIVE', 'arlo.jpg', CURRENT_TIMESTAMP),

-- 12. Lys
('Lys', NULL, 'Lueur', 19, 'Femme', 'Humaine', 5, 'Neutre Bon',
 'Zaun', 'Messagère des Firelights',
 'Rapide, cheveux argentés, masque de luciole.',
 'Déterminée, rapide, loyale.',
 'Elle transporte des infos et fournitures dans la ville grâce à ses drones volants.',
 'ACTIVE', 'lys.jpg', CURRENT_TIMESTAMP),

-- 13. Caelan
('Caelan', 'Medarda', NULL, 32, 'Homme', 'Humaine', 6, 'Neutre',
 'Piltover', 'Marchand d’armes',
 'Chic, soigné, lunettes dorées.',
 'Ambitieux, rusé, joueur de pouvoir.',
 'Cousin de Mel, il profite de la guerre naissante pour asseoir sa fortune.',
 'ACTIVE', 'caelan.jpg', CURRENT_TIMESTAMP),

-- 14. Nira
('Nira', NULL, NULL, 29, 'Femme', 'Humaine', 2, 'Loyal Neutre',
 'Piltover', 'Chercheuse Hextech',
 'Peau sombre, cheveux courts, combinaison bleue.',
 'Méthodique, brillante, réservée.',
 'Ancienne élève d’Heimerdinger, elle se méfie des applications militaires de l’Hextech.',
 'ACTIVE', 'nira.jpg', CURRENT_TIMESTAMP),

-- 15. Thorne
('Thorne', NULL, 'L’Œil', 38, 'Homme', 'Humain', 3, 'Neutre Mauvais',
 'Zaun', 'Espion',
 'Silhouette floue, masque d’observateur, multiples gadgets.',
 'Observateur, manipulateur, discret.',
 'Il vend des informations aux plus offrants, tout en agissant pour son compte.',
 'ACTIVE', 'thorne.jpg', CURRENT_TIMESTAMP),

-- 16. Damaris
('Damaris', NULL, NULL, 35, 'Femme', 'Humaine', 1, 'Loyal Bon',
 'Piltover', 'Architecte en chef',
 'Robes nobles, pince dans les cheveux, carnet à dessin.',
 'Visionnaire, douce, ferme.',
 'Elle conçoit des structures sécurisées pour protéger la ville des émeutes.',
 'ACTIVE', 'damaris.jpg', CURRENT_TIMESTAMP);
