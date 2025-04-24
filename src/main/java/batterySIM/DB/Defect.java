package batterySIM.DB;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Defect {

    @Id
    @GeneratedValue
    private long id;

    @Column(length = 20,nullable = false)
    private long defect_id;//외래키

    @Column(length = 10,nullable = false)
    private char face_direction; //front rear Left Right Top Bottom + front3d, Rear3d, bottom3d, Left3d, Right3d, vent3D


}
