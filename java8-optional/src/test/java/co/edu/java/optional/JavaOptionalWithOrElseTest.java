package co.edu.java.optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JavaOptionalWithOrElseTest {

    private JavaOptionalWithOrElse javaOptionalWithOrElse;

    @Before
    public void setUp(){
        javaOptionalWithOrElse = new JavaOptionalWithOrElse();
    }

    @Test
    public void testOrElseWhenIsNull(){
        Assert.assertEquals("ElseValue",javaOptionalWithOrElse.optionalWithNullValue().orElse("ElseValue"));
    }

    @Test
    public void testOrElseWhenValueIsPresent(){
        Assert.assertEquals("value",javaOptionalWithOrElse.optionalWithValue().orElse("ElseValue"));
    }
}
