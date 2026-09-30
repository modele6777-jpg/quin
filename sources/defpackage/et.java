package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.view.Surface;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class et implements fo1 {
    public final /* synthetic */ int a;
    public final d3e b;
    public final uf1 c;

    public et(qwe qweVar, d3e d3eVar, uf1 uf1Var, int i) {
        this.a = i;
        qweVar.getClass();
        switch (i) {
            case 1:
                this.b = d3eVar;
                this.c = uf1Var;
                break;
            default:
                this.b = d3eVar;
                this.c = uf1Var;
                break;
        }
    }

    @Override // defpackage.fo1
    public final eo1 a(lf1 lf1Var, Map map, qo1 qo1Var) throws Exception {
        boolean zL;
        int i = this.a;
        qu4 qu4Var = qu4.a;
        d3e d3eVar = this.b;
        uf1 uf1Var = this.c;
        switch (i) {
            case 0:
                qk6 qk6Var = qk6.g;
                qo1Var.getClass();
                ArrayList arrayList = uf1Var.d;
                if (arrayList != null) {
                    yt9 yt9Var = (yt9) s72.X0(((r47) s72.X0(arrayList)).a.a);
                    InputConfiguration inputConfiguration = new InputConfiguration(yt9Var.a.getWidth(), yt9Var.a.getHeight(), yt9Var.b);
                    ArrayList arrayList2 = new ArrayList(map.size());
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList2.add((Surface) ((Map.Entry) it.next()).getValue());
                    }
                    if (!lf1Var.G(inputConfiguration, arrayList2, qo1Var)) {
                        b1.l("CXCP", "Failed to create reprocessable captures session from " + lf1Var + " for " + qo1Var + '!');
                        qo1Var.a();
                        return qk6Var;
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList(map.size());
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList3.add((Surface) ((Map.Entry) it2.next()).getValue());
                    }
                    if (!lf1Var.p0(arrayList3, qo1Var)) {
                        b1.l("CXCP", "Failed to create captures session from " + lf1Var + " for " + qo1Var + '!');
                        qo1Var.a();
                        return qk6Var;
                    }
                }
                return new do1(qu4Var, k99.u(map, d3eVar));
            default:
                qk6 qk6Var2 = qk6.g;
                qo1Var.getClass();
                mt9 mt9VarT = k99.t(uf1Var, d3eVar, map);
                ArrayList arrayList4 = mt9VarT.a;
                if (arrayList4.isEmpty()) {
                    b1.l("CXCP", "Failed to create OutputConfigurations for " + uf1Var);
                    qo1Var.a();
                    return qk6Var2;
                }
                ArrayList arrayList5 = uf1Var.d;
                if (arrayList5 == null) {
                    zL = lf1Var.u(arrayList4, qo1Var);
                } else {
                    yt9 yt9Var2 = (yt9) s72.X0(((r47) s72.X0(arrayList5)).a.a);
                    zL = lf1Var.l(new f47(yt9Var2.a.getWidth(), yt9Var2.a.getHeight(), yt9Var2.b), arrayList4, qo1Var);
                }
                if (zL) {
                    return new do1(qu4Var, mt9VarT.d);
                }
                b1.l("CXCP", "Failed to create capture session from " + lf1Var + " for " + qo1Var + '!');
                qo1Var.a();
                return qk6Var2;
        }
    }
}
