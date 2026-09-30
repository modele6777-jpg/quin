package defpackage;

import ai.askquin.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class zb2 extends Dialog implements x48, vm9, wb9, kdc {
    public a58 a;
    public final lqb b;
    public final ace c;
    public final ace d;

    public zb2(Context context, int i) {
        super(context, i);
        this.b = new lqb(new jdc(this, new hla(15, this)));
        final int i2 = 0;
        this.c = new ace(new x16(this) { // from class: yb2
            public final /* synthetic */ zb2 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i2;
                zb2 zb2Var = this.b;
                switch (i3) {
                    case 0:
                        h94 h94Var = new h94();
                        zb2Var.a().y(h94Var);
                        return h94Var;
                    default:
                        return new um9(new j1(18, zb2Var));
                }
            }
        });
        final int i3 = 1;
        this.d = new ace(new x16(this) { // from class: yb2
            public final /* synthetic */ zb2 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i4 = i3;
                zb2 zb2Var = this.b;
                switch (i4) {
                    case 0:
                        h94 h94Var = new h94();
                        zb2Var.a().y(h94Var);
                        return h94Var;
                    default:
                        return new um9(new j1(18, zb2Var));
                }
            }
        });
    }

    public static final void e(zb2 zb2Var) {
        super.onBackPressed();
    }

    @Override // defpackage.wb9
    public final szc a() {
        return b().b().c;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.vm9
    public final um9 b() {
        return (um9) this.d.getValue();
    }

    public final a58 c() {
        a58 a58Var = this.a;
        if (a58Var != null) {
            return a58Var;
        }
        a58 a58Var2 = new a58(this, true);
        this.a = a58Var2;
        return a58Var2;
    }

    public final void d() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.kdc
    public final vea h() {
        return (vea) this.b.c;
    }

    @Override // defpackage.x48
    public final h48 k() {
        return c();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((h94) this.c.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            um9 um9VarB = b();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            um9VarB.c(onBackInvokedDispatcher);
        }
        this.b.p(bundle);
        c().e(f48.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.b.q(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c().e(f48.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().e(f48.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.setContentView(view, layoutParams);
    }
}
