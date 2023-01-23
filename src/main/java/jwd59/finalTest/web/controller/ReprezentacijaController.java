package jwd59.finalTest.web.controller;

import jwd59.finalTest.model.Igrac;
import jwd59.finalTest.model.Reprezentacija;
import jwd59.finalTest.service.ReprezentacijaService;
import jwd59.finalTest.support.IgracToIgracDto;
import jwd59.finalTest.support.ReprezentacijaToReprezentacijaDto;
import jwd59.finalTest.web.dto.IgracDTO;
import jwd59.finalTest.web.dto.ReprezentacijaDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/reprezentacije", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class ReprezentacijaController {

    @Autowired
    private ReprezentacijaService reprezentacijaService;
    
    @Autowired
    private ReprezentacijaToReprezentacijaDto toDto;
    
    @Autowired
    private IgracToIgracDto toIgracDto;

    @GetMapping
    public ResponseEntity<List<ReprezentacijaDTO>> getAll(){

        List<Reprezentacija> reprezentacijas = reprezentacijaService.findAll();

        return new ResponseEntity<>(toDto.convertAll(reprezentacijas), HttpStatus.OK);
    }
    
    @GetMapping (value = "/{id}")
    public ResponseEntity<List<IgracDTO>> igraci(@PathVariable Long id){
    	List<Igrac> igraci = reprezentacijaService.findOne(id).getIgraci();
    	
    	return new ResponseEntity<List<IgracDTO>>(toIgracDto.convertAll(igraci), HttpStatus.OK);
    }
}
