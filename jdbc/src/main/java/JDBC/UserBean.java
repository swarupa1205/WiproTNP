package JDBC;

public class UserBean {

    private String userId;
    private String password;
    private String name;
    private int incorrectAttempts;
    private int lockStatus;
    private String userType;

    // Default Constructor
    public UserBean() {

    }

    // Parameterized Constructor
    public UserBean(String userId, String password, String name,
                    int incorrectAttempts, int lockStatus, String userType) {

        this.userId = userId;
        this.password = password;
        this.name = name;
        this.incorrectAttempts = incorrectAttempts;
        this.lockStatus = lockStatus;
        this.userType = userType;
    }

    // Getter and Setter for User ID
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    // Getter and Setter for Password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Incorrect Attempts
    public int getIncorrectAttempts() {
        return incorrectAttempts;
    }

    public void setIncorrectAttempts(int incorrectAttempts) {
        this.incorrectAttempts = incorrectAttempts;
    }

    // Getter and Setter for Lock Status
    public int getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(int lockStatus) {
        this.lockStatus = lockStatus;
    }

    // Getter and Setter for User Type
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    // Display Object
    @Override
    public String toString() {
        return "UserBean [userId=" + userId +
                ", password=" + password +
                ", name=" + name +
                ", incorrectAttempts=" + incorrectAttempts +
                ", lockStatus=" + lockStatus +
                ", userType=" + userType + "]";
    }
}