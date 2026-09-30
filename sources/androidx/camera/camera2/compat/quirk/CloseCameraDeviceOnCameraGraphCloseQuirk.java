package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import defpackage.c5e;
import defpackage.g9b;
import defpackage.pa7;
import defpackage.qd0;
import defpackage.t72;
import defpackage.z7c;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;", "Lg9b;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class CloseCameraDeviceOnCameraGraphCloseQuirk implements g9b {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;

    /* JADX WARN: Code duplicated, block: B:14:0x0063  */
    /* JADX WARN: Code duplicated, block: B:17:0x0078  */
    /* JADX WARN: Code duplicated, block: B:20:0x0082  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095 A[EDGE_INSN: B:23:0x0095->B:24:0x0096 BREAK  A[LOOP:0: B:18:0x007c->B:37:?]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:? A[LOOP:0: B:18:0x007c->B:37:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0048  */
    /* JADX WARN: Code duplicated, block: B:9:0x004a  */
    static {
        String lowerCase;
        boolean z;
        List listI;
        Iterator it;
        String str;
        String str2;
        boolean z2;
        int i;
        String str3 = Build.HARDWARE;
        a = pa7.t(str3, "samsungexynos7570");
        b = pa7.t(str3, "samsungexynos7870");
        String str4 = Build.MANUFACTURER;
        str4.getClass();
        boolean z3 = false;
        if (str4.equalsIgnoreCase("Xiaomi")) {
            String str5 = Build.DEVICE;
            str5.getClass();
            lowerCase = str5.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (qd0.V(new String[]{"aurora", "houji"}, lowerCase)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            String str6 = Build.BRAND;
            str6.getClass();
            if (str6.equalsIgnoreCase("Xiaomi")) {
                String str7 = Build.DEVICE;
                str7.getClass();
                lowerCase = str7.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (qd0.V(new String[]{"aurora", "houji"}, lowerCase)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        c = z;
        str4.getClass();
        if (!str4.equalsIgnoreCase("Sony")) {
            String str8 = Build.BRAND;
            str8.getClass();
            if (!str8.equalsIgnoreCase("Sony")) {
                z2 = false;
                break;
            }
            listI = t72.I("XQ-DQ", "SO", "A301SO");
            if (listI.isEmpty()) {
                it = listI.iterator();
                while (true) {
                    if (it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    str = (String) it.next();
                    str2 = Build.DEVICE;
                    str2.getClass();
                    if (c5e.C(str2, str, true)) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
        } else {
            listI = t72.I("XQ-DQ", "SO", "A301SO");
            if (listI.isEmpty()) {
                it = listI.iterator();
                while (true) {
                    if (it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    str = (String) it.next();
                    str2 = Build.DEVICE;
                    str2.getClass();
                    if (c5e.C(str2, str, true)) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
        }
        d = z2;
        String str9 = Build.MANUFACTURER;
        str9.getClass();
        if (str9.equalsIgnoreCase("Samsung")) {
            i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                z3 = true;
            }
        } else {
            String str10 = Build.BRAND;
            str10.getClass();
            if (str10.equalsIgnoreCase("Samsung")) {
                i = Build.VERSION.SDK_INT;
                if (i >= 31 && i <= 34) {
                    z3 = true;
                }
            }
        }
        e = z3;
    }
}
