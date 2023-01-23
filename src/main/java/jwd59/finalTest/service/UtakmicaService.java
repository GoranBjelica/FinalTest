package jwd59.finalTest.service;


import org.springframework.data.domain.Page;

import jwd59.finalTest.model.Utakmica;

import java.util.List;
import java.util.Optional;

public interface UtakmicaService {
    

    Utakmica findById(Long id);

    Page<Utakmica> findAll(int pageNo);

    Utakmica save(Utakmica utakmica);

    Utakmica update(Utakmica utakmica);

    Utakmica delete(Long id);

    Page<Utakmica> search(Long reprezentacijaAid, Long reprezentacijaBId,  int pageNo);
}
