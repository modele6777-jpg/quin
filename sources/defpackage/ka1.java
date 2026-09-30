package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ka1 extends dw1 {
    public final l26 f;

    public ka1(l26 l26Var, pv2 pv2Var, int i, i41 i41Var) {
        super(l26Var, pv2Var, i, i41Var, 0);
        this.f = l26Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.dw1, defpackage.cw1
    public final Object f(awa awaVar, xn2 xn2Var) {
        ja1 ja1Var;
        if (xn2Var instanceof ja1) {
            ja1Var = (ja1) xn2Var;
            int i = ja1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ja1Var.label = i - Integer.MIN_VALUE;
            } else {
                ja1Var = new ja1(this, (zn2) xn2Var);
            }
        } else {
            ja1Var = new ja1(this, (zn2) xn2Var);
        }
        Object obj = ja1Var.result;
        int i2 = ja1Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            ja1Var.L$0 = awaVar;
            ja1Var.label = 1;
            Object objF = super.f(awaVar, ja1Var);
            Object obj2 = bw2.a;
            if (objF == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            awaVar = (awa) ja1Var.L$0;
            jzb.q(obj);
        }
        if (((zva) awaVar).e.A()) {
            return wef.a;
        }
        qc0.p("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // defpackage.dw1, defpackage.cw1
    public final cw1 g(pv2 pv2Var, int i, i41 i41Var) {
        return new ka1(this.f, pv2Var, i, i41Var);
    }
}
