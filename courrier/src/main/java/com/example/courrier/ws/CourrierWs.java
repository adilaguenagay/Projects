package com.example.courrier.ws;

import com.example.courrier.bean.Courrier;
import com.example.courrier.dao.CourrierDao;
import com.example.courrier.service.CourrierService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courrier/")
@AllArgsConstructor
public class CourrierWs {
    private final CourrierService courrierService;

    @PostMapping("")
    public Courrier create(@RequestBody Courrier courrier) {
        return courrierService.creer(courrier);
    }

    @GetMapping("")
    public List<Courrier> read() {
        return courrierService.lire();
    }

    @PutMapping("/update/id/{id}")
    public Courrier update(@PathVariable Long id, @RequestBody Courrier courrier) {
        return courrierService.modifier(id, courrier);
    }

    @DeleteMapping("id/{id}")
    public String delete(@PathVariable Long id) {
        return courrierService.supprimer(id);
    }

}
