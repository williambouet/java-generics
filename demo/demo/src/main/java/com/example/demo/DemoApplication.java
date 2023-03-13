package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.Apple;
import com.example.demo.models.Banana;
import com.example.demo.models.Pear;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		// Premier exemple avec un instanceOf pour sécuriser le cast
		FixedSizeList fixedSizeList = new FixedSizeList();
		Apple apple1 = new Apple();
		Banana banana1 = new Banana();
		Pear pear1 = new Pear();

		fixedSizeList.add(apple1);
		fixedSizeList.add(banana1);
		fixedSizeList.add(pear1);

		for (int i = 0; i < 5; i++) {
			if (fixedSizeList.get(i) instanceof Apple) {
				Apple apple2 = (Apple) fixedSizeList.get(i);
				System.out.println("le fruit " + Integer.toString(i) + " est de type Apple");
			}

			if (fixedSizeList.get(i) instanceof Banana) {
				Banana banana2 = (Banana) fixedSizeList.get(i);
				System.out.println("le fruit " + Integer.toString(i) + " est de type Banana");
			}

			if (fixedSizeList.get(i) instanceof Pear) {
				Pear pear2 = (Pear) fixedSizeList.get(i);
				System.out.println("le fruit " + Integer.toString(i) + " est de type Pear");
			}


		}


		// Second exemple avec des génériques
		GenericFixedSizeList<Apple> genericFixedSizeList = new GenericFixedSizeList(Apple.class, 5 );
		genericFixedSizeList.add(apple1);
		System.out.println("le fruit est de type " +  genericFixedSizeList.get(0).getClass().getName());
		
		GenericFixedSizeList<Banana> genericFixedSizeListOfBanana = new GenericFixedSizeList(Banana.class, 5 );
		genericFixedSizeListOfBanana.add(banana1);
		System.out.println("le fruit est de type " +  genericFixedSizeListOfBanana.get(0).getClass().getName());

	}

}
