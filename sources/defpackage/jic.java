package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jic implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kic b;

    public /* synthetic */ jic(kic kicVar, int i) {
        this.a = i;
        this.b = kicVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        kic kicVar = this.b;
        q22 q22Var = (q22) obj;
        switch (i) {
            case 0:
                q22Var.getClass();
                q22Var.a("type", p4e.b, (12 & 8) == 0);
                q22Var.a("value", eec.p("kotlinx.serialization.Sealed<" + kicVar.a.r() + '>', qyc.c, new nyc[0], new jic(kicVar, 1)), (12 & 8) == 0);
                List list = kicVar.b;
                list.getClass();
                q22Var.b = list;
                break;
            default:
                q22Var.getClass();
                for (Map.Entry entry : kicVar.e.entrySet()) {
                    q22Var.a((String) entry.getKey(), ((xn7) entry.getValue()).e(), (12 & 8) == 0);
                }
                break;
        }
        return wefVar;
    }
}
