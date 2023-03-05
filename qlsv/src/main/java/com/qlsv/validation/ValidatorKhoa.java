package com.qlsv.validation;

import com.qlsv.common.FunctionCommon;
import com.qlsv.constant.MasterDataExceptionConstant;
import com.qlsv.dto.KhoaDto;
import com.qlsv.entity.KhoaEntity;
import com.qlsv.exception.BusinessException;
import com.qlsv.repository.KhoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Optional;
import java.util.function.Function;

/**
 * @author NienNQ
 * @created 2023 - 03 - 05 11:02 AM
 * @project qlsv
 */
@Component
public class ValidatorKhoa implements Validator {

    @Autowired
    private KhoaRepository khoaRepository;

    @Autowired
    private FunctionCommon functionCommon;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }

    @Transactional
    public void validateAddKhoa(Object target) throws BusinessException {
        KhoaDto khoaDto = (KhoaDto) target;

        int countMaKhoa = khoaRepository.countKhoaByMaKhoa(khoaDto.getMaKhoa());

        if (countMaKhoa > 0) {
            throw new BusinessException(MasterDataExceptionConstant.E_KHOA_DUPLICATE_MA_KHOA);
        }
        else if(functionCommon.isValidEmail(khoaDto.getEmail()) == true){
            throw new BusinessException(MasterDataExceptionConstant.COMMON_EMAIL_WRONG_FORMAT);
        }
    }

    @Transactional
    public void validateEditKhoa(Object target) throws BusinessException {
        KhoaDto khoaDto = (KhoaDto) target;

        Optional<KhoaEntity> khoaEntity = khoaRepository.findById(khoaDto.getId());

        if (khoaEntity.isPresent() == false) {
            throw new BusinessException(MasterDataExceptionConstant.E_KHOA_NOT_FOUND_KHOA);
        }
        else if(functionCommon.isValidEmail(khoaDto.getEmail()) == true){
            throw new BusinessException(MasterDataExceptionConstant.COMMON_EMAIL_WRONG_FORMAT);
        }
        else {
            Long countMaKhoa = khoaRepository.countKhoaByMaKhoaAndNotId(khoaDto.getMaKhoa(), khoaDto.getId());
            long countValue = countMaKhoa != null ? countMaKhoa : 0;
            if (countValue > 0) {
                throw new BusinessException(MasterDataExceptionConstant.E_KHOA_DUPLICATE_MA_KHOA);
            }
        }

    }

}
