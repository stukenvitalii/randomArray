import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int [] array = new int[8];
        final Random random = new Random();
        
        // заполняем массив случайными целыми числами из отрезка [1;10] и выводим его
        for(int i = 0; i < 8; i++) {
            array[i] = 1 + random.nextInt(10);
            System.out.printf("%d ",array[i]);
        }
        
        // провеяем полученный массив на строгое возрастание
        int k = 0;
        for(int j = 0; (j < 7)&&(k == 0); j++) {
            if(array[j+1] <= array[j]){
                k = 1;
            }
        }

        if(k == 0){
            System.out.println("\nДа");
        }
        else{
            System.out.println("\nНет");
        }

        // заменяем каждый элемент с нечетным индексом на 0
        for(int m = 0;m < 8;m = m + 2) {
            array[m] = 0;
        }

        // выводим полученный массив
        for(int n = 0; n < 8; n++) {
            System.out.printf("%d ",array[n]);
        }
        
            
    }
}
