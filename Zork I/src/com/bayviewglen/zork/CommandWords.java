package com.bayviewglen.zork;

/*
 * Author:  Michael Kolling.
 * Version: 1.0
 * Date:    July 1999
 * 
 * This class holds an enumeration of all command words known to the game.
 * It is used to recognize commands as they are typed in.
 *
 * This class is part of the "Zork" game.
 */

class CommandWords {
	// a constant array that holds all valid command words
	private static final String validCommands[] = { "listen", "write", "kill", "use", "read", "take", "seize",
			"examine", "look", "watch", "unlock", "open", "give", "hand", "drop", "put down", "leave", "quit", "finish",
			"retire", "help", "eat", "consume", "activate" };

	/**
	 * Constructor - initialize the command words.
	 */
	public CommandWords() {
		// nothing to do at the moment...
	}

	/**
	 * Check whether a given String is a valid command word. Return true if it is,
	 * false if it isn't.
	 **/
	public boolean isCommand(String aString) {
		for (int i = 0; i < validCommands.length; i++) {
			if (validCommands[i].equals(aString))
				return true;
		}
		// if we get here, the string was not found in the commands...
		return false;
	}

	/*
	 * Print all valid commands to System.out.
	 */
	public void showAll() {
		for (int i = 0; i < validCommands.length; i++) {
			// System.out.print(validCommands[i] + ", ");
			Zork.print(validCommands[i] + ", ", 75);
			if (i % 5 == 0 && i != 0) {
				System.out.println("");
			}
		}
	}
}
