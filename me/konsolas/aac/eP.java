/*    */ package me.konsolas.aac;@FunctionalInterface
/*    */ public interface ep extends lE, IntUnaryOperator { @Deprecated
/*    */   default Character b(Object paramObject) { 
/*  4 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 10 */     byte b = ((Byte)paramObject).byteValue();
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
/* 30 */     { throw a(null); }  return b(b) ? Character.valueOf(b(b)) : null; }
/* 31 */   @Deprecated default Object remove(Object paramObject) { return b(paramObject); } default gD a(ls paramls) { return paramInt -> a(paramls.b(paramInt)); } @Deprecated default int applyAsInt(int paramInt) { return a(j6.a(paramInt)); } default hx a(ia paramia) { return paramLong -> a(paramia.b(paramLong)); } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return a(paramObject1, (Character)paramObject2); } default char b(byte paramByte, char paramChar) { throw new UnsupportedOperationException(); } default void a(char paramChar) { throw new UnsupportedOperationException(); } default gP a(d1 paramd1) { return paramByte -> paramd1.b(a(paramByte)); }
/* 32 */   default dq a(P paramP) { return paramShort -> a(paramP.b(paramShort)); } default gW a(d_ paramd_) { return paramByte -> paramd_.c(a(paramByte)); } default lU a(d1 paramd1) { return paramChar -> a(paramd1.b(paramChar)); } default kf a(fi paramfi) { return paramByte -> paramfi.b(a(paramByte)); } @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); } default hE a(lb paramlb) { return paramFloat -> a(paramlb.a(paramFloat)); } @Deprecated default Object get(Object paramObject) { return a(paramObject); } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return a((Byte)paramObject1, (Character)paramObject2); }
/*    */   
/* 34 */   default ar a(dX paramdX) { return paramByte -> paramdX.b(a(paramByte)); }
/* 35 */   default iT a(is paramis) { return paramByte -> paramis.b(a(paramByte)); }
/* 36 */   default char a() { return Character.MIN_VALUE; } default i a(D paramD) {
/* 37 */     return paramObject -> a(paramD.c(paramObject));
/*    */   }
/*    */   
/*    */   default ep a(lU paramlU) {
/* 41 */     return paramByte -> paramlU.b(a(paramByte));
/*    */   } @Deprecated
/* 43 */   default Character a(Byte paramByte, Character paramCharacter) { byte b = paramByte.byteValue();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 53 */     boolean bool = b(b); char c = b(b, paramCharacter.charValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Character.valueOf(c) : null; } default c0 a(mz parammz) { return paramByte -> parammz.b(a(paramByte)); } default b a(gs paramgs) { return paramByte -> paramgs.a(a(paramByte)); } default hV a(eK parameK) { return paramByte -> parameK.b(a(paramByte)); } default ep a(gP paramgP) { return paramByte -> a(paramgP.a(paramByte)); } default char a(byte paramByte, char paramChar) { char c; try { if ((c = a(paramByte)) == a()) { try { if (b(paramByte)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramChar; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default boolean b(byte paramByte) { return true; } @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : b(((Byte)paramObject).byteValue()); }
/* 54 */   default char b(byte paramByte) { throw new UnsupportedOperationException(); }
/* 55 */   default iW a(k1 paramk1) { return paramDouble -> a(paramk1.a(paramDouble)); } @Deprecated default Character a(Object paramObject, Character paramCharacter) { 
/* 56 */     try { if (paramObject == null) return paramCharacter;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 57 */      byte b = ((Byte)paramObject).byteValue(); char c = a(b); try { if (c == a()) { try { if (b(b)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramCharacter; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      }
/*    */   
/* 60 */   default m1 a(f1 paramf1) { return paramObject -> a(paramf1.b(paramObject)); } @Deprecated
/* 61 */   default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } @Deprecated default Character a(Object paramObject) { char c;
/*    */     
/* 63 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */     
/*    */     byte b = ((Byte)paramObject).byteValue();
/*    */     try {
/*    */       if ((c = a(b)) == a()) {
/*    */         try {
/*    */           if (b(b));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return null;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     }  }
/*    */ 
/*    */   
/*    */   char a(byte paramByte);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */