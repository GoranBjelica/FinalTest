package jwd59.finalTest.web.controller;

import jwd59.finalTest.model.Utakmica;
import jwd59.finalTest.model.Reprezentacija;
import jwd59.finalTest.service.UtakmicaService;
import jwd59.finalTest.support.UtakmicaDtoToUtakmica;
import jwd59.finalTest.support.UtakmicaToUtakmicaDto;
import jwd59.finalTest.web.dto.UtakmicaDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

@RestController
@RequestMapping(value = "/api/utakmice", produces = MediaType.APPLICATION_JSON_VALUE)
public class UtakmicaController {

    @Autowired
    private UtakmicaService utakmicaService;

    @Autowired
    private UtakmicaToUtakmicaDto toDto;
    
    @Autowired
    private UtakmicaDtoToUtakmica toUtakmica;

    //@PreAuthorize("hasAnyRole('KORISNIK', 'ADMIN')")
    @GetMapping
    public ResponseEntity<List<UtakmicaDTO>>getAll(
    		@RequestParam(required = false) Long reprezentacijaAId,
    		@RequestParam(required = false) Long reprezentacijaBId,
    		
    		@RequestParam(required = false, defaultValue = "0") int pageNo){
    	System.out.println(reprezentacijaAId + "            " + reprezentacijaBId);
    	if(reprezentacijaAId == null && reprezentacijaBId == null) {
       Page<Utakmica> sveUtakmice = utakmicaService.findAll(pageNo);
       
       HttpHeaders headers = new HttpHeaders();
       headers.add("Total-Pages", Integer.toString(sveUtakmice.getTotalPages()));
       return new ResponseEntity<>(toDto.convertAll(sveUtakmice.getContent()), headers, HttpStatus.OK);
    	}
    	
    	Page<Utakmica> page = utakmicaService.search(reprezentacijaAId, reprezentacijaBId, pageNo);
    	page.forEach(u -> System.out.println(u.getReprezentacijaA()));
    	  HttpHeaders headers = new HttpHeaders();
          headers.add("Total-Pages", Integer.toString(page.getTotalPages()));


        return new ResponseEntity<>(toDto.convertAll(page.getContent()), headers, HttpStatus.OK);
    }

    @PreAuthorize("hasAnyRole('KORISNIK', 'ADMIN')")
    @GetMapping(value = "/{id}")
    public ResponseEntity<UtakmicaDTO> getOne(@PathVariable Long id){
        Utakmica utakmica = utakmicaService.findById(id);
        if(utakmica != null){
            return new ResponseEntity<>(toDto.convert(utakmica), HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PreAuthorize("hasAnyRole('KORISNIK', 'ADMIN')")
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UtakmicaDTO> create(@Valid @RequestBody UtakmicaDTO utakmicaDTO){
    	
    	if(utakmicaDTO.getReprezentacijaAId() == utakmicaDTO.getReprezentacijaBId())
    		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    	if(utakmicaDTO.getReprezentacijaAId() == 0 || utakmicaDTO.getReprezentacijaBId() == 0)
    		return new ResponseEntity<UtakmicaDTO>(HttpStatus.BAD_REQUEST);
    	
    	Utakmica novaUtakmica = toUtakmica.convert(utakmicaDTO);
    	
    	utakmicaService.save(novaUtakmica);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PreAuthorize("hasAnyRole('KORISNIK', 'ADMIN')")
    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UtakmicaDTO> update(@PathVariable Long id, @Valid @RequestBody UtakmicaDTO utakmicaDTO){
        if(!id.equals(utakmicaDTO.getId())){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(utakmicaDTO.getReprezentacijaAId() == utakmicaDTO.getReprezentacijaBId())
    		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        
        Utakmica izmenjenaUtakmica = toUtakmica.convert(utakmicaDTO);
        utakmicaService.update(izmenjenaUtakmica);

        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        Utakmica deleted = utakmicaService.delete(id);

        if(deleted != null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping (value = "/povecajGolove/{id}/{reprezentacijaId}")
    public ResponseEntity<Void> povecaj (@PathVariable Long id, @PathVariable Long reprezentacijaId){
    	
    	Utakmica utakmica = utakmicaService.findById(id);
    	if(utakmica.getReprezentacijaA().getId() == reprezentacijaId) {
    		utakmica.setBrojGolovaA(utakmica.getBrojGolovaA()+1);
    	}
    	if(utakmica.getReprezentacijaB().getId() == reprezentacijaId) {
    		utakmica.setBrojGolovaB(utakmica.getBrojGolovaB() + 1);
    	}
    	utakmicaService.save(utakmica);
    	
    	return new ResponseEntity<Void>(HttpStatus.OK);
    	
    	
    }
    

   
}
