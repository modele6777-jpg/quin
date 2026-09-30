package defpackage;

import android.util.Size;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x2e extends ysd {
    public static boolean q() {
        return s74.a().b(PixelJpegRSupportedQuirk.class) != null;
    }

    @Override // defpackage.ysd
    public final Size[] f(int i) {
        if (i == 4101 && q()) {
            return null;
        }
        return super.f(i);
    }

    @Override // defpackage.ysd
    public final Integer[] g() {
        Integer[] numArrG = super.g();
        if (!q()) {
            return numArrG;
        }
        if (numArrG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : numArrG) {
            if (num.intValue() != 4101) {
                arrayList.add(num);
            }
        }
        return (Integer[]) arrayList.toArray(new Integer[0]);
    }

    @Override // defpackage.ysd
    public final long h(int i, Size size) {
        size.getClass();
        if (i == 4101 && q()) {
            return 0L;
        }
        return super.h(i, size);
    }

    @Override // defpackage.ysd
    public final Size[] k(int i) {
        if (i == 4101 && q()) {
            return null;
        }
        return super.k(i);
    }
}
