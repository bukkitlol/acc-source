/*    */ package me.konsolas.aac;@FunctionalInterface
/*  2 */ public interface hh extends lE, ToLongFunction { default long g() { return 0L; }
/*  3 */   default mz a(eK parameK) { return paramChar -> b(parameK.b(paramChar)); } @Deprecated
/*  4 */   default Long h(Object paramObject, Long paramLong) { Object object = paramObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 13 */     long l = b(object);
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
/* 48 */     try { if (l == g()) { try { if (containsKey(object)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramLong; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/* 49 */   default g1 a(fT paramfT) { return paramObject -> b(paramfT.get(paramObject)); } default hh a(kw paramkw) { return paramObject -> paramkw.a(b(paramObject)); } default m1 a(hx paramhx) { return paramObject -> paramhx.a(b(paramObject)); } default mU a(km paramkm) { return paramObject -> paramkm.b(b(paramObject)); } @Deprecated default Long n(Object paramObject) { long l; Object object = paramObject; try { if ((l = b(object)) == g()) { try { if (containsKey(object)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return h(paramObject1, (Long)paramObject2); } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return g(paramObject1, (Long)paramObject2); } default mp a(aB paramaB) { return paramObject -> paramaB.a(b(paramObject)); } @Deprecated default Object remove(Object paramObject) { return m(paramObject); } default i9 a(mD parammD) { return paramDouble -> b(parammD.b(paramDouble)); } default jO a(c6 paramc6) { return paramInt -> b(paramc6.a(paramInt)); } default long applyAsLong(Object paramObject) { return b(paramObject); }
/* 50 */   default hh a(mp parammp) { return paramObject -> b(parammp.get(paramObject)); } default long b(Object paramObject, long paramLong) { throw new UnsupportedOperationException(); } default ju a(kJ paramkJ) { return paramObject -> paramkJ.b(b(paramObject)); } @Deprecated default Long m(Object paramObject) { Object object = paramObject; try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return containsKey(object) ? Long.valueOf(a(object)) : null; } default dU a(kp paramkp) { return paramObject -> paramkp.b(b(paramObject)); } default f1 a(ia paramia) { return paramObject -> paramia.b(b(paramObject)); } default kw a(aB paramaB) { return paramLong -> b(paramaB.a(paramLong)); } default c0 a(hV paramhV) { return paramByte -> b(paramhV.b(paramByte)); } default g0 a(mP parammP) { return paramFloat -> b(parammP.b(paramFloat)); } @Deprecated default Object get(Object paramObject) { return n(paramObject); } default k0 a(mI parammI) { return paramObject -> parammI.d(b(paramObject)); } default void g(long paramLong) { throw new UnsupportedOperationException(); } @Deprecated default Long g(Object paramObject, Long paramLong) { Object object = paramObject;
/* 51 */     boolean bool = containsKey(object); long l = b(object, paramLong.longValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 52 */      return bool ? Long.valueOf(l) : null; } default long a(Object paramObject, long paramLong) { long l; try { if ((l = b(paramObject)) == g()) { try { if (containsKey(paramObject)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramLong; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 53 */      } @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); }
/* 54 */   default k2 a(gh paramgh) { return paramObject -> paramgh.a(b(paramObject)); }
/* 55 */   default lV a(a parama) { return paramShort -> b(parama.a(paramShort)); } default long a(Object paramObject) {
/* 56 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   long b(Object paramObject);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\hh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */