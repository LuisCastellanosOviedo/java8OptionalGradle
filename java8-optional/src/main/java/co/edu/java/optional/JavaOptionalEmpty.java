package co.edu.java.optional;

import java.util.Optional;

public class JavaOptionalEmpty {

    public static String testGradle(){
        return "test";
    }

    public   Optional createEmptyOptional(){
        return Optional.empty();
    }

    public Optional<String> createOptionalNotNull(){
        return Optional.of("value");
    }
}
