/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface mu extends lE, ToIntFunction { default eI a(hw paramhw) { return paramShort -> d(paramhw.c(paramShort)); }
/*    */ 
/*    */   
/*    */   default i a(gD paramgD) {
/*  5 */     return paramObject -> paramgD.a(d(paramObject));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   default int applyAsInt(Object paramObject) {
/* 13 */     return d(paramObject);
/* 14 */   } default fT a(c6 paramc6) { return paramObject -> paramc6.a(d(paramObject)); }
/*    */   @Deprecated
/* 16 */   default Integer j(Object paramObject, Integer paramInteger) { Object object = paramObject; int i = d(object); try { if (i == h()) { try { if (containsKey(object)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramInteger; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 17 */      } default int c(Object paramObject, int paramInt) { throw new UnsupportedOperationException(); }
/*    */    default kL a(an paraman) {
/* 19 */     return paramObject -> paraman.a(d(paramObject));
/*    */   }
/*    */ 
/*    */   
/*    */   default f3 a(l paraml) {
/* 24 */     return paramObject -> paraml.b(d(paramObject)); } @Deprecated
/* 25 */   default Object get(Object paramObject) { return o(paramObject); }
/* 26 */   default cM a(lT paramlT) { return paramFloat -> d(paramlT.c(paramFloat)); }
/* 27 */   default kJ a(mI parammI) { return paramLong -> d(parammI.d(paramLong)); }
/*    */   @Deprecated
/* 29 */   default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } @Deprecated
/* 30 */   default Integer p(Object paramObject) { Object object = paramObject; try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 31 */      return containsKey(object) ? Integer.valueOf(c(object)) : null; } default fi a(d_ paramd_) { return paramChar -> d(paramd_.c(paramChar)); } default mu a(kO paramkO) {
/* 32 */     return paramObject -> paramkO.a(d(paramObject));
/*    */   }
/* 34 */   default mu a(f2 paramf2) { return paramObject -> d(paramf2.get(paramObject)); } @Deprecated
/* 35 */   default Integer i(Object paramObject, Integer paramInteger) { Object object = paramObject; boolean bool = containsKey(object); int i = c(object, paramInteger.intValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 36 */      return bool ? Integer.valueOf(i) : null; } default go a(hu paramhu) { return paramDouble -> d(paramhu.c(paramDouble)); }
/* 37 */   default g1 a(jO paramjO) { return paramObject -> paramjO.a(d(paramObject)); }
/* 38 */   default int h() { return 0; } default int d(Object paramObject, int paramInt) { int i; 
/* 39 */     try { if ((i = d(paramObject)) == h()) { try { if (containsKey(paramObject)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramInt; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      } default kf a(gW paramgW) {
/* 41 */     return paramByte -> d(paramgW.d(paramByte));
/*    */   }
/* 43 */   default kO a(gl paramgl) { return paramInt -> d(paramgl.c(paramInt)); } @Deprecated
/* 44 */   default Object put(Object paramObject1, Object paramObject2) { return i(paramObject1, (Integer)paramObject2); } @Deprecated default Integer o(Object paramObject) { int i;
/* 45 */     Object object = paramObject; try { if ((i = d(object)) == h()) { try { if (containsKey(object)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 46 */      } default ju a(k0 paramk0) { return paramObject -> d(paramk0.get(paramObject)); }
/*    */   
/*    */   @Deprecated
/* 49 */   default Object remove(Object paramObject) { return p(paramObject); }
/* 50 */   default D a(ls paramls) { return paramObject -> paramls.b(d(paramObject)); } @Deprecated
/* 51 */   default Object getOrDefault(Object paramObject1, Object paramObject2) { return j(paramObject1, (Integer)paramObject2); } default void h(int paramInt) {
/* 52 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   default jJ a(ij paramij) {
/* 55 */     return paramObject -> paramij.a(d(paramObject));
/*    */   }
/* 57 */   default int c(Object paramObject) { throw new UnsupportedOperationException(); } default f2 a(gl paramgl) {
/* 58 */     return paramObject -> paramgl.c(d(paramObject));
/*    */   }
/*    */   
/*    */   int d(Object paramObject);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\mu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */