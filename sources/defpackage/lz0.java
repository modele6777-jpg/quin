package defpackage;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import io.sentry.android.replay.screenshot.c;
import io.sentry.q5;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lz0 implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lz0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((a26) obj).d(Integer.valueOf(i));
                break;
            default:
                c cVar = (c) obj;
                if (!cVar.k.get()) {
                    if (i != 0) {
                        cVar.c.getLogger().i(q5.ERROR, tec.e(i, "Canvas Strategy: PixelCopy failed with code "), new Object[0]);
                        cVar.i.set(false);
                        break;
                    } else {
                        cVar.i.set(true);
                        Bitmap bitmap = cVar.e;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            cVar.b.C0(bitmap);
                            break;
                        }
                    }
                } else {
                    cVar.c.getLogger().i(q5.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
                    break;
                }
                break;
        }
    }
}
