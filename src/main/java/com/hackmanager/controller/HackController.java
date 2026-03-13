package com.hackmanager.controller;

import com.hackmanager.model.Hack;
import com.hackmanager.service.HackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hacks")
public class HackController {

    @Autowired
    private HackService hackService;

    @PostMapping
    public Hack createHack(@RequestBody Hack hack) {
        return hackService.createHack(hack);
    }

    @GetMapping
    public List<Hack> getAllHacks() {
        return hackService.getAllHacks();
    }

    @GetMapping("/{id}")
    public Hack getHack(@PathVariable Long id) {
        return hackService.getHackById(id);
    }

    @PutMapping("/{id}")
    public Hack updateHack(@PathVariable Long id, @RequestBody Hack hack) {
        return hackService.updateHack(id, hack);
    }

    @DeleteMapping("/{id}")
    public String deleteHack(@PathVariable Long id) {
        hackService.deleteHack(id);
        return "Hack deleted successfully";
    }

    @GetMapping("/status/{completed}")
    public List<Hack> getHacksByStatus(@PathVariable boolean completed) {
        return hackService.getHacksByStatus(completed);
    }
}