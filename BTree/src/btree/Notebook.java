/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btree;

/**
 *
 * @author CC45966446830
 */
public class Notebook implements Comparable{
    private String description;
    private String title;
    private String url;
    private String price;
    private String creation_time;
    private String location;
    private String condition;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(String creation_time) {
        this.creation_time = creation_time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Notebook(String description, String title, String url, String price, String creation_time, String location, String condition) {
        this.description = description;
        this.title = title;
        this.url = url;
        this.price = price;
        this.creation_time = creation_time;
        this.location = location;
        this.condition = condition;
    }        

    @Override
    public String toString() {
        return "Notebook{" + "description=" + description + ", title=" + title + ", url=" + url + ", price=" + price + ", creation_time=" + creation_time + ", location=" + location + ", condition=" + condition + '}';
    }

    @Override
    public int compareTo(Object o) {
        int local = this.hashCode();
        int comp = o.hashCode();
        return local - comp;
    }
    
    
}
