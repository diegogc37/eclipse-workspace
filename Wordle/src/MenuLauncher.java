import programacion.wordle.Wordle;
import java.util.Scanner;

public class MenuLauncher {
	
	public MenuLauncher() {
		menu();
	}
	
	public void menu(){
		Scanner t = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("Introduce una opcion: ");
			System.out.println("\t 1) Wordle.");
			System.out.println("***");
			System.out.println("\t 0) Salir.");
			opcion = t.nextInt();
			System.out.println("---------------------------------------------------------------------");
			switch(opcion) {
			case 1:
				Wordle w=new Wordle("avion");
				break;
			case 0:
				System.out.println("Apagando el sistema....3...2...1...");
				break;
			default:
				break;
			}
			
		}while(opcion!=0);
		t.close();
	}
	
	public static void main(String[] args) {
		MenuLauncher menu = new MenuLauncher();
	}

}
