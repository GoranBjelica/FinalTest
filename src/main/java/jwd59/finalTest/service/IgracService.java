package jwd59.finalTest.service;

import java.util.List;

import jwd59.finalTest.model.Igrac;

public interface IgracService {

    List<Igrac> findAll();
    Igrac findOne(Long id);
    Igrac save(Igrac igrac);
}
