package blood.transfusion.service;

import java.util.ArrayList;

import blood.transfusion.dto.BloodTransfusionProject;
import blood.transfusion.dto.Donor;
import blood.transfusion.dto.People;
import blood.transfusion.dto.Recipient;
import blood.transfusion.model.BloodTransfusionVirtualDB;
import blood.transrusion.exception.NotExistException;

public class BloodTransFusionProjectService {
	private static BloodTransFusionProjectService instance = new BloodTransFusionProjectService();
	private BloodTransfusionVirtualDB projectVirtualData = BloodTransfusionVirtualDB.getInstance();

	private BloodTransFusionProjectService(){}
	public static BloodTransFusionProjectService getInstance(){
		return instance;
	}
	
	// 모든 프로젝트 반환
	public ArrayList<BloodTransfusionProject> getAllProjects(){
//		System.out.println(projectVirtualData.getProjectList());
		return projectVirtualData.getProjectList();
	}
	
	// 프로젝트 검색_
	public BloodTransfusionProject getProject(String projectName) throws NotExistException {
//		ver 1
		BloodTransfusionProject project = null;
		int projectListLength = projectVirtualData.getProjectList().size();
		for(int i = 0; i < projectListLength; i++) {
			if(projectName.equals(projectVirtualData.getProjectList().get(i).getBtProjectName())) {
				project = projectVirtualData.getProjectList().get(i);
			}
		}
	
		return project;
		
		// ver 2
//		BloodTransfusionProject project = null;
//				projectVirtualData
//				.getProjectList()
//				.stream()
//				.filter(v -> v.getBtProjectName().equals(projectName))
//				.forEach(v -> {
//					System.out.println(v);
//					return v; // return v : type Error
//				});
//		return project;
		
	}

	// 새로운 프로젝트 추가
	public void projectInsert(BloodTransfusionProject newProject) {
		projectVirtualData.insertProject(newProject);
	}
	
	// 프로젝트 수정 - 프로젝트 명으로 현혈자 혹은 수혈자 수정_
	public void projectUpdate(String projectName, People people) throws NotExistException{
		try {
//			System.out.println(getProject(projectName).getClass());
			if(getProject(projectName) != null) {
				if(people instanceof Donor) {					
					getProject(projectName).setDonor((Donor)people);					
				} else if (people instanceof Recipient) {
//					System.out.println(people.getId());
					getProject(projectName).setRecipient((Recipient)people);
				} 
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 프로젝트 삭제_
//	public void projectDelete(String projectName) throws NotExistException{
//		BloodTransfusionProject project = null;
//		getAllProjects().remove(project);
//	}	
}
