import java.util.Scanner;
class Cuboid
{
    int length, breadth, height;
    // creating a parameterized constructor to initialize the variables
    Cuboid(int length, int breadth, int height)
    {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    // method to calculate the volume of the cuboid
    int volume()
    {
        return length*breadth*height;
    }
}

public class constructor {
    public static void main(String[] args) {
        Scanner userInp = new Scanner(System.in);       // creation of object for taking input
        System.out.println("Enter the dimension of cuboid ");
        // taking the user input
        int ln = userInp.nextInt();
        int bd = userInp.nextInt();
        int ht = userInp.nextInt();

        // initialization of class cuboid
        Cuboid cbd = new Cuboid(ln, bd, ht);
        int result = cbd.volume();
        System.out.println("Volume of cuboid is " + result);
    }
}
