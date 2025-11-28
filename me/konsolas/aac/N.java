/*    */ package me.konsolas.aac;
/*    */ 
/*    */ 
/*    */ public interface n extends Collection, gr {
/*  5 */   default Iterator iterator() { return b(); }
/*  6 */   default Spliterator spliterator() { return b(); } @Deprecated default boolean remove(Object paramObject) { try { if (paramObject == null) return false;  } catch (v v) { throw c(null); }  return b(((Integer)paramObject).intValue()); } default boolean a(IntPredicate paramIntPredicate) { Objects.requireNonNull(paramIntPredicate);
/*    */ 
/*    */ 
/*    */     
/*    */     boolean bool = false;
/*    */ 
/*    */     
/* 13 */     cA cA = b(); while (true)
/*    */     { 
/* 15 */       try { while (cA.hasNext()) { if (paramIntPredicate.test(cA.nextInt()))
/* 16 */           { cA.remove(); bool = true; }  }  } catch (v v) { throw c(null); }  return bool; }  }
/*    */   @Deprecated default boolean removeIf(Predicate paramPredicate) { try {  }
/*    */     catch (v v) { throw c(null); }
/* 19 */      return a((paramPredicate instanceof IntPredicate) ? (IntPredicate)paramPredicate : (paramInt -> paramPredicate.test(Integer.valueOf(paramInt)))); } @Deprecated default boolean a(Integer paramInteger) { return a(paramInteger.intValue()); } @Deprecated
/* 20 */   default int[] a(int[] paramArrayOfint) { return b(paramArrayOfint); }
/* 21 */   default IntStream b() { return StreamSupport.intStream(a(), true); }
/* 22 */   default IntStream a() { return StreamSupport.intStream(a(), false); } @Deprecated
/* 23 */   default Stream stream() { return super.stream(); }
/* 24 */   default boolean a(jK paramjK) { return a(paramjK); }
/* 25 */   default cA a() { return b(); } @Deprecated
/*    */   default boolean contains(Object paramObject) { 
/* 27 */     try { if (paramObject == null) return false;  } catch (v v) { throw c(null); }
/*    */     
/* 29 */     return c(((Integer)paramObject).intValue()); } @Deprecated default boolean add(Object paramObject) { return a((Integer)paramObject); }
/*    */ 
/*    */   
/*    */   default fK b() {
/* 33 */     return hl.a(b(), jC.a(this), 320);
/*    */   }
/*    */   
/*    */   default fK a() {
/*    */     return b();
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Stream parallelStream() {
/*    */     return super.parallelStream();
/*    */   }
/*    */   
/*    */   cA b();
/*    */   
/*    */   boolean a(int paramInt);
/*    */   
/*    */   boolean c(int paramInt);
/*    */   
/*    */   boolean b(int paramInt);
/*    */   
/*    */   int[] a();
/*    */   
/*    */   int[] b(int[] paramArrayOfint);
/*    */   
/*    */   boolean a(n paramn);
/*    */   
/*    */   boolean d(n paramn);
/*    */   
/*    */   boolean b(n paramn);
/*    */   
/*    */   boolean c(n paramn);
/*    */   
/*    */   private static v c(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */