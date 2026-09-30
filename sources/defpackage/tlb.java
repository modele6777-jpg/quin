package defpackage;

import tech.chatmind.api.RedeemResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tlb implements rlb {
    public final o9 a;
    public final rw5 b;
    public final v40 c;

    static {
        int i = v40.c;
        int i2 = rw5.f;
        int i3 = o9.z;
    }

    public tlb(o9 o9Var, rw5 rw5Var, v40 v40Var) {
        this.a = o9Var;
        this.b = rw5Var;
        this.c = v40Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(RedeemResponse redeemResponse, zn2 zn2Var) {
        slb slbVar;
        if (zn2Var instanceof slb) {
            slbVar = (slb) zn2Var;
            int i = slbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                slbVar.label = i - Integer.MIN_VALUE;
            } else {
                slbVar = new slb(this, zn2Var);
            }
        } else {
            slbVar = new slb(this, zn2Var);
        }
        Object obj = slbVar.result;
        int i2 = slbVar.label;
        wef wefVar = wef.a;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return wefVar;
        }
        jzb.q(obj);
        String benefitType = redeemResponse.getBenefitType();
        boolean zT = pa7.t(benefitType, "tarot");
        bw2 bw2Var = bw2.a;
        if (zT) {
            slbVar.L$0 = null;
            slbVar.label = 1;
            if (this.a.b(s7.a(), true, slbVar) == bw2Var) {
                return bw2Var;
            }
            return wefVar;
        }
        if (pa7.t(benefitType, "spread")) {
            String spreadId = redeemResponse.getSpreadId();
            if (s72.o0(jlb.a, spreadId)) {
                slbVar.L$0 = null;
                slbVar.label = 2;
                int i3 = rw5.f;
                mic.a.getClass();
                if (this.b.b(rmc.c(mic.b), slbVar) == bw2Var) {
                    return bw2Var;
                }
            } else if (pa7.t(spreadId, "yearly-2026")) {
                slbVar.L$0 = null;
                slbVar.label = 3;
                if (this.c.a(slbVar) == bw2Var) {
                    return bw2Var;
                }
            }
        }
        return wefVar;
    }
}
