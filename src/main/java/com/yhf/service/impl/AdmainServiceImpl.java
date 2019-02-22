package com.yhf.service.impl;

import com.yhf.dao.AdmainDAO;
import com.yhf.entity.Admain;
import com.yhf.service.AdmainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdmainServiceImpl implements AdmainService {
    @Autowired
    private AdmainDAO admainDAO;

    @Override
    public List<Admain> getAll() {
        return admainDAO.getAll();
    }
}
