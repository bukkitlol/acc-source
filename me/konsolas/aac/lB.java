/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface lb extends lE, DoubleToIntFunction { @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); } default ia a(km paramkm) {
/*  2 */     return paramLong -> a(paramkm.b(paramLong));
/*    */   }
/*  4 */   default byte b(float paramFloat) { throw new UnsupportedOperationException(); } @Deprecated default Byte h(Object paramObject) { byte b; 
/*  5 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 49 */     float f = ((Float)paramObject).floatValue(); try { if ((b = a(f)) == d()) { try { if (a(f)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default lb a(gP paramgP) { return paramFloat -> paramgP.a(a(paramFloat)); }
/*    */   @Deprecated default Byte g(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  float f = ((Float)paramObject).floatValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return a(f) ? Byte.valueOf(b(f)) : null; }
/* 51 */   @Deprecated default Byte d(Object paramObject, Byte paramByte) { try { if (paramObject == null) return paramByte;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  float f = ((Float)paramObject).floatValue(); byte b = a(f); try { if (b == d()) { try { if (a(f)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramByte; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   default gP a(b paramb) { return paramByte -> a(paramb.b(paramByte)); }
/*    */   @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return d(paramObject1, (Byte)paramObject2); }
/*    */   default c3 a(iT paramiT) { return paramFloat -> paramiT.a(a(paramFloat)); }
/* 55 */   default void d(byte paramByte) { throw new UnsupportedOperationException(); } @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : a(((Float)paramObject).floatValue()); } default hL a(b paramb) { return paramFloat -> paramb.b(a(paramFloat)); } default P a(cT paramcT) { return paramShort -> a(paramcT.b(paramShort)); } default f1 a(mU parammU) { return paramObject -> a(parammU.a(paramObject)); } @Deprecated default Object get(Object paramObject) { return h(paramObject); } default mP a(hV paramhV) { return paramFloat -> paramhV.b(a(paramFloat)); } default mb a(ar paramar) { return paramFloat -> paramar.a(a(paramFloat)); } default byte b(float paramFloat, byte paramByte) { throw new UnsupportedOperationException(); }
/* 56 */   default d1 a(gs paramgs) { return paramChar -> a(paramgs.a(paramChar)); } default lT a(gW paramgW) { return paramFloat -> paramgW.d(a(paramFloat)); } @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } default hE a(ep paramep) { return paramFloat -> paramep.a(a(paramFloat)); } default ls a(l paraml) { return paramInt -> a(paraml.b(paramInt)); } default D a(f3 paramf3) { return paramObject -> a(paramf3.c(paramObject)); } @Deprecated default Object remove(Object paramObject) { return g(paramObject); } default lb a(hL paramhL) { return paramFloat -> a(paramhL.b(paramFloat)); } @Deprecated default int applyAsInt(double paramDouble) { return a(j6.a(paramDouble)); } default byte a(float paramFloat, byte paramByte) { byte b; try { if ((b = a(paramFloat)) == d()) { try { if (a(paramFloat)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramByte; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default boolean a(float paramFloat) { return true; } default g0 a(c0 paramc0) { return paramFloat -> paramc0.a(a(paramFloat)); } default k1 a(az paramaz) { return paramDouble -> a(paramaz.a(paramDouble)); }
/*    */   
/*    */   @Deprecated
/*    */   default Object put(Object paramObject1, Object paramObject2) {
/* 60 */     return a((Float)paramObject1, (Byte)paramObject2);
/*    */   }
/* 62 */   default cM a(kf paramkf) { return paramFloat -> paramkf.b(a(paramFloat)); }
/* 63 */   default byte d() { return 0; } @Deprecated
/* 64 */   default Byte a(Float paramFloat, Byte paramByte) { float f = paramFloat.floatValue();
/*    */     boolean bool = a(f);
/*    */     byte b = b(f, paramByte.byteValue());
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return bool ? Byte.valueOf(b) : null; }
/*    */ 
/*    */   
/*    */   byte a(float paramFloat);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\lb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */