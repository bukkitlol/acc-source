/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface az extends lE, DoubleUnaryOperator { default float b(double paramDouble, float paramFloat) { float f; try { if ((f = a(paramDouble)) == c()) { try { if (d(paramDouble)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramFloat; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      } @Deprecated
/*  3 */   default Object get(Object paramObject) { return f(paramObject); } default f3 a(jJ paramjJ) {
/*  4 */     return paramObject -> a(paramjJ.d(paramObject));
/*    */   }
/*    */   default float b(double paramDouble) {
/*  7 */     throw new UnsupportedOperationException();
/*    */   }
/*  9 */   default hL a(c3 paramc3) { return paramFloat -> a(paramc3.a(paramFloat)); }
/* 10 */   default float c() { return 0.0F; } @Deprecated
/* 11 */   default Function andThen(Function paramFunction) { return super.andThen(paramFunction); }
/*    */   @Deprecated
/*    */   default Float e(Object paramObject) { 
/* 14 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/* 46 */     double d = ((Double)paramObject).doubleValue();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     try {  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException)
/* 54 */     { throw a(null); }  return d(d) ? Float.valueOf(b(d)) : null; } @Deprecated default Float f(Object paramObject) { float f; try {
/*    */       if (paramObject == null)
/*    */         return null; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     }  double d = ((Double)paramObject).doubleValue();
/*    */     
/* 61 */     try { if ((f = a(d)) == c()) { try { if (d(d)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   default gs a(is paramis) { return paramChar -> a(paramis.b(paramChar)); }
/* 63 */   @Deprecated default Object put(Object paramObject1, Object paramObject2) { return a((Double)paramObject1, (Float)paramObject2); } default float a(double paramDouble, float paramFloat) { throw new UnsupportedOperationException(); } default mD a(mP parammP) { return paramDouble -> parammP.b(a(paramDouble)); } default hu a(lT paramlT) { return paramDouble -> paramlT.c(a(paramDouble)); } default cT a(iM paramiM) { return paramShort -> a(paramiM.b(paramShort)); } default k1 a(lb paramlb) { return paramDouble -> paramlb.a(a(paramDouble)); } default l a(ij paramij) { return paramInt -> a(paramij.a(paramInt)); } @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : d(((Double)paramObject).doubleValue()); } default jp a(mb parammb) { return paramDouble -> parammb.a(a(paramDouble)); } default void c(float paramFloat) { throw new UnsupportedOperationException(); } default go a(cM paramcM) { return paramDouble -> paramcM.b(a(paramDouble)); } @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); }
/* 64 */   default o a(c3 paramc3) { return paramDouble -> paramc3.a(a(paramDouble)); } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return c(paramObject1, (Float)paramObject2); } default i9 a(g0 paramg0) { return paramDouble -> paramg0.b(a(paramDouble)); } default mU a(k2 paramk2) { return paramObject -> a(paramk2.b(paramObject)); } default az a(hL paramhL) { return paramDouble -> paramhL.b(a(paramDouble)); } default b a(iT paramiT) { return paramByte -> a(paramiT.a(paramByte)); } @Deprecated default Float a(Double paramDouble, Float paramFloat) { double d = paramDouble.doubleValue(); boolean bool = d(d); float f = a(d, paramFloat.floatValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Float.valueOf(f) : null; } default az a(o paramo) { return paramDouble -> a(paramo.b(paramDouble)); } default boolean d(double paramDouble) { return true; } default double applyAsDouble(double paramDouble) { return a(paramDouble); } @Deprecated default Float c(Object paramObject, Float paramFloat) { try { if (paramObject == null) return paramFloat;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  double d = ((Double)paramObject).doubleValue(); float f = a(d); try { if (f == c()) { try { if (d(d)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramFloat; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default iW a(hE paramhE) { return paramDouble -> paramhE.a(a(paramDouble)); } default km a(gh paramgh) { return paramLong -> a(paramgh.a(paramLong)); } @Deprecated default Object remove(Object paramObject) { return e(paramObject); }
/*    */ 
/*    */   
/*    */   float a(double paramDouble);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\az.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */