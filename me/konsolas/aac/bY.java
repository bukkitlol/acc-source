/*  1 */ package me.konsolas.aac;public class by extends bS implements Serializable, Cloneable { private static final long serialVersionUID = -7046029254386353129L; public boolean addAll(Collection paramCollection) { throw new UnsupportedOperationException(); } protected final Object b; public void forEach(Consumer<Object> paramConsumer) {
/*    */     paramConsumer.accept(this.b);
/*    */   } public boolean remove(Object paramObject) {
/*    */     throw new UnsupportedOperationException();
/*    */   } public boolean removeIf(Predicate paramPredicate) {
/*    */     throw new UnsupportedOperationException();
/*    */   } public boolean removeAll(Collection paramCollection) {
/*    */     throw new UnsupportedOperationException();
/*    */   } protected by(Object paramObject) {
/* 10 */     this.b = paramObject; } public Iterator iterator() { return a(); } public ea b() { return a(); } public ae a() { return dK.a(this.b); }
/* 11 */   public i0 a() { return fq.a(this.b); }
/* 12 */   public Object clone() { return this; }
/* 13 */   public boolean retainAll(Collection paramCollection) { throw new UnsupportedOperationException(); } public boolean contains(Object paramObject) {
/* 14 */     return Objects.equals(paramObject, this.b);
/*    */   }
/* 16 */   public Spliterator spliterator() { return a(); }
/* 17 */   public Object[] toArray() { return new Object[] { this.b }; } public int size() {
/* 18 */     return 1;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\by.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */