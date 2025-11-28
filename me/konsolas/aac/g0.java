/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface g0 extends lE, DoubleToLongFunction { @Deprecated default Object remove(Object paramObject) { return g(paramObject); }
/*  2 */   default hh a(mU parammU) { return paramObject -> b(parammU.a(paramObject)); } @Deprecated
/*    */   default Object put(Object paramObject1, Object paramObject2) {
/*  4 */     return a((Float)paramObject1, (Long)paramObject2);
/*    */   }
/*    */   default long b(float paramFloat, long paramLong) {
/*  7 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   default lV a(cT paramcT) {
/* 10 */     return paramShort -> b(paramcT.b(paramShort));
/*    */   }
/* 12 */   default c3 a(gh paramgh) { return paramFloat -> paramgh.a(b(paramFloat)); }
/*    */   default lT a(mI parammI) { return paramFloat -> parammI.d(b(paramFloat)); }
/*    */   default long d() { return 0L; } @Deprecated default Long h(Object paramObject) { long l; 
/* 15 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     float f = ((Float)paramObject).floatValue();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 33 */     try { if ((l = b(f)) == d()) { try { if (f(f)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      }
/*    */   @Deprecated default boolean containsKey(Object paramObject) { try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return (paramObject == null) ? false : f(((Float)paramObject).floatValue()); } @Deprecated default Long a(Float paramFloat, Long paramLong) { float f = paramFloat.floatValue();
/* 41 */     boolean bool = f(f);
/*    */     long l = b(f, paramLong.longValue());
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return bool ? Long.valueOf(l) : null; } default long a(float paramFloat) {
/*    */     throw new UnsupportedOperationException();
/*    */   } @Deprecated
/*    */   default Function compose(Function paramFunction) {
/*    */     return super.compose(paramFunction);
/*    */   } @Deprecated
/*    */   default Object get(Object paramObject) {
/*    */     return h(paramObject);
/*    */   } @Deprecated
/*    */   default Long d(Object paramObject, Long paramLong) {
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return paramLong; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/* 64 */     float f = ((Float)paramObject).floatValue();
/*    */     long l = b(f);
/*    */     try {
/*    */       if (l == d()) {
/*    */         try {
/*    */           if (f(f));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return paramLong;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   default g0 a(hL paramhL) {
/*    */     return paramFloat -> b(paramhL.b(paramFloat));
/*    */   }
/*    */   
/*    */   default g1 a(f3 paramf3) {
/*    */     return paramObject -> b(paramf3.c(paramObject));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object getOrDefault(Object paramObject1, Object paramObject2) {
/*    */     return d(paramObject1, (Long)paramObject2);
/*    */   }
/*    */   
/*    */   default mz a(gs paramgs) {
/*    */     return paramChar -> b(paramgs.a(paramChar));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default long applyAsLong(double paramDouble) {
/*    */     return b(j6.a(paramDouble));
/*    */   }
/*    */   
/*    */   default long a(float paramFloat, long paramLong) {
/*    */     long l;
/*    */     try {
/*    */       if ((l = b(paramFloat)) == d()) {
/*    */         try {
/*    */           if (f(paramFloat));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return paramLong;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   default c0 a(b paramb) {
/*    */     return paramByte -> b(paramb.b(paramByte));
/*    */   }
/*    */   
/*    */   default g0 a(kw paramkw) {
/*    */     return paramFloat -> paramkw.a(b(paramFloat));
/*    */   }
/*    */   
/*    */   default kw a(km paramkm) {
/*    */     return paramLong -> b(paramkm.b(paramLong));
/*    */   }
/*    */   
/*    */   default hL a(km paramkm) {
/*    */     return paramFloat -> paramkm.b(b(paramFloat));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function andThen(Function paramFunction) {
/*    */     return super.andThen(paramFunction);
/*    */   }
/*    */   
/*    */   default void d(long paramLong) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default mP a(aB paramaB) {
/*    */     return paramFloat -> paramaB.a(b(paramFloat));
/*    */   }
/*    */   
/*    */   default i9 a(az paramaz) {
/*    */     return paramDouble -> b(paramaz.a(paramDouble));
/*    */   }
/*    */   
/*    */   default hE a(hx paramhx) {
/*    */     return paramFloat -> paramhx.a(b(paramFloat));
/*    */   }
/*    */   
/*    */   default boolean f(float paramFloat) {
/*    */     return true;
/*    */   }
/*    */   
/*    */   default mb a(kp paramkp) {
/*    */     return paramFloat -> paramkp.b(b(paramFloat));
/*    */   }
/*    */   
/*    */   default cM a(kJ paramkJ) {
/*    */     return paramFloat -> paramkJ.b(b(paramFloat));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Long g(Object paramObject) {
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return null; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     float f = ((Float)paramObject).floatValue();
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return f(f) ? Long.valueOf(a(f)) : null;
/*    */   }
/*    */   
/*    */   default lb a(ia paramia) {
/*    */     return paramFloat -> paramia.b(b(paramFloat));
/*    */   }
/*    */   
/*    */   default jO a(l paraml) {
/*    */     return paramInt -> b(paraml.b(paramInt));
/*    */   }
/*    */   
/*    */   long b(float paramFloat);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\g0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */