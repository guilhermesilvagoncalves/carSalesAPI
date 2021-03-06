package com.br.carsAPI.model;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand;
    private String model;
    private BigDecimal value;
    @CreatedDate
    private LocalDate createdAt;

    public Car (){

    }

    public Car(Car car) {
        this.brand = car.getBrand();
        this.model = car.getModel();
        this.value = car.getValue();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Car [" +
                "id: " + this.getId() +
                ", brand: " + this.getBrand() +
                ", model: " + this.getModel() +
                ", valuer: " + this.getValue() +
                ", createdAt: " + this.getCreatedAt() +
                "]";
    }
}
