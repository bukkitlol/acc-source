/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface jp extends lE, DoubleToIntFunction { default dX a(is paramis) { return paramChar -> a(paramis.b(paramChar)); }
/*    */ 
/*    */   
/*    */   @Deprecated
/*  5 */   default Object remove(Object paramObject) { return e(paramObject); }
/*  6 */   default hu a(hw paramhw) { return paramDouble -> paramhw.c(a(paramDouble)); } @Deprecated
/*  7 */   default Object put(Object paramObject1, Object paramObject2) { return a((Double)paramObject1, (Short)paramObject2); } @Deprecated
/*    */   default Short e(Object paramObject) { 
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
/* 30 */     double d = ((Double)paramObject).doubleValue();
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
/*    */     try {  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException)
/* 61 */     { throw a(null); }  return i(d) ? Short.valueOf(b(d)) : null; } @Deprecated default Short a(Double paramDouble, Short paramShort) { double d = paramDouble.doubleValue(); boolean bool = i(d);
/* 62 */     short s = b(d, paramShort.shortValue());
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return bool ? Short.valueOf(s) : null; }
/*    */ 
/*    */   
/*    */   default boolean i(double paramDouble) {
/*    */     return true;
/*    */   }
/*    */   
/*    */   default short a(double paramDouble, short paramShort) {
/*    */     short s;
/*    */     try {
/*    */       if ((s = a(paramDouble)) == c()) {
/*    */         try {
/*    */           if (i(paramDouble));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return paramShort;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   default k1 a(P paramP) {
/*    */     return paramDouble -> paramP.b(a(paramDouble));
/*    */   }
/*    */   
/*    */   default ic a(iM paramiM) {
/*    */     return paramShort -> a(paramiM.b(paramShort));
/*    */   }
/*    */   
/*    */   default short b(double paramDouble) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Short c(Object paramObject, Short paramShort) {
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return paramShort; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     double d = ((Double)paramObject).doubleValue();
/*    */     short s = a(d);
/*    */     try {
/*    */       if (s == c()) {
/*    */         try {
/*    */           if (i(d));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return paramShort;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   default int applyAsInt(double paramDouble) {
/*    */     return a(paramDouble);
/*    */   }
/*    */   
/*    */   default jp a(o paramo) {
/*    */     return paramDouble -> a(paramo.b(paramDouble));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object get(Object paramObject) {
/*    */     return f(paramObject);
/*    */   }
/*    */   
/*    */   default jp a(ic paramic) {
/*    */     return paramDouble -> paramic.a(a(paramDouble));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Short f(Object paramObject) {
/*    */     short s;
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return null; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     double d = ((Double)paramObject).doubleValue();
/*    */     try {
/*    */       if ((s = a(d)) == c()) {
/*    */         try {
/*    */           if (i(d));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return null;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object getOrDefault(Object paramObject1, Object paramObject2) {
/*    */     return c(paramObject1, (Short)paramObject2);
/*    */   }
/*    */   
/*    */   default ar a(iT paramiT) {
/*    */     return paramByte -> a(paramiT.a(paramByte));
/*    */   }
/*    */   
/*    */   default mD a(a parama) {
/*    */     return paramDouble -> parama.a(a(paramDouble));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function compose(Function paramFunction) {
/*    */     return super.compose(paramFunction);
/*    */   }
/*    */   
/*    */   default dU a(k2 paramk2) {
/*    */     return paramObject -> a(paramk2.b(paramObject));
/*    */   }
/*    */   
/*    */   default go a(eI parameI) {
/*    */     return paramDouble -> parameI.b(a(paramDouble));
/*    */   }
/*    */   
/*    */   default mb a(c3 paramc3) {
/*    */     return paramFloat -> a(paramc3.a(paramFloat));
/*    */   }
/*    */   
/*    */   default short c() {
/*    */     return 0;
/*    */   }
/*    */   
/*    */   default short b(double paramDouble, short paramShort) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default void c(short paramShort) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default boolean containsKey(Object paramObject) {
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return (paramObject == null) ? false : i(((Double)paramObject).doubleValue());
/*    */   }
/*    */   
/*    */   default kp a(gh paramgh) {
/*    */     return paramLong -> a(paramgh.a(paramLong));
/*    */   }
/*    */   
/*    */   default o a(iM paramiM) {
/*    */     return paramDouble -> paramiM.b(a(paramDouble));
/*    */   }
/*    */   
/*    */   default az a(cT paramcT) {
/*    */     return paramDouble -> paramcT.b(a(paramDouble));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function andThen(Function paramFunction) {
/*    */     return super.andThen(paramFunction);
/*    */   }
/*    */   
/*    */   default iW a(dq paramdq) {
/*    */     return paramDouble -> paramdq.b(a(paramDouble));
/*    */   }
/*    */   
/*    */   default an a(ij paramij) {
/*    */     return paramInt -> a(paramij.a(paramInt));
/*    */   }
/*    */   
/*    */   default i9 a(lV paramlV) {
/*    */     return paramDouble -> paramlV.a(a(paramDouble));
/*    */   }
/*    */   
/*    */   default kL a(jJ paramjJ) {
/*    */     return paramObject -> a(paramjJ.d(paramObject));
/*    */   }
/*    */   
/*    */   short a(double paramDouble);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\jp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */