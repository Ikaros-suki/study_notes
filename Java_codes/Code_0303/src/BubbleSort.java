
import java.util.Scanner;

public class BubbleSort{

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("请输入数组元素个数:");
            int m = x.nextInt();
             //System.out.println(m);
             int[] number = new int[m];

             System.out.println("请逐个输入数组的元素:");

             for(int i=0;i<m;i++){
                 number[i]=x.nextInt();
            }
            
        sort(number);

        for(int i = 0; i < number.length; i++){
            System.out.print(number[i] + "  ");
        }

        x.close();
        
    }


    public static void sort(int[] a) {
        //外层循环控制比较的次数
        for (int i = 0; i < a.length - 1; i++) {
          //内层循环控制到达位置
            for (int j = 0; j < a.length - i - 1; j++) {
                //前面的元素比后面大就交换
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    
}