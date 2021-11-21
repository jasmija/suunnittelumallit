package proxy;

class RealImage implements Image {
	private final String filename;
	private final String name;

	/**
	 * Constructor
	 * 
	 * @param filename
	 */
	public RealImage(String filename, String name) {
		this.filename = filename;
		this.name = name;
		loadImageFromDisk();
	}

	/**
	 * Loads the image from the disk
	 */
	private void loadImageFromDisk() {
		System.out.println("Loading   " + filename);
	}

	/**
	 * Displays the image
	 */
	public void displayImage() {
		System.out.println("Displaying " + filename);
	}
	
	public void showData() {
		System.out.println("Kuvan nimi: " + name);
	}
}
