package Task;

import java.util.HashSet;
import java.util.Set;

public class Room {
    Set<Technique> technique = new HashSet<>();

    public Set<Technique> getTechnique() {
        return technique;
    }

    public void setTechnique(Set<Technique> technique) {
        this.technique = technique;
    }
}
