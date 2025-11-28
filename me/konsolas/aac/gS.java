/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface gs extends lE, IntToDoubleFunction { default km a(hx paramhx) { return paramLong -> a(paramhx.a(paramLong)); }
/*    */   
/*    */   @Deprecated
/*  4 */   default Object get(Object paramObject) { return d(paramObject); }
/*  5 */   default mU a(m1 paramm1) { return paramObject -> a(paramm1.a(paramObject)); } @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : d(((Character)paramObject).charValue()); } default fi a(cM paramcM) { return paramChar -> paramcM.b(a(paramChar)); } @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } default float b(char paramChar) { throw new UnsupportedOperationException(); } @Deprecated default Float c(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 15 */     char c = ((Character)paramObject).charValue();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     try {  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException)
/* 24 */     { throw a(null); }  return d(c) ? Float.valueOf(b(c)) : null; }
/*    */   default cT a(dq paramdq) { return paramShort -> a(paramdq.b(paramShort)); }
/*    */   default lU a(hE paramhE) { return paramChar -> paramhE.a(a(paramChar)); }
/*    */   @Deprecated
/*    */   default Object put(Object paramObject1, Object paramObject2) { return a((Character)paramObject1, (Float)paramObject2); } default mz a(g0 paramg0) {
/*    */     return paramChar -> paramg0.b(a(paramChar));
/*    */   } @Deprecated
/*    */   default Float d(Object paramObject) {
/*    */     float f;
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return null; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/* 39 */     char c = ((Character)paramObject).charValue();
/*    */     
/* 41 */     try { if ((f = a(c)) == b()) { try { if (d(c)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default l a(gD paramgD) { return paramInt -> a(paramgD.a(paramInt)); } default float a(char paramChar, float paramFloat) { throw new UnsupportedOperationException(); } @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); } default dX a(mb parammb) { return paramChar -> parammb.a(a(paramChar)); } default az a(iW paramiW) { return paramDouble -> a(paramiW.b(paramDouble)); }
/*    */   @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return b(paramObject1, (Float)paramObject2); }
/* 43 */   @Deprecated default Float a(Character paramCharacter, Float paramFloat) { char c = paramCharacter.charValue(); boolean bool = d(c); float f = a(c, paramFloat.floatValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Float.valueOf(f) : null; } @Deprecated default double applyAsDouble(int paramInt) { return a(j6.a(paramInt)); } default hL a(hE paramhE) { return paramFloat -> a(paramhE.a(paramFloat)); }
/*    */   default b a(ep paramep) { return paramByte -> a(paramep.a(paramByte)); }
/*    */   default float b() { return 0.0F; }
/*    */   default gs a(lU paramlU) { return paramChar -> a(paramlU.b(paramChar)); }
/* 47 */   default d_ a(lT paramlT) { return paramChar -> paramlT.c(a(paramChar)); }
/* 48 */   default d1 a(lb paramlb) { return paramChar -> paramlb.a(a(paramChar)); }
/*    */   @Deprecated
/* 50 */   default Object remove(Object paramObject) { return c(paramObject); }
/*    */   default float b(char paramChar, float paramFloat) { float f;
/*    */     
/* 53 */     try { if ((f = a(paramChar)) == b()) { try { if (d(paramChar)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramFloat; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 54 */      } default boolean d(char paramChar) { return true; }
/*    */    default void b(float paramFloat) {
/* 56 */     throw new UnsupportedOperationException();
/*    */   }
/* 58 */   default gs a(hL paramhL) { return paramChar -> paramhL.b(a(paramChar)); } default f3 a(i parami) {
/* 59 */     return paramObject -> a(parami.c(paramObject));
/*    */   }
/* 61 */   default eK a(mP parammP) { return paramChar -> parammP.b(a(paramChar)); }
/* 62 */   default is a(c3 paramc3) { return paramChar -> paramc3.a(a(paramChar)); } @Deprecated
/*    */   default Float b(Object paramObject, Float paramFloat) { 
/* 64 */     try { if (paramObject == null) return paramFloat;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */     
/*    */     char c = ((Character)paramObject).charValue();
/*    */     float f = a(c);
/*    */     try {
/*    */       if (f == b()) {
/*    */         try {
/*    */           if (d(c));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return paramFloat;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     }  }
/*    */ 
/*    */   
/*    */   float a(char paramChar);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\gs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */