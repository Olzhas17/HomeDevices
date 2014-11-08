package appliance.entity;


public class Toaster extends Device
{
    private int numberOfSlots;  //количество отделений
    private int numberOfToasts; //количество тостов

    public Toaster(int numberOfSlots, int numberOfToasts){
       this.numberOfSlots = numberOfSlots;
       this.numberOfToasts = numberOfToasts;
    }

    public int getNumberOfSlots()
    {
        return numberOfSlots;
    }

  /*  public void setNumberOfSlots(int numberOfSlots)
    {
        this.numberOfSlots = numberOfSlots;
    }*/

    public int getNumberOfToasts()
    {
        return numberOfToasts;
    }

  /*  public void setNumberOfToasts(int numberOfToasts)
    {
        this.numberOfToasts = numberOfToasts;
    }
*/
    @Override
    public String toString()
    {
        return new StringBuilder(super.toString())
                .append(" ")
                .append(getClass().getSimpleName())
                .append(" numberOfSlots=")
                .append(numberOfSlots)
                .append(", numberOfToasts=")
                .append(numberOfToasts).toString();
    }
    
    
    @Override
    public int hashCode()
    {
        int hash = super.hashCode();
        hash = 11 * hash + this.numberOfSlots;
        hash = 11 * hash + this.numberOfToasts;
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
         if (!super.equals(obj))
         {
            return false;
        }
        final Toaster other = (Toaster) obj;
        if (this.numberOfSlots != other.numberOfSlots)
        {
            return false;
        }
        if (this.numberOfToasts != other.numberOfToasts)
        {
            return false;
        }
        return true;
    }
    
    
}
