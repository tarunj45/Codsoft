 import java.util.*;

 public class codsoft1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxattempts =7;
        int score = 0 ;
        Random rd = new Random();
        int gamesplayed = 0;


        System.out.println("NUMBER GAME   LETS PLAY");
         while (true) {
            int generatednum = rd.nextInt(100);
            int attempt =0;
            int guessnum ;
            while (attempt<maxattempts) {
                System.out.println("enter your number");
                guessnum = sc.nextInt();
                attempt++;

                if(guessnum<generatednum){
                    System.out.println("the number you have guessed is wrong and the value is lower than number");
                }
                else if(guessnum>generatednum){
                    System.out.println("the number you have guessed is wrong and the value is higher than number");

                }
                else  {
                    System.out.println("the number you have guessed is right  " + generatednum + " in " + attempt +" attempt" );
                    score++;
                    break;
                    
                }
                if ((attempt==maxattempts)) {
                    System.out.println("max limit reached . the number is " + generatednum);
                    
                }

            }

            gamesplayed++;


            System.out.println("do you want to play more? yes /no");
            String play = sc.next().toLowerCase();
            

            if(play.equals("no")){
                
                  System.out.println("the score  is "+ score + " in the no of  gamesplayed " + gamesplayed);
                  break;
            }
         }
         sc.close();
    }
    
     
    

}