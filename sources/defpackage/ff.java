package defpackage;

import android.os.Bundle;
import android.view.Choreographer;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ff implements u48 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ff(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // defpackage.u48
    public final void h(x48 x48Var, f48 f48Var) {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                tb2 tb2Var = (tb2) obj4;
                String str = (String) obj3;
                ye yeVar = (ye) obj2;
                mh3 mh3Var = (mh3) obj;
                if (f48.ON_START == f48Var) {
                    LinkedHashMap linkedHashMap = tb2Var.e;
                    Bundle bundle = tb2Var.g;
                    LinkedHashMap linkedHashMap2 = tb2Var.f;
                    linkedHashMap.put(str, new gf(yeVar, mh3Var));
                    if (linkedHashMap2.containsKey(str)) {
                        Object obj5 = linkedHashMap2.get(str);
                        linkedHashMap2.remove(str);
                        yeVar.j(obj5);
                    }
                    xe xeVar = (xe) abg.C(bundle, str, xe.class);
                    if (xeVar != null) {
                        bundle.remove(str);
                        yeVar.j(mh3Var.R(xeVar.b, xeVar.a));
                    }
                } else if (f48.ON_STOP == f48Var) {
                    tb2Var.e.remove(str);
                } else if (f48.ON_DESTROY == f48Var) {
                    tb2Var.e(str);
                }
                break;
            case 1:
                aw2 aw2Var = (aw2) obj4;
                x48 x48Var2 = (x48) obj3;
                mma mmaVar = (mma) obj2;
                e89 e89Var = (e89) obj;
                if (f48Var == f48.ON_RESUME) {
                    ynb.V(aw2Var, null, null, new dn6(x48Var2, mmaVar, e89Var, null), 3);
                }
                break;
            default:
                lge lgeVar = (lge) obj4;
                imb imbVar = (imb) obj3;
                Choreographer choreographer = (Choreographer) obj2;
                ufe ufeVar = (ufe) obj;
                int i2 = wfe.a[f48Var.ordinal()];
                if (i2 == 1) {
                    lgeVar.k.c.clear();
                    lgeVar.g();
                    if (!imbVar.element) {
                        imbVar.element = true;
                        choreographer.postFrameCallback(ufeVar);
                    }
                    break;
                } else if (i2 == 2) {
                    imbVar.element = false;
                    choreographer.removeFrameCallback(ufeVar);
                    break;
                }
                break;
        }
    }
}
