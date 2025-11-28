/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface i9 extends lE, DoubleToLongFunction { default hh a(k2 paramk2) { return paramObject -> a(paramk2.b(paramObject)); } @Deprecated
/*  2 */   default Object get(Object paramObject) { return e(paramObject); } @Deprecated default boolean containsKey(Object paramObject) { try {  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException)
/*  4 */     { throw a(null); }  return (paramObject == null) ? false : f(((Double)paramObject).doubleValue()); } default mD a(aB paramaB) {
/*  5 */     return paramDouble -> paramaB.a(a(paramDouble));
/*    */   }
/*  7 */   default k1 a(ia paramia) { return paramDouble -> paramia.b(a(paramDouble)); }
/*  8 */   default boolean f(double paramDouble) { return true; } @Deprecated default Long e(Object paramObject) { long l; 
/*  9 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/* 57 */     double d = ((Double)paramObject).doubleValue(); try { if ((l = a(d)) == c()) { try { if (f(d)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   default long a(double paramDouble, long paramLong) { throw new UnsupportedOperationException(); }
/* 59 */   default void c(long paramLong) { throw new UnsupportedOperationException(); } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return a((Double)paramObject1, (Long)paramObject2); } @Deprecated default Long c(Object paramObject, Long paramLong) { try { if (paramObject == null) return paramLong;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  double d = ((Double)paramObject).doubleValue(); long l = a(d); try { if (l == c()) { try { if (f(d)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramLong; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default c0 a(iT paramiT) { return paramByte -> a(paramiT.a(paramByte)); } default long b(double paramDouble, long paramLong) { long l; try { if ((l = a(paramDouble)) == c()) { try { if (f(paramDouble)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramLong; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default long applyAsLong(double paramDouble) { return a(paramDouble); } default hu a(mI parammI) { return paramDouble -> parammI.d(a(paramDouble)); } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return c(paramObject1, (Long)paramObject2); } default i9 a(o paramo) { return paramDouble -> a(paramo.b(paramDouble)); } @Deprecated default Long a(Double paramDouble, Long paramLong) { double d = paramDouble.doubleValue(); boolean bool = f(d); long l = a(d, paramLong.longValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Long.valueOf(l) : null; }
/*    */   default i9 a(kw paramkw) { return paramDouble -> paramkw.a(a(paramDouble)); }
/* 61 */   @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } default jp a(kp paramkp) { return paramDouble -> paramkp.b(a(paramDouble)); } default g1 a(jJ paramjJ) { return paramObject -> a(paramjJ.d(paramObject)); } default go a(kJ paramkJ) { return paramDouble -> paramkJ.b(a(paramDouble)); } default o a(gh paramgh) { return paramDouble -> paramgh.a(a(paramDouble)); } default g0 a(c3 paramc3) { return paramFloat -> a(paramc3.a(paramFloat)); } default iW a(hx paramhx) { return paramDouble -> paramhx.a(a(paramDouble)); } @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); } default mz a(is paramis) { return paramChar -> a(paramis.b(paramChar)); } @Deprecated default Long f(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  double d = ((Double)paramObject).doubleValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return f(d) ? Long.valueOf(b(d)) : null; } default kw a(gh paramgh) { return paramLong -> a(paramgh.a(paramLong)); } @Deprecated default Object remove(Object paramObject) { return f(paramObject); } default long c() { return 0L; } default az a(km paramkm) { return paramDouble -> paramkm.b(a(paramDouble)); }
/* 62 */   default lV a(iM paramiM) { return paramShort -> a(paramiM.b(paramShort)); }
/* 63 */   default jO a(ij paramij) { return paramInt -> a(paramij.a(paramInt)); } default long b(double paramDouble) {
/* 64 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   long a(double paramDouble);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\i9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */