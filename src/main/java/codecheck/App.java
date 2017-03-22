package codecheck;
import java.util.Scanner;


public class App{
    
    public static void main(String[] args) {
        int[] coin_math = new int[5];
        int cost_count = 0;
        
        int s[]=new int[5];
        //Scannerクラスのインスタンスの生成
        Scanner sc = new Scanner(System.in);
        System.out.print("コイン：[");
        for(int i=0;i<s.length;i++){
            
            //整数をキーボードから入力し、配列に記憶
            s[i]= sc.nextInt();
            if( i == s.length - 1 ){
                System.out.print("]");
            }else{
                System.out.print(",");
            }
        }
        
        //Scanner count = new Scanner(System.in);
       // System.out.println("金額：" + sc.nextInt);
        
    }
}
