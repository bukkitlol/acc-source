/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface is extends lE, IntToDoubleFunction { @Deprecated default Double a(Character paramCharacter, Double paramDouble) { char c = paramCharacter.charValue();
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 54 */     boolean bool = c(c);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 59 */     double d = a(c, paramDouble.doubleValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Double.valueOf(d) : null; } @Deprecated default Double b(Object paramObject, Double paramDouble) { try { if (paramObject == null)
/*    */         return paramDouble;  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 62 */      char c = ((Character)paramObject).charValue();
/*    */     double d = b(c);
/*    */     try {
/*    */       if (d == b()) {
/*    */         try {
/*    */           if (c(c));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return paramDouble;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     }  }
/*    */ 
/*    */   
/*    */   default mz a(i9 parami9) {
/*    */     return paramChar -> parami9.a(b(paramChar));
/*    */   }
/*    */   
/*    */   default k2 a(m1 paramm1) {
/*    */     return paramObject -> b(paramm1.a(paramObject));
/*    */   }
/*    */   
/*    */   default double a(char paramChar, double paramDouble) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default c3 a(hE paramhE) {
/*    */     return paramFloat -> b(paramhE.a(paramFloat));
/*    */   }
/*    */   
/*    */   default lU a(iW paramiW) {
/*    */     return paramChar -> paramiW.b(b(paramChar));
/*    */   }
/*    */   
/*    */   default void b(double paramDouble) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default is a(o paramo) {
/*    */     return paramChar -> paramo.b(b(paramChar));
/*    */   }
/*    */   
/*    */   default iM a(dq paramdq) {
/*    */     return paramShort -> b(paramdq.b(paramShort));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default double applyAsDouble(int paramInt) {
/*    */     return b(j6.a(paramInt));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Double d(Object paramObject) {
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return null; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     char c = ((Character)paramObject).charValue();
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return c(c) ? Double.valueOf(a(c)) : null;
/*    */   }
/*    */   
/*    */   default gs a(az paramaz) {
/*    */     return paramChar -> paramaz.a(b(paramChar));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object put(Object paramObject1, Object paramObject2) {
/*    */     return a((Character)paramObject1, (Double)paramObject2);
/*    */   }
/*    */   
/*    */   default dX a(jp paramjp) {
/*    */     return paramChar -> paramjp.a(b(paramChar));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object remove(Object paramObject) {
/*    */     return d(paramObject);
/*    */   }
/*    */   
/*    */   default jJ a(i parami) {
/*    */     return paramObject -> b(parami.c(paramObject));
/*    */   }
/*    */   
/*    */   default fi a(go paramgo) {
/*    */     return paramChar -> paramgo.b(b(paramChar));
/*    */   }
/*    */   
/*    */   default double a(char paramChar) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default double b(char paramChar, double paramDouble) {
/*    */     double d;
/*    */     try {
/*    */       if ((d = b(paramChar)) == b()) {
/*    */         try {
/*    */           if (c(paramChar));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return paramDouble;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function compose(Function paramFunction) {
/*    */     return super.compose(paramFunction);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object getOrDefault(Object paramObject1, Object paramObject2) {
/*    */     return b(paramObject1, (Double)paramObject2);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Double c(Object paramObject) {
/*    */     double d;
/*    */     try {
/*    */       if (paramObject == null)
/*    */         return null; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     char c = ((Character)paramObject).charValue();
/*    */     try {
/*    */       if ((d = b(c)) == b()) {
/*    */         try {
/*    */           if (c(c));
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
/*    */   default iT a(ep paramep) {
/*    */     return paramByte -> b(paramep.a(paramByte));
/*    */   }
/*    */   
/*    */   default is a(lU paramlU) {
/*    */     return paramChar -> b(paramlU.b(paramChar));
/*    */   }
/*    */   
/*    */   default d_ a(hu paramhu) {
/*    */     return paramChar -> paramhu.c(b(paramChar));
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default boolean containsKey(Object paramObject) {
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return (paramObject == null) ? false : c(((Character)paramObject).charValue());
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Function andThen(Function paramFunction) {
/*    */     return super.andThen(paramFunction);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object get(Object paramObject) {
/*    */     return c(paramObject);
/*    */   }
/*    */   
/*    */   default ij a(gD paramgD) {
/*    */     return paramInt -> b(paramgD.a(paramInt));
/*    */   }
/*    */   
/*    */   default eK a(mD parammD) {
/*    */     return paramChar -> parammD.b(b(paramChar));
/*    */   }
/*    */   
/*    */   default gh a(hx paramhx) {
/*    */     return paramLong -> b(paramhx.a(paramLong));
/*    */   }
/*    */   
/*    */   default boolean c(char paramChar) {
/*    */     return true;
/*    */   }
/*    */   
/*    */   default o a(iW paramiW) {
/*    */     return paramDouble -> b(paramiW.b(paramDouble));
/*    */   }
/*    */   
/*    */   default d1 a(k1 paramk1) {
/*    */     return paramChar -> paramk1.a(b(paramChar));
/*    */   }
/*    */   
/*    */   default double b() {
/*    */     return 0.0D;
/*    */   }
/*    */   
/*    */   double b(char paramChar);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\is.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */