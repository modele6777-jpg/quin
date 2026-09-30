package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ojb {
    public pjb a;
    public int b;
    public f46 c;
    public l26 d;
    public int e;
    public e79 f;
    public w79 g;

    public ojb(pjb pjbVar) {
        this.a = pjbVar;
    }

    public final boolean a() {
        if (this.a != null) {
            f46 f46Var = this.c;
            if (f46Var != null ? f46Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final eb7 b(Object obj) {
        eb7 eb7VarO;
        pjb pjbVar = this.a;
        return (pjbVar == null || (eb7VarO = pjbVar.o(this, obj)) == null) ? eb7.a : eb7VarO;
    }

    public final void c() {
        pjb pjbVar = this.a;
        if (pjbVar != null) {
            pjbVar.b();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
