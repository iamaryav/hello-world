import java.util.*;


public class RemoveDuplicate{
    public static void main(String[] args){

        List<User> users = List.of(new User(5, "e"), new User(1, "a"), new User(2, "b"), new User(3, "c"), new User(4, "d"), new User(1, "a"), new User(2, "b"), new User(3, "c"));

        List<User> distinctUsers = new ArrayList<>();

        for(User user : users){
            boolean isExist = false;
            for(User uniqueUser : distinctUsers){
                if(user.id == uniqueUser.id){
                    isExist = true;
                }
            }
            if(!isExist){
                distinctUsers.add(user);
            }
        }

        System.out.println("size: " + distinctUsers.size());
        distinctUsers.stream().forEach(user -> {
            System.out.println(user.id + " " + user.name);
        });

        HashMap<Integer, User> uniqueUsers = new HashMap<>();
        for(User user : users){
            int id = user.id;
            if(!uniqueUsers.containsKey(id)){
                uniqueUsers.put(id, user);
            }
        }
        uniqueUsers.entrySet().stream().forEach(entrySet -> {
            System.out.println("map: " + entrySet.getKey() + " " + entrySet.getValue().name);
        });

    }
}

class User{

    int id;
    String name;

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }
}