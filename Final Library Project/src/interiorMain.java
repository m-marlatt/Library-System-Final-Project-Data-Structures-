import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;


public class interiorMain {
	
	public static void taskMenu() {
		
		System.out.println("Welcome to the Public Library system. \n");
		System.out.println("What would you like to do today? \n");
		System.out.println("1.   Check a book out. \n");
		System.out.println("2.   Check a book in. \n");
		System.out.println("3.   Check the status of a Patron. \n");
		System.out.println("4.   Search for a book. \n");
		System.out.println("5.   Display books in currently checked out. \n");
		System.out.println("6.   Display books currently on the shelves. \n");
		System.out.println("7.   Check the genre dictionary. \n");
		System.out.println("8.   Add a new book to library. \n");
		System.out.println("9.   Exit. \n");
	}
	public static void bookMenu() {
		
		System.out.println("Please choose which book to check out by number. \n");
		System.out.println("1. Dust in the Desert. \n");
		System.out.println("2. Eragon. \n");
		System.out.println("3. JFK the Facts. \n");
		System.out.println("4. Life in The Congo. \n");
		System.out.println("5. The Nuremburg Trials. \n");
		System.out.println("6. The Odyssey. \n");
		System.out.println("7. Life In Feudal Japan. \n");
		System.out.println("8. Teddy Roosevelt. \n");
		System.out.println("9. Spice and Wolf. \n");
		System.out.println("10. Lonesome Dove. \n");
		System.out.println("11. The Battle of Troy. \n");
		System.out.println("12. Beowulf. \n");
		System.out.println("13. A Child Called It. \n");
		System.out.println("14. Shepard's Warning. \n");
		System.out.println("15. One of Us. \n");
	}
	
