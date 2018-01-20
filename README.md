# GraphQL_prototype

http://localhost:8081/book/1
http://localhost:8082/author/1

http://localhost:8080/graphiql

{
  getBookById(id: 2) {
    title
    author {
      name
    }
  }
}