package operation;

import java.util.ArrayList;
import java.util.List;

import entity.Booking;
import entity.Moive;
import entity.Seat;
import entity.Showtime;
import userException.BookingException;

public class Features {
	private List<Moive> moiveList = new ArrayList<>();
	private List<Showtime> showtimes = new ArrayList<>();
	private List<Booking> bookings = new ArrayList<>();

	public void addMoive() {
		moiveList.add(new Moive(1, "JayHo"));
		moiveList.add(new Moive(2, "JayHo2"));
		moiveList.add(new Moive(3, "JayHo3"));
	}

	public void addMoivetime(Showtime showtime) {
		showtimes.add(showtime);
	}

	public void displayMoiveList() {
		for (Moive moive : moiveList) {
			System.out.println(moive);
		}
	}

	public void checkSeatAvailability(List<Seat> seats) {
		for (Seat seat : seats) {
			System.out.println(seat);
		}
	}

	public void bookTicket(int bookingId, Showtime showtime, List<Seat> bookedseats) throws BookingException {
		for (Seat seat : bookedseats) {
			if (!seat.isAvailable()) {
				throw new BookingException("Seat " + seat.getSeatId() + " is already booked.");
			}
		}

		for (Seat seat : bookedseats) {
			seat.setAvailable(false);
		}
		Booking booking = new Booking(bookingId, showtime, bookedseats);
		bookings.add(booking);
		System.out.println("Booking confirmed for booking ID: " + bookingId);

	}

	public void cancelBooking(String bookingId) throws BookingException {
		Booking bookingToCancel = null;

		for (Booking booking : bookings) {
			if (String.valueOf(booking.getBookingId()).equals(bookingId)) {
				bookingToCancel = booking;
				break;
			}
		}

		if (bookingToCancel == null) {
			throw new BookingException("Booking ID " + bookingId + " not found.");
		}

		for (Seat seat : bookingToCancel.getBookedseats()) {
			seat.setAvailable(true);
		}

		bookings.remove(bookingToCancel);
		System.out.println("Booking cancelled successfully. Ticket ID: " + bookingId);
	}

}
