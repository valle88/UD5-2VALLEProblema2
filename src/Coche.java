public class Coche  implements Vehicle{
     private float energia = 0.0f;
     private  int movimiento;
    @Override
    public float energyLevel() {
        return energia;

    }

    @Override
    public void recharge() {
        if (energia == energia){
            energia++;
        }

    }

    @Override
    public void move() {

    }

    @Override
    public String status() {
        return null;
    }
}
