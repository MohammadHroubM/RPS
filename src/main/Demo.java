package main;
class Demo {

    public static void main(String args[])  //static method
    {
        System.out.println("Start demo");
        Game rps= new Game();
        rps.startGameForTwoPlayers(100,"John","Shadi");
    }
}