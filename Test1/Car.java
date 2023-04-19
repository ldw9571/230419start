package Test1;

public class Car extends Vehicle{
    private double restOil;
    private int curWeight;

    public Car() {

    }

    public Car(int maxWeight, double oilTankSize, double efficiency) {
        super(maxWeight, oilTankSize, efficiency);
    }

    public void addOil(int oil){
        double v = restOil + oil;
    }
    public void moving(int distance){
        double v = getEfficiency() * distance;
    }

    public void addWeight(int weight){
            int realWeight=weight+curWeight;
        if(realWeight>super.getMaxWeight()){
            System.out.println(weight+curWeight);
         }

    }
    public String toString(){
        return "";

    }

    public double getRestOil() {
        return restOil;
    }

    public void setRestOil(double restOil) {
        this.restOil = restOil;
    }

    public int getCurWeight() {
        return curWeight;
    }

    public void setCurWeight(int curWeight) {
        this.curWeight = curWeight;
    }
}
