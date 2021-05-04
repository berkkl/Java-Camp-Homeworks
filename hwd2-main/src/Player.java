public class Player {

    private String currentTeam;
    private int no;
    private String name;
    private double oldValue;
    private double currentValue;
    private String oldTeam;
    private double valueIncrease;
    private double valueDecrease;

    public Player(){
        super();
        this.no=0;
        this.name ="";
        this.oldValue =0;
        this.oldTeam ="";
        this.valueIncrease=0;
        this.valueDecrease=0;
    }

    public Player(int no, String name, double oldValue, double currentValue, String oldTeam, String currentTeam, double valueIncrease, double valueDecrease) {
        this.no = no;
        this.name = name;
        this.oldValue = oldValue;
        this.currentValue = currentValue;
        this.oldTeam = currentTeam;
        this.valueIncrease = valueIncrease;
        this.valueDecrease = valueDecrease;


    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOldValue() {

        return oldValue;
    }

    public void setOldValue(float oldValue) {

        this.oldValue = oldValue;
    }

    public String getOldTeam() {

        return oldTeam;
    }

    public void setOldTeam(String oldTeam) {

        this.oldTeam = oldTeam;
    }

    public String getCurrentTeam() {

        return currentTeam;
    }

    public void setCurrentTeam(String currentTeam) {

        this.currentTeam = currentTeam;
    }

    public double getValueIncrease() {

        return valueIncrease;
    }

    public void setValueIncrease(float valueIncrease) {

        this.valueIncrease = valueIncrease;
    }

    public double getValueDecrease() {

        return valueDecrease;
    }

    public void setValueDecrease(float valueDecrease) {

        this.valueDecrease = valueDecrease;
    }

    public double getLastValue() {
        return this.oldValue + this.valueIncrease + this.valueDecrease;
    }

    public double getValueChange() {

        return ((((this.oldValue + this.valueIncrease + this.valueDecrease) / this.oldValue))-1)*100;
    }
}
