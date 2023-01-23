package jwd59.finalTest.service.impl;

import jwd59.finalTest.model.Reprezentacija;
import jwd59.finalTest.repository.ReprezentacijaRepository;
import jwd59.finalTest.service.ReprezentacijaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JpaReprezentacijaService implements ReprezentacijaService {

    @Autowired
    private ReprezentacijaRepository reprezentacijaRepository;

    @Override
    public Reprezentacija findOne(Long id) {
        return reprezentacijaRepository.findOneById(id);
    }

    @Override
    public List<Reprezentacija> findAll() {
        return reprezentacijaRepository.findAll();
    }

    @Override
    public Reprezentacija save(Reprezentacija reprezentacija) {
        return null;
    }

    @Override
    public Reprezentacija update(Reprezentacija reprezentacija) {
        return null;
    }
}
