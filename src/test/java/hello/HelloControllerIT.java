package hello;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.net.URL;

import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class HelloControllerIT {

    @Before
    public void setUp() {
        RestAssured.port = 8080;
    }

    @Test
    public void checkHelloControllerStatusIsOk() throws Exception {
        when().
                get("/abcd")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body(equalTo("Greetings from Spring Boot!"));
    }
}
