package com.company;

public class Test {
    public static void main(String[] args){
        DetTest d = new DetTest("Rock", "Scissor");
        d.winner();

        int i = 0;
        int j = 0;
        System.out.println(d.winner());

        switch(d.winner()){
            case "You Win!":
                i+=1;
                break;
            case "You Lose..":
                j+=1;
                break;
            default:
                break;
        }
        System.out.println(i +" : " + j);

    }
}
