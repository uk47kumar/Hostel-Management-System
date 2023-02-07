package com.hostel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Hostel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int hostelId;
    private String name;
    private String type;
    private String noOfRoom;
    private String address;
    private String annualExp;
    @OneToOne(mappedBy = "hostel")
    private Warden warden;
}
