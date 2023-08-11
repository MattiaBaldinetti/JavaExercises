//HIDE
public class ToDoListTester
{
   public static void main(String[] args)
   {
      ToDoList list = new ToDoList();
      System.out.println("Adding the following 6 items to the list.");
      System.out.println("\"add 1 Complete Programming Exercise 15.11\"");
      System.out.println("\"add 8 Read for tomorrow's class\"");
      System.out.println("\"add 3 Soccer practice\"");
      System.out.println("\"add 6 Call parents\"");
      System.out.println("\"add 5 Have dinner with friends\"");
      System.out.println("\"add 9 Sleep well\"");
      list.addTask("add 1 Complete Programming Exercise 15.11");
      list.addTask("add 8 Read for tomorrow's class");
      list.addTask("add 3 Soccer practice");
      list.addTask("add 6 Call parents");
      list.addTask("add 5 Have dinner with friends");
      list.addTask("add 9 Sleep well");
      System.out.println();
      System.out.println("Entering 'add bad command'");
      list.addTask("add bad command");
      System.out.println("Expected: The priority must be an integer between 1 and 9.");
      System.out.println();
      System.out.println("Pulling most urgent items out.");
      list.nextTask();
      System.out.println("Expected: Complete Programming Exercise 15.11");
      list.nextTask();
      System.out.println("Expected: Soccer practice");
      list.nextTask();
      System.out.println("Expected: Have dinner with friends");
      list.nextTask();
      System.out.println("Expected: Call parents");
      list.nextTask();
      System.out.println("Expected: Read for tomorrow's class");
      list.nextTask();
      System.out.println("Expected: Sleep well");
      list.nextTask();
      System.out.println("Expected: There are no tasks in the list.");
   }
}