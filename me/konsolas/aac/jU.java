/*    */ package me.konsolas.aac;@FunctionalInterface
/*  2 */ public interface ju extends lE, ToIntFunction { default fi a(eK parameK) { return paramChar -> a(parameK.b(paramChar)); }
/*  3 */   default void g(int paramInt) { throw new UnsupportedOperationException(); }
/*  4 */   default m1 a(gD paramgD) { return paramObject -> paramgD.a(a(paramObject)); } default int b(Object paramObject, int paramInt) {
/*  5 */     throw new UnsupportedOperationException();
/*    */   } default k0 a(gl paramgl) {
/*  7 */     return paramObject -> paramgl.c(a(paramObject));
/*    */   }
/*  9 */   default mp a(c6 paramc6) { return paramObject -> paramc6.a(a(paramObject)); } default int g() {
/* 10 */     return 0;
/*    */   } default int b(Object paramObject) {
/* 12 */     throw new UnsupportedOperationException();
/*    */   }
/* 14 */   default int applyAsInt(Object paramObject) { return a(paramObject); } @Deprecated
/* 15 */   default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } @Deprecated
/* 16 */   default Object remove(Object paramObject) { return m(paramObject); }
/* 17 */   default kO a(c6 paramc6) { return paramInt -> a(paramc6.a(paramInt)); } default int a(Object paramObject, int paramInt) { int i; 
/* 18 */     try { if ((i = a(paramObject)) == g()) { try { if (containsKey(paramObject)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramInt; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      }
/* 20 */   default kJ a(aB paramaB) { return paramLong -> a(paramaB.a(paramLong)); }
/* 21 */   default cM a(mP parammP) { return paramFloat -> a(parammP.b(paramFloat)); } default mu a(fT paramfT) { return paramObject -> a(paramfT.get(paramObject)); } default f1 a(ls paramls) { return paramObject -> paramls.b(a(paramObject)); } @Deprecated default Integer n(Object paramObject) { int i; Object object = paramObject;
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
/* 48 */     try { if ((i = a(object)) == g()) { try { if (containsKey(object)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/* 49 */   default go a(mD parammD) { return paramDouble -> a(parammD.b(paramDouble)); } default ju a(mp parammp) { return paramObject -> a(parammp.get(paramObject)); } @Deprecated default Integer h(Object paramObject, Integer paramInteger) { Object object = paramObject; boolean bool = containsKey(object); int i = b(object, paramInteger.intValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Integer.valueOf(i) : null; } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return g(paramObject1, (Integer)paramObject2); } default eI a(a parama) { return paramShort -> a(parama.a(paramShort)); } default ju a(kO paramkO) { return paramObject -> paramkO.a(a(paramObject)); } default dU a(an paraman) { return paramObject -> paraman.a(a(paramObject)); } default mU a(l paraml) { return paramObject -> paraml.b(a(paramObject)); }
/* 50 */   @Deprecated default Integer g(Object paramObject, Integer paramInteger) { Object object = paramObject; int i = a(object); try { if (i == g()) { try { if (containsKey(object)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramInteger; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 51 */      } default kf a(hV paramhV) { return paramByte -> a(paramhV.b(paramByte)); }
/*    */   
/* 53 */   default k2 a(ij paramij) { return paramObject -> paramij.a(a(paramObject)); } @Deprecated
/* 54 */   default Object put(Object paramObject1, Object paramObject2) { return h(paramObject1, (Integer)paramObject2); }
/* 55 */   default hh a(jO paramjO) { return paramObject -> paramjO.a(a(paramObject)); }
/*    */   @Deprecated
/* 57 */   default Integer m(Object paramObject) { Object object = paramObject; try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 58 */      return containsKey(object) ? Integer.valueOf(b(object)) : null; } @Deprecated default Object get(Object paramObject) { return n(paramObject); }
/*    */ 
/*    */   
/*    */   int a(Object paramObject);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ju.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */