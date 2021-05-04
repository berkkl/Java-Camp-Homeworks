public class User{
    private int id;
    private String TcNo;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String userName;

    public User(){

    }

    public User(int id, String TcNo, String firstName, String lastName, String birthDate, String userName){
        super();
        this.setId(id);
        this.setTcNo(TcNo);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setBirthDate(birthDate);
        this.setUserName(userName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTcNo() {
        return TcNo;
    }

    public void setTcNo(String tcNo) {
        TcNo = tcNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
