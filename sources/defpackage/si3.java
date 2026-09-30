package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class si3 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sw3 b;
    public final /* synthetic */ e89 c;

    public /* synthetic */ si3(sw3 sw3Var, e89 e89Var, int i) {
        this.a = i;
        this.b = sw3Var;
        this.c = e89Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.c;
        sw3 sw3Var = this.b;
        switch (i) {
            case 0:
                e89Var.setValue(new yi4(sw3Var.Z((int) (((e77) obj).a & 4294967295L))));
                return wefVar;
            case 1:
                e89Var.setValue(new yi4(sw3Var.Z((int) (((e77) obj).a & 4294967295L))));
                return wefVar;
            case 2:
                lnc lncVar = new lnc(1, (x16) obj);
                si3 si3Var = new si3(sw3Var, e89Var, 3);
                if (pj8.a()) {
                    return pj8.b(lncVar, si3Var, Build.VERSION.SDK_INT == 28 ? gfa.a : ifa.a);
                }
                s8f.i("Magnifier is only supported on API level 28 and higher.");
                return null;
            case 3:
                bj4 bj4Var = (bj4) obj;
                e89Var.setValue(new e77((((long) sw3Var.D0(bj4.a(bj4Var.a))) & 4294967295L) | (((long) sw3Var.D0(bj4.b(bj4Var.a))) << 32)));
                return wefVar;
            case 4:
                lnc lncVar2 = new lnc(7, (x16) obj);
                si3 si3Var2 = new si3(sw3Var, e89Var, 5);
                if (pj8.a()) {
                    return pj8.b(lncVar2, si3Var2, Build.VERSION.SDK_INT == 28 ? gfa.a : ifa.a);
                }
                s8f.i("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                bj4 bj4Var2 = (bj4) obj;
                e89Var.setValue(new e77((((long) sw3Var.D0(bj4.a(bj4Var2.a))) & 4294967295L) | (((long) sw3Var.D0(bj4.b(bj4Var2.a))) << 32)));
                return wefVar;
        }
    }
}
