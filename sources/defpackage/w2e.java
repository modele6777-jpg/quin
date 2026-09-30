package defpackage;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w2e {
    public final ut9 a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final ysd d;

    public w2e(StreamConfigurationMap streamConfigurationMap, ut9 ut9Var) {
        ut9Var.getClass();
        this.a = ut9Var;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        new LinkedHashMap();
        this.d = Build.VERSION.SDK_INT >= 34 ? new x2e(1, streamConfigurationMap) : new ysd(1, streamConfigurationMap);
    }

    public final Size[] a(int i) {
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap.containsKey(numValueOf)) {
            Size[] sizeArr = (Size[]) linkedHashMap.get(Integer.valueOf(i));
            if (sizeArr != null) {
                return (Size[]) sizeArr.clone();
            }
            return null;
        }
        Size[] sizeArrF = this.d.f(i);
        if (sizeArrF != null && sizeArrF.length != 0) {
            sizeArrF = this.a.a(sizeArrF, i);
        }
        linkedHashMap.put(Integer.valueOf(i), sizeArrF);
        if (sizeArrF != null) {
            return (Size[]) sizeArrF.clone();
        }
        return null;
    }

    public final Size[] b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.b;
        Size[] sizeArrK = null;
        if (linkedHashMap.containsKey(numValueOf)) {
            Size[] sizeArr = (Size[]) linkedHashMap.get(Integer.valueOf(i));
            if (sizeArr != null) {
                return (Size[]) sizeArr.clone();
            }
            return null;
        }
        try {
            sizeArrK = this.d.k(i);
        } catch (Throwable th) {
            b21.X("StreamConfigurationMapCompat", "Failed to get output sizes for " + i, th);
        }
        if (sizeArrK != null && sizeArrK.length != 0) {
            Size[] sizeArrA = this.a.a(sizeArrK, i);
            linkedHashMap.put(Integer.valueOf(i), sizeArrA);
            return (Size[]) sizeArrA.clone();
        }
        b21.W("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
        return sizeArrK;
    }
}
