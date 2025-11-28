/*    */ package me.konsolas.aac;
/*    */ @FunctionalInterface
/*  3 */ public interface mp extends lE { default hh b(hh paramhh) { return paramObject -> paramhh.b(get(paramObject)); }
/*  4 */   default ju b(ju paramju) { return paramObject -> paramju.a(get(paramObject)); } default a a(a parama) {
/*  5 */     return paramShort -> get(parama.a(paramShort));
/*    */   }
/*    */   
/*  8 */   default k2 b(k2 paramk2) { return paramObject -> paramk2.b(get(paramObject)); } default Object remove(Object paramObject) {
/*  9 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/* 12 */   default c6 b(c6 paramc6) { return paramInt -> get(paramc6.a(paramInt)); }
/* 13 */   default mU b(mU parammU) { return paramObject -> parammU.a(get(paramObject)); } default eK b(eK parameK) {
/* 14 */     return paramChar -> get(parameK.b(paramChar));
/*    */   }
/* 16 */   default fT a(fT paramfT) { return paramObject -> get(paramfT.get(paramObject)); }
/* 17 */   default aB b(aB paramaB) { return paramLong -> get(paramaB.a(paramLong)); } default Object put(Object paramObject1, Object paramObject2) {
/* 18 */     throw new UnsupportedOperationException();
/*    */   }
/* 20 */   default mD b(mD parammD) { return paramDouble -> get(parammD.b(paramDouble)); } default f1 b(f1 paramf1) {
/* 21 */     return paramObject -> paramf1.b(get(paramObject));
/*    */   }
/*    */   
/* 24 */   default mP b(mP parammP) { return paramFloat -> get(parammP.b(paramFloat)); } default hV b(hV paramhV) {
/* 25 */     return paramByte -> get(paramhV.b(paramByte));
/*    */   }
/*    */   
/*    */   default mp a(mp parammp) {
/* 29 */     return paramObject -> get(parammp.get(paramObject));
/* 30 */   } default void m(Object paramObject) { throw new UnsupportedOperationException(); }
/* 31 */   default mp b(mp parammp) { return paramObject -> parammp.get(get(paramObject)); }
/* 32 */   default k0 a(k0 paramk0) { return paramObject -> paramk0.get(get(paramObject)); }
/* 33 */   default dU a(dU paramdU) { return paramObject -> paramdU.a(get(paramObject)); } default Object getOrDefault(Object paramObject1, Object paramObject2) { Object object;
/*    */     
/* 35 */     try { if ((object = get(paramObject1)) == m()) { try { if (containsKey(paramObject1)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramObject2; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 36 */      } default Object m() { return null; } default m1 b(m1 paramm1) {
/* 37 */     return paramObject -> paramm1.a(get(paramObject));
/*    */   }
/*    */   
/*    */   Object get(Object paramObject);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\mp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */