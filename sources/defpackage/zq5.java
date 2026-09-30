package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zq5 {
    public final List a;

    public zq5(yq5... yq5VarArr) {
        if (yq5VarArr.length <= 0) {
            this.a = qd0.G0(yq5VarArr);
        } else {
            yq5 yq5Var = yq5VarArr[0];
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zq5) {
            return this.a.equals(((zq5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ib8.k("Settings(settings=", ")", this.a);
    }
}
