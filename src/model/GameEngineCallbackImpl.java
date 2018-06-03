
package model;

import java.util.logging.Level;
import java.util.logging.Logger;

import model.interfaces.DicePair;
import model.interfaces.GameEngine;
import model.interfaces.GameEngineCallback;
import model.interfaces.Player;

/**
 * 
 * Skeleton example implementation of GameEngineCallback showing Java logging behaviour
 * 
 * @author Caspar Ryan
 * @see model.interfaces.GameEngineCallback
 * 
 */
public class GameEngineCallbackImpl implements GameEngineCallback
{
	private Logger logger = Logger.getLogger("assignment1");

	public GameEngineCallbackImpl()
	{
		// FINE shows rolling output, INFO only shows result
		logger.setLevel(Level.FINE);
	}

	@Override
	public void intermediateResult(Player player, DicePair dicePair, GameEngine gameEngine)
	{
		// intermediate results logged at Level.FINE
		int diceOne = dicePair.getDice1();
		int diceTwo = dicePair.getDice2();
		int bothDice = diceTwo + diceOne;
		String playerName = player.getPlayerName();
		//create a string out of the dice results and player name to log
		String output = playerName + ": Rolling Dice 1: " + diceOne + ", Dice 2: " + diceTwo + " .. Total: " + bothDice;
		
		logger.log(Level.FINE, output);

	}

	@Override
	public void result(Player player, DicePair result, GameEngine gameEngine)
	{
		
		int diceOne = result.getDice1();
		int diceTwo = result.getDice2();
		int bothDice = diceTwo + diceOne;
		String playerName = player.getPlayerName();
		String output = playerName + ": *RESULT* Dice 1: " + diceOne + ", Dice 2: " + diceTwo + " .. Total: " + bothDice;
		//create a string out of the dice results and player name to log
		logger.log(Level.INFO, output);

	}

	@Override
	public void intermediateHouseResult(DicePair dicePair, GameEngine gameEngine) {

		int diceOne = dicePair.getDice1();
		int diceTwo = dicePair.getDice2();
		int bothDice = diceTwo + diceOne;
		//house rolls become the string to output to log
		String output = "House: ROLLING Dice 1: " + diceOne + ", Dice 2: " + diceTwo + " .. Total: " + bothDice;

		logger.log(Level.INFO, output);
		
		
	}

	@Override
	public void houseResult(DicePair result, GameEngine gameEngine) {
		int diceOne = result.getDice1();
		int diceTwo = result.getDice2();
		int bothDice = diceTwo + diceOne;
		//final house roll become the string to output to log
		String output = "House: *RESULT* Dice 1: " + diceOne + ", Dice 2: " + diceTwo + " .. Total: " + bothDice;

		logger.log(Level.INFO, output);
		
	}


}
