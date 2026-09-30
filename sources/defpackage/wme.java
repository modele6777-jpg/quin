package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwme;", "Ls09;", "Lzme;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class wme extends s09 {
    public final l26 a;

    public wme(l26 l26Var) {
        this.a = l26Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new zme(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wme) {
            return this.a == ((wme) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        l26 l26Var = this.a;
        if (l26Var != null) {
            return l26Var.hashCode();
        }
        return 0;
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ((zme) i09Var).F0 = this.a;
    }
}
