package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e1b {
    public final b1b a;
    public final boolean b;
    public final yrd c;
    public final a26 d;
    public final boolean e;
    public final Object f;
    public boolean g = true;

    public e1b(b1b b1bVar, Object obj, boolean z, yrd yrdVar, a26 a26Var, boolean z2) {
        this.a = b1bVar;
        this.b = z;
        this.c = yrdVar;
        this.d = a26Var;
        this.e = z2;
        this.f = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        wf2.b("Unexpected form of a provided value");
        oo3.f();
        return null;
    }
}
