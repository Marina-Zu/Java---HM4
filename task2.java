import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.



public class task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер списка => ");
        Integer n = scan.nextInt();
        for (int i = 0; i <n; i++){
            int num = rnd.nextInt(-10, 10);
            list.add(num);
        }
        System.out.printf("Исходный список %s \n", list);
        System.out.println(); 

        
        enqueue(list, n);
        System.out.printf("Элемент в конце списка %s \n", list);

        System.out.printf("Первый элемент списка %s \n", dequeue(list));
        System.out.printf("Удаляем его %s \n", list);

        System.out.printf("Первый элемент списка %s \n", first(list));
        System.out.printf("Полный список %s ", list);

    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите элемент => ");
        Integer n = scan.nextInt();
        list.addLast(n);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}
