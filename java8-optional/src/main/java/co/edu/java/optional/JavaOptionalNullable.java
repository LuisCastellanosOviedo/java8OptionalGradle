package co.edu.java.optional;

import java.util.Optional;

public class JavaOptionalNullable {

    public Optional<String> nullableApiWithValue(){
        String testValue="testValue";
        return  Optional.ofNullable(testValue);
    }


    public Optional<String> nullableApiWithNoValue(){
        String nullValue = null;
        return Optional.ofNullable(nullValue);
    }


}
