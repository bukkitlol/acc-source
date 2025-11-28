/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface ij extends lE, IntToDoubleFunction { default double a(int paramInt, double paramDouble) { double d; try { if ((d = a(paramInt)) == e()) { try { if (c(paramInt)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramDouble; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      }
/*  3 */   default ij a(kO paramkO) { return paramInt -> a(paramkO.a(paramInt)); } default c3 a(cM paramcM) {
/*  4 */     return paramFloat -> a(paramcM.b(paramFloat));
/*    */   }
/*  6 */   default l a(az paramaz) { return paramInt -> paramaz.a(a(paramInt)); }
/*  7 */   default kO a(go paramgo) { return paramInt -> paramgo.b(a(paramInt)); } @Deprecated default Double e(Object paramObject, Double paramDouble) { try { if (paramObject == null) return paramDouble;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  int i = ((Integer)paramObject).intValue(); double d = a(i); try { if (d == e()) { try { if (c(i)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramDouble; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default jO a(i9 parami9) { return paramInt -> parami9.a(a(paramInt)); } @Deprecated default Object remove(Object paramObject) { return j(paramObject); } default gh a(kJ paramkJ) { return paramLong -> a(paramkJ.b(paramLong)); } default gl a(hu paramhu) { return paramInt -> paramhu.c(a(paramInt)); } default void e(double paramDouble) { throw new UnsupportedOperationException(); } default boolean c(int paramInt) { return true; } default c6 a(mD parammD) { return paramInt -> parammD.b(a(paramInt)); } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return a((Integer)paramObject1, (Double)paramObject2); } default k2 a(ju paramju) { return paramObject -> a(paramju.a(paramObject)); } default an a(jp paramjp) { return paramInt -> paramjp.a(a(paramInt)); } default ls a(k1 paramk1) { return paramInt -> paramk1.a(a(paramInt)); } default is a(fi paramfi) { return paramChar -> a(paramfi.b(paramChar)); } @Deprecated default Double i(Object paramObject) { double d; try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 14 */     int i = ((Integer)paramObject).intValue();
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
/* 60 */     try { if ((d = a(i)) == e()) { try { if (c(i)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/* 61 */   default double applyAsDouble(int paramInt) { return a(paramInt); } default iM a(eI parameI) { return paramShort -> a(parameI.b(paramShort)); } default jJ a(mu parammu) { return paramObject -> a(parammu.d(paramObject)); } default iT a(kf paramkf) { return paramByte -> a(paramkf.b(paramByte)); } @Deprecated default Double j(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  int i = ((Integer)paramObject).intValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return c(i) ? Double.valueOf(b(i)) : null; } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return e(paramObject1, (Double)paramObject2); } default o a(go paramgo) { return paramDouble -> a(paramgo.b(paramDouble)); } default double b(int paramInt, double paramDouble) { throw new UnsupportedOperationException(); } @Deprecated default Object get(Object paramObject) { return i(paramObject); } @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : c(((Integer)paramObject).intValue()); } default double b(int paramInt) { throw new UnsupportedOperationException(); } default ij a(o paramo) { return paramInt -> paramo.b(a(paramInt)); } default double e() { return 0.0D; } default gD a(iW paramiW) { return paramInt -> paramiW.b(a(paramInt)); } @Deprecated default Double a(Integer paramInteger, Double paramDouble) { int i = paramInteger.intValue(); boolean bool = c(i); double d = b(i, paramDouble.doubleValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 62 */      return bool ? Double.valueOf(d) : null; } @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); } @Deprecated
/* 63 */   default Function andThen(Function paramFunction) { return super.andThen(paramFunction); }
/*    */ 
/*    */   
/*    */   double a(int paramInt);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ij.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */