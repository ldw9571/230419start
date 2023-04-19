package Test1;

public class Truck extends Car{


    public Truck() {

    }

    public Truck(int maxWeight, double oilTankSize, double efficiency) {
        super(maxWeight, oilTankSize, efficiency);

    }

    public double getEfficiency(){

        //5키로 당 0.2km씩 감소
        int value = getCurWeight() % 5;
        return -(0.2*value);
    }
    public void moving(int distance){
        double v = getRestOil() - calcOil(distance);
    }
    private double calcOil(int distance){
        return distance/getEfficiency();
    }
    public int getCost(int distance){


        return (int) (calcOil(distance)*3000);
    }
    public String toString(){
      return "";
    }




}
