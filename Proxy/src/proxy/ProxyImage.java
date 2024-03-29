package proxy;

class ProxyImage implements Image {
	private final String filename;
	private RealImage image;
	private String name;

	/**
	 * Constructor
	 * 
	 * @param filename
	 */
	public ProxyImage(String filename, String name) {
		this.filename = filename;
		this.name = name;
	}

	/**
	 * Displays the image
	 */
	public void displayImage() {
		if (image == null) {
			image = new RealImage(filename, name);
		}
		image.displayImage();
	}
	
	public void showData() {
		System.out.println("Kuvan nimi: " + name);
	}
}
