package service;

import entities.Pet;
import entities.TYPE;

import java.util.ArrayList;
import java.util.Scanner;

public class PetService extends Pet{
    public Pet inputInfo(Scanner scanner, Enum TYPE){
        System.out.println("Mời nhập tên:");
        String name= scanner.nextLine();
        System.out.println("Mời nhập giống loài:");
        String species=scanner.nextLine();
        System.out.println("Mời nhập tuổi:");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập giới tính:");
        String sex= scanner.nextLine();
        System.out.println("Mời nhập mô tả:");
        String description= scanner.nextLine();
        System.out.println("Mời nhập loại:");

        System.out.println("Mời nhập hình ảnh:");
        String images=scanner.nextLine();
        return new Pet(name,species,age,sex,description,TYPE,images);
    }

    public void match(ArrayList<Pet> pets, String sex){
        for (Pet pet:pets){
            if (!sex.equalsIgnoreCase(pet.getSex()) && ){

            }
        }


    }
}
