public class MicroScopeRunner{
public static void main(String[] args){
	MicroScope val = new MicroScope();
	val.name="A";
	val.type="new";
	val.manufacturer="local";
	val.quantity=500;
	
System.out.println("Name="+val.name);
System.out.println("Type="+val.type);
System.out.println("manufacturer="+val.manufacturer);
System.out.println("quantity="+val.quantity);

MicroScope val1 = new MicroScope();

	val1.name="A";
	val1.type="new";
	val1.manufacturer="International";
	val1.quantity=300;
	
System.out.println("Name="+val1.name);
System.out.println("Type="+val1.type);
System.out.println("manufacturer="+val1.manufacturer);
System.out.println("quantity="+val1.quantity);

MicroScope val2 = new MicroScope();
	val2.name="D";
	val2.type="new";
	val2.manufacturer="local";
	val2.quantity=700;
	
System.out.println("Name="+val2.name);
System.out.println("Type="+val2.type);
System.out.println("manufacturer="+val2.manufacturer);
System.out.println("quantity="+val2.quantity);

MicroScope val3 = new MicroScope();
	val3.name="B";
	val3.type="new";
	val3.manufacturer="foreign";
	val3.quantity=200;
	
System.out.println("Name="+val3.name);
System.out.println("Type="+val3.type);
System.out.println("manufacturer="+val3.manufacturer);
System.out.println("quantity="+val3.quantity);

MicroScope val4 = new MicroScope();
	val4.name="C";
	val4.type="new";
	val4.manufacturer="local";
	val4.quantity=600;
	
System.out.println("Name="+val4.name);
System.out.println("Type="+val4.type);
System.out.println("manufacturer="+val4.manufacturer);
System.out.println("dosage="+val4.quantity);

MicroScope val5 = new MicroScope();
	val5.name="X";
	val5.type="old";
	val5.manufacturer="foreign";
	val5.quantity=900;
	
System.out.println("Name="+val5.name);
System.out.println("Type="+val5.type);
System.out.println("manufacturer="+val5.manufacturer);
System.out.println("quantity="+val5.quantity);

MicroScope val6 = new MicroScope();
	val6.name="H";
	val6.type="new";
	val6.manufacturer="local";
	val6.quantity=100;
	
System.out.println("Name="+val6.name);
System.out.println("Type="+val6.type);
System.out.println("manufacturer="+val6.manufacturer);
System.out.println("quantity="+val6.quantity);

}
}
