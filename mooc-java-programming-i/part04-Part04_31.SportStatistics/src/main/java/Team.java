/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbonach
 */
public class Team {
    private String name;
    private int games = 0;
    private int wins = 0;
    private int losses = 0;
    
    public Team(String name) {
        this.name = name;
        this.games++;
    }
    
    public void updateGames() {
        games++;
    }
    
    public void updateWins() {
        wins++;
    }
    
    public void updateLosses() {
        losses++;
    }
    
    public String getName() {
        return name;
    }
    
    public int getGames() {
        return games;
    }
    
    public int getWins() {
        return wins;
    }
    
    public int getLosses() {
        return losses;
    }
    
    @Override
    public String toString() {
        return name;
    }

}
