package com.app.springWikiCrimesDS.Repository;

import com.app.springWikiCrimesDS.Entity.RegionData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<RegionData, Integer> {
    List<RegionData> getByYear(Integer year);
}