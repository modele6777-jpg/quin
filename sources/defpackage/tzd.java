package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tzd implements xj5 {
    public final /* synthetic */ imb a;
    public final /* synthetic */ xj5 b;

    public tzd(imb imbVar, xj5 xj5Var) {
        this.a = imbVar;
        this.b = xj5Var;
    }

    @Override // defpackage.xj5
    public final /* bridge */ /* synthetic */ Object a(Object obj, xn2 xn2Var) {
        return b(((Number) obj).intValue(), xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i, xn2 xn2Var) {
        szd szdVar;
        if (xn2Var instanceof szd) {
            szdVar = (szd) xn2Var;
            int i2 = szdVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                szdVar.label = i2 - Integer.MIN_VALUE;
            } else {
                szdVar = new szd(this, xn2Var);
            }
        } else {
            szdVar = new szd(this, xn2Var);
        }
        Object obj = szdVar.result;
        int i3 = szdVar.label;
        wef wefVar = wef.a;
        if (i3 != 0) {
            if (i3 == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (i > 0) {
            imb imbVar = this.a;
            if (!imbVar.element) {
                imbVar.element = true;
                szdVar.I$0 = i;
                szdVar.label = 1;
                Object objA = this.b.a(led.a, szdVar);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            }
        }
        return wefVar;
    }
}
