package activity4;

import simpleIO.Console;


public class ValidInput extends Console {

    /**
     * This method obtains an integer (positive or negative whole number) from the user.
     * 
     * @param prompt
     *            A message for the user, so they know what number is expected
     * @param lowerLimit
     *            the lowest number that the user can enter
     *                       
     * @return An <code>int</code> containing the number entered by the user. If the user tries to enter something a number
     *         outside of the limits, they are re-prompted until they provide the appropriate input
     */
    public static int readIntGreaterThan(String prompt, int lowerLimit) {
        
		int num;
		do {
			num = Console.readInt(prompt);
	
		} while (num < lowerLimit);
	
		
		return num;
    }

    /**
     * This method obtains an integer (positive or negative whole number) from the user.
     * 
     * @param prompt
     *            A message for the user, so they know what number is expected
     * @param upperLimit
     *            the highest number that the user can enter
     *                       
     * @return An <code>int</code> containing the number entered by the user. If the user tries to enter something a number
     *         outside of the limits, they are re-prompted until they provide the appropriate input
     */
    public static int readIntLessThan(String prompt, int upperLimit) {
		int num;
		do {
			num = Console.readInt(prompt);
	
		} while (num > upperLimit);
	
		
		return num;
    }

    /**
     * This method obtains an integer (positive or negative whole number) from the user.
     * 
     * @param prompt
     *            A message for the user, so they know what number is expected
     * @param lowerLimit
     *            the lowest number that the user can enter           
     * @param upperLimit
     *            the highest number that the user can enter
     *                       
     * @return An <code>int</code> containing the number entered by the user. If the user tries to enter something a number
     *         outside of the limits, they are re-prompted until they provide the appropriate input
     */
    public static int readIntBetween(String prompt, int lowerLimit, int upperLimit) {
		int num;
		do {
			num = Console.readInt(prompt);
	
		} while (num > upperLimit || num < lowerLimit);
	
		
		return num;
    }

    /**
     * This method obtains a real number (which may include decimals or floating point values) from the user.
     * 
     * @param prompt
     *            A message for the user, so they know what number is expected
     * @param lowerLimit
     *            the lowest number that the user can enter           
     *                                   
     * @return A <code>double</code> containing the number entered by the user. If the user tries to enter something a number
     *         outside of the limits, they are re-prompted until they provide the appropriate input
     */
    public static double readDoubleGreaterThan(String prompt, double lowerLimit) {
    	Double num;
		do {
			num = Console.readDouble(prompt);
	
		} while (num < lowerLimit);
	
		
		return num;
    }

    /**
     * This method obtains a real number (which may include decimals or floating point values) from the user.
     * 
     * @param prompt
     *            A message for the user, so they know what number is expected
     * @param upperLimit
     *            the highest number that the user can enter
     *                       
     * @return A <code>double</code> containing the number entered by the user. If the user tries to enter something a number
     *         outside of the limits, they are re-prompted until they provide the appropriate input
     */
    public static double readDoubleLessThan(String prompt, double upperLimit) {
    	Double num;
		do {
			num = Console.readDouble(prompt);
	
		} while (num > upperLimit);
	
		
		return num;
    }

    /**
     * This method obtains a real number (which may include decimals or floating point values) from the user.
     * 
     * @param prompt
     *            A message for the user, so they know what number is expected
     * @param lowerLimit
     *            the lowest number that the user can enter           
     * @param upperLimit
     *            the highest number that the user can enter
     *                                   
     * @return A <code>double</code> containing the number entered by the user. If the user tries to enter something a number
     *         outside of the limits, they are re-prompted until they provide the appropriate input
     */
    public static double readDoubleBetween(String prompt, double lowerLimit, double upperLimit) {
    	Double num;
		do {
			num = Console.readDouble(prompt);
	
		} while (num > upperLimit || num < lowerLimit);
	
		
		return num;
    }

}
