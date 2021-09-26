# ECSD Tech Test - Arrays Challenge

Please make a clone of this repository

## Running the application

### To run the Local Version of the App
You will need to have [node] and [yarn] both installed on your machine to run the app.

- Clone this repository and make sure you are in this directory (the one containing `README.md`!)
- Run `yarn && yarn start` to start the app
- Visit `localhost:3000` in a browser

### To run the Docker Version of the App 

You will need to have [docker] installed and running to build the image.
If you are new to docker please read the docker docs in order to understand how to build and run a container.

- `docker build -t ecsd-tech-test .`
- `docker run -it -p 3000:3000 ecsd-tech-test:latest`
- Visit `localhost:3000` in a browser

### To run the SeleniumJavaFramework
- Goto `/src/test/e2e/seleniumJavaFramework`
- Run `java -jar target/SeleniumJavaFramework-0.0.1-SNAPSHOT.jar testng.xml`
