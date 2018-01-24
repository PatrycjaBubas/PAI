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
    public void addNewProduct(@WebParam(name = "id") Double id, 
            @WebParam(name = "name") String name,
            @WebParam(name = "price") Double price,
            @WebParam(name = "amount") long amount,
            @WebParam(name = "description") String desc,
            @WebParam(name = "catName") String catName) {
        //TODO write your implementation code here:
        BigDecimal price_ = new BigDecimal(price);
        BigDecimal id_ = new BigDecimal(id);
        Categories category = categoryBean.findCategoryByName(catName);
        Products newProduct = new Products(id_, name, price_, amount, desc, category);
        productBean.addProduct(newProduct);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "removeProduct")
    public void removeProduct(@WebParam(name = "id") int id) {
        BigDecimal id_ = new BigDecimal(id);
        productBean.removeProduct(id_);
    }
    
    @WebMethod(operationName = "addNewCategory")
    public void addNewCategory(@WebParam(name = "id") int id, 
            @WebParam(name = "name") String name) {
        //TODO write your implementation code here:
        BigDecimal id_ = new BigDecimal(id);
        Categories newCategory = new Categories(id_, name);
        categoryBean.addCategory(newCategory);
    }
}
