
import java.util.Scanner;

public class BubbleSort{

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("����������Ԫ�ظ���:");
            int m = x.nextInt();
             //System.out.println(m);
             int[] number = new int[m];

             System.out.println("��������������Ԫ��:");

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
        //���ѭ�����ƱȽϵĴ���
        for (int i = 0; i < a.length - 1; i++) {
          //�ڲ�ѭ�����Ƶ���λ��
            for (int j = 0; j < a.length - i - 1; j++) {
                //ǰ���Ԫ�رȺ����ͽ���
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    
}