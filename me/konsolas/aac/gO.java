/*    */ package me.konsolas.aac;@FunctionalInterface
/*  2 */ public interface go extends lE, DoubleToIntFunction { default int a(double paramDouble, int paramInt) { throw new UnsupportedOperationException(); }
/*    */   
/*  4 */   default iW a(gD paramgD) { return paramDouble -> paramgD.a(b(paramDouble)); }
/*    */   default int b(double paramDouble, int paramInt) { int i;
/*    */     
/*  7 */     try { if ((i = b(paramDouble)) == c()) { try { if (e(paramDouble)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramInt; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*  8 */      } default mu a(jJ paramjJ) { return paramObject -> b(paramjJ.d(paramObject)); }
/*    */   
/*    */   default mD a(c6 paramc6) {
/* 11 */     return paramDouble -> paramc6.a(b(paramDouble));
/*    */   }
/*    */   
/*    */   default ju a(k2 paramk2) {
/* 15 */     return paramObject -> b(paramk2.b(paramObject)); } default go a(kO paramkO) {
/* 16 */     return paramDouble -> paramkO.a(b(paramDouble));
/*    */   }
/* 18 */   default boolean e(double paramDouble) { return true; } @Deprecated default Integer c(Object paramObject, Integer paramInteger) { 
/* 19 */     try { if (paramObject == null) return paramInteger;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 25 */     double d = ((Double)paramObject).doubleValue(); int i = b(d); try { if (i == c()) { try { if (e(d)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramInteger; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default int a(double paramDouble) { throw new UnsupportedOperationException(); } default kO a(ij paramij) { return paramInt -> b(paramij.a(paramInt)); }
/* 26 */   default go a(o paramo) { return paramDouble -> b(paramo.b(paramDouble)); } @Deprecated
/* 27 */   default Object remove(Object paramObject) { return f(paramObject); } default kJ a(gh paramgh) {
/* 28 */     return paramLong -> b(paramgh.a(paramLong));
/*    */   }
/*    */   
/* 31 */   default o a(ij paramij) { return paramDouble -> paramij.a(b(paramDouble)); }
/*    */   @Deprecated
/* 33 */   default Object get(Object paramObject) { return e(paramObject); }
/* 34 */   default kf a(iT paramiT) { return paramByte -> b(paramiT.a(paramByte)); }
/* 35 */   default hu a(gl paramgl) { return paramDouble -> paramgl.c(b(paramDouble)); } @Deprecated
/* 36 */   default Object getOrDefault(Object paramObject1, Object paramObject2) { return c(paramObject1, (Integer)paramObject2); } @Deprecated default boolean containsKey(Object paramObject) { try {  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException)
/* 38 */     { throw a(null); }  return (paramObject == null) ? false : e(((Double)paramObject).doubleValue()); } @Deprecated default Integer e(Object paramObject) { int i; 
/* 39 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     double d = ((Double)paramObject).doubleValue();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 49 */     try { if ((i = b(d)) == c()) { try { if (e(d)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/* 50 */   default int applyAsInt(double paramDouble) { return b(paramDouble); } default int c() { return 0; } default jp a(an paraman) { return paramDouble -> paraman.a(b(paramDouble)); }
/* 51 */   @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } @Deprecated default Integer a(Double paramDouble, Integer paramInteger) { double d = paramDouble.doubleValue(); boolean bool = e(d); int i = a(d, paramInteger.intValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Integer.valueOf(i) : null; } default k1 a(ls paramls) { return paramDouble -> paramls.b(b(paramDouble)); } @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); }
/* 52 */   default cM a(c3 paramc3) { return paramFloat -> b(paramc3.a(paramFloat)); } default void c(int paramInt) {
/* 53 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/* 56 */   default i9 a(jO paramjO) { return paramDouble -> paramjO.a(b(paramDouble)); } @Deprecated
/* 57 */   default Object put(Object paramObject1, Object paramObject2) { return a((Double)paramObject1, (Integer)paramObject2); }
/*    */   
/* 59 */   default eI a(iM paramiM) { return paramShort -> b(paramiM.b(paramShort)); }
/* 60 */   default az a(l paraml) { return paramDouble -> paraml.b(b(paramDouble)); }
/* 61 */   default fi a(is paramis) { return paramChar -> b(paramis.b(paramChar)); } @Deprecated default Integer f(Object paramObject) { 
/* 62 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */     
/*    */     double d = ((Double)paramObject).doubleValue();
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return e(d) ? Integer.valueOf(a(d)) : null; }
/*    */ 
/*    */   
/*    */   int b(double paramDouble);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\go.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */