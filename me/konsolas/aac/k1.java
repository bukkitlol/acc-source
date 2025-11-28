/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface k1 extends lE, DoubleToIntFunction { default ia a(gh paramgh) { return paramLong -> a(paramgh.a(paramLong)); }
/*  2 */   default o a(iT paramiT) { return paramDouble -> paramiT.a(a(paramDouble)); } @Deprecated
/*    */   default Byte a(Double paramDouble, Byte paramByte) {
/*  4 */     double d = paramDouble.doubleValue();
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
/* 45 */     boolean bool = a(d);
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
/* 64 */     byte b = a(d, paramByte.byteValue());
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return bool ? Byte.valueOf(b) : null;
/*    */   }
/*    */   
/*    */   default az a(b paramb) {
/*    */     return paramDouble -> paramb.b(a(paramDouble));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object remove(Object paramObject) {
/*    */     return e(paramObject);
/*    */   }
/*    */   
/*    */   default lb a(c3 paramc3) {
/*    */     return paramFloat -> a(paramc3.a(paramFloat));
/*    */   }
/*    */   
/*    */   default i9 a(c0 paramc0) {
/*    */     return paramDouble -> paramc0.a(a(paramDouble));
/*    */   }
/*    */   
/*    */   default k1 a(gP paramgP) {
/*    */     return paramDouble -> paramgP.a(a(paramDouble));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object getOrDefault(Object paramObject1, Object paramObject2) {
/*    */     return c(paramObject1, (Byte)paramObject2);
/*    */   }
/*    */   
/*    */   default boolean a(double paramDouble) {
/*    */     return true;
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function compose(Function paramFunction) {
/*    */     return super.compose(paramFunction);
/*    */   }
/*    */   
/*    */   default jp a(ar paramar) {
/*    */     return paramDouble -> paramar.a(a(paramDouble));
/*    */   }
/*    */   
/*    */   default d1 a(is paramis) {
/*    */     return paramChar -> a(paramis.b(paramChar));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Byte f(Object paramObject) {
/*    */     byte b;
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return null; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     double d = ((Double)paramObject).doubleValue();
/*    */     try {
/*    */       if ((b = a(d)) == c()) {
/*    */         try {
/*    */           if (a(d));
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
/*    */   default D a(jJ paramjJ) {
/*    */     return paramObject -> a(paramjJ.d(paramObject));
/*    */   }
/*    */   
/*    */   default byte b(double paramDouble, byte paramByte) {
/*    */     byte b;
/*    */     try {
/*    */       if ((b = a(paramDouble)) == c()) {
/*    */         try {
/*    */           if (a(paramDouble));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return paramByte;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   default byte a(double paramDouble, byte paramByte) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default ls a(ij paramij) {
/*    */     return paramInt -> a(paramij.a(paramInt));
/*    */   }
/*    */   
/*    */   default go a(kf paramkf) {
/*    */     return paramDouble -> paramkf.b(a(paramDouble));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default boolean containsKey(Object paramObject) {
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return (paramObject == null) ? false : a(((Double)paramObject).doubleValue());
/*    */   }
/*    */   
/*    */   default byte b(double paramDouble) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default mD a(hV paramhV) {
/*    */     return paramDouble -> paramhV.b(a(paramDouble));
/*    */   }
/*    */   
/*    */   default P a(iM paramiM) {
/*    */     return paramShort -> a(paramiM.b(paramShort));
/*    */   }
/*    */   
/*    */   default f1 a(k2 paramk2) {
/*    */     return paramObject -> a(paramk2.b(paramObject));
/*    */   }
/*    */   
/*    */   default hu a(gW paramgW) {
/*    */     return paramDouble -> paramgW.d(a(paramDouble));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function andThen(Function paramFunction) {
/*    */     return super.andThen(paramFunction);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Byte c(Object paramObject, Byte paramByte) {
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return paramByte; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     double d = ((Double)paramObject).doubleValue();
/*    */     byte b = a(d);
/*    */     try {
/*    */       if (b == c()) {
/*    */         try {
/*    */           if (a(d));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return paramByte;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   default void c(byte paramByte) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object get(Object paramObject) {
/*    */     return f(paramObject);
/*    */   }
/*    */   
/*    */   default k1 a(o paramo) {
/*    */     return paramDouble -> a(paramo.b(paramDouble));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object put(Object paramObject1, Object paramObject2) {
/*    */     return a((Double)paramObject1, (Byte)paramObject2);
/*    */   }
/*    */   
/*    */   default gP a(iT paramiT) {
/*    */     return paramByte -> a(paramiT.a(paramByte));
/*    */   }
/*    */   
/*    */   default iW a(ep paramep) {
/*    */     return paramDouble -> paramep.a(a(paramDouble));
/*    */   }
/*    */   
/*    */   default byte c() {
/*    */     return 0;
/*    */   }
/*    */   
/*    */   default int applyAsInt(double paramDouble) {
/*    */     return a(paramDouble);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Byte e(Object paramObject) {
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return null; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     double d = ((Double)paramObject).doubleValue();
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return a(d) ? Byte.valueOf(b(d)) : null;
/*    */   }
/*    */   
/*    */   byte a(double paramDouble);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\k1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */