package day3;

import javax.swing.JOptionPane;

public class chooseyourownadventure {
public static void main(String[] args) {

String choice =JOptionPane.showInputDialog("Where would you rather go, the Desert or the Swamp?  ");

if(choice.equals("Desert")){

String choic =JOptionPane.showInputDialog(null, " You arive in the Desert and you realize that you need to build a shelter. What material do you use, cactus or thornbushes?  ");
if(choic.equals("cactus")){
	String choices =JOptionPane.showInputDialog("You get cut a lot but the cactus contains moisture and cools you down, you collect water from the cactus and are able to sleep that night without being distrbed. Congrats, you survived!  ");
}
	else {
		
	JOptionPane.showInputDialog("The thorn bushes cut you and dosen't provide a good shelter. The thornbushes fall apart when the wind blows them and you have no shelter. You die.");
	}






}
else{
	
String choicese=JOptionPane.showInputDialog("You arive in the Swamp and you realize that you need to build a shelter. What material do you use, moss trees or seaweed? ");
if(choicese.equals("moss trees")){
String cho = JOptionPane.showInputDialog("The trees build a decent home and you are able to survive the night, but when you leave your shelter to go find food, shrek attacks you! You die.");
}else{
	JOptionPane.showInputDialog("Your seaweed home is horrible and you die because shrek found you in your pile of seaweed and ate you! ");
	
	
}}

}
}
