 public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int magicPower, int apparitionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, apparitionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

     @Override
     public String toString() {
         return super.toString() + "Slytherin{" +
                 "cunning=" + cunning +
                 ", determination=" + determination +
                 ", ambition=" + ambition +
                 ", resourcefulness=" + resourcefulness +
                 ", thirstForPower=" + thirstForPower +
                 '}';
     }

     public void compare(Slytherin other){
         if (this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower > other.cunning + other.determination + other.ambition + other.resourcefulness + other.thirstForPower){
             System.out.println(this.getName() + "лучший Слизеринец, чем " + other.getName());
         }else {
             System.out.println(other.getName() + "лучший Слизеринец, чем " + this.getName());
         }
     }
}
