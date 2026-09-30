package defpackage;

import ai.askquin.data.InAppMessageUiModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nz6 implements xj5 {
    public final /* synthetic */ xj5 a;

    public nz6(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        mz6 mz6Var;
        if (xn2Var instanceof mz6) {
            mz6Var = (mz6) xn2Var;
            int i = mz6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mz6Var.label = i - Integer.MIN_VALUE;
            } else {
                mz6Var = new mz6(this, xn2Var);
            }
        } else {
            mz6Var = new mz6(this, xn2Var);
        }
        Object obj2 = mz6Var.result;
        int i2 = mz6Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            List<dz6> list = (List) obj;
            ArrayList arrayList = new ArrayList(t72.u(list, 10));
            for (dz6 dz6Var : list) {
                arrayList.add(new InAppMessageUiModel(dz6Var.a, dz6Var.b, dz6Var.c, dz6Var.d, dz6Var.e, dz6Var.f, dz6Var.g, dz6Var.h, dz6Var.i, dz6Var.j, dz6Var.k));
            }
            mz6Var.L$0 = null;
            mz6Var.L$1 = null;
            mz6Var.L$2 = null;
            mz6Var.L$3 = null;
            mz6Var.label = 1;
            Object objA = this.a.a(arrayList, mz6Var);
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
