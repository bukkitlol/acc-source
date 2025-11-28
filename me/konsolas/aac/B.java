/*    */ package me.konsolas.aac;
/*    */ @FunctionalInterface
/*    */ public interface b extends lE, IntToDoubleFunction { @Deprecated
/*  4 */   default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } default kf a(cM paramcM) {
/*  5 */     return paramByte -> paramcM.b(b(paramByte));
/*    */   }
/*    */   
/*    */   default c0 a(g0 paramg0) {
/*  9 */     return paramByte -> paramg0.b(b(paramByte));
/* 10 */   } default b a(hL paramhL) { return paramByte -> paramhL.b(b(paramByte)); }
/* 11 */   default gs a(d1 paramd1) { return paramChar -> b(paramd1.b(paramChar)); }
/*    */   @Deprecated
/* 13 */   default Object getOrDefault(Object paramObject1, Object paramObject2) { return a(paramObject1, (Float)paramObject2); } default ep a(hE paramhE) {
/* 14 */     return paramByte -> paramhE.a(b(paramByte));
/*    */   }
/*    */   
/*    */   default l a(ls paramls) {
/* 18 */     return paramInt -> b(paramls.b(paramInt)); } @Deprecated
/* 19 */   default Object get(Object paramObject) { return b(paramObject); }
/*    */ 
/*    */   
/* 22 */   default void a(float paramFloat) { throw new UnsupportedOperationException(); } default gW a(lT paramlT) {
/* 23 */     return paramByte -> paramlT.c(b(paramByte));
/*    */   }
/*    */   @Deprecated
/* 26 */   default Object put(Object paramObject1, Object paramObject2) { return a((Byte)paramObject1, (Float)paramObject2); } default gP a(lb paramlb) {
/* 27 */     return paramByte -> paramlb.a(b(paramByte));
/*    */   }
/* 29 */   default float a(byte paramByte) { throw new UnsupportedOperationException(); } @Deprecated default Float b(Object paramObject) { float f;
/*    */     
/* 31 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */ 
/*    */     
/*    */     byte b1 = ((Byte)paramObject).byteValue();
/*    */ 
/*    */     
/* 37 */     try { if ((f = b(b1)) == a()) { try { if (d(b1)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default f3 a(D paramD) { return paramObject -> b(paramD.c(paramObject)); } default b a(gP paramgP) { return paramByte -> b(paramgP.a(paramByte)); } default float a() { return 0.0F; } default iT a(c3 paramc3) { return paramByte -> paramc3.a(b(paramByte)); }
/* 38 */   @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); }
/*    */ 
/*    */   
/* 41 */   default km a(ia paramia) { return paramLong -> b(paramia.b(paramLong)); }
/* 42 */   default float a(byte paramByte, float paramFloat) { throw new UnsupportedOperationException(); } default cT a(P paramP) { return paramShort -> b(paramP.b(paramShort)); } default az a(k1 paramk1) { return paramDouble -> b(paramk1.a(paramDouble)); } default ar a(mb parammb) { return paramByte -> parammb.a(b(paramByte)); } @Deprecated default Float a(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/* 56 */     byte b1 = ((Byte)paramObject).byteValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return d(b1) ? Float.valueOf(a(b1)) : null; }
/* 57 */   @Deprecated default Object remove(Object paramObject) { return a(paramObject); } @Deprecated default double applyAsDouble(int paramInt) { return b(j6.a(paramInt)); } default hL a(lb paramlb) { return paramFloat -> b(paramlb.a(paramFloat)); } @Deprecated default Float a(Object paramObject, Float paramFloat) { try { if (paramObject == null) return paramFloat;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  byte b1 = ((Byte)paramObject).byteValue(); float f = b(b1); try { if (f == a()) { try { if (d(b1)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramFloat; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 58 */      } default boolean d(byte paramByte) { return true; }
/* 59 */   default mU a(f1 paramf1) { return paramObject -> b(paramf1.b(paramObject)); } @Deprecated default boolean containsKey(Object paramObject) { try {  }
/* 60 */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : d(((Byte)paramObject).byteValue()); }
/* 61 */   default hV a(mP parammP) { return paramByte -> parammP.b(b(paramByte)); } default float b(byte paramByte, float paramFloat) { float f; 
/* 62 */     try { if ((f = b(paramByte)) == a()) { try { if (d(paramByte)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramFloat; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      } @Deprecated
/* 64 */   default Float a(Byte paramByte, Float paramFloat) { byte b1 = paramByte.byteValue();
/*    */     boolean bool = d(b1);
/*    */     float f = a(b1, paramFloat.floatValue());
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return bool ? Float.valueOf(f) : null; }
/*    */ 
/*    */   
/*    */   float b(byte paramByte);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */