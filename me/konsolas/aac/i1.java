/*  1 */ package me.konsolas.aac;public class i1 extends iB implements c5, Serializable { private static final long serialVersionUID = -7046029254386353129L; protected final c5 g; public boolean containsValue(Object paramObject) { return this.g.containsValue(paramObject); } protected transient hy d; protected transient kQ f; protected transient jM e; @Deprecated
/*  2 */   public boolean remove(Object paramObject1, Object paramObject2) { throw new UnsupportedOperationException(); }
/*  3 */   public Object d(int paramInt, Object paramObject) { throw new UnsupportedOperationException(); } @Deprecated
/*  4 */   public Object replace(Object paramObject1, Object paramObject2) { return b((Integer)paramObject1, paramObject2); }
/*  5 */   public Set keySet() { return a(); } @Deprecated
/*  6 */   public boolean replace(Object paramObject1, Object paramObject2, Object paramObject3) { return a((Integer)paramObject1, paramObject2, paramObject3); } public jM a() { 
/*  7 */     try { if (this.e == null) this.e = mw.a(this.g.a());  } catch (UnsupportedOperationException unsupportedOperationException) { throw c(null); }  return this.e; } public hy a() { 
/*  8 */     try { if (this.d == null) this.d = e9.b(this.g.a());  } catch (UnsupportedOperationException unsupportedOperationException) { throw c(null); }  return this.d; } @Deprecated
/*  9 */   public Object a(Integer paramInteger, Object paramObject, BiFunction paramBiFunction) { throw new UnsupportedOperationException(); }
/* 10 */   public Object a(int paramInt, Object paramObject) { return this.g.a(paramInt, paramObject); } @Deprecated
/* 11 */   public Set entrySet() { return b(); }
/* 12 */   public Collection values() { return a(); }
/* 13 */   public void putAll(Map paramMap) { throw new UnsupportedOperationException(); }
/* 14 */   public int hashCode() { return this.g.hashCode(); }
/* 15 */   public Object b(int paramInt, BiFunction paramBiFunction) { throw new UnsupportedOperationException(); }
/* 16 */   public Object a(int paramInt, c6 paramc6) { throw new UnsupportedOperationException(); }
/* 17 */   public Object a(int paramInt, Object paramObject, BiFunction paramBiFunction) { throw new UnsupportedOperationException(); } @Deprecated
/* 18 */   public Object a(Integer paramInteger, Function paramFunction) { throw new UnsupportedOperationException(); } @Deprecated
/* 19 */   public Object b(Integer paramInteger, BiFunction paramBiFunction) { throw new UnsupportedOperationException(); }
/* 20 */   public Object c(int paramInt, Object paramObject) { throw new UnsupportedOperationException(); } @Deprecated
/* 21 */   public Object a(Integer paramInteger, BiFunction paramBiFunction) { throw new UnsupportedOperationException(); } @Deprecated
/* 22 */   public Object c(Integer paramInteger, Object paramObject) { throw new UnsupportedOperationException(); } @Deprecated
/* 23 */   public Object merge(Object paramObject1, Object paramObject2, BiFunction paramBiFunction) { return a((Integer)paramObject1, paramObject2, paramBiFunction); } @Deprecated
/* 24 */   public Object computeIfPresent(Object paramObject, BiFunction paramBiFunction) { return b((Integer)paramObject, paramBiFunction); }
/*    */   @Deprecated
/* 26 */   public boolean a(Integer paramInteger, Object paramObject1, Object paramObject2) { throw new UnsupportedOperationException(); }
/* 27 */   public void forEach(BiConsumer paramBiConsumer) { this.g.forEach(paramBiConsumer); }
/* 28 */   public Object a(int paramInt, IntFunction paramIntFunction) { throw new UnsupportedOperationException(); }
/* 29 */   public boolean isEmpty() { return this.g.isEmpty(); }
/* 30 */   public Object a(int paramInt, BiFunction paramBiFunction) { throw new UnsupportedOperationException(); }
/* 31 */   public boolean a(int paramInt, Object paramObject1, Object paramObject2) { throw new UnsupportedOperationException(); } @Deprecated
/* 32 */   public Object b(Integer paramInteger, Object paramObject) { throw new UnsupportedOperationException(); } public kQ a() { 
/* 33 */     try { if (this.f == null) this.f = aU.b(this.g.a());  } catch (UnsupportedOperationException unsupportedOperationException) { throw c(null); }  return this.f; }
/* 34 */   public boolean a(int paramInt, Object paramObject) { throw new UnsupportedOperationException(); }
/*    */   @Deprecated
/* 36 */   public Object putIfAbsent(Object paramObject1, Object paramObject2) { return c((Integer)paramObject1, paramObject2); }
/* 37 */   public void replaceAll(BiFunction paramBiFunction) { throw new UnsupportedOperationException(); } @Deprecated
/* 38 */   public Object compute(Object paramObject, BiFunction paramBiFunction) { return a((Integer)paramObject, paramBiFunction); } @Deprecated
/* 39 */   public Object computeIfAbsent(Object paramObject, Function paramFunction) { return a((Integer)paramObject, paramFunction); } @Deprecated
/* 40 */   public hy b() { return a(); }
/*    */   
/* 42 */   protected i1(c5 paramc5) { super(paramc5);
/* 43 */     this.g = paramc5; } @Deprecated public Object getOrDefault(Object paramObject1, Object paramObject2) { return this.g.getOrDefault(paramObject1, paramObject2); } public boolean equals(Object paramObject) { 
/* 44 */     try { if (paramObject == this) return true;  } catch (UnsupportedOperationException unsupportedOperationException) { throw c(null); }
/*    */     
/*    */     return this.g.equals(paramObject); }
/*    */ 
/*    */   
/*    */   private static UnsupportedOperationException c(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\i1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */