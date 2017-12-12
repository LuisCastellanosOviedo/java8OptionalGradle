package co.edu.java.optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JavaOptionalIfPresentTest {

    private JavaOptionalIfPresent javaOptionalIfPresent;

    @Before
    public void setUp(){
        javaOptionalIfPresent = new JavaOptionalIfPresent();
    }

    @Test
    public void ifPresentIf(){
       javaOptionalIfPresent.optionalIfPresent().ifPresent(name -> System.out.print( name.length()));
    }
}
