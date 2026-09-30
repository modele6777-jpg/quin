package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class xx7 implements x16 {
    public final /* synthetic */ int a;
    public final yx7 b;

    public /* synthetic */ xx7(yx7 yx7Var, int i) {
        this.a = i;
        this.b = yx7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        yx7 yx7Var = this.b;
        switch (i) {
            case 0:
                Object obj = yx7Var.w.b;
                yx7Var.f.a.a.getClass();
                return bm8.W(new ArrayList());
            case 1:
                yx7Var.v.getClass();
                return new ArrayList(t72.u(pu4.a, 10));
            default:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) gdc.f(yx7Var.x, yx7.Y[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    cob cobVar = (cob) entry.getValue();
                    gk7 gk7VarB = gk7.b(str);
                    zr7 zr7Var = cobVar.b;
                    yr7 yr7Var = zr7Var.a;
                    int iOrdinal = yr7Var.ordinal();
                    if (iOrdinal == 2) {
                        map.put(gk7VarB, gk7VarB);
                    } else if (iOrdinal == 5) {
                        String str2 = zr7Var.f;
                        if (yr7Var != yr7.MULTIFILE_CLASS_PART) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            map.put(gk7VarB, gk7.b(str2));
                        }
                    }
                }
                return map;
        }
    }
}
