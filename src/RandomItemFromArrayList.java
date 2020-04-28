/**
 * The Program generates three random numbers to decide how many number of subject,
 * verb and object words user to enter.
 * Then guides user to enter what index word it is in the arraylist
 * Saves the words in respective arraylist
 * requests if user needs to see a sentence randomly generated from the three word arraylists
 * again generates random index number and displays the setence, list of all the arraylists entered
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * *       PSEUDOCODE    * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Start
 * // INPUT
 * create instance of Scanner class
 * create instance of Random class
 * <p>
 * declare a String variable to temporarly store user input
 * declare and assign it true a while loop control boolean variable
 * declare and initialize a variable for higher random number plus one
 * declare and initialize a variable for lower random number
 * <p>
 * declare arraylists for subjects
 * declare arraylists for verbs
 * declare arraylists for objects
 * <p>
 * // INPUT + PROCESS
 * <p>
 * declare and assign an integer variable to store generated number of subjects
 * declare and assign an  integer variable to store generated number of verbs
 * declare and assign an  integer variable to store generated number of objects
 * <p>
 * <p>
 * 	WHILE LOOP
 * 		prompt user to enter number of subjects (use number generated for number of subjects)
 * 			FOR LOOP ( index from zero to generated number of subjects)
 * 				print index of the word user to enter (?/?)
 * 				scan and assign what user entered to the string variable
 * 				add the word to subjects arraylist
 * 			END FOR LOOP
 * 		prompt user to enter number of verbs (use number generated for number of verbs)
 * 			FOR LOOP ( index from zero to generated number of verbs)
 * 				print index of the word user to enter (?/?)
 * 				scan and assign what user entered to the string variable
 * 				add the word to verbs arraylist
 * 			END FOR LOOP
 * 		prompt user to enter number of objects (use number generated for number of objects)
 * 			FOR LOOP ( index from zero to generated number of objects)
 * 				print index of the word user to enter (?/?)
 * 				scan and assign what user entered to the string variable
 * 				add the word to objects arraylist
 * 			END FOR LOOP
 * 		assign high to take number of words created for subject (that has to be length of the array)
 * 		assign low to be equal to zero since least value of index is zero
 * 		assign high to take number of words created for verb (that has to be length of the array)
 * 		assign high to take number of words created for object (that has to be length of the array)
 * // OUTPUT
 * 		generate three random numbers between the same range as above to now to construct a sentence
 * 		prompt if user wants to display the sentence and array of words entered
 * 			IF (user types "yes" ignorecase)
 * 				print a sentence using one random word from each arraylists
 * 				print all the three arrays
 * 				print thank you!
 * 				assign while loop control to be false
 * 			ELSE
 * 				assign while loop control to be false
 * 			END IF
 * 	END WHILE
 * close scanner object
 * end
 *
 * * * * * * * * * * * * * * * * *       TEST DATA - 1    * * * * * * * * * * * * * * * * * * *
 *
 * Enter 7 subject words:
 * Enter (1/7) subject: God
 * Enter (2/7) subject: The Lord
 * Enter (3/7) subject: The Saviour
 * Enter (4/7) subject: The Son of God
 * Enter (5/7) subject: Jesus
 * Enter (6/7) subject: Emmanuel
 * Enter (7/7) subject: Christ
 * Enter 3 verb words:
 * Enter (1/3) subject: loves
 * Enter (2/3) subject: accepts
 * Enter (3/3) subject: saves
 * Enter 7 object words:
 * Enter (1/7) object: you.
 * Enter (2/7) object: you and your family
 * Enter (3/7) object: all human.
 * Enter (4/7) object: you inspite of your bad moods.
 * Enter (5/7) object: your enemies
 * Enter (6/7) object: the earth
 * Enter (7/7) object: human race
 *
 * Do you like to see a sentence? yes
 *
 * Christ accepts all human.
 * ------------------------------------
 * Words you inserted are:
 * Subject words: [God, The Lord, The Saviour, The Son of God, Jesus, Emmanuel, Christ]
 * Verb words: [loves, accepts, saves]
 * Object words: [you., you and your family, all human., you inspite of your bad moods., your enemies, the earth, human race]
 * Thank you!
 *
 * * * * * * * * * * * * * * * * *       TEST DATA - 2    * * * * * * * * * * * * * * * * * * *
 *
 * Enter 10 subject words:
 * Enter (1/10) subject: Every one of us
 * Enter (2/10) subject: Human race
 * Enter (3/10) subject: Nature
 * Enter (4/10) subject: Americans
 * Enter (5/10) subject: Human Being
 * Enter (6/10) subject: Students
 * Enter (7/10) subject: Employees
 * Enter (8/10) subject: Private Sectors
 * Enter (9/10) subject: Owners
 * Enter (10/10) subject: Professionals
 * Enter 9 verb words:
 * Enter (1/9) subject: love
 * Enter (2/9) subject: like
 * Enter (3/9) subject: prefer
 * Enter (4/9) subject: choose
 * Enter (5/9) subject: go for
 * Enter (6/9) subject: select
 * Enter (7/9) subject: want
 * Enter (8/9) subject: need
 * Enter (9/9) subject: hesitate
 * Enter 6 object words:
 * Enter (1/6) object: promotion
 * Enter (2/6) object: self esteem
 * Enter (3/6) object: to be motivated
 * Enter (4/6) object: to be rewarded
 * Enter (5/6) object: to be accepted
 * Enter (6/6) object: to be loved
 *
 * Do you like to see a sentence? yes
 *
 * Employees select to be motivated
 * --------------------------
 * Words you inserted are:
 * -------------------------
 * Subject words: [Every one of us, Human race, Nature, Americans, Human Being, Students, Employees, Private Sectors, Owners, Professionals]
 * Verb words: [love, like, prefer, choose, go for, select, want, need, hesitate]
 * Object words: [promotion, self esteem, to be motivated, to be rewarded, to be accepted, to be loved]
 * Thank you!
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomItemFromArrayList {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rnd = new Random();

        String input;
        boolean cont = true;
        int high = 11;
        int low = 3;

        // create three arraylists
        ArrayList<String> subjects = new ArrayList<>();
        ArrayList<String> verbs = new ArrayList<>();
        ArrayList<String> objects = new ArrayList<>();

        // generate random number to decide how many words user to insert
        // this generates int numbers b/n 3 and 10 (for high is not inclusive)
        int num_subjects = low + rnd.nextInt(high - low);
        int num_verbs = low + rnd.nextInt(high - low);
        int num_objects = low + rnd.nextInt(high - low);

        // prompt user to enter words
        while (cont == true) {
            // prompt user to enter subjects
            System.out.println("Enter " + num_subjects + " subject words: ");
            for (int i = 0; i < num_subjects; i++) {
                System.out.printf("Enter (%d/%d) subject: ", (i + 1), num_subjects);
                input = keyboard.nextLine();
                subjects.add(input);
            }   // end of for loop for subjects

            // prompt user to enter verbs
            System.out.println("Enter " + num_verbs + " verb words: ");
            for (int i = 0; i < num_verbs; i++) {
                System.out.printf("Enter (%d/%d) subject: ", (i + 1), num_verbs);
                input = keyboard.nextLine();
                verbs.add(input);
            }   // end of for loop for verbs

            // prompt user to enter verbs
            System.out.println("Enter " + num_objects + " object words: ");
            for (int i = 0; i < num_objects; i++) {
                System.out.printf("Enter (%d/%d) object: ", (i + 1), num_objects);
                input = keyboard.nextLine();
                objects.add(input);
            }   // end of for loop for verbs

            high = num_subjects;
            low = 0;
            // generate numbers to select words from each arraylist
            num_subjects = low + rnd.nextInt(high - low);

            high = num_verbs;
            num_verbs = low + rnd.nextInt(high - low);

            high = num_objects;
            num_objects = low + rnd.nextInt(high - low);

            // prompt if user wants to see a sentence
            System.out.print("\nDo you like to see a sentence? ");
            input = keyboard.nextLine();

            if (input.equalsIgnoreCase("yes")) {

                //print a random sentence
                System.out.println();
                System.out.println(subjects.get(num_subjects) + " " + verbs.get(num_verbs) + " " + objects.get(num_objects));
                // output text formating
                for(int i = 0; i < (num_subjects + num_verbs + num_objects ); i++){
                    System.out.print("--");
                }

                //print list all array of words entered
                System.out.println("\nWords you inserted are: ");
                System.out.println("-------------------------");
                System.out.println("Subject words: " + subjects);
                System.out.println("Verb words: " + verbs);
                System.out.println("Object words: " + objects);
                System.out.println("Thank you!");

                // control to get out of the while loop
                cont = false;

            } else {
                cont = false;
                return;
            }
        }   // end of while loop
        keyboard.close();

    }   // end of main() method
}   // end of class