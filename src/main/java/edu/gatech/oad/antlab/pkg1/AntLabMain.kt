package edu.gatech.oad.antlab.pkg1


import edu.cs2335.antlab.pkg3.*
import edu.gatech.oad.antlab.person.*
import edu.gatech.oad.antlab.pkg2.*


/**
 * CS2335 Ant Lab
 *
 * Prints out a simple message gathered from all of the other classes
 * in the package structure
 */
class AntLabMain {

    /**antlab11.java message class */
    private val ant11: AntLab11

    /**antlab12.java message class */
    private val ant12: AntLab12

    /**antlab21.java message class */
    private val ant21: AntLab21

    /**antlab22.java message class */
    private val ant22: AntLab22

    /**antlab31 java message class which is contained in a jar resource file */
    private val ant31: AntLab31

    /**
     * the constructor that intializes all the helper classes
     */
    init {

        ant11 = AntLab11()
        ant12 = AntLab12()
        ant21 = AntLab21()
        ant22 = AntLab22()
        ant31 = AntLab31()


    }

    /**
     * gathers a string from all the other classes and prints the message
     * out to the console
     *
     */
    fun printOutMessage() {

        var toPrint = (ant11.getMessage() + ant12.getMessage() + ant21.getMessage()
                + ant22.getMessage() + ant31.getMessage())
        //Person1 replace P1 with your name.
        //and gburdell1 with your gt id
        val p1 = Person1("John")
        toPrint += p1.toString("JBeckner3")
        //Person2 replace P2 with your name
        //and gburdell with your gt id
        val p2 = Person2("P2")
        toPrint += p2.toString("gburdell2")
        //Person3 replace P3 with your name
        //and gburdell3 with your gt id
        val p3 = Person3("P3")
        toPrint += p3.toString("gburdell3")
        //Person4 replace P4 with your name
        //and gburdell4 with your gt id
        val p4 = Person4("P4")
        toPrint += p4.toString("gburdell4")
        //Person5 replace P4 with your name
        //and gburdell5 with your gt id
        val p5 = Person5("P5")
        toPrint += p5.toString("gburdell5")

        System.out.println(toPrint)


    }

    companion object {


        /**
         * entry point for the program
         */
        fun main(args: Array<String>) {

            AntLabMain().printOutMessage()

        }
    }


}