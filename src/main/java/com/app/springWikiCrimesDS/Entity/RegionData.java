package com.app.springWikiCrimesDS.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

import static javax.persistence.GenerationType.*;

@Entity @Data
@NoArgsConstructor @AllArgsConstructor
public class RegionData {
    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
    private String crimes;
    private Integer population;
    private Double rr;
    private Double sir;
    private Integer month;
    private Integer year;
}