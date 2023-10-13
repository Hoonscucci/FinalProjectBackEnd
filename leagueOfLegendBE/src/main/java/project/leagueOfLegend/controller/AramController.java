package project.leagueOfLegend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.leagueOfLegend.dto.cham.ChamDto;
import project.leagueOfLegend.dto.cham.ChamResponseDto;
import project.leagueOfLegend.dto.cham.ResponseChamDto;
import project.leagueOfLegend.dto.cham.TierDto;
import project.leagueOfLegend.service.aram.AramAnalService;
import project.leagueOfLegend.service.aram.AramTierService;

@RestController
@RequestMapping("api/aram")
public class AramController {

    @Autowired
    AramAnalService aramAnalService;
    @Autowired
    AramTierService aramTierService;

    @GetMapping("/anal")
    public ResponseChamDto<ChamResponseDto> getAramAnal(@RequestBody ChamDto requestBody) {
        ResponseChamDto<ChamResponseDto> result = aramAnalService.AramAnal(requestBody);
        return result;
    }
    @GetMapping("/tier")
    public ResponseChamDto<ChamResponseDto> getAramTier() {
        ResponseChamDto<ChamResponseDto> result = aramTierService.AramTier();
        return result;
    }
}