import javax.xml.namespace.QName;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int apparitionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, apparitionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() + "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public void compare(Gryffindor other){
        if (this.nobility + this.honor + this.bravery > other.nobility + other.honor + other.bravery){
            System.out.println(this.getName() + "лучший Гриффиндорец, чем " + other.getName());
        }else {
            System.out.println(other.getName() + "лучший Гриффиндорец, чем " + this.getName());
        }
    }
}

