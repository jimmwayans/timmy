package com.sun.xml.internal.bind.api;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public abstract class ClassResolver {
  @Nullable
  public abstract Class<?> resolveElementName(@NotNull String paramString1, @NotNull String paramString2) throws Exception;
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/xml/internal/bind/api/ClassResolver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */