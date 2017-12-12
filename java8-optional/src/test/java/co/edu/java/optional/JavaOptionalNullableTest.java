package co.edu.java.optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JavaOptionalNullableTest {

    private  JavaOptionalNullable javaOptionalNullable;

    @Before
    public void setUp(){
        javaOptionalNullable= new JavaOptionalNullable();
    }

    @Test
    public void testNullableAPIWithValue(){
        Assert.assertEquals("testValue",javaOptionalNullable.nullableApiWithValue().get());
        Assert.assertTrue(javaOptionalNullable.nullableApiWithValue().isPresent());
    }

    @Test
    public void testNullableAPIWithNoValue(){
        Assert.assertFalse(javaOptionalNullable.nullableApiWithNoValue().isPresent());
    }

}
