import java.util.Scanner;

/**
 * 输入两个字符串
 * 求这两个字符串最大公共的子字符串的长度
 */


/**
 * 理解错题意
 */

public class test1 {

    public static void main(String[] args){
        Scanner scannerA=new Scanner(System.in);
        String a=scannerA.next();
        Scanner scannerB=new Scanner(System.in);
        String b=scannerB.next();
        int max=0;
        boolean end=false;
        if (a.length()<=b.length()) {
            for (int i = 0; i <a.length();i++){
                for (int j=0;j<=i;j++) {
                    String sub = a.substring(j,a.length()-i+j);
                    if (b.contains(sub)){
                        max=sub.length();
                        System.out.println(sub);
                        end=true;
                        break;
                    }
                }
                if (end){
                    break;
                }
            }

        }

        System.out.println(max);

    }

}
