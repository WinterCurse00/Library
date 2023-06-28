package com.dcgteam.training.library.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
//@Table(name = ("Carte"))
//@Setter
//@Getter
//@NoArgsConstructor
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

//    @Column(name = "Name")
//    String name;
//
//    @Column(name = "Authors")
//    @OneToMany(mappedBy = "BookID", cascade = CascadeType.ALL)
//    com.dcgteam.training.library.model.Author author;
//
//    @Column(name = "Location")
//    @OneToOne()
//    @JoinColumn(name = "LocationID")
//    com.dcgteam.training.library.model.Location location;

}
