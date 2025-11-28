/*    */ package me.konsolas.aac;
/*    */ @FunctionalInterface
/*  3 */ public interface k0 extends lE { default mI a(aB paramaB) { return paramLong -> get(paramaB.a(paramLong)); } default f1 a(D paramD) {
/*  4 */     return paramObject -> paramD.c(get(paramObject));
/*    */   }
/*  6 */   default k2 a(jJ paramjJ) { return paramObject -> paramjJ.d(get(paramObject)); } default gl a(c6 paramc6) {
/*  7 */     return paramInt -> get(paramc6.a(paramInt));
/*    */   }
/*  9 */   default hw a(a parama) { return paramShort -> get(parama.a(paramShort)); } default Object remove(Object paramObject) {
/* 10 */     throw new UnsupportedOperationException();
/*    */   } default gW a(hV paramhV) {
/* 12 */     return paramByte -> get(paramhV.b(paramByte));
/*    */   }
/*    */   
/* 15 */   default Object n() { return null; } default mU a(f3 paramf3) {
/* 16 */     return paramObject -> paramf3.c(get(paramObject));
/*    */   }
/*    */   
/*    */   default lT a(mP parammP) {
/* 20 */     return paramFloat -> get(parammP.b(paramFloat));
/* 21 */   } default dU a(kL paramkL) { return paramObject -> paramkL.c(get(paramObject)); }
/* 22 */   default ju a(mu parammu) { return paramObject -> parammu.d(get(paramObject)); }
/* 23 */   default m1 a(i parami) { return paramObject -> parami.c(get(paramObject)); }
/* 24 */   default void n(Object paramObject) { throw new UnsupportedOperationException(); }
/* 25 */   default k0 a(f2 paramf2) { return paramObject -> paramf2.get(get(paramObject)); }
/* 26 */   default hu a(mD parammD) { return paramDouble -> get(parammD.b(paramDouble)); }
/* 27 */   default hh a(g1 paramg1) { return paramObject -> paramg1.d(get(paramObject)); }
/*    */   default Object getOrDefault(Object paramObject1, Object paramObject2) { Object object;
/*    */     
/* 30 */     try { if ((object = get(paramObject1)) == n()) { try { if (containsKey(paramObject1)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramObject2; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 31 */      } default k0 a(mp parammp) { return paramObject -> get(parammp.get(paramObject)); }
/*    */   
/* 33 */   default d_ a(eK parameK) { return paramChar -> get(parameK.b(paramChar)); } default mp a(fT paramfT) {
/* 34 */     return paramObject -> paramfT.get(get(paramObject));
/*    */   }
/* 36 */   default f2 a(fT paramfT) { return paramObject -> get(paramfT.get(paramObject)); } default Object put(Object paramObject1, Object paramObject2) {
/* 37 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   Object get(Object paramObject);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\k0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */