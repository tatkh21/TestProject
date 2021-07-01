package office_hours.practice_06_28_2021;
/*

 */

import java.time.LocalTime;
import java.util.ArrayList;

public class Facebook extends SocialMedia implements Groups{
    private String username;
    private String password;
    private String fullName;
    private int age;
    private int numberOfFriends;
    private ArrayList<Post> allPosts;
    int groups;


    static {
        platform = "Facebook";
    }
    public Facebook (String username, String password) {
        this.username = username;
        setPassword(password);
        personURL = "Facebook.com/" + username;
        allPosts = new ArrayList<>();
        allPosts = new ArrayList<>();
    }
    public Facebook (String username, String password, String fullName) {
        this(username,password);
        setFullName(fullName);
    }
    public Facebook(String username, String password, String fullName,int age, int numberOfFriends ) {

    }

    public String getPassword() {
        if (password.contains((this.username))) {
            System.out.println("Password contains username");
            this.password = "password";
        } else {
            this.password = password;
        }
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
         if (numberOfFriends < 5000) {
            this.numberOfFriends = numberOfFriends;
        } else {
             System.out.println("Invalid number of friends");
         }
    }

    public ArrayList<Post> getAllPosts() {
        return allPosts;
    }

    public void setAllPosts(ArrayList<Post> allPosts) {
        this.allPosts = allPosts;
    }

    @Override
    public void directMessage(String username, String message) {
        System.out.println();

    }

    @Override
    public void post(String body) {
        allPosts.add(new Post (body));

    }
    public boolean sendFriendRequest (Facebook other) {
        boolean sent = false;
        if (this.getNumberOfFriends() < 5000 && other.getNumberOfFriends() < 5000) {
            System.out.println("Friend request sent to " + other.getUsername());
            sent = true;
            this.setNumberOfFriends(this.getNumberOfFriends() + 1);
            other.setNumberOfFriends((other.getNumberOfFriends()) + 1);
        } else if (this.getNumberOfFriends() == 5000) {
            System.out.println("You have reached the MAX friend limit");
        } else {
            System.out.println(other.getUsername() + " can not accept anymore friends");
        }
        return sent;
    }
    //Facebook user -> user

    @Override
    public void notification() {
        int currentHour = LocalTime.now().getHour();
        if (currentHour >= 8 && currentHour <= 17) {
            System.out.println("Notification");
        } else {
            System.out.println("Sleep mode");
        }

    }

    public int getGroups() {
        return groups;
    }

    public void setGroups(int groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Facebook{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                ", allPosts=" + allPosts +
                '}';
    }

    @Override
    public void jopinGroup(String groupName) {
        System.out.println(getUsername() + " has joined " + groupName);

    }

    @Override
    public void leaveGroup(String groupName) {

    }
}
