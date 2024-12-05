package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class App {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller seller = new Seller(21, "Books", "bob@gmail", new Date(), 3.000, obj);
		System.out.println(seller);

	}

}
