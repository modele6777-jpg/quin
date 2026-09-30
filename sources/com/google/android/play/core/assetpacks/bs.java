package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import defpackage.egg;
import defpackage.hfc;
import defpackage.ifg;
import defpackage.ks0;
import defpackage.r82;
import defpackage.vgg;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bs {
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;

    public bs(String str, int i, int i2, long j, long j2, int i3, int i4, String str2, String str3) {
        if (str == null) {
            r82.g("Null name");
            throw null;
        }
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = i3;
        this.g = i4;
        if (str2 == null) {
            r82.g("Null availableVersionTag");
            throw null;
        }
        this.h = str2;
        if (str3 != null) {
            this.i = str3;
        } else {
            r82.g("Null installedVersionTag");
            throw null;
        }
    }

    public static bs a(Bundle bundle, String str, egg eggVar, vgg vggVar, ifg ifgVar) {
        double dDoubleValue;
        int i;
        int i2;
        int iA = ifgVar.a(bundle.getInt(hfc.b("status", str)));
        int i3 = bundle.getInt(hfc.b("error_code", str));
        long j = bundle.getLong(hfc.b("bytes_downloaded", str));
        long j2 = bundle.getLong(hfc.b("total_bytes_to_download", str));
        synchronized (eggVar) {
            Double d = (Double) eggVar.a.get(str);
            dDoubleValue = d == null ? 0.0d : d.doubleValue();
        }
        long j3 = bundle.getLong(hfc.b("pack_version", str));
        long j4 = bundle.getLong(hfc.b("pack_base_version", str));
        int i4 = 1;
        if (iA == 4) {
            if (j4 != 0 && j4 != j3) {
                i4 = 2;
            }
            i = i4;
            i2 = 4;
        } else {
            i = 1;
            i2 = iA;
        }
        return new bs(str, i2, i3, j, j2, (int) Math.rint(dDoubleValue * 100.0d), i, bundle.getString(hfc.b("pack_version_tag", str), String.valueOf(bundle.getInt("app_version_code"))), vggVar.a(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bs) {
            bs bsVar = (bs) obj;
            if (this.a.equals(bsVar.a) && this.b == bsVar.b && this.c == bsVar.c && this.d == bsVar.d && this.e == bsVar.e && this.f == bsVar.f && this.g == bsVar.g && this.h.equals(bsVar.h) && this.i.equals(bsVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.e;
        long j2 = this.d;
        return this.i.hashCode() ^ (((((((((((((((iHashCode * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetPackState{name=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", errorCode=");
        sb.append(this.c);
        sb.append(", bytesDownloaded=");
        sb.append(this.d);
        sb.append(", totalBytesToDownload=");
        sb.append(this.e);
        sb.append(", transferProgressPercentage=");
        sb.append(this.f);
        sb.append(", updateAvailability=");
        sb.append(this.g);
        sb.append(", availableVersionTag=");
        sb.append(this.h);
        sb.append(", installedVersionTag=");
        return ks0.l(sb, this.i, "}");
    }
}
