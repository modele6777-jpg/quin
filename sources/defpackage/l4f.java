package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ll4f;", "Ls09;", "Lm4f;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class l4f extends s09 {
    public final yye a;
    public final t69 b;
    public final r17 c;
    public final boolean d;
    public final i5c e;
    public final x16 f;

    public l4f(yye yyeVar, t69 t69Var, r17 r17Var, boolean z, i5c i5cVar, x16 x16Var) {
        this.a = yyeVar;
        this.b = t69Var;
        this.c = r17Var;
        this.d = z;
        this.e = i5cVar;
        this.f = x16Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        m4f m4fVar = new m4f(this.b, this.c, false, this.d, null, this.e, this.f);
        m4fVar.b1 = this.a;
        return m4fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l4f.class != obj.getClass()) {
            return false;
        }
        l4f l4fVar = (l4f) obj;
        return this.a == l4fVar.a && pa7.t(this.b, l4fVar.b) && pa7.t(this.c, l4fVar.c) && this.d == l4fVar.d && this.e.equals(l4fVar.e) && this.f == l4fVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        t69 t69Var = this.b;
        int iHashCode2 = (iHashCode + (t69Var != null ? t69Var.hashCode() : 0)) * 31;
        r17 r17Var = this.c;
        return this.f.hashCode() + ub3.b(this.e.a, ub3.d(ub3.d((iHashCode2 + (r17Var != null ? r17Var.hashCode() : 0)) * 31, 31, false), 31, this.d), 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        m4f m4fVar = (m4f) i09Var;
        yye yyeVar = m4fVar.b1;
        yye yyeVar2 = this.a;
        if (yyeVar != yyeVar2) {
            m4fVar.b1 = yyeVar2;
            scc.k(m4fVar);
        }
        m4fVar.B1(this.b, this.c, false, this.d, null, this.e, this.f);
    }
}
