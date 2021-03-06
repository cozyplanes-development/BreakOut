
package AssignmentOne;
/**
 * @author Saif Asad
 * @author Mark Manson
 */
public class Player implements Comparable<Player> {

    private String playerName;
    private int score;

    public Player(String playerName, int score) {
        this.setPlayerName(playerName);
        this.setScore(this.getScore() + score);
    }
    
    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Player otherPlayer) {
        return otherPlayer.getScore() - this.score;
    }
    @Override
    public String toString()
    {
        return "Player: "+playerName+" Score: "+score;
    }
}
