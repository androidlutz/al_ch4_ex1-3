package CH_4_Exercises;

public class Exercise1 {
		

		    public static void zoop() {
		        baffle();
		        System.out.print("You wugga ");
		        baffle();
		    }

		    public static void main(String[] args) {
		        System.out.print("No, I ");
		        zoop();
		        System.out.print("I ");
		        baffle();
		    }

		    public static void baffle() {
		        System.out.print("wug");
		        ping();
		    }

		    public static void ping() {
		        System.out.println(".");
		        
		        
		    }

		}

		
/*
 * Baffle wug.
 * Zoop = wug. You wugga wug.
 * Ping = .
 * main = No, I wug. 
 * 		  You wugga wug. 
 * 		  I wug.
 * 
 * When baffle is invoked at the end of ping, a loop is created
 * because baffle contains ping as part of the method
 * 
 * 
 * 
 */

	


