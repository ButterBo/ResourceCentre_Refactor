
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		// Write your codes here
		String output = super.toString();
<<<<<<< HEAD
		output = String.format("%-63s %-20d", output, opticalZoom);
=======
		output = String.format("%-63s %-20d",output, getOpticalZoom());
>>>>>>> branch 'master' of https://github.com/ButterBo/ResourceCentre_Refactor.git
		return output;
	}//yeah
}

