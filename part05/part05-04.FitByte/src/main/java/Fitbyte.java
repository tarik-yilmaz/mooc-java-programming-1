public class Fitbyte {
    private int age;
    private int heartRate;

    public Fitbyte(int age, int heartRate) {
        this.age = age;
        this.heartRate = heartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maxHeartRate = 206.3 - (0.711 * this.age);
        
        return (maxHeartRate - this.heartRate)
                * percentageOfMaximum
                + this.heartRate;
    }
}
