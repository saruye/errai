package org.jboss.errai.ui.test.basic.client.res;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.jboss.errai.ui.test.common.client.Model;

import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;

@Dependent
@Templated
public class BasicComponent extends Composite {

  @Inject
  @DataField("c1")
  private Label content;

  @Inject
  @DataField
  private Button c2;

  @Inject
  @DataField
  private TextBox c3;

  @Inject
  @DataField
  private Anchor c4;

  @Inject
  @DataField
  private Image c6;

  @Inject
  @DataField
  private Anchor c5;

  @Inject
  private DataBinder<Model> binder;

  @PostConstruct
  public void init() {
    content.getElement().setAttribute("id", "c1");
    content.setText("Added by component");
  }

  public Label getLabel() {
    return content;
  }

  public Button getContent2() {
    return c2;
  }

  public TextBox getTextBox() {
    return c3;
  }

  public void setTextBox(TextBox box) {
    this.c3 = box;
  }

  public Anchor getC4() {
    return c4;
  }

  public Anchor getC5() {
    return c5;
  }

  public Image getC6() {
    return c6;
  }
}
