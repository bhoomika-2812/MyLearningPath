package com.oops;

class Customer implements Cloneable{
	int cid;
	String cname;
	Address address;
	
	
	public Customer(int cid, String cname, Address address) {
		this.cid = cid;
		this.cname = cname;
		this.address = address;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

class Address{
	String city;

	public Address(String city) {
		this.city = city;
	}
	
	
}
public class CustomerShallowCopyDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address add = new Address("Ongole");
		Customer c1 = new Customer(1,"Bhoomi",add);
		System.out.println(c1.cid); // 1
		System.out.println(c1.cname); // Bhoomi
		System.out.println(c1.address.city); // Ongole
		
		System.out.println("-----------------------------");
	
		Customer c2 = (Customer)c1.clone();
		System.out.println(c2.cid); // 1
		System.out.println(c2.cname); // Bhoomi
		System.out.println(c2.address.city); // Ongole
		
		System.out.println("-------After Modifying the Internal Object data-------------");
		
		c2.cid = 2;
		c2.cname = "Vijay";
		c2.address.city = "Hyderabad";
		
		System.out.println(c2.cid);
		System.out.println(c2.cname);
		System.out.println(c2.address.city);
		
		//Internal objects shared same copy for all objects..
		System.out.println("C1 Address : " + c1.address.city);
	}

}
