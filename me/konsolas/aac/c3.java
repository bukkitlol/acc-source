/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface c3 extends lE, DoubleUnaryOperator { default cM a(go paramgo) { return paramFloat -> paramgo.b(a(paramFloat)); }
/*    */ 
/*    */   
/*  4 */   default c3 a(o paramo) { return paramFloat -> paramo.b(a(paramFloat)); } @Deprecated
/*  5 */   default Object put(Object paramObject1, Object paramObject2) { return a((Float)paramObject1, (Double)paramObject2); }
/*    */   @Deprecated
/*  7 */   default Object get(Object paramObject) { return g(paramObject); }
/*  8 */   default gh a(km paramkm) { return paramLong -> a(paramkm.b(paramLong)); } default iM a(cT paramcT) {
/*  9 */     return paramShort -> a(paramcT.b(paramShort));
/*    */   }
/*    */   default o a(az paramaz) {
/* 12 */     return paramDouble -> a(paramaz.a(paramDouble));
/*    */   }
/* 14 */   default iT a(b paramb) { return paramByte -> a(paramb.b(paramByte)); }
/* 15 */   default is a(gs paramgs) { return paramChar -> a(paramgs.a(paramChar)); }
/* 16 */   default hE a(iW paramiW) { return paramFloat -> paramiW.b(a(paramFloat)); }
/* 17 */   default lT a(hu paramhu) { return paramFloat -> paramhu.c(a(paramFloat)); }
/* 18 */   default jJ a(f3 paramf3) { return paramObject -> a(paramf3.c(paramObject)); } @Deprecated default Double h(Object paramObject) { 
/* 19 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/* 46 */     float f = ((Float)paramObject).floatValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return c(f) ? Double.valueOf(b(f)) : null; }
/*    */   @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : c(((Float)paramObject).floatValue()); }
/*    */   default double b(float paramFloat, double paramDouble) { double d; try { if ((d = a(paramFloat)) == d()) { try { if (c(paramFloat)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramDouble; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/* 49 */   default hL a(az paramaz) { return paramFloat -> paramaz.a(a(paramFloat)); } @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } default k2 a(mU parammU) { return paramObject -> a(parammU.a(paramObject)); } @Deprecated default Double g(Object paramObject) { double d; try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  float f = ((Float)paramObject).floatValue(); try { if ((d = a(f)) == d()) { try { if (c(f)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   default double b(float paramFloat) { throw new UnsupportedOperationException(); }
/*    */   @Deprecated default Double d(Object paramObject, Double paramDouble) { try { if (paramObject == null)
/*    */         return paramDouble;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  float f = ((Float)paramObject).floatValue(); double d = a(f); try { if (d == d()) { try { if (c(f)); }
/*    */         catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */          return paramDouble; }
/*    */        }
/*    */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      }
/*    */   @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); }
/* 59 */   default lb a(k1 paramk1) { return paramFloat -> paramk1.a(a(paramFloat)); } @Deprecated default Double a(Float paramFloat, Double paramDouble) { float f = paramFloat.floatValue(); boolean bool = c(f); double d = a(f, paramDouble.doubleValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Double.valueOf(d) : null; } default c3 a(hL paramhL) { return paramFloat -> a(paramhL.b(paramFloat)); } @Deprecated default double applyAsDouble(double paramDouble) { return a(j6.a(paramDouble)); } default ij a(l paraml) { return paramInt -> a(paraml.b(paramInt)); } default void d(double paramDouble) { throw new UnsupportedOperationException(); } default g0 a(i9 parami9) { return paramFloat -> parami9.a(a(paramFloat)); } default boolean c(float paramFloat) { return true; } default double d() { return 0.0D; } default mb a(jp paramjp) { return paramFloat -> paramjp.a(a(paramFloat)); }
/* 60 */   @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return d(paramObject1, (Double)paramObject2); }
/* 61 */   default mP a(mD parammD) { return paramFloat -> parammD.b(a(paramFloat)); } @Deprecated
/* 62 */   default Object remove(Object paramObject) { return h(paramObject); }
/*    */    default double a(float paramFloat, double paramDouble) {
/* 64 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   double a(float paramFloat);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\c3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */