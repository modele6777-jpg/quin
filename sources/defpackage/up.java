package defpackage;

import android.os.Bundle;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class up implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mmb b;

    public /* synthetic */ up(mmb mmbVar, int i) {
        this.a = i;
        this.b = mmbVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        boolean z = true;
        wef wefVar = wef.a;
        mmb mmbVar = this.b;
        switch (i) {
            case 0:
                Class cls = AndroidComposeView.X1;
                mmbVar.element = (oo5) obj;
                return Boolean.TRUE;
            case 1:
                mmbVar.element = (rf0) obj;
                return wefVar;
            case 2:
                t66 t66Var = (t66) obj;
                if (pa7.t(t66Var.Y(), "waiting")) {
                    mmbVar.element = t66Var;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                xq6 xq6Var = (xq6) obj;
                Object obj2 = mmbVar.element;
                if (obj2 == null && xq6Var.F0) {
                    mmbVar.element = xq6Var;
                } else if (obj2 != null) {
                    xq6Var.getClass();
                }
                return Boolean.TRUE;
            case 4:
                String str = (String) obj;
                str.getClass();
                Object obj3 = mmbVar.element;
                if (obj3 != null && ((Bundle) obj3).containsKey(str)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                Object obj4 = (i4f) obj;
                if (((i09) obj4).a.Y) {
                    mmbVar.element = obj4;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                i4f i4fVar = (i4f) obj;
                i4fVar.getClass();
                e08 e08Var = ((k4f) i4fVar).Z;
                List listK = (List) mmbVar.element;
                if (listK != null) {
                    listK.add(e08Var);
                } else {
                    listK = t72.K(e08Var);
                }
                mmbVar.element = listK;
                return h4f.b;
            case 7:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                Object obj5 = mmbVar.element;
                if (obj5 == null) {
                    pa7.g0("controller");
                    throw null;
                }
                bad badVar = (bad) obj5;
                e89 e89Var = badVar.i;
                l7a l7aVar = (l7a) e89Var.getValue();
                if (l7aVar != null) {
                    o7a o7aVar = l7aVar.a;
                    o7aVar.getClass();
                    e89Var.setValue(new l7a(o7aVar, bool));
                    badVar.m();
                }
                return wefVar;
            case 8:
                ((ra4) obj).getClass();
                return new lf(22, mmbVar);
            default:
                nh7 nh7Var = (nh7) obj;
                nh7Var.getClass();
                mmbVar.element = nh7Var;
                return wefVar;
        }
    }
}
