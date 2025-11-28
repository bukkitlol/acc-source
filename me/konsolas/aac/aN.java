/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface an extends lE, IntUnaryOperator { @Deprecated default Short i(Object paramObject) { short s; try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/* 54 */     int i = ((Integer)paramObject).intValue(); try { if ((s = a(i)) == e()) { try { if (i(i)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */          return null; }
/*    */        }
/*    */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      } @Deprecated default Short j(Object paramObject) { try { if (paramObject == null)
/*    */         return null;  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      int i = ((Integer)paramObject).intValue(); try {  }
/* 62 */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return i(i) ? Short.valueOf(b(i)) : null; }
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   default Object getOrDefault(Object paramObject1, Object paramObject2) {
/*    */     return e(paramObject1, (Short)paramObject2);
/*    */   }
/*    */   
/*    */   default jO a(lV paramlV) {
/*    */     return paramInt -> paramlV.a(a(paramInt));
/*    */   }
/*    */   
/*    */   default short b(int paramInt) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object remove(Object paramObject) {
/*    */     return j(paramObject);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function compose(Function paramFunction) {
/*    */     return super.compose(paramFunction);
/*    */   }
/*    */   
/*    */   default kL a(mu parammu) {
/*    */     return paramObject -> a(parammu.d(paramObject));
/*    */   }
/*    */   
/*    */   default gl a(hw paramhw) {
/*    */     return paramInt -> paramhw.c(a(paramInt));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object get(Object paramObject) {
/*    */     return i(paramObject);
/*    */   }
/*    */   
/*    */   default kO a(eI parameI) {
/*    */     return paramInt -> parameI.b(a(paramInt));
/*    */   }
/*    */   
/*    */   default short e() {
/*    */     return 0;
/*    */   }
/*    */   
/*    */   default ar a(kf paramkf) {
/*    */     return paramByte -> a(paramkf.b(paramByte));
/*    */   }
/*    */   
/*    */   default ic a(eI parameI) {
/*    */     return paramShort -> a(parameI.b(paramShort));
/*    */   }
/*    */   
/*    */   default short b(int paramInt, short paramShort) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object put(Object paramObject1, Object paramObject2) {
/*    */     return a((Integer)paramObject1, (Short)paramObject2);
/*    */   }
/*    */   
/*    */   default dU a(ju paramju) {
/*    */     return paramObject -> a(paramju.a(paramObject));
/*    */   }
/*    */   
/*    */   default gD a(dq paramdq) {
/*    */     return paramInt -> paramdq.b(a(paramInt));
/*    */   }
/*    */   
/*    */   default boolean i(int paramInt) {
/*    */     return true;
/*    */   }
/*    */   
/*    */   default void e(short paramShort) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default jp a(go paramgo) {
/*    */     return paramDouble -> a(paramgo.b(paramDouble));
/*    */   }
/*    */   
/*    */   default ls a(P paramP) {
/*    */     return paramInt -> paramP.b(a(paramInt));
/*    */   }
/*    */   
/*    */   default mb a(cM paramcM) {
/*    */     return paramFloat -> a(paramcM.b(paramFloat));
/*    */   }
/*    */   
/*    */   default ij a(iM paramiM) {
/*    */     return paramInt -> paramiM.b(a(paramInt));
/*    */   }
/*    */   
/*    */   default an a(ic paramic) {
/*    */     return paramInt -> paramic.a(a(paramInt));
/*    */   }
/*    */   
/*    */   default c6 a(a parama) {
/*    */     return paramInt -> parama.a(a(paramInt));
/*    */   }
/*    */   
/*    */   default an a(kO paramkO) {
/*    */     return paramInt -> a(paramkO.a(paramInt));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Short a(Integer paramInteger, Short paramShort) {
/*    */     int i = paramInteger.intValue();
/*    */     boolean bool = i(i);
/*    */     short s = b(i, paramShort.shortValue());
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return bool ? Short.valueOf(s) : null;
/*    */   }
/*    */   
/*    */   default dX a(fi paramfi) {
/*    */     return paramChar -> a(paramfi.b(paramChar));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Short e(Object paramObject, Short paramShort) {
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return paramShort; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     int i = ((Integer)paramObject).intValue();
/*    */     short s = a(i);
/*    */     try {
/*    */       if (s == e()) {
/*    */         try {
/*    */           if (i(i));
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
/*    */   default int applyAsInt(int paramInt) {
/*    */     return a(paramInt);
/*    */   }
/*    */   
/*    */   default l a(cT paramcT) {
/*    */     return paramInt -> paramcT.b(a(paramInt));
/*    */   }
/*    */   
/*    */   default kp a(kJ paramkJ) {
/*    */     return paramLong -> a(paramkJ.b(paramLong));
/*    */   }
/*    */   
/*    */   default short a(int paramInt, short paramShort) {
/*    */     short s;
/*    */     try {
/*    */       if ((s = a(paramInt)) == e()) {
/*    */         try {
/*    */           if (i(paramInt));
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
/*    */   @Deprecated
/*    */   default boolean containsKey(Object paramObject) {
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return (paramObject == null) ? false : i(((Integer)paramObject).intValue());
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function andThen(Function paramFunction) {
/*    */     return super.andThen(paramFunction);
/*    */   }
/*    */   
/*    */   short a(int paramInt);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */