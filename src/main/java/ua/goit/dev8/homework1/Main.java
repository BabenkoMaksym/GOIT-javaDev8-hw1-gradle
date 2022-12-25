package ua.goit.dev8.homework1;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Maksym", "Babenko");
        Gson gson = new Gson();
        String personInString = gson.toJson(person);
        System.out.println(personInString);

    }
}
