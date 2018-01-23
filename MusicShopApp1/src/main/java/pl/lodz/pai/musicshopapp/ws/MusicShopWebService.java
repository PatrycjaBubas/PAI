/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.pai.musicshopapp.ws;

import java.math.BigDecimal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pl.lodz.pai.musicshopapp.entities.Categories;
import pl.lodz.pai.musicshopapp.entities.Products;
import pl.lodz.pai.musicshopapp.model.Product;
import pl.lodz.pai.musicshopapp.services.CategoryBean;
import pl.lodz.pai.musicshopapp.services.ProductBean;

/**
 *
 * @author pawel
 */
@WebService(serviceName = "MusicShopWebService")
public class MusicShopWebService {

    @EJB
    public ProductBean productBean;
    
    @EJB
    public CategoryBean categoryBean;
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
//    @WebMethod(operationName = "getAllProducts")
//    public List<Product> getAllProducts() {
//        return productBean.getAllproducts();
//    }

    @WebMethod(operationName = "getAllProducts")
    public List<Products> getAllProducts() {
        return productBean.getAllProducts();
    }
    
    @WebMethod(operationName = "getAllCategories")
    public List<Categories> getAllCategories() {
        return categoryBean.getAllCategories();
    }
    
    /**
     * Web service operation
     */
//    @WebMethod(operationName = "addNewProduct")
//    public void addNewProduct(@WebParam(name = "id") int id, 
//            @WebParam(name = "name") String name,
//            @WebParam(name = "amount") int amount, 
//            @WebParam(name = "price") double price,
//            @WebParam(name = "description") String desc) {
//        
//        Product newProduct = new Product(id, name, amount, price, desc);
//        productBean.addProduct(newProduct);
//
//    }
    
        /**
     * Web service operation
     */
    @WebMethod(operationName = "addNewProduct")
    public void addNewProduct(@WebParam(name = "id") BigDecimal id, 
            @WebParam(name = "name") String name,
            @WebParam(name = "price") BigDecimal price,
            @WebParam(name = "amount") long amount) {
        //TODO write your implementation code here:
        
        Products newProduct = new Products(id, name, price, amount);
        productBean.addProduct(newProduct);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "removeProduct")
    public void removeProduct(@WebParam(name = "id") int id) {
       // productBean.removeProduct(id);
    }
    
}
