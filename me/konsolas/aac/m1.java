/*    */ package me.konsolas.aac;@FunctionalInterface
/*  2 */ public interface m1 extends lE, ToIntFunction { default dU a(dX paramdX) { return paramObject -> paramdX.b(a(paramObject)); }
/*    */ 
/*    */   
/*  5 */   default hh a(mz parammz) { return paramObject -> parammz.b(a(paramObject)); }
/*    */   default char a(Object paramObject, char paramChar) { char c;
/*    */     
/*  8 */     try { if ((c = a(paramObject)) == g()) { try { if (containsKey(paramObject)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramChar; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      }
/* 10 */   default gD a(c6 paramc6) { return paramInt -> a(paramc6.a(paramInt)); } @Deprecated
/*    */   default Character m(Object paramObject) { char c;
/* 12 */     Object object = paramObject;
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
/* 39 */     try { if ((c = a(object)) == g()) { try { if (containsKey(object)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return null; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */      } @Deprecated default Character n(Object paramObject) { Object object = paramObject; try {  }
/*    */     catch (UnsupportedOperationException unsupportedOperationException)
/* 42 */     { throw a(null); }  return containsKey(object) ? Character.valueOf(b(object)) : null; }
/* 43 */   @Deprecated default Character h(Object paramObject, Character paramCharacter) { Object object = paramObject; boolean bool = containsKey(object); char c = b(object, paramCharacter.charValue()); try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return bool ? Character.valueOf(c) : null; } default void g(char paramChar) { throw new UnsupportedOperationException(); } default k0 a(d_ paramd_) { return paramObject -> paramd_.c(a(paramObject)); } default m1 a(lU paramlU) { return paramObject -> paramlU.b(a(paramObject)); } default hE a(mP parammP) { return paramFloat -> a(parammP.b(paramFloat)); } default iW a(mD parammD) { return paramDouble -> a(parammD.b(paramDouble)); } @Deprecated default Function andThen(Function paramFunction) { return super.andThen(paramFunction); } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return g(paramObject1, (Character)paramObject2); } default char b(Object paramObject) { throw new UnsupportedOperationException(); }
/*    */   default ep a(hV paramhV) { return paramByte -> a(paramhV.b(paramByte)); }
/* 45 */   default lU a(eK parameK) { return paramChar -> a(parameK.b(paramChar)); } @Deprecated default Object put(Object paramObject1, Object paramObject2) { return h(paramObject1, (Character)paramObject2); } default int applyAsInt(Object paramObject) { return a(paramObject); } default f1 a(d1 paramd1) { return paramObject -> paramd1.b(a(paramObject)); } default char b(Object paramObject, char paramChar) { throw new UnsupportedOperationException(); } default i a(fT paramfT) { return paramObject -> a(paramfT.get(paramObject)); } default hx a(aB paramaB) { return paramLong -> a(paramaB.a(paramLong)); } @Deprecated default Object get(Object paramObject) { return m(paramObject); } default k2 a(is paramis) { return paramObject -> paramis.b(a(paramObject)); }
/* 46 */   default mp a(eK parameK) { return paramObject -> parameK.b(a(paramObject)); } @Deprecated
/* 47 */   default Character g(Object paramObject, Character paramCharacter) { Object object = paramObject; char c = a(object); try { if (c == g()) { try { if (containsKey(object)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramCharacter; }
/*    */        }
/*    */     catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 50 */      } default ju a(fi paramfi) { return paramObject -> paramfi.b(a(paramObject)); }
/* 51 */   default m1 a(mp parammp) { return paramObject -> a(parammp.get(paramObject)); }
/* 52 */   default mU a(gs paramgs) { return paramObject -> paramgs.a(a(paramObject)); } @Deprecated
/* 53 */   default Object remove(Object paramObject) { return n(paramObject); }
/*    */    default dq a(a parama) {
/* 55 */     return paramShort -> a(parama.a(paramShort));
/*    */   }
/*    */   default char g() {
/* 58 */     return Character.MIN_VALUE;
/*    */   }
/*    */   
/*    */   char a(Object paramObject);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\m1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */