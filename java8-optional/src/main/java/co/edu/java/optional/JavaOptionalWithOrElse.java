package co.edu.java.optional;

import java.util.Optional;

public class JavaOptionalWithOrElse {


    public Optional<String> optionalWithNullValue(){
        String testName=null;
        return Optional.ofNullable(testName);
    }

    public Optional<String> optionalWithValue(){
        return Optional.of("value");
    }
}
