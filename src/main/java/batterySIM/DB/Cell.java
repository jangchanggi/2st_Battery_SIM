package batterySIM.DB;

//C++의 #inlude 같은 실제 코드삽입이 아니라 import는 비용측면에서 손해발생 X
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Cell {

    @Id
    @GeneratedValue
    private char id;

    @Column(length = 20,nullable = false)
    private char cell_id;

    @Column(length = 20,nullable = false)
    private LocalDateTime date_time;
}
