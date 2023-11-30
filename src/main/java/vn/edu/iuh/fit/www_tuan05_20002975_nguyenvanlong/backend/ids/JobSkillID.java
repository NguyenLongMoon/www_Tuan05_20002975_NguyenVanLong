package vn.edu.iuh.fit.www_tuan05_20002975_nguyenvanlong.backend.ids;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class JobSkillID implements Serializable {
    private long job;
    private long skill;
}
