package jwd59.finalTest.web.controller;

import jwd59.finalTest.model.Igrac;
import jwd59.finalTest.service.IgracService;
import jwd59.finalTest.support.IgracToIgracDto;
import jwd59.finalTest.web.dto.IgracDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping(value = "/api/igraci")
@Validated
public class IgracController {

    @Autowired
    private IgracService igracService;
    
    @Autowired
    private IgracToIgracDto toDto;

    @GetMapping
    public ResponseEntity<List<IgracDTO>> getAll(){

        List<Igrac> igracs = igracService.findAll();

        return new ResponseEntity<>(toDto.convertAll(igracs), HttpStatus.OK);
    }
    
    @PutMapping (value = "/{id}")
    public ResponseEntity<Void> dodajGol(@PathVariable Long id){
    	System.out.println("Id koji stize sa fronta je: " + id);
    	Igrac igracKojiJeDaoGol = igracService.findOne(id);
    	igracKojiJeDaoGol.setPostignutiGolovi(igracKojiJeDaoGol.getPostignutiGolovi()+1);
    	igracService.save(igracKojiJeDaoGol);
    	return new ResponseEntity<>(HttpStatus.OK);
    	
    }
    
    @GetMapping (value = "/najboljiStrelac")
    public ResponseEntity<String> najboljiStrelac(){
    	List<Igrac> igraci = igracService.findAll();
    	Igrac najStrelac = igraci.stream().max(Comparator.comparing(Igrac:: getPostignutiGolovi)).orElse(null);
    	String igrac = najStrelac.getIme() + " "  + najStrelac.getPrezime();
    	return new ResponseEntity<String>(igrac, HttpStatus.OK);
    	
    	
    	
    	
    	
    }
    

}
