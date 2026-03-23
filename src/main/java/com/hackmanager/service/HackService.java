package com.hackmanager.service;

import com.hackmanager.model.Hack;
import com.hackmanager.repository.HackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;










































































































































@Service
public class HackService {

    @Autowired
    private HackRepository hackRepository;

    public Hack createHack(Hack hack) {
        hack.setCreatedAt(LocalDateTime.now());
        return hackRepository.save(hack);
    }

    public List<Hack> getAllHacks() {
        return hackRepository.findAll();
    }

    public Hack getHackById(Long id) {
        return hackRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hack not found"));
    }

    public Hack updateHack(Long id, Hack updatedHack) {

        Hack hack = getHackById(id);

        hack.setTitle(updatedHack.getTitle());
        hack.setDescription(updatedHack.getDescription());
        hack.setCompleted(updatedHack.isCompleted());

        return hackRepository.save(hack);
    }

    public void deleteHack(Long id) {
        hackRepository.deleteById(id);
    }

    public List<Hack> getHacksByStatus(boolean completed) {
        return hackRepository.findByCompleted(completed);
    }
}