/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name;
		HelloUser user = new HelloUser();
		System.out.println("Hello ASE2015 - how are you? :)");
		name = user.getBenutzereingabe("Please enter your name: ");
		System.out.println("Hello "+name+" !");
		
		
	}

}
