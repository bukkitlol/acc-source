/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface ia extends lE, LongToIntFunction { default ls a(jO paramjO) { return paramInt -> b(paramjO.a(paramInt)); } @Deprecated
/*  2 */   default Object get(Object paramObject) { return l(paramObject); }
/*  3 */   default d1 a(mz parammz) { return paramChar -> b(parammz.b(paramChar)); } @Deprecated
/*  4 */   default Byte a(Long paramLong, Byte paramByte) { long l = paramLong.longValue();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 11 */     boolean bool = a(l);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     byte b = b(l, paramByte.byteValue());
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     try {  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException)
/* 24 */     { throw a(null); }  return bool ? Byte.valueOf(b) : null; }
/*    */   default ia a(gP paramgP) { return paramLong -> paramgP.a(b(paramLong)); }
/*    */   @Deprecated
/*    */   default Byte k(Object paramObject) { try {
/*    */       if (paramObject == null)
/*    */         return null; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/* 33 */     long l = ((Long)paramObject).longValue();
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
/* 45 */     { throw a(null); }  return a(l) ? Byte.valueOf(a(l)) : null; }
/*    */   default gh a(iT paramiT) { return paramLong -> paramiT.a(b(paramLong)); }
/*    */   default D a(g1 paramg1) { return paramObject -> b(paramg1.d(paramObject)); }
/*    */   @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : a(((Long)paramObject).longValue()); }
/*    */   default aB a(hV paramhV) { return paramLong -> paramhV.b(b(paramLong)); }
/* 50 */   default ia a(kw paramkw) { return paramLong -> b(paramkw.a(paramLong)); } default hx a(ep paramep) { return paramLong -> paramep.a(b(paramLong)); } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return a((Long)paramObject1, (Byte)paramObject2); } default km a(b paramb) { return paramLong -> paramb.b(b(paramLong)); } @Deprecated default Byte f(Object paramObject, Byte paramByte) { try { if (paramObject == null) return paramByte;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  long l = ((Long)paramObject).longValue(); byte b = b(l); try { if (b == f()) { try { if (a(l)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramByte; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   default boolean a(long paramLong) { return true; }
/*    */   default P a(lV paramlV) { return paramShort -> b(paramlV.a(paramShort)); }
/*    */   @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return f(paramObject1, (Byte)paramObject2); }
/*    */   default byte a(long paramLong, byte paramByte) { byte b; try { if ((b = b(paramLong)) == f()) { try { if (a(paramLong)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramByte; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   default kw a(c0 paramc0) { return paramLong -> paramc0.a(b(paramLong)); }
/* 56 */   default kp a(ar paramar) { return paramLong -> paramar.a(b(paramLong)); } default f1 a(hh paramhh) { return paramObject -> b(paramhh.b(paramObject)); } @Deprecated default Byte l(Object paramObject) { byte b; try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  long l = ((Long)paramObject).longValue(); try { if ((b = b(l)) == f()) { try { if (a(l)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); } default gP a(c0 paramc0) { return paramByte -> b(paramc0.a(paramByte)); } default byte b(long paramLong, byte paramByte) { throw new UnsupportedOperationException(); } default byte f() { return 0; } default int applyAsInt(long paramLong) { return b(paramLong); } default lb a(g0 paramg0) { return paramFloat -> b(paramg0.b(paramFloat)); } default kJ a(kf paramkf) { return paramLong -> paramkf.b(b(paramLong)); } @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); }
/* 57 */   default void f(byte paramByte) { throw new UnsupportedOperationException(); }
/* 58 */   default mI a(gW paramgW) { return paramLong -> paramgW.d(b(paramLong)); } @Deprecated
/*    */   default Object remove(Object paramObject) {
/* 60 */     return k(paramObject);
/*    */   }
/*    */   
/* 63 */   default byte a(long paramLong) { throw new UnsupportedOperationException(); } default k1 a(i9 parami9) {
/* 64 */     return paramDouble -> b(parami9.a(paramDouble));
/*    */   }
/*    */   
/*    */   byte b(long paramLong);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ia.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */