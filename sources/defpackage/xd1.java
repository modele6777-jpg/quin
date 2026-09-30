package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xd1 extends gbe implements l26 {
    int label;
    final /* synthetic */ yd1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd1(yd1 yd1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = yd1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xd1(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        yd1 yd1Var = this.this$0;
        this.label = 1;
        yd1Var.getClass();
        Log.d("CXCP", "CameraBackends#shutdown");
        LinkedHashMap linkedHashMap = yd1Var.c;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            nb1 nb1Var = (nb1) ((vd1) ((Map.Entry) it.next()).getValue());
            nb1Var.getClass();
            Log.d("CXCP", "Camera2Backend#shutdownAsync");
            jgb.I(nb1Var.b.e, null);
            arrayList.add(ynb.y(nb1Var.a.a, null, new mb1(nb1Var, null), 3));
        }
        Object objX = pa7.X(arrayList, this);
        bw2 bw2Var = bw2.a;
        if (objX != bw2Var) {
            objX = wefVar;
        }
        return objX == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xd1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
