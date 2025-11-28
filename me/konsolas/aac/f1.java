/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface f1 extends lE, ToIntFunction { default byte a(Object paramObject) { throw new UnsupportedOperationException(); }
/*    */   
/*  3 */   default P a(a parama) { return paramShort -> b(parama.a(paramShort)); } @Deprecated
/*  4 */   default Object getOrDefault(Object paramObject1, Object paramObject2) { return g(paramObject1, (Byte)paramObject2); }
/*  5 */   @Deprecated default Object remove(Object paramObject) { return m(paramObject); } default int applyAsInt(Object paramObject) { return b(paramObject); } @Deprecated default Byte g(Object paramObject, Byte paramByte) { Object object = paramObject;
/*  6 */     byte b = b(object);
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
/* 27 */     try { if (b == g()) { try { if (containsKey(object)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramByte; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   default f1 a(gP paramgP) { return paramObject -> paramgP.a(b(paramObject)); } @Deprecated default Byte m(Object paramObject) { Object object = paramObject; try {  }
/* 29 */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return containsKey(object) ? Byte.valueOf(a(object)) : null; }
/*    */    default void g(byte paramByte) {
/*    */     throw new UnsupportedOperationException();
/*    */   } default gP a(hV paramhV) {
/*    */     return paramByte -> b(paramhV.b(paramByte));
/*    */   }
/*    */   default k2 a(iT paramiT) {
/*    */     return paramObject -> paramiT.a(b(paramObject));
/*    */   }
/*    */   @Deprecated
/*    */   default Byte n(Object paramObject) {
/*    */     byte b;
/*    */     Object object = paramObject;
/*    */     try {
/*    */       if ((b = b(object)) == g()) {
/*    */         try {
/*    */           if (containsKey(object));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return null;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   @Deprecated
/*    */   default Byte h(Object paramObject, Byte paramByte) {
/*    */     Object object = paramObject;
/* 58 */     boolean bool = containsKey(object);
/*    */     byte b = a(object, paramByte.byteValue());
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return bool ? Byte.valueOf(b) : null;
/*    */   }
/*    */   
/*    */   default ia a(aB paramaB) {
/*    */     return paramLong -> b(paramaB.a(paramLong));
/*    */   }
/*    */   
/*    */   default mU a(b paramb) {
/*    */     return paramObject -> paramb.b(b(paramObject));
/*    */   }
/*    */   
/*    */   default ju a(kf paramkf) {
/*    */     return paramObject -> paramkf.b(b(paramObject));
/*    */   }
/*    */   
/*    */   default dU a(ar paramar) {
/*    */     return paramObject -> paramar.a(b(paramObject));
/*    */   }
/*    */   
/*    */   default mp a(hV paramhV) {
/*    */     return paramObject -> paramhV.b(b(paramObject));
/*    */   }
/*    */   
/*    */   default byte a(Object paramObject, byte paramByte) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default f1 a(mp parammp) {
/*    */     return paramObject -> b(parammp.get(paramObject));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object get(Object paramObject) {
/*    */     return n(paramObject);
/*    */   }
/*    */   
/*    */   default k1 a(mD parammD) {
/*    */     return paramDouble -> b(parammD.b(paramDouble));
/*    */   }
/*    */   
/*    */   default D a(fT paramfT) {
/*    */     return paramObject -> b(paramfT.get(paramObject));
/*    */   }
/*    */   
/*    */   default hh a(c0 paramc0) {
/*    */     return paramObject -> paramc0.a(b(paramObject));
/*    */   }
/*    */   
/*    */   default byte b(Object paramObject, byte paramByte) {
/*    */     byte b;
/*    */     try {
/*    */       if ((b = b(paramObject)) == g()) {
/*    */         try {
/*    */           if (containsKey(paramObject));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return paramByte;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object put(Object paramObject1, Object paramObject2) {
/*    */     return h(paramObject1, (Byte)paramObject2);
/*    */   }
/*    */   
/*    */   default lb a(mP parammP) {
/*    */     return paramFloat -> b(parammP.b(paramFloat));
/*    */   }
/*    */   
/*    */   default ls a(c6 paramc6) {
/*    */     return paramInt -> b(paramc6.a(paramInt));
/*    */   }
/*    */   
/*    */   default byte g() {
/*    */     return 0;
/*    */   }
/*    */   
/*    */   default k0 a(gW paramgW) {
/*    */     return paramObject -> paramgW.d(b(paramObject));
/*    */   }
/*    */   
/*    */   default m1 a(ep paramep) {
/*    */     return paramObject -> paramep.a(b(paramObject));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function andThen(Function paramFunction) {
/*    */     return super.andThen(paramFunction);
/*    */   }
/*    */   
/*    */   default d1 a(eK parameK) {
/*    */     return paramChar -> b(parameK.b(paramChar));
/*    */   }
/*    */   
/*    */   byte b(Object paramObject);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\f1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */