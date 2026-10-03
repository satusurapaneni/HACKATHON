import java.util.Scanner;
public class MethodsRooftopSolarEnergyMonitor {
    public void calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        Scanner sc = new Scanner(System.in);
        morningEnergy = sc.nextDouble();
        eveningEnergy = sc.nextDouble();
        double totalEnergy = morningEnergy + eveningEnergy;
        System.out.println("Total energy generated: " + totalEnergy + " kWh");

    }
        public static void main(String[] args) {
            MethodsRooftopSolarEnergyMonitor monitor = new MethodsRooftopSolarEnergyMonitor();
            monitor.calculateTotalEnergy(0, 0);
        }
}
