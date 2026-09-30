package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class fs8 {
    public final Context a;
    public final qr8 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public ks8 h;
    public ds8 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final es8 k = new es8(this);

    public fs8(Context context, qr8 qr8Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = qr8Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final ds8 a() {
        ds8 rydVar = this.i;
        if (rydVar == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (iMin >= dimensionPixelSize) {
                rydVar = new su1(context2, this.e, this.d, this.c);
            } else {
                rydVar = new ryd(context2, this.b, this.e, this.d, this.c);
            }
            rydVar.l(this.b);
            rydVar.r(this.k);
            rydVar.n(this.e);
            rydVar.g(this.h);
            rydVar.o(this.g);
            rydVar.p(this.f);
            this.i = rydVar;
        }
        return rydVar;
    }

    public final boolean b() {
        ds8 ds8Var = this.i;
        return ds8Var != null && ds8Var.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        ds8 ds8VarA = a();
        ds8VarA.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            ds8VarA.q(i);
            ds8VarA.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            ds8VarA.a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        ds8VarA.f();
    }
}
