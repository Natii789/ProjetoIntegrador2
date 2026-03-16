package pi2.example.back_end.RestController;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pi2.example.back_end.BackEndApplication;
import pi2.example.back_end.Banco;
import pi2.example.back_end.Conexao;
import pi2.example.back_end.DAO.DALEvento;
import pi2.example.back_end.Modelo.Evento;
import tools.jackson.databind.introspect.DefaultAccessorNamingStrategy;

import javax.swing.text.html.parser.Entity;

@CrossOrigin
@RestController
@RequestMapping("evento")
public class RestControler {

    @GetMapping("{id}")
    private ResponseEntity<Object> getId(@PathVariable int id)
    {
        Conexao con = new Conexao();
        con = Banco.getCon();
        Evento eve = null;
        DALEvento dal = new DALEvento();
        eve = dal.get(id,con);
        return  ResponseEntity.ok(eve);
    }

}
