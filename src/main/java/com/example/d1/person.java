package com.example.d1;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.awt.event.WindowFocusListener;

@Data
@Entity
@Table(name="personasdfbbbbbb")
public class person {
    @Id
    private int id;
    @Column(name = "name")
    private String name;
}
