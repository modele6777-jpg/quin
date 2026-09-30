package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ye6 implements ze6 {
    public final int a;

    public ye6(int i) {
        this.a = i;
        if (i > 0) {
            return;
        }
        l37.a("Provided count should be larger than zero");
    }

    @Override // defpackage.ze6
    public final ArrayList a(sw3 sw3Var, int i, int i2) {
        return an1.l(i, this.a, i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ye6) {
            return this.a == ((ye6) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.a;
    }
}
