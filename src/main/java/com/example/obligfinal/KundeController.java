package com.example.obligfinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@RestController
public class KundeController {
   @Autowired
   private KundeRepository rep;

    @PostMapping("/lagre")
    public void lagreKunde(Kunde kunde) { rep.lagreKunde(kunde); }

@GetMapping ("/hentAlle")
    public List<Kunde> hentAlle() {
        return rep.hentAlleKunder();
    }

    @GetMapping("/slett")
public void slettAlle() {rep.slettAlleKunder();
    }

}

