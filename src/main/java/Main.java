public class Main {
    public static void main(String[] args){
        Customer specialAgent = new Customer("Smetanka", "Vkusnova");

      BookingService bookingService = new HotelBookingService();
      bookingService.book(1337, specialAgent);
      bookingService.cancel(1337);
        System.out.println(bookingService.getBookingsCount());
    }
}
