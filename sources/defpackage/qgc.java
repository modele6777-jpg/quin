package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qgc extends m4 {
    public long c;
    public long[] d;
    public long[] e;

    public static Serializable B0(int i, d0a d0aVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(d0aVar.t()));
        }
        if (i == 1) {
            return Boolean.valueOf(d0aVar.z() == 1);
        }
        if (i == 2) {
            return D0(d0aVar);
        }
        if (i != 3) {
            if (i == 8) {
                return C0(d0aVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(d0aVar.t()));
                d0aVar.N(2);
                return date;
            }
            int iD = d0aVar.D();
            ArrayList arrayList = new ArrayList(iD);
            for (int i2 = 0; i2 < iD; i2++) {
                Serializable serializableB0 = B0(d0aVar.z(), d0aVar);
                if (serializableB0 != null) {
                    arrayList.add(serializableB0);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strD0 = D0(d0aVar);
            int iZ = d0aVar.z();
            if (iZ == 9) {
                return map;
            }
            Serializable serializableB1 = B0(iZ, d0aVar);
            if (serializableB1 != null) {
                map.put(strD0, serializableB1);
            }
        }
    }

    public static HashMap C0(d0a d0aVar) {
        int iD = d0aVar.D();
        HashMap map = new HashMap(iD);
        for (int i = 0; i < iD; i++) {
            String strD0 = D0(d0aVar);
            Serializable serializableB0 = B0(d0aVar.z(), d0aVar);
            if (serializableB0 != null) {
                map.put(strD0, serializableB0);
            }
        }
        return map;
    }

    public static String D0(d0a d0aVar) {
        int iG = d0aVar.G();
        int i = d0aVar.b;
        d0aVar.N(iG);
        return new String(d0aVar.a, i, iG);
    }
}
