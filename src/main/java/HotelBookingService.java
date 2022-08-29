public class HotelBookingService implements BookingService {
    private int bookingsCount;

    public void book(int id, Customer customer){
        System.out.println("Отель. Бронь №" + id + ": " + customer.getFullName());
        bookingsCount++;
    }

    public void cancel(int id){
        if (bookingsCount==0){
            System.out.println("Никаких отельных броней нет, отменять нечего");
        } else {
            System.out.println("Отель. Бронь с айдишником " + id + " отменена");
            bookingsCount--;
        }
    }

    public int getBookingsCount(){
        return bookingsCount;
    }
}
