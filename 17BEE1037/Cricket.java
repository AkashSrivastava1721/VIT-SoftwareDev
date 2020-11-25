import java.util.*;
class user
{
    static String name; 
    static boolean profession; 
    public user(String s,int n,ArrayList<String>S,boolean p)
    {
        name=s;
        profession = p;
    }
}
//class to toss for the match
class toss
{
    static int player1;
    static int player2;
    static String ver;
    public toss(int p1,int p2)
    {
        player1=p1;
        player2=p2;
    }
    public static void verdict()
    {
        int ans=(int)Math.random(2);
        if(player1==ans)
        {
            System.out.println("player 1 won the toss");
            ver= "player1";
        }
        else
        {
            System.out.println("player 2 won the toss");
            ver= "player2";
        }
    }
    public static void choose(int p1,int p2)
    {
        String player= ver;
        System.out.println(player+" " + "choose 1 for batting and 0 for bollowing");
    }
}
class modifier
{
    String Comment;
    int mod;
    modifier(String s,int m)
    {
        Comment = s;
        mod = m;
    }
}
class overMatch
{
    static ArrayList<String> score = new ArrayList<>();
    public static double calculate(String s1, int p,ArrayList<modifier> bat)
    {
        int m=0;
        for(int i=0;i<bat.length();i++)
        {
            if(bat.get(i).Comment.compareTo(s1)==0)
            {
                m=bat.get(i).mod;
            }
        }
        double ans = (m-p)/m;
        retuen ans;
    }
    public static int sum(ArrayList<Integer>al)
    {
        int s=0;
        for(int i=0;i<al.size();i++)
        {
            s=s+al.get(i);
        }
        return s;
    }
    public static void play(ArrayList<modifier> bat,ArrayList<modifier> balll,ArrayList<modifier> run,ArrayList<ArrayList<String>>poss)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            int p2=0;
            System.out.println("Bollower Enter Skill Comment");
            String ball;
            while(true)
            {
                String s1 = sc.next();
                for(int i=0;i<5;i++)
                {
                    if(s1.compareTo(bat.get(i).Comment)==0)
                    {
                        p2=balll.get(i).mod;
                        ball=s1;
                        break;
                    }
                }
                if(p2==0)
                {
                    System.out.println("Invalid Input Try Again")
                }
            }
            String a[]= {"Full Toss","Yorker","Out Swinger","Inswinger","Bouncer","Slower"};
            int k=0;
            while(k<5)
            {
                if(a[k++].compareTo(ball))
                    break;
            }
            ArrayList<String> batpossible = poss.get(k-1);
            String b[]= new String[batpossible.size()];
            ArrayList<Double> probablity = new ArrayList<Double>();
            for(int j=0;j<batpossible.size();j++)
            {
                b[j]=batpossible.get(i);
                probablity.add(calculate(b[i],p2,ArrayList<modifier> bat));
            }
            for(int j=0;j<batpossible.size();j++)
            {
                System.out.println(b[i]+" "+probablity.get(i));
            }
            System.out.println("Batter Enter Skill Comment on above possiblity");
            String batt= sc.next();
            int r=0;
            for(int j=0;j<run.size();j++)
            {
                if(run.get(i).Comment,compareTo(batt))
                    r=run.get(i).mod;
            }
            score.add(r);
            System.out.println("Current Score="+r);
            System.out.println("Total Score of Player="+ sum(score));
        }
        System.out.println("Over Ends");
    }
}
class Cricket
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("User 1 enter your name");
        String name1 = sc.next();
        System.out.println("User 2 enter your name");
        String name2 = sc.next();
        System.out.println("User 1 Choose 0 or 1");
        int p1 = sc.nextInt();
        int p2 = p1==0?1:0;
        ArrayList<modifier> bat = new ArrayList<>();
        ArrayList<modifier> balll = new ArrayList<>();
        ArrayList<modifier> run = new ArrayList<>();
        ArrayList<ArrayList<String>> bat = new ArrayList<ArrayList<>>();
        for(int i=0;i<10;i++)
        {
            modifier m= new modifier(sc.next(),sc.nextInt());
            bat.add(m);
        }
        for(int i=0;i<6;i++)
        {
            modifier m= new modifier(sc.next(),sc.nextInt());
            balll.add(m);
        }
        for(int i=0;i<10;i++)
        {
            modifier m= new modifier(sc.next(),sc.nextInt());
            balll.add(m);
        }
        for(int i=0;i<6;i++)
        {
            ArrayList<String> al = new ArrayList<>();
            int n= sc.nextInt();
            for(int j=0;j<n;j++)
            {
                al.add(sc.next());
            }
            balll.add(al);
        }
        toss t = new toss(p1,p2);
        t.verdict();
        t.choose(p1, p2);
        String v = t.ver;
        int choice = sc.nextInt();
        play p = new play(bat,balll,ru,poss);
    }
}
