import java.util.* ;
class numgame{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int guessnum,gennum;
        int maxattp = 10;
        int attp ;
        int round = 0;
        System.out.println("***NUMBER GAME****");
        while(true)
        {
            gennum = r.nextInt(100);
            System.out.println();
            System.out.println("Guess the Random Number Generated between 1 to 100");
            System.out.println();
            System.out.println("***Round "+(round+1)+" ***");
            for(attp=0 ; attp<maxattp ; attp++)
            {
            System.out.println("Guess the Random Number Gnenerated");
            guessnum=s.nextInt();
            System.out.println();
            if(guessnum==gennum){
                System.out.println("You have succesfully found the number ");
                System.out.println();
                break;
            }
            else if(guessnum > gennum){
                System.out.println("Sorry,Your Guess is too high");
                System.out.println();
            }
            else{
                System.out.println("Sorry,Your Guess is too low");
                System.out.println();
            }
        }
        if(attp==maxattp){
        System.out.println("You have reached your maximum limit of chances to guess the number!!"); 
        System.out.println();
        } 
        round++;
        System.out.println("Do You want to play again(yes/no) ?");
        String choice = s.next();
        if(!choice.equalsIgnoreCase("yes")){
            break;
        }  
      }
      System.out.println();
      System.out.println("***!!! GAME OVER !!! Thank You for Playing***");
    }
 }