package org.jnario.jnario.tests.unit.quickfix;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.jnario.tests.unit.quickfix.UndefinedMethodFixCallsReadOnlyTypeSpec;
import org.jnario.jnario.tests.unit.quickfix.UndefinedMethodFixIsUndefinedMethodSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.ui.quickfix.FeatureCallTargetTypeProvider;
import org.junit.runner.RunWith;

@Contains({ UndefinedMethodFixIsUndefinedMethodSpec.class, UndefinedMethodFixCallsReadOnlyTypeSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("UndefinedMethodFix")
@CreateWith(value = SpecTestCreator.class)
public class UndefinedMethodFixSpec {
  @Inject
  @Extension
  public ModelStore m;
  
  @Inject
  FeatureCallTargetTypeProvider targetTypeProvider;
  
  public Resource parseSpec(final CharSequence content) {
    Resource _parseSpec = this.m.parseSpec(content);
    return _parseSpec;
  }
  
  public XMemberFeatureCall firstFeatureCall() {
    XMemberFeatureCall _first = this.m.<XMemberFeatureCall>first(XMemberFeatureCall.class);
    return _first;
  }
}
