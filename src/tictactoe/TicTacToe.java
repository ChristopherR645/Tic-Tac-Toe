package tictactoe;
import java.util.Scanner;


public class TicTacToe {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
       // boolean next = true;
        
        //if(next){
        ReadTxt r = new ReadTxt();
        
        r.openFile();
        //r.readFile();
        //r.closeFile();
        r.Seperate(r.GetFile());
        r.Order(r.GetFile());
        }
        
        
        
        
    }
    

