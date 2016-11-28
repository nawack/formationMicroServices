Quick start
-----------
Soit mvn spring-boot:run

ou 

1. `mvn package`
2. `java -jar target/example-spring-boot-rest-1.0-SNAPSHOT.jar`
3. Point your browser to [http://localhost:8080](http://localhost:8080)
4. `curl -X POST -d '{ "id": "test_id", "password": "test_password" }' http://localhost:8080/user`
5. Refresh the page


Documentation
-------------

Disponible sur http://<serveur ip>:<serveur port>/swagger-ui.html

default http://localhost:8000/swagger-ui.html