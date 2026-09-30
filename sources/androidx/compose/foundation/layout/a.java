package androidx.compose.foundation.layout;

import defpackage.gld;
import defpackage.i09;
import defpackage.s09;
import defpackage.ub3;
import defpackage.yi4;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/a;", "Ls09;", "Lgld;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class a extends s09 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public a(float f, float f2, float f3, float f4, int i, boolean z) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
    }

    @Override // defpackage.s09
    public final i09 create() {
        gld gldVar = new gld();
        gldVar.Z = this.a;
        gldVar.E0 = this.b;
        gldVar.F0 = this.c;
        gldVar.G0 = this.d;
        gldVar.H0 = this.e;
        return gldVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return yi4.b(this.a, aVar.a) && yi4.b(this.b, aVar.b) && yi4.b(this.c, aVar.c) && yi4.b(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ub3.a(this.d, ub3.a(this.c, ub3.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        gld gldVar = (gld) i09Var;
        gldVar.Z = this.a;
        gldVar.E0 = this.b;
        gldVar.F0 = this.c;
        gldVar.G0 = this.d;
        gldVar.H0 = this.e;
    }

    public a(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }
}
