package com.Springpro.Springpro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Purchase")

public class Select {

    @Id
    @Column(name = "User_ID")
    private int id;

    @Column(name = "Amount")
    private int amount;

    @Column(name = "Place")
    private String place;

}
