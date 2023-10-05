package project.leagueOfLegend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.leagueOfLegend.dto.ResponseDto;
import project.leagueOfLegend.dto.WidgetOneDto;
import project.leagueOfLegend.dto.WidgetResponseDto;
import project.leagueOfLegend.dto.WidgetTwoDto;
import project.leagueOfLegend.entity.WidgetOne;
import project.leagueOfLegend.entity.WidgetTwo;
import project.leagueOfLegend.service.WidgetService;

@RestController
@RequestMapping("api/widget")
public class WidgetController {
    @Autowired WidgetService widgetService;

    @PutMapping("/one")
    public ResponseDto<WidgetResponseDto> updateColumnOne(@RequestBody WidgetOneDto requestBody)
    {
        ResponseDto<WidgetResponseDto> result =  widgetService.updateWidgetOne(requestBody);
        return result;
    }

    @PutMapping("/two")
    public ResponseDto<WidgetResponseDto> updateColumnTwo(@RequestBody WidgetTwoDto requestBody) {
        ResponseDto<WidgetResponseDto> result =  widgetService.updateWidgetTwo(requestBody);
        return result;
    }
}
