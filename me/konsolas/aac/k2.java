/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface k2 extends lE, ToDoubleFunction { @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); }
/*    */   
/*  3 */   default iT a(hV paramhV) { return paramByte -> b(paramhV.b(paramByte)); } default dU a(jp paramjp) {
/*  4 */     return paramObject -> paramjp.a(b(paramObject));
/*    */   }
/*  6 */   default ij a(c6 paramc6) { return paramInt -> b(paramc6.a(paramInt)); }
/*  7 */   default jJ a(fT paramfT) { return paramObject -> b(paramfT.get(paramObject)); }
/*  8 */   default m1 a(iW paramiW) { return paramObject -> paramiW.b(b(paramObject)); }
/*  9 */   default gh a(aB paramaB) { return paramLong -> b(paramaB.a(paramLong)); } @Deprecated
/* 10 */   default Object remove(Object paramObject) { return m(paramObject); }
/* 11 */   default double a(Object paramObject) { throw new UnsupportedOperationException(); } default double a(Object paramObject, double paramDouble) { double d;
/*    */     
/* 13 */     try { if ((d = b(paramObject)) == g()) { try { if (containsKey(paramObject)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramDouble; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      }
/* 15 */   default iM a(a parama) { return paramShort -> b(parama.a(paramShort)); }
/* 16 */   default hh a(i9 parami9) { return paramObject -> parami9.a(b(paramObject)); }
/* 17 */   default double b(Object paramObject, double paramDouble) { throw new UnsupportedOperationException(); } default double applyAsDouble(Object paramObject) { return b(paramObject); } default double g() { return 0.0D; } @Deprecated default Double g(Object paramObject, Double paramDouble) { Object object = paramObject; double d = b(object); try { if (d == g()) { try { if (containsKey(object)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramDouble; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default o a(mD parammD) { return paramDouble -> b(parammD.b(paramDouble)); } default f1 a(k1 paramk1) { return paramObject -> paramk1.a(b(paramObject)); } default is a(eK parameK) { return paramChar -> b(parameK.b(paramChar)); } @Deprecated default Double m(Object paramObject) { Object object = paramObject;
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
/*    */     try {  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException)
/* 45 */     { throw a(null); }  return containsKey(object) ? Double.valueOf(a(object)) : null; }
/* 46 */   default mU a(az paramaz) { return paramObject -> paramaz.a(b(paramObject)); } default ju a(go paramgo) { return paramObject -> paramgo.b(b(paramObject)); } default c3 a(mP parammP) { return paramFloat -> b(parammP.b(paramFloat)); } default mp a(mD parammD) { return paramObject -> parammD.b(b(paramObject)); } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return g(paramObject1, (Double)paramObject2); } default void g(double paramDouble) { throw new UnsupportedOperationException(); } @Deprecated default Double h(Object paramObject, Double paramDouble) { Object object = paramObject; boolean bool = containsKey(object); double d = b(object, paramDouble.doubleValue()); try {  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      return bool ? Double.valueOf(d) : null; } default k0 a(hu paramhu) { return paramObject -> paramhu.c(b(paramObject)); }
/* 49 */   @Deprecated default Double n(Object paramObject) { double d; Object object = paramObject; try { if ((d = b(object)) == g()) { try { if (containsKey(object)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 51 */      } @Deprecated default Object get(Object paramObject) { return n(paramObject); } @Deprecated
/* 52 */   default Object put(Object paramObject1, Object paramObject2) { return h(paramObject1, (Double)paramObject2); }
/*    */ 
/*    */   
/*    */   default k2 a(mp parammp) {
/* 56 */     return paramObject -> b(parammp.get(paramObject));
/*    */   } default k2 a(o paramo) {
/* 58 */     return paramObject -> paramo.b(b(paramObject));
/*    */   }
/*    */   
/*    */   double b(Object paramObject);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\k2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */