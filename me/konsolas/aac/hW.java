/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface hw extends lE, IntFunction { default hw a(ic paramic) { return paramShort -> c(paramic.a(paramShort)); } @Deprecated default Object remove(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  short s = ((Short)paramObject).shortValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return h(s) ? d(s) : null; } default hu a(jp paramjp) { return paramDouble -> c(paramjp.a(paramDouble)); } default lT a(mb parammb) { return paramFloat -> c(parammb.a(paramFloat)); } default P a(D paramD) { return paramShort -> paramD.c(c(paramShort)); } default iM a(jJ paramjJ) { return paramShort -> paramjJ.d(c(paramShort)); } @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : h(((Short)paramObject).shortValue()); } default eI a(mu parammu) { return paramShort -> parammu.d(c(paramShort)); } @Deprecated default Object get(Object paramObject) { Object object; try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  short s = ((Short)paramObject).shortValue(); try { if ((object = c(s)) == r()) { try { if (h(s)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default f2 a(kL paramkL) { return paramObject -> c(paramkL.c(paramObject)); } default gl a(an paraman) { return paramInt -> c(paraman.a(paramInt)); } default void r(Object paramObject) { throw new UnsupportedOperationException(); } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { try { if (paramObject1 == null) return paramObject2;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */ 
/*    */ 
/*    */     
/*  5 */     short s = ((Short)paramObject1).shortValue();
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
/* 56 */     Object object = c(s); try { if (object == r()) { try { if (h(s)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramObject2; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); }
/* 58 */   default mI a(kp paramkp) { return paramLong -> c(paramkp.b(paramLong)); } default Object d(short paramShort, Object paramObject) { throw new UnsupportedOperationException(); } default Object d(short paramShort) { throw new UnsupportedOperationException(); } default boolean h(short paramShort) { return true; } default d_ a(dX paramdX) { return paramChar -> c(paramdX.b(paramChar)); } default cT a(f3 paramf3) { return paramShort -> paramf3.c(c(paramShort)); } default Object c(short paramShort, Object paramObject) { Object object; try { if ((object = c(paramShort)) == r()) { try { if (h(paramShort)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramObject; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default Object r() { return null; } default ic a(kL paramkL) { return paramShort -> paramkL.c(c(paramShort)); } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return b((Short)paramObject1, paramObject2); } @Deprecated default Object b(Short paramShort, Object paramObject) { short s = paramShort.shortValue(); boolean bool = h(s); Object object = d(s, paramObject); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? object : null; } default k0 a(dU paramdU) { return paramObject -> c(paramdU.a(paramObject)); } default a a(fT paramfT) { return paramShort -> paramfT.get(c(paramShort)); } default lV a(g1 paramg1) { return paramShort -> paramg1.d(c(paramShort)); } default hw a(f2 paramf2) { return paramShort -> paramf2.get(c(paramShort)); } @Deprecated default Object apply(int paramInt) { return c(j6.a(paramInt)); } default gW a(ar paramar) { return paramByte -> c(paramar.a(paramByte)); }
/* 59 */   default dq a(i parami) { return paramShort -> parami.c(c(paramShort)); }
/*    */ 
/*    */   
/*    */   Object c(short paramShort);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\hw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */