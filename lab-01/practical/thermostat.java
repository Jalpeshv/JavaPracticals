class thermostat {
    private double temperature;

    public thermostat(double initialTemperature) {
        this.temperature = initialTemperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double newTemperature) {
        this.temperature = newTemperature;
    }

    public void increaseTemperature(double increment) {
        this.temperature += increment;
    }

    public void decreaseTemperature(double decrement) {
        this.temperature -= decrement;
    }
}