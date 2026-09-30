package defpackage;

import ai.askquin.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u84 extends zb2 {
    public x16 e;
    public s84 f;
    public final View g;
    public final o84 v;
    public boolean w;

    public u84(x16 x16Var, s84 s84Var, View view, cv7 cv7Var, sw3 sw3Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), s84Var.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.e = x16Var;
        this.f = s84Var;
        this.g = view;
        Window window = getWindow();
        if (window == null) {
            qc0.p("Dialog has no window");
            throw null;
        }
        s84 s84Var2 = this.f;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = s84Var2.g;
            window2.setAttributes(attributes);
        }
        int i = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        q6c.l(window, this.f.e);
        window.setGravity(17);
        if (!this.f.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                n60.a.a(attributes2);
            }
            if (i2 >= 30) {
                o60 o60Var = o60.a;
                o60Var.b(attributes2, 0);
                o60Var.c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        o84 o84Var = new o84(getContext(), window);
        setTitle(this.f.f);
        o84Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        o84Var.setClipChildren(false);
        o84Var.setElevation(sw3Var.p0(8.0f));
        o84Var.setOutlineProvider(new t84(0));
        this.v = o84Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            f(viewGroup);
        }
        setContentView(o84Var);
        o84Var.setTag(R.id.view_tree_lifecycle_owner, scc.j(view));
        o84Var.setTag(R.id.view_tree_view_model_store_owner, gdc.d(view));
        o84Var.setTag(R.id.view_tree_saved_state_registry_owner, fdc.i(view));
        g(this.e, this.f, cv7Var);
        z7f.n(b(), this, new ir(this, i), 2);
    }

    public static final void f(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof o84) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                f(viewGroup2);
            }
        }
    }

    public final void g(x16 x16Var, s84 s84Var, cv7 cv7Var) {
        int i;
        this.e = x16Var;
        this.f = s84Var;
        usc uscVar = s84Var.c;
        boolean zB = pu.b(this.g);
        int iOrdinal = uscVar.ordinal();
        int i2 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    ap.c();
                    return;
                }
                zB = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zB ? 8192 : -8193, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int iOrdinal2 = cv7Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                ap.c();
                return;
            }
            i = 1;
        }
        o84 o84Var = this.v;
        o84Var.setLayoutDirection(i);
        boolean z = s84Var.e;
        boolean z2 = s84Var.d;
        Window window2 = o84Var.x;
        boolean z3 = (o84Var.F0 && z2 == o84Var.z && z == o84Var.E0) ? false : true;
        o84Var.z = z2;
        o84Var.E0 = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i3 = z2 ? -2 : -1;
            if (i3 != attributes.width || !o84Var.F0) {
                window2.setLayout(i3, -2);
                o84Var.F0 = true;
            }
        }
        setCanceledOnTouchOutside(s84Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z) {
                i2 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i2);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.e.invoke();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iL;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f.b) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.w = false;
            return zOnTouchEvent;
        }
        o84 o84Var = this.v;
        o84Var.getClass();
        if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = o84Var.getChildAt(0)) != null) {
            int left = childAt.getLeft() + o84Var.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + o84Var.getTop();
            int height = childAt.getHeight() + top;
            int iL2 = ym8.L(motionEvent.getX());
            if (left <= iL2 && iL2 <= width && top <= (iL = ym8.L(motionEvent.getY())) && iL <= height) {
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                    this.w = false;
                    return zOnTouchEvent;
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.w = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.w = false;
                return zOnTouchEvent;
            }
        } else if (this.w) {
            this.e.invoke();
            this.w = false;
            return true;
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
