package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La0a;", "Ls09;", "Lb0a;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class a0a extends s09 {
    public final h0e a;
    public final h0e b;

    public a0a(sz9 sz9Var, sz9 sz9Var2, int i) {
        sz9Var = (i & 2) != 0 ? null : sz9Var;
        sz9Var2 = (i & 4) != 0 ? null : sz9Var2;
        this.a = sz9Var;
        this.b = sz9Var2;
    }

    @Override // defpackage.s09
    public final i09 create() {
        b0a b0aVar = new b0a();
        b0aVar.Z = 1.0f;
        b0aVar.E0 = this.a;
        b0aVar.F0 = this.b;
        return b0aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0a)) {
            return false;
        }
        a0a a0aVar = (a0a) obj;
        return pa7.t(this.a, a0aVar.a) && pa7.t(this.b, a0aVar.b);
    }

    public final int hashCode() {
        h0e h0eVar = this.a;
        int iHashCode = (h0eVar != null ? h0eVar.hashCode() : 0) * 31;
        h0e h0eVar2 = this.b;
        return Float.hashCode(1.0f) + ((iHashCode + (h0eVar2 != null ? h0eVar2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        b0a b0aVar = (b0a) i09Var;
        b0aVar.Z = 1.0f;
        b0aVar.E0 = this.a;
        b0aVar.F0 = this.b;
    }
}
