package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;
import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zy implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ imb b;
    public final /* synthetic */ nm3 c;

    public /* synthetic */ zy(nm3 nm3Var, imb imbVar, int i) {
        this.a = i;
        this.c = nm3Var;
        this.b = imbVar;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        int i = this.a;
        bpa bpaVar = bpa.a;
        imb imbVar = this.b;
        nm3 nm3Var = this.c;
        switch (i) {
            case 0:
                Size size = imageInfo.getSize();
                int width = size.getWidth();
                int height = size.getHeight();
                as9 as9Var = ((cz) nm3Var).b;
                ykd ykdVar = as9Var.b;
                zdc zdcVar = as9Var.c;
                q95 q95Var = vw6.b;
                long jQ = y7h.q(width, height, ykdVar, zdcVar, (ykd) b21.A(as9Var, q95Var));
                int i2 = (int) (jQ >> 32);
                int i3 = (int) (jQ & 4294967295L);
                if (width > 0 && height > 0 && (width != i2 || height != i3)) {
                    as9 as9Var2 = ((cz) nm3Var).b;
                    double dR = y7h.r(width, height, i2, i3, as9Var2.c, (ykd) b21.A(as9Var2, q95Var));
                    boolean z = dR < 1.0d;
                    imbVar.element = z;
                    if (z || ((cz) nm3Var).b.d == bpaVar) {
                        imageDecoder.setTargetSize(ym8.K(((double) width) * dR), ym8.K(dR * ((double) height)));
                    }
                }
                as9 as9Var3 = ((cz) nm3Var).b;
                imageDecoder.setAllocator(qk2.G(yw6.a(as9Var3)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) b21.A(as9Var3, yw6.g)).booleanValue() ? 1 : 0);
                q95 q95Var2 = yw6.c;
                if (((ColorSpace) b21.A(as9Var3, q95Var2)) != null) {
                    imageDecoder.setTargetColorSpace((ColorSpace) b21.A(as9Var3, q95Var2));
                }
                if (b21.A(as9Var3, tw6.b) != null) {
                    r3.f();
                } else {
                    imageDecoder.setPostProcessor(null);
                }
                break;
            default:
                Size size2 = imageInfo.getSize();
                int width2 = size2.getWidth();
                int height2 = size2.getHeight();
                as9 as9Var4 = ((n1e) nm3Var).c;
                ykd ykdVar2 = as9Var4.b;
                zdc zdcVar2 = as9Var4.c;
                q95 q95Var3 = vw6.b;
                long jQ2 = y7h.q(width2, height2, ykdVar2, zdcVar2, (ykd) b21.A(as9Var4, q95Var3));
                int i4 = (int) (jQ2 >> 32);
                int i5 = (int) (jQ2 & 4294967295L);
                if (width2 > 0 && height2 > 0 && (width2 != i4 || height2 != i5)) {
                    as9 as9Var5 = ((n1e) nm3Var).c;
                    double dR2 = y7h.r(width2, height2, i4, i5, as9Var5.c, (ykd) b21.A(as9Var5, q95Var3));
                    boolean z2 = dR2 < 1.0d;
                    imbVar.element = z2;
                    if (z2 || ((n1e) nm3Var).c.d == bpaVar) {
                        imageDecoder.setTargetSize(ym8.K(((double) width2) * dR2), ym8.K(dR2 * ((double) height2)));
                    }
                }
                imageDecoder.setOnPartialImageListener(new k1e());
                as9 as9Var6 = ((n1e) nm3Var).c;
                imageDecoder.setAllocator(qk2.G(yw6.a(as9Var6)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) b21.A(as9Var6, yw6.g)).booleanValue() ? 1 : 0);
                q95 q95Var4 = yw6.c;
                if (((ColorSpace) b21.A(as9Var6, q95Var4)) != null) {
                    imageDecoder.setTargetColorSpace((ColorSpace) b21.A(as9Var6, q95Var4));
                }
                imageDecoder.setUnpremultipliedRequired(!((Boolean) b21.A(as9Var6, yw6.d)).booleanValue());
                break;
        }
    }
}
