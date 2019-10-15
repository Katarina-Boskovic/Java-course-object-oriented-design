package builder_pattern;

public class User {

    private String username;    // required
    private String email;       // required

    private String firstName;   // optional
    private String lastName;    // optional
    private int phone;          // optional
    private String address;     // optional


    /*
    * telescoping constructor
    * adds more variation to constructor to enable defaults

    public User(String username, String email){
        this.username = username;
        this.email = email;
    }

    public User(String username, String email, String firstName, String lastName, int phone, String address){
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }
     */

    // private constructor: clients of this object can't instantiate instances of it through 'new'
    private User(Builder builder){
        // take attributes of the builder that was passed in and assign them to User
        this.username = builder.username;
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phone +
                ", address='" + address + '\'' +
                '}';
    }

    // nested class: has the build method that invokes the User object's constructor and passes itself to it
    public static class Builder{

        private String username;    // required
        private String email;       // required

        private String firstName;   // optional
        private String lastName;    // optional
        private int phone;          // optional
        private String address;     // optional

        public Builder(String username, String email){
            this.username = username;
            this.email = email;
        }

        public Builder firstName(String value){
            this.firstName = value;
            return this;
        }

        public Builder lastName(String value){
            this.lastName = value;
            return this;
        }

        // returns the instance of a User object:
        public User build(){
            return new User(this);   // this is the builder, creates a User object
        }
    }
}
