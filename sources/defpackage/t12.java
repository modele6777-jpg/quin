package defpackage;

import ai.askquin.ui.conversation.dialogue.ClarifyingCardState;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t12 {
    public final ht8 a;
    public final ft8 b;
    public final gt8 c;
    public final ClarifyingCardState d;

    public t12(ht8 ht8Var, ft8 ft8Var, gt8 gt8Var, ClarifyingCardState clarifyingCardState) {
        clarifyingCardState.getClass();
        this.a = ht8Var;
        this.b = ft8Var;
        this.c = gt8Var;
        this.d = clarifyingCardState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t12)) {
            return false;
        }
        t12 t12Var = (t12) obj;
        return this.a.equals(t12Var.a) && pa7.t(this.b, t12Var.b) && pa7.t(this.c, t12Var.c) && this.d == t12Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ft8 ft8Var = this.b;
        int iHashCode2 = (iHashCode + (ft8Var == null ? 0 : ft8Var.hashCode())) * 31;
        gt8 gt8Var = this.c;
        return this.d.hashCode() + ((iHashCode2 + (gt8Var != null ? gt8Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClarifyingCardProjection(request=" + this.a + ", draw=" + this.b + ", interpretation=" + this.c + ", state=" + this.d + ")";
    }
}
