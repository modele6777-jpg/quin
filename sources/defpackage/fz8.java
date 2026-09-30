package defpackage;

import ai.askquin.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fz8 extends zb2 {
    public x16 e;
    public a09 f;
    public long g;
    public final View v;
    public final az8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz8(x16 x16Var, a09 a09Var, long j, View view, cv7 cv7Var, sw3 sw3Var, UUID uuid, jx jxVar, aw2 aw2Var) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        boolean z = false;
        this.e = x16Var;
        this.f = a09Var;
        this.g = j;
        this.v = view;
        Window window = getWindow();
        if (window == null) {
            qc0.p("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        q6c.l(window, false);
        az8 az8Var = new az8(getContext());
        az8Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        az8Var.setClipChildren(false);
        az8Var.setElevation(sw3Var.p0(8.0f));
        az8Var.setOutlineProvider(new t84(1));
        this.w = az8Var;
        setContentView(az8Var);
        az8Var.setTag(R.id.view_tree_lifecycle_owner, scc.j(view));
        az8Var.setTag(R.id.view_tree_view_model_store_owner, gdc.d(view));
        az8Var.setTag(R.id.view_tree_saved_state_registry_owner, fdc.i(view));
        f(this.e, this.f, this.g, cv7Var);
        window.getDecorView();
        int i = Build.VERSION.SDK_INT;
        o7c l8gVar = i >= 35 ? new l8g(window) : i >= 30 ? new j8g(window) : new i8g(window);
        this.f.getClass();
        long j2 = this.g;
        long j3 = y72.j;
        l8gVar.B(!faf.a(j2, j3) && ((double) abg.T(j2)) <= 0.5d);
        this.f.getClass();
        long j4 = this.g;
        if (!faf.a(j4, j3) && abg.T(j4) <= 0.5d) {
            z = true;
        }
        l8gVar.A(z);
        b().a(this, new ez8(this.f.b, aw2Var, jxVar, new zv6(15, this)));
    }

    public final void f(x16 x16Var, a09 a09Var, long j, cv7 cv7Var) {
        this.e = x16Var;
        this.f = a09Var;
        this.g = j;
        usc uscVar = a09Var.a;
        ViewGroup.LayoutParams layoutParams = this.v.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) ? false : true;
        int iOrdinal = uscVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z = true;
            } else {
                if (iOrdinal != 2) {
                    ap.c();
                    return;
                }
                z = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int iOrdinal2 = cv7Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else if (iOrdinal2 != 1) {
            ap.c();
            return;
        }
        this.w.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.e.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
