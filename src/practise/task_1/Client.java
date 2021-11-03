package practise.task_1;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Client {
    private String name;
    private int request;
    public int priority;
    public Client(String name, int request, int priority) {
        this.name = name;
        this.request = request;
        this.priority = priority;
    }
}
class prioritySort implements Comparator<Client>{

    @Override
    public int compare(Client o1, Client o2) {
        return o1.priority - o2.priority;
    }
}
class Main{
    public static void main(String[] args) {
        PriorityQueue<Client> queue = new PriorityQueue<>();
        Client client1 = new Client("name1",200, 1);
        Client client2 = new Client("name2",201, 2);
        Client client3 = new Client("name3",300, 4);
        Client client4 = new Client("name4",400, 3);
        Client client5 = new Client("name5",500, 5);
        queue.offer(client1);
        queue.offer(client2);
        queue.offer(client3);
        queue.offer(client4);
        queue.offer(client5);
        for (Client temp: queue) {
            System.out.println(queue.peek());
        }
    }
}