public class MyWeightOnMoonCalc {
    public static void main(String args[]) {
        double myWeight = 50;
        double earthGravAcc = 9.8;
        double moonGravCoef = 0.17;
        double moonGravAcc = earthGravAcc * moonGravCoef;
        double myWeightOnMoon = myWeight * moonGravAcc;
        System.out.println("Мой вес на луне составляет " + myWeightOnMoon + " Ньютон");
    }
}
