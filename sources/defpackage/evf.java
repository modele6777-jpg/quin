package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class evf implements View.OnApplyWindowInsetsListener {
    public h8g a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ lm9 c;

    public evf(View view, lm9 lm9Var) {
        this.b = view;
        this.c = lm9Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        h8g h8gVarC = h8g.c(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        lm9 lm9Var = this.c;
        if (i < 30) {
            fvf.a(windowInsets, this.b);
            if (h8gVarC.equals(this.a)) {
                return lm9Var.i(view, h8gVarC).b();
            }
        }
        this.a = h8gVarC;
        h8g h8gVarI = lm9Var.i(view, h8gVarC);
        if (i >= 30) {
            return h8gVarI.b();
        }
        WeakHashMap weakHashMap = nvf.a;
        view.requestApplyInsets();
        return h8gVarI.b();
    }
}
