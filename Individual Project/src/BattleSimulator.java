import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class BattleSimulator
	{

		public static int pokemonChoiceVar;
		public static Pokemon userPokemon;
		public static Pokemon oppPokemon;
		
		
		public static void main(String[] args)
			{
				
				pokemonChoice();
				setUserPokemon();
				setOpponentsPokemon();
				pokemonBattle();
				
			}
		
	
		
		public static void pokemonChoice()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello and welcome to the Java Pokemon Battle Simulator! \nNow please select the Pokemon you wish to play with: Bulbasaur(1), Charmander(2), Squirtle(3).");
				pokemonChoiceVar = userInput.nextInt();
			}
		
		public static void setUserPokemon()
			{
				
				userPokemon = PokeDex.Bulbasuar;
				
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
		
		public static void setOpponentsPokemon()
			{
		          int randomNumber = (int)(Math.random()*3) ;
				
		          oppPokemon = PokeDex.Bulbasuar;
				
				switch(randomNumber) {

			      case 0: 	oppPokemon = PokeDex.Bulbasuar;
			    	  			System.out.println("choice 1");
			              break;
			      case 1:oppPokemon = PokeDex.Charmander;
  	  							System.out.println("choice 2") ;
			              break;
			      case 2: oppPokemon = PokeDex.Squirtle;
  	  							System.out.println("choice 3");
			              break;
			                        						}
		          
			}
		
		public static void pokemonBattle()
		{
			System.out.println("A battle has begun between " + userPokemon.getName() + " and " + oppPokemon.getName() + "!");
			userMoveChoice();
			
		}
		
		public static void userMoveChoice()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Please select which attack you want to use: " + userPokemon.getMove1().getName()  +  "(1), " + userPokemon.getMove2().getName()  +  "(2), " + userPokemon.getMove3().getName()  +  "(3), " + userPokemon.getMove4().getName()  +  "(4)" );
			int moveChoice = userInput.nextInt();
			
		}
		

	}
