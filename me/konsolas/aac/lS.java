/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface ls extends lE, IntUnaryOperator { default f1 a(ju paramju) { return paramObject -> b(paramju.a(paramObject)); }
/*  2 */   default jO a(c0 paramc0) { return paramInt -> paramc0.a(b(paramInt)); }
/*  3 */   default k1 a(go paramgo) { return paramDouble -> b(paramgo.b(paramDouble)); } default byte b(int paramInt, byte paramByte) { byte b;
/*    */     
/*  5 */     try { if ((b = b(paramInt)) == e()) { try { if (a(paramInt)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramByte; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      } @Deprecated
/*    */   default Byte a(Integer paramInteger, Byte paramByte) {
/*  8 */     int i = paramInteger.intValue();
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
/*    */     boolean bool = a(i);
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
/* 63 */     byte b = a(i, paramByte.byteValue());
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return bool ? Byte.valueOf(b) : null;
/*    */   }
/*    */   
/*    */   default byte a(int paramInt, byte paramByte) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default l a(b paramb) {
/*    */     return paramInt -> paramb.b(b(paramInt));
/*    */   }
/*    */   
/*    */   default void e(byte paramByte) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default kO a(kf paramkf) {
/*    */     return paramInt -> paramkf.b(b(paramInt));
/*    */   }
/*    */   
/*    */   default boolean a(int paramInt) {
/*    */     return true;
/*    */   }
/*    */   
/*    */   default D a(mu parammu) {
/*    */     return paramObject -> b(parammu.d(paramObject));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Byte j(Object paramObject) {
/*    */     byte b;
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return null; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     int i = ((Integer)paramObject).intValue();
/*    */     try {
/*    */       if ((b = b(i)) == e()) {
/*    */         try {
/*    */           if (a(i));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return null;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   default d1 a(fi paramfi) {
/*    */     return paramChar -> b(paramfi.b(paramChar));
/*    */   }
/*    */   
/*    */   default gD a(ep paramep) {
/*    */     return paramInt -> paramep.a(b(paramInt));
/*    */   }
/*    */   
/*    */   default an a(ar paramar) {
/*    */     return paramInt -> paramar.a(b(paramInt));
/*    */   }
/*    */   
/*    */   default gP a(kf paramkf) {
/*    */     return paramByte -> b(paramkf.b(paramByte));
/*    */   }
/*    */   
/*    */   default byte a(int paramInt) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default ls a(gP paramgP) {
/*    */     return paramInt -> paramgP.a(b(paramInt));
/*    */   }
/*    */   
/*    */   default ia a(kJ paramkJ) {
/*    */     return paramLong -> b(paramkJ.b(paramLong));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Byte i(Object paramObject) {
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return null; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     int i = ((Integer)paramObject).intValue();
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return a(i) ? Byte.valueOf(a(i)) : null;
/*    */   }
/*    */   
/*    */   default lb a(cM paramcM) {
/*    */     return paramFloat -> b(paramcM.b(paramFloat));
/*    */   }
/*    */   
/*    */   default ls a(kO paramkO) {
/*    */     return paramInt -> b(paramkO.a(paramInt));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default boolean containsKey(Object paramObject) {
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return (paramObject == null) ? false : a(((Integer)paramObject).intValue());
/*    */   }
/*    */   
/*    */   default c6 a(hV paramhV) {
/*    */     return paramInt -> paramhV.b(b(paramInt));
/*    */   }
/*    */   
/*    */   default int applyAsInt(int paramInt) {
/*    */     return b(paramInt);
/*    */   }
/*    */   
/*    */   default byte e() {
/*    */     return 0;
/*    */   }
/*    */   
/*    */   default ij a(iT paramiT) {
/*    */     return paramInt -> paramiT.a(b(paramInt));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object get(Object paramObject) {
/*    */     return j(paramObject);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object put(Object paramObject1, Object paramObject2) {
/*    */     return a((Integer)paramObject1, (Byte)paramObject2);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function compose(Function paramFunction) {
/*    */     return super.compose(paramFunction);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object remove(Object paramObject) {
/*    */     return i(paramObject);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function andThen(Function paramFunction) {
/*    */     return super.andThen(paramFunction);
/*    */   }
/*    */   
/*    */   default P a(eI parameI) {
/*    */     return paramShort -> b(parameI.b(paramShort));
/*    */   }
/*    */   
/*    */   default gl a(gW paramgW) {
/*    */     return paramInt -> paramgW.d(b(paramInt));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object getOrDefault(Object paramObject1, Object paramObject2) {
/*    */     return e(paramObject1, (Byte)paramObject2);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Byte e(Object paramObject, Byte paramByte) {
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return paramByte; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     int i = ((Integer)paramObject).intValue();
/*    */     byte b = b(i);
/*    */     try {
/*    */       if (b == e()) {
/*    */         try {
/*    */           if (a(i));
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
/*    */   byte b(int paramInt);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ls.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */