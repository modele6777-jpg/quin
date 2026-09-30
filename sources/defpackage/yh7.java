package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yh7 extends yi7 {
    public final boolean a;
    public final nyc b;
    public final String c;

    public yh7(Object obj, boolean z, nyc nycVar) {
        obj.getClass();
        this.a = z;
        this.b = nycVar;
        this.c = obj.toString();
        if (nycVar == null || nycVar.isInline()) {
            return;
        }
        qc0.j("Failed requirement.");
        throw null;
    }

    @Override // defpackage.yi7
    public final String c() {
        return this.c;
    }

    @Override // defpackage.yi7
    public final boolean d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yh7.class != obj.getClass()) {
            return false;
        }
        yh7 yh7Var = (yh7) obj;
        return this.a == yh7Var.a && pa7.t(this.c, yh7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.yi7
    public final String toString() {
        boolean z = this.a;
        String str = this.c;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        n4e.a(str, sb);
        return sb.toString();
    }
}
