# java-rest-api-example

Example of a rest API in JAVA

## About the API

An API for employee management. It's built with Java, Spring Boot, JPA and Postgres. This is a training project.

## Features

This API provides HTTP endpoint's and tools for the following:

* Add employee: `POST/employees`
* Delete an employee by ID: `DELETE/employees/1` - Here 1 is the employee ID
* Find a unique employee by ID: `GET/employees/1`
* Find employees by name: `GET/employees/names/Robert` - Here Robert is the name we are looking for
* Find employees by division ID: `GET/employees/divisions/1` - Here 1 is the division ID
* Get a list of all employees: `GET/employees`
* Add division: `POST/divisions`
* Get a list of all divisions: `GET/divisions`
* Find a unique division by ID: `GET/divisions/1`
* Delete a division by ID: `DELETE/divisions/1`

## Details

`POST/employees` - this end-point is called to add a new employee.

**Path variables**

No variables

**Request body**
```json
{
  "name": "string",
  "id_division": 1
}
```
Where:
`name`* - name of the new employee;
`id_division`* - division id of the new employee.

**Response on success**

Empty body with 201 Created

____

`DELETE/employees/{id}` - this end-point is called to delete an employee by id.

**Path variables**

`id` - employee id to be deleted.

**Request body**

Empty body

**Response on success**

Empty body with 200 Ok

____

`GET/employees/{id}` - returns a unique employee by ID.

**Path variables**

`id` - searched employee id.

**Request body**

Empty body

**Response on success**

200 Ok
```json
{
  "id": 1,
  "name": "string",
  "id_division": 1
}
```
Where:
`id` - employee id;
`name` - employee name;
`id_division` - division id that the employee belongs to.

____

`GET/employees/names/{name}` - returns a list of employees with the specified name.

**Path variables**

`name` - searched employee name.

**Request body**

Empty body

**Response on success**

200 Ok
```json
[
  {
    "id": 1,
    "name": "string",
    "id_division": 1
  }
]
```

____

`GET/employees/divisions/{id}` - returns a list of employees from the specified division id.

**Path variables**

`id` - searched division id.

**Request body**

Empty body

**Response on success**

200 Ok
```json
[
  {
    "id": 1,
    "name": "string",
    "id_division": 1
  }
]
```

____

`GET/employees` - returns a list of all employees.

**Path variables**

No variables

**Request body**

Empty body

**Response on success**

200 Ok
```json
[
  {
    "id": 1,
    "name": "string",
    "id_division": 1
  }
]
```

____

`POST/divisions` - this end-point is called to add a new division.

**Path variables**

No variables

**Request body**
```json
{
  "name": "string"
}
```
Where:
`name`* - name of the new division;

**Response on success**

Empty body with 201 Created

____

`GET/divisions` - returns a list of all divisions.

**Path variables**

No variables

**Request body**

Empty body

**Response on success**

200 Ok
```json
[
  {
    "id": 1,
    "name": "string"
  }
]
```

____

`GET/divisions/{id}` - returns a unique division by ID.

**Path variables**

`id` - searched division id.

**Request body**

Empty body

**Response on success**

200 Ok
```json
{
  "id": 1,
  "name": "string"
}
```

____

`DELETE/divisions/{id}` - this end-point is called to delete an division by id.

**Path variables**

`id` - division id to be deleted.

**Request body**

Empty body

**Response on success**

Empty body with 200 Ok


## Database

The application uses a Postgres database on a remote server. The connection settings are already set.


## Compile and package

In order to generate this jar, you should run:

`mvn package`

it will clean, compile, generate and test a jar at target directory.


## Run

In order to run the API, run the jar simply as following:

`java -jar rest-0.0.1-SNAPSHOT.jar`

By default, the API will be available at [http://localhost:8090](http://localhost:8090)