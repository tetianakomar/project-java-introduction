package homework.lesson3;

public class Snowman {
    public static void main(String[] args) {

        //    m=p*V
        //    V = 4/3πR^3
        float p = 0.7f;
        float r1 = 1f;
        float r2 = 0.5f;
        float r3 = 0.2f;

        double v1 = (4 * Math.PI * Math.pow(r1, 3))/3;

        double v2 = (4 * Math.PI * Math.pow(r2, 3))/3;

        double v3 = (4 * Math.PI * Math.pow(r3, 3))/3;

        double SnowmanMass = (v1+v2+v3)*p;

        System.out.println("Mass of Snowman: " + SnowmanMass);


    }


}
