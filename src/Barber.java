import java.sql.SQLOutput;
import java.util.*;

public class Barber extends Human {
    private Float rate;
    private Integer review = 0;
    public Integer numberOfReviews = 0;
    // public List<String> serviceList = new ArrayList();
    public Map<String, Integer> serviceList = new HashMap();

    public Barber(String name, String surname, String email, String birthday, Integer phone, Integer priceHaircut) throws InfoException {
        super(name, surname, email, birthday, phone);
        serviceList.put("Haircut", priceHaircut);
        rate = 0.0f;
    }

    public void barberReview(Integer review) {
        if (review <= 5 && review >= 0) {
            numberOfReviews++;
            this.review += review;
            this.rate = (float) this.review / numberOfReviews;
        } else {
            System.out.println("Please, select one of the given reviews for rating");
        }
    }

    public Integer getNumberOfReviews() {
        return numberOfReviews;
    }

    public Float getRate() {
        return rate;
    }

    public void addServiceList(String serviceType, Integer servicePrice) {
        serviceList.put(serviceType, servicePrice);
    }

    public void printServiceList() {
        System.out.println("\nServices: ");
        for (String service : serviceList.keySet()) {
            System.out.println(service + ": " + serviceList.get(service) + " AZN");
        }
    }
    public String toString () {
       return super.toString() + "\nRate: " + getRate() +
                                "\nCustomers: " + getNumberOfReviews();
    }
}


   /* public void printServiceList () {
        ListIterator<String> litr = null;
        litr=serviceList.listIterator();
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
    }*/

