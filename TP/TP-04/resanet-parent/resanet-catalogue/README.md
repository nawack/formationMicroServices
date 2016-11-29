Requête pour créer des villes :


```
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' -d '{
  "nom": "Paris",
  "pays": {
    "nom": "France"
  }
}' 'http://localhost:8080/villes/'
```
