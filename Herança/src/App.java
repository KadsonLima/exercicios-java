import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Digite a quantidade de Produtos:");

        Scanner sc = new Scanner(System.in);
        int quantityProduct = sc.nextInt();
        List<Product> list = new ArrayList<>();
        for (int i = 0; i < quantityProduct; i++) {
            System.out.println("Product #"+(i+1)+" data:");
            System.out.print("Common, used or imported (c/u/i)");
            char typeProduct = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name:");
            String name = sc.nextLine();
            System.out.print("Price:");
            Double price = sc.nextDouble();

            if(typeProduct == 'c'){
                list.add(new Product(name, price));
            }else if(typeProduct == 'i'){
                System.out.print("Customs Fee:");
                Double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }else if (typeProduct == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY):");
                String dateString = sc.next();
                SimpleDateFormat f = new SimpleDateFormat("DD/MM/YYYY");
                Date date = f.parse(dateString);
                list.add(new UsedProduct(name, price, date));
            }
        }

        for (Product product : list) {
            System.out.println(product.priceTag());
        }
        


        sc.close();
    }
}
