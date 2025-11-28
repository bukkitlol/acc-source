/*    */ package me.konsolas.aac;
/*    */ 
/*    */ @FunctionalInterface
/*    */ public interface mb extends lE, DoubleToIntFunction {
/*  5 */   default boolean i(float paramFloat) { return true; }
/*  6 */   default ar a(b paramb) { return paramByte -> a(paramb.b(paramByte)); }
/*  7 */   default short b(float paramFloat) { throw new UnsupportedOperationException(); } @Deprecated
/*  8 */   default Object getOrDefault(Object paramObject1, Object paramObject2) { return d(paramObject1, (Short)paramObject2); }
/*  9 */   default kp a(km paramkm) { return paramLong -> a(paramkm.b(paramLong)); }
/*    */   @Deprecated
/* 11 */   default Function andThen(Function paramFunction) { return super.andThen(paramFunction); }
/*    */   @Deprecated
/*    */   default Short d(Object paramObject, Short paramShort) { 
/* 14 */     try { if (paramObject == null) return paramShort;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/* 45 */     float f = ((Float)paramObject).floatValue();
/*    */ 
/*    */     
/* 48 */     short s = a(f); try { if (s == d()) { try { if (i(f)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramShort; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/* 49 */   @Deprecated default Short g(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  float f = ((Float)paramObject).floatValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return i(f) ? Short.valueOf(b(f)) : null; } default short b(float paramFloat, short paramShort) { throw new UnsupportedOperationException(); } default void d(short paramShort) { throw new UnsupportedOperationException(); } default short a(float paramFloat, short paramShort) { short s; try { if ((s = a(paramFloat)) == d()) { try { if (i(paramFloat)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramShort; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default dU a(mU parammU) { return paramObject -> a(parammU.a(paramObject)); } default mb a(ic paramic) { return paramFloat -> paramic.a(a(paramFloat)); } default ic a(cT paramcT) { return paramShort -> a(paramcT.b(paramShort)); } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return a((Float)paramObject1, (Short)paramObject2); } @Deprecated default int applyAsInt(double paramDouble) { return a(j6.a(paramDouble)); }
/*    */   default hE a(dq paramdq) { return paramFloat -> paramdq.b(a(paramFloat)); }
/* 51 */   default jp a(az paramaz) { return paramDouble -> a(paramaz.a(paramDouble)); } default g0 a(lV paramlV) { return paramFloat -> paramlV.a(a(paramFloat)); } default kL a(f3 paramf3) { return paramObject -> a(paramf3.c(paramObject)); } default c3 a(iM paramiM) { return paramFloat -> paramiM.b(a(paramFloat)); } default cM a(eI parameI) { return paramFloat -> parameI.b(a(paramFloat)); } @Deprecated default Object remove(Object paramObject) { return g(paramObject); } default mP a(a parama) { return paramFloat -> parama.a(a(paramFloat)); } @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); } default short d() { return 0; }
/* 52 */   default an a(l paraml) { return paramInt -> a(paraml.b(paramInt)); } default lT a(hw paramhw) {
/* 53 */     return paramFloat -> paramhw.c(a(paramFloat));
/*    */   }
/* 55 */   default lb a(P paramP) { return paramFloat -> paramP.b(a(paramFloat)); } @Deprecated
/* 56 */   default Object get(Object paramObject) { return h(paramObject); } @Deprecated default Short h(Object paramObject) { short s; 
/* 57 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  float f = ((Float)paramObject).floatValue(); try { if ((s = a(f)) == d()) { try { if (i(f)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 58 */      } @Deprecated default Short a(Float paramFloat, Short paramShort) { float f = paramFloat.floatValue(); boolean bool = i(f); short s = b(f, paramShort.shortValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 59 */      return bool ? Short.valueOf(s) : null; } default hL a(cT paramcT) { return paramFloat -> paramcT.b(a(paramFloat)); }
/* 60 */   default mb a(hL paramhL) { return paramFloat -> a(paramhL.b(paramFloat)); }
/* 61 */   default dX a(gs paramgs) { return paramChar -> a(paramgs.a(paramChar)); } @Deprecated default boolean containsKey(Object paramObject) { 
/*    */     try {  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException)
/* 64 */     { throw a(null); }  return (paramObject == null) ? false : i(((Float)paramObject).floatValue()); }
/*    */ 
/*    */   
/*    */   short a(float paramFloat);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\mb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */