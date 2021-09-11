
package midterm2;

import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Assignment: Midterm-2
 * program:    Exercise-1
 * Created:    Jul 18, 2017
 * Author:     Tenzin
 */
public class Exercise1 {

	public static void main(String[] args) throws MidiUnavailableException {
		
//		List<Character> list = new ArrayList<>();
//		additionToList(list); //Addition of elements.
//		
//		char item = '&';
//		itemsCheck(list, item);//Checks if the element is a part of list or not
//		isLetter(list);//Checks if it is letter.
//		
//		for(int i = 0; i < list.size();i ++)
//			list.set(i, 'x');
//		System.out.println("\nModified \"x\" List: " + list.toString());
		
		
	}

	private static void isLetter(List<Character> list) {
		for (Character e : list){
			if (e.isLetter(e)){
			    System.out.print("true ");
			}
			else{
			    System.out.print("false ");
			}
		}
	}

	private static void itemsCheck(List<Character> list, char item) {
		if (list.contains(item)) {
		    System.out.println("The element " + item + "is part of the list");
		} else {
			System.out.println("The element " + item + "is not a part of the list");
		}
		
		Collections.swap(list, 1, list.size() - 1);
		System.out.println("Modified List: " + list.toString());
	}

	private static void additionToList(List<Character> list) {
		list.add('a');
		list.add('@');
		list.add('b');
		list.add('c');
		list.add('#');
		list.add('$');
	}	
}