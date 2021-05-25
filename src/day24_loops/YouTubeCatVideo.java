package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: World's smallest cat");
        int seconds = 0;
        while (seconds < 117) {
            seconds++;
            System.out.println("Watchind video: second " + seconds );
            Thread.sleep(1000);
        }
        System.out.println("Finished watching cat video,lets start another one");



    }
}
