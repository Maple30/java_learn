import test.HotDogStand;

public class main {

	public static void main(String[] args) {
		HotDogStand Store01 = new HotDogStand("Taipei Branch");
		HotDogStand Store02 = new HotDogStand("Taichung Branch");
		HotDogStand Store03 = new HotDogStand("Kaohsiung Branch");
		
		Store01.justSold(5);
		Store01.justSold(7);
		Store01.justSold(9);
		Store02.justSold(1);
		Store02.justSold(4);
		Store02.justSold(5);
		Store03.justSold(6);
		Store03.justSold(7);
		Store03.justSold(9);
		System.out.printf("Stand Name: %s %5d\n", Store01.getstandName(), Store01.getsold());
		System.out.printf("Stand Name: %s %3d\n", Store02.getstandName(), Store02.getsold());
		System.out.printf("Stand Name: %s %2d\n", Store03.getstandName(), Store03.getsold());
		System.out.printf("Total Sold: %d\n", HotDogStand.getTotalSold());
	}

}
