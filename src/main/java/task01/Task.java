package task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        //1) Bir list'teki tek elemanlari ayni satirda aralarina bosluk koyarak
        // yazdiran method'u olusturunuz.
        List<Integer> mylist=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
        //tekYazdiran1(mylist);
        tekYazdiran2(mylist);
    }
    //lambdasız
    private static void tekYazdiran1(List<Integer> mylist) {
        for (int a:mylist) {
            if (a%2!=0){
                System.out.print(a+" ");
            }
        }
    }
    //lamdalı
    private static void tekYazdiran2(List<Integer> mylist) {
        System.out.println(mylist.stream().filter(t -> t % 2 != 0).collect(Collectors.toList()));
        mylist.stream().filter(t -> t % 2 != 0).forEach(t-> System.out.print(t +" "));
    }
}
    //merhaba