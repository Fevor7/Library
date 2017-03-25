package by.htp.library.domain;

import by.htp.library.domain.PrintedEdition;
import java.util.Scanner;
import by.htp.library.domain.OutInput;

public class Work {

	public static int searchAutor (PrintedEdition lib[], String autor){
		int res=0;
		for (int i=0; i<lib.length; i++ ){
			if (autor.equals(lib[i].getAutor())) { OutInput.prnt2(lib[i]); res++;}
		}
		return res;
	}
	public static int searchAutor2 (PrintedEdition lib[], String naz){
		int res=-1;
		for (int i=0; i<lib.length; i++ ){
			if (naz.equals(lib[i].getTitle())) res=i;
		}
		return res;
	}
	
	public static PrintedEdition[] dBook (PrintedEdition lib[], int k){
		int n;
		n=lib.length;
		PrintedEdition lib2[] = new Book[n-1];
		for (int i=0; i<(n-1); i++)
		{
			if (i<k)  lib2[i] = lib[i];
			else lib2[i]=lib[i+1];
		}

		return lib2;
	}
	public static PrintedEdition[] stlBook(PrintedEdition lib[])
    {
		int n=lib.length;
		PrintedEdition lib2[]= new Book[n];
		for (int i=0; i<n;i++)
			for (int j=0; j<(n-1);j++)
				if (lib[j].getGod()>lib[j+1].getGod()) {lib2[j]=lib[j]; lib[j]=lib[j+1]; lib[j+1]=lib2[j]; }
				
    	return lib;
    }
	
	public static String [] mas(String  mas, String [] ms )
	{    int n;
	 	n=ms.length;
		String [] ms2 = new String[n];
		ms2[n-1]=mas;
		
		return ms2;
	}
	

	public static int searchAutor3 (String [] autor, PrintedEdition lib[])
	{
		int res=-1, n=0;
		String ms[] = new String[1];
		/*for (int g=0; g<lib.length; g++ )
		for (int h=0; h<lib.length; h++ )*/
		for (int i=0; i<lib.length; i++ ){
			
			if (autor[i].equals(lib[i].getAutor())) { 
				res=i; n++; 
				if (n==1) ms[0]=lib[i].getAutor();
				else  ms=mas(lib[i].getAutor(),ms); 
				
				}
		}
		if (n>0) OutInput.prntMas(lib,ms) ;
		return res;
	}
}
