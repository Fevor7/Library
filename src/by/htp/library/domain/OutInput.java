package by.htp.library.domain;
import java.util.Scanner;
import by.htp.library.domain.Book;
import by.htp.library.domain.PrintedEdition;
import by.htp.library.domain.Work;
public class OutInput {
	
	public static int inN(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ����������� ���� � ����������");
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
			System.out.println("������� �������� "+(i+1)+" �����");
			naz=sc2.nextLine();
			lib[i].setTitle(naz); 
			System.out.println("������� ������ "+(i+1)+" �����");
			au=sc2.nextLine();
			lib[i].setAutor(au);
			System.out.println("������� ��� ������� "+(i+1)+" �����");
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
    	System.out.println("1: ����� �� ������ ");
    	System.out.println("2: ���������� ����� ");
    	System.out.println("3: �������� ����� �� �������� ");
    	System.out.println("4: ���������� ���� �� ���� ������� ");
    	System.out.println("5: ����������� ������ ���� ���� ");
    	System.out.println("6: ����� ");
    	return sc.nextInt();
    }
    
    public static void searchAutor (PrintedEdition lib[]){
		int  res=0;
		String autor;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ ��� ������:"); 
		autor=sc.nextLine(); 
		System.out.println("��������� ������:"); 
		res=Work.searchAutor(lib,autor);
		if (res ==0 ) System.out.println("����� � ����� ������� �� �������");
		System.out.println(" "); 
	}
    public static void searchAutor3 (PrintedEdition lib[]){
		int  n, res=0;
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("������� ����������� ������� ��� ������:");
		n=sc.nextInt();
		String [] autor = new String[n];
		for (int i =0; i<n; i++){ System.out.println("������� " + (i+1)+" ������ ��� ������:"); 
			autor[i]=sc2.nextLine();
		}
		res=Work.searchAutor3(autor,lib);
		if (res ==0 ) System.out.println("����� � ����� ������� �� �������");
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
			System.out.println("������� �������� �����");
			naz=sc2.nextLine();
			lib2[n].setTitle(naz); 
			System.out.println("������� ������ �����");
			au=sc2.nextLine();
			lib2[n].setAutor(au);
			System.out.println("������� ��� �������  �����");
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
			System.out.println("������� �������� �����");
			k=Work.searchAutor2(lib,sc.nextLine());
			if (k==-1){ System.out.println ("����� �� �������!");lib2=lib; } 
			else {
				lib2=Work.dBook(lib,k);
				System.out.println("����� �������");
		
			}
			
             
		return lib2;
	}
    
    public static PrintedEdition[] sortlBook(PrintedEdition lib[])
    {
    	lib = Work.stlBook(lib);
    	System.out.println("���������� ������������� �� ���� �������");
    	return lib;
    }

    public static void  prntMas (PrintedEdition lib[], String [] ms)
    {
    	int n = ms.length;
    	System.out.println("������� "+n+" ����");
    	for (int i=0; i<n; i++)
    	System.out.print ((i+1)+". "+lib[i].getTitle()+" "+ lib[i].getAutor()+" "+lib[i].getGod()+"\n");
    	
    }
}
