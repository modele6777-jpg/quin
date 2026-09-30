package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class c8g extends b8g {
    public static final h8g x = h8g.c(WindowInsets.CONSUMED, null);

    public c8g(h8g h8gVar, WindowInsets windowInsets) {
        super(h8gVar, windowInsets);
    }

    @Override // defpackage.a8g, defpackage.w7g, defpackage.e8g
    public x47 i(int i) {
        return x47.c(this.c.getInsets(g8g.a(i)));
    }

    @Override // defpackage.a8g, defpackage.w7g, defpackage.e8g
    public x47 j(int i) {
        return x47.c(this.c.getInsetsIgnoringVisibility(g8g.a(i)));
    }

    @Override // defpackage.a8g, defpackage.w7g, defpackage.e8g
    public boolean u(int i) {
        return this.c.isVisible(g8g.a(i));
    }

    public c8g(h8g h8gVar, c8g c8gVar) {
        super(h8gVar, c8gVar);
    }

    @Override // defpackage.w7g, defpackage.e8g
    public void p(View view) {
    }
}
