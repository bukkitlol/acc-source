/*  1 */ package me.konsolas.aac;class fx implements jM, Serializable { private static final long serialVersionUID = -7046029254386353129L; protected final jM b; protected final Object a; public boolean removeAll(Collection<?> paramCollection) { synchronized (this.a) { return this.b.removeAll(paramCollection); }
/*    */      }
/*    */   
/*  4 */   public ea b() { return this.b.b(); }
/*  5 */   public boolean addAll(Collection<? extends E> paramCollection) { synchronized (this.a) { return this.b.addAll(paramCollection); }  }
/*    */   public boolean remove(Object paramObject) { synchronized (this.a) { return this.b.remove(paramObject); }  }
/*    */   public boolean add(Object paramObject) { synchronized (this.a) { return this.b.add((E)paramObject); }  }
/*    */   public Iterator iterator() { return b(); }
/*  9 */   public Spliterator spliterator() { return a(); } public boolean containsAll(Collection<?> paramCollection) { synchronized (this.a) { return this.b.containsAll(paramCollection); }  } public boolean isEmpty() { synchronized (this.a) { return this.b.isEmpty(); }  } public void forEach(Consumer<? super E> paramConsumer) { synchronized (this.a) { this.b.forEach(paramConsumer); }  } protected fx(jM paramjM, Object paramObject) { this.b = Objects.<jM>requireNonNull(paramjM);
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
/* 24 */     this.a = paramObject; }
/* 25 */   public int size() { synchronized (this.a) { return this.b.size(); }  } public boolean removeIf(Predicate<? super E> paramPredicate) { synchronized (this.a) { return this.b.removeIf(paramPredicate); }  } public int hashCode() { synchronized (this.a) { return this.b.hashCode(); }  } private void writeObject(ObjectOutputStream paramObjectOutputStream) { synchronized (this.a) { paramObjectOutputStream.defaultWriteObject(); }  } public boolean equals(Object paramObject) { try { if (paramObject == this) return true;  } catch (v v) { throw b(null); }  synchronized (this.a) { return this.b.equals(paramObject); }  } protected fx(jM paramjM) { this.b = Objects.<jM>requireNonNull(paramjM); this.a = this; } public Stream parallelStream() { return this.b.parallelStream(); } public Stream stream() { return this.b.stream(); }
/* 26 */   public Object[] toArray() { synchronized (this.a) { return this.b.toArray(); }
/* 27 */      } public void clear() { synchronized (this.a) { this.b.clear(); }
/* 28 */      } public ae a() { return this.b.a(); }
/*    */   
/* 30 */   public boolean retainAll(Collection<?> paramCollection) { synchronized (this.a) { return this.b.retainAll(paramCollection); }
/* 31 */      } public boolean contains(Object paramObject) { synchronized (this.a) { return this.b.contains(paramObject); }
/* 32 */      } public Object[] toArray(Object[] paramArrayOfObject) { synchronized (this.a) { return this.b.toArray(paramArrayOfObject); }
/* 33 */      } public String toString() { synchronized (this.a) { return this.b.toString(); }
/*    */      }
/*    */ 
/*    */   
/*    */   private static v b(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\fx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */