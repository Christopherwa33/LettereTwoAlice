package main;

import java.util.Scanner;

public class CaratteriRipetuti {

	public static void main(String[] args) {
		// Far inserire una parola/frase all'utente,
		// stampare i caratteri che si ripetono all’interno:
		// Esempio: casa ----> La lettera/carattere che si ripete è la a.
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci una parola/frase e ti dirò se ci sono lettere ripetute");
		String parola = tastiera.nextLine();
		char [] vettoreDiChar = parola.toCharArray();
		String ris = "";
		
		for(int i = 0; i < vettoreDiChar.length-1; i++)
			for(int j = vettoreDiChar.length-1; j > i; j--)
				if(vettoreDiChar[i] == vettoreDiChar[j] && vettoreDiChar[i] != ' ' && !ris.contains(vettoreDiChar[i]+", "))
					ris += vettoreDiChar[i] + ", ";
		
		System.out.println(ris.isEmpty()			                  					  ?
							"Non c'è nessun carattere che si ripete"  					  :
							"Carattere/i ripetuto/i: " + ris.substring(0, ris.length()-2));
		// Il substring crea una sottostringa e come parametri vuole un indice di partenza e un indice di chiusura
		
		tastiera.close();
	}

}
