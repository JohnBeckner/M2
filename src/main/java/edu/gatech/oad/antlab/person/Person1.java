package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string
 *
 *  @author John
 *  @version 1.1
 */
public class Person1 {
    /** Holds the persons real name */
    private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
    public Person1(String pname) {
        name = pname;
    }
    /**
     * This method should take the string
     * input and return its characters rotated
     * 2 positions.
     * given "gtg123b" it should return
     * "g123bgt".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
        //Person 1 put your implementation here

        if (input.length() <= 2) {
            return input;
        }

        char[] ret = new char[input.length()];
        ret[0] = input.charAt(input.length() - 2);
        ret[1] = input.charAt(input.length() - 1);

        for (int i = 0; i < input.length() - 2; i++) {
            ret[i + 2] = input.charAt(i);
        }

        return String.valueOf(ret);
    }

    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the
     *         object
     */
    public String toString(String input) {
        return name + calc(input);
    }

}