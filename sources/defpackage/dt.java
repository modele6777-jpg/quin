package defpackage;

import android.view.Surface;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dt implements fo1 {
    public final d3e a;

    public dt(d3e d3eVar, qwe qweVar) {
        qweVar.getClass();
        this.a = d3eVar;
    }

    @Override // defpackage.fo1
    public final eo1 a(lf1 lf1Var, Map map, qo1 qo1Var) throws Exception {
        qo1Var.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((Surface) ((Map.Entry) it.next()).getValue());
        }
        if (lf1Var.U0(arrayList, qo1Var)) {
            return new do1(qu4.a, k99.u(map, this.a));
        }
        b1.l("CXCP", "Failed to create ConstrainedHighSpeedCaptureSession from " + lf1Var + " for " + qo1Var + '!');
        qo1Var.a();
        return qk6.g;
    }
}
