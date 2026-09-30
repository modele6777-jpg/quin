package androidx.compose.foundation.layout;

import defpackage.fgf;
import defpackage.i09;
import defpackage.s09;
import defpackage.yi4;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/c;", "Ls09;", "Lfgf;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class c extends s09 {
    public final float a;
    public final float b;

    public c(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.s09
    public final i09 create() {
        fgf fgfVar = new fgf();
        fgfVar.Z = this.a;
        fgfVar.E0 = this.b;
        return fgfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return yi4.b(this.a, cVar.a) && yi4.b(this.b, cVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        fgf fgfVar = (fgf) i09Var;
        fgfVar.Z = this.a;
        fgfVar.E0 = this.b;
    }
}
