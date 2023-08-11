import java.util.PriorityQueue;
import java.util.Scanner;

/**
   Class for creating a priority ToDo list.
*/
public class ToDoList
{
   private PriorityQueue<Task> tasks;

   /**
      Constructor
   */
   public ToDoList()
   {
      tasks = new PriorityQueue<>();
   }

   /**
    * Display a menu and accepts commands.
    */
   public void run()
   {
      String option = "";
      System.out.println("To Do List - Please enter an option");
      System.out.println("  add priority description (add a new task)");
      System.out.println("  next (remove and print most urgent task)");
      System.out.println("  quit (exit this program)");
      System.out.println();
      
      Scanner in = new Scanner(System.in);
      
      do
      {
         System.out.print("> ");
         option = in.nextLine();
         if (option.startsWith("add"))
         {
            addTask(option);
         }
         else if (option.equals("next"))
         {
            nextTask();
         }
      } 
      while (! option.equals("quit"));
   }
   
   /**
    * Parse the add option line.
    * @param optionStr the option line
   */
   public void addTask(String optionStr)
   {
      Scanner sin = new Scanner(optionStr);
      sin.next(); // throw away the 'add' part
      if (sin.hasNextInt()) // next part must be priority
      {
         int priority = sin.nextInt();
         if (priority >= 1 && priority <= 9)
         {
            String description = sin.nextLine().trim();
            tasks.add(new Task(priority, description));
         }
         else
         {
            System.out.println("Priority must be between 1 and 9, not " + priority);
         }
      }
      else
      {
         System.out.println("Use 'add priority description' to add a task.");
         System.out.println("The priority must be an integer between 1 and 9.");
      }
   }

   /**
      Get the next highest priority task and display the description to the user.
   */
   public void nextTask()
   {
      Task next = null;
      next = tasks.poll();
      if (next == null)
      {
         System.out.println("There are no tasks in the list.");
      }
      else
      {
         System.out.println(next.getDescription());
      }
   }
}