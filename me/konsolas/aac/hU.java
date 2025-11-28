/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface hu extends lE, DoubleFunction { default iW a(i parami) { return paramDouble -> parami.c(c(paramDouble)); } default mI a(gh paramgh) { return paramLong -> c(paramgh.a(paramLong)); } default go a(mu parammu) { return paramDouble -> parammu.d(c(paramDouble)); } default i9 a(g1 paramg1) { return paramDouble -> paramg1.d(c(paramDouble)); } default o a(jJ paramjJ) { return paramDouble -> paramjJ.d(c(paramDouble)); } default Object c(double paramDouble, Object paramObject) { throw new UnsupportedOperationException(); } default Object d(double paramDouble) { throw new UnsupportedOperationException(); } default boolean h(double paramDouble) { return true; } @Deprecated default Object remove(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/* 29 */     double d = ((Double)paramObject).doubleValue();
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return h(d) ? d(d) : null; }
/*    */   default Object f() { return null; }
/*    */   default jp a(kL paramkL) { return paramDouble -> paramkL.c(c(paramDouble)); }
/*    */   default gl a(ij paramij) { return paramInt -> c(paramij.a(paramInt)); }
/*    */   default hu a(o paramo) { return paramDouble -> c(paramo.b(paramDouble)); }
/*    */   default k0 a(k2 paramk2) { return paramObject -> c(paramk2.b(paramObject)); } default d_ a(is paramis) {
/*    */     return paramChar -> c(paramis.b(paramChar));
/*    */   } default mD a(fT paramfT) {
/*    */     return paramDouble -> paramfT.get(c(paramDouble));
/*    */   } @Deprecated
/*    */   default Object getOrDefault(Object paramObject1, Object paramObject2) {
/*    */     try {
/*    */       if (paramObject1 == null)
/*    */         return paramObject2; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/* 52 */     double d = ((Double)paramObject1).doubleValue(); Object object = c(d); try { if (object == f()) { try { if (h(d)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramObject2; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default hw a(iM paramiM) { return paramShort -> c(paramiM.b(paramShort)); }
/*    */   default f2 a(jJ paramjJ) { return paramObject -> c(paramjJ.d(paramObject)); }
/*    */   default Object d(double paramDouble, Object paramObject) { Object object; try { if ((object = c(paramDouble)) == f()) { try { if (h(paramDouble)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramObject; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   default k1 a(D paramD) { return paramDouble -> paramD.c(c(paramDouble)); }
/*    */   @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); }
/* 57 */   @Deprecated default Object get(Object paramObject) { Object object; try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  double d = ((Double)paramObject).doubleValue(); try { if ((object = c(d)) == f()) { try { if (h(d)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default hu a(f2 paramf2) { return paramDouble -> paramf2.get(c(paramDouble)); } default Object apply(double paramDouble) { return c(paramDouble); } @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : h(((Double)paramObject).doubleValue()); } default lT a(c3 paramc3) { return paramFloat -> c(paramc3.a(paramFloat)); } default void f(Object paramObject) { throw new UnsupportedOperationException(); } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return b((Double)paramObject1, paramObject2); }
/*    */   default az a(f3 paramf3) { return paramDouble -> paramf3.c(c(paramDouble)); }
/* 59 */   default gW a(iT paramiT) { return paramByte -> c(paramiT.a(paramByte)); } @Deprecated
/* 60 */   default Object b(Double paramDouble, Object paramObject) { double d = paramDouble.doubleValue();
/*    */     boolean bool = h(d);
/*    */     Object object = c(d, paramObject);
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return bool ? object : null; }
/*    */ 
/*    */   
/*    */   Object c(double paramDouble);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\hu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */