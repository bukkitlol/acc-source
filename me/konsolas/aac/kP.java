/*    */ package me.konsolas.aac;@FunctionalInterface
/*  2 */ public interface kp extends lE, LongToIntFunction { default gh a(iM paramiM) { return paramLong -> paramiM.b(b(paramLong)); }
/*    */   
/*    */   default km a(cT paramcT) {
/*  5 */     return paramLong -> paramcT.b(b(paramLong));
/*    */   } @Deprecated
/*    */   default Object get(Object paramObject) {
/*  8 */     return l(paramObject);
/*    */   }
/* 10 */   default short f() { return 0; }
/* 11 */   default short a(long paramLong) { throw new UnsupportedOperationException(); } default mI a(hw paramhw) {
/* 12 */     return paramLong -> paramhw.c(b(paramLong));
/*    */   }
/*    */   
/*    */   default void f(short paramShort) {
/* 16 */     throw new UnsupportedOperationException(); } default kL a(g1 paramg1) {
/* 17 */     return paramObject -> b(paramg1.d(paramObject));
/*    */   }
/*    */   @Deprecated
/* 20 */   default Object put(Object paramObject1, Object paramObject2) { return a((Long)paramObject1, (Short)paramObject2); } default short a(long paramLong, short paramShort) { short s; 
/* 21 */     try { if ((s = b(paramLong)) == f()) { try { if (i(paramLong)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramShort; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/* 22 */   default int applyAsInt(long paramLong) { return b(paramLong); } @Deprecated default Short k(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  long l = ((Long)paramObject).longValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return i(l) ? Short.valueOf(a(l)) : null; } default kp a(ic paramic) { return paramLong -> paramic.a(b(paramLong)); } default ic a(lV paramlV) { return paramShort -> b(paramlV.a(paramShort)); } default ar a(c0 paramc0) { return paramByte -> b(paramc0.a(paramByte)); } default kJ a(eI parameI) { return paramLong -> parameI.b(b(paramLong)); } @Deprecated default Object remove(Object paramObject) { return k(paramObject); } default dX a(mz parammz) { return paramChar -> b(parammz.b(paramChar)); } @Deprecated default Short l(Object paramObject) { short s; try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/* 62 */     long l = ((Long)paramObject).longValue(); try { if ((s = b(l)) == f()) { try { if (i(l)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/* 63 */   @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); } @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : i(((Long)paramObject).longValue()); } default aB a(a parama) { return paramLong -> parama.a(b(paramLong)); } @Deprecated default Short f(Object paramObject, Short paramShort) { try { if (paramObject == null) return paramShort;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  long l = ((Long)paramObject).longValue(); short s = b(l); try { if (s == f()) { try { if (i(l)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramShort; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default short b(long paramLong, short paramShort) { throw new UnsupportedOperationException(); } default kw a(lV paramlV) { return paramLong -> paramlV.a(b(paramLong)); } @Deprecated default Short a(Long paramLong, Short paramShort) { long l = paramLong.longValue(); boolean bool = i(l); short s = b(l, paramShort.shortValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Short.valueOf(s) : null; } default mb a(g0 paramg0) { return paramFloat -> b(paramg0.b(paramFloat)); } default boolean i(long paramLong) { return true; } default kp a(kw paramkw) { return paramLong -> b(paramkw.a(paramLong)); } default jp a(i9 parami9) { return paramDouble -> b(parami9.a(paramDouble)); } default hx a(dq paramdq) { return paramLong -> paramdq.b(b(paramLong)); } default an a(jO paramjO) { return paramInt -> b(paramjO.a(paramInt)); } default ia a(P paramP) { return paramLong -> paramP.b(b(paramLong)); } default dU a(hh paramhh) { return paramObject -> b(paramhh.b(paramObject)); }
/* 64 */   @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return f(paramObject1, (Short)paramObject2); }
/*    */ 
/*    */   
/*    */   short b(long paramLong);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\kp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */