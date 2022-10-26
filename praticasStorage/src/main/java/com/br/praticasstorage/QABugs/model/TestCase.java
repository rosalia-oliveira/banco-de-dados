package com.br.praticasstorage.QABugs.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
@Setter
public class TestCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_case;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private boolean tested;

    @Column(nullable = false)
    private boolean passed;

    @Column(nullable = false)
    private int number_of_tries;

    @Column(name = "last_update", columnDefinition = "Date")
    private LocalDate lastUpdate;
}
