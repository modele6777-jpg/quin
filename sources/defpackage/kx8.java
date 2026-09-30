package defpackage;

import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kx8 implements mx8 {
    public final MixedDeckSnapshot a;

    static {
        ix8 ix8Var = MixedDeckSnapshot.Companion;
    }

    public kx8(MixedDeckSnapshot mixedDeckSnapshot) {
        this.a = mixedDeckSnapshot;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kx8) && this.a.equals(((kx8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Ready(snapshot=" + this.a + ")";
    }
}
