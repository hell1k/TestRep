import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        double[] a = new double[2];
        a[0] = 1;
        a[1] = 2.4;

        //System.out.printf("%s, %.1f", a[0], a[1]);

//        String[] array = {"one", "two", "three"};
//        for(int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }

//        int[][] array = {{1, 2, 3}, {4, 5, 6}, {23, 4, 5ф}};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[0].length; j++) {
//                System.out.print(" " + array[i][j] + " ");
//            }
//            System.out.println();
//        }

        ArrayList<String> list = new ArrayList<>() ;
        list.add("qwe");
        list.add("asd");
        list.add("zxc");
        System.out.println(list.get(2));


    }


}
