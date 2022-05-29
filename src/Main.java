public class Main {
    public static void main(String[] args) {
        int priceTicket = 5005; // стоимость билета
        int bonusPoints = 20; // за каждые 20 рублей бонус 1 миля

        int totalMiles = priceTicket / bonusPoints;

        System.out.println("За потраченные " + priceTicket + " рублей начислено "+ totalMiles + " миль." );



    }
}