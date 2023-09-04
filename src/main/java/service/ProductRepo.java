package service;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepo {
    List<Product> products = new ArrayList<>();

    ProductRepo(){

        products.add( Product.builder()
                .productNumber(1)
                .name("Dell Laptop")
                .build());

        products.add( Product.builder()
                .productNumber(2)
                .name("Hp Laptop")
                .build());

        products.add( Product.builder()
                .productNumber(3)
                .name("Thinkpad Laptop")
                .build());

        products.add( Product.builder()
                .productNumber(4)
                .name("Samsumg Laptop")
                .build());

        products.add( Product.builder()
                .productNumber(5)
                .name("Huawei Laptop")
                .build());

        products.add( Product.builder()
                .productNumber(6)
                .name("Macbook")
                .build());


    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct(long id){
        return products.stream()
                .filter(p->p.getProductNumber()==id)
                .findFirst().get();
    }
}
