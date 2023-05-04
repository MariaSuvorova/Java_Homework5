/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
что 1 человек может иметь несколько телефонов. */
package Homework5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        
    Map<String, String[]> phoneBook = new HashMap<>();
    
    Scanner scanner = new Scanner(System.in, "866");
    System.out.println("Введите имя: ");
    String name = scanner.nextLine();
    System.out.println("Введите номера телефонов через ,: ");
    String phoneString = scanner.nextLine();
    String [] phoneNumbers = phoneString.split(",");
    scanner.close();
    
    phoneBook.put(name, phoneNumbers);
    phoneBook.forEach((key, value) -> {
        System.out.print(key + "=" + Arrays.toString(value));
    });
    }
}
