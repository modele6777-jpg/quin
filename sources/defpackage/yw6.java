package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yw6 {
    public static final q95 a = new q95(h3f.a);
    public static final q95 b = new q95(erf.b);
    public static final q95 c = new q95(null);
    public static final q95 d;
    public static final q95 e;
    public static final q95 f;
    public static final q95 g;

    static {
        Boolean bool = Boolean.TRUE;
        d = new q95(bool);
        e = new q95(null);
        f = new q95(bool);
        g = new q95(Boolean.FALSE);
    }

    public static final Bitmap.Config a(as9 as9Var) {
        return (Bitmap.Config) b21.A(as9Var, b);
    }

    public static final ColorSpace b(as9 as9Var) {
        return (ColorSpace) b21.A(as9Var, c);
    }
}
