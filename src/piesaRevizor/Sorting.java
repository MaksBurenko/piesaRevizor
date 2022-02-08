package piesaRevizor;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sorting {
    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {
        "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
        "Аммос Федорович: Как ревизор?",
        "Артемий Филиппович: Как ревизор?",
        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
        "Аммос Федорович: Вот те на!",
        "Артемий Филиппович: Вот не было заботы, так подай!",
        "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        // создание коллекции MAP
        NavigableMap <String, List<String>> manRoles = new TreeMap();
        // заполняем MAP данными из массива roles, где ключ - имя, значение - коллекция List
        for (String temp : roles) {
            manRoles.put(temp + ":", new ArrayList());
            (manRoles.get(temp + ":")).add (temp + ":" + "\n"); // ввод строки "Имя Отчество:"
        }
        for (int i = 0;i < textLines.length;i++) { //перебираем массив текста произведения
            for (String temp : manRoles.keySet()) {  //перебираем ключи коллекции
                if (textLines[i].startsWith(temp)) { //ищем совпадение с началом имеющейся строки
                    (manRoles.get(temp)).add(textLines[i].replaceFirst((temp), ((i+1) + ")")) + "\n");
                }

            }

        }
        for (int i = 0;i < roles.length;i++) {
            for (String temp : manRoles.keySet()) {
                if ((roles[i] + ":").startsWith(temp)) {
                    StringBuilder str = new StringBuilder();
                    str.append(manRoles.get(temp));
                    System.out.println(str);
                }
            }
        }
    }
}


/*  String str = "Java";
    StringBuilder strBuilder = new StringBuilder(str);
    System.out.println(strBuffer.toString()); // Java*/