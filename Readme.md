# Spring Boot Music Collection REST Microservice

Build Restful CRUD API for a simple Music Collection application using Spring Boot, Mysql, JPA and Hibernate.

## Prerequisites

1. Java - 1.8.x

2. Maven - 3.x.x

3. Mysql - 5.x.x

## Setup

**1. Clone this repository**

```bash
git clone --recursive https://github.com/mdarwish/musicCollection.git
```

**2. Create Mysql database**
```bash
create database music_repo
```

**3. Run the seed database script "music_repo.sql" under the "data" folder in your MySQL client of choice**

**4. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**6. Build and run the app using maven**
Switch to the folder where you cloned the repository on your local machine and build the application

```bash 
mvn clean install package
```
Then run it -

```bash
java -jar target/musicCollection-0.0.1-SNAPSHOT.jar

 - OR -

mvn spring-boot:run
```

The app will start running at <http://localhost:9700>. You can change the port by changing the "server.port" property in application.properties file.

## Application Layout
![alt text](https://github.com/mdarwish/musicCollection/blob/master/screens/project_structure.png?raw=true)

## Explore Rest APIs

The app defines following CRUD APIs.

### Create Endpoints
    POST /artist/new

    POST /artist/{artist_id}/album/new

    POST /artist/{artist_id}/album/{album_id}/song/new

### Retrieve Endpoints
    GET /artists
    
    GET /albums
    
    GET /songs
    
### Update Endpoints
    PUT /artist/{id}
    
    PUT /album/{id}

    PUT /song/{id}

### Update Endpoints
	DELETE /song/{Id}

	DELETE /album/{id}
	
	DELETE /artist/{Id}
	
### Management Endpoints
	GET /health

	GET /info

	GET /metrics

You can GET requests in the browser. Other verbs can be tested using SoapUI or any other rest client.

# TODO
**1. JUnit tests**

**2. Spring REST Docs**

**3. UI**

# Sample requests

	```bash
	//Retrieve all songs request
	GET http://localhost:9700/songs HTTP/1.1
	
	//Retrieve all artists request
	GET http://localhost:9700/artists HTTP/1.1
	
	//Retrieve all albums request
	GET http://localhost:9700/albums HTTP/1.1
	
	//Retrieve all albums for specific artist
	GET http://localhost:9700/artist/14/albums HTTP/1.1
	
	POST http://localhost:9700/artist/new HTTP/1.1
	content-type: application/json
	
	{
	    "name": "Cars"
	}
	
	//Add new album request
	POST http://localhost:9700/artist/18/album/new HTTP/1.1
	content-type: application/json
	
	{
	    "name": "Panorama",
	    "yearReleased": "1980"
	}
	
	//Update album request
	PUT http://localhost:9700/album/75 HTTP/1.1
	content-type: application/json
	
	{
	    "name": "Panorama - live"
	}
	
	//Add new song request
	POST http://localhost:9700/artist/18/album/75/song/new HTTP/1.1
	content-type: application/json
	
	{
	    "name": "Getting Through"
	}
	
	//Update song request
	PUT http://localhost:9700/song/36 HTTP/1.1
	content-type: application/json
	
	{
	    "name": "Panorama",
	    "created": "1980"
	}
	
	//Delete song request
	DELETE http://localhost:9700/song/37 HTTP/1.1
	
	DELETE http://localhost:9700/album/74 HTTP/1.1
	
	DELETE http://localhost:9700/artist/17 HTTP/1.1


## Screen shots

### Retrieving Artists
![alt text](https://github.com/mdarwish/musicCollection/blob/master/screens/Screenshot%20from%202017-12-28-Artists.png?raw=true)

### Retrieving Albums
![alt text](https://github.com/mdarwish/musicCollection/blob/master/screens/Screenshot%20from%202017-12-28-Albums.png?raw=true)

### Retrieving Songs
![alt text](https://github.com/mdarwish/musicCollection/blob/master/screens/Screenshot%20from%202017-12-28-Songs.png?raw=true)
