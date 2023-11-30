package vn.edu.iuh.fit.www_tuan05_20002975_nguyenvanlong.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.www_tuan05_20002975_nguyenvanlong.backend.entities.JobSkill;
import vn.edu.iuh.fit.www_tuan05_20002975_nguyenvanlong.backend.ids.JobSkillID;

import java.util.List;

public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillID> {
    List<JobSkill> findByJobId(long jobId);
}