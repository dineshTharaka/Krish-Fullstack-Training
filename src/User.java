import javax.jws.soap.SOAPBinding;

public class User {

    private final int id;
    private final String name;
    private final String email;
    private final int mobile;

    public User(Builder builder){

        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.mobile = builder.mobile;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getMobile() {
        return mobile;
    }


    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + ", mobile=" + mobile + '}';
    }

    static class Builder{
        private int id;
        private String name;
        private String email;
        private int mobile;

        public User build(){
            User user = new User(this);
            return user;

        }


        public Builder(int id, String email){
            this.id = id;
            this.email = email;

        }



        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setMobile(int mobile) {
            this.mobile = mobile;
        }



    }

}
