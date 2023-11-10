# Cat API - Java Spring Web API

This repository contains a Java Spring Web API that serves as a back end for cat-related application. It provides endpoints to retrieve information about cats and cat breeds. This README will provide you with essential information about the project and how to get started.

To run and work with this Java Spring Web API, you need to have the following software installed on your system:

    Java Development Kit (JDK) - The API is built using Java, so you need the JDK to compile and run it.
    Spring Boot - We use Spring Boot to create a stand-alone, production-grade Spring-based application.

# Installation
Clone this repository to your local machine:

    git clone https://github.com/PiTrzos/BasicJavaAPI.git
            

# Navigate to the project directory:

    cd BasicJavaAPI
            

# API Endpoints
This API provides the following endpoints to retrieve information about cats and cat breeds:

    GET /cats - Retrieve a list of all cats.
    GET /cats/{id} - Retrieve information about a specific cat by its ID.
    GET /breeds/{id} - Retrieve information about a specific cat breed by its ID.

You can expand on these endpoints or customize them based on your specific requirements.

Running the Application
The API will start, and you can access it at http://localhost:8080.
Accessing API Endpoints

To retrieve information about all cats:

    http://localhost:8080/cats

To retrieve information about a specific cat (replace {id} with the cat's ID):

    http://localhost:8080/cats/{id}
            

To retrieve information about a specific cat breed (replace {id} with the breed's ID):

    http://localhost:8080/breeds/{id}
            
