import java.util.Scanner;
public class RooftopSolarEnergyMonitor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Panelid = sc.nextInt();
        System.out.println("The panel id of the rooftop solar system is: " +Panelid);
        float EnergyGenerated = sc.nextFloat();
        System.out.println("Energy generated in kWh is:" +EnergyGenerated);
        int Solarpanels = sc.nextInt();
        System.out.println("The number of solar panels in the system is: " +Solarpanels);
        char Status = 'A';
        System.out.println("The status of the rooftop solar system is: " +Status);
    }
}