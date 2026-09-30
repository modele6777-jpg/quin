package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ud4 implements xd4 {
    public final zc4 a;

    public ud4(zc4 zc4Var) {
        zc4Var.getClass();
        this.a = zc4Var;
    }

    @Override // defpackage.xd4
    public final List a() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ud4) && pa7.t(this.a, ((ud4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Analysis(analysis=" + this.a + ")";
    }
}
