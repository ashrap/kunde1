package com.example.obligfinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KundeRepository {
    @Autowired
    private JdbcTemplate db;

    public void lagreKunde(Kunde innKunde) {
        String sql="INSERT INTO Kunde (fornavn,etternavn,telefonnr,epost,antall,film) VALUES(?,?,?,?,?,?)";
        db.update(sql,innKunde.getFornavn(),innKunde.getEtternavn(),innKunde.getTelefonnr(),innKunde.getEpost(),innKunde.getAntall(),innKunde.getFilm());
    }
public List<Kunde> hentAlleKunder() {
        String sql="SELECT * FROM Kunde";
        List<Kunde> alleBilletter=db.query(sql,new BeanPropertyRowMapper(Kunde.class));
        return alleBilletter;
}

public void slettAlleKunder() {
        String sql= "DELETE FROM Kunde";
        db.update(sql);
}


}
