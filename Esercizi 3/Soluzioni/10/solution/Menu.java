
public class Menu {
   
    public static final String labels = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String menuText;
    private int optionCount;
 
    public Menu()
    {
         menuText = "";
         optionCount = 0;
    }
 
    public void display()
    {
         System.out.println(menuText);
    }
 
    public void addOption(String option)
    {
        String optionLabel = labels.substring(optionCount, optionCount + 1);
        optionCount = optionCount + 1;
        menuText = menuText + optionLabel + ") " + option + "\n";
    }
    
}
