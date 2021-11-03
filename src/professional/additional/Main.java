package professional.additional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String end = null;
        System.out.println("Введите строковые значения. \nДля выхода введите 'end'.");
        do {
            end = sc.nextLine();
            if (end.equals("end")) break;
            else arrayList.add(end);
        }while(true);
        for (String temp: arrayList) {
            System.out.println(temp);
        }
    }
}
