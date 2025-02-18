/*     */ package sun.security.smartcardio;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class PCSC
/*     */   extends PlatformPCSC
/*     */ {
/*     */   static final int SCARD_S_SUCCESS = 0;
/*     */   static final int SCARD_E_CANCELLED = -2146435070;
/*     */   static final int SCARD_E_CANT_DISPOSE = -2146435058;
/*     */   static final int SCARD_E_INSUFFICIENT_BUFFER = -2146435064;
/*     */   static final int SCARD_E_INVALID_ATR = -2146435051;
/*     */   static final int SCARD_E_INVALID_HANDLE = -2146435069;
/*     */   static final int SCARD_E_INVALID_PARAMETER = -2146435068;
/*     */   static final int SCARD_E_INVALID_TARGET = -2146435067;
/*     */   static final int SCARD_E_INVALID_VALUE = -2146435055;
/*     */   static final int SCARD_E_NO_MEMORY = -2146435066;
/*     */   static final int SCARD_F_COMM_ERROR = -2146435053;
/*     */   static final int SCARD_F_INTERNAL_ERROR = -2146435071;
/*     */   static final int SCARD_F_UNKNOWN_ERROR = -2146435052;
/*     */   static final int SCARD_F_WAITED_TOO_LONG = -2146435065;
/*     */   static final int SCARD_E_UNKNOWN_READER = -2146435063;
/*     */   static final int SCARD_E_TIMEOUT = -2146435062;
/*     */   static final int SCARD_E_SHARING_VIOLATION = -2146435061;
/*     */   static final int SCARD_E_NO_SMARTCARD = -2146435060;
/*     */   static final int SCARD_E_UNKNOWN_CARD = -2146435059;
/*     */   static final int SCARD_E_PROTO_MISMATCH = -2146435057;
/*     */   static final int SCARD_E_NOT_READY = -2146435056;
/*     */   static final int SCARD_E_SYSTEM_CANCELLED = -2146435054;
/*     */   static final int SCARD_E_NOT_TRANSACTED = -2146435050;
/*     */   static final int SCARD_E_READER_UNAVAILABLE = -2146435049;
/*     */   static final int SCARD_W_UNSUPPORTED_CARD = -2146434971;
/*     */   static final int SCARD_W_UNRESPONSIVE_CARD = -2146434970;
/*     */   static final int SCARD_W_UNPOWERED_CARD = -2146434969;
/*     */   static final int SCARD_W_RESET_CARD = -2146434968;
/*     */   static final int SCARD_W_REMOVED_CARD = -2146434967;
/*     */   static final int SCARD_W_INSERTED_CARD = -2146434966;
/*     */   static final int SCARD_E_UNSUPPORTED_FEATURE = -2146435041;
/*     */   static final int SCARD_E_PCI_TOO_SMALL = -2146435047;
/*     */   
/*     */   static void checkAvailable() throws RuntimeException {
/*  45 */     if (initException != null) {
/*  46 */       throw new UnsupportedOperationException("PC/SC not available on this platform", initException);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_E_READER_UNSUPPORTED = -2146435046;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_E_DUPLICATE_READER = -2146435045;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_E_CARD_UNSUPPORTED = -2146435044;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_E_NO_SERVICE = -2146435043;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_E_SERVICE_STOPPED = -2146435042;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_E_NO_READERS_AVAILABLE = -2146435026;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int WINDOWS_ERROR_INVALID_HANDLE = 6;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int WINDOWS_ERROR_INVALID_PARAMETER = 87;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_SCOPE_USER = 0;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_SCOPE_TERMINAL = 1;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_SCOPE_SYSTEM = 2;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_SCOPE_GLOBAL = 3;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_SHARE_EXCLUSIVE = 1;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_SHARE_SHARED = 2;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_SHARE_DIRECT = 3;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_LEAVE_CARD = 0;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_RESET_CARD = 1;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_UNPOWER_CARD = 2;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_EJECT_CARD = 3;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_STATE_UNAWARE = 0;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_STATE_IGNORE = 1;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_STATE_CHANGED = 2;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_STATE_UNKNOWN = 4;
/*     */ 
/*     */ 
/*     */   
/*     */   static final int SCARD_STATE_UNAVAILABLE = 8;
/*     */ 
/*     */   
/*     */   static final int SCARD_STATE_EMPTY = 16;
/*     */ 
/*     */   
/*     */   static final int SCARD_STATE_PRESENT = 32;
/*     */ 
/*     */   
/*     */   static final int SCARD_STATE_ATRMATCH = 64;
/*     */ 
/*     */   
/*     */   static final int SCARD_STATE_EXCLUSIVE = 128;
/*     */ 
/*     */   
/*     */   static final int SCARD_STATE_INUSE = 256;
/*     */ 
/*     */   
/*     */   static final int SCARD_STATE_MUTE = 512;
/*     */ 
/*     */   
/*     */   static final int SCARD_STATE_UNPOWERED = 1024;
/*     */ 
/*     */   
/*     */   static final int TIMEOUT_INFINITE = -1;
/*     */ 
/*     */   
/* 172 */   private static final char[] hexDigits = "0123456789abcdef".toCharArray();
/*     */   
/*     */   public static String toString(byte[] paramArrayOfbyte) {
/* 175 */     StringBuffer stringBuffer = new StringBuffer(paramArrayOfbyte.length * 3);
/* 176 */     for (byte b = 0; b < paramArrayOfbyte.length; b++) {
/* 177 */       int i = paramArrayOfbyte[b] & 0xFF;
/* 178 */       if (b != 0) {
/* 179 */         stringBuffer.append(':');
/*     */       }
/* 181 */       stringBuffer.append(hexDigits[i >>> 4]);
/* 182 */       stringBuffer.append(hexDigits[i & 0xF]);
/*     */     } 
/* 184 */     return stringBuffer.toString();
/*     */   }
/*     */   
/*     */   static native long SCardEstablishContext(int paramInt) throws PCSCException;
/*     */   
/*     */   static native String[] SCardListReaders(long paramLong) throws PCSCException;
/*     */   
/*     */   static native long SCardConnect(long paramLong, String paramString, int paramInt1, int paramInt2) throws PCSCException;
/*     */   
/*     */   static native byte[] SCardTransmit(long paramLong, int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) throws PCSCException;
/*     */   
/*     */   static native byte[] SCardStatus(long paramLong, byte[] paramArrayOfbyte) throws PCSCException;
/*     */   
/*     */   static native void SCardDisconnect(long paramLong, int paramInt) throws PCSCException;
/*     */   
/*     */   static native int[] SCardGetStatusChange(long paramLong1, long paramLong2, int[] paramArrayOfint, String[] paramArrayOfString) throws PCSCException;
/*     */   
/*     */   static native void SCardBeginTransaction(long paramLong) throws PCSCException;
/*     */   
/*     */   static native void SCardEndTransaction(long paramLong, int paramInt) throws PCSCException;
/*     */   
/*     */   static native byte[] SCardControl(long paramLong, int paramInt, byte[] paramArrayOfbyte) throws PCSCException;
/*     */ }


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/sun/security/smartcardio/PCSC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */