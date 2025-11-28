/*    */ package me.konsolas.aac;
/*    */ 
/*    */ @FunctionalInterface
/*    */ public interface km extends lE, LongToDoubleFunction {
/*  5 */   default boolean d(long paramLong) { return true; } default hL a(g0 paramg0) {
/*  6 */     return paramFloat -> b(paramg0.b(paramFloat));
/*    */   }
/*  8 */   default void f(float paramFloat) { throw new UnsupportedOperationException(); }
/*  9 */   default az a(i9 parami9) { return paramDouble -> b(parami9.a(paramDouble)); } default float b(long paramLong, float paramFloat) { float f;
/*    */     
/* 11 */     try { if ((f = b(paramLong)) == f()) { try { if (d(paramLong)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramFloat; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/* 12 */   default double applyAsDouble(long paramLong) { return b(paramLong); } default gs a(mz parammz) { return paramChar -> b(parammz.b(paramChar)); } default kJ a(cM paramcM) { return paramLong -> paramcM.b(b(paramLong)); } default aB a(mP parammP) { return paramLong -> parammP.b(b(paramLong)); } default float a(long paramLong) { throw new UnsupportedOperationException(); } @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); } default mU a(hh paramhh) { return paramObject -> b(paramhh.b(paramObject)); } default kp a(mb parammb) { return paramLong -> parammb.a(b(paramLong)); } default cT a(lV paramlV) { return paramShort -> b(paramlV.a(paramShort)); } @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } @Deprecated default Object remove(Object paramObject) { return k(paramObject); } @Deprecated default Float a(Long paramLong, Float paramFloat) { long l = paramLong.longValue();
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
/* 42 */     boolean bool = d(l);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 50 */     float f = a(l, paramFloat.floatValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Float.valueOf(f) : null; }
/* 51 */   default mI a(lT paramlT) { return paramLong -> paramlT.c(b(paramLong)); } default ia a(lb paramlb) { return paramLong -> paramlb.a(b(paramLong)); } @Deprecated default Float l(Object paramObject) { float f; try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  long l = ((Long)paramObject).longValue(); try { if ((f = b(l)) == f()) { try { if (d(l)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return a((Long)paramObject1, (Float)paramObject2); } default kw a(g0 paramg0) { return paramLong -> paramg0.b(b(paramLong)); } default gh a(c3 paramc3) { return paramLong -> paramc3.a(b(paramLong)); } default km a(kw paramkw) { return paramLong -> b(paramkw.a(paramLong)); } default float f() { return 0.0F; } default hx a(hE paramhE) { return paramLong -> paramhE.a(b(paramLong)); } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return f(paramObject1, (Float)paramObject2); } default float a(long paramLong, float paramFloat) { throw new UnsupportedOperationException(); } default l a(jO paramjO) { return paramInt -> b(paramjO.a(paramInt)); } @Deprecated default boolean containsKey(Object paramObject) { try {  }
/* 52 */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : d(((Long)paramObject).longValue()); } @Deprecated
/* 53 */   default Object get(Object paramObject) { return l(paramObject); }
/*    */ 
/*    */   
/* 56 */   default km a(hL paramhL) { return paramLong -> paramhL.b(b(paramLong)); }
/* 57 */   default b a(c0 paramc0) { return paramByte -> b(paramc0.a(paramByte)); } @Deprecated default Float f(Object paramObject, Float paramFloat) { 
/* 58 */     try { if (paramObject == null) return paramFloat;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 59 */      long l = ((Long)paramObject).longValue(); float f = b(l);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 64 */     try { if (f == f()) { try { if (d(l)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramFloat; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      }
/*    */ 
/*    */   
/*    */   default f3 a(g1 paramg1) {
/*    */     return paramObject -> b(paramg1.d(paramObject));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Float k(Object paramObject) {
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return null; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     long l = ((Long)paramObject).longValue();
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return d(l) ? Float.valueOf(a(l)) : null;
/*    */   }
/*    */   
/*    */   float b(long paramLong);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\km.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */