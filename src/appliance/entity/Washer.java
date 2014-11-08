package appliance.entity;


public class Washer extends Device {
    
    private int maxLoading; //макс. загрузка
    private int spinSpeed;  //скорость вращения
    private int numberOfPrograms;  //количество программ
    private int waterConsumption;  //расход воды

    public Washer(int maxLoading, int spinSpeed, int numberOfPrograms, int waterConsumption){
        this.maxLoading = maxLoading;
        this.spinSpeed = spinSpeed;
        this.numberOfPrograms = numberOfPrograms;
        this.waterConsumption = waterConsumption;         // birak kosa almadim
    }

    public int getMaxLoading() {
        return maxLoading;
    }

    /*public void setMaxLoading(int maxLoading) {
        this.maxLoading = maxLoading;
    }
*/
    public int getSpinSpeed() {
        return spinSpeed;
    }

   /* public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }
*/
    public int getNumberOfPrograms() {
        return numberOfPrograms;
    }

  /*  public void setNumberOfPrograms(int numberOfPrograms) {
        this.numberOfPrograms = numberOfPrograms;
    }*/

    public int getWaterConsumption() {
        return waterConsumption;
    }

  /*  public void setWaterConsumption(int waterConsumption) {
        this.waterConsumption = waterConsumption;
    }*/

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append(this.getClass().getSimpleName())
                .append(" maxLoading=")
                .append(maxLoading)
                .append(", spinSpeed=")
                .append(spinSpeed)
                .append(", numberOfPrograms=")
                .append(numberOfPrograms)
                .append(", waterConsumption=")
                .append(waterConsumption).toString();
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 61 * hash + this.maxLoading;
        hash = 61 * hash + this.spinSpeed;
        hash = 61 * hash + this.numberOfPrograms;
        hash = 61 * hash + this.waterConsumption;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
         if (!super.equals(obj)) {
            return false;
        }
        final Washer other = (Washer) obj;
        if (this.maxLoading != other.maxLoading) {
            return false;
        }
        if (this.spinSpeed != other.spinSpeed) {
            return false;
        }
        if (this.numberOfPrograms != other.numberOfPrograms) {
            return false;
        }
        if (this.waterConsumption != other.waterConsumption) {
            return false;
        }
        return true;
    }
    
    
    
   
}
