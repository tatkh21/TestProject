package day32_arrays_split;

public class AWSZone {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        String[] zonesToDeploy = zones.split(",");
        System.out.println("--------Starting Deployment of etsy app to AWS zones....... ");
        for (String each: zonesToDeploy) {
            System.out.println("Deploying " + app +  " to " + each);
            System.out.println("Deployment completed  for " + each);
            System.out.println("Deployment completed for " + each);
            System.out.println();
        }
        System.out.println("---------------ALL deployment complete-----------------------");


    }
}
