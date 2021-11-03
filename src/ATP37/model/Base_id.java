package ATP37.model;

import java.util.Random;

public abstract class Base_id {
    Random random = new Random();
    int id = random.nextInt(100);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Base_id)) return false;

        Base_id base_id = (Base_id) o;

        if (id != base_id.id) return false;
        return random != null ? random.equals(base_id.random) : base_id.random == null;
    }

    @Override
    public String toString() {
        return "Id=" + id;
    }
}

