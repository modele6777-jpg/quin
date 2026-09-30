package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zse {
    public static final vea d = new vea(7, new mle(28), new ule(11));
    public final k00 a;
    public final long b;
    public final eue c;

    public zse(k00 k00Var, long j, eue eueVar) {
        eue eueVar2;
        this.a = k00Var;
        this.b = u3c.d(k00Var.b.length(), j);
        if (eueVar != null) {
            eueVar2 = new eue(u3c.d(k00Var.b.length(), eueVar.a));
        } else {
            eueVar2 = null;
        }
        this.c = eueVar2;
    }

    public static zse a(zse zseVar, k00 k00Var, long j, int i) {
        if ((i & 1) != 0) {
            k00Var = zseVar.a;
        }
        if ((i & 2) != 0) {
            j = zseVar.b;
        }
        eue eueVar = (i & 4) != 0 ? zseVar.c : null;
        zseVar.getClass();
        return new zse(k00Var, j, eueVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zse)) {
            return false;
        }
        zse zseVar = (zse) obj;
        return eue.c(this.b, zseVar.b) && pa7.t(this.c, zseVar.c) && pa7.t(this.a, zseVar.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = eue.c;
        int iB = ib8.b(iHashCode, 31, this.b);
        eue eueVar = this.c;
        return iB + (eueVar != null ? Long.hashCode(eueVar.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + eue.i(this.b) + ", composition=" + this.c + ")";
    }

    public zse(int i, long j, String str) {
        this(new k00((i & 1) != 0 ? "" : str), (i & 2) != 0 ? eue.b : j, (eue) null);
    }
}
