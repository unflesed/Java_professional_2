package professional.task_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String city, key, value;
        System.out.println("Введите город и фамилию. \nДля выхода введите 'exit'");
        do {
            System.out.println("Город:");
            key = sc.next();
            if (key.equals("exit")) break;
            System.out.println("Фамилия:");
            value = sc.next();
            if (value.equals("exit")) break;
            map.put(key, value);
        } while (true);
        System.out.println("Введите город:");
        city = sc.next();
        System.out.println(map.get(city));
    }
}
