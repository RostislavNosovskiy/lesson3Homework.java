import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class main1 {
    public static void main(String[] args) {
        Integer [] arr = {2, 3, 45, 65, 76, 84, 34};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        numDelete(list);
        System.out.println(list);

    }
    static void numDelete (List<Integer> list){
        for (int i = 0; i< list.size(); i++){
            if (list.get(i)%2 == 0){
                list.remove(i);
                i--;
            }
        }
    }
}
