package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mj1 extends gbe implements l26 {
    final /* synthetic */ kp $cameraState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj1(kp kpVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$cameraState = kpVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mj1(this.$cameraState, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            s0e s0eVar = this.$cameraState.u;
            lj1 lj1Var = new lj1(2, null);
            this.label = 1;
            obj = tm7.C(s0eVar, lj1Var, this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        yi1 yi1Var = (yi1) obj;
        if (yi1Var instanceof dj1) {
            return new eq9(this.$cameraState, null, 2);
        }
        if (yi1Var instanceof cj1) {
            this.$cameraState.a();
            return new eq9(null, ((cj1) yi1Var).a, 1);
        }
        if (yi1Var instanceof bj1) {
            this.$cameraState.a();
            return new eq9(null, ((bj1) yi1Var).i, 1);
        }
        if (!(yi1Var instanceof qj1)) {
            ap.c();
            return null;
        }
        this.$cameraState.a();
        yg5.r(yi1Var, "Unexpected CameraState: ");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mj1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
