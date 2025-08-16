public class User {
    String firstName;
    String lastName;
    Gender gender;
    String licenseNumber;
    String userEmail;
    String password;
    String contactNo;

    public User(String firstName,String lastName, Gender gender, String licenseNumber,
                String userEmail, String contactNo){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.licenseNumber = licenseNumber;
        this.userEmail = userEmail;
        this.contactNo = contactNo;
    }

}
