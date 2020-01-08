class Demo {
    static                  //static block
    {
        System.out.println("Static block");
    }

    public static void main(String args[])  //static method
    {
        System.out.println("Start demo");
        Game rps= new Game();
        rps.startGameForTwoPlayers(100,"John","Shadi");
    }
}