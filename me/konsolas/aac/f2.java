/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface f2 extends lE { default gl b(gl paramgl) { return paramInt -> get(paramgl.c(paramInt)); }
/*    */   
/*    */   default fT b(fT paramfT) {
/*  4 */     return paramObject -> paramfT.get(get(paramObject));
/*    */   }
/*  6 */   default f2 a(f2 paramf2) { return paramObject -> get(paramf2.get(paramObject)); }
/*  7 */   default Object remove(Object paramObject) { throw new UnsupportedOperationException(); }
/*  8 */   default lT b(lT paramlT) { return paramFloat -> get(paramlT.c(paramFloat)); }
/*  9 */   default k0 b(k0 paramk0) { return paramObject -> get(paramk0.get(paramObject)); }
/* 10 */   default i b(i parami) { return paramObject -> parami.c(get(paramObject)); }
/* 11 */   default Object put(Object paramObject1, Object paramObject2) { throw new UnsupportedOperationException(); }
/* 12 */   default hu b(hu paramhu) { return paramDouble -> get(paramhu.c(paramDouble)); } default Object p() {
/* 13 */     return null;
/*    */   }
/*    */   default void p(Object paramObject) {
/* 16 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/* 19 */   default f3 b(f3 paramf3) { return paramObject -> paramf3.c(get(paramObject)); }
/* 20 */   default gW b(gW paramgW) { return paramByte -> get(paramgW.d(paramByte)); } default jJ b(jJ paramjJ) {
/* 21 */     return paramObject -> paramjJ.d(get(paramObject));
/*    */   }
/*    */   
/* 24 */   default mI b(mI parammI) { return paramLong -> get(parammI.d(paramLong)); }
/* 25 */   default kL a(kL paramkL) { return paramObject -> paramkL.c(get(paramObject)); }
/* 26 */   default hw a(hw paramhw) { return paramShort -> get(paramhw.c(paramShort)); } default mu b(mu parammu) {
/* 27 */     return paramObject -> parammu.d(get(paramObject));
/*    */   }
/*    */   default d_ b(d_ paramd_) {
/* 30 */     return paramChar -> get(paramd_.c(paramChar));
/*    */   }
/*    */   
/*    */   default f2 b(f2 paramf2) {
/* 34 */     return paramObject -> paramf2.get(get(paramObject));
/*    */   }
/*    */   
/* 37 */   default g1 b(g1 paramg1) { return paramObject -> paramg1.d(get(paramObject)); }
/* 38 */   default D b(D paramD) { return paramObject -> paramD.c(get(paramObject)); } default Object getOrDefault(Object paramObject1, Object paramObject2) { Object object;
/*    */     
/* 40 */     try { if ((object = get(paramObject1)) == p()) { try { if (containsKey(paramObject1)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramObject2; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      }
/*    */ 
/*    */   
/*    */   Object get(Object paramObject);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\f2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */