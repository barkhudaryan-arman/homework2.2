public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int apparitionDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, apparitionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() + "Hufflepuff{" +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public void compare(Hufflepuff other){
        if (this.diligence + this.loyalty + this.honesty > other.diligence + other.loyalty + other.honesty){
            System.out.println(this.getName() + "лучший Пуффендорец, чем " + other.getName());
        }else {
            System.out.println(other.getName() + "лучший Пуффендорец, чем " + this.getName());
        }
    }
}