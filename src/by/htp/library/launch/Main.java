package by.htp.library.launch;

import by.htp.library.domain.Book;
import by.htp.library.domain.Magazine;
import by.htp.library.domain.PrintedEdition;
import by.htp.library.domain.OutInput;

public class Main {
 
	public static void main(String[] args) {
		 int n;
		 int a=0;
		n=OutInput.inN();
		PrintedEdition lib[] = new Book[n];
			lib=OutInput.inBook(n);
		OutInput.prnt(lib);
		do {
			switch (OutInput.prntMenu()){
			case  1: { OutInput.searchAutor3(lib); break; } 
			case  2: { lib=OutInput.addBook(lib); break; } 
			case  3: { lib=OutInput.delBook(lib); break; } 
			case  4: { lib=OutInput.sortlBook(lib); break;}
			case  5: { OutInput.prnt(lib); break; }
			case  6: { a=1;  break;} 
			}
			
		} while (a==0);
		System.out.println("Программа завершена!!!");
		/*Book book = new Book();
		book.setPrice(15.3);
		book.setTitle("First Book");
		
		Book book2 = new Book(18.6, "Second book");
		System.out.println("Book1: price= " + book.getPrice()
		+ " " + "title= " + book.getTitle());
		
		System.out.println("Book2: price= " + book2.getPrice()
		+ " " + "title= " + book2.getTitle());
		
	
		Magazine magazine = new Magazine();
		//magazine.
		magazine.setPrice(10);
		magazine.setTitle("Cool magazine");
		
		PrintedEdition printEdition = new Book();
		//printEdition.
	
		
		PrintedEdition prints[] = new PrintedEdition[10];
		prints[0] = book;
		prints[1] = book2;
		prints[2] = magazine;
		
		for(int i =0; i<3; i++){
			System.out.println(prints[i].printFormat());
		}
			Book lib[] = new Book[10];
		 lib[0] = new Book();
	    double dd;
	    dd=27.2;
	    lib[0].setPrice(dd);
	    System.out.println(lib[0].getPrice());*/

	}

}
