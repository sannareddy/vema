package edu.vemaschools.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.vemaschools.dao.EduClassDao;
import edu.vemaschools.entities.EduClass;
import edu.vemaschools.models.EduClassVO;
import edu.vemaschools.service.EduClassService;
@Service
public class EduClassServiceImpl implements EduClassService{
	
	@Autowired
	private EduClassDao eduClassDao;
	
	public EduClassDao getEduClassDao() {
		return eduClassDao;
	}

	public void setEduClassDao(EduClassDao eduClassDao) {
		this.eduClassDao = eduClassDao;
	}

	@Override
	public List<EduClassVO> getAllClasses() {
		
		List<EduClass> classes=eduClassDao.getAllClasses();
		List<EduClassVO> classVOs=new ArrayList<>();
		EduClassVO eduClassVO=null;
		for(EduClass eduClass:classes) {
			eduClassVO=new EduClassVO();
			BeanUtils.copyProperties(eduClass, eduClassVO);
			classVOs.add(eduClassVO);
		}
 		return classVOs;
	}
	
}