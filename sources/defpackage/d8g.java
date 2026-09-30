package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d8g extends c8g {
    public d8g(h8g h8gVar, WindowInsets windowInsets) {
        super(h8gVar, windowInsets);
    }

    @Override // defpackage.w7g, defpackage.e8g
    public List<Rect> f(int i) {
        return this.c.getBoundingRects(g8g.a(i));
    }

    @Override // defpackage.w7g, defpackage.e8g
    public List<Rect> g(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(g8g.a(i));
    }

    public d8g(h8g h8gVar, d8g d8gVar) {
        super(h8gVar, d8gVar);
    }

    @Override // defpackage.w7g, defpackage.e8g
    public void q() {
    }
}
