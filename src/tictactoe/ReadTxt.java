package tictactoe;
import java.io.*;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class ReadTxt {
    
    private Scanner x;
    
    public void openFile(){
        try{
            x = new Scanner(new File("C:\\Users\\Christopher\\Downloads\\games.txt"));
        }
        catch (Exception e){
            System.out.println("could not find file");
        }
    }
    
    public void readFile(){
        while(x.hasNext()){
            String line =x.nextLine();
            System.out.println(line);
        }
    
}
    public String GetFile(){
        String content="";
       while(x.hasNext()){
            content =content + x.nextLine(); 
            
    }return content;
    }
       
    public void closeFile(){
        x.close();
    }
    
    String[][] gamesall;
    
    //*splits file into individual games and seperates games into individual lines*//
    public String Seperate(String f){
        
        
         
        
        String[]games = f.split("`");
        gamesall= new String[games.length][7];
        for(int i= 0; i<games.length; i++){
            
        String[] singlegame = games[i].split("~");
        for(int n= 0; n<singlegame.length; n++){
            
        
         gamesall[i][n]=singlegame[n];
        }
        
        /*System.out.println(singlegame[0]);    Proving line seperation works
        System.out.println(singlegame[1]);
        System.out.println(singlegame[2]);
        System.out.println(singlegame[3]);
        System.out.println(singlegame[4]);
        System.out.println(singlegame[5]);
        System.out.println(singlegame[6]);*/
       
        }
        
        
        return null;
    }
    
    public Date Compare(Date a, Date b){
        if (a.compareTo(b) <= 0) {
            return(a);
    } else return(b);
    }
    
    //*putting past dates into array dates*//
    public String Order(String f){
        String[] dates = new String[gamesall.length];
        
        for(int n= 0; n < dates.length;n++){
            dates[n]=gamesall[n][1];
        }
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");

        try{
            
          //trying to organize my time  
       Date[] fdates = new Date[gamesall.length];
       for(int n=0; n<gamesall.length;n++)
           fdates[n]=format.parse(dates[n]);
            System.out.println(fdates[1].getTime());

        
        }
        
        
        catch(Exception e){
            System.out.println("I sux");
                    }
        

        
           /* System.out.println(dates[0]);         testing if works
            System.out.println(dates[1]);
            System.out.println(dates[2]);
            System.out.println(dates[3]);
            System.out.println(dates[4]);*/
        return null;//replace later
    }
            
    }