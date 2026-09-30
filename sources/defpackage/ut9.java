package defpackage;

import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ut9 {
    public final yg1 a;
    public final ExcludedSupportedSizesQuirk b = (ExcludedSupportedSizesQuirk) s74.a().b(ExcludedSupportedSizesQuirk.class);
    public final ExtraSupportedOutputSizeQuirk c = (ExtraSupportedOutputSizeQuirk) s74.a().b(ExtraSupportedOutputSizeQuirk.class);

    public ut9(yg1 yg1Var) {
        this.a = yg1Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    public final Size[] a(Size[] sizeArr, int i) {
        Size[] sizeArr2;
        sizeArr.getClass();
        ArrayList arrayList = new ArrayList(new yc0(sizeArr, false));
        if (this.c != null) {
            if (i == 34) {
                String str = Build.MANUFACTURER;
                str.getClass();
                if (!str.equalsIgnoreCase("Motorola")) {
                    String str2 = Build.BRAND;
                    str2.getClass();
                    if (!str2.equalsIgnoreCase("Motorola")) {
                        sizeArr2 = new Size[0];
                    } else if ("moto e5 play".equalsIgnoreCase(Build.MODEL)) {
                        sizeArr2 = new Size[]{new Size(1440, 1080), new Size(960, 720)};
                    } else {
                        sizeArr2 = new Size[0];
                    }
                } else if ("moto e5 play".equalsIgnoreCase(Build.MODEL)) {
                    sizeArr2 = new Size[]{new Size(1440, 1080), new Size(960, 720)};
                } else {
                    sizeArr2 = new Size[0];
                }
            } else {
                sizeArr2 = new Size[0];
            }
            if (sizeArr2.length != 0) {
                List listAsList = Arrays.asList(sizeArr2);
                listAsList.getClass();
                arrayList.addAll(listAsList);
            }
        }
        yg1 yg1Var = this.a;
        if (yg1Var != null && this.b != null) {
            String str3 = ((nc1) yg1Var).a;
            str3.getClass();
            boolean zO = z7f.O();
            Collection<?> collectionI = pu4.a;
            if (zO) {
                if (str3.equals("0") && i == 256) {
                    collectionI = t72.I(new Size(4160, 3120), new Size(4000, 3000));
                }
            } else if (z7f.P()) {
                if (str3.equals("0") && i == 256) {
                    collectionI = t72.I(new Size(4160, 3120), new Size(4000, 3000));
                }
            } else if (z7f.M()) {
                if (str3.equals("0") && (i == 34 || i == 35)) {
                    collectionI = t72.I(new Size(720, 720), new Size(Constants.MINIMAL_ERROR_STATUS_CODE, Constants.MINIMAL_ERROR_STATUS_CODE));
                }
            } else if (z7f.T()) {
                if (str3.equals("0")) {
                    if (i == 34) {
                        collectionI = t72.I(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    } else if (i == 35) {
                        collectionI = t72.I(new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    }
                } else if (str3.equals("1") && (i == 34 || i == 35)) {
                    collectionI = t72.I(new Size(3264, 2448), new Size(3264, 1836), new Size(2448, 2448), new Size(1920, 1920), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                }
            } else if (z7f.S()) {
                if (str3.equals("0")) {
                    if (i == 34) {
                        collectionI = t72.I(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    } else if (i == 35) {
                        collectionI = t72.I(new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    }
                } else if (str3.equals("1") && (i == 34 || i == 35)) {
                    collectionI = t72.I(new Size(2576, 1932), new Size(2560, 1440), new Size(1920, 1920), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                }
            } else if (z7f.Q()) {
                if (str3.equals("0") && i == 256) {
                    collectionI = t72.H(new Size(9280, 6944));
                }
            } else if (z7f.R()) {
                if (i == 35) {
                    collectionI = t72.I(new Size(3840, 2160), new Size(3264, 2448), new Size(3200, 2400), new Size(2688, 1512), new Size(2592, 1944), new Size(2592, 1940), new Size(1920, 1440));
                }
            } else if (z7f.N()) {
                if (i == 35) {
                    collectionI = t72.I(new Size(4032, 3024), new Size(4000, 3000), new Size(3264, 2448), new Size(3200, 2400), new Size(3024, 3024), new Size(2976, 2976), new Size(2448, 2448));
                }
            } else if (!z7f.U()) {
                b21.W("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
            } else if (str3.equals("1") && i == 35) {
                collectionI = t72.I(new Size(1280, 720), new Size(1920, 1080), new Size(2304, 1296), new Size(640, 360), new Size(177, 144), new Size(2336, 1080), new Size(2400, 1080), new Size(1920, 824), new Size(1088, 1088), new Size(1728, 1728), new Size(2736, 2736), new Size(1824, 712));
            }
            if (!collectionI.isEmpty()) {
                arrayList.removeAll(collectionI);
            }
        }
        if (arrayList.isEmpty()) {
            b21.W("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
