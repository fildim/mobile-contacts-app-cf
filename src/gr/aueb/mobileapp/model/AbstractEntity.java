package gr.aueb.mobileapp.model;

public abstract class AbstractEntity implements IdentifiableEntity{

    private long id;

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }

}
