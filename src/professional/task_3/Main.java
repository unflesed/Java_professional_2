package professional.task_3;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        int n;
        System.out.println("Введите N:");
        n = sc.nextInt();
        System.out.println("Минимальное число: " + getMinimum(getIntegerList(n,list)));
    }
    static List<Integer> getIntegerList(int n, List<Integer> list){
        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        return list;
    }
    static Integer getMinimum(List<Integer> list){
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return list.get(0);
    }
}
