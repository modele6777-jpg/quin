package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k5d implements wm2 {
    public final String a;
    public final int b;
    public final kx c;
    public final boolean d;

    public k5d(String str, int i, kx kxVar, boolean z) {
        this.a = str;
        this.b = i;
        this.c = kxVar;
        this.d = z;
    }

    @Override // defpackage.wm2
    public final zl2 a(oi8 oi8Var, uh8 uh8Var, eu0 eu0Var) {
        return new y4d(oi8Var, eu0Var, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.a);
        sb.append(", index=");
        return tec.n(sb, this.b, '}');
    }
}
