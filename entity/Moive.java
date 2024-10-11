package entity;

public class Moive {
	private int moiveid;
	private String title;

	public Moive(int moiveid, String title) {

		this.moiveid = moiveid;
		this.title = title;
	}

	public int getMoiveid() {
		return moiveid;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Moive [moiveid=" + moiveid + ", title=" + title + "]";
	}

}
