/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface i extends lE, ToIntFunction { default iW a(hu paramhu) { return paramDouble -> c(paramhu.c(paramDouble)); } @Deprecated
/*  2 */   default Object remove(Object paramObject) { return o(paramObject); }
/*    */   
/*  4 */   default ep a(gW paramgW) { return paramByte -> c(paramgW.d(paramByte)); }
/*  5 */   default char d(Object paramObject) { throw new UnsupportedOperationException(); }
/*  6 */   default f2 a(d_ paramd_) { return paramObject -> paramd_.c(c(paramObject)); } default i a(f2 paramf2) {
/*  7 */     return paramObject -> c(paramf2.get(paramObject));
/*    */   }
/*    */   
/* 10 */   default hx a(mI parammI) { return paramLong -> c(parammI.d(paramLong)); } default m1 a(k0 paramk0) {
/* 11 */     return paramObject -> c(paramk0.get(paramObject));
/*    */   }
/*    */   @Deprecated
/* 14 */   default Character i(Object paramObject, Character paramCharacter) { Object object = paramObject;
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
/*    */     boolean bool = containsKey(object);
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
/* 57 */     char c = c(object, paramCharacter.charValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 58 */      return bool ? Character.valueOf(c) : null; } default char h() { return Character.MIN_VALUE; }
/*    */ 
/*    */   
/*    */   default dq a(hw paramhw) {
/*    */     return paramShort -> c(paramhw.c(paramShort));
/*    */   }
/*    */   
/*    */   default hE a(lT paramlT) {
/*    */     return paramFloat -> c(paramlT.c(paramFloat));
/*    */   }
/*    */   
/*    */   default mu a(fi paramfi) {
/*    */     return paramObject -> paramfi.b(c(paramObject));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object put(Object paramObject1, Object paramObject2) {
/*    */     return i(paramObject1, (Character)paramObject2);
/*    */   }
/*    */   
/*    */   default void h(char paramChar) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default jJ a(is paramis) {
/*    */     return paramObject -> paramis.b(c(paramObject));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object get(Object paramObject) {
/*    */     return p(paramObject);
/*    */   }
/*    */   
/*    */   default lU a(d_ paramd_) {
/*    */     return paramChar -> c(paramd_.c(paramChar));
/*    */   }
/*    */   
/*    */   default char d(Object paramObject, char paramChar) {
/*    */     char c;
/*    */     try {
/*    */       if ((c = c(paramObject)) == h()) {
/*    */         try {
/*    */           if (containsKey(paramObject));
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
/*    */   @Deprecated
/*    */   default Character p(Object paramObject) {
/*    */     char c;
/*    */     Object object = paramObject;
/*    */     try {
/*    */       if ((c = c(object)) == h()) {
/*    */         try {
/*    */           if (containsKey(object));
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
/*    */     return j(paramObject1, (Character)paramObject2);
/*    */   }
/*    */   
/*    */   default fT a(eK parameK) {
/*    */     return paramObject -> parameK.b(c(paramObject));
/*    */   }
/*    */   
/*    */   default f3 a(gs paramgs) {
/*    */     return paramObject -> paramgs.a(c(paramObject));
/*    */   }
/*    */   
/*    */   default int applyAsInt(Object paramObject) {
/*    */     return c(paramObject);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Character o(Object paramObject) {
/*    */     Object object = paramObject;
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return containsKey(object) ? Character.valueOf(d(object)) : null;
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Character j(Object paramObject, Character paramCharacter) {
/*    */     Object object = paramObject;
/*    */     char c = c(object);
/*    */     try {
/*    */       if (c == h()) {
/*    */         try {
/*    */           if (containsKey(object));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return paramCharacter;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   default g1 a(mz parammz) {
/*    */     return paramObject -> parammz.b(c(paramObject));
/*    */   }
/*    */   
/*    */   default i a(lU paramlU) {
/*    */     return paramObject -> paramlU.b(c(paramObject));
/*    */   }
/*    */   
/*    */   default D a(d1 paramd1) {
/*    */     return paramObject -> paramd1.b(c(paramObject));
/*    */   }
/*    */   
/*    */   default kL a(dX paramdX) {
/*    */     return paramObject -> paramdX.b(c(paramObject));
/*    */   }
/*    */   
/*    */   default char c(Object paramObject, char paramChar) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default gD a(gl paramgl) {
/*    */     return paramInt -> c(paramgl.c(paramInt));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function andThen(Function paramFunction) {
/*    */     return super.andThen(paramFunction);
/*    */   }
/*    */   
/*    */   char c(Object paramObject);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */