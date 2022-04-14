package com.company;

public class DetTest {
    public String my_choice;
    public String comp;

    public DetTest(String my_choice, String s) {
        this.my_choice = my_choice;
        this.comp = s;
    }

    //This class has a method to determine who is the winner
    public String winner(){
        if (this.my_choice.equals("Rock")){
            if (this.comp.equals("Rock")){
                return "Draw";
            }
            else if (this.comp.equals("Paper")){
                return "You Lose..";
            }
            else {
                return "You Win!";
            }
        }

        else if (this.my_choice.equals("Paper")){
            if (this.comp.equals("Rock")){
                return "You Win!";
            }
            else if (this.comp.equals("Paper")){
                return "Draw";
            }
            else {
                return "You Lose..";
            }
        }

        else if (this.my_choice.equals("Scissor")){
            if (this.comp.equals("Rock")){
                return "You Lose..";
            }
            else if (this.comp.equals("Paper")){
                return "You Win!";
            }
            else {
                return "Draw";
            }
        }

        else {
            return "Invalid input";
        }
    }
}
