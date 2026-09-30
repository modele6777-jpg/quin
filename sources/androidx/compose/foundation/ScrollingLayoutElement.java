package androidx.compose.foundation;

import defpackage.dhc;
import defpackage.ghc;
import defpackage.i09;
import defpackage.pa7;
import defpackage.s09;
import defpackage.ub3;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Ls09;", "Ldhc;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class ScrollingLayoutElement extends s09 {
    public final ghc a;
    public final boolean b;

    public ScrollingLayoutElement(ghc ghcVar, boolean z) {
        this.a = ghcVar;
        this.b = z;
    }

    @Override // defpackage.s09
    public final i09 create() {
        dhc dhcVar = new dhc();
        dhcVar.Z = this.a;
        dhcVar.E0 = this.b;
        return dhcVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return pa7.t(this.a, scrollingLayoutElement.a) && this.b == scrollingLayoutElement.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + ub3.d(this.a.hashCode() * 31, 31, false);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        dhc dhcVar = (dhc) i09Var;
        dhcVar.Z = this.a;
        dhcVar.E0 = this.b;
    }
}
