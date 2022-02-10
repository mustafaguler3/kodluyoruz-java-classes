public class main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("A",10,100,100,44);
        Fighter f2 = new Fighter("B",10,120,100,2);

        Match match = new Match(f1,f2,60,100);

        match.run();


    }

}
