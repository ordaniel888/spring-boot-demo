package hello;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class HelloControllerTest {
    @Test
    public void getHello() throws Exception {
        String a = get("/abcd").asString();
        //.equals(equalTo("Greetings from Spring Boot!"));
    }
}
