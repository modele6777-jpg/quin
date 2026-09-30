package defpackage;

import android.app.PendingIntent;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f6d implements AutoCloseable {
    public final Bitmap a;
    public ykc b;

    public f6d(Bitmap bitmap, ykc ykcVar) {
        this.a = bitmap;
        this.b = ykcVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws PendingIntent.CanceledException {
        ykc ykcVar = this.b;
        if (ykcVar != null) {
            ykcVar.invoke();
        }
        this.b = null;
    }
}
