/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface hx extends lE, LongToIntFunction { default char b(long paramLong) { throw new UnsupportedOperationException(); } default dq a(lV paramlV) {
/*  2 */     return paramShort -> a(paramlV.a(paramShort));
/*    */   }
/*    */ 
/*    */   
/*    */   default kp a(dX paramdX) {
/*  7 */     return paramLong -> paramdX.b(a(paramLong));
/*    */   }
/*    */   
/*    */   default lU a(mz parammz) {
/* 11 */     return paramChar -> a(parammz.b(paramChar));
/* 12 */   } default aB a(eK parameK) { return paramLong -> parameK.b(a(paramLong)); } @Deprecated
/*    */   default Object get(Object paramObject) {
/* 14 */     return l(paramObject);
/*    */   }
/*    */   default m1 a(hh paramhh) {
/* 17 */     return paramObject -> a(paramhh.b(paramObject));
/*    */   }
/* 19 */   default mI a(d_ paramd_) { return paramLong -> paramd_.c(a(paramLong)); }
/* 20 */   default hx a(kw paramkw) { return paramLong -> a(paramkw.a(paramLong)); }
/* 21 */   default kw a(mz parammz) { return paramLong -> parammz.b(a(paramLong)); } @Deprecated
/*    */   default Function compose(Function paramFunction) {
/* 23 */     return super.compose(paramFunction);
/*    */   } default kJ a(fi paramfi) {
/* 25 */     return paramLong -> paramfi.b(a(paramLong));
/*    */   }
/*    */   
/* 28 */   default ia a(d1 paramd1) { return paramLong -> paramd1.b(a(paramLong)); } @Deprecated default boolean containsKey(Object paramObject) { try {  }
/* 29 */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : b(((Long)paramObject).longValue()); }
/* 30 */   default ep a(c0 paramc0) { return paramByte -> a(paramc0.a(paramByte)); } default hE a(g0 paramg0) {
/* 31 */     return paramFloat -> a(paramg0.b(paramFloat));
/*    */   }
/* 33 */   default iW a(i9 parami9) { return paramDouble -> a(parami9.a(paramDouble)); } @Deprecated
/* 34 */   default Object getOrDefault(Object paramObject1, Object paramObject2) { return f(paramObject1, (Character)paramObject2); }
/*    */ 
/*    */   
/* 37 */   default gD a(jO paramjO) { return paramInt -> a(paramjO.a(paramInt)); }
/*    */   @Deprecated
/* 39 */   default Character a(Long paramLong, Character paramCharacter) { long l = paramLong.longValue(); boolean bool = b(l); char c = a(l, paramCharacter.charValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 40 */      return bool ? Character.valueOf(c) : null; } default km a(gs paramgs) { return paramLong -> paramgs.a(a(paramLong)); }
/*    */   
/* 42 */   default i a(g1 paramg1) { return paramObject -> a(paramg1.d(paramObject)); } @Deprecated default Character f(Object paramObject, Character paramCharacter) { 
/* 43 */     try { if (paramObject == null) return paramCharacter;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/*    */     char c = a(l);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 63 */     try { if (c == f()) { try { if (b(l)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramCharacter; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      }
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   default Character l(Object paramObject) {
/*    */     char c;
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return null; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     long l = ((Long)paramObject).longValue();
/*    */     try {
/*    */       if ((c = a(l)) == f()) {
/*    */         try {
/*    */           if (b(l));
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
/*    */   default char a(long paramLong, char paramChar) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default int applyAsInt(long paramLong) {
/*    */     return a(paramLong);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object remove(Object paramObject) {
/*    */     return k(paramObject);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function andThen(Function paramFunction) {
/*    */     return super.andThen(paramFunction);
/*    */   }
/*    */   
/*    */   default gh a(is paramis) {
/*    */     return paramLong -> paramis.b(a(paramLong));
/*    */   }
/*    */   
/*    */   default boolean b(long paramLong) {
/*    */     return true;
/*    */   }
/*    */   
/*    */   default hx a(lU paramlU) {
/*    */     return paramLong -> paramlU.b(a(paramLong));
/*    */   }
/*    */   
/*    */   default char b(long paramLong, char paramChar) {
/*    */     char c;
/*    */     try {
/*    */       if ((c = a(paramLong)) == f()) {
/*    */         try {
/*    */           if (b(paramLong));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return paramChar;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   default void f(char paramChar) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default char f() {
/*    */     return Character.MIN_VALUE;
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Character k(Object paramObject) {
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
/*    */     return b(l) ? Character.valueOf(b(l)) : null;
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object put(Object paramObject1, Object paramObject2) {
/*    */     return a((Long)paramObject1, (Character)paramObject2);
/*    */   }
/*    */   
/*    */   char a(long paramLong);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\hx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */