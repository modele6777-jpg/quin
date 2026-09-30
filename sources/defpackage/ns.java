package defpackage;

import android.media.ImageWriter;
import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ns implements ImageWriter.OnImageReleasedListener, yff, AutoCloseable {
    public final ImageWriter a;
    public final int b;
    public final zh0 c = vpf.o(null);

    public ns(ImageWriter imageWriter, int i) {
        this.a = imageWriter;
        this.b = i;
        imageWriter.getMaxImages();
        imageWriter.getFormat();
    }

    @Override // defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        if (em7Var.equals(job.a.b(ImageWriter.class))) {
            return this.a;
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(ImageWriter imageWriter) {
        if (this.c.a == null) {
            return;
        }
        r3.f();
    }

    public final String toString() {
        return "ImageWriter-" + y2e.a(this.a.getFormat()) + '-' + ((Object) ("Input-" + this.b));
    }
}
