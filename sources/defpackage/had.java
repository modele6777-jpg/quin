package defpackage;

import ai.askquin.ui.share.SharedDivination;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class had implements iad {
    public final SharedDivination a;

    static {
        dcd dcdVar = SharedDivination.Companion;
    }

    public had(SharedDivination sharedDivination) {
        sharedDivination.getClass();
        this.a = sharedDivination;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof had) && pa7.t(this.a, ((had) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Reading(divination=" + this.a + ")";
    }
}
