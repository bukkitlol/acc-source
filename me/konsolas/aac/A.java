/*    */ package me.konsolas.aac;@FunctionalInterface public interface a extends lE, IntFunction { @Deprecated
/*  2 */   default Object apply(int paramInt) { return a(j6.a(paramInt)); } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { 
/*  3 */     try { if (paramObject1 == null) return paramObject2;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*  9 */     short s = ((Short)paramObject1).shortValue();
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
/* 42 */     Object object = a(s); try { if (object == q()) { try { if (g(s)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramObject2; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default void q(Object paramObject) { throw new UnsupportedOperationException(); }
/*    */   default lV a(hh paramhh) { return paramShort -> paramhh.b(a(paramShort)); }
/*    */   default eK a(dX paramdX) { return paramChar -> a(paramdX.b(paramChar)); }
/*    */   default a a(mp parammp) { return paramShort -> parammp.get(a(paramShort)); }
/*    */   default Object b(short paramShort) { throw new UnsupportedOperationException(); }
/*    */   default Object b(short paramShort, Object paramObject) { Object object; try { if ((object = a(paramShort)) == q()) { try { if (g(paramShort)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramObject; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   @Deprecated default Object a(Short paramShort, Object paramObject) { short s = paramShort.shortValue(); boolean bool = g(s); Object object = a(s, paramObject); try {  }
/* 49 */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? object : null; }
/* 50 */   @Deprecated default Object remove(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  short s = ((Short)paramObject).shortValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return g(s) ? b(s) : null; } default boolean g(short paramShort) { return true; } default P a(f1 paramf1) { return paramShort -> paramf1.b(a(paramShort)); } default mP a(mb parammb) { return paramFloat -> a(parammb.a(paramFloat)); } @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); } default Object q() { return null; } default hw a(k0 paramk0) { return paramShort -> paramk0.get(a(paramShort)); } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return a((Short)paramObject1, paramObject2); } @Deprecated default Object get(Object paramObject) { Object object; try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 51 */      short s = ((Short)paramObject).shortValue(); try { if ((object = a(s)) == q()) { try { if (g(s)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/* 52 */   @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : g(((Short)paramObject).shortValue()); } default cT a(mU parammU) { return paramShort -> parammU.a(a(paramShort)); } default eI a(ju paramju) { return paramShort -> paramju.a(a(paramShort)); } default mp a(dU paramdU) { return paramObject -> a(paramdU.a(paramObject)); } default mD a(jp paramjp) { return paramDouble -> a(paramjp.a(paramDouble)); } default a a(ic paramic) { return paramShort -> a(paramic.a(paramShort)); } default Object a(short paramShort, Object paramObject) { throw new UnsupportedOperationException(); } default aB a(kp paramkp) { return paramLong -> a(paramkp.b(paramLong)); } default dq a(m1 paramm1) { return paramShort -> paramm1.a(a(paramShort)); } default ic a(dU paramdU) { return paramShort -> paramdU.a(a(paramShort)); }
/* 53 */   default fT a(kL paramkL) { return paramObject -> a(paramkL.c(paramObject)); }
/* 54 */   default c6 a(an paraman) { return paramInt -> a(paraman.a(paramInt)); } default iM a(k2 paramk2) {
/* 55 */     return paramShort -> paramk2.b(a(paramShort));
/*    */   }
/*    */   default hV a(ar paramar) {
/* 58 */     return paramByte -> a(paramar.a(paramByte));
/*    */   }
/*    */   
/*    */   Object a(short paramShort);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */