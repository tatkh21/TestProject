package office_hours.practice_06_28_2021;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class FacebookUserObjects {
    public static void main(String[] args) throws InterruptedException {
        Facebook userOne = new Facebook("jamesbond", "james");
        System.out.println(userOne);
        Facebook userTwo = new Facebook("adam324", "123HNyu", "Adam James", 12, 4000);
        System.out.println(userTwo);

        userOne.sendFriendRequest(userTwo);
        //this -> user One
        //other -> user two

        System.out.println(userOne);
        System.out.println(userTwo);

        userOne.post("Thhis is my first post!");

        Thread.sleep(10000);

        userOne.post("Ilike this app");

        System.out.println(userOne.getAllPosts());
        //ArrayList<FacebookUser>


    }



}
