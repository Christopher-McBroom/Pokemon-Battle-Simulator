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
				System.out.println("Hello and welcome to the Java Pokemon Battle Simulator! \nNow please select the Pokemon you wish to play with: ");
				System.out.println("Bulbasaur[1]");
				System.out.println("Charmander[2]");
				System.out.println("Squirtle[3]");
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
			boolean gameNotWon = true;
			
			
			if(userPokemon.getSpeed() > oppPokemon.getSpeed())
				{
					System.out.println("Your are going first!");
					while(gameNotWon)
						{
					userMoveChoice();
					winCondition();
					oppMoveChoice();
					winCondition();
						}
				}
			
			else if(userPokemon.getSpeed() < oppPokemon.getSpeed())
				{
					System.out.println("Your are going second!");
					while(gameNotWon)
						{
					oppMoveChoice();
					winCondition();
					userMoveChoice();
					winCondition();
						}
				}
			
			else
				{
				System.out.println("Your are going first!");
					while(gameNotWon)
						{
					userMoveChoice();
					winCondition();
					oppMoveChoice();
					winCondition();
						}
				}
			
		}
		
		public static void userMoveChoice()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Please select which attack you want to use: " );
			System.out.println(userPokemon.getMove1().getName()  +  "[1]");
			System.out.println(userPokemon.getMove2().getName()  +  "[2]");
			System.out.println(userPokemon.getMove3().getName()  +  "[3]");
			System.out.println(userPokemon.getMove4().getName()  +  "[4]");
			int moveChoice = userInput.nextInt();
			
			int damageCalc1  = 2*userPokemon.getLevel()/5 + 2;
			int damageCalc2;
			int damage = 0;
			
			
			switch(moveChoice) {

		      case 1: 	damageCalc2 =  userPokemon.getMove1().getPower()*userPokemon.getAttack()/oppPokemon.getDefense();
		      				damage = damageCalc1*damageCalc2 / 50 + 2;
		      				if(userPokemon.getMove1().getType().getName().equals(oppPokemon.getType1().getWeaknesses()))
		      					{
		      						damage = damage*2;
		      					}
		    	  			break;
		      case 2:damageCalc2 =  userPokemon.getMove2().getPower()*userPokemon.getAttack()/oppPokemon.getDefense();
						damage = damageCalc1*damageCalc2 / 50 + 2;
						if(userPokemon.getMove2().getType().getName().equals(oppPokemon.getType1().getWeaknesses()))
							{
								damage = damage*2;
							}
  							break;
		      case 3: damageCalc2 =  userPokemon.getMove3().getPower()*userPokemon.getAttack()/oppPokemon.getDefense();
							damage = damageCalc1*damageCalc2 / 50 + 2;
							if(userPokemon.getMove3().getType().getName().equals(oppPokemon.getType1().getWeaknesses()))
								{
									damage = damage*2;
								}
  							break;
		    
		      case 4: 	damageCalc2 =  userPokemon.getMove4().getPower()*userPokemon.getAttack()/oppPokemon.getDefense();
							damage = damageCalc1*damageCalc2 / 50 + 2;
							if(userPokemon.getMove4().getType().getName().equals(oppPokemon.getType1().getWeaknesses()))
								{
									damage = damage*2;
								}
	  						break;  
		                        						}
					
			
			int criticalHit = (int)(Math.random()*16) ;
			
			if(criticalHit == 15)
				{
					damage = damage*2;
					oppPokemon.setHp(oppPokemon.getHp() - damage);
					System.out.println("A critical hit! The attack did " + damage + " HP of damage! Your opponents "  + oppPokemon.getName() + "is at " +  oppPokemon.getHp() + " HP!");
				}
		
			else
				{
					oppPokemon.setHp(oppPokemon.getHp() - damage);
					System.out.println("The attack did " + damage + " HP of damage! Your opponents "  + oppPokemon.getName() + "is at " +  oppPokemon.getHp() +  " HP!");
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
			      				if(oppPokemon.getMove1().getType().getName().equals(userPokemon.getType1().getWeaknesses()))
			      					{
			      						damage = damage*2;
			      					}
			    	  			break;
			      case 2:damageCalc2 =  oppPokemon.getMove2().getPower()*oppPokemon.getAttack()/userPokemon.getDefense();
							damage = damageCalc1*damageCalc2 / 50 + 2;
							if(oppPokemon.getMove2().getType().getName().equals(userPokemon.getType1().getWeaknesses()))
								{
									damage = damage*2;
								}
	  							break;
			      case 3: damageCalc2 =  oppPokemon.getMove3().getPower()*oppPokemon.getAttack()/userPokemon.getDefense();
								damage = damageCalc1*damageCalc2 / 50 + 2;
								if(oppPokemon.getMove3().getType().getName().equals(userPokemon.getType1().getWeaknesses()))
									{
										damage = damage*2;
									}
	  							break;
			    
			      case 4: 	damageCalc2 =  oppPokemon.getMove4().getPower()*oppPokemon.getAttack()/userPokemon.getDefense();
								damage = damageCalc1*damageCalc2 / 50 + 2;
								if(oppPokemon.getMove4().getType().getName().equals(userPokemon.getType1().getWeaknesses()))
									{
										damage = damage*2;
									}
		  						break;  
			                        						}
				
			
				
				int criticalHit = (int)(Math.random()*16) ;
				
				if(criticalHit == 15)
					{
						damage = damage*2;
						userPokemon.setHp(userPokemon.getHp() - damage);
						System.out.println("A critical hit! Your opponents attack did " + damage + " HP of damage! Your  "  + userPokemon.getName() + "is at " +  userPokemon.getHp() + " HP!");
					}
			
				else
					{
						userPokemon.setHp(userPokemon.getHp() - damage);
						System.out.println("Your opponents attack did " + damage + " HP of damage! Your  "  + userPokemon.getName() + "is at " +  userPokemon.getHp() + " HP!");
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