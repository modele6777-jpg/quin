package defpackage;

import ai.askquin.datastore.model.InternalAnnualReportProgress;
import ai.askquin.datastore.model.LocalStorage;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sb8 extends gbe implements l26 {
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new sb8(2, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        return new LocalStorage((List) null, (List) null, (List) null, (List) null, false, 0, false, (String) null, (String) null, false, (List) null, 0, (String) null, (List) null, (String) null, false, false, (InternalAnnualReportProgress) null, (String) null, (Map) null, (Map) null, false, 4194303, (rp3) null);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((sb8) k((xn2) obj2, (LocalStorage) obj)).r(wef.a);
    }
}
