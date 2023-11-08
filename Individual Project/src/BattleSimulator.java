import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class BattleSimulator
	{

		public static int pokemonChoiceVar;
		
		public static void main(String[] args)
			{
				

				pokemonChoice();
				setPokemon();
			
			}
		
	
		
		public static void pokemonChoice()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello and welcome to the Java Pokemon Battle Simulator! \nNow please select the Pokemon you wish to play with: Bulbasaur(1), Charmander(2), Squirtle(3), Random Pokemon(4) .");
				pokemonChoiceVar = userInput.nextInt();
			}
		
		public static void setPokemon()
			{
				switch(pokemonChoiceVar) {

			      case 1: System.out.println("jhjhgyj");
			              break;
			      case 2: ;
			              break;
			      case 3: ;
			              break;
			      case 4: ;
			              break;
			                        }
			}

	}
