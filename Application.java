
public class Application {

	public static void main(String[] args) {

		Item<String> s = new Item<String>();
		s.setE("Jonathan");
		Item<Integer> s1 = new Item<Integer>();
		s1.setE(1);

		SmallBag<Item> SmallBag1 = new SmallBag<Item>();
		SmallBag1.setItem(s);
		
		
		System.out.println(SmallBag1.getItem().getE());
		SmallBag1.setItem(s1);
		System.out.println(SmallBag1.getItem().getE());
	}

}
