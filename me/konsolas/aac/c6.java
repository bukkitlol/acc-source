/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface c6 extends lE, IntFunction { default boolean g(int paramInt) { return true; }
/*    */   
/*  3 */   default Object apply(int paramInt) { return a(paramInt); }
/*  4 */   default mp a(ju paramju) { return paramObject -> a(paramju.a(paramObject)); } @Deprecated default Object get(Object paramObject) { Object object; 
/*  5 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw b(null); }
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
/* 53 */     int i = ((Integer)paramObject).intValue();
/*    */ 
/*    */ 
/*    */     
/* 57 */     try { if ((object = a(i)) == i()) { try { if (g(i)); } catch (UnsupportedOperationException unsupportedOperationException) { throw b(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw b(null); }
/*    */      } @Deprecated
/*    */   default Object a(Integer paramInteger, Object paramObject) { int i = paramInteger.intValue();
/* 60 */     boolean bool = g(i);
/*    */     Object object = b(i, paramObject);
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return bool ? object : null; }
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   default boolean containsKey(Object paramObject) {
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (paramObject == null) ? false : g(((Integer)paramObject).intValue());
/*    */   }
/*    */   
/*    */   default jO a(hh paramhh) {
/*    */     return paramInt -> paramhh.b(a(paramInt));
/*    */   }
/*    */   
/*    */   default c6 a(mp parammp) {
/*    */     return paramInt -> parammp.get(a(paramInt));
/*    */   }
/*    */   
/*    */   default gl a(k0 paramk0) {
/*    */     return paramInt -> paramk0.get(a(paramInt));
/*    */   }
/*    */   
/*    */   default l a(mU parammU) {
/*    */     return paramInt -> parammU.a(a(paramInt));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function compose(Function paramFunction) {
/*    */     return super.compose(paramFunction);
/*    */   }
/*    */   
/*    */   default ls a(f1 paramf1) {
/*    */     return paramInt -> paramf1.b(a(paramInt));
/*    */   }
/*    */   
/*    */   default a a(eI parameI) {
/*    */     return paramShort -> a(parameI.b(paramShort));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object remove(Object paramObject) {
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return null; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw b(null);
/*    */     } 
/*    */     int i = ((Integer)paramObject).intValue();
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return g(i) ? b(i) : null;
/*    */   }
/*    */   
/*    */   default mD a(go paramgo) {
/*    */     return paramDouble -> a(paramgo.b(paramDouble));
/*    */   }
/*    */   
/*    */   default Object b(int paramInt) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default mP a(cM paramcM) {
/*    */     return paramFloat -> a(paramcM.b(paramFloat));
/*    */   }
/*    */   
/*    */   default c6 a(kO paramkO) {
/*    */     return paramInt -> a(paramkO.a(paramInt));
/*    */   }
/*    */   
/*    */   default Object i() {
/*    */     return null;
/*    */   }
/*    */   
/*    */   default Object b(int paramInt, Object paramObject) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default an a(dU paramdU) {
/*    */     return paramInt -> paramdU.a(a(paramInt));
/*    */   }
/*    */   
/*    */   default fT a(mu parammu) {
/*    */     return paramObject -> a(parammu.d(paramObject));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object getOrDefault(Object paramObject1, Object paramObject2) {
/*    */     try {
/*    */       if (paramObject1 == null)
/*    */         return paramObject2; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw b(null);
/*    */     } 
/*    */     int i = ((Integer)paramObject1).intValue();
/*    */     Object object = a(i);
/*    */     try {
/*    */       if (object == i()) {
/*    */         try {
/*    */           if (g(i));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw b(null);
/*    */         } 
/*    */         return paramObject2;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw b(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   default ij a(k2 paramk2) {
/*    */     return paramInt -> paramk2.b(a(paramInt));
/*    */   }
/*    */   
/*    */   default eK a(fi paramfi) {
/*    */     return paramChar -> a(paramfi.b(paramChar));
/*    */   }
/*    */   
/*    */   default gD a(m1 paramm1) {
/*    */     return paramInt -> paramm1.a(a(paramInt));
/*    */   }
/*    */   
/*    */   default void i(Object paramObject) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default hV a(kf paramkf) {
/*    */     return paramByte -> a(paramkf.b(paramByte));
/*    */   }
/*    */   
/*    */   default kO a(ju paramju) {
/*    */     return paramInt -> paramju.a(a(paramInt));
/*    */   }
/*    */   
/*    */   default Object a(int paramInt, Object paramObject) {
/*    */     Object object;
/*    */     try {
/*    */       if ((object = a(paramInt)) == i()) {
/*    */         try {
/*    */           if (g(paramInt));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw b(null);
/*    */         } 
/*    */         return paramObject;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw b(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object put(Object paramObject1, Object paramObject2) {
/*    */     return a((Integer)paramObject1, paramObject2);
/*    */   }
/*    */   
/*    */   default aB a(kJ paramkJ) {
/*    */     return paramLong -> a(paramkJ.b(paramLong));
/*    */   }
/*    */   
/*    */   Object a(int paramInt);
/*    */   
/*    */   private static UnsupportedOperationException b(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\c6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */