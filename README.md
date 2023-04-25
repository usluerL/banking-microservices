## Demo Banking App



     This is a demo banking application consisting of 5 microservices that have been Dockerized. 
     This project is focused on containerization and includes Docker-compose files for the development, production, and default environments.   
     



## Microservices
     The following microservices are included in this project:
		account-service: Provides account-related functionality.
		card-service: Provides card-related functionality.
		config-server: Acts as a central configuration server for the microservices.
		eureka-server: Acts as a service registry and discovery server. It allows microservices to register themselves and discover other services in the network, making it easier to manage and scale the application. The Docker-compose file has been updated to ensure that all microservices are up and running and registered with the Eureka-Server.
		loan-service: Provides loan-related functionality. 


## Authors

- [@byusluer](hhttps://github.com/usluerL/)


## Table of Contents
    • Installation
    • Usage
    • Contributing
    • License

## Installation    
     1.	Clone the repository to your local machine.
	 2. Navigate to the root directory of the project.
     3. Run docker-compose up -f docker-compose-dev.yml to start the development environment.
     4. Run docker-compose up -f docker-compose-prod.yml to start the production environment.
     5. Run docker-compose up -f docker-compose-default.yml to start the default environment.
    

## Usage
 
    After the microservices have been started, you can access the various functionalities provided by the microservices through their respective endpoints. Refer to the documentation for each microservice for more information.

## Contributing

    1. Fork the repository.
    2. Create a new branch for your feature.
    3. Make your changes and commit them to your branch.
    4. Push your branch to your forked repository.
    5. Submit a pull request.
## License

	This project is licensed under the MIT License - see the LICENSE file for details.
