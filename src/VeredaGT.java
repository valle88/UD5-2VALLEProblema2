public class VeredaGT implements Vehicle{
     private float maxEnergy= 100.0f;
     private  int movementCount= 0;
     private int matricula;
      private float energy= 0.0f;
    @Override
    public float energyLevel() {
        return energy;

    }

    @Override
    public void recharge() {
        if (energy < maxEnergy){
            energy++;
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
