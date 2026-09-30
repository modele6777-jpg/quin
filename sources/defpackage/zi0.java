package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.FirebaseMessaging;
import io.sentry.f4;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.SocketException;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class zi0 implements n95 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public zi0(Class cls) {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.b = uuidRandomUUID;
        String string = ((UUID) this.b).toString();
        string.getClass();
        this.c = new lbg(string, (vag) null, cls.getName(), (String) null, (bb3) null, (bb3) null, 0L, 0L, 0L, (jl2) null, 0, (us0) null, 0L, 0L, 0L, 0L, false, (rs9) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(bm8.F(1));
        qd0.B0(strArr, linkedHashSet);
        this.d = linkedHashSet;
    }

    public static void b(uv8[][][] uv8VarArr, int i, uv8 uv8Var) {
        uv8[] uv8VarArr2 = uv8VarArr[i + uv8Var.d][uv8Var.c];
        f09 f09Var = uv8Var.a;
        int iOrdinal = f09Var.ordinal();
        char c = 2;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                c = 1;
            } else if (iOrdinal == 4) {
                c = 3;
            } else {
                if (iOrdinal != 6) {
                    yg5.r(f09Var, "Illegal mode ");
                    return;
                }
                c = 0;
            }
        }
        uv8 uv8Var2 = uv8VarArr2[c];
        if (uv8Var2 == null || uv8Var2.f > uv8Var.f) {
            uv8VarArr2[c] = uv8Var;
        }
    }

    public static IOException d(zi0 zi0Var, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            zi0Var.A(iOException);
        }
        if (z3) {
            tz4 tz4Var = ((cib) zi0Var.b).d;
            if (iOException != null) {
                tz4Var.getClass();
            } else {
                tz4Var.getClass();
            }
        }
        if (z2) {
            tz4 tz4Var2 = ((cib) zi0Var.b).d;
            if (iOException != null) {
                tz4Var2.getClass();
            } else {
                tz4Var2.getClass();
            }
        }
        return ((cib) zi0Var.b).f(zi0Var, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    public static boolean f(f09 f09Var, char c) {
        int iOrdinal = f09Var.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                if ((c < '`' ? dv4.a[c] : -1) == -1) {
                    return false;
                }
            } else if (iOrdinal != 4) {
                if (iOrdinal != 6) {
                    return false;
                }
                return dv4.b(String.valueOf(c));
            }
        } else if (c < '0' || c > '9') {
            return false;
        }
        return true;
    }

    public static void i(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }

    public static mtf p(wv8 wv8Var) {
        int iOrdinal = wv8Var.ordinal();
        if (iOrdinal != 0) {
            return iOrdinal != 1 ? mtf.a(40) : mtf.a(26);
        }
        return mtf.a(9);
    }

    public void A(IOException iOException) {
        this.a = true;
        ((u25) this.d).j().f((cib) this.b, iOException);
    }

    public w84 B() throws SocketException {
        cib cibVar = (cib) this.b;
        if (cibVar.x) {
            qc0.p("Check failed.");
            return null;
        }
        cibVar.x = true;
        cibVar.e.i();
        synchronized (cibVar) {
            if (cibVar.G0 == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (cibVar.Y || cibVar.Z) {
                throw new IllegalStateException("Check failed.");
            }
            if (cibVar.z) {
                throw new IllegalStateException("Check failed.");
            }
            if (!cibVar.X) {
                throw new IllegalStateException("Check failed.");
            }
            cibVar.X = false;
            cibVar.Y = true;
            cibVar.Z = true;
        }
        t25 t25VarJ = ((u25) this.d).j();
        t25VarJ.getClass();
        dib dibVar = (dib) t25VarJ;
        dibVar.e.setSoTimeout(0);
        dibVar.e();
        return new w84(this);
    }

    public String C() {
        if (!this.a) {
            this.a = true;
            c2h c2hVar = (c2h) this.d;
            this.c = c2hVar.E0().getString((String) this.b, null);
        }
        return (String) this.c;
    }

    public void D(String str) {
        SharedPreferences.Editor editorEdit = ((c2h) this.d).E0().edit();
        editorEdit.putString((String) this.b, str);
        editorEdit.apply();
        this.c = str;
    }

    public void a() {
        w94 w94Var = (w94) this.d;
        synchronized (w94Var) {
            try {
                if (this.a) {
                    throw new IllegalStateException("Check failed.");
                }
                if (pa7.t(((o94) this.b).g, this)) {
                    w94Var.h(this, false);
                }
                this.a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002f  */
    public void c(mtf mtfVar, uv8[][][] uv8VarArr, int i, uv8 uv8Var) {
        int i2;
        String str = (String) this.b;
        ds4 ds4Var = (ds4) this.c;
        CharsetEncoder[] charsetEncoderArr = ds4Var.a;
        int length = charsetEncoderArr.length;
        int i3 = ds4Var.b;
        if (i3 >= 0) {
            char cCharAt = str.charAt(i);
            if (charsetEncoderArr[i3].canEncode("" + cCharAt)) {
                length = i3 + 1;
            } else {
                i3 = 0;
            }
        } else {
            i3 = 0;
        }
        int i4 = length;
        for (int i5 = i3; i5 < i4; i5++) {
            char cCharAt2 = str.charAt(i);
            if (charsetEncoderArr[i5].canEncode("" + cCharAt2)) {
                b(uv8VarArr, i, new uv8(this, f09.BYTE, i, i5, 1, uv8Var, mtfVar));
            }
        }
        char cCharAt3 = str.charAt(i);
        f09 f09Var = f09.KANJI;
        if (f(f09Var, cCharAt3)) {
            b(uv8VarArr, i, new uv8(this, f09Var, i, 0, 1, uv8Var, mtfVar));
        }
        int length2 = str.length();
        char cCharAt4 = str.charAt(i);
        f09 f09Var2 = f09.ALPHANUMERIC;
        int i6 = 2;
        if (f(f09Var2, cCharAt4)) {
            int i7 = i + 1;
            b(uv8VarArr, i, new uv8(this, f09Var2, i, 0, (i7 >= length2 || !f(f09Var2, str.charAt(i7))) ? 1 : 2, uv8Var, mtfVar));
        }
        char cCharAt5 = str.charAt(i);
        f09 f09Var3 = f09.NUMERIC;
        if (f(f09Var3, cCharAt5)) {
            int i8 = i + 1;
            if (i8 >= length2 || !f(f09Var3, str.charAt(i8))) {
                i2 = 1;
            } else {
                int i9 = i + 2;
                if (i9 < length2 && f(f09Var3, str.charAt(i9))) {
                    i6 = 3;
                }
                i2 = i6;
            }
            b(uv8VarArr, i, new uv8(this, f09Var3, i, 0, i2, uv8Var, mtfVar));
        }
    }

    public cq9 e() {
        if (this.a && ((lbg) this.c).j.d) {
            qc0.j("Cannot set backoff criteria on an idle mode job");
            return null;
        }
        UUID uuid = (UUID) this.b;
        lbg lbgVar = (lbg) this.c;
        cq9 cq9Var = new cq9(uuid, lbgVar, (Set) this.d);
        jl2 jl2Var = lbgVar.j;
        boolean z = !jl2Var.i.isEmpty() || jl2Var.e || jl2Var.c || jl2Var.d;
        lbg lbgVar2 = (lbg) this.c;
        if (lbgVar2.q) {
            if (z) {
                qc0.j("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (lbgVar2.g > 0) {
                qc0.j("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = lbgVar2.x;
        if (str == null) {
            List listC0 = v4e.c0(lbgVar2.c, new String[]{"."}, 6);
            String strM0 = listC0.size() == 1 ? (String) listC0.get(0) : (String) s72.F0(listC0);
            if (strM0.length() > 127) {
                strM0 = v4e.m0(127, strM0);
            }
            lbgVar2.x = strM0;
        } else if (str.length() > 127) {
            ((lbg) this.c).x = v4e.m0(127, str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.b = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        lbg lbgVar3 = (lbg) this.c;
        this.c = new lbg(string, lbgVar3.b, lbgVar3.c, lbgVar3.d, new bb3(lbgVar3.e), new bb3(lbgVar3.f), lbgVar3.g, lbgVar3.h, lbgVar3.i, new jl2(lbgVar3.j), lbgVar3.k, lbgVar3.l, lbgVar3.m, lbgVar3.n, lbgVar3.o, lbgVar3.p, lbgVar3.q, lbgVar3.r, lbgVar3.s, lbgVar3.u, lbgVar3.v, lbgVar3.w, lbgVar3.x, lbgVar3.y, 524288);
        return cq9Var;
    }

    public void g() {
        w94 w94Var = (w94) this.d;
        synchronized (w94Var) {
            try {
                if (this.a) {
                    throw new IllegalStateException("Check failed.");
                }
                if (pa7.t(((o94) this.b).g, this)) {
                    w94Var.h(this, true);
                }
                this.a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h(boolean z) {
        x94 x94Var = (x94) this.d;
        synchronized (x94Var.v) {
            try {
                if (this.a) {
                    throw new IllegalStateException("editor is closed");
                }
                if (pa7.t(((p94) this.b).g, this)) {
                    x94Var.b(this, z);
                }
                this.a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.n95
    public void j() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((n95) this.b).j();
        if (this.a) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((g8e) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    public void k() {
        o94 o94Var = (o94) this.b;
        if (pa7.t(o94Var.g, this)) {
            w94 w94Var = (w94) this.d;
            if (w94Var.z) {
                w94Var.h(this, false);
            } else {
                o94Var.f = true;
            }
        }
    }

    public gg7 l(mtf mtfVar) throws vcg {
        int i;
        String str = (String) this.b;
        int length = str.length();
        CharsetEncoder[] charsetEncoderArr = ((ds4) this.c).a;
        uv8[][][] uv8VarArr = (uv8[][][]) Array.newInstance((Class<?>) uv8.class, length + 1, charsetEncoderArr.length, 4);
        c(mtfVar, uv8VarArr, 0, null);
        for (int i2 = 1; i2 <= length; i2++) {
            for (int i3 = 0; i3 < charsetEncoderArr.length; i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    uv8 uv8Var = uv8VarArr[i2][i3][i4];
                    if (uv8Var != null && i2 < length) {
                        c(mtfVar, uv8VarArr, i2, uv8Var);
                    }
                }
            }
        }
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        int i7 = -1;
        for (int i8 = 0; i8 < charsetEncoderArr.length; i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                uv8 uv8Var2 = uv8VarArr[length][i8][i9];
                if (uv8Var2 != null && (i = uv8Var2.f) < i6) {
                    i5 = i8;
                    i7 = i9;
                    i6 = i;
                }
            }
        }
        if (i5 >= 0) {
            return new gg7(this, mtfVar, uv8VarArr[length][i5][i7]);
        }
        throw new vcg(ib8.j("Internal error: failed to encode \"", str, "\""));
    }

    public e1a m(int i) {
        e1a e1aVar;
        x94 x94Var = (x94) this.d;
        synchronized (x94Var.v) {
            if (this.a) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.c)[i] = true;
            Object obj = ((p94) this.b).d.get(i);
            qk2.x(x94Var.F0, (e1a) obj);
            e1aVar = (e1a) obj;
        }
        return e1aVar;
    }

    @Override // defpackage.n95
    public k1f n(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.d;
        n95 n95Var = (n95) this.b;
        if (i2 != 3 && i2 != 5) {
            this.a = true;
        }
        if (i2 != 3) {
            return n95Var.n(i, i2);
        }
        g8e g8eVar = (g8e) sparseArray.get(i);
        if (g8eVar != null) {
            return g8eVar;
        }
        g8e g8eVar2 = new g8e(n95Var.n(i, i2), (d8e) this.c);
        sparseArray.put(i, g8eVar2);
        return g8eVar2;
    }

    public dib o() {
        t25 t25VarJ = ((u25) this.d).j();
        dib dibVar = t25VarJ instanceof dib ? (dib) t25VarJ : null;
        if (dibVar != null) {
            return dibVar;
        }
        qc0.p("no connection for CONNECT tunnels");
        return null;
    }

    @Override // defpackage.n95
    public void q(xsc xscVar) {
        ((n95) this.b).q(xscVar);
    }

    public synchronized void r() {
        try {
            if (this.a) {
                return;
            }
            Boolean boolV = v();
            this.c = boolV;
            if (boolV == null) {
                pd4 pd4Var = new pd4(26);
                hz4 hz4Var = (hz4) ((y6e) this.b);
                hz4Var.getClass();
                hz4Var.a(uaf.a, pd4Var);
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean s() {
        Boolean bool;
        try {
            r();
            bool = (Boolean) this.c;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.d).a.h();
    }

    public wkd t(int i) {
        w94 w94Var = (w94) this.d;
        synchronized (w94Var) {
            try {
                if (this.a) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!pa7.t(((o94) this.b).g, this)) {
                    return new wz0();
                }
                if (!((o94) this.b).e) {
                    boolean[] zArr = (boolean[]) this.c;
                    zArr.getClass();
                    zArr[i] = true;
                }
                e1a e1aVar = (e1a) ((o94) this.b).d.get(i);
                try {
                    t94 t94Var = w94Var.b;
                    t94Var.getClass();
                    e1aVar.getClass();
                    return new va5(t94Var.g0(e1aVar, false), new ks2(18, w94Var, this));
                } catch (FileNotFoundException unused) {
                    return new wz0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public rib u(ryb rybVar) throws IOException {
        zi0 zi0Var;
        try {
            String strC = rybVar.f.c("Content-Type");
            if (strC == null) {
                strC = null;
            }
            long jE = ((u25) this.d).e(rybVar);
            zi0Var = this;
            try {
                return new rib(strC, jE, new yhb(new s25(zi0Var, ((u25) this.d).a(rybVar), jE, false)));
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                ((cib) zi0Var.b).d.getClass();
                zi0Var.A(iOException);
                throw iOException;
            }
        } catch (IOException e2) {
            e = e2;
            zi0Var = this;
        }
    }

    public Boolean v() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        ff5 ff5Var = ((FirebaseMessaging) this.d).a;
        ff5Var.a();
        Context context = ff5Var.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public pyb w(boolean z) throws IOException {
        try {
            pyb pybVarG = ((u25) this.d).g(z);
            if (pybVarG == null) {
                return pybVarG;
            }
            pybVarG.n = this;
            return pybVarG;
        } catch (IOException e) {
            ((cib) this.b).d.getClass();
            A(e);
            throw e;
        }
    }

    public void x(us0 us0Var, long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.a = true;
        lbg lbgVar = (lbg) this.c;
        lbgVar.l = us0Var;
        long millis = timeUnit.toMillis(j);
        String str = lbg.z;
        if (millis > 18000000) {
            ff8.h().o(str, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            ff8.h().o(str, "Backoff delay duration less than minimum value");
        }
        lbgVar.m = mh3.q(millis, 10000L, 18000000L);
    }

    public void y() {
        if (this.a) {
            ((jce) this.d).e(new j1(7, this));
            this.a = false;
        }
    }

    public void z(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        ((lbg) this.c).g = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > ((lbg) this.c).g) {
            return;
        }
        qc0.j("The given initial delay is too large and will cause an overflow!");
    }

    public zi0(int i) {
        switch (i) {
            case 6:
                this.b = new Object();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.a = true;
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                this.b = null;
                this.c = f4.AUTO;
                this.a = false;
                this.d = "manual";
                break;
            default:
                this.b = new float[16];
                this.c = new float[16];
                this.d = new p90();
                break;
        }
    }

    public zi0(n95 n95Var, d8e d8eVar) {
        this.b = n95Var;
        this.c = d8eVar;
        this.d = new SparseArray();
    }

    public zi0(c2h c2hVar, String str) {
        this.d = c2hVar;
        oa7.x(str);
        this.b = str;
    }

    public zi0(Context context, Looper looper, Looper looper2, t45 t45Var) {
        this.b = context.getApplicationContext();
        this.d = new jce(new Handler(looper, null));
        this.c = new yi0(this, new jce(new Handler(looper2, null)), t45Var);
    }

    public zi0(x94 x94Var, p94 p94Var) {
        this.d = x94Var;
        this.b = p94Var;
        this.c = new boolean[2];
    }

    public zi0(w94 w94Var, o94 o94Var) {
        boolean[] zArr;
        this.d = w94Var;
        this.b = o94Var;
        if (o94Var.e) {
            zArr = null;
        } else {
            w94Var.getClass();
            zArr = new boolean[2];
        }
        this.c = zArr;
    }
}
