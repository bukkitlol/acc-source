/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface fi extends lE, IntUnaryOperator { default eI a(dq paramdq) { return paramShort -> b(paramdq.b(paramShort)); }
/*  2 */   default boolean e(char paramChar) { return true; } @Deprecated
/*  3 */   default Object remove(Object paramObject) { return d(paramObject); }
/*  4 */   default eK a(c6 paramc6) { return paramChar -> paramc6.a(b(paramChar)); } @Deprecated
/*  5 */   default Function andThen(Function paramFunction) { return super.andThen(paramFunction); }
/*  6 */   default ju a(m1 paramm1) { return paramObject -> b(paramm1.a(paramObject)); } @Deprecated
/*  7 */   default Object put(Object paramObject1, Object paramObject2) { return a((Character)paramObject1, (Integer)paramObject2); } @Deprecated default Integer c(Object paramObject) { int i; 
/*  8 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 46 */     char c = ((Character)paramObject).charValue(); try { if ((i = b(c)) == b()) { try { if (e(c)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default mu a(i parami) { return paramObject -> b(parami.c(paramObject)); }
/*    */   @Deprecated default Integer b(Object paramObject, Integer paramInteger) { try { if (paramObject == null)
/*    */         return paramInteger;  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 50 */      char c = ((Character)paramObject).charValue(); int i = b(c); try { if (i == b()) { try { if (e(c)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramInteger; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   default int b(char paramChar, int paramInt) { int i; try { if ((i = b(paramChar)) == b()) { try { if (e(paramChar)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramInt; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/* 52 */   default cM a(hE paramhE) { return paramFloat -> b(paramhE.a(paramFloat)); } @Deprecated default int applyAsInt(int paramInt) { return b(j6.a(paramInt)); } default is a(ij paramij) { return paramChar -> paramij.a(b(paramChar)); } default mz a(jO paramjO) { return paramChar -> paramjO.a(b(paramChar)); } default gs a(l paraml) { return paramChar -> paraml.b(b(paramChar)); } default fi a(kO paramkO) { return paramChar -> paramkO.a(b(paramChar)); } @Deprecated default Object get(Object paramObject) { return c(paramObject); } default go a(iW paramiW) { return paramDouble -> b(paramiW.b(paramDouble)); }
/* 53 */   default kO a(gD paramgD) { return paramInt -> b(paramgD.a(paramInt)); } default d1 a(ls paramls) { return paramChar -> paramls.b(b(paramChar)); } default lU a(gD paramgD) { return paramChar -> paramgD.a(b(paramChar)); } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return b(paramObject1, (Integer)paramObject2); } default int b() { return 0; } @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); } default kf a(ep paramep) { return paramByte -> b(paramep.a(paramByte)); } default fi a(lU paramlU) { return paramChar -> b(paramlU.b(paramChar)); } @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : e(((Character)paramObject).charValue()); } default kJ a(hx paramhx) { return paramLong -> b(paramhx.a(paramLong)); }
/*    */   @Deprecated
/* 55 */   default Integer a(Character paramCharacter, Integer paramInteger) { char c = paramCharacter.charValue(); boolean bool = e(c); int i = a(c, paramInteger.intValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 56 */      return bool ? Integer.valueOf(i) : null; } default void b(int paramInt) { throw new UnsupportedOperationException(); }
/* 57 */   default int a(char paramChar) { throw new UnsupportedOperationException(); } @Deprecated
/*    */   default Integer d(Object paramObject) { 
/* 59 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  char c = ((Character)paramObject).charValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 60 */      return e(c) ? Integer.valueOf(a(c)) : null; } default d_ a(gl paramgl) { return paramChar -> paramgl.c(b(paramChar)); }
/*    */ 
/*    */   
/* 63 */   default dX a(an paraman) { return paramChar -> paraman.a(b(paramChar)); } default int a(char paramChar, int paramInt) {
/* 64 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   int b(char paramChar);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\fi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */