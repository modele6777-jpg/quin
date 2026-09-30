package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nb2 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb2 b;

    public /* synthetic */ nb2(vb2 vb2Var, int i) {
        this.a = i;
        this.b = vb2Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        vb2 vb2Var = this.b;
        switch (i) {
            case 0:
                vb2Var.reportFullyDrawn();
                return wef.a;
            case 1:
                return new w16(vb2Var.f, new nb2(vb2Var, 0));
            case 2:
                h94 h94Var = new h94();
                vb2Var.a().y(h94Var);
                return h94Var;
            case 3:
                return new ldc(vb2Var.getApplication(), vb2Var, vb2Var.getIntent() != null ? vb2Var.getIntent().getExtras() : null);
            default:
                int i2 = 1;
                um9 um9Var = new um9(new mb2(vb2Var, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (pa7.t(Looper.myLooper(), Looper.getMainLooper())) {
                        vb2Var.a.a(new xm0(i2, um9Var, vb2Var));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new fe(23, vb2Var, um9Var));
                    }
                }
                return um9Var;
        }
    }
}
