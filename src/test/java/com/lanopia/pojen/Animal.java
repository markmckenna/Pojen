package com.lanopia.pojen;


import com.lantopia.pojen.Pojo;
import com.lantopia.pojen.Required;

/**
 * @author Mark McKenna %lt;mark.mckenna@teamspace.ca>
 * @version 0.1
 * @since 01/02/14
 */
@Pojo
public interface Animal {
    @Required Species getSpecies();
    @Required float getWeight();
    @Required float getHeight();

    interface Builder {
        Builder species(Species species);
        Builder weight(float weight);
        Builder height(float height);
        Animal build();
    }
}
