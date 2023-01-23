package jwd59.finalTest.service.impl;

import jwd59.finalTest.model.Utakmica;
import jwd59.finalTest.repository.UtakmicaRep;
import jwd59.finalTest.service.UtakmicaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Optional;

@Service
public class JpaUtakmicaService implements UtakmicaService {

    @Autowired
    private UtakmicaRep utakmicaRep;


    @Override
    public Utakmica findById(Long id) {
        return  utakmicaRep.findOneById(id);
    }

    @Override
    public Page<Utakmica> findAll(int pageNo) {
        return utakmicaRep.findAll(PageRequest.of(pageNo, 3));
    }

    @Override
    public Utakmica save(Utakmica utakmica) {
        return utakmicaRep.save(utakmica);
    }

    @Override
    public Utakmica update(Utakmica utakmica) {
        return utakmicaRep.save(utakmica);
    }

    @Override
    public Utakmica delete(Long id) {
        Optional<Utakmica> utakmica = utakmicaRep.findById(id);
        if(utakmica.isPresent()){
            utakmicaRep.deleteById(id);
            return utakmica.get();
        }
        return null;

    }

    @Override
    public Page<Utakmica> search(Long reprezentacijaAId, Long reprezentacijaBId,  int pageNo) {
    	if(reprezentacijaAId == null) {
    		return utakmicaRep.findByReprezentacijaBId(reprezentacijaBId, PageRequest.of(pageNo, 3));
    	}
    	if(reprezentacijaBId == null) {
    		return utakmicaRep.findByReprezentacijaAId(reprezentacijaAId, PageRequest.of(pageNo, 3));
    	}
    		
    		return utakmicaRep.findByReprezentacijaAIdAndReprezentacijaBId(reprezentacijaAId, reprezentacijaBId, PageRequest.of(pageNo, 3));
        
    }
    
    

    private LocalDateTime getDateConverted(String dateTime) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(dateTime, formatter);
    }
}
