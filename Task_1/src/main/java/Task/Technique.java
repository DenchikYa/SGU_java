package Task;

public class Technique implements Switcher {
    private String name;
    private boolean malfunction;
    private int power;
    private boolean enabledInTheNetwork;

    public Technique(String name, boolean malfunction, int power, boolean enabledInTheNetwork) {
        this.name = name;
        this.malfunction = malfunction;
        this.power = power;
        this.enabledInTheNetwork = enabledInTheNetwork;
    }

    @Override
    public void switchOn(String name) { enabledInTheNetwork = true; }

    @Override
    public void switchOff (String name) {
        enabledInTheNetwork = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMalfunction() {
        return malfunction;
    }

    public void setMalfunction(boolean malfunction) {
        this.malfunction = malfunction;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isEnabledInTheNetwork() {
        return enabledInTheNetwork;
    }

    public void setEnabledInTheNetwork(boolean enabledInTheNetwork) {
        this.enabledInTheNetwork = enabledInTheNetwork;
    }

        @Override
    public String toString() {
        return "Technique{" +
                "name=" + name + '\'' +
                " malfunction=" + malfunction +
                " power=" + power +
                " enabledInTheNetwork=" + enabledInTheNetwork +
                '}';
    }
    //public class PowerComparator implements java.util.Comparator<Unit>{
    // public int compare(Unit un1, Unit un2) {
    //    return (un1.getUnitPower() - un2.getUnitPower());
    // }
    //}
}
