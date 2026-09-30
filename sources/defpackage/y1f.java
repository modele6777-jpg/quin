package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y1f {
    public final Context a;
    public final gl2 b;
    public final vw0 c;
    public final pe9 d;
    public final gl2 e;

    public y1f(Context context, bbg bbgVar) {
        pe9 pe9Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        vw0 vw0Var = new vw0(applicationContext, bbgVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        vw0 vw0Var2 = new vw0(applicationContext2, bbgVar, 1);
        if (Build.VERSION.SDK_INT < 28) {
            Context applicationContext3 = context.getApplicationContext();
            applicationContext3.getClass();
            String str = oe9.a;
            pe9Var = new pe9(applicationContext3, bbgVar);
        } else {
            pe9Var = null;
        }
        Context applicationContext4 = context.getApplicationContext();
        applicationContext4.getClass();
        vw0 vw0Var3 = new vw0(applicationContext4, bbgVar, 2);
        this.a = context;
        this.b = vw0Var;
        this.c = vw0Var2;
        this.d = pe9Var;
        this.e = vw0Var3;
    }
}
