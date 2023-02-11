public class logIn {
    String firstName;
    String lustName;
    String phoneNum;
    String state;
    String email;
    String password;

    public logIn(String firstName, String lustName, String phoneNum, String state, String email, String password) {
        this.firstName = firstName;
        this.lustName = lustName;
        this.phoneNum = phoneNum;
        this.state = state;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLustName() {
        return lustName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getState() {
        return state;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLustName(String lustName) {
        this.lustName = lustName;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
