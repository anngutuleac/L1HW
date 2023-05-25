/*
Рассчитать расстояние до места вспышки молнии, звук от которого
доходит до наблюдателя через 7,2 секунды.
 */
class Sound {
    public static void main(String args[]) {
        double durationInSec = 7.2;
        double speedOfSound = 1100;
        double distanceToFlash = speedOfSound * durationInSec;
        System.out.println("Paccтoяниe до места вспышки молнии составляет " + distanceToFlash + " футов");
    }
}