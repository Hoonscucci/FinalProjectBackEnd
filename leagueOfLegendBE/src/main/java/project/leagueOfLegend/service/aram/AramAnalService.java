package project.leagueOfLegend.service.aram;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.leagueOfLegend.dto.cham.ChamDto;
import project.leagueOfLegend.dto.cham.ResponseChamDto;
import project.leagueOfLegend.entity.aram.AramCham;
import project.leagueOfLegend.repository.aram.AramChamRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AramAnalService {
    private final AramChamRepository aramChamRepository;

    public ResponseChamDto AramAnal(ChamDto dto) {
        String champion_name = dto.getChampion_name();
        List list = new ArrayList();
        List<AramCham> Aramlist = new ArrayList<>();

        try {
            Aramlist = aramChamRepository.findByAramAnal(champion_name);
            list = Aramlist;
        } catch (Exception Error) {
            return ResponseChamDto.setFailed(Error.getMessage());
        }
        return ResponseChamDto.setSuccess("성공", list);
    }
}
