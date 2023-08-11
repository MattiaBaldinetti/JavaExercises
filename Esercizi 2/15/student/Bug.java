/**
   This class models a bug that crawls along a horizontal line.
*/
public class Bug
{
   ...
   /**
      Constructs a bug with a given position, facing right.
      @param initialPosition the initial position
   */
   public Bug(int initialPosition)
   {
      ...
   }
   
   /**
      Moves the bug by one unit in the current direction.
   */
   public void move()
   {
      ...
   }
   
   /**
      Flips the direction of this bug. 
   */
   public void turn()
   {
      ...
   }
   
   /**
      Gets the current position of this bug.
      @return the position
   */
   public int getPosition()
   {
      ...
   }
}
