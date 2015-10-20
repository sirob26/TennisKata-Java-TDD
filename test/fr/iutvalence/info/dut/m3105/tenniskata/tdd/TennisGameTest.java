package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	private TennisGame tennisGame ;
	
	private void newTennisGame(){
		this.tennisGame = new TennisGame();
	}
	
	private String getScoreTennisGame(){
		return this.tennisGame.getScore();
	}
	
	private void p1Score(){
		this.tennisGame.playerOneScore();
	}
	
	private void p2Score(){
		this.tennisGame.playerTwoScore();
	}
	
	@Test
	public void newTennisGameAndScoreequalsLoveAll()
	{
		newTennisGame();
		assertEquals(getScoreTennisGame(), "Love-all");
	}
	
	@Test
	public void playerOneScoreAfterBeginning()
	{
		newTennisGame();
		p1Score();
		assertEquals(getScoreTennisGame(), "Fifteen-Love");
	}

	@Test
	public void playerTwoScoreAfterBeginning()
	{
		newTennisGame();
		p2Score();
		assertEquals(getScoreTennisGame(), "Love-Fifteen");
	}
	
	@Test
	public void equality()
	{
		newTennisGame();
		p2Score();
		p1Score();
		assertEquals(getScoreTennisGame(), "Fifteen-all");
	}
	
	@Test
	public void scoreAfterSomeBalls(){
		newTennisGame();
		p2Score();
		assertEquals(getScoreTennisGame(), "Love-Fifteen");
		p1Score();
		assertEquals(getScoreTennisGame(), "Fifteen-all");
		p1Score();
		assertEquals(getScoreTennisGame(), "Thirty-Fifteen");
		p1Score();
		assertEquals(getScoreTennisGame(), "Forty-Fifteen");
	}
	
}
