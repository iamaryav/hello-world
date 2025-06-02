
---
What problem does it solve?
It manages the lifecycle of containrized applications: 
It automates the deployment, scaling, management and networking of containers across multiple
environments.
what is container?
It contains application and all the required components to run the application in a single bundle called container like code, runtime, system tools, libraries config files

how to create container?
You can use Docker(Container Engine) to create the running instance of container image, you can install docker on your OS and build the image

how to build the image?
define a dockerfile mentioning all the components required for application and run the docker build command to create docker image


Now where does the kubernetes comes into the picture here?
kubernetes runs and manages your docker images 

How does it get deployed and how does it happens?
Kubernetes deployment yaml
After, creating a docker image we push the image to the docker repository,
then we define a yaml file in kubernetes env mentioning all the details and 
everything resource, max resource, cpu limits and etc. In yml file we decide 
how our application will run


what is instances?
Running form of an applications
how many 

what is container?
it is your application with all required components
it includes everything to run the application

what is pod?
A smallest deployable unit that kubernetes can create and manage.
It can contain one or more container in a pod resources are shared b/w
containers
Analogy: Let's assume container is the box then the pod is delivery vehicle

what is replicas?
Multiple containers running single applications
let say a pod is runnig a container the copy of that pod is replica






```
# Stage 1: Build the application (using a multi-stage build for smaller final image)
FROM openjdk:17-jdk-slim AS build
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY src ./src
RUN ./mvnw package -DskipTests

# Stage 2: Create the final lightweight image
FROM openjdk:17-jre-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080 # Expose the port your Spring Boot app listens on (e.g., 8080)
ENTRYPOINT ["java", "-jar", "app.jar"]

```

```
docker build -t your-dockerhub-username/your-java-app:1.0 .
```


```deployment.yaml

apiVersion: apps/v1
kind: Deployment
metadata:
  name: java-app-deployment
  labels:
    app: java-app
spec:
  replicas: 2 # Number of desired instances of your application
  selector:
    matchLabels:
      app: java-app
  template:
    metadata:
      labels:
        app: java-app
    spec:
      containers:
        - name: java-app-container
          image: your-dockerhub-username/your-java-app:1.0 # Your Docker image
          ports:
            - containerPort: 8080 # The port your application listens on
          env: # Optional: Environment variables for your application
            - name: SPRING_PROFILES_ACTIVE
              value: production
          # resources: # Optional: Resource limits and requests
          #   limits:
          #     memory: "512Mi"
          #     cpu: "500m"
          #   requests:
          #     memory: "256Mi"
          #     cpu: "200m"

```

Kubernetes service yaml:
It defines how to access your application e.g. - expoose it via port, load balance, traffic

```service.yaml

apiVersion: v1
kind: Service
metadata:
  name: java-app-service
spec:
  selector:
    app: java-app # Selects pods with this label
  ports:
    - protocol: TCP
      port: 80 # The port the service will listen on
      targetPort: 8080 # The port on the pod to forward traffic to
  type: LoadBalancer # Or NodePort/ClusterIP depending on your needs

```

then deploy to kubernetes

Apply deployments
kubectl apply -f deployment.yaml

Apply services:
kubectl apply -f service.yaml

Check pods:
kubectl get pods -l app=java-app

check deployments status:
kubectl get deployments
kubectl get services
kubectl describe service java-app-service

Acess application:
minikube service java-app-service --url
-- this will return the URL

Load balancer
External-IP, Ingress




---