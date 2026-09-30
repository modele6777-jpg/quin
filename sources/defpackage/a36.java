package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a36 extends ib6 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a36(ge8 ge8Var, i0 i0Var, int i) {
        super(ge8Var, i0Var);
        this.e = i;
    }

    @Override // defpackage.ib6
    public final List h() {
        int i = this.e;
        pu4 pu4Var = pu4.a;
        switch (i) {
            case 0:
                y26 y26Var = (y26) this.b;
                m36 m36Var = y26Var.g;
                if (pa7.t(m36Var, i36.d)) {
                    return t72.H(x57.K(y26Var, false));
                }
                return pa7.t(m36Var, l36.d) ? t72.H(x57.K(y26Var, true)) : pu4Var;
            default:
                return pu4Var;
        }
    }
}
