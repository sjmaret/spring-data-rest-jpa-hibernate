# RESTful API Example with Spring Data REST and JPA/Hibernate Many To Many Extra Columns

Create a new Book
```bash
curl -i -X POST -H "Content-Type:application/json" -d "{\"name\" : \"Book 1\"}" http://localhost:8080/books
```

Create a new Publisher
```bash
curl -i -X POST -H "Content-Type:application/json" -d "{\"name\" : \"Publisher 1\"}" http://localhost:8080/publishers
```

Link Book to Publisher
```bash
curl -i -X POST -H "Content-Type:application/json" -d "{\"book\" : \"http://localhost:8080/books/1\", \"publisher\" : \"http://localhost:8080/publishers/1\", \"publishedDate\": \"2017-01-01\"}" http://localhost:8080/bookPublishers
```
