package com.app.springWikiCrimesDS.service;

import com.app.springWikiCrimesDS.Entity.RegionData;
import com.app.springWikiCrimesDS.Repository.RegionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service @Transactional @RequiredArgsConstructor

public class RegionService {

    private final RegionRepository regionRepository;

    public List<RegionData> getRegionData(Integer year) {
        return regionRepository.getByYear(year);
    }
}
