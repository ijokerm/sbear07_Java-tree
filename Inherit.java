class List{
	//不能直接写成private 否则子类无法访问
	//可以用protected
	protected int size;
	public int getSize(){
		return size;
	}
}
class ArrayList extends List{
	private int[] arr=new int[100];
	public void pushBack(int val){
		arr[size++]=val;
	}
}
class LinkedList extends List{
	
}
public class Inherit{
	public static void main(String[] args){
		ArrayList array=new ArrayList();
		array.pushBack(1);
		array.pushBack(2);
		array.pushBack(3);
	    array.pushBack(4);
		
		System.out.println(array.getSize());
	}
}