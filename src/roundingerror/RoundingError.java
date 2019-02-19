/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package roundingerror;
import static java.lang.Math.exp;
import static java.lang.Math.sqrt;
import javax.swing.*;
/**
 *
 * @author vifeh1685
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Double numberEntered, squareOfValue,rootOfValue, roundOffError ;
        
    //Strings a number entered through the Pane
            String numberStr = JOptionPane.showInputDialog("Please enter a number ");
        
    //Converts the String into a double 
            numberEntered = Double.parseDouble(numberStr);
        
    //Squares the entered value
            squareOfValue = sqrt(numberEntered);
        
    //Roots the entered number
            rootOfValue = Math.pow(squareOfValue, 2);
        
    //Subtracts the original number and substracts the square of the square to give you the round off error
            roundOffError = numberEntered - rootOfValue;
        
    //Outputs the square of the square, and then the round off error
            JOptionPane.showMessageDialog(null, "The square of the square is " + rootOfValue + 
                    "\n The round of error is " +  roundOffError);
        
    }
    
}
