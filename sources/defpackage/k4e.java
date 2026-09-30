package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k4e implements pw3 {
    @Override // defpackage.pw3
    public final int a(ow3 ow3Var, ow3 ow3Var2) {
        String strL;
        ArrayList arrayList = ow3Var.a;
        int size = arrayList.size();
        ArrayList arrayList2 = ow3Var2.a;
        if (size != arrayList2.size() || arrayList.size() > 2) {
            return 0;
        }
        ime imeVarB = ow3Var.b();
        if (arrayList.size() == 1) {
            strL = imeVarB.g;
        } else {
            String str = imeVarB.g;
            strL = tec.l(str, str);
        }
        j4e j4eVar = new j4e();
        j4eVar.g = strL;
        qi6 qi6Var = new qi6();
        qi6Var.c(ow3Var.c(arrayList.size()));
        eg9 eg9Var = new eg9(imeVarB.e, (ime) arrayList2.get(0));
        while (eg9Var.hasNext()) {
            sf9 sf9Var = (sf9) eg9Var.next();
            j4eVar.c(sf9Var);
            qi6Var.b(sf9Var.d());
        }
        qi6Var.c(ow3Var2.a(arrayList2.size()));
        List list = qi6Var.a;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        j4eVar.g(list);
        imeVarB.e(j4eVar);
        return arrayList.size();
    }

    @Override // defpackage.pw3
    public final char b() {
        return '~';
    }

    @Override // defpackage.pw3
    public final int c() {
        return 1;
    }

    @Override // defpackage.pw3
    public final char d() {
        return '~';
    }
}
