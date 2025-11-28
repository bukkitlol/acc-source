/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface gl extends lE, IntFunction { @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); }
/*    */ 
/*    */   
/*  4 */   default hw a(eI parameI) { return paramShort -> c(parameI.b(paramShort)); }
/*  5 */   default Object j() { return null; } default Object e(int paramInt, Object paramObject) {
/*  6 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default gW a(kf paramkf) {
/* 10 */     return paramByte -> c(paramkf.b(paramByte));
/*    */   }
/*    */   
/*    */   default ls a(D paramD)
/*    */   {
/* 15 */     return paramInt -> paramD.c(c(paramInt));
/* 16 */   } default void j(Object paramObject) { throw new UnsupportedOperationException(); } default Object d(int paramInt) {
/* 17 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   default l a(f3 paramf3) {
/* 20 */     return paramInt -> paramf3.c(c(paramInt));
/*    */   }
/* 22 */   default Object apply(int paramInt) { return c(paramInt); } @Deprecated
/* 23 */   default Object put(Object paramObject1, Object paramObject2) { return d((Integer)paramObject1, paramObject2); } @Deprecated default boolean containsKey(Object paramObject) { try {  }
/* 24 */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : h(((Integer)paramObject).intValue()); } default gl a(kO paramkO) {
/* 25 */     return paramInt -> c(paramkO.a(paramInt));
/*    */   }
/*    */   default ij a(jJ paramjJ) {
/* 28 */     return paramInt -> paramjJ.d(c(paramInt));
/*    */   } default k0 a(ju paramju) {
/* 30 */     return paramObject -> c(paramju.a(paramObject));
/*    */   }
/*    */   
/* 33 */   default d_ a(fi paramfi) { return paramChar -> c(paramfi.b(paramChar)); }
/* 34 */   default hu a(go paramgo) { return paramDouble -> c(paramgo.b(paramDouble)); } @Deprecated default Object d(Integer paramInteger, Object paramObject) { int i = paramInteger.intValue();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 40 */     boolean bool = h(i); Object object = e(i, paramObject); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? object : null; }
/*    */   @Deprecated default Object remove(Object paramObject) { try { if (paramObject == null)
/*    */         return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  int i = ((Integer)paramObject).intValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 43 */      return h(i) ? d(i) : null; } default mI a(kJ paramkJ) { return paramLong -> c(paramkJ.b(paramLong)); } default f2 a(mu parammu) { return paramObject -> c(parammu.d(paramObject)); }
/*    */   default gl a(f2 paramf2) { return paramInt -> paramf2.get(c(paramInt)); }
/* 45 */   default boolean h(int paramInt) { return true; } @Deprecated default Object get(Object paramObject) { Object object; 
/* 46 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  int i = ((Integer)paramObject).intValue(); try { if ((object = c(i)) == j()) { try { if (h(i)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 48 */      } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { try { if (paramObject1 == null) return paramObject2;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */ 
/*    */     
/* 51 */     int i = ((Integer)paramObject1).intValue(); Object object = c(i); try { if (object == j()) { try { if (h(i)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramObject2; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      } default gD a(i parami) { return paramInt -> parami.c(c(paramInt)); }
/* 53 */   default c6 a(fT paramfT) { return paramInt -> paramfT.get(c(paramInt)); }
/* 54 */   default an a(kL paramkL) { return paramInt -> paramkL.c(c(paramInt)); }
/* 55 */   default jO a(g1 paramg1) { return paramInt -> paramg1.d(c(paramInt)); }
/* 56 */   default lT a(cM paramcM) { return paramFloat -> c(paramcM.b(paramFloat)); } default Object f(int paramInt, Object paramObject) { Object object; 
/* 57 */     try { if ((object = c(paramInt)) == j()) { try { if (h(paramInt)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramObject; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      }
/*    */    default kO a(mu parammu) {
/* 60 */     return paramInt -> parammu.d(c(paramInt));
/*    */   }
/*    */   
/*    */   Object c(int paramInt);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\gl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */