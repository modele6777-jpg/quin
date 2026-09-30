package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ap2 implements u48 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ap2(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.u48
    public final void h(x48 x48Var, f48 f48Var) {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                mma mmaVar = (mma) obj3;
                e89 e89Var = (e89) obj2;
                e89 e89Var2 = (e89) obj;
                if (f48Var == f48.ON_STOP) {
                    mmaVar.O();
                    Boolean bool = Boolean.FALSE;
                    e89Var.setValue(bool);
                    e89Var2.setValue(bool);
                }
                break;
            case 1:
                y63 y63Var = (y63) obj3;
                Context context = (Context) obj2;
                String str = (String) obj;
                if (f48Var == f48.ON_RESUME) {
                    y63Var.h(context, str, false, null);
                }
                break;
            case 2:
                g58 g58Var = (g58) obj3;
                mmb mmbVar = (mmb) obj2;
                a26 a26Var = (a26) obj;
                int i2 = t48.a[f48Var.ordinal()];
                if (i2 == 1) {
                    mmbVar.element = a26Var.d(g58Var);
                    break;
                } else if (i2 == 2) {
                    ds0 ds0Var = (ds0) mmbVar.element;
                    if (ds0Var != null) {
                        ds0Var.a();
                    }
                    mmbVar.element = null;
                    break;
                }
                break;
            default:
                c58 c58Var = (c58) obj3;
                mmb mmbVar2 = (mmb) obj2;
                a26 a26Var2 = (a26) obj;
                int i3 = t48.a[f48Var.ordinal()];
                if (i3 == 3) {
                    mmbVar2.element = a26Var2.d(c58Var);
                    break;
                } else if (i3 == 4) {
                    sm6 sm6Var = (sm6) mmbVar2.element;
                    if (sm6Var != null) {
                        sm6Var.a.unregisterReceiver(sm6Var.b);
                    }
                    mmbVar2.element = null;
                    break;
                }
                break;
        }
    }
}
