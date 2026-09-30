package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kg0 implements pw3 {
    public final char a;

    public kg0(char c) {
        this.a = c;
    }

    @Override // defpackage.pw3
    public final int a(ow3 ow3Var, ow3 ow3Var2) {
        sf9 sf9Var;
        ArrayList arrayList = ow3Var2.a;
        if (ow3Var.e || ow3Var2.d) {
            int i = ow3Var2.c;
            if (i % 3 != 0 && (ow3Var.c + i) % 3 == 0) {
                return 0;
            }
        }
        int size = ow3Var.a.size();
        char c = this.a;
        int i2 = 2;
        if (size < 2 || arrayList.size() < 2) {
            String strValueOf = String.valueOf(c);
            gu4 gu4Var = new gu4();
            gu4Var.g = strValueOf;
            i2 = 1;
            sf9Var = gu4Var;
        } else {
            String str = String.valueOf(c) + c;
            f5e f5eVar = new f5e();
            f5eVar.g = str;
            sf9Var = f5eVar;
        }
        qi6 qi6Var = new qi6();
        qi6Var.c(ow3Var.c(i2));
        ime imeVarB = ow3Var.b();
        eg9 eg9Var = new eg9(imeVarB.e, (ime) arrayList.get(0));
        while (eg9Var.hasNext()) {
            sf9 sf9Var2 = (sf9) eg9Var.next();
            sf9Var.c(sf9Var2);
            qi6Var.b(sf9Var2.d());
        }
        qi6Var.c(ow3Var2.a(i2));
        List list = qi6Var.a;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        sf9Var.g(list);
        imeVarB.e(sf9Var);
        return i2;
    }

    @Override // defpackage.pw3
    public final char b() {
        return this.a;
    }

    @Override // defpackage.pw3
    public final int c() {
        return 1;
    }

    @Override // defpackage.pw3
    public final char d() {
        return this.a;
    }
}
