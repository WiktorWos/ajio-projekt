package com.ajio.stats.service;

import com.ajio.stats.dto.SetStatsDTO;
import com.ajio.stats.dto.SetStatsResponseDTO;
import com.ajio.stats.entity.SetStats;
import com.ajio.stats.exception.EntityNotFoundException;
import com.ajio.stats.repository.SetStatsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetStatsService {
    private SetStatsRepo setStatsRepo;

    @Autowired
    public SetStatsService(SetStatsRepo setStatsRepo) {
        this.setStatsRepo = setStatsRepo;
    }

    public SetStatsResponseDTO getStatsBySetID(Long setID) {
        SetStatsResponseDTO responseDTO = new SetStatsResponseDTO();
        SetStats stats = setStatsRepo.findBySetID(setID);
        if(stats == null) throw new EntityNotFoundException("Entity not found");

        responseDTO.setAccuracy((stats.getCorrectFlashcards() * 100) / stats.getDoneFlashcards());
        return responseDTO;
    }

    public void setSetStats(SetStatsDTO dto) {
        SetStats stats = setStatsRepo.findBySetID(dto.getSetID());
        if(stats == null) {
            stats = convertStatsFromDTO(dto);
        } else {
            stats = updateStats(dto, stats);
        }

        setStatsRepo.save(stats);
    }

    private SetStats convertStatsFromDTO(SetStatsDTO dto) {
        SetStats stats = new SetStats();
        stats.setSetID(dto.getSetID());
        stats.setCorrectFlashcards(dto.getCorrectFlashcards());
        stats.setDoneFlashcards(dto.getDoneFlashcards());
        return stats;
    }

    private SetStats updateStats(SetStatsDTO dto, SetStats stats) {
        stats.setDoneFlashcards(stats.getDoneFlashcards() + dto.getDoneFlashcards());
        stats.setCorrectFlashcards(stats.getCorrectFlashcards() + dto.getCorrectFlashcards());
        return stats;
    }
}
