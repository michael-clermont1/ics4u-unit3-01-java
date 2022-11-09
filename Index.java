/**
 * This is the standard Index() class starting point.
 *
 * @author  Michael Clermont
 * @version 1.0
 * @since   2020-10-04
 */

final class Index {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Index() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The reverseString() function.
    *
    * @param string - string from user
    * @return string - string
    */
    public static String reverseString(final String string) {
        if (string.length() == 0) {
            return string;
        } else {
            final String subString = string.substring(0, string.length() - 1);
            reverseString(subString);

            final char firstLetter = string.charAt(string.length() - 1);
            return firstLetter + reverseString(subString);
        }
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final String aString = "recursion";

        System.out.println("");
        System.out.println("The original string is: " + aString);
        System.out.println("The reversed string is: " + reverseString(aString));
    }
}
