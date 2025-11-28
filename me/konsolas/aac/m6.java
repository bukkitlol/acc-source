/*  1 */ package me.konsolas.aac;class m6 implements n, Serializable { private static final long serialVersionUID = -7046029254386353129L; public boolean addAll(Collection<? extends E> paramCollection) { synchronized (this.b) { return this.a.addAll(paramCollection); }
/*  2 */      } protected final n a; protected final Object b; public boolean c(n paramn) { synchronized (this.b) { return this.a.c(paramn); }
/*  3 */      } public IntStream b() { return this.a.b(); }
/*  4 */   public Object[] toArray(Object[] paramArrayOfObject) { synchronized (this.b) { return this.a.toArray(paramArrayOfObject); }
/*    */      }
/*  6 */   public void clear() { synchronized (this.b) { this.a.clear(); }
/*    */      }
/*  8 */   public boolean a(int paramInt) { synchronized (this.b) { return this.a.a(paramInt); }
/*  9 */      } public void a(IntConsumer paramIntConsumer) { synchronized (this.b) { this.a.a(paramIntConsumer); }
/* 10 */      } public boolean a(n paramn) { synchronized (this.b) { return this.a.a(paramn); }
/*    */      } @Deprecated
/* 12 */   public boolean contains(Object paramObject) { synchronized (this.b) { return this.a.contains(paramObject); }
/*    */      }
/* 14 */   public boolean retainAll(Collection<?> paramCollection) { synchronized (this.b) { return this.a.retainAll(paramCollection); }
/*    */      }
/* 16 */   public fK a() { return this.a.a(); }
/* 17 */   public boolean containsAll(Collection<?> paramCollection) { synchronized (this.b) { return this.a.containsAll(paramCollection); }
/*    */      } protected m6(n paramn, Object paramObject) { this.a = Objects.<n>requireNonNull(paramn); this.b = paramObject; }
/* 19 */   @Deprecated public boolean add(Object paramObject) { return a((Integer)paramObject); }
/* 20 */   public String toString() { synchronized (this.b) { return this.a.toString(); }
/* 21 */      } private void writeObject(ObjectOutputStream paramObjectOutputStream) { synchronized (this.b) { paramObjectOutputStream.defaultWriteObject(); }
/* 22 */      } public cA b() { return this.a.b(); }
/* 23 */   public Iterator iterator() { return b(); }
/* 24 */   public boolean removeAll(Collection<?> paramCollection) { synchronized (this.b) { return this.a.removeAll(paramCollection); }
/* 25 */      } public int hashCode() { synchronized (this.b) { return this.a.hashCode(); }
/* 26 */      } @Deprecated public int[] a(int[] paramArrayOfint) { return b(paramArrayOfint); } public boolean equals(Object paramObject) { 
/* 27 */     try { if (paramObject == this) return true;  } catch (v v) { throw a(null); }  synchronized (this.b) { return this.a.equals(paramObject); }
/*    */      }
/* 29 */   public boolean a(IntPredicate paramIntPredicate) { synchronized (this.b) { return this.a.a(paramIntPredicate); }
/* 30 */      } @Deprecated public Stream stream() { return this.a.stream(); } protected m6(n paramn) { this.a = Objects.<n>requireNonNull(paramn);
/*    */     this.b = this; }
/* 32 */   public boolean b(int paramInt) { synchronized (this.b) { return this.a.b(paramInt); }
/* 33 */      } public int[] a() { synchronized (this.b) { return this.a.a(); }
/* 34 */      } @Deprecated public boolean remove(Object paramObject) { synchronized (this.b) { return this.a.remove(paramObject); }
/* 35 */      } @Deprecated public boolean a(Integer paramInteger) { synchronized (this.b) { return this.a.a(paramInteger); }
/* 36 */      } public boolean c(int paramInt) { synchronized (this.b) { return this.a.c(paramInt); }
/*    */      }
/* 38 */   public IntStream a() { return this.a.a(); }
/* 39 */   public Object[] toArray() { synchronized (this.b) { return this.a.toArray(); }
/* 40 */      } public fK b() { return this.a.b(); }
/* 41 */   public int size() { synchronized (this.b) { return this.a.size(); }
/* 42 */      } public boolean isEmpty() { synchronized (this.b) { return this.a.isEmpty(); }
/* 43 */      } public int[] b(int[] paramArrayOfint) { synchronized (this.b) { return this.a.b(paramArrayOfint); }
/* 44 */      } public boolean b(n paramn) { synchronized (this.b) { return this.a.b(paramn); }
/* 45 */      } public boolean d(n paramn) { synchronized (this.b) { return this.a.d(paramn); }
/* 46 */      } @Deprecated public Stream parallelStream() { return this.a.parallelStream(); }
/* 47 */   public cA a() { return this.a.a(); } public Spliterator spliterator() {
/* 48 */     return b();
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\m6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */