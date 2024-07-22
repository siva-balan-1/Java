class Player
{
    String name, role;// non static
    int score, age;
    float stricke_rate, economy;
    String country = "Indian";// static
    boolean caption = true;
    public static void main(String[] args)
    {
        Player rohit =  new Player();
        Player dhoni =  new Player();
        Player herdik =  new Player();
        Player virat =  new Player();
        rohit.score = 390;
        virat.age = 38;
        dhoni.age = 40;
        herdik.economy=50;
        System.out.println(dhoni.age);
    }
}