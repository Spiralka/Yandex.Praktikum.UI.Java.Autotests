public class HotelBookingService {
    private int bookingsCount;

    public void bookHotel(int id, Customer customer){
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

    public int getCurrentBookingsCount(){
        return bookingsCount;
    }
}
