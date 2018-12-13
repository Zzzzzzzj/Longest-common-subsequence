import java.util.Scanner;

/**
 * lengthMax结构
 *  0 1 2 3 4 4 4
 *  0 1 2 3 3 3 4
 *  0 1 2 3 3 3 3
 *  0 1 2 2 3 3 3
 *  0 1 2 2 2 2 2
 *  0 1 1 1 1 1 1
 *  0 0 0 0 0 0 0
 */


/**
 * 设MaxLen(i,j)表示:
 s1的左边i个字符形成的子串，与s2左边的j个
 字符形成的子串的最长公共子序列的长度(i,j从0
 开始算）
 MaxLen(i,j) 就是本题的“状态”
 */

/**
 * S1[i-1]!= s2[j-1]时，MaxLen(S1,S2)不会比MaxLen(S1,S2j-1)
 和MaxLen(S1i-1,S2)两者之中任何一个小，也不会比两者都大。
 */

public class test2 {

    public static void main(String[] args){


//        Scanner scannerA=new Scanner(System.in);
//        String a=scannerA.next();
//        Scanner scannerB=new Scanner(System.in);
//        String b=scannerB.next();
        String a="abcfbc";
        String b="abfcab";
        char[] s1=a.toCharArray();
        char[] s2=b.toCharArray();
        int[][] lengthMax=new int[a.length()+1][b.length()+1];
        for (int i=0;i<=a.length();i++){
            lengthMax[i][0]=0;
        }
        for (int i=0;i<=b.length();i++){
            lengthMax[0][i]=0;
        }
        for (int i=1;i<=a.length();i++){
            for (int j=1;j<=b.length();j++){
                if (s1[i-1]==s2[j-1]){
                    lengthMax[i][j]=lengthMax[i-1][j-1]+1;
                }
                else {
                    lengthMax[i][j]=Math.max(lengthMax[i-1][j],lengthMax[i][j-1]);
                }
            }
        }

        System.out.println(lengthMax[a.length()][b.length()]);

    }

}
