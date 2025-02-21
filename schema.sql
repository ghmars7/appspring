CREATE DATABASE peluche_db;
USE peluche_db;


CREATE TABLE quote (
    id INT AUTO_INCREMENT PRIMARY KEY,
    quote_text TEXT NOT NULL,
    author VARCHAR(255) NOT NULL
);


CREATE TABLE message (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    message TEXT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


INSERT INTO quote (quote_text, author) VALUES
('Le succès, c’est tomber sept fois, se relever huit.', 'Proverbe japonais'),
('Votre temps est limité, ne le gâchez pas en vivant la vie de quelqu’un d’autre.', 'Steve Jobs'),
('Croyez en vos rêves et ils se réaliseront peut-être. Croyez en vous et ils se réaliseront sûrement.', 'Martin Luther King');


