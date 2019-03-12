package com.shaysapplications.testingtutorialsproject.util;

public class FirstNameExtractor {

    public static String extractFirstName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            return "";
        }
        String[] splitedName = fullName.split(" ");
        String result = "";
        for (String s :
                splitedName) {
            System.out.println("string is:"+ s+"|");
            if(!s.isEmpty())
                return s;
        }
        return null;
    }

}
