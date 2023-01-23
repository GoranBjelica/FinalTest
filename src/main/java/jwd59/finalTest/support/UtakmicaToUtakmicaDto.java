package jwd59.finalTest.support;

import jwd59.finalTest.model.Utakmica;
import jwd59.finalTest.web.dto.UtakmicaDTO;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UtakmicaToUtakmicaDto implements Converter<Utakmica, UtakmicaDTO> {


    @Override
    public UtakmicaDTO convert(Utakmica utakmica) {
    	UtakmicaDTO dto = new UtakmicaDTO();
    	dto.setId(utakmica.getId());
    	dto.setReprezentacijaAId(utakmica.getReprezentacijaA().getId());
    	dto.setReprezentacijaANaziv(utakmica.getReprezentacijaA().getNaziv());
    	dto.setReprezentacijaBId(utakmica.getReprezentacijaB().getId());
    	dto.setReprezentacijaBNaziv(utakmica.getReprezentacijaB().getNaziv());
    	dto.setBrojGolovaA(utakmica.getBrojGolovaA());
    	dto.setBrojGolovaB(utakmica.getBrojGolovaB());

        return dto;
    }

    public List<UtakmicaDTO> convertAll(List<Utakmica> utakmicas){
        List<UtakmicaDTO> dtos = new ArrayList<>();

        for(Utakmica m: utakmicas){
            dtos.add(convert(m));
        }

        return dtos;
    }
}
