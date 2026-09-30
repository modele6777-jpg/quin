package defpackage;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rr5 {
    public final int A;
    public final float B;
    public final int C;
    public final boolean D;
    public final float E;
    public final byte[] F;
    public final int G;
    public final e82 H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public int U;
    public final String a;
    public final String b;
    public final jy6 c;
    public final String d;
    public final int e;
    public final int f;
    public final float g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final String l;
    public final su8 m;
    public final String n;
    public final String o;
    public final String p;
    public final int q;
    public final int r;
    public final List s;
    public final xp4 t;
    public final long u;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    static {
        new rr5(new qr5());
        pqf.D(0);
        pqf.D(1);
        pqf.D(2);
        pqf.D(3);
        kv2.v(4, 5, 6, 7, 8);
        kv2.v(9, 10, 11, 12, 13);
        kv2.v(14, 15, 16, 17, 18);
        kv2.v(19, 20, 21, 22, 23);
        kv2.v(24, 25, 26, 27, 28);
        kv2.v(29, 30, 31, 32, 33);
        kv2.v(34, 35, 36, 37, 38);
        pqf.D(39);
        pqf.D(40);
        pqf.D(41);
    }

    public rr5(qr5 qr5Var) {
        boolean z;
        String str;
        this.a = qr5Var.a;
        String strI = pqf.I(qr5Var.d);
        this.d = strI;
        if (qr5Var.c.isEmpty() && qr5Var.b != null) {
            this.c = jy6.s(new fu7(strI, qr5Var.b));
            this.b = qr5Var.b;
        } else if (qr5Var.c.isEmpty() || qr5Var.b != null) {
            if (!qr5Var.c.isEmpty() || qr5Var.b != null) {
                int i = 0;
                while (true) {
                    if (i >= qr5Var.c.size()) {
                        z = false;
                        break;
                    } else {
                        if (((fu7) qr5Var.c.get(i)).b.equals(qr5Var.b)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = true;
                break;
            }
            pa7.J(z);
            this.c = qr5Var.c;
            this.b = qr5Var.b;
        } else {
            jy6 jy6Var = qr5Var.c;
            this.c = jy6Var;
            Iterator it = jy6Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((fu7) jy6Var.get(0)).b;
                    break;
                }
                fu7 fu7Var = (fu7) it.next();
                if (TextUtils.equals(fu7Var.a, strI)) {
                    str = fu7Var.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = qr5Var.e;
        pa7.I("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", qr5Var.h == 0 || (qr5Var.f & 32768) != 0);
        this.f = qr5Var.f;
        this.g = qr5Var.g;
        this.h = qr5Var.h;
        int i2 = qr5Var.i;
        this.i = i2;
        int i3 = qr5Var.j;
        this.j = i3;
        this.k = i3 != -1 ? i3 : i2;
        this.l = qr5Var.k;
        this.m = qr5Var.l;
        this.n = qr5Var.m;
        this.o = qr5Var.n;
        this.p = qr5Var.o;
        this.q = qr5Var.p;
        this.r = qr5Var.q;
        List list = qr5Var.r;
        this.s = list == null ? Collections.EMPTY_LIST : list;
        xp4 xp4Var = qr5Var.s;
        this.t = xp4Var;
        this.u = qr5Var.t;
        this.v = qr5Var.u;
        this.w = qr5Var.v;
        this.x = qr5Var.w;
        this.y = qr5Var.x;
        this.z = qr5Var.y;
        this.A = qr5Var.z;
        this.B = qr5Var.A;
        int i4 = qr5Var.B;
        this.C = i4 == -1 ? 0 : i4;
        this.D = qr5Var.C;
        float f = qr5Var.D;
        this.E = f == -1.0f ? 1.0f : f;
        this.F = qr5Var.E;
        this.G = qr5Var.F;
        this.H = qr5Var.G;
        this.I = qr5Var.H;
        int i5 = qr5Var.I;
        this.J = i5;
        int i6 = qr5Var.J;
        this.K = i6;
        if (i5 != -1 && i6 != -1) {
            if (!(Integer.bitCount(i6) == i5)) {
                qc0.p(rfc.l("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(i5), Integer.valueOf(i6)));
                throw null;
            }
        }
        this.L = qr5Var.K;
        this.M = qr5Var.L;
        int i7 = qr5Var.M;
        this.N = i7 == -1 ? 0 : i7;
        int i8 = qr5Var.N;
        this.O = i8 != -1 ? i8 : 0;
        this.P = qr5Var.O;
        this.Q = qr5Var.P;
        this.R = qr5Var.Q;
        this.S = qr5Var.R;
        int i9 = qr5Var.S;
        if (i9 != 0 || xp4Var == null) {
            this.T = i9;
        } else {
            this.T = 1;
        }
    }

    public static String c(rr5 rr5Var) {
        float f;
        int i;
        String str;
        String strM;
        String str2;
        if (rr5Var == null) {
            return "null";
        }
        int i2 = rr5Var.e;
        jy6 jy6Var = rr5Var.c;
        String str3 = rr5Var.d;
        int i3 = rr5Var.L;
        int i4 = rr5Var.K;
        int i5 = rr5Var.J;
        int i6 = rr5Var.I;
        int i7 = rr5Var.C;
        float f2 = rr5Var.B;
        int i8 = rr5Var.y;
        e82 e82Var = rr5Var.H;
        float f3 = rr5Var.E;
        int i9 = rr5Var.A;
        int i10 = rr5Var.z;
        int i11 = rr5Var.x;
        int i12 = rr5Var.w;
        xp4 xp4Var = rr5Var.t;
        String str4 = rr5Var.l;
        float f4 = rr5Var.g;
        int i13 = rr5Var.k;
        String str5 = rr5Var.n;
        String str6 = rr5Var.o;
        int i14 = rr5Var.f;
        ue1 ue1Var = new ue1(String.valueOf(','), 1);
        StringBuilder sbO = ub3.o("id=");
        sbO.append(rr5Var.a);
        sbO.append(", mimeType=");
        sbO.append(rr5Var.p);
        if (str6 != null) {
            sbO.append(", container=");
            sbO.append(str6);
        }
        if (str5 != null) {
            sbO.append(", primaryGroupId=");
            sbO.append(str5);
        }
        if (i13 != -1) {
            sbO.append(", bitrate=");
            sbO.append(i13);
        }
        float f5 = -1.0f;
        if (f4 != -1.0f) {
            sbO.append(", selectionPriority=");
            sbO.append(f4);
        }
        if (str4 != null) {
            sbO.append(", codecs=");
            sbO.append(str4);
        }
        if (xp4Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i15 = 0;
            while (i15 < xp4Var.d) {
                UUID uuid = xp4Var.a[i15].b;
                if (uuid.equals(d71.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(d71.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(d71.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(d71.d)) {
                    linkedHashSet.add("widevine");
                } else {
                    if (uuid.equals(d71.a)) {
                        linkedHashSet.add("universal");
                    } else {
                        linkedHashSet.add("unknown (" + uuid + ")");
                    }
                    i15++;
                    f5 = f5;
                }
                i15++;
                f5 = f5;
            }
            f = f5;
            sbO.append(", drm=[");
            ue1Var.a(sbO, linkedHashSet.iterator());
            sbO.append(']');
        } else {
            f = -1.0f;
        }
        if (i12 != -1 && i11 != -1) {
            sbO.append(", res=");
            sbO.append(i12);
            sbO.append("x");
            sbO.append(i11);
        }
        if (i10 != -1 && i9 != -1) {
            sbO.append(", decRes=");
            sbO.append(i10);
            sbO.append("x");
            sbO.append(i9);
        }
        double d = f3;
        int i16 = ui4.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbO.append(", par=");
            Object[] objArr = {Float.valueOf(f3)};
            String str7 = pqf.a;
            sbO.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (e82Var != null) {
            int i17 = e82Var.f;
            int i18 = e82Var.e;
            if ((i18 != -1 && i17 != -1) || e82Var.d()) {
                sbO.append(", color=");
                if (e82Var.d()) {
                    String strB = e82.b(e82Var.a);
                    String strA = e82.a(e82Var.b);
                    String strC = e82.c(e82Var.c);
                    Locale locale = Locale.US;
                    strM = tec.m(strB, "/", strA, "/", strC);
                } else {
                    strM = "NA/NA/NA";
                }
                if (i18 == -1 || i17 == -1) {
                    str2 = "NA/NA";
                } else {
                    str2 = i18 + "/" + i17;
                }
                sbO.append(strM + "/" + str2);
            }
        }
        if (i8 != -1) {
            sbO.append(", pixelFormat=");
            sbO.append(i8);
        }
        if (f2 != f) {
            sbO.append(", fps=");
            sbO.append(f2);
        }
        if (i7 != 0) {
            sbO.append(", rotation=");
            sbO.append(i7);
        }
        if (rr5Var.D) {
            sbO.append(", mirrorHorizontal");
        }
        if (i6 != -1) {
            sbO.append(", maxSubLayers=");
            sbO.append(i6);
        }
        if (i5 != -1) {
            sbO.append(", channels=");
            sbO.append(i5);
        }
        if (i4 != -1) {
            sbO.append(", channel_mask=");
            sbO.append(i4);
        }
        if (i3 != -1) {
            sbO.append(", sample_rate=");
            sbO.append(i3);
        }
        if (str3 != null) {
            sbO.append(", language=");
            sbO.append(str3);
        }
        if (!jy6Var.isEmpty()) {
            sbO.append(", labels=[");
            ue1Var.a(sbO, tq.P(jy6Var, new t51(6)).iterator());
            sbO.append("]");
        }
        if (i2 != 0) {
            sbO.append(", selectionFlags=[");
            String str8 = pqf.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            ue1Var.a(sbO, arrayList.iterator());
            sbO.append("]");
        }
        if (i14 != 0) {
            sbO.append(", roleFlags=[");
            String str9 = pqf.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i14 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i14 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i14 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i14 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i14 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i14 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i14 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i14;
            if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            ue1Var.a(sbO, arrayList2.iterator());
            sbO.append("]");
        } else {
            i = i14;
        }
        if ((i & 32768) != 0) {
            sbO.append(", auxiliaryTrackType=");
            int i19 = rr5Var.h;
            String str10 = pqf.a;
            if (i19 == 0) {
                str = "undefined";
            } else if (i19 == 1) {
                str = "original";
            } else if (i19 == 2) {
                str = "depth-linear";
            } else if (i19 == 3) {
                str = "depth-inverse";
            } else {
                if (i19 != 4) {
                    qc0.p("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            sbO.append(str);
        }
        return sbO.toString();
    }

    public final qr5 a() {
        qr5 qr5Var = new qr5();
        qr5Var.a = this.a;
        qr5Var.b = this.b;
        qr5Var.c = this.c;
        qr5Var.d = this.d;
        qr5Var.e = this.e;
        qr5Var.f = this.f;
        qr5Var.g = this.g;
        qr5Var.i = this.i;
        qr5Var.j = this.j;
        qr5Var.k = this.l;
        qr5Var.l = this.m;
        qr5Var.m = this.n;
        qr5Var.n = this.o;
        qr5Var.o = this.p;
        qr5Var.p = this.q;
        qr5Var.q = this.r;
        qr5Var.r = this.s;
        qr5Var.s = this.t;
        qr5Var.t = this.u;
        qr5Var.u = this.v;
        qr5Var.v = this.w;
        qr5Var.w = this.x;
        qr5Var.x = this.y;
        qr5Var.y = this.z;
        qr5Var.z = this.A;
        qr5Var.A = this.B;
        qr5Var.B = this.C;
        qr5Var.C = this.D;
        qr5Var.D = this.E;
        qr5Var.E = this.F;
        qr5Var.F = this.G;
        qr5Var.G = this.H;
        qr5Var.H = this.I;
        qr5Var.I = this.J;
        qr5Var.J = this.K;
        qr5Var.K = this.L;
        qr5Var.L = this.M;
        qr5Var.M = this.N;
        qr5Var.N = this.O;
        qr5Var.O = this.P;
        qr5Var.P = this.Q;
        qr5Var.Q = this.R;
        qr5Var.R = this.S;
        qr5Var.S = this.T;
        return qr5Var;
    }

    public final boolean b(rr5 rr5Var) {
        List list = this.s;
        if (list.size() != rr5Var.s.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) rr5Var.s.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || rr5.class != obj.getClass()) {
            return false;
        }
        rr5 rr5Var = (rr5) obj;
        int i2 = this.U;
        return (i2 == 0 || (i = rr5Var.U) == 0 || i2 == i) && this.e == rr5Var.e && this.f == rr5Var.f && this.h == rr5Var.h && this.i == rr5Var.i && this.j == rr5Var.j && this.q == rr5Var.q && this.u == rr5Var.u && this.w == rr5Var.w && this.x == rr5Var.x && this.y == rr5Var.y && this.z == rr5Var.z && this.A == rr5Var.A && this.C == rr5Var.C && this.D == rr5Var.D && this.G == rr5Var.G && this.I == rr5Var.I && this.J == rr5Var.J && this.K == rr5Var.K && this.L == rr5Var.L && this.M == rr5Var.M && this.N == rr5Var.N && this.O == rr5Var.O && this.P == rr5Var.P && this.R == rr5Var.R && this.S == rr5Var.S && this.T == rr5Var.T && Float.compare(this.B, rr5Var.B) == 0 && Float.compare(this.g, rr5Var.g) == 0 && Float.compare(this.E, rr5Var.E) == 0 && Objects.equals(this.a, rr5Var.a) && Objects.equals(this.b, rr5Var.b) && this.c.equals(rr5Var.c) && Objects.equals(this.l, rr5Var.l) && Objects.equals(this.n, rr5Var.n) && Objects.equals(this.o, rr5Var.o) && Objects.equals(this.p, rr5Var.p) && Objects.equals(this.d, rr5Var.d) && Arrays.equals(this.F, rr5Var.F) && Objects.equals(this.m, rr5Var.m) && Objects.equals(this.H, rr5Var.H) && Objects.equals(this.t, rr5Var.t) && b(rr5Var);
    }

    public final int hashCode() {
        int i = this.U;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        int iFloatToIntBits = (((((((Float.floatToIntBits(this.g) + ((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31)) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31;
        String str4 = this.l;
        int iHashCode3 = (iFloatToIntBits + (str4 == null ? 0 : str4.hashCode())) * 31;
        su8 su8Var = this.m;
        int iHashCode4 = (iHashCode3 + (su8Var == null ? 0 : su8Var.hashCode())) * 961;
        String str5 = this.n;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.p;
        int iFloatToIntBits2 = ((((((((((((((((((((((((Float.floatToIntBits(this.E) + ((((((Float.floatToIntBits(this.B) + ((((((((((((((((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.q) * 31) + ((int) this.u)) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31)) * 31) + this.C) * 31) + (this.D ? 1 : 0)) * 31)) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.R) * 31) + this.S) * 31) + this.T;
        this.U = iFloatToIntBits2;
        return iFloatToIntBits2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.o);
        sb.append(", ");
        sb.append(this.p);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.x);
        sb.append(", ");
        sb.append(this.B);
        sb.append(", ");
        sb.append(this.H);
        sb.append("], [");
        sb.append(this.J);
        sb.append(", ");
        sb.append(this.K);
        sb.append(", ");
        return tec.g(this.L, "])", sb);
    }
}
