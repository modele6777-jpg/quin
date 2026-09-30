package defpackage;

import ai.askquin.ui.conversation.FailReason;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fp5 {
    public static gp5 c(String str, t68 t68Var) {
        return new gp5(t72.H(new jt8("qa-new-reading", "Should I change careers?", str, t68Var)), null, null, null, null, 510);
    }

    public static ht8 d(fp5 fp5Var, int i) {
        return new ht8((i & 1) != 0 ? "qa-extra-request" : "qa-extra-stale", "Career timing", (i & 2) == 0, null, null);
    }

    public final gp5 a() {
        return new gp5(t72.H(d(this, 3)), null, null, null, null, 510);
    }

    public final gp5 b(FailReason failReason) {
        return new gp5(t72.H(d(this, 3)), null, null, bm8.G(new iy9("qa-extra-request", failReason)), bm8.G(new iy9("qa-extra-request", new j6a(gp5.l, 12))), 126);
    }
}
