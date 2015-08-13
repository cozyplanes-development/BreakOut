package AssignmentOne;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Saif Asad
 */
public class Brick extends Block{
    //determine the color of non special bricks
    private int score;   
    //this will cause a ball object hitting it to duplicate
    //have ditinct color than no special
    private boolean isSpecial;
   
    public Brick(int positionX, int PositionY, int width, int height, Color color, boolean isVisible, int score, boolean isSpecial)
    {//setup the block with variables
        super.setPositionX(positionX);
        super.setPositionY(PositionY);
        super.setWidth(width);
        super.setHeight(height);
        super.setIsVisible(isVisible);
        if(isSpecial)
        {//setup the special block to be gray and not have a score value
            super.setColor(Color.gray);
            this.score = 0;
        }
        else//this block is not special and must have a score value
        {
            this.score = score;
            super.setColor(color);
        }
    }

    public void drawBricks(Graphics g, int defaultWidth, int defaultHeight)
    {
        Brick brick;
        brick = new Brick(defaultWidth/8*1, defaultHeight/8, 20,10, Color.red, true, 10 , false);
        g.setColor(brick.getColor());
        g.fill3DRect(brick.getPositionX(), brick.getPositionY(), brick.getWidth(), brick.getHeight(), true);
    }
    //-----------------------------------------------------------getters and setters-----------------------------------------
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

    /**
     * @return the isSpecial
     */
    public boolean isIsSpecial() {
        return isSpecial;
    }

    /**
     * @param isSpecial the isSpecial to set
     */
    public void setIsSpecial(boolean isSpecial) {
        this.isSpecial = isSpecial;
    }
    
    //---------------------------------------------------------------------------------------
    
}
