package java.awt.im.spi;

import java.awt.AWTException;
import java.awt.Image;
import java.util.Locale;

public interface InputMethodDescriptor {
  Locale[] getAvailableLocales() throws AWTException;
  
  boolean hasDynamicLocaleList();
  
  String getInputMethodDisplayName(Locale paramLocale1, Locale paramLocale2);
  
  Image getInputMethodIcon(Locale paramLocale);
  
  InputMethod createInputMethod() throws Exception;
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/java/awt/im/spi/InputMethodDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */