package com.kodluyoruzTubaAcar;

public class Main {

    public static void main(String[] args) {
	//CRUD(Create, read, update and delete)
        //Category Controller
        // /categories/{id}/parent -> get.category;
         //       /categories/{id}/products -> get.products;
        //        /categories/{id}/subcategories -> get.subcategories
import java.util.List;

	    @RestController
public class CategoryController {
   
    @RequestMapping("/categories")
  
    public CategoryController(){
    }

    @GetMapping("/categories/{id}/parent")
    @ResponseBody
    public getItem(itemId){
       return new conroller);
    }

   @GetMapping("/categories/{id}/subCategories")
    
    public getItem( itemId){
     
        return new ıtem;
    }
   @GetMapping("/categories/{id}/products")
    @ResponseBody
    public getItem( itemId){
       
        return new ResponseEntity<Item>);
    }
	
        //Product Controller
        //CRUD(Create, read, update and delete)
        @Controller
        public class ProductController {
            private final Product;


            @Get
            public getProduct(int id) {
                return getProduct(id);
            }

            @Put
            public updateProduct(int id) {
                return (id, request);
            }

            @Delete
            public void Product {
                service.deleteProduct(id);
            }
        }

        //Basket Controller

        @RestController
        @RequiredArgsConstructor
        @RequestMapping("baskets")
        public class BasketController {
            private final Basket basket;

            @PostMapping
            public @basketcontroller{
                return basket.createBasket(request);
            }
            @deleteMapping
            public void deleteBasket( int id){
                basket.delete(id);
            }
            @getmapping
            public Basket getActiveBasket(int userId){
                return basket.getActiveBasket(userId);
            }
            @PutMapping
            public void makeNoActiveBasket(int id){
                basket.makeNotActiveBasket(id);
            }
           //Checkout Controller

            @RequiredArgsConstructor
            @RestController
            @RequestMapping("checkouts")
            public class Checkout {
                private final Checkout checkout;
                @GetMapping("{userId}")
                public BasketItems(int userId) {
                    return userId;
                }
                @PostMapping
                public createOrder(int userId) {
                    return userId;
                }
            }

    }
}
