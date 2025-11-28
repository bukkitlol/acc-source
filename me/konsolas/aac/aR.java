/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface ar extends lE, IntUnaryOperator { default mb a(lb paramlb) { return paramFloat -> a(paramlb.a(paramFloat)); } default ep a(dq paramdq) {
/*  2 */     return paramByte -> paramdq.b(a(paramByte));
/*    */   }
/*  4 */   default c0 a(lV paramlV) { return paramByte -> paramlV.a(a(paramByte)); } default short a() {
/*  5 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   default ar a(gP paramgP) {
/* 10 */     return paramByte -> a(paramgP.a(paramByte));
/*    */   }
/*    */   
/* 13 */   default ic a(P paramP) { return paramShort -> a(paramP.b(paramShort)); }
/* 14 */   default gP a(P paramP) { return paramByte -> paramP.b(a(paramByte)); } @Deprecated default Short a(Object paramObject) { 
/* 15 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/* 53 */     byte b = ((Byte)paramObject).byteValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return i(b) ? Short.valueOf(b(b)) : null; }
/* 54 */   @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : i(((Byte)paramObject).byteValue()); } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return a((Byte)paramObject1, (Short)paramObject2); } default iT a(iM paramiM) { return paramByte -> paramiM.b(a(paramByte)); } @Deprecated default Short a(Object paramObject, Short paramShort) { try { if (paramObject == null) return paramShort;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  byte b = ((Byte)paramObject).byteValue(); short s = a(b); try { if (s == a()) { try { if (i(b)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramShort; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default hV a(a parama) { return paramByte -> parama.a(a(paramByte)); } @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } default ar a(ic paramic) { return paramByte -> paramic.a(a(paramByte)); } default kp a(ia paramia) { return paramLong -> a(paramia.b(paramLong)); } default short b(byte paramByte) { throw new UnsupportedOperationException(); } default boolean i(byte paramByte) { return true; } default dU a(f1 paramf1) { return paramObject -> a(paramf1.b(paramObject)); }
/* 55 */   default gW a(hw paramhw) { return paramByte -> paramhw.c(a(paramByte)); } default kf a(eI parameI) { return paramByte -> parameI.b(a(paramByte)); } default short a(byte paramByte, short paramShort) { throw new UnsupportedOperationException(); } @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); } default dX a(d1 paramd1) { return paramChar -> a(paramd1.b(paramChar)); } default void a(short paramShort) { throw new UnsupportedOperationException(); } default b a(cT paramcT) { return paramByte -> paramcT.b(a(paramByte)); } @Deprecated default Object remove(Object paramObject) { return a(paramObject); } default short b(byte paramByte, short paramShort) { short s; try { if ((s = a(paramByte)) == a()) { try { if (i(paramByte)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramShort; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } @Deprecated default int applyAsInt(int paramInt) { return a(j6.a(paramInt)); } default jp a(k1 paramk1) { return paramDouble -> a(paramk1.a(paramDouble)); } @Deprecated
/* 56 */   default Short a(Byte paramByte, Short paramShort) { byte b = paramByte.byteValue();
/*    */ 
/*    */     
/*    */     boolean bool = i(b);
/*    */ 
/*    */     
/* 62 */     short s = a(b, paramShort.shortValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Short.valueOf(s) : null; } default kL a(D paramD) { return paramObject -> a(paramD.c(paramObject)); } default an a(ls paramls) { return paramInt -> a(paramls.b(paramInt)); } @Deprecated default Short b(Object paramObject) { short s; try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  byte b = ((Byte)paramObject).byteValue(); try { if ((s = a(b)) == a()) { try { if (i(b)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/* 63 */   @Deprecated default Object get(Object paramObject) { return b(paramObject); } @Deprecated
/* 64 */   default Object getOrDefault(Object paramObject1, Object paramObject2) { return a(paramObject1, (Short)paramObject2); }
/*    */ 
/*    */   
/*    */   short a(byte paramByte);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */