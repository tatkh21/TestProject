package day48_constractor_static;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;
    private List<String> members = new ArrayList<>();
    Group (String name) {
        this.groupName = name;
        members = new ArrayList<>();
    }

    public void addName(String newMemeber) {
        members.add(newMemeber);
    }
    public void removeMember(String name) {
        members.remove(name);
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupMame='" + groupName + '\'' +
                ", members=" + members +
                '}';
    }
}
