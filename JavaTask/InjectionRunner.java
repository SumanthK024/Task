public class InjectionRunner{
public static void main(String[] args){
	Injection val = new Injection();
	val.name="A";
	val.type="new";
	val.manufacturer="local";
	val.dosage=500;
	
System.out.println("Name="+val.name);
System.out.println("Type="+val.type);
System.out.println("manufacturer="+val.manufacturer);
System.out.println("dosage="+val.dosage);

Injection val1 = new Injection();

	val1.name="B";
	val1.type="new";
	val1.manufacturer="local";
	val1.dosage=300;
	
System.out.println("Name="+val1.name);
System.out.println("Type="+val1.type);
System.out.println("manufacturer="+val1.manufacturer);
System.out.println("dosage="+val1.dosage);

Injection val2 = new Injection();
	val2.name="D";
	val2.type="new";
	val2.manufacturer="local";
	val2.dosage=700;
	
System.out.println("Name="+val2.name);
System.out.println("Type="+val2.type);
System.out.println("manufacturer="+val2.manufacturer);
System.out.println("dosage="+val2.dosage);

Injection val3 = new Injection();
	val3.name="B";
	val3.type="new";
	val3.manufacturer="foreign";
	val3.dosage=200;
	
System.out.println("Name="+val3.name);
System.out.println("Type="+val3.type);
System.out.println("manufacturer="+val3.manufacturer);
System.out.println("dosage="+val3.dosage);

Injection val4 = new Injection();
	val4.name="C";
	val4.type="new";
	val4.manufacturer="local";
	val4.dosage=500;
	
System.out.println("Name="+val4.name);
System.out.println("Type="+val4.type);
System.out.println("manufacturer="+val4.manufacturer);
System.out.println("dosage="+val4.dosage);

Injection val5 = new Injection();
	val5.name="E";
	val5.type="new";
	val5.manufacturer="local";
	val5.dosage=800;
	
System.out.println("Name="+val5.name);
System.out.println("Type="+val5.type);
System.out.println("manufacturer="+val5.manufacturer);
System.out.println("dosage="+val5.dosage);

Injection val6 = new Injection();
	val6.name="G";
	val6.type="new";
	val6.manufacturer="local";
	val6.dosage=100;
	
System.out.println("Name="+val6.name);
System.out.println("Type="+val6.type);
System.out.println("manufacturer="+val6.manufacturer);
System.out.println("dosage="+val6.dosage);

}
}
