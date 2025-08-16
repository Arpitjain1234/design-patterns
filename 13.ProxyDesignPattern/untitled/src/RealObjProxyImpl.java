import java.util.Objects;

public class RealObjProxyImpl implements RealObj{

    User user;
    @Override
    public void createUser(User client){
        if(Objects.equals(client.name, "ADMIN")){
            System.out.println("Allowing you to create a user");
            return ;
        }
        System.out.println("Access Denied");
        return;

    }

    @Override
    public void updateUser(User client){
        if(Objects.equals(client.name, "ADMIN")){
            System.out.println("Allowing you to create a user");
            return ;
        }
        System.out.println("Access Denied");
        return;
    }

    @Override
    public void deleteUser(User client){
        if(Objects.equals(client.name, "ADMIN")){
            System.out.println("Allowing you to delete a user");
            return ;
        }
        System.out.println("Access Denied");
        return;
    }

    @Override
    public void getUserDetail(User client){

        System.out.println("anyone can get the user details");
        return;
    }
}
