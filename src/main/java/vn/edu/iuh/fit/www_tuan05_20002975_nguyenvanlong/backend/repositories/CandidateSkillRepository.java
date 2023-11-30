package vn.edu.iuh.fit.www_tuan05_20002975_nguyenvanlong.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.www_tuan05_20002975_nguyenvanlong.backend.entities.CandidateSkill;
import vn.edu.iuh.fit.www_tuan05_20002975_nguyenvanlong.backend.ids.CandidateSkillID;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, CandidateSkillID> {
}