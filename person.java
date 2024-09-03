import java.util.Scanner;

public class person {
    public static void main(String[] args) {
        int a = 18;
        Scanner sc = new Scanner(System.in);
        String v = sc.next();
        display(a, v);
    }
    public static void display(int a , String s){
        System.out.println(s+" "+ a);
    }
}
