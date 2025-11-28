/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface gh extends lE, LongToDoubleFunction { default boolean c(long paramLong) { return true; }
/*    */   
/*  3 */   default ij a(jO paramjO) { return paramInt -> a(paramjO.a(paramInt)); }
/*  4 */   default void f(double paramDouble) { throw new UnsupportedOperationException(); }
/*  5 */   default kw a(i9 parami9) { return paramLong -> parami9.a(a(paramLong)); } @Deprecated
/*  6 */   default Object remove(Object paramObject) { return k(paramObject); } default gh a(o paramo) {
/*  7 */     return paramLong -> paramo.b(a(paramLong));
/*    */   }
/*  9 */   default ia a(k1 paramk1) { return paramLong -> paramk1.a(a(paramLong)); } default o a(i9 parami9) {
/* 10 */     return paramDouble -> a(parami9.a(paramDouble));
/*    */   }
/*    */   
/*    */   default gh a(kw paramkw)
/*    */   {
/* 15 */     return paramLong -> a(paramkw.a(paramLong));
/* 16 */   } default double applyAsDouble(long paramLong) { return a(paramLong); } @Deprecated default Double f(Object paramObject, Double paramDouble) { 
/* 17 */     try { if (paramObject == null) return paramDouble;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/*    */     long l = ((Long)paramObject).longValue();
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
/* 62 */     double d = a(l); try { if (d == f()) { try { if (c(l)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramDouble; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } @Deprecated default Double l(Object paramObject) { double d; try { if (paramObject == null)
/*    */         return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 64 */      long l = ((Long)paramObject).longValue(); try { if ((d = a(l)) == f()) { try { if (c(l)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      }
/*    */ 
/*    */   
/*    */   default iM a(lV paramlV) {
/*    */     return paramShort -> a(paramlV.a(paramShort));
/*    */   }
/*    */   
/*    */   default km a(az paramaz) {
/*    */     return paramLong -> paramaz.a(a(paramLong));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object get(Object paramObject) {
/*    */     return l(paramObject);
/*    */   }
/*    */   
/*    */   default mI a(hu paramhu) {
/*    */     return paramLong -> paramhu.c(a(paramLong));
/*    */   }
/*    */   
/*    */   default double a(long paramLong, double paramDouble) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default double f() {
/*    */     return 0.0D;
/*    */   }
/*    */   
/*    */   default jJ a(g1 paramg1) {
/*    */     return paramObject -> a(paramg1.d(paramObject));
/*    */   }
/*    */   
/*    */   default is a(mz parammz) {
/*    */     return paramChar -> a(parammz.b(paramChar));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default boolean containsKey(Object paramObject) {
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return (paramObject == null) ? false : c(((Long)paramObject).longValue());
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Double k(Object paramObject) {
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
/*    */     return c(l) ? Double.valueOf(b(l)) : null;
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function andThen(Function paramFunction) {
/*    */     return super.andThen(paramFunction);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function compose(Function paramFunction) {
/*    */     return super.compose(paramFunction);
/*    */   }
/*    */   
/*    */   default iT a(c0 paramc0) {
/*    */     return paramByte -> a(paramc0.a(paramByte));
/*    */   }
/*    */   
/*    */   default double b(long paramLong) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object getOrDefault(Object paramObject1, Object paramObject2) {
/*    */     return f(paramObject1, (Double)paramObject2);
/*    */   }
/*    */   
/*    */   default kJ a(go paramgo) {
/*    */     return paramLong -> paramgo.b(a(paramLong));
/*    */   }
/*    */   
/*    */   default kp a(jp paramjp) {
/*    */     return paramLong -> paramjp.a(a(paramLong));
/*    */   }
/*    */   
/*    */   default k2 a(hh paramhh) {
/*    */     return paramObject -> a(paramhh.b(paramObject));
/*    */   }
/*    */   
/*    */   default c3 a(g0 paramg0) {
/*    */     return paramFloat -> a(paramg0.b(paramFloat));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object put(Object paramObject1, Object paramObject2) {
/*    */     return a((Long)paramObject1, (Double)paramObject2);
/*    */   }
/*    */   
/*    */   default aB a(mD parammD) {
/*    */     return paramLong -> parammD.b(a(paramLong));
/*    */   }
/*    */   
/*    */   default hx a(iW paramiW) {
/*    */     return paramLong -> paramiW.b(a(paramLong));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Double a(Long paramLong, Double paramDouble) {
/*    */     long l = paramLong.longValue();
/*    */     boolean bool = c(l);
/*    */     double d = a(l, paramDouble.doubleValue());
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return bool ? Double.valueOf(d) : null;
/*    */   }
/*    */   
/*    */   default double b(long paramLong, double paramDouble) {
/*    */     double d;
/*    */     try {
/*    */       if ((d = a(paramLong)) == f()) {
/*    */         try {
/*    */           if (c(paramLong));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return paramDouble;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   double a(long paramLong);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\gh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */