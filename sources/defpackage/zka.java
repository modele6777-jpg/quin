package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zka implements xj5 {
    public final /* synthetic */ xj5 a;

    public zka(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        yka ykaVar;
        if (xn2Var instanceof yka) {
            ykaVar = (yka) xn2Var;
            int i = ykaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ykaVar.label = i - Integer.MIN_VALUE;
            } else {
                ykaVar = new yka(this, xn2Var);
            }
        } else {
            ykaVar = new yka(this, xn2Var);
        }
        Object obj2 = ykaVar.result;
        int i2 = ykaVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            List list = ((lb8) obj).b;
            ykaVar.L$0 = null;
            ykaVar.L$1 = null;
            ykaVar.L$2 = null;
            ykaVar.L$3 = null;
            ykaVar.label = 1;
            Object objA = this.a.a(list, ykaVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
