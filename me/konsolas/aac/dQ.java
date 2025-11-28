/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface dq extends lE, IntUnaryOperator { @Deprecated default Object put(Object paramObject1, Object paramObject2) { return a((Short)paramObject1, (Character)paramObject2); } @Deprecated default boolean containsKey(Object paramObject) { try {  }
/*  2 */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : b(((Short)paramObject).shortValue()); }
/*    */   
/*  4 */   default dq a(ic paramic) { return paramShort -> b(paramic.a(paramShort)); } @Deprecated
/*  5 */   default Object getOrDefault(Object paramObject1, Object paramObject2) { return k(paramObject1, (Character)paramObject2); }
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   default Object remove(Object paramObject) {
/* 10 */     return q(paramObject); } default lV a(mz parammz) {
/* 11 */     return paramShort -> parammz.b(b(paramShort));
/*    */   } default cT a(gs paramgs) {
/* 13 */     return paramShort -> paramgs.a(b(paramShort));
/*    */   }
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   default int applyAsInt(int paramInt) {
/* 19 */     return b(j6.a(paramInt)); }
/* 20 */   default char a(short paramShort) { throw new UnsupportedOperationException(); }
/* 21 */   default char i() { return Character.MIN_VALUE; } default char a(short paramShort, char paramChar) { char c; 
/* 22 */     try { if ((c = b(paramShort)) == i()) { try { if (b(paramShort)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramChar; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 23 */      } default ic a(dX paramdX) { return paramShort -> paramdX.b(b(paramShort)); } default iM a(is paramis) {
/* 24 */     return paramShort -> paramis.b(b(paramShort));
/*    */   }
/* 26 */   default hx a(kp paramkp) { return paramLong -> b(paramkp.b(paramLong)); }
/* 27 */   default iW a(jp paramjp) { return paramDouble -> b(paramjp.a(paramDouble)); } @Deprecated
/* 28 */   default Character a(Short paramShort, Character paramCharacter) { short s = paramShort.shortValue(); boolean bool = b(s); char c = b(s, paramCharacter.charValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 29 */      return bool ? Character.valueOf(c) : null; } default lU a(dX paramdX) { return paramChar -> b(paramdX.b(paramChar)); }
/*    */   
/* 31 */   default i a(kL paramkL) { return paramObject -> b(paramkL.c(paramObject)); } @Deprecated
/*    */   default Character q(Object paramObject) { 
/* 33 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  short s = ((Short)paramObject).shortValue(); try {  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 35 */      return b(s) ? Character.valueOf(a(s)) : null; } default hw a(d_ paramd_) { return paramShort -> paramd_.c(b(paramShort)); }
/*    */   
/* 37 */   default dq a(lU paramlU) { return paramShort -> paramlU.b(b(paramShort)); } default hE a(mb parammb) {
/* 38 */     return paramFloat -> b(parammb.a(paramFloat));
/*    */   }
/*    */   
/*    */   default void i(char paramChar) {
/* 42 */     throw new UnsupportedOperationException();
/*    */   }
/* 44 */   default boolean b(short paramShort) { return true; } @Deprecated
/*    */   default Character k(Object paramObject, Character paramCharacter) { 
/* 46 */     try { if (paramObject == null) return paramCharacter;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 47 */      short s = ((Short)paramObject).shortValue();
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
/* 64 */     char c = b(s);
/*    */     try {
/*    */       if (c == i()) {
/*    */         try {
/*    */           if (b(s));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return paramCharacter;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     }  }
/*    */ 
/*    */   
/*    */   default P a(d1 paramd1) {
/*    */     return paramShort -> paramd1.b(b(paramShort));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Character r(Object paramObject) {
/*    */     char c;
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return null; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     short s = ((Short)paramObject).shortValue();
/*    */     try {
/*    */       if ((c = b(s)) == i()) {
/*    */         try {
/*    */           if (b(s));
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
/*    */   default Function andThen(Function paramFunction) {
/*    */     return super.andThen(paramFunction);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function compose(Function paramFunction) {
/*    */     return super.compose(paramFunction);
/*    */   }
/*    */   
/*    */   default eI a(fi paramfi) {
/*    */     return paramShort -> paramfi.b(b(paramShort));
/*    */   }
/*    */   
/*    */   default gD a(an paraman) {
/*    */     return paramInt -> b(paraman.a(paramInt));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object get(Object paramObject) {
/*    */     return r(paramObject);
/*    */   }
/*    */   
/*    */   default m1 a(dU paramdU) {
/*    */     return paramObject -> b(paramdU.a(paramObject));
/*    */   }
/*    */   
/*    */   default a a(eK parameK) {
/*    */     return paramShort -> parameK.b(b(paramShort));
/*    */   }
/*    */   
/*    */   default ep a(ar paramar) {
/*    */     return paramByte -> b(paramar.a(paramByte));
/*    */   }
/*    */   
/*    */   default char b(short paramShort, char paramChar) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   char b(short paramShort);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\dq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */