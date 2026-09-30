package androidx.compose.foundation.layout;

import defpackage.hcg;
import defpackage.i09;
import defpackage.j94;
import defpackage.l26;
import defpackage.pa7;
import defpackage.s09;
import defpackage.ub3;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/d;", "Ls09;", "Lhcg;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class d extends s09 {
    public final j94 a;
    public final boolean b;
    public final l26 c;
    public final Object d;

    public d(j94 j94Var, boolean z, l26 l26Var, Object obj) {
        this.a = j94Var;
        this.b = z;
        this.c = l26Var;
        this.d = obj;
    }

    @Override // defpackage.s09
    public final i09 create() {
        hcg hcgVar = new hcg();
        hcgVar.Z = this.a;
        hcgVar.E0 = this.b;
        hcgVar.F0 = this.c;
        return hcgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b && pa7.t(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ub3.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        hcg hcgVar = (hcg) i09Var;
        hcgVar.Z = this.a;
        hcgVar.E0 = this.b;
        hcgVar.F0 = this.c;
    }
}
