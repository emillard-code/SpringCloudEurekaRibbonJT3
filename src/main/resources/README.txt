-- How to test EurekaRibbonJT applications --

The following endpoints are available for testing:

http://localhost:8761/ (Eureka Server)
http://localhost:9999/amazon-payment/<insertNumberHere>

For an explanation behind the applications:

1) Take the "spring.application.name" value in the application.yml file of the JT1 application.

2) Take the value in the @RequestMapping annotation of JT1's rest controller class.

3) Within the rest controller class of the JT2 application, call the RestTemplate object's .getForObject() method.

4) "template.getForObject("http://<service-name>/<endpoint-mapping>/<endpoint-uri>", String.class)"
    Where <service-name> is the value from Step 1.
    Where <endpoint-mapping> is the value from Step 2.
    Where <endpoint-uri> is the specific endpoint URI you want to call, from the JT2 application.
    This will map the JT2 application's controller methods to the endpoints of the JT1 application.

5) Make sure that the @LoadBalanced annotation is above the RestTemplate object in the JT2 application.
    This will ensure that Eureka will load-balance if multiple instances of JT1 are running.

6) Run multiple instances of the other application in parallel, then test the endpoints.