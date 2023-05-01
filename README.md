
# ***UNIVERSITY EVENT MANAGEMENT***

- The aim of the project is to perform the basic CRUD operations with some validations.
- Spring initializer was used to create a spring boot application project.


## **Frameworks and Languages used :**

- Java
- Spring Boot

![image](https://user-images.githubusercontent.com/112794922/235488269-353d6d3d-f19f-496f-b019-68d1aafa4bb9.png)



## **Dependency used :**

- Spring web
- Spring Boot Dev Tool
- Lombok
- Validations
- H2 database

![image](https://user-images.githubusercontent.com/112794922/235488804-512a46c9-6867-416f-ad30-412fb65fbc4f.png)


## **Data Flow :**

## **Model :** 

- It consists of a  ___Studentclass___ and ___EventClass___ which consists of Entity's used to model our data application.
- By using Lombok dependency , ___@Data___ , ___@AllArgsConstructor___ , ___@NoArgsConstructor___ is used to create getters and setters as well as default and parameterized constructors.

![image](https://user-images.githubusercontent.com/112794922/235488840-8d9e9ede-673a-4c0c-9f94-0d913767887e.png)
![image](https://user-images.githubusercontent.com/112794922/235488848-85d63ed2-6db4-4a31-81d1-4c885c447033.png)


## **Controller :**

- It consists of ___StudentController___ and ___EventController___ class which basically control the flow of data.
- ___@RestController___ annotation is used to make the RestaurantController class as controller layer.
- ___@GetMapping , @PostMapping , @PutMapping , @DeleteMapping___ annotations are used to perform the CRUD operations.
- ___@Valid___ is used in post mapping in order to do some validations while inserting the data.

![image](https://user-images.githubusercontent.com/112794922/235489197-8a64c796-b17d-4454-9829-cdd2db76faf6.png)
![image](https://user-images.githubusercontent.com/112794922/235489205-c654c3a9-61b3-451b-b955-5a986e1de8c0.png)





- ### **API Reference :**

### **Student Controller :**

#### ***Get Student By Id***

```http
  http://localhost:8080/getStudentById/{studentId}
```

#### ***Add Students***

```http
  http://localhost:8080/addStudent
```

#### ***Get All students***

```http
  http://localhost:8080/getAllStudents
```

#### ***Delete Student by Id***

```http
  http://localhost:8080/deleteStudent/{studentId}
```

#### ***Update Student by department***

```http
  http://localhost:8080/updateStudent/{studentId}/{department}
```

### **Event Controller :**

#### ***Add evnts***

```http
  http://localhost:8080/addEvent
```

#### ***Get Event by Date***

```http
  http://localhost:8080/getEventByDate/{date}
```

#### ***Delete Event***

```http
  http://localhost:8080/deleteByEventName/{eventName}
```

## **Service :** 

- It consists of ___StudentService___ and ___EventService___ class which helps us to write the business functionalities.
- ___@Service___ annotation is used to make the class as a service layer.

![image](https://user-images.githubusercontent.com/112794922/235489415-1f5b39f4-864e-4868-a98e-4c02532c03ea.png)
![image](https://user-images.githubusercontent.com/112794922/235489416-021509b7-eef4-41e8-ae38-1542810f4958.png)


## **Repository :**

- It consists of ___StudentDao___ and ___EventDao___ which is used to manage or datas.
- ___@Repository___ annotation is used to make the class repository layer.

## **Validations :** 
- ___@Min___ and __@Max___ is used for validating the age which should be between ___18 - 25___.
- ___@Pattern(regexp = "[A-Z]\\\\w*")___ is used for validating name which the first letter of the name must be ___capital___.


## **Documentation :**

***[SWAGGER](http://localhost:8080/swagger-ui/index.html#/)***


## **Summary :**

- In this project , I had created the RestApi's performing various ___CRUD operations___ such as fetch , save , delete and update users with ___validations___.
- The RestApi's are tested by using ___Postman___ which is a client used to test our Api's.
- The data's were stored in the ___H2 database___ which is ___in-memory database___.

