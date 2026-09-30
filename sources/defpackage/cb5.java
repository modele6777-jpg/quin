package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cb5 extends gbe implements l26 {
    final /* synthetic */ zf1 $creationResult;
    int label;
    final /* synthetic */ db5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb5(db5 db5Var, zf1 zf1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = db5Var;
        this.$creationResult = zf1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new cb5(this.this$0, this.$creationResult, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Exception {
        vd1 vd1Var;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            hh1 hh1Var = this.this$0.b;
            uf1 uf1Var = this.$creationResult.a;
            this.label = 1;
            synchronized (hh1Var.c) {
                if (hh1Var.d) {
                    throw new IllegalStateException("Check failed.");
                }
                vd1Var = ((yd1) ((g1b) hh1Var.a.v).get()).d;
            }
            if (vd1Var == null) {
                qc0.p("Required value was null.");
                return null;
            }
            obj = ((nb1) vd1Var).a(uf1Var, this);
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        zf1 zf1Var = this.$creationResult;
        fi2 fi2Var = (fi2) obj;
        int i2 = fi2Var.a;
        if (b21.F(3, "CXCP")) {
            List list = zf1Var.a.b;
            ArrayList arrayList = new ArrayList(t72.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List<yt9> list2 = ((wj1) it.next()).a;
                ArrayList arrayList2 = new ArrayList(t72.u(list2, 10));
                for (yt9 yt9Var : list2) {
                    arrayList2.add("size=" + yt9Var.a + ", format=" + ((Object) y2e.b(yt9Var.b)) + ", dynamicRangeProfile" + yt9Var.e);
                }
                arrayList.add(arrayList2);
            }
            StringBuilder sb = new StringBuilder("FeatureCombinationQueryImpl#isSupported: result = ");
            sb.append((Object) (i2 == 1 ? "SUPPORTED" : i2 == 2 ? "UNSUPPORTED" : "UNKNOWN"));
            sb.append(" for sessionParameters = ");
            sb.append(zf1Var.a.g);
            sb.append(" and streams = ");
            sb.append(arrayList);
            Log.d("CXCP", sb.toString());
        }
        return Boolean.valueOf(fi2Var.a == 1);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((cb5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
