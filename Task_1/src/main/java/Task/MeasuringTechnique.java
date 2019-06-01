package Task;

public class MeasuringTechnique extends Technique {//измерительные
    private double temperature;
    private double volume;//объем
    private double weight;//вес
    private double time;

    public MeasuringTechnique(String name, boolean malfunction, int power, boolean enabledInTheNetwork, double temperature, double volume, double weight, double time) {
        super(name, malfunction, power, enabledInTheNetwork);
        this.temperature = temperature;
        this.volume = volume;
        this.weight = weight;
        this.time = time;
    }

    public double isTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double isVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double isWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "MeasuringTechnique{" +
                "name" + super.getName() +
                " malfunction" + super.isMalfunction() +
                " power" + super.getPower() +
                " enabledInTheNetwork" + super.isEnabledInTheNetwork() +
                " temperature=" + temperature +
                ", volume=" + volume +
                ", weight=" + weight +
                ", time=" + time +
                '}';
    }

}
