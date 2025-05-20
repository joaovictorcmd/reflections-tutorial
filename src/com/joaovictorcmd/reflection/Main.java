package com.joaovictorcmd.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Stella", 6);

        System.out.println("Before reflections:");
        System.out.println(cat.getName());

        Field[] catFields = cat.getClass().getDeclaredFields();

        for (Field field : catFields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(cat, "Wanda");
            }
        }

        System.out.println("After reflections:");
        System.out.println(cat.getName());

        System.out.println();

        Method[] catMethods = cat.getClass().getDeclaredMethods();

        for (Method method : catMethods) {

            // Este comando permite acessar métodos privados ou protegidos via reflexão.
            // Por padrão, o Java impede que você acesse membros "encapsulados" como private/protected.
            // Usando setAccessible(true), você ignora essa restrição e consegue invocar o método mesmo que ele seja privado.
            method.setAccessible(true);

            switch (method.getName()){
                case "meow":
                    System.out.println("PUBLIC METHOD:");
                    method.invoke(cat);
                    break;

                case "heyThisIsPrivate":
                    System.out.println("PRIVATE METHOD:");
                    method.invoke(cat);
                    break;


                case "thisIsAPublicStaticMethod":
                    System.out.println("PUBLIC STATIC METHOD:");
                    method.invoke(null);
                    break;


                case "thisIsAPrivateStaticMethod":
                    System.out.println("PRIVATE STATIC METHOD:");
                    method.invoke(null);
                    break;

            }
        }
    }
}