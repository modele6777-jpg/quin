package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o89 extends s3f {
    public final vz9 b;
    public final vz9 c;

    public o89(Object obj) {
        this.b = q1c.f(obj);
        this.c = q1c.f(obj);
    }

    @Override // defpackage.s3f
    public final Object a() {
        return this.b.getValue();
    }

    @Override // defpackage.s3f
    public final Object b() {
        return this.c.getValue();
    }

    @Override // defpackage.s3f
    public final void c(Object obj) {
        this.b.setValue(obj);
    }

    public final void f(Boolean bool) {
        this.c.setValue(bool);
    }

    @Override // defpackage.s3f
    public final void e() {
    }

    @Override // defpackage.s3f
    public final void d(n3f n3fVar) {
    }
}
