public enum Season {
    SUMMER(20) , WINTER(-30) , AUTUMN(5) , SPRING(10);

    private int temperature;

    Season(int temperature){
    this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
