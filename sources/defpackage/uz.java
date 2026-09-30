package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uz {
    public final y6f a;
    public final Object b;
    public final long c;
    public final x16 d;
    public final vz9 e;
    public b00 f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final vz9 i = q1c.f(Boolean.TRUE);

    public uz(Object obj, y6f y6fVar, b00 b00Var, long j, Object obj2, long j2, x16 x16Var) {
        this.a = y6fVar;
        this.b = obj2;
        this.c = j2;
        this.d = x16Var;
        this.e = q1c.f(obj);
        this.f = y41.g(b00Var);
        this.g = j;
    }

    public final void a() {
        this.i.setValue(Boolean.FALSE);
        this.d.invoke();
    }

    public final Object b() {
        return this.a.b.d(this.f);
    }
}
