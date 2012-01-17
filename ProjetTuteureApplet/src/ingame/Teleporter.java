package ingame;

import org.newdawn.slick.geom.Rectangle;

public class Teleporter extends Rectangle{
	private String idMapDepart;
	private String idMapDestination;
	private int destinationX;
	private int destinationY;
	private boolean safe;
	
	public Teleporter(float x, float y, float width, float height,
			String idMapDepart, String idMapDestination, int destinationX,
			int destinationY, boolean safe) {
		super(x, y, width, height);
		this.idMapDepart = idMapDepart;
		this.idMapDestination = idMapDestination;
		this.destinationX = destinationX;
		this.destinationY = destinationY;
		this.safe = safe;
	}

	public String getIdMapDepart() {
		return idMapDepart;
	}

	public String getIdMapDestination() {
		return idMapDestination;
	}

	public int getDestinationX() {
		return destinationX;
	}

	public int getDestinationY() {
		return destinationY;
	}

	public boolean isSafe() {
		return safe;
	}
	
	
	
}
