package com.lantopia.pojen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Mark McKenna %lt;mark.mckenna@teamspace.ca>
 * @version 0.1
 * @since 01/02/14
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface Required {
}
