public class Hogwarts {
    String name;
    private int magicPower;
    private int apparitionDistance;

    public Hogwarts(String name, int magicPower, int apparitionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.apparitionDistance = apparitionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getApparitionDistance() {
        return apparitionDistance;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", apparitionDistance=" + apparitionDistance +
                '}';
    }
    public void compare(Hogwarts other){
        if(magicPower > other.magicPower){
            System.out.println(name + " обладает большей мощностью магии, чем " + other.name);
        }else {
            System.out.println(other.name + " обладает большей мощностью магии, чем " + name);
        }
        if(apparitionDistance > other.apparitionDistance){
            System.out.println(name + " обладает большей дистанцией магии, чем " + other.name);
        }else {
            System.out.println(other.name + " обладает большей дистанцией магии, чем " + name);
        }
    }
}
