package defpackage;

import java.time.Instant;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pb4 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Instant c;
    public final /* synthetic */ List d;

    public /* synthetic */ pb4(String str, vb4 vb4Var, Instant instant, List list, int i) {
        this.a = i;
        this.b = str;
        this.c = instant;
        this.d = list;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = 2;
        List list = this.d;
        Instant instant = this.c;
        String str = this.b;
        q8c q8cVar = (q8c) obj;
        switch (i) {
            case 0:
                q8cVar.getClass();
                x8c x8cVarW0 = q8cVar.W0(str);
                try {
                    String strM = yx4.m(instant);
                    if (strM == null) {
                        x8cVarW0.o(1);
                    } else {
                        x8cVarW0.Q(1, strM);
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        x8cVarW0.Q(i2, (String) it.next());
                        i2++;
                    }
                    x8cVarW0.R0();
                    return wefVar;
                } finally {
                    x8cVarW0.close();
                }
            default:
                q8cVar.getClass();
                x8c x8cVarW1 = q8cVar.W0(str);
                try {
                    String string = instant.toString();
                    if (string == null) {
                        x8cVarW1.o(1);
                    } else {
                        x8cVarW1.Q(1, string);
                    }
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        x8cVarW1.Q(i2, (String) it2.next());
                        i2++;
                    }
                    x8cVarW1.R0();
                    return wefVar;
                } finally {
                    x8cVarW1.close();
                }
        }
    }
}
