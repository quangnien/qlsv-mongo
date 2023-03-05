package com.qlsv.api;

import com.qlsv.common.ReturnObject;
import com.qlsv.dto.KhoaDto;
import com.qlsv.service.KhoaService;
import com.qlsv.validation.ValidatorKhoa;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NienNQ
 * @created 2023 - 03 - 05 6:20 AM
 * @project qlsv
 */
@Slf4j
@RestController
@RequestMapping("/api/admin")
@Api(value = "KhoaApi", description = "REST API for Khoa", tags = { "KhoaApi" })
public class KhoaApi {
    @Autowired
    private KhoaService khoaService;

    @Autowired
    private ValidatorKhoa validatorKhoa;

    /* CREATE */
    @ApiOperation(value = "Add Khoa.")
    @PostMapping("/khoa")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> createKhoa(@Valid @RequestBody KhoaDto khoa) {

        ReturnObject returnObject = new ReturnObject();
        try {
            log.info("Add Khoa!");

            returnObject.setStatus(ReturnObject.SUCCESS);
            returnObject.setMessage("200");

            validatorKhoa.validateAddKhoa(khoa);
            khoaService.addKhoa(khoa);
            returnObject.setRetObj(khoa);
        }
        catch (Exception ex){
            returnObject.setStatus(ReturnObject.ERROR);
            returnObject.setMessage(ex.getMessage());
        }

        return ResponseEntity.ok(returnObject);
    }

    /* UPDATE */
    @PutMapping("/khoa")
    public ResponseEntity<?> updateKhoa(@Valid @RequestBody KhoaDto khoa) {

        ReturnObject returnObject = new ReturnObject();
        try {
            log.info("Update Khoa!");

            returnObject.setStatus(ReturnObject.SUCCESS);
            returnObject.setMessage("200");

            validatorKhoa.validateEditKhoa(khoa);
            khoaService.updateKhoa(khoa);

            returnObject.setRetObj(khoa);
        }
        catch (Exception ex){
            returnObject.setStatus(ReturnObject.ERROR);
            returnObject.setMessage(ex.getMessage());
        }

        return ResponseEntity.ok(returnObject);
    }



//    @GetMapping
//    public List<KhoaEntity> getKhoas() {
//        return khoaService.findAllKhoas();
//    }


//    @GetMapping("/{taskId}")
//    public KhoaEntity getKhoa(@PathVariable String taskId){
//        return service.getKhoaByKhoaId(taskId);
//    }
//
//    @GetMapping("/severity/{severity}")
//    public List<KhoaEntity> findKhoaUsingSeverity(@PathVariable int severity){
//        return service.getKhoaBySeverity(severity);
//    }
//
//    @GetMapping("/assignee/{assignee}")
//    public List<KhoaEntity> getKhoaByAssignee(@PathVariable String assignee){
//        return service.getKhoaByAssignee(assignee);
//    }

//    @DeleteMapping("/{taskId}")
//    public String deleteKhoa(@PathVariable String taskId){
//        return service.deleteKhoa(taskId);
//    }
}
