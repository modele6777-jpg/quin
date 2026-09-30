package defpackage;

import ai.askquin.model.reviewreward.ReviewRewardState;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r2c {
    public final ReviewRewardState a;

    public r2c(ReviewRewardState reviewRewardState) {
        this.a = reviewRewardState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2c) && this.a.equals(((r2c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Suppressed(state=" + this.a + ")";
    }
}
