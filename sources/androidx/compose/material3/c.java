package androidx.compose.material3;

import defpackage.faf;
import defpackage.g5c;
import defpackage.m77;
import defpackage.r17;
import defpackage.rv3;
import defpackage.ub3;
import defpackage.y72;
import defpackage.yi4;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements r17 {
    public final boolean a;
    public final float b;
    public final long c;

    public c(boolean z, float f, long j) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.r17
    public final rv3 a(m77 m77Var) {
        return new DelegatingThemeAwareRippleNode(m77Var, this.a, this.b, new g5c(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a != cVar.a || !yi4.b(this.b, cVar.b)) {
            return false;
        }
        long j = cVar.c;
        int i = y72.l;
        return faf.a(this.c, j);
    }

    @Override // defpackage.r17
    public final int hashCode() {
        int iA = ub3.a(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = y72.l;
        return Long.hashCode(this.c) + iA;
    }
}
