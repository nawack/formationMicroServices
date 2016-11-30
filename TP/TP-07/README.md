#Quick start

## The Easy way
```
docker-compose down ; mvn verify && docker-compose up
```
Point your browser to [http://localhost:8080](http://localhost:8080)

##Dev Env - Start a database :
```
docker-compose run -d resanet-db
```
Connection jdbc will be available at `127.0.0.1:8082` ie `jdbc:h2:tcp://localhost:8082/resanet`
The interface is avaiable at [http://127.0.0.1:81](127.0.0.1:81)
The persistence folder is at `./h2-data`

## Dev Env - Start the app
```
mvn spring-boot:run
```
ou
```
mvn verify && java -jar target/example-spring-boot-rest-1.0-SNAPSHOT.jar
```
Point your browser to [http://localhost:8000](http://localhost:8000)

## Clean all
```
docker-compose down && mvn clean
```

##### Notes:
Ports is 800{0,1} when the app is started via maven or with the jar and 808{0,1} when is started via docker-compose

#App Documentation

Disponible sur http://<serveur ip>:<serveur port>/swagger-ui.html
