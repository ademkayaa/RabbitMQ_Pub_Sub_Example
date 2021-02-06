I used spring-boot, RabbitMQ, Lombok and Docker. My aim in this project is to show the working RabbitMQ Publisher-Subscriber method with a project.
Creating a RabbitMQ docker image that is required first. To do this, you must have the docker desktop application installed on your computer. 
If you have a docker desktop installed on your computer, run the following command via command prompt.

command: docker-compose -f  .../.../.../docker-compose.yml up -d

After running the command, a docker image with RabbitMQ running will be created.

You can then access the RabbitMQ interface from http: // localhost: 15672 by using the username and password in the application.properties file in the project.
spring.rabbitmq.username=yourUserName
spring.rabbitmq.password=yourPassword

We will then drop a post request over the Postman Application. For this, we will write the json below in the body part.
{ "name":"traore", "qty":2, "price":940 }
