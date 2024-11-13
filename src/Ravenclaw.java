public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int apparitionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, apparitionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }


    @Override
    public String toString() {
        return super.toString() + "Ravenclaw{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }

    public void compare(Ravenclaw other){
        if (this.intelligence + this.wisdom + this.wit + this.creativity > other.intelligence + other.wisdom + other.wit + other.creativity){
            System.out.println(this.getName() + "лучший Когтевранец, чем " + other.getName());
        }else {
            System.out.println(other.getName() + "лучший Когтевранец, чем " + this.getName());
        }
    }
}