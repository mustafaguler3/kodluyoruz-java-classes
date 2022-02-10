public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Fighter(String name, int damage, int health, int weight,int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >=0 && damage <=100){
            this.dodge = dodge;
        }else{
            this.dodge = 0;
        }
    }

    int hit(Fighter rkp){
        System.out.println(this.name + "=>" + rkp.name + " " +this.damage +" hit");
        if(isDodge()){
            System.out.println(rkp.name + " blocked coming damage");
            return rkp.health;
        }
        if (rkp.health - this.damage < 0){
            return 0;
        }
        return rkp.health - this.damage;
    }

    boolean isDodge(){
        double random = Math.random() * 100;
        return random <= this.dodge;
    }

}










