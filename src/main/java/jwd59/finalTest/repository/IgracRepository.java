package jwd59.finalTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jwd59.finalTest.model.Igrac;

@Repository
public interface IgracRepository extends JpaRepository<Igrac, Long> {
}
