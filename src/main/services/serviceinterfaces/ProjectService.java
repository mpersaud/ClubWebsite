package main.services.serviceinterfaces;

import main.modelpojos.Project;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface ProjectService {
	void createProject(Project project);

	void deleteProject(Project project);
	
	void updateProject(Project project);

	Project getProjectById(int id);

	List<Project> getProjects();
}
