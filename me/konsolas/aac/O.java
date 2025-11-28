/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface o extends lE, DoubleUnaryOperator { default iT b(iT paramiT) { return paramByte -> b(paramiT.a(paramByte)); } @Deprecated
/*  2 */   default Object put(Object paramObject1, Object paramObject2) { return a((Double)paramObject1, (Double)paramObject2); }
/*    */ 
/*    */   
/*  5 */   static o a() { return paramDouble -> paramDouble; }
/*  6 */   default iM a(iM paramiM) { return paramShort -> b(paramiM.b(paramShort)); } default double b(double paramDouble1, double paramDouble2) { double d; 
/*  7 */     try { if ((d = b(paramDouble1)) == c()) { try { if (c(paramDouble1)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramDouble2; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*  8 */      } @Deprecated default Object remove(Object paramObject) { return f(paramObject); } @Deprecated
/*    */   default Double c(Object paramObject, Double paramDouble) { 
/* 10 */     try { if (paramObject == null) return paramDouble;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/* 25 */     double d1 = ((Double)paramObject).doubleValue();
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
/* 51 */     double d2 = b(d1); try { if (d2 == c()) { try { if (c(d1)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramDouble; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return c(paramObject1, (Double)paramObject2); }
/* 53 */   default is b(is paramis) { return paramChar -> b(paramis.b(paramChar)); } default i9 a(i9 parami9) { return paramDouble -> parami9.a(b(paramDouble)); } default ij a(ij paramij) { return paramInt -> b(paramij.a(paramInt)); } default double a(double paramDouble) { throw new UnsupportedOperationException(); } default mD a(mD parammD) { return paramDouble -> parammD.b(b(paramDouble)); } default double a(double paramDouble1, double paramDouble2) { throw new UnsupportedOperationException(); } default double applyAsDouble(double paramDouble) { return b(paramDouble); } default iW b(iW paramiW) { return paramDouble -> paramiW.b(b(paramDouble)); } @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : c(((Double)paramObject).doubleValue()); } default k2 a(k2 paramk2) { return paramObject -> b(paramk2.b(paramObject)); }
/* 54 */   default jp a(jp paramjp) { return paramDouble -> paramjp.a(b(paramDouble)); } @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } default go a(go paramgo) { return paramDouble -> paramgo.b(b(paramDouble)); } default gh a(gh paramgh) { return paramLong -> b(paramgh.a(paramLong)); } default o b(o paramo) { return paramDouble -> paramo.b(b(paramDouble)); } default jJ a(jJ paramjJ) { return paramObject -> b(paramjJ.d(paramObject)); } default c3 a(c3 paramc3) { return paramFloat -> b(paramc3.a(paramFloat)); } @Deprecated default Double f(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  double d = ((Double)paramObject).doubleValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return c(d) ? Double.valueOf(a(d)) : null; } @Deprecated default Object get(Object paramObject) { return e(paramObject); } default double c() { return 0.0D; } default boolean c(double paramDouble) { return true; } default az a(az paramaz) { return paramDouble -> paramaz.a(b(paramDouble)); }
/* 55 */   default hu a(hu paramhu) { return paramDouble -> paramhu.c(b(paramDouble)); }
/*    */   @Deprecated
/* 57 */   default Double a(Double paramDouble1, Double paramDouble2) { double d1 = paramDouble1.doubleValue();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 62 */     boolean bool = c(d1); double d2 = a(d1, paramDouble2.doubleValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Double.valueOf(d2) : null; } @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); }
/*    */   default o a(o paramo) { return paramDouble -> b(paramo.b(paramDouble)); }
/* 64 */   @Deprecated default Double e(Object paramObject) { double d2; try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  double d1 = ((Double)paramObject).doubleValue(); try { if ((d2 = b(d1)) == c()) { try { if (c(d1)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 65 */      } default void c(double paramDouble) { throw new UnsupportedOperationException(); } default k1 b(k1 paramk1) {
/* 66 */     return paramDouble -> paramk1.a(b(paramDouble));
/*    */   }
/*    */   
/*    */   double b(double paramDouble);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */