

INSERT INTO korisnik (id, e_mail, korisnicko_ime, lozinka, ime, prezime, uloga)
              VALUES (1,'miroslav@maildrop.cc','miroslav','$2y$12$NH2KM2BJaBl.ik90Z1YqAOjoPgSd0ns/bF.7WedMxZ54OhWQNNnh6','Miroslav','Simic','ADMIN');
INSERT INTO korisnik (id, e_mail, korisnicko_ime, lozinka, ime, prezime, uloga)
              VALUES (2,'tamara@maildrop.cc','tamara','$2y$12$DRhCpltZygkA7EZ2WeWIbewWBjLE0KYiUO.tHDUaJNMpsHxXEw9Ky','Tamara','Milosavljevic','KORISNIK');
INSERT INTO korisnik (id, e_mail, korisnicko_ime, lozinka, ime, prezime, uloga)
              VALUES (3,'petar@maildrop.cc','petar','$2y$12$i6/mU4w0HhG8RQRXHjNCa.tG2OwGSVXb0GYUnf8MZUdeadE4voHbC','Petar','Jovic','KORISNIK');
INSERT INTO korisnik (id, e_mail, korisnicko_ime, lozinka, ime, prezime, uloga)
			  VALUES (4, 'goranb17@gmail.com', 'goran', '$2a$10$gCwpthXLMhSqmom7Mn5FYORquNNt9rK78yYDZf5SJXbE8Aiyq3Tsu', 'Goran', 'Bjelica', 'ADMIN');
			  



INSERT INTO rezultati.reprezentacija (naziv, skraceni_naziv) VALUES ('Srbija', 'Srb');
INSERT INTO rezultati.reprezentacija (naziv, skraceni_naziv) VALUES ('Gruzija', 'Gru');
INSERT INTO rezultati.reprezentacija (naziv, skraceni_naziv) VALUES ('Brazil', 'Bra');
INSERT INTO rezultati.reprezentacija (naziv, skraceni_naziv) VALUES ('Kolumbija', 'Kol');
INSERT INTO rezultati.reprezentacija (naziv, skraceni_naziv) VALUES ('Kamerun', 'Kam');
INSERT INTO rezultati.reprezentacija (naziv, skraceni_naziv) VALUES ('Nigerija', 'Nig');

INSERT INTO rezultati.utakmica(broj_golovaa, broj_golovab, reprezentacijaa_id, reprezentacijab_id) VALUES (1,1, 1, 2);
INSERT INTO rezultati.utakmica(broj_golovaa, broj_golovab, reprezentacijaa_id, reprezentacijab_id) VALUES (2,2, 1, 3);
INSERT INTO rezultati.utakmica(broj_golovaa, broj_golovab, reprezentacijaa_id, reprezentacijab_id) VALUES (3,3, 2, 3);
INSERT INTO rezultati.utakmica(broj_golovaa, broj_golovab, reprezentacijaa_id, reprezentacijab_id) VALUES (4,4, 3, 4);
INSERT INTO rezultati.utakmica(broj_golovaa, broj_golovab, reprezentacijaa_id, reprezentacijab_id) VALUES (5,5, 4, 5);
INSERT INTO rezultati.utakmica(broj_golovaa, broj_golovab, reprezentacijaa_id, reprezentacijab_id) VALUES (6,6, 5, 6);


INSERT INTO rezultati.igrac (ime, postignuti_golovi, prezime, reprezentacija_id) VALUES ('Aleksandar', 1, 'Mitrovic', 1);
INSERT INTO rezultati.igrac (ime, postignuti_golovi, prezime, reprezentacija_id) VALUES ('Vanja', 0, 'Milinkovic Savic', 1);
INSERT INTO rezultati.igrac (ime, postignuti_golovi, prezime, reprezentacija_id) VALUES ('Dusan', 1, 'Vlahovic', 1);
INSERT INTO rezultati.igrac (ime, postignuti_golovi, prezime, reprezentacija_id) VALUES ('Dusan', 1, 'Tadic', 1);
INSERT INTO rezultati.igrac (ime, postignuti_golovi, prezime, reprezentacija_id) VALUES ('Gabrijel', 5, 'Zesus', 3);
INSERT INTO rezultati.igrac (ime, postignuti_golovi, prezime, reprezentacija_id) VALUES ('Artur', 4, 'Melo', 3);
INSERT INTO rezultati.igrac (ime, postignuti_golovi, prezime, reprezentacija_id) VALUES ('Filipe', 1, 'Luiz', 3);
INSERT INTO rezultati.igrac (ime, postignuti_golovi, prezime, reprezentacija_id) VALUES ('Eder', 1, 'Militao', 3);
