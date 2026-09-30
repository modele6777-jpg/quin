package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dn6 extends gbe implements l26 {
    final /* synthetic */ h0e $currentSuppressAutomaticPopups$delegate;
    final /* synthetic */ x48 $lifecycleOwner;
    final /* synthetic */ mma $popupManager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn6(x48 x48Var, mma mmaVar, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$lifecycleOwner = x48Var;
        this.$popupManager = mmaVar;
        this.$currentSuppressAutomaticPopups$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dn6(this.$lifecycleOwner, this.$popupManager, this.$currentSuppressAutomaticPopups$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        bw2 bw2Var = bw2.a;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            jzb.q(obj);
            this.label = 1;
            if (scc.n(this) == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        if (!((Boolean) this.$currentSuppressAutomaticPopups$delegate.getValue()).booleanValue() && ((a58) this.$lifecycleOwner.k()).i.compareTo(g48.e) >= 0) {
            mma mmaVar = this.$popupManager;
            mmaVar.f();
            boolean zN = mmaVar.N();
            synchronized (mmaVar.S0) {
                try {
                    mmaVar.t();
                    mmaVar.g1 = Boolean.TRUE;
                    if (((Boolean) mmaVar.P0.getValue()).booleanValue() || mmaVar.a1) {
                        tq.d().R(wef.a);
                    } else {
                        jr5 jr5Var = mmaVar.Y0;
                        if (jr5Var == jr5.b) {
                            jr5Var = jr5.c;
                            mmaVar.Y0 = jr5Var;
                        }
                        if (zN || !mmaVar.Z0) {
                            if (jr5Var != jr5.c) {
                                z = false;
                            }
                            if (z) {
                                mmaVar.Y0 = jr5.a;
                            }
                            mma.m(mmaVar, z, 6);
                        } else {
                            mmaVar.Z0 = false;
                            mmaVar.Y0 = jr5.a;
                            if (mmaVar.U0 == null) {
                                tq.d().R(wef.a);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((dn6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
