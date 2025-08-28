package entity;

import java.util.List;

public class Group {
    String name;
    List<User>groupMembers;

    public Group(String groupName,List<User>groupMembers){
        this.groupMembers = groupMembers;
        this.name = groupName;
    }
}
