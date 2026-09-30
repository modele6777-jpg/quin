package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ryd extends ds8 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public boolean E0;
    public boolean F0;
    public int G0;
    public boolean I0;
    public View X;
    public ks8 Y;
    public ViewTreeObserver Z;
    public final Context b;
    public final qr8 c;
    public final nr8 d;
    public final boolean e;
    public final int f;
    public final int g;
    public final hs8 v;
    public PopupWindow.OnDismissListener y;
    public View z;
    public final g90 w = new g90(3, this);
    public final hs x = new hs(2, this);
    public int H0 = 0;

    public ryd(Context context, qr8 qr8Var, View view, int i, boolean z) {
        this.b = context;
        this.c = qr8Var;
        this.e = z;
        this.d = new nr8(qr8Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.g = i;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.z = view;
        this.v = new hs8(context, null, i);
        qr8Var.b(this, context);
    }

    @Override // defpackage.efd
    public final boolean a() {
        return !this.E0 && this.v.N0.isShowing();
    }

    @Override // defpackage.ls8
    public final boolean b(k6e k6eVar) {
        boolean z;
        if (k6eVar.hasVisibleItems()) {
            fs8 fs8Var = new fs8(this.b, k6eVar, this.X, this.e, this.g, 0);
            ks8 ks8Var = this.Y;
            fs8Var.h = ks8Var;
            ds8 ds8Var = fs8Var.i;
            if (ds8Var != null) {
                ds8Var.g(ks8Var);
            }
            int size = k6eVar.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = k6eVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            fs8Var.g = z;
            ds8 ds8Var2 = fs8Var.i;
            if (ds8Var2 != null) {
                ds8Var2.o(z);
            }
            fs8Var.j = this.y;
            this.y = null;
            this.c.c(false);
            hs8 hs8Var = this.v;
            int width = hs8Var.f;
            int iO = hs8Var.o();
            if ((Gravity.getAbsoluteGravity(this.H0, this.z.getLayoutDirection()) & 7) == 5) {
                width += this.z.getWidth();
            }
            if (!fs8Var.b()) {
                if (fs8Var.e != null) {
                    fs8Var.d(width, iO, true, true);
                }
            }
            ks8 ks8Var2 = this.Y;
            if (ks8Var2 != null) {
                ks8Var2.B(k6eVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ls8
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ls8
    public final void d(qr8 qr8Var, boolean z) {
        if (qr8Var != this.c) {
            return;
        }
        dismiss();
        ks8 ks8Var = this.Y;
        if (ks8Var != null) {
            ks8Var.d(qr8Var, z);
        }
    }

    @Override // defpackage.efd
    public final void dismiss() {
        if (a()) {
            this.v.dismiss();
        }
    }

    @Override // defpackage.efd
    public final void f() {
        View view;
        if (a()) {
            return;
        }
        if (this.E0 || (view = this.z) == null) {
            qc0.p("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.X = view;
        hs8 hs8Var = this.v;
        z80 z80Var = hs8Var.N0;
        z80 z80Var2 = hs8Var.N0;
        z80Var.setOnDismissListener(this);
        hs8Var.E0 = this;
        hs8Var.M0 = true;
        z80Var2.setFocusable(true);
        View view2 = this.X;
        boolean z = this.Z == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.Z = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.w);
        }
        view2.addOnAttachStateChangeListener(this.x);
        hs8Var.Z = view2;
        hs8Var.z = this.H0;
        boolean z2 = this.F0;
        Context context = this.b;
        nr8 nr8Var = this.d;
        if (!z2) {
            this.G0 = ds8.m(nr8Var, context, this.f);
            this.F0 = true;
        }
        hs8Var.r(this.G0);
        z80Var2.setInputMethodMode(2);
        Rect rect = this.a;
        hs8Var.L0 = rect != null ? new Rect(rect) : null;
        hs8Var.f();
        hq4 hq4Var = hs8Var.c;
        hq4Var.setOnKeyListener(this);
        if (this.I0) {
            qr8 qr8Var = this.c;
            if (qr8Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) hq4Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(qr8Var.m);
                }
                frameLayout.setEnabled(false);
                hq4Var.addHeaderView(frameLayout, null, false);
            }
        }
        hs8Var.p(nr8Var);
        hs8Var.f();
    }

    @Override // defpackage.ls8
    public final void g(ks8 ks8Var) {
        this.Y = ks8Var;
    }

    @Override // defpackage.ls8
    public final void i() {
        this.F0 = false;
        nr8 nr8Var = this.d;
        if (nr8Var != null) {
            nr8Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.efd
    public final hq4 j() {
        return this.v.c;
    }

    @Override // defpackage.ds8
    public final void n(View view) {
        this.z = view;
    }

    @Override // defpackage.ds8
    public final void o(boolean z) {
        this.d.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.E0 = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.Z;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.Z = this.X.getViewTreeObserver();
            }
            this.Z.removeGlobalOnLayoutListener(this.w);
            this.Z = null;
        }
        this.X.removeOnAttachStateChangeListener(this.x);
        PopupWindow.OnDismissListener onDismissListener = this.y;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.ds8
    public final void p(int i) {
        this.H0 = i;
    }

    @Override // defpackage.ds8
    public final void q(int i) {
        this.v.f = i;
    }

    @Override // defpackage.ds8
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.y = onDismissListener;
    }

    @Override // defpackage.ds8
    public final void s(boolean z) {
        this.I0 = z;
    }

    @Override // defpackage.ds8
    public final void t(int i) {
        this.v.l(i);
    }

    @Override // defpackage.ds8
    public final void l(qr8 qr8Var) {
    }
}
