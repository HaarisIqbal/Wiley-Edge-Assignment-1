# Wiley Edge Assignment 1

Trainee: Haaris Iqbal

Date: November 2022

This submission is an InteilliJ project, containing four Java files, a flowchat and this readme file.

Below is some information on the Java files. All Java files contain javadoc, and are compliant with Google Checkstyle.

## RockPaperScissors.java

This file contains the lengthiest amount of code. There is a single main method, and the program is primarily encompassed in a "while" loop which will allow the program to be run multiple times until the user requests the program to end. The program features basic error handling in the form of guard clauses, that will check integer inputs before proceeding into further sections. 

The outcome of the Rock-Paper-Scissors match is handled by a "for" loop within the "while" loop. This "for" loop has a switch statement, which itself contains three switch statements (roughtly following the potential paths outlines in the flowchart provided.)

Rather than multiple variables, a HashMap is used throughout the program to keep track of rounds played, wins, losses, and draws. This information is then presented to the users and processed to determine the overall winner.

Possible improvement: The amount of code contained in the "main" method is lenghty to a point where it can be difficult to read. This could be broken into chunks, in which some of the important processes of the program (for example, determining outcome) could be placed into their own methods.

## DogGenetics.java

This file contains a single "main" method in which Java Random is used to generate a fake report on a dog. The tricky aspect of this program is getting the random numbers to add to a total of 100(%). Here, this is achieved by maintaining a remainder varible so that random numbers that do not exceed the remainder are added to the report, and random numbers that do are treated as a 0.

The final column of the report simply takes whatever remainer is left rather than attempting to generate more random numbers. Thus, all numbers in the report add up to 100(%).

## HealthyHearts.java

This file contains a single "main" method in which heart range values are calculated based on a given age. To calculate lower range and upper range, the numbers are treated as doubles during calculation. They are then rounded up from their decmial using Java Math, and finally they are converted to an integer using an int case so that they can be presented neatly in the outout.

## SummativeSums.java

This file contains two methods. The "main" method initializes example (integer array) data and calls "arraySum()", printing its returned values.

The "arraySum" method contains the processing of the program, and iterates through the given one-dimensional array to calculate the total sum of all its values. This sum is returned as an integer.