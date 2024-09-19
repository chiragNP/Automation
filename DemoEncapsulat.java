package dayEnapsulation;

public class DemoEncapsulat {

	public void methodpublic()
	{
	System.out.println("Public showing");
	}
	
	protected void methodprotected()
	{
	System.out.println("Protected method showing");
	}
private void methodprivate()
{
System.out.println("Private method showing ");	
}
defl
public static void main(String[] args) {
	


DemoEncapsulat d = new DemoEncapsulat();
d.methodpublic();
d.methodprotected();
d.methodprivate();
}
}

