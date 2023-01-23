package jwd59.finalTest.service.impl;

import jwd59.finalTest.model.Igrac;
import jwd59.finalTest.repository.IgracRepository;
import jwd59.finalTest.service.IgracService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JpaIgracService implements IgracService {

    @Autowired
    private IgracRepository igracRepository;

    @Override
    public List<Igrac> findAll() {
        return igracRepository.findAll();
    }

    @Override
    public Igrac findOne(Long id) {
        return igracRepository.getOne(id);
    }

	@Override
	public Igrac save(Igrac igrac) {
	 igracRepository.save(igrac);
		return null;
	}
}
