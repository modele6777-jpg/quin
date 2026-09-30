package defpackage;

import android.graphics.Matrix;
import android.media.Image;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ls implements iw6 {
    public final Image a;
    public final m6c[] b;
    public final gp0 c;

    public ls(Image image) {
        this.a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.b = new m6c[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.b[i] = new m6c(2, planes[i]);
            }
        } else {
            this.b = new m6c[0];
        }
        this.c = new gp0(wde.b, image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // defpackage.iw6
    public final int c() {
        return this.a.getHeight();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.iw6
    public final int d() {
        return this.a.getWidth();
    }

    @Override // defpackage.iw6
    public final int getFormat() {
        return this.a.getFormat();
    }

    @Override // defpackage.iw6
    public final Image r() {
        return this.a;
    }

    @Override // defpackage.iw6
    public final vv6 u0() {
        return this.c;
    }

    @Override // defpackage.iw6
    public final m6c[] v() {
        return this.b;
    }
}
