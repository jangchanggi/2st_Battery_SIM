package batterySIM.DB;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class logged_in {

    @Id
    @GeneratedValue//기본키 값 자동생성 , @ID가 붙은 식별자 필드만 적용됨. jpa에서 자동으로 unique 및 NOT NULL제공
    private long id;

    @Column(length = 20,nullable = false)
    private long user_id;

    @Column(nullable = false)
    private LocalDateTime datetime;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


}
