package com.example.dockerhelloworld;

import org.junit.Test;
import java.util.function.Predicate;
import java.util.regex.Pattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegexValidatorTest {


    @Test
    public void shouldBeValid() throws Exception {
        final String inputValue = "012345678";
        Predicate<String> condition = (input) -> Pattern.matches("^[0-9]{1,9}$",input);
        assertTrue(condition.test(inputValue));
    }

    @Test
    public void shouldBeInValid() throws Exception {
        final String inputValue = "123456789@£$%^&*(";
        Predicate<String> condition = (input) -> Pattern.matches("^[0-9]{1,9}$",input);
        assertFalse(condition.test(inputValue));
    }
}