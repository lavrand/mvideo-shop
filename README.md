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

1. Сreation of cart doesn't work. Fix it in cart controller.
2. Creation of user doesn't work. Fix it in user account service.
3. Fix postresql connection, settings and scripts. DB migration done from MySQL to PostgreSQL should be completed.

>Feature list

1. Develop search feature for goods. Goods should be searched by name.
2. Develop compare feature for goods. Goods should by parameters and price.
3. Develop content management capabilities feature. Develop backend part of admin panel for adding goods.