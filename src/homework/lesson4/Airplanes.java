package homework.lesson4;


public class Airplanes {

    public static void main(String[] args) {

        String nameOfAirplane1 = "Jet";
        String nameOfAirplane2 = "Airliner";
        String nameOfAirplane3 = "Airliner";
        String typeOfAirplane1 = "F-22 Raptor";
        String typeOfAirplane2 = "Aerobus 737";
        String typeOfAirplane3 = "Boeing 777";
        int economySeatsNumber2 = 120;
        int economySeatsNumber3 = 180;
        int businessSeatsNumber3 = 28;
        System.out.println("Type of airplane: " + printAirplaneInfo(nameOfAirplane1, typeOfAirplane1));
        System.out.println("Type of airplane: " + printAirplaneInfo(nameOfAirplane2, typeOfAirplane2, economySeatsNumber2));
        System.out.println("Type of airplane: " + printAirplaneInfo(nameOfAirplane3, typeOfAirplane3, economySeatsNumber3, businessSeatsNumber3));

    }

    public static String printAirplaneInfo(String nameOfAirplane1, String typeOfAirplane1) {
        return nameOfAirplane1 + ", model: " + typeOfAirplane1;

    }

    public static String printAirplaneInfo(String nameOfAirplane2, String typeOfAirplane2, int economySeatsNumber2) {
        return nameOfAirplane2 + ", model: " + typeOfAirplane2 + ", number of economy class passengers: " + economySeatsNumber2;
    }

    public static String printAirplaneInfo(String nameOfAirplane3, String typeOfAirplane3, int economySeatsNumber3, int businessSeatsNumber3) {
        return nameOfAirplane3 + ", model: " + typeOfAirplane3 + ", number of economy class passengers: " + economySeatsNumber3 + ", number of business class passengers: " + businessSeatsNumber3;
    }

}

