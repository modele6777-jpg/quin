package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pt3 implements npa {
    public final /* synthetic */ au3 a;
    public final /* synthetic */ vt3 b;

    public /* synthetic */ pt3(au3 au3Var, vt3 vt3Var) {
        this.a = au3Var;
        this.b = vt3Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x006b A[FALL_THROUGH] */
    @Override // defpackage.npa
    public final boolean apply(Object obj) {
        Boolean bool;
        iud iudVar;
        iud iudVar2;
        rr5 rr5Var = (rr5) obj;
        au3 au3Var = this.a;
        au3Var.getClass();
        if (this.b.B && ((bool = au3Var.j) == null || !bool.booleanValue())) {
            int i = rr5Var.J;
            if (i != -1 && i > 2) {
                String str = rr5Var.p;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32 && (iudVar2 = au3Var.h) != null && iudVar2.b) {
                            }
                        default:
                            if (Build.VERSION.SDK_INT >= 32) {
                                break;
                            }
                            return false;
                    }
                } else if (Build.VERSION.SDK_INT >= 32 || (iudVar = au3Var.h) == null || !iudVar.b || !iudVar.c() || !au3Var.h.d() || !au3Var.h.a(au3Var.i, rr5Var)) {
                    return false;
                }
            }
        }
        return true;
    }
}
