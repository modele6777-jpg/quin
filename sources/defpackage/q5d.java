package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q5d implements wm2 {
    public final int a;
    public final lx b;
    public final lx c;
    public final lx d;
    public final boolean e;

    public q5d(String str, int i, lx lxVar, lx lxVar2, lx lxVar3, boolean z) {
        this.a = i;
        this.b = lxVar;
        this.c = lxVar2;
        this.d = lxVar3;
        this.e = z;
    }

    @Override // defpackage.wm2
    public final zl2 a(oi8 oi8Var, uh8 uh8Var, eu0 eu0Var) {
        return new k5f(eu0Var, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
