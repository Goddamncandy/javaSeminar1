// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

import java.util.Random;
import java.util.ArrayList;
 
public class task1 {

    public static void main (String[] args) {
    
    int a = 2000;
    int i = new Random().nextInt(a);
    int b = i;
    int d = i;
    System.out.println(i);

    int n = 0;
    while (i != 1) {
        i >>= 1;
        n++;
    }
    System.out.println(n);

    ArrayList<Integer> m1 = new ArrayList<Integer>();
    for (; b < Short.MAX_VALUE; b++) {
        if (b % n == 0) {
            m1.add(b);
        }
    }
    System.out.println(m1);

    ArrayList<Integer> m2 = new ArrayList<Integer>();
    for (int c = Short.MIN_VALUE; c < d; c++) {
        if (c % n == 1) {
            m2.add(c);
        }
    }
    System.out.println(m2);
}
}