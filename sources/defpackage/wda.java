package defpackage;

import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wda implements xj5 {
    public final /* synthetic */ xj5 a;

    public wda(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        vda vdaVar;
        jg1 jg1VarV;
        if (xn2Var instanceof vda) {
            vdaVar = (vda) xn2Var;
            int i = vdaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vdaVar.label = i - Integer.MIN_VALUE;
            } else {
                vdaVar = new vda(this, xn2Var);
            }
        } else {
            vdaVar = new vda(this, xn2Var);
        }
        Object obj2 = vdaVar.result;
        int i2 = vdaVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                String str = ((ig1) it.next()).a;
                try {
                    jg1VarV = m93.v(str, null, null);
                } catch (Exception e) {
                    b1.n("PipePresenceSrc", "Failed to create CameraIdentifier for pipeId: " + str, e);
                    jg1VarV = null;
                }
                if (jg1VarV != null) {
                    arrayList.add(jg1VarV);
                }
            }
            vdaVar.label = 1;
            Object objA = this.a.a(arrayList, vdaVar);
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
