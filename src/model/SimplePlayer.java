package model;

import model.interfaces.DicePair;
import model.interfaces.Player;

public class SimplePlayer implements Player {
	//constructor for simple player
	public SimplePlayer(String playerID, String playerName, int initialPoints) {
		this.playerID = playerID;
		this.playerName = playerName;
		this.initialPoints = initialPoints;
		this.points = initialPoints;
	}
	//instance variables
	private String playerID;
	private String playerName;
	int initialPoints;
	int points;
	int bet;
	DicePair rollResult;


	public String getPlayerID() {
		return playerID;	
	}
	
	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}

	
	@Override
	public String getPlayerName() {
		return playerName;
	}

	@Override
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	
	public int getInitialPoints() {
		return initialPoints;
	}

	
	public void setInitialPoints(int initialPoints) {
		this.initialPoints = initialPoints;
	}


	@Override
	public void setPoints(int points) {
		this.points = points;
	}


	public int getPoints() {
		return points;
	}




//if the bet isn't valid return false

	@Override
	public boolean placeBet(int bet) {
		// TODO Auto-generated method stub
		if(bet > this.getPoints()) {
			return false;
		}
		this.bet = bet;
		return true;
	}

	@Override
	public int getBet() {
		return bet;
	}

	@Override
	public DicePair getRollResult() {
		return rollResult;
	}

	@Override
	public void setRollResult(DicePair rollResult) {
		this.rollResult = rollResult;

	}

	@Override
	public String getPlayerId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setBet(int bet) {
		this.bet = bet;
	}


	}


