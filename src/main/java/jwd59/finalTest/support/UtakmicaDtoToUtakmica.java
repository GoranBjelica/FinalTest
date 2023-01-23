package jwd59.finalTest.support;

import jwd59.finalTest.model.Utakmica;
import jwd59.finalTest.service.ReprezentacijaService;
import jwd59.finalTest.service.UtakmicaService;
import jwd59.finalTest.web.dto.UtakmicaDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UtakmicaDtoToUtakmica implements Converter<UtakmicaDTO, Utakmica> {

    @Autowired
    private UtakmicaService utakmicaService;
    
    @Autowired
    private ReprezentacijaService reprezentacijaService;

    @Override
    public Utakmica convert(UtakmicaDTO dto) {

        Utakmica utakmica;

        if(dto.getId() == null){
            utakmica = new Utakmica();
            dto.setBrojGolovaA(0);
            dto.setBrojGolovaB(0);
        }else {
            utakmica = utakmicaService.findById(dto.getId());
        }
        if(utakmica != null) {
        	utakmica.setBrojGolovaA(dto.getBrojGolovaA());
        	utakmica.setBrojGolovaB(dto.getBrojGolovaB());
        	utakmica.setReprezentacijaA(reprezentacijaService.findOne(dto.getReprezentacijaAId()));
        	utakmica.setReprezentacijaB(reprezentacijaService.findOne(dto.getReprezentacijaBId()));
        }


        return utakmica;
    }
}
