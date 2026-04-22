package silsub2.run;

import silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product type = new Product();
		
		type.setPName("iPhone");
		type.setPrice(1250000);
		type.setBrand("Apple");
		
		String str = type.infomation();
		System.out.println(str);

	}

}
