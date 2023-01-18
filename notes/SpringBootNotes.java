public class SpringBootNotes {
    /**
     * Spring Boot notes.
     * 
     * what is spring boot
     * Java based spring framework, used for rapid application development.
     * to build standaloen microservices.
     * extra support for autoconfiguration
     * and embedded application server like tomcat, jetty etc.
     * 
     * High level it follows the MVC pattern
     * 
     * Spring Boot key components
     * Spring Boot auto configuration
     * Spring Boot CLI
     * Spring Boot starter POM - Project objec Model
     * Spring Boot Actuators
     * Spring Boot starters - Maven template that contains all the relative
     * trasitive depedencies
     * that is used to start a functionality
     * 
     * spring boot intializr
     * Spring Boot CLI
     * Spring annotation are forms of metadata that provides data about program
     * 
     * @RestController - Combination of Controller and response body.
     *                 RestController is used for making restful web services, like
     *                 get, post, put, delete
     *                 specialized version of @Controller
     *                 By default supports the @ResponseBody annotation
     *                 We can not return a view(it returns Json or xml as response
     *                 body)
     * 
     * @Controller - It is used to mark a class as a web request handler
     *             Specialized version of @Component
     *             we need to use @ResponseBody on every handler method
     *             we can return a view.(Maps the model object to view or template)
     * 
     *             Flow of HTTP Requests in Spring Boot application
     *             Client ---> make http requests ---> Controller ---> Service
     *             layer(Where business logic happens)
     *             ---> Repository class (with dependency injection) ---> Model --->
     *             Database
     * 
     *             Difference between requestmapping and getmapping
     *             RequestMapping - It can be used with many others request methods
     *             GetMapping - extension of getmaaping and only specific with get
     *             requests
     * 
     *             Use of profiles in spring boot - for diff env - local, dev, QA,
     *             Uat, Prod
     * 
     *             Spring Actuator - Monitor and manage your applications
     * 
     *             Dependency Injection - process of injecting dependent bean
     *             objects into target bean
     *             objects is called dependency injection
     *             setter injection, constructor injection, Field injection
     * 
     *             IOC(Inversion of Control) Container - It is a framework for
     *             implementing automatic dependency injection
     *             manages object creation and its life-time and also dependencies
     *             into the class
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * @param args
     */
    public static void main(String[] args) {

    }
}
