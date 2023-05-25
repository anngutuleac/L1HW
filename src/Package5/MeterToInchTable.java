public class MeterToInchTable {
    public static void main(String[] args ) {
        double meters, inches;
        int counter = 0;
        double inchToMeterCoef = 0.0254;
        for(inches = 1; inches <= 100; inches++) {
            meters = inches * inchToMeterCoef; // преобразовать в метры
            System.out.println(inches + " дюймам соответствует " + meters + " метров");
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0; // сбросить счетчик строк
            }
        }
    }
}
