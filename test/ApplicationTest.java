import org.junit.*;
import play.test.*;
import play.mvc.*;
import play.mvc.Http.*;
import models.*;

public class ApplicationTest extends FunctionalTest {

    @Test
    public void testThatIndexPageWorks() {
        Response response = GET("/");
        assertIsOk(response);
        assertContentType("text/html", response);
        assertCharset(play.Play.defaultWebEncoding, response);
    }

    @Test
    public void testExample() {
        Response response = GET("/example?name=toast");
        assertIsOk(response);
        assertContentEquals("Hello toast.", response);
    }

    @Test
    public void testAdd() {
        Response response = GET("/add?a=1");
        assertIsOk(response);
        assertContentEquals("a + b = 1.", response);
    }
    
}