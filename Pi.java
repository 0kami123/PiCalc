public class Pi {
    public static void main(String[] args) {
        int counter = 1;

        double odd = 1;



        double sum = 0;

        int max = 10000;

        boolean bSign = true;

        double pi = 0;



        do {

            if(bSign)

            {

                pi += 4 / odd;
                bSign = false;

            }

        else

            {

                pi -= 4 / odd;

                bSign = true;

            }

            odd+=2;

            counter++;

            sum += pi;

            System.out.println(pi);



        } while ( counter < max );



        System.out.println("Pi: " + sum / counter);



    }

}

