/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface ic extends lE, IntUnaryOperator { default iM b(iM paramiM) { return paramShort -> paramiM.b(a(paramShort)); }
/*    */ 
/*    */   
/*    */   default short b(short paramShort) {
/*  5 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*  8 */   default void i(short paramShort) { throw new UnsupportedOperationException(); } default hw b(hw paramhw) {
/*  9 */     return paramShort -> paramhw.c(a(paramShort));
/*    */   }
/*    */   
/* 12 */   default mb b(mb parammb) { return paramFloat -> a(parammb.a(paramFloat)); } default lV b(lV paramlV) {
/* 13 */     return paramShort -> paramlV.a(a(paramShort));
/*    */   }
/* 15 */   default an b(an paraman) { return paramInt -> a(paraman.a(paramInt)); } @Deprecated
/* 16 */   default Object put(Object paramObject1, Object paramObject2) { return a((Short)paramObject1, (Short)paramObject2); }
/*    */ 
/*    */   
/* 19 */   default eI b(eI parameI) { return paramShort -> parameI.b(a(paramShort)); } @Deprecated
/* 20 */   default int applyAsInt(int paramInt) { return a(j6.a(paramInt)); } default P b(P paramP) {
/* 21 */     return paramShort -> paramP.b(a(paramShort));
/*    */   }
/* 23 */   default cT b(cT paramcT) { return paramShort -> paramcT.b(a(paramShort)); } @Deprecated
/* 24 */   default Short a(Short paramShort1, Short paramShort2) { short s1 = paramShort1.shortValue();
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
/*    */     boolean bool = i(s1);
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
/* 62 */     short s2 = a(s1, paramShort2.shortValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Short.valueOf(s2) : null; }
/*    */   @Deprecated default Short q(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  short s = ((Short)paramObject).shortValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return i(s) ? Short.valueOf(b(s)) : null; }
/* 64 */   @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); } default short b(short paramShort1, short paramShort2) { short s; try { if ((s = a(paramShort1)) == i()) { try { if (i(paramShort1)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramShort2; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default dU b(dU paramdU) { return paramObject -> a(paramdU.a(paramObject)); } default ar b(ar paramar) { return paramByte -> a(paramar.a(paramByte)); } @Deprecated default Short k(Object paramObject, Short paramShort) { try { if (paramObject == null) return paramShort;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  short s1 = ((Short)paramObject).shortValue(); short s2 = a(s1); try { if (s2 == i()) { try { if (i(s1)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramShort; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } static ic a() { return paramShort -> paramShort; } default ic a(ic paramic) { return paramShort -> a(paramic.a(paramShort)); } default jp b(jp paramjp) { return paramDouble -> a(paramjp.a(paramDouble)); } default kp b(kp paramkp) { return paramLong -> a(paramkp.b(paramLong)); } @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : i(((Short)paramObject).shortValue()); } default kL b(kL paramkL) { return paramObject -> a(paramkL.c(paramObject)); }
/* 65 */   default short i() { return 0; } @Deprecated default Object remove(Object paramObject) { return q(paramObject); } @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return k(paramObject1, (Short)paramObject2); } @Deprecated default Object get(Object paramObject) { return r(paramObject); } default dX b(dX paramdX) { return paramChar -> a(paramdX.b(paramChar)); } default a b(a parama) { return paramShort -> parama.a(a(paramShort)); } @Deprecated default Short r(Object paramObject) { short s2; try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  short s1 = ((Short)paramObject).shortValue(); try { if ((s2 = a(s1)) == i()) { try { if (i(s1)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default boolean i(short paramShort) { return true; } default ic b(ic paramic) { return paramShort -> paramic.a(a(paramShort)); } default dq b(dq paramdq) { return paramShort -> paramdq.b(a(paramShort)); } default short a(short paramShort1, short paramShort2) { throw new UnsupportedOperationException(); }
/*    */ 
/*    */   
/*    */   short a(short paramShort);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */