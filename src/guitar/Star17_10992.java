package guitar;

import java.util.Scanner;

public class Star17_10992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int tmp = input;

        for(int i=0;i<input;i++){
            for(int j=0;j<tmp-1;j++) System.out.print(" ");
            if(i==input-1){
                for(int j=0;j<2*input-1;j++) System.out.print("*");
                break;
            }
            else {
                System.out.print("*");
                if (i == 0) {
                    System.out.println();
                    tmp--;
                    continue;
                }
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                if (i == input - 1) break;
                System.out.println();
                tmp--;
            }
        }
    }
}
