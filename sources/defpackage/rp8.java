package defpackage;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rp8 {
    public static final rp8 C;
    public final Integer A;
    public final jy6 B;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final byte[] f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Boolean k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final CharSequence s;
    public final CharSequence t;
    public final CharSequence u;
    public final CharSequence v;
    public final Integer w;
    public final Integer x;
    public final CharSequence y;
    public final CharSequence z;

    static {
        r23 r23Var = new r23();
        ey6 ey6Var = jy6.b;
        r23Var.A = yob.e;
        C = new rp8(r23Var);
        kv2.v(0, 1, 2, 3, 4);
        kv2.v(5, 6, 8, 9, 10);
        kv2.v(11, 12, 13, 14, 15);
        kv2.v(16, 17, 18, 19, 20);
        kv2.v(21, 22, 23, 24, 25);
        kv2.v(26, 27, 28, 29, 30);
        kv2.v(31, 32, 33, 34, 35);
        pqf.D(1000);
    }

    public rp8(r23 r23Var) {
        Boolean boolValueOf = (Boolean) r23Var.k;
        Integer numValueOf = (Integer) r23Var.j;
        Integer numValueOf2 = (Integer) r23Var.z;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        case 14:
                        case 15:
                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i3 = i;
                }
                numValueOf = Integer.valueOf(i3);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.a = (CharSequence) r23Var.a;
        this.b = (CharSequence) r23Var.b;
        this.c = (CharSequence) r23Var.c;
        this.d = (CharSequence) r23Var.d;
        this.e = (CharSequence) r23Var.e;
        this.f = (byte[]) r23Var.f;
        this.g = (Integer) r23Var.g;
        this.h = (Integer) r23Var.h;
        this.i = (Integer) r23Var.i;
        this.j = numValueOf;
        this.k = boolValueOf;
        Integer num = (Integer) r23Var.l;
        this.l = num;
        this.m = num;
        this.n = (Integer) r23Var.m;
        this.o = (Integer) r23Var.n;
        this.p = (Integer) r23Var.o;
        this.q = (Integer) r23Var.p;
        this.r = (Integer) r23Var.q;
        this.s = (CharSequence) r23Var.r;
        this.t = (CharSequence) r23Var.s;
        this.u = (CharSequence) r23Var.t;
        this.v = (CharSequence) r23Var.u;
        this.w = (Integer) r23Var.v;
        this.x = (Integer) r23Var.w;
        this.y = (CharSequence) r23Var.x;
        this.z = (CharSequence) r23Var.y;
        this.A = numValueOf2;
        this.B = (jy6) r23Var.A;
    }

    public final r23 a() {
        r23 r23Var = new r23();
        r23Var.a = this.a;
        r23Var.b = this.b;
        r23Var.c = this.c;
        r23Var.d = this.d;
        r23Var.e = this.e;
        r23Var.f = this.f;
        r23Var.g = this.g;
        r23Var.h = this.h;
        r23Var.i = this.i;
        r23Var.j = this.j;
        r23Var.k = this.k;
        r23Var.l = this.m;
        r23Var.m = this.n;
        r23Var.n = this.o;
        r23Var.o = this.p;
        r23Var.p = this.q;
        r23Var.q = this.r;
        r23Var.r = this.s;
        r23Var.s = this.t;
        r23Var.t = this.u;
        r23Var.v = this.w;
        r23Var.u = this.v;
        r23Var.w = this.x;
        r23Var.x = this.y;
        r23Var.y = this.z;
        r23Var.z = this.A;
        r23Var.A = this.B;
        return r23Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rp8.class != obj.getClass()) {
            return false;
        }
        rp8 rp8Var = (rp8) obj;
        return TextUtils.equals(this.a, rp8Var.a) && TextUtils.equals(this.b, rp8Var.b) && TextUtils.equals(this.c, rp8Var.c) && TextUtils.equals(this.d, rp8Var.d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.e, rp8Var.e) && Arrays.equals(this.f, rp8Var.f) && Objects.equals(this.g, rp8Var.g) && Objects.equals(this.h, rp8Var.h) && Objects.equals(this.i, rp8Var.i) && Objects.equals(this.j, rp8Var.j) && Objects.equals(this.k, rp8Var.k) && Objects.equals(this.m, rp8Var.m) && Objects.equals(this.n, rp8Var.n) && Objects.equals(this.o, rp8Var.o) && Objects.equals(this.p, rp8Var.p) && Objects.equals(this.q, rp8Var.q) && Objects.equals(this.r, rp8Var.r) && TextUtils.equals(this.s, rp8Var.s) && TextUtils.equals(this.t, rp8Var.t) && TextUtils.equals(this.u, rp8Var.u) && TextUtils.equals(this.v, rp8Var.v) && Objects.equals(this.w, rp8Var.w) && Objects.equals(this.x, rp8Var.x) && TextUtils.equals(this.y, rp8Var.y) && TextUtils.equals(null, null) && TextUtils.equals(this.z, rp8Var.z) && Objects.equals(this.A, rp8Var.A) && Objects.equals(this.B, rp8Var.B);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, null, null, this.e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.h, this.i, this.j, this.k, null, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, null, this.z, this.A, true, this.B);
    }
}
