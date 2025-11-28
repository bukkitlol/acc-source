/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface d1 extends lE, IntUnaryOperator { default f1 a(m1 paramm1) { return paramObject -> b(paramm1.a(paramObject)); }
/*    */    default is a(iT paramiT) {
/*  3 */     return paramChar -> paramiT.a(b(paramChar));
/*    */   }
/*  5 */   default lU a(ep paramep) { return paramChar -> paramep.a(b(paramChar)); } @Deprecated default boolean containsKey(Object paramObject) { try {  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException)
/*  7 */     { throw a(null); }  return (paramObject == null) ? false : a(((Character)paramObject).charValue()); } default d_ a(gW paramgW) {
/*  8 */     return paramChar -> paramgW.d(b(paramChar));
/*    */   }
/* 10 */   default mz a(c0 paramc0) { return paramChar -> paramc0.a(b(paramChar)); }
/* 11 */   default d1 a(gP paramgP) { return paramChar -> paramgP.a(b(paramChar)); }
/* 12 */   default byte b(char paramChar, byte paramByte) { throw new UnsupportedOperationException(); }
/* 13 */   default ls a(gD paramgD) { return paramInt -> b(paramgD.a(paramInt)); } @Deprecated
/* 14 */   default Function andThen(Function paramFunction) { return super.andThen(paramFunction); }
/* 15 */   default k1 a(iW paramiW) { return paramDouble -> b(paramiW.b(paramDouble)); }
/* 16 */   default lb a(hE paramhE) { return paramFloat -> b(paramhE.a(paramFloat)); } default byte a(char paramChar) {
/* 17 */     throw new UnsupportedOperationException();
/*    */   }
/* 19 */   default fi a(kf paramkf) { return paramChar -> paramkf.b(b(paramChar)); }
/*    */   @Deprecated
/* 21 */   default Function compose(Function paramFunction) { return super.compose(paramFunction); } @Deprecated
/* 22 */   default Object remove(Object paramObject) { return d(paramObject); } default gs a(b paramb) {
/* 23 */     return paramChar -> paramb.b(b(paramChar));
/*    */   }
/* 25 */   default d1 a(lU paramlU) { return paramChar -> b(paramlU.b(paramChar)); } default byte a(char paramChar, byte paramByte) { byte b; 
/* 26 */     try { if ((b = b(paramChar)) == b()) { try { if (a(paramChar)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramByte; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   default P a(dq paramdq) { return paramShort -> b(paramdq.b(paramShort)); }
/* 28 */   default byte b() { return 0; } default ia a(hx paramhx) { return paramLong -> b(paramhx.a(paramLong)); } @Deprecated default Byte d(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  char c = ((Character)paramObject).charValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return a(c) ? Byte.valueOf(a(c)) : null; } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return a((Character)paramObject1, (Byte)paramObject2); } default dX a(ar paramar) { return paramChar -> paramar.a(b(paramChar)); } @Deprecated default Byte c(Object paramObject) { byte b; try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 59 */     char c = ((Character)paramObject).charValue(); try { if ((b = b(c)) == b()) { try { if (a(c)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   @Deprecated default Object get(Object paramObject) { return c(paramObject); }
/*    */   @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return b(paramObject1, (Byte)paramObject2); }
/* 62 */   default eK a(hV paramhV) { return paramChar -> paramhV.b(b(paramChar)); } default boolean a(char paramChar) { return true; } default void b(byte paramByte) { throw new UnsupportedOperationException(); } @Deprecated default Byte b(Object paramObject, Byte paramByte) { try { if (paramObject == null) return paramByte;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  char c = ((Character)paramObject).charValue(); byte b = b(c); try { if (b == b()) { try { if (a(c)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramByte; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } @Deprecated default int applyAsInt(int paramInt) { return b(j6.a(paramInt)); }
/* 63 */   @Deprecated default Byte a(Character paramCharacter, Byte paramByte) { char c = paramCharacter.charValue(); boolean bool = a(c); byte b = b(c, paramByte.byteValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Byte.valueOf(b) : null; } default gP a(ep paramep) { return paramByte -> b(paramep.a(paramByte)); }
/* 64 */   default D a(i parami) { return paramObject -> b(parami.c(paramObject)); }
/*    */ 
/*    */   
/*    */   byte b(char paramChar);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\d1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */