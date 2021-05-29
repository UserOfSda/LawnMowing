package model;

import javax.persistence.*;

@Entity
@Table(name = "lawnmowing_equipment")
public class LawnMowingEquipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipment_id")
    private int equipmentId;


    @Column(name = "equipment_name")
    private String equipmentName;


    @Column(name = "work_capacity")
    private int workCapacity;

    public LawnMowingEquipment(int equipmentId, String equipmentName, int workCapacity) {
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.workCapacity = workCapacity;
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmenName() {
        return equipmentName;
    }

    public void setEquipmenName(String equipmenName) {
        this.equipmentName = equipmenName;
    }

    public int getWorkCapacity() {
        return workCapacity;
    }

    public void setWorkCapacity(int workCapacity) {
        this.workCapacity = workCapacity;
    }

    @Override
    public String toString() {
        return "LawnMowingEquipment{" +
                "equipmentId=" + equipmentId +
                ", equipmentName='" + equipmentName + '\'' +
                ", workCapacity=" + workCapacity +
                '}';
    }
}
