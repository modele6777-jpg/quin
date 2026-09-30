package androidx.camera.core.internal.compat.quirk;

import defpackage.g9b;
import defpackage.hv6;
import defpackage.oif;
import defpackage.wta;
import defpackage.xjf;
import defpackage.zjf;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements g9b {
    public static final HashSet a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean b(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() == 3) {
            Iterator it = linkedHashSet.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (it.hasNext()) {
                oif oifVar = (oif) it.next();
                if (oifVar instanceof wta) {
                    z = true;
                } else if (oifVar instanceof hv6) {
                    z3 = true;
                } else if (oifVar.i.h(xjf.p0)) {
                    z2 = oifVar.i.s() == zjf.d;
                }
            }
            if (z && z2 && z3) {
                return true;
            }
        }
        return false;
    }
}
