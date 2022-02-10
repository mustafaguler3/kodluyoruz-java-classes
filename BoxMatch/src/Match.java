public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("--New Round--");

                if (first() > this.second()) {
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }

                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " health :" + this.f1.health);
                }else{
                    System.out.println("athletes' weights do not match.");
                }
            }
        }




    }
    boolean isCheck () {
        return this.f1.weight >= minWeight && this.f1.weight <= maxWeight && this.f2.weight >= minWeight && this.f2.weight <= maxWeight;
    }

    boolean isWin () {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " win");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " win");
            return true;
        }
        return false;
    }

    double first()
    {
        double value =Math.random()*100+1;

        System.out.println("first one : "+value);
        return  value;

    }

    double second()
    {
        double value =Math.random()*100+1;
        System.out.println("second one :"+value);
        return  value;

    }
}














