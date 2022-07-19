
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		// Write your codes here
		String output = super.toString();
<<<<<<< HEAD
		output = String.format("%-63s %-20s", output, os);
=======
		output = String.format("%-63s %-20s",output, getOs());
>>>>>>> branch 'master' of https://github.com/ButterBo/ResourceCentre_Refactor.git
		return output;
	}//Yeah
}


