package com.dcgteam.training.library.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.dcgteam.training.library.model.Author;
import com.dcgteam.training.library.model.Location;

import javax.persistence.*;

@Entity
@Table(name = ("Carte"))
@Setter
@Getter
@NoArgsConstructor
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "Name")
    String name;

    @Column(name = "Authors")
    @OneToMany(mappedBy = "BookID", cascade = CascadeType.ALL)
    Author author;

    @Column(name = "Location")
    @OneToOne()
    @JoinColumn(name = "LocationID")
    Location location;







}
