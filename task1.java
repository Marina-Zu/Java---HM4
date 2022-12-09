import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 * Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод, который вернет “перевернутый” список.
 */

public class task1 {

    public static void main(String[] args) {
        Random rnd = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер списка => ");
        Integer n = scan.nextInt();
        for (int i = 0; i <n; i++){
            int num = rnd.nextInt(-100, 100);
            list.add(num);
        }
        System.out.printf("Исходный список %s ", list);
        System.out.println(); 
        LinkedList<Integer> reverselist = new LinkedList<>();           
        for(int i=list.size()-1; i>=0; i--){
            reverselist.add(list.get(i));
        }
        System.out.printf("'Перевернутый' список %s", reverselist);
    }
}