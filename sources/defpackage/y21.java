package defpackage;

import android.os.Bundle;
import io.sentry.android.core.v;
import io.sentry.config.a;
import io.sentry.protocol.DebugImage;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y21 implements bm9, psf {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public y21(long j, int i) {
        pa7.J(((mj) this.c) == null);
        this.a = j;
        this.b = j + ((long) i);
    }

    @Override // defpackage.bm9
    public long a(m95 m95Var) {
        long j = this.b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.b = -1L;
        return j2;
    }

    @Override // defpackage.psf
    public boolean b() {
        return true;
    }

    @Override // defpackage.psf
    public long c(b00 b00Var, b00 b00Var2, b00 b00Var3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.bm9
    public xsc d() {
        pa7.J(this.a != -1);
        return new ir0((bi5) this.c, this.a, 1);
    }

    public void e(Object obj, Object obj2, uib uibVar) {
        uib uibVar2 = (uib) obj2;
        ((sug) ((xj0) this.d).b).x((gr8) obj, uibVar2.a, uibVar2.b, uibVar2.c);
    }

    @Override // defpackage.bm9
    public void f(long j) {
        long[] jArr = (long[]) ((w84) this.d).b;
        this.b = jArr[pqf.d(jArr, j, true)];
    }

    public long g() {
        long j = this.b;
        if (j != -1) {
            return j;
        }
        long jK = 0;
        for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
            jK += k(entry.getKey(), entry.getValue());
        }
        this.b = jK;
        return jK;
    }

    public long h(long j) {
        long j2 = this.b;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.a;
        long j5 = j3 / j4;
        return (((lrb) this.d) == lrb.a || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    @Override // defpackage.psf
    public b00 i(long j, b00 b00Var, b00 b00Var2, b00 b00Var3) {
        return ((rsf) this.c).i(h(j), b00Var, b00Var2, j(j, b00Var, b00Var3, b00Var2));
    }

    public b00 j(long j, b00 b00Var, b00 b00Var2, b00 b00Var3) {
        long j2 = this.b;
        long j3 = j + j2;
        long j4 = this.a;
        return j3 > j4 ? ((rsf) this.c).i(j4 - j2, b00Var, b00Var3, b00Var2) : b00Var2;
    }

    public long k(Object obj, Object obj2) throws Exception {
        try {
            long j = ((uib) obj2).c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.b = -1L;
            throw e;
        }
    }

    public DebugImage l() {
        long j = this.a;
        String str = (String) this.d;
        if (str.isEmpty()) {
            return null;
        }
        DebugImage debugImage = new DebugImage();
        debugImage.setCodeId(str);
        debugImage.setCodeFile((String) this.c);
        String strA = a.a(str);
        if (strA != null) {
            str = strA;
        }
        debugImage.setDebugId(str);
        debugImage.setImageAddr(String.format("0x%x", Long.valueOf(j)));
        debugImage.setImageSize(this.b - j);
        debugImage.setType("elf");
        return debugImage;
    }

    public void m(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        while (g() > j) {
            if (linkedHashMap.isEmpty()) {
                if (g() == 0) {
                    return;
                }
                qc0.p("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) s72.u0(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.b = g() - k(key, value);
                e(key, value, null);
            }
        }
    }

    public boolean n(long j, boolean z, boolean z2) {
        ebh ebhVar = (ebh) this.d;
        ebhVar.A0();
        ebhVar.B0();
        w3h w3hVar = (w3h) ebhVar.b;
        boolean zA = w3hVar.a();
        w0h w0hVar = w3hVar.f;
        if (zA) {
            c2h c2hVar = w3hVar.e;
            w3h.f(c2hVar);
            v vVar = c2hVar.F0;
            w3hVar.y.getClass();
            vVar.b(System.currentTimeMillis());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            w3h.h(w0hVar);
            w0hVar.Z.b(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.b;
            this.b = j;
        }
        w3h.h(w0hVar);
        w0hVar.Z.b(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !w3hVar.d.P0();
        b9h b9hVar = w3hVar.z;
        w3h.g(b9hVar);
        qch.x1(b9hVar.E0(z3), bundle, true);
        if (!z2) {
            c8h c8hVar = w3hVar.X;
            w3h.g(c8hVar);
            c8hVar.H0("auto", "_e", bundle);
        }
        this.a = j;
        xah xahVar = (xah) this.c;
        xahVar.c();
        xahVar.b(((Long) bzg.p0.a(null)).longValue());
        return true;
    }

    @Override // defpackage.psf
    public b00 t(long j, b00 b00Var, b00 b00Var2, b00 b00Var3) {
        return ((rsf) this.c).t(h(j), b00Var, b00Var2, j(j, b00Var, b00Var3, b00Var2));
    }

    public y21(String str, byte[] bArr, long j, long j2) {
        this.c = str;
        this.d = bArr;
        this.a = j;
        this.b = j2;
    }
}
