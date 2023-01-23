package jwd59.finalTest.service;

import java.util.List;

import jwd59.finalTest.model.Utakmica;
import jwd59.finalTest.model.Reprezentacija;

public interface ReprezentacijaService {
    Reprezentacija findOne(Long id);

    List<Reprezentacija> findAll();

    Reprezentacija save(Reprezentacija reprezentacija);

    Reprezentacija update(Reprezentacija reprezentacija);



}
