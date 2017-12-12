package co.edu.java.optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

public class JavaOptionalBasicTest {

    private JavaOptionalEmpty javaOptionalBasic;

    @Before
    public void setUp(){
        javaOptionalBasic= new JavaOptionalEmpty();
    }


    @Test
    public void testBasicTestMethod(){
        Assert.assertEquals("test", JavaOptionalEmpty.testGradle());
    }

    @Test
    public void createEmptyOptional(){
        Assert.assertEquals(Optional.empty(),javaOptionalBasic.createEmptyOptional());
    }

    @Test
    public void optionalEmptyIsPresent(){
        Assert.assertFalse(javaOptionalBasic.createEmptyOptional().isPresent());
    }

    @Test
    public void optionalNonEmptyValue(){
        Assert.assertTrue(javaOptionalBasic.createOptionalNotNull().isPresent());
    }
}
