package model;

import javax.persistence.*;

@Entity
@Table(name = "workschedule")
public class Workschedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "workschedule_id")
    private int workscheduleId;

    @ManyToOne
    @JoinColumn(name = "lawnmower_id")
    private LawnMowers lawnMowers;

    @ManyToOne
    @JoinColumn(name = "equipment_id")
    private LawnMowingEquipment lawnMowingEquipment;

    public Workschedule(int workscheduleId) {
        this.workscheduleId = workscheduleId;
    }

    public int getWorkscheduleId() {
        return workscheduleId;
    }

    public void setWorkscheduleId(int workscheduleId) {
        this.workscheduleId = workscheduleId;
    }

    @Override
    public String toString() {
        return "Workschedule{" +
                "workscheduleId=" + workscheduleId +
                '}';
    }
}
