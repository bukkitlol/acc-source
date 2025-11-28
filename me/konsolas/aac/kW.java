/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface kw extends lE, LongUnaryOperator { @Deprecated default Long f(Object paramObject, Long paramLong) { try { if (paramObject == null) return paramLong;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/* 36 */     long l1 = ((Long)paramObject).longValue();
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
/* 59 */     long l2 = a(l1); try { if (l2 == f()) { try { if (f(l1)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramLong; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   default aB a(aB paramaB) { return paramLong -> paramaB.a(a(paramLong)); }
/* 61 */   default g1 a(g1 paramg1) { return paramObject -> a(paramg1.d(paramObject)); } default kp a(kp paramkp) { return paramLong -> paramkp.b(a(paramLong)); } @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : f(((Long)paramObject).longValue()); } default long f() { return 0L; } static kw a() { return paramLong -> paramLong; } @Deprecated default Long a(Long paramLong1, Long paramLong2) { long l1 = paramLong1.longValue(); boolean bool = f(l1); long l2 = a(l1, paramLong2.longValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Long.valueOf(l2) : null; } @Deprecated default Object get(Object paramObject) { return l(paramObject); } default gh b(gh paramgh) { return paramLong -> paramgh.a(a(paramLong)); } @Deprecated default Long l(Object paramObject) { long l2; try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  long l1 = ((Long)paramObject).longValue(); try { if ((l2 = a(l1)) == f()) { try { if (f(l1)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default long b(long paramLong1, long paramLong2) { long l; try { if ((l = a(paramLong1)) == f()) { try { if (f(paramLong1)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramLong2; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default long applyAsLong(long paramLong) { return a(paramLong); } @Deprecated default Long k(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  long l = ((Long)paramObject).longValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return f(l) ? Long.valueOf(b(l)) : null; } default kJ b(kJ paramkJ) { return paramLong -> paramkJ.b(a(paramLong)); } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return f(paramObject1, (Long)paramObject2); } default long b(long paramLong) { throw new UnsupportedOperationException(); }
/*    */   default lV a(lV paramlV) { return paramShort -> a(paramlV.a(paramShort)); }
/* 63 */   default hh a(hh paramhh) { return paramObject -> a(paramhh.b(paramObject)); } default g0 b(g0 paramg0) { return paramFloat -> a(paramg0.b(paramFloat)); } @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } default jO b(jO paramjO) { return paramInt -> a(paramjO.a(paramInt)); } default hx b(hx paramhx) { return paramLong -> paramhx.a(a(paramLong)); } default kw b(kw paramkw) { return paramLong -> a(paramkw.a(paramLong)); } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return a((Long)paramObject1, (Long)paramObject2); } default mz b(mz parammz) { return paramChar -> a(parammz.b(paramChar)); } default c0 b(c0 paramc0) { return paramByte -> a(paramc0.a(paramByte)); } default ia b(ia paramia) { return paramLong -> paramia.b(a(paramLong)); } default i9 b(i9 parami9) { return paramDouble -> a(parami9.a(paramDouble)); } default void f(long paramLong) { throw new UnsupportedOperationException(); } @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); } @Deprecated default Object remove(Object paramObject) { return k(paramObject); } default km b(km paramkm) { return paramLong -> paramkm.b(a(paramLong)); } default boolean f(long paramLong) { return true; }
/* 64 */   default long a(long paramLong1, long paramLong2) { throw new UnsupportedOperationException(); }
/* 65 */   default mI a(mI parammI) { return paramLong -> parammI.d(a(paramLong)); } default kw a(kw paramkw) {
/* 66 */     return paramLong -> paramkw.a(a(paramLong));
/*    */   }
/*    */   
/*    */   long a(long paramLong);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\kw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */