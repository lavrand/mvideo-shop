# Backend Java Microservice Ecommerce

>Backend Services Start Instruction

Start Docker Engine in your machine.

Run `mvn clean install` at root of project to build all the microservices jars.

Run `docker-compose up --build` to start all the containers.

Use the `Postman Api collection` in the Postman directory. To make request to various services.

```

Java SDK 1.8 (Not 17!)

<hr>

>Bug fix list

1. Сreation of cart doesn't work. Fix it in cart controller.
2. Creation of user doesn't work. Fix it in user account service.
3. Fix postresql connection, settings and scripts. DB migration done from MySQL to PostgreSQL should be completed.

>Feature list

1. Develop search feature for goods. Goods should be searched by name.
2. Develop compare feature for goods. Goods should by parameters and price.
3. Develop content management capabilities feature. Develop backend part of admin panel for adding goods.