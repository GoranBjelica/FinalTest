package jwd59.finalTest.support;

import jwd59.finalTest.model.Reprezentacija;
import jwd59.finalTest.web.dto.ReprezentacijaDTO;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReprezentacijaToReprezentacijaDto implements Converter<Reprezentacija, ReprezentacijaDTO> {


    @Override
    public ReprezentacijaDTO convert(Reprezentacija reprezentacija) {
    	ReprezentacijaDTO dto = new ReprezentacijaDTO();
    	dto.setId(reprezentacija.getId());
    	dto.setNaziv(reprezentacija.getNaziv());
    	dto.setSkraceniNaziv(reprezentacija.getSkraceniNaziv());
        return dto;
    }

    public List<ReprezentacijaDTO> convertAll(List<Reprezentacija> reprezentacijas){
        List<ReprezentacijaDTO> dtos = new ArrayList<>();
        for(Reprezentacija m: reprezentacijas){
            dtos.add(convert(m));
        }
        return dtos;
    }
}
