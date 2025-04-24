package batterySIM.DB;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//단순 로그인용 엔티티, 권한 설정?
@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column(length = 20,nullable = false)
    private long user_id;

    @Column(length = 20,nullable = false)
    private LocalDateTime date_created;

    @Column(length = 15,nullable = false)
    private char user_name;

    @Column(length = 255,nullable = false)//성능 면에서 255가 과하지 않을까..? 보안 면에서 길이 보장을 해야할까..?
    private char password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,orphanRemoval = true)//mapped by: 반대쪽 엔티티에서 매핑 기준 필드 이름, cascade :자동 저장/삭제 orphanRemoval:관계가 끊길시 DB에서 삭제
    private List<logged_in> loginRecord = new ArrayList<>();
}
