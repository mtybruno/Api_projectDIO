# Desafio de Projeto DIO - API RESTful


## Tecnologias usadas

- **java 17**
- **Springboot 3**
- **Java JPA**
- **Swagger API**


## Diagrama de Classes

```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```

</br>

- [Repository DIO](https://github.com/digitalinnovationone/santander-dev-week-2023-api)

