package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e0h implements Cloneable {
    public final l0h a;
    public l0h b;

    public e0h(l0h l0hVar) {
        this.a = l0hVar;
        if (l0hVar.h()) {
            qc0.j("Default instance must be immutable.");
            throw null;
        }
        this.b = l0hVar.n();
    }

    public final l0h a() {
        boolean zH = this.b.h();
        l0h l0hVar = this.b;
        if (zH) {
            l0hVar.getClass();
            i3h.b.a(l0hVar.getClass()).b(l0hVar);
            l0hVar.e();
            l0hVar = this.b;
        }
        l0hVar.getClass();
        if (l0h.i(l0hVar, true)) {
            return l0hVar;
        }
        throw new k4h();
    }

    public final void b() {
        if (this.b.h()) {
            return;
        }
        l0h l0hVarN = this.a.n();
        i3h.b.a(l0hVarN.getClass()).h(l0hVarN, this.b);
        this.b = l0hVarN;
    }

    public final Object clone() {
        e0h e0hVar = (e0h) this.a.j(5);
        boolean zH = this.b.h();
        l0h l0hVar = this.b;
        if (zH) {
            l0hVar.getClass();
            i3h.b.a(l0hVar.getClass()).b(l0hVar);
            l0hVar.e();
            l0hVar = this.b;
        }
        e0hVar.b = l0hVar;
        return e0hVar;
    }
}
