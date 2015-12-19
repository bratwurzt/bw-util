/* ********************************************************************
    Appropriate copyright notice
*/
package org.bedework.util.maven.deploy;

import org.bedework.util.deployment.ProcessEars;
import org.bedework.util.misc.Util;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;

/**
 * User: mike Date: 12/18/15 Time: 00:15
 */
@Mojo(name = "deploy-ears")
public class DeployEars extends AbstractMojo {
  @Parameter(defaultValue = "${project.build.directory}", readonly = true)
  private File target;

  @Parameter(required = true)
  private String baseDirPath;

  @Parameter
  private String inUrl;

  @Parameter
  private String deployDirPath;

  @Parameter
  private boolean noversion;

  @Parameter
  private boolean checkonly;

  @Parameter
  private boolean delete;

  @Parameter(defaultValue = "true")
  private boolean cleanup;

  @Parameter(required = true)
  private String earName;

  @Parameter
  private String resourcesBase;

  @Parameter(required = true)
  private String propsPath;

  public DeployEars() {

  }

  public void execute() throws MojoFailureException {
    final ProcessEars pe = new ProcessEars();

    pe.setBaseDirPath(baseDirPath);
    pe.setInUrl(inUrl);
    pe.setInDirPath(target.getAbsolutePath());
    pe.setOutDirPath(Util.buildPath(true, target.getAbsolutePath(),
                                    "/",
                                    "modified"));
    pe.setDeployDirPath(deployDirPath);
    pe.setNoversion(noversion);
    pe.setCheckonly(checkonly);
    pe.setDelete(delete);
    pe.setCleanup(cleanup);
    pe.setEarName(earName);
    pe.setResourcesBase(resourcesBase);
    pe.setPropsPath(propsPath);

    pe.execute();
  }
}
