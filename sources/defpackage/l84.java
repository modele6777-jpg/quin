package defpackage;

import ai.askquin.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class l84 extends kx5 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public final h84 j1;
    public final i84 k1;
    public int l1;
    public int m1;
    public boolean n1;
    public boolean o1;
    public int p1;
    public boolean q1;
    public final j84 r1;
    public Dialog s1;
    public boolean t1;
    public boolean u1;
    public boolean v1;
    public boolean w1;

    public l84() {
        new wwg(8, this);
        this.j1 = new h84(this);
        this.k1 = new i84(this);
        this.l1 = 0;
        this.m1 = 0;
        this.n1 = true;
        this.o1 = true;
        this.p1 = -1;
        this.r1 = new j84(this);
        this.w1 = false;
    }

    @Override // defpackage.kx5
    public final void A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.A(layoutInflater, viewGroup, bundle);
        if (this.s1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.s1.onRestoreInstanceState(bundle2);
    }

    public Dialog D() {
        if (zx5.I(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new zb2(B(), this.m1);
    }

    @Override // defpackage.kx5
    public final qk2 a() {
        return new k84(this, new k84(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.t1) {
            return;
        }
        if (zx5.I(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.u1) {
            return;
        }
        this.u1 = true;
        this.v1 = false;
        Dialog dialog = this.s1;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.s1.dismiss();
        }
        this.t1 = true;
        if (this.p1 >= 0) {
            zx5 zx5VarJ = j();
            int i = this.p1;
            if (i < 0) {
                qc0.j(tec.e(i, "Bad id: "));
                return;
            } else {
                zx5VarJ.x(new xx5(zx5VarJ, i), true);
                this.p1 = -1;
                return;
            }
        }
        hs0 hs0Var = new hs0(j());
        hs0Var.o = true;
        zx5 zx5Var = this.I0;
        if (zx5Var == null || zx5Var == hs0Var.q) {
            hs0Var.b(new ky5(3, this));
            hs0Var.e(true, true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // defpackage.kx5
    public final void q() {
        this.T0 = true;
    }

    @Override // defpackage.kx5
    public final void s(Context context) {
        super.s(context);
        this.d1.f(this.r1);
        if (this.v1) {
            return;
        }
        this.u1 = false;
    }

    @Override // defpackage.kx5
    public final void t(Bundle bundle) {
        Bundle bundle2;
        this.T0 = true;
        Bundle bundle3 = this.b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.K0.T(bundle2);
            zx5 zx5Var = this.K0;
            zx5Var.H = false;
            zx5Var.I = false;
            zx5Var.O.g = false;
            zx5Var.u(1);
        }
        zx5 zx5Var2 = this.K0;
        if (zx5Var2.v < 1) {
            zx5Var2.H = false;
            zx5Var2.I = false;
            zx5Var2.O.g = false;
            zx5Var2.u(1);
        }
        new Handler();
        this.o1 = this.N0 == 0;
        if (bundle != null) {
            this.l1 = bundle.getInt("android:style", 0);
            this.m1 = bundle.getInt("android:theme", 0);
            this.n1 = bundle.getBoolean("android:cancelable", true);
            this.o1 = bundle.getBoolean("android:showsDialog", this.o1);
            this.p1 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.kx5
    public final void u() {
        this.T0 = true;
        Dialog dialog = this.s1;
        if (dialog != null) {
            this.t1 = true;
            dialog.setOnDismissListener(null);
            this.s1.dismiss();
            if (!this.u1) {
                onDismiss(this.s1);
            }
            this.s1 = null;
            this.w1 = false;
        }
    }

    @Override // defpackage.kx5
    public final void v() {
        this.T0 = true;
        if (!this.v1 && !this.u1) {
            this.u1 = true;
        }
        this.d1.j(this.r1);
    }

    @Override // defpackage.kx5
    public final LayoutInflater w(Bundle bundle) {
        LayoutInflater layoutInflaterW = super.w(bundle);
        boolean z = this.o1;
        if (z && !this.q1) {
            if (z && !this.w1) {
                try {
                    this.q1 = true;
                    Dialog dialogD = D();
                    this.s1 = dialogD;
                    Context context = null;
                    if (this.o1) {
                        int i = this.l1;
                        if (i == 1 || i == 2) {
                            dialogD.requestWindowFeature(1);
                        } else if (i == 3) {
                            Window window = dialogD.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogD.requestWindowFeature(1);
                        }
                        mx5 mx5Var = this.J0;
                        if (mx5Var != null) {
                            context = mx5Var.H0;
                        }
                        if (context instanceof Activity) {
                            this.s1.setOwnerActivity((Activity) context);
                        }
                        this.s1.setCancelable(this.n1);
                        this.s1.setOnCancelListener(this.j1);
                        this.s1.setOnDismissListener(this.k1);
                        this.w1 = true;
                    } else {
                        this.s1 = null;
                    }
                    this.q1 = false;
                } catch (Throwable th) {
                    this.q1 = false;
                    throw th;
                }
            }
            if (zx5.I(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.s1;
            if (dialog != null) {
                return layoutInflaterW.cloneInContext(dialog.getContext());
            }
        } else if (zx5.I(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.o1) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterW;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterW;
    }

    @Override // defpackage.kx5
    public final void x(Bundle bundle) {
        Dialog dialog = this.s1;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.l1;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.m1;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.n1;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.o1;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.p1;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.kx5
    public final void y() {
        this.T0 = true;
        Dialog dialog = this.s1;
        if (dialog != null) {
            this.t1 = false;
            dialog.show();
            View decorView = this.s1.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // defpackage.kx5
    public final void z() {
        this.T0 = true;
        Dialog dialog = this.s1;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
