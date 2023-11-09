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
				System.out.println("Hello and welcome to the Java Pokemon Battle Simulator! \nNow please select the Pokemon you wish to play with: Bulbasaur(1), Charmander(2), Squirtle(3).");
				pokemonChoiceVar = userInput.nextInt();
			}
		
		public static void setPokemon()
			{
				
				Pokemon userPokemon = PokeDex.Bulbasuar;
				
				switch(pokemonChoiceVar) {

			      case 1: 	userPokemon = PokeDex.Bulbasuar;
			    	  			System.out.println("choice 1");
			              break;
			      case 2:userPokemon = PokeDex.Charmander;
  	  			System.out.println("choice 2") ;
			              break;
			      case 3: userPokemon = PokeDex.Squirtle;
  	  			System.out.println("choice 3");
			              break;
			                        }
			}

	}
