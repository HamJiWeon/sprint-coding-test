import java.util.Scanner;
//별찍기
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 0; i<b; i++){
            System.out.print("*");
            for(int j=1; j<a; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        // System.out.println(a + b);
    }
}