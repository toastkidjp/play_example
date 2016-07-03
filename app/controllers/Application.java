package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void example(String name) {
        renderText(String.format("Hello %s.", name));
    }
    
    public static void add(int a, int b) {
        renderText(String.format("a + b = %d.", a + b));
    }

}