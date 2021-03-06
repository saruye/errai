package org.jboss.errai.ui.nav.client.local.res;

import org.jboss.errai.ui.nav.client.local.PageRole;
import org.jboss.errai.ui.nav.client.local.api.PageNavigationErrorHandler;

public class TestNavigationErrorHandler implements PageNavigationErrorHandler {
  public int count;

  @Override
  public void handleError(Exception exception, String pageName) {
    count++;
  }

  @Override
  public void handleError(Exception exception, Class<? extends PageRole> pageRole) {
    handleError(exception, "");

  }

}
