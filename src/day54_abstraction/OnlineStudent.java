package day54_abstraction;

public class OnlineStudent extends Student {
    @Override
    public void attendClass() {
        System.out.println("Online student is attending the clss using Zoom");
    }
    //public absturct void askQuestion();
}
