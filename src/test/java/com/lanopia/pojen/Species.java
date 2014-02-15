package com.lanopia.pojen;


import com.lantopia.pojen.Pojo;
import com.lantopia.pojen.Required;

/**
 * @author Mark McKenna %lt;mark.mckenna@teamspace.ca>
 * @version 0.1
 * @since 01/02/14
 */
@Pojo
public interface Species {
    @Required String getName();

    interface Builder {
        Builder name(String name);
        Species build();
    }
}
