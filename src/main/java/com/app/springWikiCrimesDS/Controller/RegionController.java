package com.app.springWikiCrimesDS.Controller;

import com.app.springWikiCrimesDS.service.RegionService;
import com.app.springWikiCrimesDS.Entity.RegionData;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Repository
public class RegionController {
    private final RegionService regionService;

    @GetMapping("/{year}")
    public ResponseEntity<List<RegionData>> getRegionData(@PathVariable("year") Integer year){
        return ResponseEntity.ok().body(regionService.getRegionData(year));
    }
}
