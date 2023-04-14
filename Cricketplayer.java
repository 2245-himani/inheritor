public class Cricketplayer
{
      void betsmen()
      {
        System.out.println("Betsmen!!!!");
      }
      void baller()
      {
        System.out.println("Baller!!!!");
      }

}

class Player extends Cricketplayer
{
        void cricketl()
        {
            System.out.println("CRICKET!!");
        }
       
  public static void main(String[]args)
        {
                Player p1 = new Player();
                p1.cricketl();
        }

}
