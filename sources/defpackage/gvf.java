package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gvf {
    public static h8g a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        h8g h8gVarC = h8g.c(rootWindowInsets, null);
        e8g e8gVar = h8gVarC.a;
        e8gVar.y(h8gVarC);
        View rootView = view.getRootView();
        e8gVar.d(rootView);
        e8gVar.p(rootView);
        e8gVar.q();
        return h8gVarC;
    }
}
