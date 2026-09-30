package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Ldl4;", "T", "Ls09;", "Lel4;", "material3"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
final class dl4<T> extends s09 {
    public final lo a;
    public final l26 b;

    public dl4(lo loVar, l26 l26Var) {
        this.a = loVar;
        this.b = l26Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        el4 el4Var = new el4();
        el4Var.Z = this.a;
        el4Var.E0 = this.b;
        el4Var.F0 = ks9.a;
        return el4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl4)) {
            return false;
        }
        dl4 dl4Var = (dl4) obj;
        return pa7.t(this.a, dl4Var.a) && this.b == dl4Var.b;
    }

    public final int hashCode() {
        return ks9.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        el4 el4Var = (el4) i09Var;
        el4Var.Z = this.a;
        el4Var.E0 = this.b;
        el4Var.F0 = ks9.a;
    }
}
