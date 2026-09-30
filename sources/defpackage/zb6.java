package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zb6 {
    public final Context a;
    public final String b;
    public final vd9 c;
    public final k47 d;
    public final k60 e;
    public final b70 f;
    public final Looper g;
    public final int h;
    public final thg i;
    public final qfc j;
    public final ec6 k;

    public zb6(Context context, k47 k47Var, k60 k60Var, yb6 yb6Var) {
        oa7.B(context, "Null context is not permitted.");
        oa7.B(k47Var, "Api must not be null.");
        oa7.B(yb6Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        oa7.B(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        String attributionTag = (i < 30 || i < 30) ? null : context.getAttributionTag();
        this.b = attributionTag;
        this.c = i >= 31 ? new vd9(6, context.getAttributionSource()) : null;
        this.d = k47Var;
        this.e = k60Var;
        this.g = yb6Var.b;
        this.f = new b70(k47Var, k60Var, attributionTag);
        this.i = new thg(this);
        ec6 ec6VarE = ec6.e(applicationContext);
        this.k = ec6VarE;
        this.h = ec6VarE.v.getAndIncrement();
        this.j = yb6Var.a;
        sig sigVar = ec6VarE.X;
        sigVar.sendMessage(sigVar.obtainMessage(7, this));
    }

    public final ta0 a() {
        ta0 ta0Var = new ta0(17, false);
        Set set = Collections.EMPTY_SET;
        od0 od0Var = (od0) ta0Var.c;
        if (od0Var == null) {
            od0Var = new od0(0);
            ta0Var.c = od0Var;
        }
        od0Var.addAll(set);
        Context context = this.a;
        ta0Var.b = context.getClass().getName();
        ta0Var.d = context.getPackageName();
        return ta0Var;
    }

    public final gfh b(int i, j27 j27Var) {
        gle gleVar = new gle();
        ec6 ec6Var = this.k;
        ec6Var.getClass();
        ec6Var.c(gleVar, j27Var.b, this);
        yhg yhgVar = new yhg(new kig(i, j27Var, gleVar, this.j), ec6Var.w.get(), this);
        sig sigVar = ec6Var.X;
        sigVar.sendMessage(sigVar.obtainMessage(4, yhgVar));
        return gleVar.a;
    }
}
