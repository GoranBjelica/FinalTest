package jwd59.finalTest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jwd59.finalTest.model.Utakmica;

@Repository
public interface UtakmicaRep extends JpaRepository<Utakmica, Long> {

    Utakmica findOneById(Long id);

    Utakmica save(Utakmica utakmica);

   Page<Utakmica> findByReprezentacijaAIdAndReprezentacijaBId(Long reprezentacijaAId, Long reprezentacijaBId, Pageable pageable);
   
   Page<Utakmica> findAll(Pageable pageable);
   
   Page<Utakmica> findByReprezentacijaAId(Long reprezentacijaAId,  Pageable pageable);
   
   Page<Utakmica> findByReprezentacijaBId( Long reprezentacijaBId, Pageable pageable);
  
}
