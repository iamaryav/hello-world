class User{
     String name;
     int age;
     String address;


    public String getName(){
        return this.name;
    }

    public User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.age = userBuilder.age;
        this.address = userBuilder.address;
    }


    public static UserBuilder builder(){
        return new UserBuilder();
    }
    
    public static class UserBuilder{
        private String name;
        private int age;
        private String address;

        public UserBuilder name(String name){
            this.name = name;
            return this;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }
        
        public UserBuilder address(String address){
            this.address = address;
            return this;
        }
        
        public User build(){
            return new User(this);
        }
    }

}

public class Solution{
    public static void main(String[] args){
        User user = User.builder()
                        .name("Hero")
                        .age(1)
                        .address("this is my address")
                        .build();
        System.out.println(user.name);
    }
}