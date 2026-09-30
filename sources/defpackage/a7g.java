package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a7g extends vwf {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7g b;

    public /* synthetic */ a7g(c7g c7gVar, int i) {
        this.a = i;
        this.b = c7gVar;
    }

    @Override // defpackage.uwf
    public final void c() {
        View view;
        int i = this.a;
        c7g c7gVar = this.b;
        switch (i) {
            case 0:
                if (c7gVar.o && (view = c7gVar.g) != null) {
                    view.setTranslationY(0.0f);
                    c7gVar.d.setTranslationY(0.0f);
                }
                c7gVar.d.setVisibility(8);
                c7gVar.d.setTransitioning(false);
                c7gVar.s = null;
                a90 a90Var = c7gVar.k;
                if (a90Var != null) {
                    a90Var.L(c7gVar.j);
                    c7gVar.j = null;
                    c7gVar.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c7gVar.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = nvf.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                c7gVar.s = null;
                c7gVar.d.requestLayout();
                break;
        }
    }
}
