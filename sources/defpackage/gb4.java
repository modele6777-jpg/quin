package defpackage;

import ai.askquin.ui.conversation.FailReason;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gb4 implements ib4 {
    public final jd4 a;
    public final List b;
    public final boolean c;
    public final FailReason d;

    public gb4(jd4 jd4Var, List list, boolean z, FailReason failReason) {
        jd4Var.getClass();
        this.a = jd4Var;
        this.b = list;
        this.c = z;
        this.d = failReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb4)) {
            return false;
        }
        gb4 gb4Var = (gb4) obj;
        return pa7.t(this.a, gb4Var.a) && this.b.equals(gb4Var.b) && this.c == gb4Var.c && pa7.t(this.d, gb4Var.d);
    }

    public final int hashCode() {
        int iD = ub3.d(tec.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        FailReason failReason = this.d;
        return iD + (failReason == null ? 0 : failReason.hashCode());
    }

    public final String toString() {
        return "BeforeExplanation(state=" + this.a + ", messages=" + this.b + ", chatLoading=" + this.c + ", failedReason=" + this.d + ")";
    }
}
