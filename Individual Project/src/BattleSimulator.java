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
			    	  		
			              break;
			      case 2:userPokemon = PokeDex.Charmander;
  	 
			              break;
			      case 3: userPokemon = PokeDex.Squirtle;
  	  	
			              break;
			                        						}
			}
		
		public static void setOpponentsPokemon()
			{
		          int randomNumber = (int)(Math.random()*3) ;
				
		          oppPokemon = PokeDex.Bulbasuar;
				
				switch(randomNumber) {

			      case 0: 	oppPokemon = PokeDex.Bulbasuar;
			    	  			
			              break;
			      case 1:oppPokemon = PokeDex.Charmander;
  	  							
			              break;
			      case 2: oppPokemon = PokeDex.Squirtle;
  	  						
			              break;
			                        						}
		          
			}
		
		public static void pokemonBattle()
		{
			System.out.println("A battle has begun between " + userPokemon.getName() + " and " + oppPokemon.getName() + "!");
			
			if(userPokemon.getSpeed() > oppPokemon.getSpeed())
				{
					
					userMoveChoice();
					winCondition();
					oppMoveChoice();
					winCondition();
				}
			
			else if(userPokemon.getSpeed() < oppPokemon.getSpeed())
				{
					oppMoveChoice();
					winCondition();
					userMoveChoice();
					winCondition();
				}
			
		}
		
		public static void userMoveChoice()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Please select which attack you want to use: " + userPokemon.getMove1().getName()  +  "(1), " + userPokemon.getMove2().getName()  +  "(2), " + userPokemon.getMove3().getName()  +  "(3), " + userPokemon.getMove4().getName()  +  "(4)" );
			int moveChoice = userInput.nextInt();
			
			int damageCalc1  = 2*userPokemon.getLevel()/5 + 2;
			int damageCalc2;
			int damage = 0;
			
			
			switch(moveChoice) {

		      case 1: 	damageCalc2 =  userPokemon.getMove1().getPower()*userPokemon.getAttack()/oppPokemon.getDefense();
		      				damage = damageCalc1*damageCalc2 / 50 + 2;
		    	  			break;
		      case 2:damageCalc2 =  userPokemon.getMove2().getPower()*userPokemon.getAttack()/oppPokemon.getDefense();
						damage = damageCalc1*damageCalc2 / 50 + 2;
  							break;
		      case 3: damageCalc2 =  userPokemon.getMove3().getPower()*userPokemon.getAttack()/oppPokemon.getDefense();
							damage = damageCalc1*damageCalc2 / 50 + 2;
  							break;
		    
		      case 4: 	damageCalc2 =  userPokemon.getMove4().getPower()*userPokemon.getAttack()/oppPokemon.getDefense();
							damage = damageCalc1*damageCalc2 / 50 + 2;
	  						break;  
		                        						}
			
			int criticalHit = (int)(Math.random()*16) ;
			
			if(criticalHit == 15)
				{
					damage = damage*2;
					oppPokemon.setHp(oppPokemon.getHp() - damage);
				}
		
			else
				{
					oppPokemon.setHp(oppPokemon.getHp() - damage);
				}
					
			
				}
				
		public static void oppMoveChoice()
			{

				int moveChoice = (int)(Math.random()*4)+1 ;
				
				int damageCalc1  = 2*userPokemon.getLevel()/5 + 2;
				int damageCalc2;
				int damage = 0;
				
				
				switch(moveChoice) {

			      case 1: 	damageCalc2 =  oppPokemon.getMove1().getPower()*oppPokemon.getAttack()/userPokemon.getDefense();
			      				damage = damageCalc1*damageCalc2 / 50 + 2;
			    	  			break;
			      case 2:damageCalc2 =  oppPokemon.getMove2().getPower()*oppPokemon.getAttack()/userPokemon.getDefense();
							damage = damageCalc1*damageCalc2 / 50 + 2;
	  							break;
			      case 3: damageCalc2 =  oppPokemon.getMove3().getPower()*oppPokemon.getAttack()/userPokemon.getDefense();
								damage = damageCalc1*damageCalc2 / 50 + 2;
	  							break;
			    
			      case 4: 	damageCalc2 =  oppPokemon.getMove4().getPower()*oppPokemon.getAttack()/userPokemon.getDefense();
								damage = damageCalc1*damageCalc2 / 50 + 2;
		  						break;  
			                        						}
				
				int criticalHit = (int)(Math.random()*16) ;
				
				if(criticalHit == 15)
					{
						damage = damage*2;
						userPokemon.setHp(userPokemon.getHp() - damage);
					}
			
				else
					{
						userPokemon.setHp(userPokemon.getHp() - damage);
					}
						
				
			}
		
		
		public static void winCondition()
		{
			if(userPokemon.getHp() <= 0)
				{
					System.out.println(oppPokemon.getName() + " knocked out " + userPokemon.getName() + "! Game Over!");
					System.exit(0);
				}
			
			else if(oppPokemon.getHp() <= 0)
			{
					System.out.println(userPokemon.getName() + " knocked out " + oppPokemon.getName() + "! You Win!");
					System.exit(0);
			}
			
		}
		
	}