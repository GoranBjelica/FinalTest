package jwd59.finalTest.support;

import jwd59.finalTest.model.Igrac;
import jwd59.finalTest.web.dto.IgracDTO;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IgracToIgracDto implements Converter<Igrac, IgracDTO> {
    @Override
    public IgracDTO convert(Igrac source) {
        IgracDTO dto = new IgracDTO();
        dto.setId(source.getId());
        dto.setIme(source.getIme());
        dto.setPrezime(source.getPrezime());
        dto.setPostignutiGolovi(source.getPostignutiGolovi());
        dto.setReprezentacijaNaziv(source.getReprezentacija().getNaziv());

        return dto;
    }

    public List<IgracDTO> convertAll(List<Igrac> igracs){
        List<IgracDTO> dtos = new ArrayList<>();
        for(Igrac m: igracs){
            dtos.add(convert(m));
        }

            return dtos;

    }

}
