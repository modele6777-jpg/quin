package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xm0 implements u48 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xm0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.u48
    public final void h(x48 x48Var, f48 f48Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                aw2 aw2Var = (aw2) obj2;
                sn0 sn0Var = (sn0) obj;
                if (f48Var == f48.ON_RESUME) {
                    ynb.V(aw2Var, null, null, new an0(sn0Var, null), 3);
                }
                break;
            case 1:
                vb2.l((um9) obj2, (vb2) obj, x48Var, f48Var);
                break;
            case 2:
                kq6 kq6Var = (kq6) obj2;
                e89 e89Var = (e89) obj;
                int i2 = tm6.a[f48Var.ordinal()];
                if (i2 == 1) {
                    e89Var.setValue(Boolean.TRUE);
                    kq6.g(kq6Var, 1);
                } else if (i2 == 2 || i2 == 3) {
                    e89Var.setValue(Boolean.FALSE);
                    kq6Var.M0 = false;
                    kq6Var.f();
                }
                break;
            case 3:
                e89 e89Var2 = (e89) obj;
                if (f48Var == ((f48) obj2)) {
                    ((x16) e89Var2.getValue()).invoke();
                }
                break;
            case 4:
                gj9 gj9Var = (gj9) obj2;
                Context context = (Context) obj;
                if (f48Var == f48.ON_RESUME) {
                    gj9Var.g(context);
                }
                break;
            default:
                x16 x16Var = (x16) obj2;
                x16 x16Var2 = (x16) obj;
                int i3 = zfc.a[f48Var.ordinal()];
                if (i3 == 1) {
                    x16Var.invoke();
                    break;
                } else if (i3 == 2) {
                    x16Var2.invoke();
                    break;
                }
                break;
        }
    }
}
