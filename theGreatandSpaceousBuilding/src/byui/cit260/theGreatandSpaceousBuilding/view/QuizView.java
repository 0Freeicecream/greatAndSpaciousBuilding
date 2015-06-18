/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

/**
 *
 * @author Ted Bell
 */
public class QuizView extends View {
    
    public QuizView(){
        super("\nThis is an example test, the correct answer is Candy"
        + "\nA. Zubat"
        + "\nB. Candy Crush Saga"
        + "\nC. Candy"
        + "\nD. I don't have a fourth option, I just thought I'd impress you"
        + "\n");
    }
    
    private final char ANSWER = 'C';
    
    @Override
    public boolean doAction(Object obj) {
        //Defines obj String for Superclass
        String value = (String) obj;
        // convert to Uppercase
        value = value.toUpperCase();
        //get first character entered
        char choice = value.charAt(0);
        if (choice == ANSWER) {
            System.out.println("\n\nYou answered correctly, you gain x Fruit!");
        } else {
            System.out.println("\n\nYou chose poorly.");
        }
        return true;
        
    }
        
        
}
