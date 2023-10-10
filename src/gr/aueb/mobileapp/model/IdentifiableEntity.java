package gr.aueb.mobileapp.model;

@FunctionalInterface
public interface IdentifiableEntity {

    /**
     * returns the id of the entity
     * @return
     *      the entity id
     */
    long getId();
}
