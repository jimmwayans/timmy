package org.omg.CORBA;

import org.omg.CORBA.DynAnyPackage.InvalidSeq;

@Deprecated
public interface DynStruct extends Object, DynAny {
  String current_member_name();
  
  TCKind current_member_kind();
  
  NameValuePair[] get_members();
  
  void set_members(NameValuePair[] paramArrayOfNameValuePair) throws InvalidSeq;
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/org/omg/CORBA/DynStruct.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */