package defpackage;

import ai.askquin.model.reviewreward.ReviewRewardState;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q2c {
    public final ReviewRewardState a;

    public q2c(ReviewRewardState reviewRewardState) {
        reviewRewardState.getClass();
        this.a = reviewRewardState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2c) && pa7.t(this.a, ((q2c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Reserved(state=" + this.a + ")";
    }
}
