import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("left") )
        {
            turn( -5 );
        }
        
        else if ( Greenfoot.isKeyDown("right" ) )
        {
            turn( 5 );
        }
        
        if (Greenfoot.isKeyDown( "up" ) )
        {
            move( 10 );
        }
        
        else if ( Greenfoot.isKeyDown ("down") )
        {
            move(-10);
        }
        
        if ( IsCollidingWithGoak() )
        {
            getWorld().showText("You Win", 300, 200 );
            Greenfoot.stop();
        }
    }  
    
    public boolean IsCollidingWithGoak()
    {
        Goak collided = (Goak) getOneIntersectingObject( Goak.class);
        if ( collided != null)
        {
            return true;
        }
        return false;
        
    }
}
