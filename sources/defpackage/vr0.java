package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vr0 {
    public static final List b = t72.I(new vr0(0), new vr0(1), new vr0(6), new vr0(5), new vr0(2), new vr0(3), new vr0(8), new vr0(7));
    public final int a;

    public /* synthetic */ vr0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vr0) {
            return this.a == ((vr0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return tec.k("AwbMode(value=", this.a, ')');
    }
}
