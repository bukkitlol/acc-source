/*    */ package me.konsolas.aac;@FunctionalInterface
/*  2 */ public interface g1 extends lE, ToLongFunction { default mu a(kJ paramkJ) { return paramObject -> paramkJ.b(d(paramObject)); }
/*  3 */   default fT a(aB paramaB) { return paramObject -> paramaB.a(d(paramObject)); } default hh a(k0 paramk0) {
/*  4 */     return paramObject -> d(paramk0.get(paramObject));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object put(Object paramObject1, Object paramObject2) {
/*  9 */     return i(paramObject1, (Long)paramObject2);
/*    */   }
/*    */   
/*    */   default i a(hx paramhx) {
/* 13 */     return paramObject -> paramhx.a(d(paramObject));
/*    */   }
/* 15 */   default c0 a(gW paramgW) { return paramByte -> d(paramgW.d(paramByte)); } @Deprecated default Long o(Object paramObject) { long l;
/* 16 */     Object object = paramObject;
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
/* 50 */     try { if ((l = d(object)) == h()) { try { if (containsKey(object)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/* 51 */   default g0 a(lT paramlT) { return paramFloat -> d(paramlT.c(paramFloat)); } default jJ a(gh paramgh) { return paramObject -> paramgh.a(d(paramObject)); } @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } default f3 a(km paramkm) { return paramObject -> paramkm.b(d(paramObject)); } default jO a(gl paramgl) { return paramInt -> d(paramgl.c(paramInt)); } @Deprecated default Object remove(Object paramObject) { return p(paramObject); } @Deprecated default Long j(Object paramObject, Long paramLong) { Object object = paramObject; long l = d(object); try { if (l == h()) { try { if (containsKey(object)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramLong; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default long applyAsLong(Object paramObject) { return d(paramObject); } default i9 a(hu paramhu) { return paramDouble -> d(paramhu.c(paramDouble)); } default D a(ia paramia) { return paramObject -> paramia.b(d(paramObject)); } default g1 a(kw paramkw) { return paramObject -> paramkw.a(d(paramObject)); }
/*    */   default kL a(kp paramkp) { return paramObject -> paramkp.b(d(paramObject)); }
/* 53 */   @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return j(paramObject1, (Long)paramObject2); } default long h() { return 0L; } default g1 a(f2 paramf2) { return paramObject -> d(paramf2.get(paramObject)); } default f2 a(mI parammI) { return paramObject -> parammI.d(d(paramObject)); } @Deprecated default Long i(Object paramObject, Long paramLong) { Object object = paramObject; boolean bool = containsKey(object); long l = c(object, paramLong.longValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Long.valueOf(l) : null; } @Deprecated default Object get(Object paramObject) { return o(paramObject); } default void h(long paramLong) { throw new UnsupportedOperationException(); } default long d(Object paramObject, long paramLong) { long l; try { if ((l = d(paramObject)) == h()) { try { if (containsKey(paramObject)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramLong; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default kw a(mI parammI) { return paramLong -> d(parammI.d(paramLong)); } default lV a(hw paramhw) { return paramShort -> d(paramhw.c(paramShort)); } @Deprecated
/* 54 */   default Long p(Object paramObject) { Object object = paramObject; try {  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 56 */      return containsKey(object) ? Long.valueOf(c(object)) : null; } default long c(Object paramObject, long paramLong) { throw new UnsupportedOperationException(); }
/* 57 */   default mz a(d_ paramd_) { return paramChar -> d(paramd_.c(paramChar)); } default long c(Object paramObject) {
/* 58 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   long d(Object paramObject);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\g1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */