package entity;

import java.util.List;

public class Booking {

	private int bookingId;
	private Showtime showtime;
	private List<Seat> bookedseats;

	public Booking(int bookingId, Showtime showtime, List<Seat> bookedseats) {
		this.bookingId = bookingId;
		this.showtime = showtime;
		bookedseats = bookedseats;
	}

	public int getBookingId() {
		return bookingId;
	}

	public Showtime getShowtime() {
		return showtime;
	}

	public List<Seat> getBookedseats() {
		return bookedseats;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", showtime=" + showtime + ", bookedseats=" + bookedseats + "]";
	}

}
