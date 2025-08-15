package notesApp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		NotesManager notesManager=new NotesManager("notes.txt");
		int choice;
		
		while(true)
		{
			System.out.println("---Notes Manager---");
            System.out.println("1.Add Note   \n2.View Notes   \n3.Exit");
            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();
            scanner.nextLine();
            
            switch(choice) 
            {
               case 1:
            	   System.out.print("Enter your note: ");
                   String note = scanner.nextLine();
                   notesManager.addNote(note);
                   break;
               case 2:
                   notesManager.viewNotes();
                   break;
               case 3:
                   System.out.println("End of the Program...Thank You!!!");
                   System.exit(0);
               default:
				   System.out.println("Invalid choice!Enter the Valid choice"); 	    	      	             	
            }
		}
		
	}

}
