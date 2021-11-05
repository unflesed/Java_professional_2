package professional.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 5 слов:");
        for (int i = 0; i < 5; i++) {
           list.add(sc.next());
        }
        for (int i = 0; i < list.size(); i++) {
            concatList(doubleValues(list.get(i)));
            System.out.println(concatList(doubleValues(list.get(i))));
        }
    }

    static <String> List<java.lang.String> doubleValues(java.lang.String str) {
        ArrayList<java.lang.String> al = new ArrayList<>(List.of(str.split("")));
        for (int j = 0; j < al.size(); j += 2) {
            al.add(j, al.get(j));
        }
        return al;
    }
    static String concatList(List<String> list){
        StringBuilder sb = new StringBuilder();
        for (String temp: list) {
            sb.append(temp);
        }
        return sb.toString();
    }
}
