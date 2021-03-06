package net.niiqa.clean_arc_example_java.core.context;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import net.niiqa.clean_arc_example_java.integrations.environment.Environment;

public class BaseContext extends AbstractModule {

    @Override
    protected void configure() {
        bind(Environment.class).in(Scopes.SINGLETON);
    }
}
