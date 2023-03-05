package com.qlsv.common;

import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

/**
 * @author NienNQ
 * @created 2023 - 03 - 05 3:42 PM
 * @project qlsv
 */
@Component
public class FunctionCommon {
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }
}
