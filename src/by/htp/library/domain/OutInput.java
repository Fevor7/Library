package by.htp.library.domain;
import java.util.Scanner;
import by.htp.library.domain.Book;
import by.htp.library.domain.PrintedEdition;
import by.htp.library.domain.Work;
public class OutInput {
	
	public static int inN(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¬ведите колличество книг в библиотеке");
		return sc.nextInt();
	}
	public static PrintedEdition[] inBook (int n){
		String naz,au;
		int g;
		PrintedEdition lib[] = new Book[n];
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		for (int i = 0; i<n; i++)
		{
			lib[i] = new Book();
			System.out.println("¬ведите название "+(i+1)+" книги");
			naz=sc2.nextLine();
			lib[i].setTitle(naz); 
			System.out.println("¬ведите автора "+(i+1)+" книги");
			au=sc2.nextLine();
			lib[i].setAutor(au);
			System.out.println("¬ведите год выпуска "+(i+1)+" книги");
			g=sc.nextInt();
			lib[i].setGod(g);
		}
		return lib;
	}
	public static void prnt (PrintedEdition lib[]){
		for (int i = 0; i<lib.length; i++)
			System.out.print ((i+1)+". "+lib[i].getTitle()+" "+ lib[i].getAutor()+" "+lib[i].getGod()+"\n");
	}
	public static void prnt2 (PrintedEdition lib){
		
			System.out.print (lib.getTitle()+" "+ lib.getAutor()+" "+lib.getGod()+"\n");
	}
    public static int prntMenu()
    {   
    	Scanner sc = new Scanner(System.in);
    	System.out.println("1: поиск по автору ");
    	System.out.println("2: добавлени€ книги ");
    	System.out.println("3: удалени€ книги по названию ");
    	System.out.println("4: сортировки книг по году издани€ ");
    	System.out.println("5: ѕросмотреть список всех книг ");
    	System.out.println("6: выход ");
    	return sc.nextInt();
    }
    
    public static void searchAutor (PrintedEdition lib[]){
		int  res=0;
		String autor;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите автора дл€ поиска:"); 
		autor=sc.nextLine(); 
		System.out.println("–еультаты поиска:"); 
		res=Work.searchAutor(lib,autor);
		if (res ==0 ) System.out.println(" нига с таким автором не найдена");
		System.out.println(" "); 
	}
    public static void searchAutor3 (PrintedEdition lib[]){
		int  n, res=0;
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("¬ведите колличество авторов дл€ поиска:");
		n=sc.nextInt();
		String [] autor = new String[n];
		for (int i =0; i<n; i++){ System.out.println("¬ведите " + (i+1)+" автора дл€ поиска:"); 
			autor[i]=sc2.nextLine();
		}
		res=Work.searchAutor3(autor,lib);
		if (res ==0 ) System.out.println(" нига с таким автором не найдена");
		System.out.println(" "); 
	}
    public static PrintedEdition[] addBook (PrintedEdition lib[]){
		String naz,au;
		int g;
		int n;
		n=lib.length;
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		PrintedEdition lib2[] = new Book[n+1];
		for (int i=0; i<n; i++)
		{
			lib2[i] = lib[i];
		}
			lib2[n] = new Book();
			System.out.println("¬ведите название книги");
			naz=sc2.nextLine();
			lib2[n].setTitle(naz); 
			System.out.println("¬ведите автора книги");
			au=sc2.nextLine();
			lib2[n].setAutor(au);
			System.out.println("¬ведите год выпуска  книги");
			g=sc.nextInt();
			lib2[n].setGod(g);
		return lib2;
	}
    
    public static PrintedEdition[] delBook (PrintedEdition lib[]){
    	int n,k;
		n=lib.length;
		Scanner sc = new Scanner(System.in);
		PrintedEdition lib2[] = new Book[n];
		for (int i=0; i<n; i++)
		{
			lib2[i] = lib[i];
		}
			System.out.println("¬ведите название книги");
			k=Work.searchAutor2(lib,sc.nextLine());
			if (k==-1){ System.out.println (" нига не найдена!");lib2=lib; } 
			else {
				lib2=Work.dBook(lib,k);
				System.out.println(" нига удалена");
		
			}
			
             
		return lib2;
	}
    
    public static PrintedEdition[] sortlBook(PrintedEdition lib[])
    {
    	lib = Work.stlBook(lib);
    	System.out.println("Ѕиблиотека отсортирована по году издани€");
    	return lib;
    }

    public static void  prntMas (PrintedEdition lib[], String [] ms)
    {
    	int n = ms.length;
    	System.out.println("Ќайдено "+n+" книг");
    	for (int i=0; i<n; i++)
    	System.out.print ((i+1)+". "+lib[i].getTitle()+" "+ lib[i].getAutor()+" "+lib[i].getGod()+"\n");
    	
    }
}
