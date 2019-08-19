package user;

public class User {

    private String userName;
    private int userAge;


    public User(UserBuilder builder){
        this.userName= builder.name;
        this.userAge=builder.age;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public static class UserBuilder{
        private String name;
        private int age;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }


}