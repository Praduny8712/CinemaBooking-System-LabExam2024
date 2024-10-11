package entity;

import java.util.List;

public class Showtime {
	private int showtimeId;
	private Moive moive;
	private List<Seat> seats;

	public Showtime(int showtimeId, Moive moive, List<Seat> seats) {
		
		this.showtimeId = showtimeId;
		this.moive = moive;
		this.seats = seats;
	}

	public int getShowtimeId() {
		return showtimeId;
	}

	public Moive getMoive() {
		return moive;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	@Override
	public String toString() {
		return "Showtime [showtimeId=" + showtimeId + ", moive=" + moive + ", seats=" + seats + "]";
	}

}
