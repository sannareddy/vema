package edu.vemaschools.models;

import java.util.List;

public class EduClassVO {
	private int classId;
	private String classCode;
	private String className;
	private String classDesc;
	private List<SectionVO> sections;
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassDesc() {
		return classDesc;
	}
	public void setClassDesc(String classDesc) {
		this.classDesc = classDesc;
	}
	public List<SectionVO> getSections() {
		return sections;
	}
	public void setSections(List<SectionVO> sections) {
		this.sections = sections;
	}
	
	
}
