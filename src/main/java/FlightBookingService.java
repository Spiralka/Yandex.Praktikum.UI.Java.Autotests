public class FlightBookingService {
    private int bookingsCount;

    public void bookFlight(int id, Customer customer){
        System.out.println("Бронь №" + id + ": " + customer.getFullName());
        bookingsCount++;
    }

    public void cancel(int id){
        if (bookingsCount==0){
            System.out.println("Никаких броней нет, отменять нечего");
        } else {
            System.out.println("Бронь с айдишником " + id + " отменена");
            bookingsCount--;
        }
    }

    public int getCurrentBookingsCount(){
        return bookingsCount;
    }
}
