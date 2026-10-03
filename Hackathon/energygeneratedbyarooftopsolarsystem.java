import java.util.Scanner;
public class energygeneratedbyarooftopsolarsystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float EnergyGenerated = sc.nextFloat();
        if(EnergyGenerated >= 10.0) {
            System.out.println("Good Energy generation"); 
            }
            else {
            System.out.println("Low Energy generation");
            }
        }
    }


