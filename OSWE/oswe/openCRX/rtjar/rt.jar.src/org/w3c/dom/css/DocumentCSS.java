package org.w3c.dom.css;

import org.w3c.dom.Element;
import org.w3c.dom.stylesheets.DocumentStyle;

public interface DocumentCSS extends DocumentStyle {
  CSSStyleDeclaration getOverrideStyle(Element paramElement, String paramString);
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/org/w3c/dom/css/DocumentCSS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */