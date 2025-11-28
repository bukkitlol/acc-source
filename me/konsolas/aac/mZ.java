/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface mz extends lE, IntToLongFunction { default lU a(hx paramhx) { return paramChar -> paramhx.a(b(paramChar)); }
/*    */ 
/*    */   
/*  4 */   default is a(gh paramgh) { return paramChar -> paramgh.a(b(paramChar)); }
/*  5 */   default void b(long paramLong) { throw new UnsupportedOperationException(); }
/*  6 */   default jO a(gD paramgD) { return paramInt -> b(paramgD.a(paramInt)); }
/*    */   @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); }
/*  8 */   default eK a(aB paramaB) { return paramChar -> paramaB.a(b(paramChar)); } @Deprecated default long applyAsLong(int paramInt) { return b(j6.a(paramInt)); } default gs a(km paramkm) { return paramChar -> paramkm.b(b(paramChar)); } default d_ a(mI parammI) { return paramChar -> parammI.d(b(paramChar)); } default lV a(dq paramdq) { return paramShort -> b(paramdq.b(paramShort)); } default g0 a(hE paramhE) { return paramFloat -> b(paramhE.a(paramFloat)); } @Deprecated default Long c(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  char c = ((Character)paramObject).charValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return f(c) ? Long.valueOf(a(c)) : null; } @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : f(((Character)paramObject).charValue()); } @Deprecated default Long d(Object paramObject) { long l; try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/* 41 */     char c = ((Character)paramObject).charValue();
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
/* 53 */     try { if ((l = b(c)) == b()) { try { if (f(c)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   default dX a(kp paramkp) { return paramChar -> paramkp.b(b(paramChar)); }
/*    */   @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); }
/*    */   default hh a(m1 paramm1) { return paramObject -> b(paramm1.a(paramObject)); }
/*    */   default fi a(kJ paramkJ) { return paramChar -> paramkJ.b(b(paramChar)); }
/*    */   default g1 a(i parami) { return paramObject -> b(parami.c(paramObject)); }
/*    */   default i9 a(iW paramiW) { return paramDouble -> b(paramiW.b(paramDouble)); }
/*    */   default boolean f(char paramChar) { return true; }
/*    */   default long a(char paramChar, long paramLong) { long l; try { if ((l = b(paramChar)) == b()) { try { if (f(paramChar)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramLong; }  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 63 */      } @Deprecated default Long a(Character paramCharacter, Long paramLong) { char c = paramCharacter.charValue(); boolean bool = f(c); long l = b(c, paramLong.longValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Long.valueOf(l) : null; } default mz a(lU paramlU) { return paramChar -> b(paramlU.b(paramChar)); } default mz a(kw paramkw) { return paramChar -> paramkw.a(b(paramChar)); } default c0 a(ep paramep) { return paramByte -> b(paramep.a(paramByte)); } @Deprecated default Object get(Object paramObject) { return d(paramObject); } default kw a(hx paramhx) { return paramLong -> b(paramhx.a(paramLong)); } default d1 a(ia paramia) { return paramChar -> paramia.b(b(paramChar)); } @Deprecated default Long b(Object paramObject, Long paramLong) { try { if (paramObject == null) return paramLong;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  char c = ((Character)paramObject).charValue(); long l = b(c); try { if (l == b()) { try { if (f(c)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramLong; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return b(paramObject1, (Long)paramObject2); } @Deprecated default Object remove(Object paramObject) { return c(paramObject); } default long b() { return 0L; } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return a((Character)paramObject1, (Long)paramObject2); } default long a(char paramChar) { throw new UnsupportedOperationException(); }
/* 64 */   default long b(char paramChar, long paramLong) { throw new UnsupportedOperationException(); }
/*    */ 
/*    */   
/*    */   long b(char paramChar);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\mz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */