package appliance.entity;

public class TV extends Device
{

    private int screenSize;      //размер диагонали
    private int clearMotionRate; //частота обновления экрана

    public TV(int screensize,int clearMotionRate){
        this.screenSize = screensize;
        this.clearMotionRate = clearMotionRate;

    }

    public TV(){

    }


    public int getScreenSize()
    {
        return screenSize;
    }

  /*  public void setScreenSize(int screenSize)
    {
        this.screenSize = screenSize;
    }
*/
    public int getClearMotionRate()

    {
        return clearMotionRate;
    }



 /*   public void setClearMotionRate(int clearMotionRate)
    {
        this.clearMotionRate = clearMotionRate;
    }
*/
    @Override
    public String toString()
    {
        return new StringBuilder(super.toString())
                .append(" ")
                .append(getClass().getSimpleName())
                .append(" screenSize=")
                .append(screenSize)
                .append(", clearMotionRate=")
                .append(clearMotionRate).toString();
    }

    @Override
    public int hashCode()
    {
        int hash = super.hashCode();
        hash = 83 * hash + this.screenSize;
        hash = 83 * hash + this.clearMotionRate;
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
        final TV other = (TV) obj;
        if (this.screenSize != other.screenSize)
        {
            return false;
        }
        if (this.clearMotionRate != other.clearMotionRate)
        {
            return false;
        }
        return true;
    }

}
