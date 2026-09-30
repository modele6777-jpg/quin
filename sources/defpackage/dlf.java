package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dlf extends gbe implements l26 {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ qmf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlf(qmf qmfVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = qmfVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        dlf dlfVar = new dlf(this.this$0, xn2Var);
        dlfVar.L$0 = obj;
        return dlfVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if8 if8Var;
        zve zveVar;
        iy9 iy9Var = (iy9) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if8Var = (if8) iy9Var.a();
            zveVar = (zve) iy9Var.b();
            zveVar.getClass();
            Throwable th = zveVar.b;
            if (th != null) {
                js3 js3Var = ga4.a;
                wg6 wg6Var = mk8.a.f;
                cmf cmfVar = new cmf(null, th);
                this.L$0 = null;
                this.L$1 = if8Var;
                this.L$2 = zveVar;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 1;
                Object objP0 = ynb.p0(wg6Var, cmfVar, this);
                bw2 bw2Var = bw2.a;
                if (objP0 == bw2Var) {
                    return bw2Var;
                }
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zveVar = (zve) this.L$2;
            if8Var = (if8) this.L$1;
            jzb.q(obj);
        }
        String str = zveVar.a;
        if (str != null) {
            qmf qmfVar = this.this$0;
            int iOrdinal = if8Var.ordinal();
            if (iOrdinal == 0) {
                qmfVar.getClass();
                m8b m8bVarD = qmfVar.d();
                ": ".concat(str);
                m8bVarD.e("onSignInWithGoogle".concat(""));
                ynb.V(hwf.a(qmfVar), null, null, new ulf(qmfVar, str, null), 3);
            } else if (iOrdinal == 1) {
                qmfVar.getClass();
                m8b m8bVarD2 = qmfVar.d();
                ": ".concat(str);
                m8bVarD2.e("onSignInWithWeChat".concat(""));
                ynb.V(hwf.a(qmfVar), null, null, new wlf(qmfVar, str, null), 3);
            } else {
                if (iOrdinal != 2) {
                    ap.c();
                    return null;
                }
                qmfVar.getClass();
                m8b m8bVarD3 = qmfVar.d();
                ": ".concat(str);
                m8bVarD3.e("onSignInWithOneLogin".concat(""));
                ynb.V(hwf.a(qmfVar), null, null, new vlf(qmfVar, str, null), 3);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((dlf) k((xn2) obj2, (iy9) obj)).r(wef.a);
    }
}
