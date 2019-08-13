abstract class List{
	private int size;
	List(){
		size=0;
	}
	public void pushFront(int val){
		insert(0,val);
	}
	
	public void pushBack(int val){
		insert(size,val);
	}
	public void insert(int index,int val){
		size++;
	}
	public int getSize(){
		return size;
	}
}

class ArrayList extends List{
	private int[] arr;
	
	ArrayList(){
		super();
		arr=new int[10];
	}
	
//重写	
@Override  //注解
    public void insert(int index,int val){
		for(int i=getSize();i>index;i--){
			arr[i]=arr[i-1];
		}
		arr[index]=val;
		
		super.insert(index,val);
	}
    public void display(){
		for(int i=0;i<getSize();i++){
			System.out.println(arr[i]);
		}
	}
}
public class text3{
	public static void main(String[] args){
		List obj=new List();
		ArrayList list=new ArrayList();
		list.pushBack(1);
		list.pushBack(1);
		list.pushBack(1);
		list.pushFront(2);
		list.pushFront(2);
		list.pushFront(2);
		
		list.display();
	}
}