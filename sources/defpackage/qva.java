package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qva implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ej0 b;
    public final /* synthetic */ xp0 c;

    public /* synthetic */ qva(ej0 ej0Var, xp0 xp0Var, int i) {
        this.a = i;
        this.b = ej0Var;
        this.c = xp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        int i = this.a;
        xp0 xp0Var = this.c;
        ej0 ej0Var = this.b;
        switch (i) {
            case 0:
                uva uvaVar = xp0Var.a;
                try {
                    sp0 sp0Var = (sp0) ((jy4) ej0Var.d).apply(xp0Var);
                    int i2 = sp0Var.c;
                    ok8.k("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + i2, i2 == 35 || i2 == 256 || i2 == 4101);
                    ((ah6) ok8.w()).execute(new xu8(7, uvaVar, (Bitmap) ((yx4) ej0Var.x).d(sp0Var)));
                    return;
                } catch (Exception e) {
                    xp0Var.b.close();
                    b21.w("ProcessingNode", "process postview input packet failed.", e);
                    return;
                }
            case 1:
                qva qvaVar = new qva(ej0Var, xp0Var, 2);
                Trace.beginSection(xdc.v("CX:".concat("processInputPacket")));
                try {
                    qvaVar.run();
                    return;
                } finally {
                    Trace.endSection();
                }
            default:
                uva uvaVar2 = xp0Var.a;
                try {
                    ((wp0) ej0Var.c).d.size();
                    uvaVar2.getClass();
                    ((ah6) ok8.w()).execute(new xu8(8, uvaVar2, ej0Var.c(xp0Var)));
                    return;
                } catch (OutOfMemoryError e2) {
                    ((ah6) ok8.w()).execute(new xu8(9, uvaVar2, new jv6(0, "Processing failed due to low memory.", e2)));
                    return;
                } catch (RuntimeException e3) {
                    ((ah6) ok8.w()).execute(new xu8(9, uvaVar2, new jv6(0, "Processing failed.", e3)));
                    return;
                } catch (jv6 e4) {
                    ((ah6) ok8.w()).execute(new xu8(9, uvaVar2, e4));
                    return;
                }
        }
    }
}
