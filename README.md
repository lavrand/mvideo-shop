# Backend Java Microservice Ecommerce

>Backend Services Start Instruction


Open project in IntelliJ IDEA, open menu File-> Project structure -> Project settings -> Project -> SDK  and choose Java SDK 1.8

![img_3.png](img_3.png)

In IntelliJ IDEA, open maven tab on the right side and press Lifecycle -> package.

![img.png](img.png)

Wait while the build finish.

![img_1.png](img_1.png)

Install docker desktop application on computer.

Open docker-compose file in IntelliJ IDEA and press two green arrows in the beginning of the file.

![img_2.png](img_2.png)

Wait while docker containers are up 

Use the `Postman Api collection` in the Postman directory. To make request to various services.

>Tasks list:

```

>Bug fix list

1. Проблема CORS.
    Текущая версия системы не поддерживает метод PATCH, добавьте его, чтобы CORS работал и для него. 
    Подсказка: Access-Control-Allow-Methods
    bookstore-commons/src/main/java/com/devd/spring/bookstorecommons/security/SimpleCorsFilter.java
    30 строка - прописать туда методы кроме PATCH
2. Сreation of cart doesn't work. Fix it in cart controller.
3. Creation of user doesn't work. Fix it in user account service.
4. Fix postresql connection, settings and scripts. DB migration done from MySQL to PostgreSQL should be completed.

>Feature list

1. Develop search feature for goods. Goods should be searched by name.
2. Develop compare feature for goods. Goods should by parameters and price.
3. Develop content management capabilities feature. Develop backend part of admin panel for adding goods.