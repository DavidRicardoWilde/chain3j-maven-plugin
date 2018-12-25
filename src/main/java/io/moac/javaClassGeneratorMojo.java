package io.moac;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "generate-sources", defaultPhase = LifecyclePhase.PROCESS_RESOURCES)
public class javaClassGeneratorMojo extends AbstractMojo {

    public void execute()
            throws MojoExecutionException {
        System.out.println("Developing the maven plugin for chain3j");
    }
}
