import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 4; i--) {
            boolean flag = true;
            int num = i;
            while(num != 0){
                if(num % 10 ==4 || num % 10 ==7)
                    num /= 10;
                else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
                break;
            }
        }
            
            
        

    }
}