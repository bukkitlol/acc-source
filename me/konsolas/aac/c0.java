/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface c0 extends lE, IntToLongFunction { default c0 a(gP paramgP) { return paramByte -> a(paramgP.a(paramByte)); }
/*    */   
/*  3 */   default lV a(P paramP) { return paramShort -> a(paramP.b(paramShort)); }
/*    */   @Deprecated
/*  5 */   default Object get(Object paramObject) { return a(paramObject); }
/*  6 */   default gP a(ia paramia) { return paramByte -> paramia.b(a(paramByte)); }
/*  7 */   default gW a(mI parammI) { return paramByte -> parammI.d(a(paramByte)); } default long a(byte paramByte, long paramLong) { long l;
/*    */     
/*  9 */     try { if ((l = a(paramByte)) == a()) { try { if (f(paramByte)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramLong; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 10 */      } default jO a(ls paramls) { return paramInt -> a(paramls.b(paramInt)); }
/*    */   
/* 12 */   default mz a(d1 paramd1) { return paramChar -> a(paramd1.b(paramChar)); } @Deprecated
/* 13 */   default Object getOrDefault(Object paramObject1, Object paramObject2) { return a(paramObject1, (Long)paramObject2); }
/*    */    default long b(byte paramByte, long paramLong) {
/* 15 */     throw new UnsupportedOperationException();
/*    */   } default hh a(f1 paramf1) {
/* 17 */     return paramObject -> a(paramf1.b(paramObject));
/*    */   } default iT a(gh paramgh) {
/* 19 */     return paramByte -> paramgh.a(a(paramByte));
/*    */   }
/*    */   
/* 22 */   default ep a(hx paramhx) { return paramByte -> paramhx.a(a(paramByte)); } @Deprecated
/*    */   default Long b(Object paramObject) { 
/* 24 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 25 */      byte b = ((Byte)paramObject).byteValue();
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
/*    */     try {  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException)
/* 48 */     { throw a(null); }  return f(b) ? Long.valueOf(b(b)) : null; } @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); }
/*    */   @Deprecated default Long a(Object paramObject, Long paramLong) { try {
/*    */       if (paramObject == null)
/*    */         return paramLong; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/* 55 */     byte b = ((Byte)paramObject).byteValue(); long l = a(b); try { if (l == a()) { try { if (f(b)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramLong; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/* 56 */   @Deprecated default Object remove(Object paramObject) { return b(paramObject); } default g1 a(D paramD) { return paramObject -> a(paramD.c(paramObject)); } default void a(long paramLong) { throw new UnsupportedOperationException(); } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return a((Byte)paramObject1, (Long)paramObject2); } default ar a(kp paramkp) { return paramByte -> paramkp.b(a(paramByte)); } default kw a(ia paramia) { return paramLong -> a(paramia.b(paramLong)); } default b a(km paramkm) { return paramByte -> paramkm.b(a(paramByte)); } default i9 a(k1 paramk1) { return paramDouble -> a(paramk1.a(paramDouble)); }
/*    */   default kf a(kJ paramkJ) { return paramByte -> paramkJ.b(a(paramByte)); }
/*    */   default long a() { return 0L; }
/* 59 */   @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } default hV a(aB paramaB) { return paramByte -> paramaB.a(a(paramByte)); } default boolean f(byte paramByte) { return true; } @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : f(((Byte)paramObject).byteValue()); } default c0 a(kw paramkw) { return paramByte -> paramkw.a(a(paramByte)); } @Deprecated default Long a(Object paramObject) { long l; try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      byte b = ((Byte)paramObject).byteValue(); 
/* 61 */     try { if ((l = a(b)) == a()) { try { if (f(b)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } @Deprecated default long applyAsLong(int paramInt) { return a(j6.a(paramInt)); }
/* 62 */   default long b(byte paramByte) { throw new UnsupportedOperationException(); }
/* 63 */   default g0 a(lb paramlb) { return paramFloat -> a(paramlb.a(paramFloat)); } @Deprecated
/* 64 */   default Long a(Byte paramByte, Long paramLong) { byte b = paramByte.byteValue();
/*    */     boolean bool = f(b);
/*    */     long l = b(b, paramLong.longValue());
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return bool ? Long.valueOf(l) : null; }
/*    */ 
/*    */   
/*    */   long a(byte paramByte);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\c0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */