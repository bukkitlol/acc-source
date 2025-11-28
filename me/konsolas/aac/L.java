/*    */ package me.konsolas.aac;
/*    */ 
/*    */ @FunctionalInterface
/*    */ public interface l extends lE, IntToDoubleFunction {
/*  5 */   default boolean d(int paramInt) { return true; }
/*    */   @Deprecated
/*  7 */   default Function compose(Function paramFunction) { return super.compose(paramFunction); }
/*  8 */   default gD a(hE paramhE) { return paramInt -> paramhE.a(b(paramInt)); } @Deprecated default Float j(Object paramObject) { float f; 
/*  9 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/*    */     int i = ((Integer)paramObject).intValue();
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
/* 34 */     try { if ((f = b(i)) == e()) { try { if (d(i)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      }
/*    */   default double applyAsDouble(int paramInt) { return b(paramInt); }
/*    */   default float a(int paramInt, float paramFloat) { throw new UnsupportedOperationException(); }
/*    */   @Deprecated default Object get(Object paramObject) { return j(paramObject); }
/*    */   default void e(float paramFloat) { throw new UnsupportedOperationException(); }
/*    */   default jO a(g0 paramg0) { return paramInt -> paramg0.b(b(paramInt)); }
/*    */   @Deprecated default Object put(Object paramObject1, Object paramObject2) { return a((Integer)paramObject1, (Float)paramObject2); }
/*    */   @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return e(paramObject1, (Float)paramObject2); }
/*    */   default ij a(c3 paramc3) { return paramInt -> paramc3.a(b(paramInt)); }
/*    */   default c6 a(mP parammP) { return paramInt -> parammP.b(b(paramInt)); }
/*    */   default f3 a(mu parammu) { return paramObject -> b(parammu.d(paramObject)); }
/*    */   default cT a(eI parameI) { return paramShort -> b(parameI.b(paramShort)); }
/*    */   default hL a(cM paramcM) { return paramFloat -> b(paramcM.b(paramFloat)); }
/*    */   default float b(int paramInt, float paramFloat) { float f; try { if ((f = b(paramInt)) == e()) { try { if (d(paramInt)); }
/*    */         catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */          return paramFloat; }
/*    */        }
/*    */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      }
/*    */   default an a(mb parammb) { return paramInt -> parammb.a(b(paramInt)); } @Deprecated default Float i(Object paramObject) { try { if (paramObject == null)
/*    */         return null;  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 57 */      int i = ((Integer)paramObject).intValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return d(i) ? Float.valueOf(a(i)) : null; }
/*    */   default ls a(lb paramlb) { return paramInt -> paramlb.a(b(paramInt)); }
/*    */   default gl a(lT paramlT) { return paramInt -> paramlT.c(b(paramInt)); }
/*    */   default b a(kf paramkf) { return paramByte -> b(paramkf.b(paramByte)); } @Deprecated default Float a(Integer paramInteger, Float paramFloat) { int i = paramInteger.intValue(); boolean bool = d(i); float f = a(i, paramFloat.floatValue()); try {  }
/* 61 */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Float.valueOf(f) : null; } @Deprecated default Float e(Object paramObject, Float paramFloat) { try { if (paramObject == null) return paramFloat;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  int i = ((Integer)paramObject).intValue(); float f = b(i); try { if (f == e()) { try { if (d(i)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramFloat; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default kO a(cM paramcM) { return paramInt -> paramcM.b(b(paramInt)); } @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : d(((Integer)paramObject).intValue()); }
/* 62 */   default float a(int paramInt) { throw new UnsupportedOperationException(); }
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   default Function andThen(Function paramFunction) {
/*    */     return super.andThen(paramFunction);
/*    */   }
/*    */   
/*    */   default l a(kO paramkO) {
/*    */     return paramInt -> b(paramkO.a(paramInt));
/*    */   }
/*    */   
/*    */   default mU a(ju paramju) {
/*    */     return paramObject -> b(paramju.a(paramObject));
/*    */   }
/*    */   
/*    */   default gs a(fi paramfi) {
/*    */     return paramChar -> b(paramfi.b(paramChar));
/*    */   }
/*    */   
/*    */   default az a(go paramgo) {
/*    */     return paramDouble -> b(paramgo.b(paramDouble));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object remove(Object paramObject) {
/*    */     return i(paramObject);
/*    */   }
/*    */   
/*    */   default km a(kJ paramkJ) {
/*    */     return paramLong -> b(paramkJ.b(paramLong));
/*    */   }
/*    */   
/*    */   default float e() {
/*    */     return 0.0F;
/*    */   }
/*    */   
/*    */   default l a(hL paramhL) {
/*    */     return paramInt -> paramhL.b(b(paramInt));
/*    */   }
/*    */   
/*    */   float b(int paramInt);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */