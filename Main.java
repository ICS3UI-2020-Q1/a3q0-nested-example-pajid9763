import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.println("Does your animal have feathers?");
  String feathers = input.nextLine();
  if ( feathers.equals("yes") ) {
    // animal has feathers
    // ask the colour 
    System.out.println("Are the feathers red or blue?");
    String featherColour = input.nextLine();

    // what is the colour
    if( featherColour.equals("blue") ){
      System.out.println("You have a blue jay");
    }else if( featherColour.equals("red")){
      System.out.println("You have a cardinal");
    }
  } else {
    // animal doesn't have feathers 
    
  }
}
}