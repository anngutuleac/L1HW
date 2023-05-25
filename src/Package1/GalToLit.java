import java.util.*;
public class GalToLit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество галлонов:");
        double gallons = sc.nextDouble();
        double liters = gallons * 3.7854;
        System.out.println(gallons + " галлонам соответствует " + liters + " литров");
    }
}
