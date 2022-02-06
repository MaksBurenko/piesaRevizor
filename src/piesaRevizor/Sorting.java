package piesaRevizor;

import java.util.*;

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

        NavigableMap <String, List<String>> manRoles = new TreeMap();

        for (String temp : roles) {
            manRoles.put(temp, new ArrayList());
        }

        for (int i = 1;i < textLines.length;i++) {
            for (String temp : manRoles.keySet()) {
                if (textLines[i].startsWith(manRoles.get(temp))) {

                }
            }
        }
    }
}
