package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ao4 implements bv6 {
    public final Drawable a;

    public ao4(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.bv6
    public final long a() {
        Drawable drawable = this.a;
        long jB = ((long) erf.b(drawable)) * 4 * ((long) erf.a(drawable));
        if (jB < 0) {
            return 0L;
        }
        return jB;
    }

    @Override // defpackage.bv6
    public final boolean b() {
        return false;
    }

    @Override // defpackage.bv6
    public final int c() {
        return erf.a(this.a);
    }

    @Override // defpackage.bv6
    public final int d() {
        return erf.b(this.a);
    }

    @Override // defpackage.bv6
    public final void e(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ao4) && pa7.t(this.a, ((ao4) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
