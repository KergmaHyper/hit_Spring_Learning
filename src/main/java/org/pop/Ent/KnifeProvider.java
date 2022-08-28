package org.pop.Ent;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

public class KnifeProvider implements Provider<Knife> {

    @Inject
    @Named("knife")
    @Override
    public Knife get() {
        return new Knife();
    }

}
