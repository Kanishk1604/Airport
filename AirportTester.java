import java.util.Scanner;
/**
   A class to test the Airport class.
*/
public class AirportTester {
   public static void main(String[] args) {
      Airport simulator = new Airport();

      Scanner in = new Scanner(System.in);
      boolean done = false;
      System.out.println("Runway Simulator Menu");
      System.out.println("-----------------------------------------------");
      System.out.println("> (l) to add a plane for landing, followed by the flight id");
      System.out.println("> (t) to add a plane for take-off, followed by the flight id");
      System.out.println("> (n) to perform next action");
      System.out.println("> (p) to print the planes waiting for landing/take-off.");
      System.out.println("> (g) print the planes already landed/taken-off to the screen");
      System.out.println("> (f) print the planes already landed/taken-off to the output file");
      System.out.println("> (q) quit to quit simulation.");
      System.out.println();

      while (!done) {
         System.out.print("> ");
         String action = in.next();
         if (action.equals("t")) {
            String flightID = in.next();
            simulator.addTakeOff(flightID);
         }
         else if (action.equals("l")) {
            String flightID = in.next();
            simulator.addLanding(flightID);
         }
         else if (action.equals("n")) {
            System.out.println(simulator.handleNextAction());
         }
         else if (action.equals("p")) {
            System.out.println(simulator.waitingPlanes());
         }
         else if (action.equals("g")) {
            System.out.println(simulator.log());
         }
         else if (action.equals("f")) {
            simulator.log("AirportLog.txt");
         }
         else if (action.equals("q")) {
            done = true;
         }
         else
            System.out.println("Invalid Command!");
      }
   }
}
