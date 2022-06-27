import java.util.Scanner;

class Java{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please Enter your First Number : ");
            int a = sc.nextInt();
            System.out.println("Please Enter you second Number : ");
            int b = sc.nextInt();

            System.out.println(a+b);
        }
    }
}