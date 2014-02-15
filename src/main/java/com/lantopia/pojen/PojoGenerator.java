package com.lantopia.pojen;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

/**
 * @author Mark McKenna %lt;mark.mckenna@teamspace.ca>
 * @version 0.1
 * @since 01/02/14
 *
 * This annotation processor fills out POJO interfaces with implementations at compile time.  You supply
 * a properly annotated POJO interface, with a nested POJO Builder interface, and it produces the actual
 * POJO and Builder impls when you compile.  Builder instances are injected into client code using
 * annotation-flagged fields.
 */
@SupportedAnnotationTypes("com.lantopia.pojen.Pojo")
@SupportedSourceVersion(SourceVersion.RELEASE_7)
public class PojoGenerator extends AbstractProcessor {
    @Override
    public boolean process(final Set<? extends TypeElement> annotations, final RoundEnvironment roundEnv) {
        for (final Element element : roundEnv.getElementsAnnotatedWith(Pojo.class)) {
        }
        return true;
    }
}
