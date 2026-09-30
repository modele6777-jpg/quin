package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class is implements ie6 {
    public static boolean g = true;
    public final AndroidComposeView a;
    public final Object b = new Object();
    public bwf c;
    public boolean d;
    public ta0 e;
    public final gs f;

    public is(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
        gs gsVar = new gs(0, this);
        this.f = gsVar;
        if (androidComposeView.isAttachedToWindow()) {
            Context context = androidComposeView.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(gsVar);
                this.d = true;
            }
        }
        androidComposeView.addOnAttachStateChangeListener(new hs(0, this));
    }

    @Override // defpackage.ie6
    public final void a(ke6 ke6Var) {
        synchronized (this.b) {
            if (!ke6Var.s) {
                ke6Var.s = true;
                ke6Var.b();
            }
        }
    }

    @Override // defpackage.ie6
    public final ta0 b() {
        ta0 ta0Var = this.e;
        if (ta0Var != null) {
            return ta0Var;
        }
        ta0 ta0Var2 = new ta0(6, false);
        this.e = ta0Var2;
        return ta0Var2;
    }

    @Override // defpackage.ie6
    public final ke6 c() {
        me6 se6Var;
        me6 qe6Var;
        ke6 ke6Var;
        synchronized (this.b) {
            try {
                AndroidComposeView androidComposeView = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    bp.y(androidComposeView);
                }
                if (i >= 29) {
                    qe6Var = new qe6();
                } else {
                    if (g) {
                        try {
                            se6Var = new pe6(this.a, new yl1(), new xl1());
                        } catch (Throwable unused) {
                            g = false;
                            se6Var = new se6(e(this.a));
                        }
                    } else {
                        se6Var = new se6(e(this.a));
                    }
                    qe6Var = se6Var;
                }
                ke6Var = new ke6(qe6Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ke6Var;
    }

    public final void d() {
        ta0 ta0Var = this.e;
        if (ta0Var != null) {
            synchronized (ta0Var) {
                try {
                    w79 w79Var = (w79) ta0Var.c;
                    if (w79Var != null) {
                        w79Var.a();
                    }
                    w79 w79Var2 = (w79) ta0Var.d;
                    if (w79Var2 != null) {
                        w79Var2.a();
                    }
                    ta0Var.b = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.e = null;
    }

    public final kn4 e(AndroidComposeView androidComposeView) {
        bwf bwfVar = this.c;
        if (bwfVar != null) {
            return bwfVar;
        }
        bwf bwfVar2 = new bwf(androidComposeView.getContext());
        bwfVar2.setClipChildren(false);
        bwfVar2.setClipToPadding(false);
        bwfVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        androidComposeView.addView(bwfVar2, -1);
        this.c = bwfVar2;
        return bwfVar2;
    }
}
