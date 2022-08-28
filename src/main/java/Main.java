public class Main {
    public static void main(String[] args){
        Customer specialAgent = new Customer("Smetanka", "Vkusnova");
//        FlightBookingService flightBookingService = new FlightBookingService();
//        flightBookingService.bookFlight(1337, specialAgent);
//        System.out.println(flightBookingService.getCurrentBookingsCount());
//        flightBookingService.cancel(1337);

        HotelBookingService hotelBookingService = new HotelBookingService();
        hotelBookingService.bookHotel(128, specialAgent);
        hotelBookingService.cancel(128);

    }
}
