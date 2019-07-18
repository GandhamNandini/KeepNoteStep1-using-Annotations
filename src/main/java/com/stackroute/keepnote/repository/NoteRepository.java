package com.stackroute.keepnote.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.stackroute.keepnote.model.Note;

/*
 * This class contains the code for data storage interactions and methods 
 * of this class will be used by other parts of the applications such
 * as Controllers and Test Cases
 * */

public class NoteRepository {

	/* Declare a variable called "list" to store all the notes. */
	private ArrayList<Note> list = new ArrayList<Note>();

	public NoteRepository() {
		ArrayList<Note> list;
		/* Initialize the variable using proper data type */
	}

	public ArrayList<Note> getList() {
		return list;
	}

	public void setList(ArrayList<Note> list) {
		this.list = list;
	}



	/* This method should return all the notes in the list */



	/* This method should set the list variable with new list of notes */



	/*
	 * This method should Note object as argument and add the new note object into
	 * list
	 */

	public void addNote(Note note) {
		list.add(note);

	}

	/* This method should deleted a specified note from the list */

	public boolean deleteNote(int noteId) {
		/* Use list iterator to find matching note id and remove it from the list */
		boolean result = false;
		int count = 0;
		for (Note note : list) {
			int noteID = note.getNoteId();
			if (noteID == noteId) {
				list.remove(count);
				result = true;
				break;
			} else {
				result = false;
				count++;
			}
		}

		return result;

	}
	/* This method should return the list of notes */

	public ArrayList<Note> getAllNotes() {
		return list;
	}

	/*
	 * This method should check if the matching note id present in the list or not.
	 * Return true if note id exists in the list or return false if note id does not
	 * exists in the list
	 */

	public boolean exists(int noteId) {
		boolean result = false;
		for (Note note : list) {
			int noteID = note.getNoteId();
			if (noteID == noteId) {
				result = true;
				break;
			} else {
				result = false;
			}
		}

		return result;

	}

}