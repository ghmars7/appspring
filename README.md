# Projet Spring Boot - Backend & Frontend

## Description
Ce projet se compose de **deux applications Spring Boot** distinctes :
1. **Backend API** : Gère la base de données, expose des endpoints REST pour gérer les citations (quotes) et les messages.
2. **Frontend Application** : Une application Spring Boot utilisant Thymeleaf pour interagir avec l'API Backend et afficher les messages et les citations.

---

## Backend API

### 📌 Technologies utilisées
- **Spring Boot** (Spring Web, Spring Data JPA, MySQL)
- **JPA/Hibernate** pour la gestion des entités
- **Base de données** : MySQL

### 📌 Installation et exécution

####  Cloner le projet :
```sh
git clone https://github.com/ghmars7/apispring.git
cd backend
```
#### Creer la base de données

Dans le fichier ```schema.sql```, copier le script et creer la base.

#### Configurer la base de données
Modifiez `src/main/resources/application.properties` :
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/peluche_db
spring.datasource.username=root
spring.datasource.password=secret
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
```

### 📌 Endpoints REST disponibles
| Méthode | Endpoint            | Description                       |
|---------|---------------------|-----------------------------------|
| GET     | `/getAllMessages`   | Récupérer tous les messages      |
| POST    | `/setMessage`       | Ajouter un nouveau message       |
| GET     | `/getQuote`         | Obtenir une citation aléatoire   |

---

## Frontend Application

### 📌 Technologies utilisées
- **Spring Boot** avec **Thymeleaf**
- **Spring Web** pour consommer l'API Backend


### 📌 Installation et exécution
#### Cloner le projet
```sh
git clone https://github.com/ghmars7/appspring.git
cd frontend
```

