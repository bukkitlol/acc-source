/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface f3 extends lE, ToDoubleFunction { default b a(gW paramgW) { return paramByte -> c(paramgW.d(paramByte)); }
/*    */ 
/*    */ 
/*    */   
/*    */   default az a(hu paramhu)
/*    */   {
/*  7 */     return paramDouble -> c(paramhu.c(paramDouble)); } default hL a(lT paramlT) {
/*  8 */     return paramFloat -> c(paramlT.c(paramFloat));
/*    */   }
/*    */   
/*    */   default double applyAsDouble(Object paramObject) {
/* 12 */     return c(paramObject);
/* 13 */   } default float h() { return 0.0F; } default float c(Object paramObject, float paramFloat) { float f; 
/* 14 */     try { if ((f = c(paramObject)) == h()) { try { if (containsKey(paramObject)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramFloat; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 15 */      } default cT a(hw paramhw) { return paramShort -> c(paramhw.c(paramShort)); }
/*    */   
/* 17 */   default mU a(k0 paramk0) { return paramObject -> c(paramk0.get(paramObject)); }
/* 18 */   default float d(Object paramObject) { throw new UnsupportedOperationException(); }
/*    */   @Deprecated
/* 20 */   default Float i(Object paramObject, Float paramFloat) { Object object = paramObject; boolean bool = containsKey(object); float f = d(object, paramFloat.floatValue()); try {  }
/* 21 */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Float.valueOf(f) : null; } @Deprecated
/* 22 */   default Object remove(Object paramObject) { return p(paramObject); }
/*    */ 
/*    */   
/* 25 */   default gs a(d_ paramd_) { return paramChar -> c(paramd_.c(paramChar)); } @Deprecated default Float o(Object paramObject) { float f;
/* 26 */     Object object = paramObject;
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
/* 46 */     try { if ((f = c(object)) == h()) { try { if (containsKey(object)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); }
/* 48 */   default kL a(mb parammb) { return paramObject -> parammb.a(c(paramObject)); } default void h(float paramFloat) { throw new UnsupportedOperationException(); } default i a(hE paramhE) { return paramObject -> paramhE.a(c(paramObject)); } default f3 a(hL paramhL) { return paramObject -> paramhL.b(c(paramObject)); } default fT a(mP parammP) { return paramObject -> parammP.b(c(paramObject)); } default f3 a(f2 paramf2) { return paramObject -> c(paramf2.get(paramObject)); }
/* 49 */   @Deprecated default Object get(Object paramObject) { return o(paramObject); } default D a(lb paramlb) { return paramObject -> paramlb.a(c(paramObject)); } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return j(paramObject1, (Float)paramObject2); } default l a(gl paramgl) { return paramInt -> c(paramgl.c(paramInt)); } default g1 a(g0 paramg0) { return paramObject -> paramg0.b(c(paramObject)); } default km a(mI parammI) { return paramLong -> c(parammI.d(paramLong)); } default f2 a(lT paramlT) { return paramObject -> paramlT.c(c(paramObject)); } default jJ a(c3 paramc3) { return paramObject -> paramc3.a(c(paramObject)); } @Deprecated
/* 50 */   default Float j(Object paramObject, Float paramFloat) { Object object = paramObject;
/*    */     
/*    */     float f = c(object);
/*    */     
/* 54 */     try { if (f == h()) { try { if (containsKey(object)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramFloat; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return i(paramObject1, (Float)paramObject2); } default float d(Object paramObject, float paramFloat) { throw new UnsupportedOperationException(); } default mu a(cM paramcM) { return paramObject -> paramcM.b(c(paramObject)); }
/* 55 */   @Deprecated default Float p(Object paramObject) { Object object = paramObject;
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return containsKey(object) ? Float.valueOf(d(object)) : null; }
/*    */ 
/*    */   
/*    */   float c(Object paramObject);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\f3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */