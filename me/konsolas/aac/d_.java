/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface d_ extends lE, IntFunction { default Object d(char paramChar) { throw new UnsupportedOperationException(); }
/*    */   
/*    */   default void d(Object paramObject) {
/*  4 */     throw new UnsupportedOperationException();
/*    */   } default f2 a(i parami) {
/*  6 */     return paramObject -> c(parami.c(paramObject));
/*    */   }
/*    */   
/*    */   default lT a(hE paramhE)
/*    */   {
/* 11 */     return paramFloat -> c(paramhE.a(paramFloat));
/* 12 */   } default gs a(f3 paramf3) { return paramChar -> paramf3.c(c(paramChar)); } @Deprecated default Object get(Object paramObject) { Object object;
/*    */     
/* 14 */     try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 22 */     char c = ((Character)paramObject).charValue();
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
/* 56 */     try { if ((object = c(c)) == d()) { try { if (h(c)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } default k0 a(m1 paramm1) { return paramObject -> c(paramm1.a(paramObject)); } @Deprecated default Object remove(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  char c = ((Character)paramObject).charValue(); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return h(c) ? d(c) : null; } default gl a(gD paramgD) { return paramInt -> c(paramgD.a(paramInt)); } default fi a(mu parammu) { return paramChar -> parammu.d(c(paramChar)); } @Deprecated default Function compose(Function paramFunction) { return super.compose(paramFunction); } default mI a(hx paramhx) { return paramLong -> c(paramhx.a(paramLong)); } @Deprecated default Object b(Character paramCharacter, Object paramObject) { char c = paramCharacter.charValue(); boolean bool = h(c); Object object = c(c, paramObject); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? object : null; } default mz a(g1 paramg1) { return paramChar -> paramg1.d(c(paramChar)); } default dX a(kL paramkL) { return paramChar -> paramkL.c(c(paramChar)); } default lU a(i parami) { return paramChar -> parami.c(c(paramChar)); }
/*    */   default is a(jJ paramjJ) { return paramChar -> paramjJ.d(c(paramChar)); }
/* 58 */   default d_ a(f2 paramf2) { return paramChar -> paramf2.get(c(paramChar)); }
/* 59 */   default Object d() { return null; } default hw a(dq paramdq) { return paramShort -> c(paramdq.b(paramShort)); } default Object c(char paramChar, Object paramObject) { throw new UnsupportedOperationException(); } default gW a(ep paramep) { return paramByte -> c(paramep.a(paramByte)); } default d1 a(D paramD) { return paramChar -> paramD.c(c(paramChar)); } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { try { if (paramObject1 == null) return paramObject2;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  char c = ((Character)paramObject1).charValue(); Object object = c(c); try { if (object == d()) { try { if (h(c)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramObject2; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return b((Character)paramObject1, paramObject2); }
/* 60 */   default d_ a(lU paramlU) { return paramChar -> c(paramlU.b(paramChar)); } default eK a(fT paramfT) { return paramChar -> paramfT.get(c(paramChar)); } default hu a(iW paramiW) { return paramDouble -> c(paramiW.b(paramDouble)); } default boolean h(char paramChar) { return true; } @Deprecated default Object apply(int paramInt) { return c(j6.a(paramInt)); } @Deprecated default boolean containsKey(Object paramObject) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (paramObject == null) ? false : h(((Character)paramObject).charValue()); } default Object d(char paramChar, Object paramObject) { Object object; try { if ((object = c(paramChar)) == d()) { try { if (h(paramChar)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramObject; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      }
/*    */ 
/*    */   
/*    */   Object c(char paramChar);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\d_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */