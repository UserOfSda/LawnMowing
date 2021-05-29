package model;

import javax.persistence.*;

@Entity
@Table(name ="pricing")
public class Pricing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "price_id")
    private int priceId;


    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "workschedule_id")
    private Workschedule workschedule;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customers;

    public Pricing(int priceId, String description) {
        this.priceId = priceId;
        this.description = description;
    }

    public int getPriceId() {
        return priceId;
    }

    public void setPriceId(int priceId) {
        this.priceId = priceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Pricing{" +
                "priceId=" + priceId +
                ", description='" + description + '\'' +
                '}';
    }
}
