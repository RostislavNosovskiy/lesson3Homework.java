//Задан целочисленный список ArrayList. Найти минимальное, максимальное
// и среднее арифметическое из этого списка. Collections.max()

import java.util.*;

public class main2 {
    public static void main(String[] args) {
        Integer [] arr = {2, 3, 455, 65, 76, 84, 34};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(average(list));

    }
    static double average (List<Integer> list){
        double sum = 0;
        for (int i = 0; i< list.size(); i++){
            sum += list.get(i);
        }
        double res = sum/list.size();
        return res;
    }
}
