package LinkList;

public class TestingLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList<Integer> list=new LinkList<Integer>();
		System.out.println(list.toString());
		list.add(12);
		//System.out.println("a sdf");
		list.add(23);
		list.add(24);
		//System.out.println("a sdf");
		list.add(26);
		list.add(12);
		list.add(12);
		System.out.println(list.toString());

	}

}
