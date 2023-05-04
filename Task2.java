/*Пусть дан список сотрудников:

Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдёт и выведет повторяющиеся имена с количеством 
повторений. Отсортировать по убыванию популярности. */
package Homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Task2 {
    public static void main(String[] args) {

        String [] names = {"Иван Иванов","Светлана Петрова","Кристина Белова","Анна Мусина","Анна Крутова","Иван Юрин","Петр Лыков","Павел Чернов","Петр Чернышов","Мария Федорова","Марина Светлова","Мария Савина","Мария Рыкова","Марина Лугова","Анна Владимирова","Иван Мечников","Петр Петин","Иван Ежов"};
        Map<String, Integer> namesMap = new HashMap<>();

        // заполняю namesMap, с увеличением value на 1, если ключ(имя) повторился
        for (String item : names) {
            String[] itemTemp = item.split(" ");
            if (namesMap.containsKey(itemTemp[0])){
            namesMap.put(itemTemp[0], namesMap.get(itemTemp[0])+1);
            }
            else namesMap.put(itemTemp[0], 1);
            }
        //System.out.println(namesMap);
       
        // создание массива из уникальных values с его сортировкой
        List<Integer> values= new ArrayList<>();
        namesMap.forEach((key, value) -> {
            values.add(value);
        });
        List<Integer> distinctvalues = values.stream().distinct().collect(Collectors.toList());
        //System.out.println(distinctvalues);
        distinctvalues.sort(Collections.reverseOrder() );
        //System.out.println(distinctvalues);

        //печать пары из namesMap с помощью отсортированного массива
        for (int item : distinctvalues) {
            namesMap.forEach((key, value) -> {
                if (item == value){
                    System.out.print(key + "=" + value + ", ");
                }
            });
        }
    }      
}

