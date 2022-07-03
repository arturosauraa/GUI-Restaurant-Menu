/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuis;

/**
 *
 * @author Usuario
 */
public class Dish {
    public int dish_no;
    public int price;
    public String dish_name;
    public String category;
    public String spiciness;

    public Dish() {
    }

    public Dish(int dish_no, int price, String dish_name, String category, String spiciness) {
        this.dish_no = dish_no;
        this.price = price;
        this.dish_name = dish_name;
        this.category = category;
        this.spiciness = spiciness;
    }

    public int getDish_no() {
        return dish_no;
    }

    public void setDish_no(int dish_no) {
        this.dish_no = dish_no;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDish_name() {
        return dish_name;
    }

    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSpiciness() {
        return spiciness;
    }

    public void setSpiciness(String spiciness) {
        this.spiciness = spiciness;
    }
    
    
}

