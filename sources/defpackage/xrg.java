package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xrg {
    public static final xrg f = new xrg((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public xrg(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(o5h.class);
        this.e = enumMap;
        enumMap.put(o5h.AD_USER_DATA, bool == null ? k5h.UNINITIALIZED : bool.booleanValue() ? k5h.GRANTED : k5h.DENIED);
        this.a = i;
        this.b = d();
        this.c = bool2;
        this.d = str;
    }

    public static xrg b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(o5h.class);
        o5h[] o5hVarArrA = m5h.DMA.a();
        int length = o5hVarArrA.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(o5hVarArrA[i3], q5h.e(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new xrg(enumMap, i, (Boolean) null, (String) null);
    }

    public static xrg c(int i, Bundle bundle) {
        if (bundle == null) {
            return new xrg((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(o5h.class);
        for (o5h o5hVar : m5h.DMA.a()) {
            enumMap.put(o5hVar, q5h.d(bundle.getString(o5hVar.zze)));
        }
        return new xrg(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final k5h a() {
        k5h k5hVar = (k5h) this.e.get(o5h.AD_USER_DATA);
        return k5hVar == null ? k5h.UNINITIALIZED : k5hVar;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (o5h o5hVar : m5h.DMA.a()) {
            sb.append(":");
            sb.append(q5h.h((k5h) this.e.get(o5hVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xrg)) {
            return false;
        }
        xrg xrgVar = (xrg) obj;
        if (this.b.equalsIgnoreCase(xrgVar.b) && Objects.equals(this.c, xrgVar.c)) {
            return Objects.equals(this.d, xrgVar.d);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.c;
        if (bool == null) {
            i = 3;
        } else {
            i = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(q5h.a(this.a));
        for (o5h o5hVar : m5h.DMA.a()) {
            sb.append(",");
            sb.append(o5hVar.zze);
            sb.append("=");
            k5h k5hVar = (k5h) this.e.get(o5hVar);
            if (k5hVar == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = k5hVar.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public xrg(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(o5h.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = d();
        this.c = bool;
        this.d = str;
    }
}
