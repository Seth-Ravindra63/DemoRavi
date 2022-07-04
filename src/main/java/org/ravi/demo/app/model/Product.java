package org.ravi.demo.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PRODUCT_TABLE")
public class Product {

    @Id
    @GeneratedValue
    private int productId;
    private String productName;
    private int productQuantity;
    private double productPrice;

}
