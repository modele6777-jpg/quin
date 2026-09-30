package defpackage;

import tech.chatmind.api.events.model.PopupTracking;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class to2 implements x16 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ wua b;
    public final /* synthetic */ mma c;
    public final /* synthetic */ e89 d;

    public /* synthetic */ to2(mma mmaVar, wua wuaVar, e89 e89Var) {
        this.c = mmaVar;
        this.b = wuaVar;
        this.d = e89Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        boolean z;
        Long lValueOf;
        switch (this.a) {
            case 0:
                mma mmaVar = this.c;
                wua wuaVar = this.b;
                e89 e89Var = this.d;
                String strN = db6.N(wuaVar.b);
                ad1 ad1Var = new ad1(17, wuaVar, e89Var);
                String strD = jrb.d(mmaVar.v);
                if (strD != null) {
                    anf anfVar = new anf(strD, strN);
                    synchronized (mmaVar.S0) {
                        try {
                            Object value = mmaVar.F0.getValue();
                            wua wuaVar2 = value instanceof wua ? (wua) value : null;
                            z = pa7.t(wuaVar2 != null ? wuaVar2.a : null, strD) && db6.N(wuaVar2.b).equals(strN) && !pa7.t(mmaVar.m1, anfVar);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (z) {
                        inf infVar = mmaVar.y;
                        kf kfVar = new kf(mmaVar, ad1Var, strD, strN, anfVar, 20);
                        infVar.getClass();
                        cnf cnfVar = new cnf(strD, strN);
                        synchronized (infVar.a) {
                            if (infVar.e.contains(cnfVar) || infVar.c.containsKey(cnfVar)) {
                                lValueOf = null;
                            } else {
                                long j = infVar.f + 1;
                                infVar.f = j;
                                infVar.c.put(cnfVar, Long.valueOf(j));
                                infVar.e.add(cnfVar);
                                lValueOf = Long.valueOf(j);
                            }
                        }
                        kfVar.d(Boolean.valueOf(lValueOf != null));
                        if (lValueOf != null) {
                            qn2 qn2Var = lw2.a;
                            js3 js3Var = ga4.a;
                            ynb.V(qn2Var, hr3.c, null, new fnf(infVar, cnfVar, lValueOf, strN, null), 2);
                        }
                    }
                }
                return wef.a;
            default:
                wua wuaVar3 = this.b;
                mma mmaVar2 = this.c;
                if (((Boolean) this.d.getValue()).booleanValue()) {
                    PopupTracking tracking = wuaVar3.b.getPopup().getTracking();
                    rfc.q(rfc.r(tracking != null ? tracking.getClose() : null));
                    mmaVar2.G();
                }
                return wef.a;
        }
    }

    public /* synthetic */ to2(wua wuaVar, mma mmaVar, e89 e89Var) {
        this.b = wuaVar;
        this.c = mmaVar;
        this.d = e89Var;
    }
}
