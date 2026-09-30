package defpackage;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 extends y70 implements hf8 {
    public static final void v(Configuration configuration, h1 h1Var) {
        int i = configuration.orientation;
        js9 js9Var = js9.b;
        js9 js9Var2 = i == 2 ? js9Var : js9.a;
        h1Var.getClass();
        kob kobVar = job.a;
        em7 em7VarB = kobVar.b(nf.class);
        owf owfVarG = h1Var.g();
        jwf jwfVarJ = hcc.j(h1Var);
        gy2 gy2VarI = hcc.i(h1Var);
        jwfVarJ.getClass();
        gy2VarI.getClass();
        kxa kxaVar = new kxa(owfVarG, jwfVarJ, gy2VarI);
        em7 em7VarB2 = kobVar.b(af1.R(em7VarB));
        String strG = em7VarB2.g();
        if (strG == null) {
            qc0.j("Local and anonymous classes can not be ViewModels");
            return;
        }
        ((nf) kxaVar.f(em7VarB2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strG))).b.setValue(Boolean.valueOf(js9Var2 == js9Var));
        h1Var.d().e("Orientation: " + js9Var2);
    }

    @Override // defpackage.y70, defpackage.vb2, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        getResources().getConfiguration().setTo(configuration);
        v(configuration, this);
        ynb.V(vpf.H(this), null, null, new g1(this, null, configuration), 3);
    }

    @Override // defpackage.nx5, defpackage.vb2, defpackage.ub2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ps4.a(this, new dce(0, 0, new znd(23)), 1);
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        cn1.P0 = this;
        cn1.X(vd8.b());
        d().e("Activity " + getClass().getSimpleName() + " created.");
        getResources().getConfiguration().getClass();
        try {
            u();
            Configuration configuration = getResources().getConfiguration();
            configuration.getClass();
            v(configuration, this);
            ynb.V(vpf.H(this), null, null, new g1(this, null, configuration), 3);
            i80.b();
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                d().c(message, e);
                jcc.k(0, message);
            }
        }
    }

    @Override // defpackage.y70, defpackage.nx5, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d().e("Activity: " + getClass().getSimpleName() + " destroyed.");
    }

    @Override // defpackage.nx5, android.app.Activity
    public final void onResume() {
        super.onResume();
        d().e("Activity: " + getClass().getSimpleName() + " resumed. locale: " + getResources().getConfiguration().locale);
    }

    public void u() {
    }
}
