/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface kf extends lE, IntUnaryOperator { @Deprecated default Integer b(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/* 17 */     byte b = ((Byte)paramObject).byteValue();
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
/*    */     try {  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException)
/* 45 */     { throw a(null); }  return e(b) ? Integer.valueOf(a(b)) : null; } default cM a(lb paramlb) { return paramFloat -> b(paramlb.a(paramFloat)); }
/*    */   default ar a(an paraman) { return paramByte -> paraman.a(b(paramByte)); }
/*    */   @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); }
/*    */   @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : e(((Byte)paramObject).byteValue()); }
/*    */   default kJ a(ia paramia) { return paramLong -> b(paramia.b(paramLong)); }
/*    */   default ju a(f1 paramf1) { return paramObject -> b(paramf1.b(paramObject)); }
/*    */   @Deprecated default Integer a(Object paramObject, Integer paramInteger) { try { if (paramObject == null) return paramInteger;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  byte b = ((Byte)paramObject).byteValue(); int i = b(b); try { if (i == a()) { try { if (e(b)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramInteger; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/* 52 */   @Deprecated default Integer a(Byte paramByte, Integer paramInteger) { byte b = paramByte.byteValue(); boolean bool = e(b); int i = a(b, paramInteger.intValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Integer.valueOf(i) : null; }
/* 53 */   default kf a(kO paramkO) { return paramByte -> paramkO.a(b(paramByte)); } @Deprecated default Object get(Object paramObject) { return a(paramObject); } default mu a(D paramD) { return paramObject -> b(paramD.c(paramObject)); } default b a(l paraml) { return paramByte -> paraml.b(b(paramByte)); } default hV a(c6 paramc6) { return paramByte -> paramc6.a(b(paramByte)); } default int b(byte paramByte, int paramInt) { int i; try { if ((i = b(paramByte)) == a()) { try { if (e(paramByte)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramInt; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default ep a(gD paramgD) { return paramByte -> paramgD.a(b(paramByte)); } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return a(paramObject1, (Integer)paramObject2); } default fi a(d1 paramd1) { return paramChar -> b(paramd1.b(paramChar)); } default kf a(gP paramgP) { return paramByte -> b(paramgP.a(paramByte)); }
/* 54 */   @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } default int a() { return 0; } default go a(k1 paramk1) { return paramDouble -> b(paramk1.a(paramDouble)); } default iT a(ij paramij) { return paramByte -> paramij.a(b(paramByte)); } default kO a(ls paramls) { return paramInt -> b(paramls.b(paramInt)); } default void a(int paramInt) { throw new UnsupportedOperationException(); } default int a(byte paramByte, int paramInt) { throw new UnsupportedOperationException(); } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return a((Byte)paramObject1, (Integer)paramObject2); } default int a(byte paramByte) { throw new UnsupportedOperationException(); } default boolean e(byte paramByte) { return true; } @Deprecated default Integer a(Object paramObject) { int i;
/*    */     
/* 56 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  byte b = ((Byte)paramObject).byteValue(); try { if ((i = b(b)) == a()) { try { if (e(b)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 57 */      } @Deprecated default Object remove(Object paramObject) { return b(paramObject); } default gP a(ls paramls) {
/* 58 */     return paramByte -> paramls.b(b(paramByte));
/*    */   }
/*    */   
/* 61 */   default c0 a(jO paramjO) { return paramByte -> paramjO.a(b(paramByte)); } @Deprecated
/* 62 */   default int applyAsInt(int paramInt) { return b(j6.a(paramInt)); }
/* 63 */   default eI a(P paramP) { return paramShort -> b(paramP.b(paramShort)); } default gW a(gl paramgl) {
/* 64 */     return paramByte -> paramgl.c(b(paramByte));
/*    */   }
/*    */   
/*    */   int b(byte paramByte);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\kf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */