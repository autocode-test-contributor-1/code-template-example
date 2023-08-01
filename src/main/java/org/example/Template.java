package org.example;

public class Template {
    public String reverseString(String str) {
        StringBuilder builder = new StringBuilder(str);
        return new StringBuilder(str).reverse().toString();
    }

}
