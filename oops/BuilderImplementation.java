public class BuilderImplementation{
     String name;
     int age;
     String address;


    public String getName(){
        return this.name;
    }

    public BuilderImplementation(BuilderImplementationBuilder userBuilder){
        this.name = userBuilder.name;
        this.age = userBuilder.age;
        this.address = userBuilder.address;
    }


    public static BuilderImplementationBuilder builder(){
        return new BuilderImplementationBuilder();
    }
    
    public static class BuilderImplementationBuilder{
        private String name;
        private int age;
        private String address;

        public BuilderImplementationBuilder name(String name){
            this.name = name;
            return this;
        }

        public BuilderImplementationBuilder age(int age){
            this.age = age;
            return this;
        }
        
        public BuilderImplementationBuilder address(String address){
            this.address = address;
            return this;
        }
        
        public BuilderImplementation build(){
            return new BuilderImplementation(this);
        }
    }

    public static void main(String[] args){
        BuilderImplementation user = BuilderImplementation.builder()
                        .name("Hero")
                        .age(1)
                        .build();
        System.out.println(user.name);
    }

}