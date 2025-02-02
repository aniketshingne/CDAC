interface Drawable{
	void draw();
}
class Rectangle implements Drawable{
	public void draw() {
		System.out.println("Aniket");
	}
}


 class InterfaceDemo1 {

	public static void main(String[] args) {
		Drawable ref = new Rectangle();
		ref.draw();

	}

}