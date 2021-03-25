import java.util.*;
class Movie_Guess
{
    String Movies[]={"THE/FLYING/JATT","RACE/2","3/IDIOTS","MS/DHONI/AN/UNTOLD/STORY","RAB/NE/BANA/DI/JODI","DEAR/ZINDAGI","DANGAL","RAEES","SULTAN","ACTION/JACKSON","A/WEDNESDAY","BHOOTNATH/RETURNS","SPECIAL/26","DABANGG/2","BAND/BAAJA/BAARAAT","BROTHERS","BEFIKRE","BAJIRAO/MASTANI","JAB/TAK/HAI/JAAN","HAPPY/NEW/YEAR","EK/VILLIAN","SHOR/IN/THE/CITY","ONCE/UPON/A/TIME/IN/MUMBAI","THE/LUNCHBOX","SLUMDOG/MILLIONAIRE"};
    void GuessMovie()
    { 
        Scanner obj=new Scanner(System.in);
        int random=(int)(Math.random()*25+1); //generates a random number between 1 and 25
        String a=Movies[random];
        int l=a.length();
        String b="";
        String vowels="AEIOU";
        char ch1,ch2;
        int in=0;
        for (int i=0;i<l;i++)
        {
            ch1=a.charAt(i);
            if (vowels.indexOf(ch1)>=0)
                b=b+ch1;
            else if(ch1=='/')
                b=b+'/';
            else
                b=b+'.';
        }
        String c="BOLLY*WOOD";
        StringBuffer buf=new StringBuffer(b);
        StringBuffer bol=new StringBuffer(c);
        do
        {
            System.out.print('\u000C');
            System.out.println(bol);
            System.out.println(buf);
            if (c.lastIndexOf('-')==9)
                break;
            System.out.println("Guess a letter/number");
            char n=obj.next().charAt(0);
            n=Character.toUpperCase(n);
            if (a.indexOf(n)==-1)
            {
                bol.setCharAt(in,'-');
                in++;
            }
            else
            {
                for (int j=0;j<l;j++)
                {
                    ch2=a.charAt(j);
                    if (ch2==n)
                    {
                       buf.setCharAt(j,n);
                    }
                }
            }
            b=buf.toString();
            c=bol.toString();
            if(b.indexOf('.')==-1)
            {
                System.out.print('\u000C');
                System.out.println(bol);
                System.out.println(buf);  
            }
        }
        while(b.indexOf('.')!=-1);
        if (c.lastIndexOf('-')==9)
        {
            System.out.println("You lose");
            System.out.println("The correct answer is: "+a);
        }
        else 
        {
            System.out.println("Congrats!You Won :):):)");
            System.out.println("Movie Name: "+a);
        }
        System.out.println("Press 1 to play again or 0 to exit");
        int p=obj.nextInt();
        if(p==1)
   
          GuessMovie();
        else
        {
        System.out.println("Thank you for playing");
        System.exit(0);
        }
    }
    public static void main(String[] args)
    {
        Movie_Guess ob = new Movie_Guess();
        ob.GuessMovie();
    }
}
            