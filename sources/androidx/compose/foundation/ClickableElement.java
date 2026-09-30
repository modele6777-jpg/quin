package androidx.compose.foundation;

import defpackage.i09;
import defpackage.i5c;
import defpackage.pa7;
import defpackage.r17;
import defpackage.s09;
import defpackage.s42;
import defpackage.t69;
import defpackage.ub3;
import defpackage.x16;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Ls09;", "Ls42;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class ClickableElement extends s09 {
    public final t69 a;
    public final r17 b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final i5c f;
    public final x16 g;

    public ClickableElement(t69 t69Var, r17 r17Var, boolean z, boolean z2, String str, i5c i5cVar, x16 x16Var) {
        this.a = t69Var;
        this.b = r17Var;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = i5cVar;
        this.g = x16Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new s42(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return pa7.t(this.a, clickableElement.a) && pa7.t(this.b, clickableElement.b) && this.c == clickableElement.c && this.d == clickableElement.d && pa7.t(this.e, clickableElement.e) && pa7.t(this.f, clickableElement.f) && this.g == clickableElement.g;
    }

    public final int hashCode() {
        t69 t69Var = this.a;
        int iHashCode = (t69Var != null ? t69Var.hashCode() : 0) * 31;
        r17 r17Var = this.b;
        int iD = ub3.d(ub3.d((iHashCode + (r17Var != null ? r17Var.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode2 = (iD + (str != null ? str.hashCode() : 0)) * 31;
        i5c i5cVar = this.f;
        return this.g.hashCode() + ((iHashCode2 + (i5cVar != null ? Integer.hashCode(i5cVar.a) : 0)) * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ((s42) i09Var).B1(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
