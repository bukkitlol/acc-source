/*  1 */ package me.konsolas.aac;public interface c5 extends c6, Map { @Deprecated default boolean remove(Object paramObject1, Object paramObject2) { return super.remove(paramObject1, paramObject2); } default Object a(int paramInt, BiFunction paramBiFunction) { // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   4: pop
/*    */     //   5: aload_0
/*    */     //   6: iload_1
/*    */     //   7: invokeinterface a : (I)Ljava/lang/Object;
/*    */     //   12: astore_3
/*    */     //   13: aload_0
/*    */     //   14: invokeinterface i : ()Ljava/lang/Object;
/*    */     //   19: astore #4
/*    */     //   21: aload_3
/*    */     //   22: aload #4
/*    */     //   24: if_acmpne -> 44
/*    */     //   27: aload_0
/*    */     //   28: iload_1
/*    */     //   29: invokeinterface g : (I)Z
/*    */     //   34: ifeq -> 52
/*    */     //   37: goto -> 44
/*    */     //   40: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
/*    */     //   43: athrow
/*    */     //   44: iconst_1
/*    */     //   45: goto -> 53
/*    */     //   48: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
/*    */     //   51: athrow
/*    */     //   52: iconst_0
/*    */     //   53: istore #5
/*    */     //   55: aload_2
/*    */     //   56: iload_1
/*    */     //   57: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   60: iload #5
/*    */     //   62: ifeq -> 73
/*    */     //   65: aload_3
/*    */     //   66: goto -> 74
/*    */     //   69: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
/*    */     //   72: athrow
/*    */     //   73: aconst_null
/*    */     //   74: invokeinterface apply : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   79: astore #6
/*    */     //   81: aload #6
/*    */     //   83: ifnonnull -> 116
/*    */     //   86: iload #5
/*    */     //   88: ifeq -> 113
/*    */     //   91: goto -> 98
/*    */     //   94: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
/*    */     //   97: athrow
/*    */     //   98: aload_0
/*    */     //   99: iload_1
/*    */     //   100: invokeinterface b : (I)Ljava/lang/Object;
/*    */     //   105: pop
/*    */     //   106: goto -> 113
/*    */     //   109: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
/*    */     //   112: athrow
/*    */     //   113: aload #4
/*    */     //   115: areturn
/*    */     //   116: aload_0
/*    */     //   117: iload_1
/*    */     //   118: aload #6
/*    */     //   120: invokeinterface b : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   125: pop
/*    */     //   126: aload #6
/*    */     //   128: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #2	-> 0
/*    */     //   #80	-> 5
/*    */     //   #27	-> 21
/*    */     //   #28	-> 55
/*    */     //   #82	-> 81
/*    */     //   #86	-> 86
/*    */     //   #23	-> 113
/*    */     //   #20	-> 116
/*    */     //   #16	-> 126
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   21	37	40	java/lang/UnsupportedOperationException
/*    */     //   27	48	48	java/lang/UnsupportedOperationException
/*    */     //   55	69	69	java/lang/UnsupportedOperationException
/*    */     //   81	91	94	java/lang/UnsupportedOperationException
/*    */     //   86	106	109	java/lang/UnsupportedOperationException }
/*    */   @Deprecated
/*  3 */   default boolean containsKey(Object paramObject) { return super.containsKey(paramObject); } default void clear() {
/*  4 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*  7 */   default boolean a(int paramInt, Object paramObject) { Object object = a(paramInt);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 15 */     try { if (Objects.equals(object, paramObject)) { try { if (object == i()) try { if (!g(paramInt)) return false;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }   } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } else { return false; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
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
/* 81 */     b(paramInt); return true; }
/*    */   default Object a(int paramInt, Object paramObject) { Object object; try { if ((object = a(paramInt)) == i()) { try { if (g(paramInt)); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return paramObject; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  }
/*    */   @Deprecated default Object a(Integer paramInteger, BiFunction<? super Integer, ?, ?> paramBiFunction) { return super.compute(paramInteger, paramBiFunction); }
/* 84 */   @Deprecated default Object put(Object paramObject1, Object paramObject2) { return a((Integer)paramObject1, paramObject2); } @Deprecated default Object b(int paramInt, c6 paramc6) { return a(paramInt, paramc6); } @Deprecated default Object compute(Object paramObject, BiFunction paramBiFunction) { return a((Integer)paramObject, paramBiFunction); } @Deprecated default Object getOrDefault(Object paramObject1, Object paramObject2) { return super.getOrDefault(paramObject1, paramObject2); } default void forEach(BiConsumer paramBiConsumer) { hy hy = a(); Consumer<? super E> consumer = parameB -> paramBiConsumer.accept(Integer.valueOf(parameB.a()), parameB.getValue()); try { if (hy instanceof kl) { ((kl)hy).a(consumer); } else { hy.forEach(consumer); }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  } @Deprecated default Object computeIfPresent(Object paramObject, BiFunction paramBiFunction) { return b((Integer)paramObject, paramBiFunction); } default Object a(int paramInt, Object paramObject, BiFunction<Object, Object, Object> paramBiFunction) { Objects.requireNonNull(paramBiFunction); Objects.requireNonNull(paramObject); Object object1 = a(paramInt), object2 = i(); try { if (object1 != object2 || g(paramInt)) { Object object5 = paramBiFunction.apply(object1, paramObject); try { if (object5 == null) { b(paramInt); return object2; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  Object object4 = object5; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  Object object3 = paramObject; b(paramInt, object3); return object3; }
/*    */   @Deprecated default hy b() { return a(); }
/*    */   @Deprecated default Set entrySet() { return b(); }
/* 87 */   default Collection values() { return a(); } @Deprecated default Object a(Integer paramInteger, Object paramObject) { return super.a(paramInteger, paramObject); } @Deprecated default Object remove(Object paramObject) { return super.remove(paramObject); } @Deprecated default Object a(Integer paramInteger, Object paramObject, BiFunction<? super Object, ? super Object, ?> paramBiFunction) { return super.merge(paramInteger, paramObject, paramBiFunction); } default Object a(int paramInt, c6 paramc6) { Objects.requireNonNull(paramc6); Object object1 = a(paramInt), object2 = i(); try { if (object1 == object2) try { if (!g(paramInt)) { try { if (!paramc6.g(paramInt)) return object2;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  Object object = paramc6.a(paramInt); b(paramInt, object); return object; }  return object1; } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }   } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return object1; } @Deprecated default boolean a(Integer paramInteger, Object paramObject1, Object paramObject2) { return super.replace(paramInteger, paramObject1, paramObject2); } default Object d(int paramInt, Object paramObject) { Object object1 = a(paramInt), object2 = i(); try { if (object1 == object2) try { if (!g(paramInt)) { b(paramInt, paramObject); return object2; }  return object1; } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }   } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return object1; } @Deprecated default Object get(Object paramObject) { return super.get(paramObject); } default Object a(int paramInt, IntFunction<Object> paramIntFunction) { Objects.requireNonNull(paramIntFunction); Object object = a(paramInt); try { if (object == i()) try { if (!g(paramInt)) { Object object1 = paramIntFunction.apply(paramInt); b(paramInt, object1); return object1; }  return object; } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }   } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return object; }
/* 88 */   @Deprecated default Object computeIfAbsent(Object paramObject, Function paramFunction) { return a((Integer)paramObject, paramFunction); }
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   default Object c(Integer paramInteger, Object paramObject) {
/*    */     return super.putIfAbsent(paramInteger, paramObject);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object putIfAbsent(Object paramObject1, Object paramObject2) {
/*    */     return c((Integer)paramObject1, paramObject2);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object a(Integer paramInteger, Function<? super Integer, ?> paramFunction) {
/*    */     return super.computeIfAbsent(paramInteger, paramFunction);
/*    */   }
/*    */   
/*    */   default Object c(int paramInt, Object paramObject) {
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return g(paramInt) ? b(paramInt, paramObject) : i();
/*    */   }
/*    */   
/*    */   default boolean a(int paramInt, Object paramObject1, Object paramObject2) {
/*    */     Object object = a(paramInt);
/*    */     try {
/*    */       if (Objects.equals(object, paramObject1)) {
/*    */         try {
/*    */           if (object == i())
/*    */             try {
/*    */               if (!g(paramInt))
/*    */                 return false; 
/*    */             } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */               throw a(null);
/*    */             }  
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */       } else {
/*    */         return false;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     b(paramInt, paramObject2);
/*    */     return true;
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object replace(Object paramObject1, Object paramObject2) {
/*    */     return b((Integer)paramObject1, paramObject2);
/*    */   }
/*    */   
/*    */   default Object b(int paramInt, BiFunction<Integer, Object, Object> paramBiFunction) {
/*    */     Objects.requireNonNull(paramBiFunction);
/*    */     Object object1 = a(paramInt), object2 = i();
/*    */     try {
/*    */       if (object1 == object2)
/*    */         try {
/*    */           if (!g(paramInt))
/*    */             return object2; 
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         }  
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     Object object = paramBiFunction.apply(Integer.valueOf(paramInt), object1);
/*    */     try {
/*    */       if (object == null) {
/*    */         b(paramInt);
/*    */         return object2;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     b(paramInt, object);
/*    */     return object;
/*    */   }
/*    */   
/*    */   default Set keySet() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object b(Integer paramInteger, Object paramObject) {
/*    */     return super.replace(paramInteger, paramObject);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object b(Integer paramInteger, BiFunction<? super Integer, ?, ?> paramBiFunction) {
/*    */     return super.computeIfPresent(paramInteger, paramBiFunction);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default boolean replace(Object paramObject1, Object paramObject2, Object paramObject3) {
/*    */     return a((Integer)paramObject1, paramObject2, paramObject3);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object merge(Object paramObject1, Object paramObject2, BiFunction paramBiFunction) {
/*    */     return a((Integer)paramObject1, paramObject2, paramBiFunction);
/*    */   }
/*    */   
/*    */   int size();
/*    */   
/*    */   void i(Object paramObject);
/*    */   
/*    */   Object i();
/*    */   
/*    */   hy a();
/*    */   
/*    */   kQ a();
/*    */   
/*    */   jM a();
/*    */   
/*    */   boolean g(int paramInt);
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\c5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */