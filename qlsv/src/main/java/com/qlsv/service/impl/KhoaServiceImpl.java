package com.qlsv.service.impl;

import com.qlsv.dto.KhoaDto;
import com.qlsv.entity.KhoaEntity;
import com.qlsv.repository.KhoaRepository;
import com.qlsv.service.KhoaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional(rollbackFor = Exception.class)
public class KhoaServiceImpl implements KhoaService {
    @Autowired
    private KhoaRepository repository;

    //CRUD  CREATE , READ , UPDATE , DELETE

    @Override
    public KhoaEntity addKhoa(KhoaDto khoa) {
        KhoaEntity result = new KhoaEntity();
        result.setKhoaId(UUID.randomUUID().toString().split("-")[0]);
        result.setMaKhoa(khoa.getMaKhoa());
        result.setTenKhoa(khoa.getTenKhoa());
        result.setSdt(khoa.getSdt());
        result.setEmail(khoa.getEmail());
        return repository.save(result);
    }


//    public List<KhoaEntity> findAllTasks() {
//        return repository.findAll();
//    }

//    public KhoaEntity getTaskByTaskId(String taskId){
//        return repository.findById(taskId).get();
//    }
//
//    public List<KhoaEntity> getTaskBySeverity(int severity){
//        return  repository.findBySeverity(severity);
//    }
//
//    public List<KhoaEntity> getTaskByAssignee(String assignee){
//        return repository.getTasksByAssignee(assignee);
//    }
//
//    public KhoaEntity updateTask(KhoaEntity taskRequest){
//        //get the existing document from DB
//        // populate new value from request to existing object/entity/document
//        KhoaEntity existingTask = repository.findById(taskRequest.getTaskId()).get();
//        existingTask.setDescription(taskRequest.getDescription());
//        existingTask.setSeverity(taskRequest.getSeverity());
//        existingTask.setAssignee(taskRequest.getAssignee());
//        existingTask.setStoryPoint(taskRequest.getStoryPoint());
//        return repository.save(existingTask);
//    }
//
//    public String deleteTask(String taskId){
//        repository.deleteById(taskId);
//        return taskId+" task deleted from dashboard ";
//    }
}
