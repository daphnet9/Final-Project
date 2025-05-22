//Jia Yi
 public class Medium extends Tasks {
    private final String difficulty = "Medium";

    private int medReward = 25;
    private String name;
    private int hours;
    private String description;

    public void setHours(int h)
    {
        hours = h;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setDescription(String d)
    {
        description = d;
    }
    
    public Medium()
    {
        //super(difficulty, name, hours, description);
    }

    public String getName()
    {
        return name;
    }
    public int getHours()
    {
        return hours;
    }
    public String getDescription()
    {
        return description;
    }
}