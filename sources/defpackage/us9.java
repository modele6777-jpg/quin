package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class us9 extends vs9 {
    public final v6c a;
    public final zt b;

    public us9(v6c v6cVar) {
        zt ztVarA;
        this.a = v6cVar;
        if (w6c.o(v6cVar)) {
            ztVarA = null;
        } else {
            ztVarA = cu.a();
            zt.c(ztVarA, v6cVar);
        }
        this.b = ztVarA;
    }

    @Override // defpackage.vs9
    public final hkb a() {
        v6c v6cVar = this.a;
        return new hkb(v6cVar.a, v6cVar.b, v6cVar.c, v6cVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof us9) {
            return this.a.equals(((us9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
