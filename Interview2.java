//执行顺序
class Base{
	{
	System.out.println("Base的构造代码块1");
    } 
    Base(){
		System.out.println("Base的构造方法");
	}
	static{
		System.out.println("Base的静态代码块1");
	}
	{
		System.out.println("Base的构造代码块2");
	}
	static{
		System.out.println("Base的静态代码块2");
	}
}


class Derived extends Base{
	{
	System.out.println("Derived的构造代码块1");
    } 
    Derived(){
		this(18);
		System.out.println("Derived的无参构造方法");
	}
	Derived(int n){
		super();
		System.out.println("Derived的有参构造方法");
	}
	static{
		System.out.println("Derived的静态代码块1");
	}
	{
		System.out.println("Derived的构造代码块2");
	}
	static{
		System.out.println("Derived的静态代码块2");
	}
}
public class Interview2{
	public static void main(String[] args){
		System.out.println("开始");
		new Derived();
		new Derived();
		System.out.println("结束");
	}
}