package defpackage;

import android.media.Image;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class js implements kx6 {
    public final Image a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public js(Image image) {
        this.a = image;
        this.b = image.getFormat();
        this.c = image.getWidth();
        this.d = image.getHeight();
        this.e = image.getTimestamp();
    }

    @Override // defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        boolean zEquals = em7Var.equals(job.a.b(Image.class));
        Image image = this.a;
        if (zEquals) {
            return image;
        }
        if (Build.VERSION.SDK_INT > 27) {
            return s.i0(image, em7Var);
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final String toString() {
        return "Image-" + y2e.a(this.b) + "-w" + this.c + 'h' + this.d + "-t" + this.e;
    }
}
