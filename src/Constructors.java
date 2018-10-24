public class Constructors {
    static int i = 100;

    static
    {
        i= i-- - --i;
        System.out.println("First " + i);
    }
    {
        i= i++ + ++i;
        System.out.println("Second " + i);
    }
}

class B extends Constructors
    {
        static
        {
            i = --i - i--;
            System.out.println("Third " + i);
        }
        {
            i = ++i + i++;
            System.out.println("Fourth " + i);
        }
    }