	public static void main(String[] arg) throws FileNotFoundException {
		//Keyboard Scanner
		Scanner keyboard = new Scanner(System.in);
		
		class circBk {
			// Class for  books
				String Name;
				String Genre;
				char truVar;
		
		public circBk(String Name, String Genre, char truVar) {
			super();
			this.Name = Name;
			this.Genre = Genre;
			this.truVar = truVar;
			}
		
		public String toString() {
			return "["  + this.Name + " => "
	 + this.Genre + " => " + this.truVar + "]";
			}
		}

// Creating Data Structure
	// Beginning Dictionary
		
			Hashtable<String,String> dictionary = new Hashtable<String,String>();
		
			File fr = new File("/Users/perplexedozzy/Desktop/dictionary.txt");
			
			Scanner inputFile = new Scanner(fr);
		
	
	//Book Lists
	
		
			LinkedList<circBk> onShelf = new LinkedList<circBk>();
			
			LinkedList<circBk> chkOut = new LinkedList<circBk>();
		
	//Patron class
		// Search do like menu choice more than 10 late display patrons who fit	
		// Display books they have
			class libnerd{
				public libnerd(String Name, String bkOut, int dayLate, int Owes) {
			
		}
				String Name;
				String bkOut;
				int dayLate;
				int Owes;
			}
			
			
			
	//Patron Variables
			
			libnerd patron1 = new libnerd("Mark News","Lonesome Dove", 0, 0);
			libnerd patron2 = new libnerd("Mark Blues", "One of Us", 30, 60);
			libnerd patron3 = new libnerd("Mark Rues", "Beowulf", 55, 110);
			libnerd patron4 = new libnerd("Mark Hews", "Teddy Roosevelt", 23, 46);
			libnerd patron5 = new libnerd("Mark Sues", "Spice and Wolf", 8, 16);
			libnerd patron6 = new libnerd("Mark Mews", "A Child Called It", 2, 4);
			libnerd patron7 = new libnerd("Mark Queues", "Shepard's Warning", 1, 2);
			libnerd patron8 = new libnerd("Mark Skews", "The Battle of Troy", 0, 0);

	// Patron Array
			libnerd Array[] = new libnerd[8];
			
			
			//Go through array
			for(int i=0; i<Array.length;i++) {
				
				//Random Fill
				Array[0] = patron1;
				Array[1] = patron2;
				Array[2] = patron3;
				Array[3] = patron4;
				Array[4] = patron5;
				Array[5] = patron6;
				Array[6] = patron7;
				Array[7] = patron8;
			}
				
		
			
	//Book Variables
		
		
			onShelf.add(new circBk("Dust in the Desert", "HF", 'F'));
			onShelf.add(new circBk("Eragon", "FA", 'F'));
			onShelf.add(new circBk("JFK the Facts", "BO",'T'));
			onShelf.add(new circBk("Life in The Congo","WT",'T'));
			onShelf.add(new circBk("The Nuremburg Trials", "HY", 'T'));
			onShelf.add(new circBk("The Odyssey", "GC", 'F'));
			onShelf.add(new circBk("Life In Feudal Japan", "HY", 'T'));
			chkOut.add(new circBk("Teddy Roosevelt", "BO", 'T'));
			chkOut.add(new circBk("Spice and Wolf", "RM", 'F'));
			chkOut.add(new circBk("Lonesome Dove", "WS", 'F'));
			chkOut.add(new circBk("The Battle of Troy", "GC", 'F'));
			chkOut.add(new circBk("Beowulf", "CC", 'F'));
			chkOut.add(new circBk("A Child Called It", "BO", 'T'));
			chkOut.add(new circBk("Shepard's Warning", "HR", 'F'));
			chkOut.add(new circBk("One of Us", "HF", 'F'));
			
			circBk book1 = new circBk("Dust in the Desert", "HF", 'F');
			circBk book2 = new circBk("Eragon", "FA", 'F');
			circBk book3 = new circBk("JFK the Facts", "BO",'T');
			circBk book4 = new circBk("Life in The Congo","WT",'T');
			circBk book5 = new circBk("The Nuremburg Trials", "HY", 'T');
			circBk book6 = new circBk("The Odyssey", "GC", 'F');
			circBk book7 = new circBk("Life In Feudal Japan", "HY", 'T');
			circBk book8 = new circBk("Teddy Roosevelt", "BO", 'T');
			circBk book9 = new circBk("Spice and Wolf", "RM", 'F');
			circBk book10 = new circBk("Lonesome Dove", "WS", 'F');
			circBk book11 = new circBk("The Battle of Troy", "GC", 'F');
			circBk book12 = new circBk("Beowulf", "CC", 'F');
			circBk book13 = new circBk("A Child Called It", "BO", 'T');
			circBk book14 = new circBk("Shepard's Warning", "HR", 'F');
			circBk book15 = new circBk("One of Us", "HF", 'F');
		
	
	//Menu scanner variables
			
		int menuChoice = 0;
		int bookChoice = 0;
		
		
		
	// Task Menu
	
		taskMenu();
		
		menuChoice = keyboard.nextInt();
		
		if(menuChoice <=2) {
			
			bookMenu();

		}
		
		
	switch(menuChoice) {
	
	//Switch book from shelf to out
	case 1:
	bookChoice = keyboard.nextInt();
		
		if(bookChoice >=8) {
			System.out.println("Book is already checked out. \n");
		}
		
		else {
		
		switch(bookChoice) {
		
		case 1:
			System.out.println("Checking out Dust in the Desert. \n");
			
			onShelf.remove(book1);
			chkOut.add(book1);
			
			System.out.println(chkOut);
			
			break;
		
		case 2:
			System.out.println("Checking out Eragon. \n");
			
			onShelf.remove(book2);
			chkOut.add(book2);
			
			System.out.println(chkOut);
			
			break;
			
		case 3:
			System.out.println("Checking out JFK the Facts. \n");
			
			onShelf.remove(book3);
			chkOut.add(book3);
			
			System.out.println(chkOut);
			
			break;
			
		case 4:
			System.out.println("Checking out Life in the Congo. \n");
			
			onShelf.remove(book4);
			chkOut.add(book4);
			
			System.out.println(chkOut);
			
			break;
			
		case 5:
			System.out.println("Checking out The Nuremberg Trials. \n");
			
			onShelf.remove(book5);
			chkOut.add(book5);
			
			System.out.println(chkOut);
			
			break;
			
		case 6:
			System.out.println("Checking out The Odyssey. \n");
			
			onShelf.remove(book6);
			chkOut.add(book6);
			
			System.out.println(chkOut);
			
			break;
			
		case 7:
			System.out.println("Checking out Life in Feudal Japan. \n");
			
			onShelf.remove(book7);
			chkOut.add(book7);
			
			System.out.println(chkOut);
			
			break;
			
			
		}
	}
	
	case 2:
	{
		bookChoice = keyboard.nextInt();
		
		if(bookChoice <=7) {
			System.out.println("Book is already checked in. \n");
		}
		
		else {
			
		
			switch(bookChoice) {
			
			case 8:
				System.out.println("Checking in Teddy Roosevelt. \n");
				
				onShelf.add(book8);
				chkOut.remove(book8);
				
				System.out.println(onShelf);
				
				break;
			
			case 9:
				System.out.println("Checking in Spice and Wolf. \n");
				
				onShelf.add(book9);
				chkOut.remove(book9);
				
				System.out.println(onShelf);
				
				break;
				
			case 10:
				System.out.println("Checking in Lonesome Dove. \n");
				
				onShelf.add(book10);
				chkOut.remove(book10);
				
				System.out.println(onShelf);
				
				break;
				
			case 11:
				System.out.println("Checking in The Battle of Troy. \n");
				
				onShelf.add(book11);
				chkOut.remove(book11);
				
				System.out.println(onShelf);
				
				break;
				
			case 12:
				System.out.println("Checking in Beowulf. \n");
				
				onShelf.add(book12);
				chkOut.remove(book12);
				
				System.out.println(onShelf);
				
				break;
				
			case 13:
				System.out.println("Checking in A Child Called It. \n");
				
				onShelf.add(book13);
				chkOut.remove(book13);
				
				System.out.println(onShelf);
				
				break;
				
			case 14:
				System.out.println("Checking in Shepard's Warning. \n");
				
				onShelf.add(book14);
				chkOut.remove(book14);
				
				System.out.println(onShelf);
				
				break;
			
			case 15:
				System.out.println("Checking in One of Us. /n");
				
				onShelf.remove(book15);
				chkOut.add(book15);
				
				System.out.println(onShelf);
				
				break;
			}
		}
		
		
	}
		
	
		
	case 3:
		
		System.out.println("Here is the current list of patrons available. *Due to current COVID-19 restrictions all patrons are allowed one book out. /n" );
		
		for (libnerd patron : Array) {
			System.out.println(patron);
		}
		
		break;
		
	case 4:
		
		System.out.println("Please input name of book");
		
		String bkName = keyboard.toString();
		
		if (bkName == "Dust in the Desert") {
		//	System.out.println(onShelf.search("Dust in the Desert"));
		} else {
			System.out.println("Book not found");
		}
		// Ask brad about .search method for searching

		if (bkName == "Eragon") {
		//	System.out.println(onShelf.search("Eragon"));
		} else {
			System.out.println("Book not found");
		}

		if (bkName == "JFK the Facts") {
		//	System.out.println(onShelf.search("JFK the Facts"));
		} else {
			System.out.println("Book not found");
		}

		if (bkName == "Life in the Congo") {
		//	System.out.println(onShelf.search("Life in the Congo"));
		} else {
			System.out.println("Book not found");
		}

		if (bkName == "The Nuremberg Trials") {
		//	System.out.println(onShelf.search("The Nuremberg Trials"));
		} else {
			System.out.println("Book not found");
		}

		if (bkName == "The Odyssey") {
		//	System.out.println(onShelf.search("The Odyssey"));
		} else {
			System.out.println("Book not found");
		}
		

		
		break;
		
	case 5:
		
		// View Checked Out books
		for(circBk outbook : chkOut)
		System.out.print(outbook);
		
		break;
		
	case 6:
		
		// View on Shelf books
		for(circBk book : onShelf)
            System.out.println( book);
		
		break;
	
	case 7:
		// Dictionary
		System.out.println("Please input the genre you are searching for. \n");
		
		System.out.println(dictionary.get(keyboard.next()));
		
		while (inputFile.hasNext()) {
			dictionary.put(inputFile.next(), inputFile.next());
		}
		
		break;
	
	case 8:
		//Add new book to library
		
		System.out.println("Please input the new book's information (Name, Genre, T or F (non-fiction or fiction)).");
		
				String Name = keyboard.toString();
				String Genre = keyboard.toString();
				char truVar = keyboard.next().charAt(0);
				
				
				
				onShelf.add(new circBk(Name, Genre, truVar));
			
				
			//Prints weird shit	
		for(circBk newBook : onShelf)
		System.out.println(newBook);
		
		break;
}
		
		
		inputFile.close();
		keyboard.close();
	}
}
