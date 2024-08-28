public class Singleton{
    private String name;
    private static Singleton singleton = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton Object: " + singleton.getClass());
    }
}