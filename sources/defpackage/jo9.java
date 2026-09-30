package defpackage;

import ai.askquin.ui.onboard.OnboardAuthRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jo9 extends gbe implements l26 {
    final /* synthetic */ OnboardAuthRoute $route;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo9(OnboardAuthRoute onboardAuthRoute, xn2 xn2Var) {
        super(2, xn2Var);
        this.$route = onboardAuthRoute;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jo9(this.$route, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$route.getAfterFirstReading()) {
            tj7 tj7Var = tj7.L0;
            ca2.a.getClass();
            if (ca2.c) {
                x1f x1fVar = x1f.a;
                x1f.k(new r05("registration_view"), tj7Var, 2);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        jo9 jo9Var = (jo9) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        jo9Var.r(wefVar);
        return wefVar;
    }
}
