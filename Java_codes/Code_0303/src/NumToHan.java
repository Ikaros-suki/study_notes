
import java.util.Scanner;

public class NumToHan {
    public static  void main(String[] args) {
        // Scanner stdin = new Scanner(System.in);

        // String stdout;

        NumToHan a = new NumToHan();

        Scanner stdin = new Scanner(System.in);

        System.out.println("input:");

        String stdout = a.toHanStr(stdin.nextLine());

        System.out.println(stdout);

        stdin.close();
    }

   
    


private String[] hanArr = {"��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��"};
private String[] unitArr = {"ʮ" , "��" , "ǧ","��","ʮ��","����"};


private String toHanStr(String numStr){
    String result = "";
    int numLen = numStr.length();

    // ���α��������ַ�����ÿһ������
    for(int i = 0; i < numLen; i++){
        // ��char������ת����int������, ���ǵ�ASCII��ֵǡ�����48
        int num = numStr.charAt(i) - 48;

        // ����������һλ����, �������ֲ���0, ����Ҫ��ӵ�λ(ǧ��ʮ)
        if(i != numLen - 1 && num != 0){
            result += hanArr[num] + unitArr[numLen - 2 - i];

        }
        // ����Ҫ��ӵ�λ
        else {
            // ��һ�����Ƿ�Ϊ0, ��Ϊ0ʱ�����
            if(result.length() > 0 && hanArr[num].equals("��") &&
            result.charAt(result.length() - 1) == '��')
                continue;
            result += hanArr[num];
        }
    }
        // ֻ�и�λ��, ֱ�ӷ���
        if(result.length() == 1)
            return result;

        int index = result.length() - 1;
        while(result.charAt(index) == '��'){
            index--;
        }

        if(index != result.length() - 1)
            return result.substring(0, index+1);
        else{
            return result;
        }
    
}




}




