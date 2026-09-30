package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wk8 extends ewf {
    public final s0e b;
    public final s0e c;

    public wk8() {
        hs3 hs3Var = xqa.r;
        nu7 nu7Var = new nu7(hs3Var.a, hs3Var.b, null);
        nu4 nu4Var = nu4.a;
        int iIntValue = ((Number) z5c.I(nu4Var, nu7Var)).intValue();
        hs3 hs3Var2 = xqa.p;
        boolean zBooleanValue = ((Boolean) z5c.I(nu4Var, new ou7(hs3Var2.a, hs3Var2.b, null))).booleanValue();
        hs3 hs3Var3 = xqa.o;
        boolean zBooleanValue2 = ((Boolean) z5c.I(nu4Var, new pu7(hs3Var3.a, hs3Var3.b, null))).booleanValue();
        hs3 hs3Var4 = xqa.A;
        this.b = t0e.a(new ru7(iIntValue, zBooleanValue, zBooleanValue2, !v4e.Q((CharSequence) z5c.I(nu4Var, new qu7(hs3Var4.a, hs3Var4.b, null)))));
        this.c = t0e.a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(int i, zn2 zn2Var) {
        vk8 vk8Var;
        s0e s0eVar;
        Object value;
        if (zn2Var instanceof vk8) {
            vk8Var = (vk8) zn2Var;
            int i2 = vk8Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vk8Var.label = i2 - Integer.MIN_VALUE;
            } else {
                vk8Var = new vk8(this, zn2Var);
            }
        } else {
            vk8Var = new vk8(this, zn2Var);
        }
        Object obj = vk8Var.result;
        int i3 = vk8Var.label;
        if (i3 == 0) {
            jzb.q(obj);
            hs3 hs3Var = xqa.r;
            Integer num = new Integer(i);
            isa isaVar = hs3Var.a;
            vk8Var.L$0 = null;
            vk8Var.L$1 = null;
            vk8Var.I$0 = i;
            vk8Var.label = 1;
            Object objN = bsa.n(isaVar, num, vk8Var);
            bw2 bw2Var = bw2.a;
            if (objN == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = vk8Var.I$0;
            jzb.q(obj);
        }
        do {
            s0eVar = this.b;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, ru7.a((ru7) value, i, false, 14)));
        return wef.a;
    }
}
