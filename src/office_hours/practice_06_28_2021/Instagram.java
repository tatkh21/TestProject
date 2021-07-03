package office_hours.practice_06_28_2021;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Instagram extends SocialMedia implements hasPictures{
    private String userName;
    private String password;
    private int numberOfFollowers;
    private ArrayList <Post> posts;
    static{
        platform = "Instagram";
    }
    public Instagram (String userName, String password) {
        this.userName = userName;
        this.password = password;
        personURL = "Instagram.com/" + getUserName();

    }

    @Override
    public void directMessage(String username, String message) {
        System.out.println(message + "send to " + username);
    }

    @Override
    public void post(String body) {
        posts.add(new Post(body));

    }

    @Override
    public void notification() {
        int dayTime = LocalTime.now().getHour();
        if (dayTime > 10 && dayTime < 20) {
            System.out.println("Notification");
        } else {
            System.out.println("Sleep mode");
        }

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    @Override
    public void likePicture() {

    }

    @Override
    public void unLikePicture() {

    }

    @Override
    public void sharePicture() {

    }
}
