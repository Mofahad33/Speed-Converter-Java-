
public class SpeedConverter {

    public static void main(String[] args) {



        toMilesPerHour(1.5);
        printConversion(1.5);

    }
        public static double toMilesPerHour(double kilometersPerHour) {

            if (kilometersPerHour < 0) {
                return -1;

            }

            return Math.round(kilometersPerHour / 1.60934);
        }
        public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");

        }
        else{
            long milesPerHour = (long) toMilesPerHour(kilometersPerHour);
            System.out.println("kmph = " + kilometersPerHour + " and mph = " + milesPerHour);
        }
    }








    }

