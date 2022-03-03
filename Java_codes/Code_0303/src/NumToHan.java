
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

   
    


private String[] hanArr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
private String[] unitArr = {"十" , "百" , "千","万","十万","百万"};


private String toHanStr(String numStr){
    String result = "";
    int numLen = numStr.length();

    // 依次遍历数字字符串的每一个数字
    for(int i = 0; i < numLen; i++){
        // 把char型数字转换成int型数字, 它们的ASCII码值恰好相差48
        int num = numStr.charAt(i) - 48;

        // 如果不是最后一位数字, 而且数字不是0, 则需要添加单位(千百十)
        if(i != numLen - 1 && num != 0){
            result += hanArr[num] + unitArr[numLen - 2 - i];

        }
        // 否则不要添加单位
        else {
            // 上一个数是否为0, 不为0时就添加
            if(result.length() > 0 && hanArr[num].equals("零") &&
            result.charAt(result.length() - 1) == '零')
                continue;
            result += hanArr[num];
        }
    }
        // 只有个位数, 直接返回
        if(result.length() == 1)
            return result;

        int index = result.length() - 1;
        while(result.charAt(index) == '零'){
            index--;
        }

        if(index != result.length() - 1)
            return result.substring(0, index+1);
        else{
            return result;
        }
    
}




}




