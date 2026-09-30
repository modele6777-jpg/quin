package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import coil3.compose.AsyncImagePainter;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import tech.chatmind.api.ArcanaGroup;
import tech.chatmind.api.RedeemPopup;
import tech.chatmind.api.RedeemPopupAction;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z7f {
    public static final dd2 a;
    public static final dd2 b;
    public static final dd2 c = new dd2(new kd2(24), false, -268068841);
    public static final dd2 d = new dd2(new kd2(25), false, 893710668);
    public static final dd2 e = new dd2(new de2(3), false, -810014769);
    public static final dd2 f;
    public static final n82 g;
    public static final g5d h;
    public static final n82 i;
    public static final q9f j;
    public static final Object k;
    public static gx6 l;
    public static gx6 m;
    public static gx6 n;
    public static gx6 o;

    static {
        int i2 = 7;
        a = new dd2(new ym0(i2), false, 1934284619);
        b = new dd2(new a7(i2), false, 1970342008);
        int i3 = 4;
        new dd2(new de2(i3), false, 1345018643);
        f = new dd2(new hd2(i3), false, -246272937);
        g = n82.d;
        h = g5d.b;
        i = n82.b;
        j = q9f.c;
        k = new Object();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    public static k51 A(dx5 dx5Var, ge8 ge8Var, w09 w09Var, InputStream inputStream) throws IOException {
        iza izaVar;
        ut8 ut8Var;
        dx5Var.getClass();
        w09Var.getClass();
        try {
            g51 g51Var = g51.f;
            g51 g51VarF = bzd.F(inputStream);
            g51 g51Var2 = g51.f;
            int i2 = g51VarF.c;
            g51Var2.getClass();
            int i3 = g51Var2.c;
            int i4 = g51VarF.b;
            int i5 = g51Var2.b;
            if (i4 == 0) {
                if (i5 == 0 && i2 == i3) {
                    o85 o85VarC = vfh.c(sdb.a);
                    gl7 gl7Var = iza.b;
                    gl7Var.getClass();
                    g72 g72Var = new g72(inputStream);
                    ut8Var = (ut8) gl7Var.c(g72Var, o85VarC);
                    try {
                        g72Var.a(0);
                        gl7.a(ut8Var);
                        izaVar = (iza) ut8Var;
                    } catch (ab7 e2) {
                        e2.b(ut8Var);
                        throw e2;
                    }
                } else {
                    izaVar = null;
                }
            } else if (i4 != i5 || i2 > i3) {
                izaVar = null;
            } else {
                o85 o85VarC2 = vfh.c(sdb.a);
                gl7 gl7Var2 = iza.b;
                gl7Var2.getClass();
                g72 g72Var2 = new g72(inputStream);
                ut8Var = (ut8) gl7Var2.c(g72Var2, o85VarC2);
                g72Var2.a(0);
                gl7.a(ut8Var);
                izaVar = (iza) ut8Var;
            }
            iy9 iy9Var = new iy9(izaVar, g51VarF);
            inputStream.close();
            iza izaVar2 = (iza) iy9Var.a();
            g51 g51Var3 = (g51) iy9Var.b();
            if (izaVar2 != null) {
                return new k51(dx5Var, ge8Var, w09Var, izaVar2, g51Var3);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + g51Var2 + ", actual " + g51Var3 + ". Please update Kotlin");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ym8.t(inputStream, th);
                throw th2;
            }
        }
    }

    public static lb2 B(String str, String str2) {
        jp0 jp0Var = new jp0(str, str2);
        kb2 kb2VarB = lb2.b(jp0.class);
        kb2VarB.e = 1;
        kb2VarB.f = new jb2(0, jp0Var);
        return kb2VarB.b();
    }

    public static final wne C(long j2, long j3, l46 l46Var) {
        long j4 = o7c.n(l46Var).a;
        pr4 pr4Var = o82.a;
        return m8c.p(j2, j2, 0L, j4, j3, j3, y72.b(((m82) l46Var.k(pr4Var)).s, 0.6f), y72.b(((m82) l46Var.k(pr4Var)).s, 0.6f), l46Var, 1744824015);
    }

    public static final void D(sn4 sn4Var, x4d x4dVar, long j2, float f2) {
        float fCeil = (float) Math.ceil(sn4Var.p0(f2));
        float f3 = fCeil / 2.0f;
        vs9 vs9VarA = x4dVar.a(sn4Var.f(), sn4Var.getLayoutDirection(), sn4Var);
        if (!(vs9VarA instanceof us9)) {
            v(sn4Var, x4dVar, new s01(vs9VarA, j2, fCeil, 2));
            return;
        }
        us9 us9Var = (us9) vs9VarA;
        v6c v6cVar = us9Var.a;
        long j3 = v6cVar.e;
        if (!w6c.o(v6cVar)) {
            v(sn4Var, x4dVar, new s01(us9Var, j2, fCeil, 1));
            return;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() >> 32)) - fCeil;
        if (fIntBitsToFloat < 0.0f) {
            fIntBitsToFloat = 0.0f;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) - fCeil;
        if (fIntBitsToFloat2 < 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32)) - f3;
        if (fIntBitsToFloat3 < 0.0f) {
            fIntBitsToFloat3 = 0.0f;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - f3;
        sn4.K0(sn4Var, j2, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4 >= 0.0f ? fIntBitsToFloat4 : 0.0f)) & 4294967295L), new d5e(fCeil, 0.0f, 0, 0, null, 30), 224);
    }

    public static lb2 E(String str, pd4 pd4Var) {
        kb2 kb2VarB = lb2.b(jp0.class);
        kb2VarB.e = 1;
        kb2VarB.a(xw3.c(Context.class));
        kb2VarB.f = new bo1(14, str, pd4Var);
        return kb2VarB.b();
    }

    public static final gx6 F() {
        gx6 gx6Var = o;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("Filled.MoreHoriz", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = msf.a;
        dtd dtdVar = new dtd(y72.b);
        s71 s71Var = new s71(1);
        s71Var.p(6.0f, 10.0f);
        s71Var.j(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        s71Var.r(0.9f, 2.0f, 2.0f, 2.0f);
        s71Var.r(2.0f, -0.9f, 2.0f, -2.0f);
        s71Var.r(-0.9f, -2.0f, -2.0f, -2.0f);
        s71Var.h();
        s71Var.p(18.0f, 10.0f);
        s71Var.j(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        s71Var.r(0.9f, 2.0f, 2.0f, 2.0f);
        s71Var.r(2.0f, -0.9f, 2.0f, -2.0f);
        s71Var.r(-0.9f, -2.0f, -2.0f, -2.0f);
        s71Var.h();
        s71Var.p(12.0f, 10.0f);
        s71Var.j(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        s71Var.r(0.9f, 2.0f, 2.0f, 2.0f);
        s71Var.r(2.0f, -0.9f, 2.0f, -2.0f);
        s71Var.r(-0.9f, -2.0f, -2.0f, -2.0f);
        s71Var.h();
        fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
        gx6 gx6VarB = fx6Var.b();
        o = gx6VarB;
        return gx6VarB;
    }

    public static final int G(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                if (i5 < 0) {
                    i5 += i4;
                }
                int i6 = i2 % i4;
                if (i6 < 0) {
                    i6 += i4;
                }
                int i7 = (i5 - i6) % i4;
                if (i7 < 0) {
                    i7 += i4;
                }
                return i3 - i7;
            }
        } else {
            if (i4 >= 0) {
                qc0.j("Step is zero.");
                return 0;
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i3 % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i11 + i3;
            }
        }
        return i3;
    }

    public static final h1e H(osd osdVar) {
        return (h1e) qrd.s(osdVar.a, osdVar);
    }

    public static final j09 I(j09 j09Var, ii6 ii6Var, ji6 ji6Var, a26 a26Var) {
        j09Var.getClass();
        ji6Var.getClass();
        return j09Var.D(new yh6(ii6Var, ji6Var, a26Var));
    }

    public static j09 J(j09 j09Var, ii6 ii6Var, ji6 ji6Var, a26 a26Var, int i2) {
        if ((i2 & 2) != 0) {
            ji6Var = ji6.f;
        }
        if ((i2 & 4) != 0) {
            a26Var = null;
        }
        return I(j09Var, ii6Var, ji6Var, a26Var);
    }

    public static j09 K(j09 j09Var, ji6 ji6Var, int i2) {
        if ((i2 & 1) != 0) {
            ji6Var = ji6.f;
        }
        j09Var.getClass();
        ji6Var.getClass();
        return j09Var.D(new yh6(null, ji6Var, null));
    }

    public static boolean L(int i2, Object obj) {
        int arity;
        if (obj instanceof m26) {
            if (obj instanceof w26) {
                arity = ((w26) obj).getArity();
            } else if (obj instanceof x16) {
                arity = 0;
            } else if (obj instanceof a26) {
                arity = 1;
            } else if (obj instanceof l26) {
                arity = 2;
            } else if (obj instanceof n26) {
                arity = 3;
            } else if (obj instanceof o26) {
                arity = 4;
            } else if (obj instanceof p26) {
                arity = 5;
            } else if (obj instanceof q26) {
                arity = 6;
            } else if (obj instanceof r26) {
                arity = 7;
            } else if (obj instanceof s26) {
                arity = 8;
            } else if (obj instanceof t26) {
                arity = 9;
            } else if (obj instanceof y16) {
                arity = 10;
            } else if (obj instanceof z16) {
                arity = 11;
            } else {
                boolean z = obj instanceof p36;
                if (z) {
                    arity = 12;
                } else if (obj instanceof b26) {
                    arity = 13;
                } else if (obj instanceof c26) {
                    arity = 14;
                } else if (obj instanceof d26) {
                    arity = 15;
                } else if (obj instanceof e26) {
                    arity = 16;
                } else if (obj instanceof f26) {
                    arity = 17;
                } else if (obj instanceof g26) {
                    arity = 18;
                } else if (obj instanceof h26) {
                    arity = 19;
                } else if (obj instanceof j26) {
                    arity = 20;
                } else if (obj instanceof k26) {
                    arity = 21;
                } else {
                    arity = z ? 22 : -1;
                }
            }
            if (arity == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean M() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Huawei")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Huawei")) {
                return false;
            }
        }
        return "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean N() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Nokia")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Nokia")) {
                return false;
            }
        }
        String str3 = Build.DEVICE;
        return "B2N".equalsIgnoreCase(str3) || "B2N_sprout".equalsIgnoreCase(str3);
    }

    public static boolean O() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("OnePlus")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("OnePlus")) {
                return false;
            }
        }
        return "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean P() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("OnePlus")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("OnePlus")) {
                return false;
            }
        }
        return "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean Q() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Redmi")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Redmi")) {
                return false;
            }
        }
        return "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public static boolean R() {
        String upperCase;
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (str2.equalsIgnoreCase("Samsung")) {
                if ("a05s".equalsIgnoreCase(Build.DEVICE)) {
                    String str3 = Build.MODEL;
                    str3.getClass();
                    upperCase = str3.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    if (v4e.F(upperCase, "SM-A057", false)) {
                        return true;
                    }
                }
            }
        } else if ("a05s".equalsIgnoreCase(Build.DEVICE)) {
            String str4 = Build.MODEL;
            str4.getClass();
            upperCase = str4.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (v4e.F(upperCase, "SM-A057", false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean S() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        return "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean T() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        return "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean U() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        String str3 = Build.DEVICE;
        return "q4q".equalsIgnoreCase(str3) || "SCG16".equalsIgnoreCase(str3) || "SC-55C".equalsIgnoreCase(str3);
    }

    public static final void V(jg3 jg3Var, String str, a26 a26Var) {
        if (!(jg3Var instanceof p1)) {
            qc0.p("impossible");
            return;
        }
        p1 p1Var = (p1) jg3Var;
        t(1, a26Var);
        mx mxVarE = p1Var.e();
        p1 p1VarL = p1Var.l();
        a26Var.d(p1VarL);
        mxVarE.a(new xr9(str, new fh2(p1VarL.e().a)));
    }

    public static final p7d W(r7d r7dVar) {
        return new p7d(t72.H(r7dVar), new bx9(20.0f, 20.0f, 20.0f, 20.0f), 0.0f, null, 0.0f, null, null, 252);
    }

    public static final u51 X(l46 l46Var) {
        bx9 bx9Var = v51.a;
        pr4 pr4Var = l8b.a;
        if (!k8b.e((e8b) l46Var.k(pr4Var))) {
            l46Var.f0(-1873582299);
            u51 u51VarA = v51.a(abg.d(4291611852L), ((e8b) l46Var.k(pr4Var)).a, y72.b(abg.d(4291611852L), 0.38f), y72.b(((e8b) l46Var.k(pr4Var)).a, 0.38f), l46Var, 0);
            l46Var.r(false);
            return u51VarA;
        }
        l46Var.f0(-1873594123);
        pr4 pr4Var2 = o82.a;
        u51 u51VarA2 = v51.a(((m82) l46Var.k(pr4Var2)).c, ((m82) l46Var.k(pr4Var2)).d, y72.b(((m82) l46Var.k(pr4Var2)).c, 0.12f), y72.b(((m82) l46Var.k(pr4Var2)).d, 0.38f), l46Var, 0);
        l46Var.r(false);
        return u51VarA2;
    }

    public static final AsyncImagePainter Y(sw6 sw6Var, aw6 aw6Var, a26 a26Var, l46 l46Var, int i2, int i3) {
        if ((i3 & 8) != 0) {
            a26Var = null;
        }
        return Z(new dh0(sw6Var, (vg0) l46Var.k(ha8.a), aw6Var), AsyncImagePainter.K0, a26Var, an2.b, 1, l46Var);
    }

    public static final AsyncImagePainter Z(dh0 dh0Var, a26 a26Var, a26 a26Var2, bn2 bn2Var, int i2, l46 l46Var) {
        l46Var.f0(-1242991349);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            sw6 sw6VarC = crf.c(dh0Var.a, l46Var);
            crf.f(sw6VarC);
            wg0 wg0Var = new wg0(dh0Var.c, sw6VarC, dh0Var.b);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new AsyncImagePainter(wg0Var);
                l46Var.p0(objR);
            }
            AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = af1.E(l46Var);
                l46Var.p0(objR2);
            }
            asyncImagePainter.z = (aw2) objR2;
            asyncImagePainter.X = a26Var;
            asyncImagePainter.Y = a26Var2;
            asyncImagePainter.Z = bn2Var;
            asyncImagePainter.E0 = i2;
            asyncImagePainter.F0 = crf.a(l46Var);
            asyncImagePainter.m(wg0Var);
            l46Var.r(false);
            return asyncImagePainter;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0178  */
    /* JADX WARN: Code duplicated, block: B:103:0x0191  */
    /* JADX WARN: Code duplicated, block: B:104:0x0193  */
    /* JADX WARN: Code duplicated, block: B:108:0x019c  */
    /* JADX WARN: Code duplicated, block: B:111:0x01af  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:115:0x0226  */
    /* JADX WARN: Code duplicated, block: B:117:0x022c  */
    /* JADX WARN: Code duplicated, block: B:120:0x023b  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0087  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00db  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x010d  */
    /* JADX WARN: Code duplicated, block: B:79:0x010f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0116  */
    /* JADX WARN: Code duplicated, block: B:83:0x0118  */
    /* JADX WARN: Code duplicated, block: B:86:0x0120  */
    /* JADX WARN: Code duplicated, block: B:87:0x0122  */
    /* JADX WARN: Code duplicated, block: B:90:0x012b  */
    /* JADX WARN: Code duplicated, block: B:91:0x012d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0139  */
    /* JADX WARN: Code duplicated, block: B:98:0x014b  */
    public static final void a(j09 j09Var, final int i2, final Set set, final boolean z, boolean z2, ArcanaGroup arcanaGroup, boolean z3, final a26 a26Var, final a26 a26Var2, final x16 x16Var, l46 l46Var, final int i3, final int i4) {
        boolean z4;
        int i5;
        int iOrdinal;
        int i6;
        int i7;
        int i8;
        boolean z5;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char c2;
        boolean z6;
        final j09 j09Var2;
        final ArcanaGroup arcanaGroup2;
        final boolean z7;
        final boolean z8;
        ojb ojbVarV;
        boolean z9;
        ArcanaGroup arcanaGroup3;
        final boolean z10;
        String str;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objR;
        i8c i8cVar;
        x16 x16Var2;
        pwf pwfVarA;
        Object objR2;
        final e89 e89Var;
        boolean z16;
        Object objR3;
        long j2;
        a26Var.getClass();
        x16Var.getClass();
        l46Var.h0(1863850446);
        int i14 = i3 | 6 | (l46Var.e(i2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(set) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.h(z) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int i15 = i4 & 32;
        if (i15 == 0) {
            if ((i3 & 196608) == 0) {
                z4 = z2;
                i14 |= l46Var.h(z4) ? 131072 : 65536;
            }
            i5 = i4 & 64;
            if (i5 != 0) {
                i6 = 1572864;
            } else {
                if (arcanaGroup == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = arcanaGroup.ordinal();
                }
                if (l46Var.e(iOrdinal)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
            }
            i7 = i14 | i6;
            i8 = i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i8 != 0) {
                i10 = i7 | 12582912;
                z5 = z3;
            } else {
                z5 = z3;
                if (l46Var.h(z5)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i10 = i7 | i9;
            }
            if (l46Var.i(a26Var)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            int i16 = i10 | i11;
            if (l46Var.i(a26Var2)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i13 = i16 | i12;
            if (l46Var.i(x16Var)) {
                c2 = 4;
            } else {
                c2 = 2;
            }
            if ((i13 & 306783379) == 306783378 || (c2 & 3) != 2) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (l46Var.W(i13 & 1, z6)) {
                if (i15 != 0) {
                    z9 = true;
                } else {
                    z9 = z4;
                }
                if (i5 != 0) {
                    arcanaGroup3 = null;
                } else {
                    arcanaGroup3 = arcanaGroup;
                }
                if (i8 != 0) {
                    z10 = false;
                } else {
                    z10 = z5;
                }
                str = "CardDeckViewModel_" + set.hashCode() + "_" + z10;
                if ((57344 & i13) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i13 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z17 = z11 | z12;
                if ((i13 & 7168) != 2048) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                boolean z18 = z17 | z13;
                if ((29360128 & i13) == 8388608) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z18 | z14;
                objR = l46Var.R();
                i8cVar = sf2.a;
                if (z15 || objR == i8cVar) {
                    objR = new x16() { // from class: js1
                        @Override // defpackage.x16
                        public final Object invoke() {
                            return db6.A0(pu4.a, Integer.valueOf(z ? 1 : i2), set, Boolean.valueOf(z10));
                        }
                    };
                    l46Var.p0(objR);
                }
                x16Var2 = (x16) objR;
                pwfVarA = qd8.a(l46Var);
                if (pwfVarA != null) {
                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                final xp1 xp1Var = (xp1) z5c.G(job.a.b(xp1.class), pwfVarA.g(), str, b21.r(pwfVarA), kr7.b(l46Var), x16Var2);
                rfc.n(false, l46Var, 0, 3);
                final e89 e89VarT = tm7.t(xp1Var.g, l46Var);
                objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = q1c.f(null);
                    l46Var.p0(objR2);
                }
                e89Var = (e89) objR2;
                TarotCardType tarotCardType = (TarotCardType) e89Var.getValue();
                if ((i13 & 1879048192) == 536870912) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objR3 = l46Var.R();
                if (z16 || objR3 == i8cVar) {
                    objR3 = new rs1(a26Var2, e89Var, null);
                    l46Var.p0(objR3);
                }
                af1.o((l26) objR3, l46Var, tarotCardType);
                FillElement fillElement = b.c;
                if (z9) {
                    l46Var.f0(158970168);
                    j2 = ((m82) l46Var.k(o82.a)).n;
                    l46Var.r(false);
                } else {
                    l46Var.f0(158970873);
                    l46Var.r(false);
                    j2 = y72.j;
                }
                final boolean z19 = z9;
                final ArcanaGroup arcanaGroup4 = arcanaGroup3;
                xdc.a(fillElement, af1.b0(692187786, new fs0(z9, x16Var, i2, 1), l46Var), af1.b0(-344928791, new o50(z, e89VarT, a26Var, xp1Var, 3), l46Var), null, null, 0, j2, 0L, null, af1.b0(122675935, new n26() { // from class: ms1
                    @Override // defpackage.n26
                    public final Object m(Object obj, Object obj2, Object obj3) {
                        xw9 xw9Var = (xw9) obj;
                        l46 l46Var2 = (l46) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        xw9Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= l46Var2.g(xw9Var) ? 4 : 2;
                        }
                        if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                            final boolean z20 = z19;
                            if (z20) {
                                l46Var2.f0(-378349567);
                                jgb.l(0, l46Var2);
                                l46Var2.r(false);
                            } else {
                                l46Var2.f0(-378316893);
                                l46Var2.r(false);
                            }
                            j09 j09VarY = ynb.Y(b.c, xw9Var);
                            ye6 ye6Var = new ye6(3);
                            uc0 uc0Var = new uc0(16.0f, true, new qc0(0));
                            uc0 uc0Var2 = new uc0(8.0f, true, new qc0(0));
                            bx9 bx9Var = z20 ? new bx9(24.0f, 16.0f, 24.0f, 16.0f) : new bx9(24.0f, 0.0f, 24.0f, 16.0f);
                            boolean zH = l46Var2.h(z20);
                            final int i17 = i2;
                            boolean zE = zH | l46Var2.e(i17);
                            final h0e h0eVar = e89VarT;
                            boolean zG = zE | l46Var2.g(h0eVar);
                            final ArcanaGroup arcanaGroup5 = arcanaGroup4;
                            boolean zE2 = zG | l46Var2.e(arcanaGroup5 == null ? -1 : arcanaGroup5.ordinal());
                            final boolean z21 = z;
                            boolean zH2 = zE2 | l46Var2.h(z21);
                            final xp1 xp1Var2 = xp1Var;
                            boolean zI = zH2 | l46Var2.i(xp1Var2);
                            Object objR4 = l46Var2.R();
                            if (zI || objR4 == sf2.a) {
                                final e89 e89Var2 = e89Var;
                                a26 a26Var3 = new a26() { // from class: ps1
                                    @Override // defpackage.a26
                                    public final Object d(Object obj4) {
                                        sw7 sw7Var = (sw7) obj4;
                                        sw7Var.getClass();
                                        int i18 = 0;
                                        if (!z20) {
                                            sw7.V(sw7Var, new wu0(22), new dd2(new qs1(i17, i18), true, 299487984));
                                        }
                                        h0e h0eVar2 = h0eVar;
                                        Map map = ((eie) h0eVar2.getValue()).b;
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        for (Map.Entry entry : map.entrySet()) {
                                            ArcanaGroup arcanaGroup6 = arcanaGroup5;
                                            if (arcanaGroup6 == null || entry.getKey() == arcanaGroup6) {
                                                linkedHashMap.put(entry.getKey(), entry.getValue());
                                            }
                                        }
                                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                            ArcanaGroup arcanaGroup7 = (ArcanaGroup) entry2.getKey();
                                            List list = (List) entry2.getValue();
                                            sw7.V(sw7Var, new wu0(21), new dd2(new g20(7, arcanaGroup7), true, 1047776304));
                                            sw7Var.W(list.size(), null, new gj(3, list, false), new dd2(new ts1(list, z21, xp1Var2, h0eVar2, e89Var2), true, -1117249557));
                                        }
                                        return wef.a;
                                    }
                                };
                                l46Var2.p0(a26Var3);
                                objR4 = a26Var3;
                            }
                            an1.e(ye6Var, j09VarY, null, bx9Var, uc0Var, uc0Var2, null, false, null, (a26) objR4, l46Var2, 1769472, 916);
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, 805306800, 440);
                z7 = z19;
                arcanaGroup2 = arcanaGroup4;
                z8 = z10;
                j09Var2 = g09.a;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                arcanaGroup2 = arcanaGroup;
                z7 = z4;
                z8 = z5;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: ns1
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        z7f.a(j09Var2, i2, set, z, z7, arcanaGroup2, z8, a26Var, a26Var2, x16Var, (l46) obj, k99.P(i3 | 1), i4);
                        return wef.a;
                    }
                };
            }
        }
        i14 |= 196608;
        z4 = z2;
        i5 = i4 & 64;
        if (i5 != 0) {
            i6 = 1572864;
        } else {
            if (arcanaGroup == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = arcanaGroup.ordinal();
            }
            if (l46Var.e(iOrdinal)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
        }
        i7 = i14 | i6;
        i8 = i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i8 != 0) {
            i10 = i7 | 12582912;
            z5 = z3;
        } else {
            z5 = z3;
            if (l46Var.h(z5)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i10 = i7 | i9;
        }
        if (l46Var.i(a26Var)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i17 = i10 | i11;
        if (l46Var.i(a26Var2)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        i13 = i17 | i12;
        if (l46Var.i(x16Var)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if ((i13 & 306783379) == 306783378) {
            z6 = true;
        } else {
            z6 = true;
        }
        if (l46Var.W(i13 & 1, z6)) {
            if (i15 != 0) {
                z9 = true;
            } else {
                z9 = z4;
            }
            if (i5 != 0) {
                arcanaGroup3 = null;
            } else {
                arcanaGroup3 = arcanaGroup;
            }
            if (i8 != 0) {
                z10 = false;
            } else {
                z10 = z5;
            }
            str = "CardDeckViewModel_" + set.hashCode() + "_" + z10;
            if ((57344 & i13) == 16384) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i13 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z110 = z11 | z12;
            if ((i13 & 7168) != 2048) {
                z13 = false;
            } else {
                z13 = true;
            }
            boolean z111 = z110 | z13;
            if ((29360128 & i13) == 8388608) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z111 | z14;
            objR = l46Var.R();
            i8cVar = sf2.a;
            if (z15) {
                objR = new x16() { // from class: js1
                    @Override // defpackage.x16
                    public final Object invoke() {
                        return db6.A0(pu4.a, Integer.valueOf(z ? 1 : i2), set, Boolean.valueOf(z10));
                    }
                };
                l46Var.p0(objR);
            } else {
                objR = new x16() { // from class: js1
                    @Override // defpackage.x16
                    public final Object invoke() {
                        return db6.A0(pu4.a, Integer.valueOf(z ? 1 : i2), set, Boolean.valueOf(z10));
                    }
                };
                l46Var.p0(objR);
            }
            x16Var2 = (x16) objR;
            pwfVarA = qd8.a(l46Var);
            if (pwfVarA != null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final xp1 xp1Var2 = (xp1) z5c.G(job.a.b(xp1.class), pwfVarA.g(), str, b21.r(pwfVarA), kr7.b(l46Var), x16Var2);
            rfc.n(false, l46Var, 0, 3);
            final e89 e89VarT2 = tm7.t(xp1Var2.g, l46Var);
            objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = q1c.f(null);
                l46Var.p0(objR2);
            }
            e89Var = (e89) objR2;
            TarotCardType tarotCardType2 = (TarotCardType) e89Var.getValue();
            if ((i13 & 1879048192) == 536870912) {
                z16 = true;
            } else {
                z16 = false;
            }
            objR3 = l46Var.R();
            if (z16) {
                objR3 = new rs1(a26Var2, e89Var, null);
                l46Var.p0(objR3);
            } else {
                objR3 = new rs1(a26Var2, e89Var, null);
                l46Var.p0(objR3);
            }
            af1.o((l26) objR3, l46Var, tarotCardType2);
            FillElement fillElement2 = b.c;
            if (z9) {
                l46Var.f0(158970168);
                j2 = ((m82) l46Var.k(o82.a)).n;
                l46Var.r(false);
            } else {
                l46Var.f0(158970873);
                l46Var.r(false);
                j2 = y72.j;
            }
            final boolean z112 = z9;
            final ArcanaGroup arcanaGroup5 = arcanaGroup3;
            xdc.a(fillElement2, af1.b0(692187786, new fs0(z9, x16Var, i2, 1), l46Var), af1.b0(-344928791, new o50(z, e89VarT2, a26Var, xp1Var2, 3), l46Var), null, null, 0, j2, 0L, null, af1.b0(122675935, new n26() { // from class: ms1
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    xw9 xw9Var = (xw9) obj;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    xw9Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var2.g(xw9Var) ? 4 : 2;
                    }
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        final boolean z20 = z112;
                        if (z20) {
                            l46Var2.f0(-378349567);
                            jgb.l(0, l46Var2);
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(-378316893);
                            l46Var2.r(false);
                        }
                        j09 j09VarY = ynb.Y(b.c, xw9Var);
                        ye6 ye6Var = new ye6(3);
                        uc0 uc0Var = new uc0(16.0f, true, new qc0(0));
                        uc0 uc0Var2 = new uc0(8.0f, true, new qc0(0));
                        bx9 bx9Var = z20 ? new bx9(24.0f, 16.0f, 24.0f, 16.0f) : new bx9(24.0f, 0.0f, 24.0f, 16.0f);
                        boolean zH = l46Var2.h(z20);
                        final int i18 = i2;
                        boolean zE = zH | l46Var2.e(i18);
                        final h0e h0eVar = e89VarT2;
                        boolean zG = zE | l46Var2.g(h0eVar);
                        final ArcanaGroup arcanaGroup6 = arcanaGroup5;
                        boolean zE2 = zG | l46Var2.e(arcanaGroup6 == null ? -1 : arcanaGroup6.ordinal());
                        final boolean z21 = z;
                        boolean zH2 = zE2 | l46Var2.h(z21);
                        final xp1 xp1Var3 = xp1Var2;
                        boolean zI = zH2 | l46Var2.i(xp1Var3);
                        Object objR4 = l46Var2.R();
                        if (zI || objR4 == sf2.a) {
                            final e89 e89Var2 = e89Var;
                            a26 a26Var3 = new a26() { // from class: ps1
                                @Override // defpackage.a26
                                public final Object d(Object obj4) {
                                    sw7 sw7Var = (sw7) obj4;
                                    sw7Var.getClass();
                                    int i19 = 0;
                                    if (!z20) {
                                        sw7.V(sw7Var, new wu0(22), new dd2(new qs1(i18, i19), true, 299487984));
                                    }
                                    h0e h0eVar2 = h0eVar;
                                    Map map = ((eie) h0eVar2.getValue()).b;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (Map.Entry entry : map.entrySet()) {
                                        ArcanaGroup arcanaGroup7 = arcanaGroup6;
                                        if (arcanaGroup7 == null || entry.getKey() == arcanaGroup7) {
                                            linkedHashMap.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                        ArcanaGroup arcanaGroup8 = (ArcanaGroup) entry2.getKey();
                                        List list = (List) entry2.getValue();
                                        sw7.V(sw7Var, new wu0(21), new dd2(new g20(7, arcanaGroup8), true, 1047776304));
                                        sw7Var.W(list.size(), null, new gj(3, list, false), new dd2(new ts1(list, z21, xp1Var3, h0eVar2, e89Var2), true, -1117249557));
                                    }
                                    return wef.a;
                                }
                            };
                            l46Var2.p0(a26Var3);
                            objR4 = a26Var3;
                        }
                        an1.e(ye6Var, j09VarY, null, bx9Var, uc0Var, uc0Var2, null, false, null, (a26) objR4, l46Var2, 1769472, 916);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 805306800, 440);
            z7 = z112;
            arcanaGroup2 = arcanaGroup5;
            z8 = z10;
            j09Var2 = g09.a;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            arcanaGroup2 = arcanaGroup;
            z7 = z4;
            z8 = z5;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: ns1
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z7f.a(j09Var2, i2, set, z, z7, arcanaGroup2, z8, a26Var, a26Var2, x16Var, (l46) obj, k99.P(i3 | 1), i4);
                    return wef.a;
                }
            };
        }
    }

    public static final u7d a0(long j2) {
        return new u7d(new dd2(new bc(j2), true, -1970327373));
    }

    public static final ww3 b(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        tq5 tq5VarA = uq5.a(f2);
        if (tq5VarA == null) {
            tq5VarA = new a68(f2);
        }
        return new ww3(f3, f2, tq5VarA);
    }

    public static void b0(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(ib8.j(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        pa7.c0(classCastException, z7f.class.getName());
        throw classCastException;
    }

    public static final void c(x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        l46Var.h0(-479578649);
        int i3 = (l46Var.i(x16Var) ? 4 : 2) | i2 | (l46Var.i(x16Var2) ? 32 : 16);
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var.k(pr4Var));
            j09 j09VarA = androidx.compose.ui.platform.b.a(b.d(ynb.b0(12.0f, 0.0f, b.c(g09.a, 1.0f), 2), 436.0f), "gift_card_guide");
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new oz5(7);
                l46Var.p0(objR);
            }
            nae.a(vwc.b(j09VarA, false, (a26) objR), a7c.b(32.0f), ((e8b) l46Var.k(pr4Var)).c, 0L, 0.0f, 0.0f, null, af1.b0(151630700, new np1(x16Var2, x16Var, zF), l46Var), l46Var, 12582912, 120);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i2, 11, x16Var, x16Var2);
        }
    }

    public static final void d(x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i2) {
        int i3;
        x16 x16Var4;
        l46 l46Var2;
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var.h0(-263797922);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(x16Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (l46Var.i(x16Var2) ? 32 : 16) | (l46Var.i(x16Var3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        boolean z = false;
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            boolean z2 = (i4 & 14) == 4;
            Object objR = l46Var.R();
            if (z2 || objR == sf2.a) {
                objR = new i86(x16Var, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, wef.a);
            l46Var2 = l46Var;
            t72.b(x16Var3, new s84(z, z, 3), af1.b0(808338549, new b20(x16Var2, x16Var3, z, 10), l46Var), l46Var2, ((i4 >> 6) & 14) | 432, 0);
            x16Var4 = x16Var3;
        } else {
            x16Var4 = x16Var3;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ai1(x16Var, x16Var2, x16Var4, i2, 1);
        }
    }

    public static final void e(final l26 l26Var, final x16 x16Var, x16 x16Var2, l46 l46Var, final int i2) {
        x16 x16Var3;
        final x16 x16Var4 = x16Var2;
        l26Var.getClass();
        x16Var.getClass();
        x16Var4.getClass();
        l46Var.h0(-1489344991);
        int i3 = i2 | (l46Var.i(l26Var) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var4) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            yc7 yc7Var = (yc7) z5c.G(job.a.b(yc7.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            use useVarO = n3d.o(null, l46Var, 3);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = zrd.b(new jf6(11, yc7Var, useVarO));
                l46Var.p0(objR);
            }
            h0e h0eVar = (h0e) objR;
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = new fo5();
                l46Var.p0(objR2);
            }
            fo5 fo5Var = (fo5) objR2;
            Object obj2 = (n8e) yc7Var.z.getValue();
            if (obj2 instanceof m8e) {
                l46Var.f0(-2063953899);
                Object objR3 = l46Var.R();
                if (objR3 == obj) {
                    objR3 = q1c.f(Boolean.FALSE);
                    l46Var.p0(objR3);
                }
                e89 e89Var = (e89) objR3;
                m8e m8eVar = (m8e) obj2;
                RedeemPopup redeemPopup = m8eVar.a;
                int i4 = i3 & 896;
                boolean zI = ((i3 & 14) == 4) | ((i3 & 112) == 32) | (i4 == 256) | l46Var.i(obj2);
                Object objR4 = l46Var.R();
                if (zI || objR4 == obj) {
                    Object kfVar = new kf(x16Var4, m8eVar, x16Var, l26Var, e89Var, 13);
                    x16Var4 = x16Var4;
                    l46Var.p0(kfVar);
                    objR4 = kfVar;
                }
                a26 a26Var = (a26) objR4;
                boolean zI2 = l46Var.i(yc7Var) | (i4 == 256);
                Object objR5 = l46Var.R();
                if (zI2 || objR5 == obj) {
                    objR5 = new n25(yc7Var, x16Var4, e89Var, 9);
                    l46Var.p0(objR5);
                }
                j(redeemPopup, a26Var, (x16) objR5, l46Var, RedeemPopup.$stable);
                l46Var.r(false);
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    final int i5 = 0;
                    ojbVarV.d = new l26(l26Var, x16Var, x16Var4, i2, i5) { // from class: cc7
                        public final /* synthetic */ int a;
                        public final /* synthetic */ l26 b;
                        public final /* synthetic */ x16 c;
                        public final /* synthetic */ x16 d;

                        {
                            this.a = i5;
                        }

                        @Override // defpackage.l26
                        public final Object z(Object obj3, Object obj4) {
                            int i6 = this.a;
                            wef wefVar = wef.a;
                            x16 x16Var5 = this.d;
                            x16 x16Var6 = this.c;
                            l26 l26Var2 = this.b;
                            l46 l46Var2 = (l46) obj3;
                            ((Integer) obj4).getClass();
                            switch (i6) {
                                case 0:
                                    z7f.e(l26Var2, x16Var6, x16Var5, l46Var2, k99.P(1));
                                    break;
                                default:
                                    z7f.e(l26Var2, x16Var6, x16Var5, l46Var2, k99.P(1));
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    return;
                }
                return;
            }
            l46Var.f0(-2063419583);
            l46Var.r(false);
            String str = (String) yc7Var.y.getValue();
            j09 j09VarJ = g21.J(b.c(g09.a, 1.0f));
            String strQ = afc.q(R.string.invitation_code_entry, l46Var);
            dd2 dd2VarB0 = af1.b0(119487377, new m65(fo5Var, useVarO, str, 13), l46Var);
            q8 q8Var = new q8(26, x16Var2, yc7Var, useVarO, h0eVar);
            x16Var3 = x16Var2;
            dd2 dd2VarB1 = af1.b0(-12836368, q8Var, l46Var);
            boolean z = (i3 & 896) == 256;
            Object objR6 = l46Var.R();
            if (z || objR6 == obj) {
                objR6 = new fn6(5, x16Var3);
                l46Var.p0(objR6);
            }
            nk8.f(j09VarJ, strQ, dd2VarB0, dd2VarB1, null, (x16) objR6, l46Var, 3456);
        } else {
            x16Var3 = x16Var4;
            l46Var.Z();
        }
        ojb ojbVarV2 = l46Var.v();
        if (ojbVarV2 != null) {
            final int i6 = 1;
            final x16 x16Var5 = x16Var3;
            ojbVarV2.d = new l26(l26Var, x16Var, x16Var5, i2, i6) { // from class: cc7
                public final /* synthetic */ int a;
                public final /* synthetic */ l26 b;
                public final /* synthetic */ x16 c;
                public final /* synthetic */ x16 d;

                {
                    this.a = i6;
                }

                @Override // defpackage.l26
                public final Object z(Object obj3, Object obj4) {
                    int i7 = this.a;
                    wef wefVar = wef.a;
                    x16 x16Var6 = this.d;
                    x16 x16Var7 = this.c;
                    l26 l26Var2 = this.b;
                    l46 l46Var2 = (l46) obj3;
                    ((Integer) obj4).getClass();
                    switch (i7) {
                        case 0:
                            z7f.e(l26Var2, x16Var7, x16Var6, l46Var2, k99.P(1));
                            break;
                        default:
                            z7f.e(l26Var2, x16Var7, x16Var6, l46Var2, k99.P(1));
                            break;
                    }
                    return wefVar;
                }
            };
        }
    }

    public static final void f(dd2 dd2Var, l46 l46Var, int i2) {
        l46Var.h0(-318078207);
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            kr7.a(null, dd2Var, l46Var, 48);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qx1(dd2Var, i2, 6);
        }
    }

    public static final void g(int i2, int i3, l46 l46Var, j09 j09Var, String str) {
        int i4;
        j09 j09Var2;
        ojb ojbVarV;
        mc2 mc2Var;
        l46Var.h0(-399605232);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.g(str) ? 32 : 16;
        }
        if (l46Var.W(i4 & 1, (i4 & 19) != 18)) {
            j09 j09Var3 = i5 != 0 ? g09.a : j09Var;
            if (str == null || v4e.Q(str)) {
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                } else {
                    mc2Var = new mc2(j09Var3, str, i2, i3, 1);
                }
            } else {
                i(j09Var3, 0L, 0L, 0L, af1.b0(21864669, new ob0(str, 14), l46Var), l46Var, (i4 & 14) | 24576, 14);
                j09Var2 = j09Var3;
            }
            ojbVarV.d = mc2Var;
        }
        l46Var.Z();
        j09Var2 = j09Var;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            mc2Var = new mc2(j09Var2, str, i2, i3, 2);
            ojbVarV.d = mc2Var;
        }
    }

    public static final void h(int i2, x16 x16Var, x16 x16Var2, l46 l46Var, j09 j09Var) {
        x16 x16Var3;
        x16 x16Var4;
        j09 j09Var2;
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var2.h0(-1455527147);
        int i3 = (l46Var2.i(x16Var) ? 4 : 2) | i2 | (l46Var2.i(x16Var2) ? 32 : 16) | 384;
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            t7c t7cVarA = s7c.a(new uc0(20.0f, true, new qc0(i4)), ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09Var2 = g09.a;
            j09 j09VarJ = m93.J(l46Var2, j09Var2);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            c8b.c(null, null, false, null, x16Var, ym8.b, l46Var2, ((i3 << 12) & 57344) | 196608, 15);
            l46Var2 = l46Var;
            x16Var4 = x16Var2;
            x16Var3 = x16Var;
            c8b.c(null, null, false, null, x16Var4, ym8.c, l46Var2, ((i3 << 9) & 57344) | 196608, 15);
            l46Var2.r(true);
        } else {
            x16Var3 = x16Var;
            x16Var4 = x16Var2;
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o(x16Var3, x16Var4, j09Var2, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x0110  */
    /* JADX WARN: Code duplicated, block: B:75:0x011d  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void i(j09 j09Var, long j2, long j3, long j4, final dd2 dd2Var, l46 l46Var, final int i2, final int i3) {
        j09 j09Var2;
        int i4;
        long j5;
        int i5;
        long j6;
        int i6;
        int i7;
        long j7;
        int i8;
        boolean z;
        final j09 j09Var3;
        final long j8;
        final long j9;
        final long j10;
        ojb ojbVarV;
        long jL;
        long jL2;
        long jL3;
        int i9;
        l46Var.h0(-477067041);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
            j09Var2 = j09Var;
        } else if ((i2 & 6) == 0) {
            j09Var2 = j09Var;
            i4 = (l46Var.g(j09Var2) ? 4 : 2) | i2;
        } else {
            j09Var2 = j09Var;
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                j5 = j2;
                i4 |= l46Var.f(j5) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    j6 = j3;
                    if (l46Var.f(j6)) {
                        i6 = 256;
                    } else {
                        i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i2 & 3072) == 0) {
                        j7 = j4;
                        if (l46Var.f(j7)) {
                            i8 = 2048;
                        } else {
                            i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                        }
                        i4 |= i8;
                    }
                    if ((i2 & 24576) == 0) {
                        if (l46Var.i(dd2Var)) {
                            i9 = 16384;
                        } else {
                            i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i4 |= i9;
                    }
                    if ((i4 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i4 & 1, z)) {
                        if (i10 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var2;
                        }
                        if (i11 != 0) {
                            jL = w6c.l(17);
                        } else {
                            jL = j5;
                        }
                        if (i5 != 0) {
                            jL2 = w6c.l(27);
                        } else {
                            jL2 = j6;
                        }
                        if (i7 != 0) {
                            jL3 = w6c.l(18);
                        } else {
                            jL3 = j7;
                        }
                        pr4 pr4Var = nte.a;
                        mh3.a(pr4Var.a(mue.a((mue) l46Var.k(pr4Var), 0L, jL, ar5.b, ((y8b) l46Var.k(x8b.a)).c, 0L, null, 0, jL2, null, null, 16646105)), af1.b0(1038138783, new cq1(j09Var3, jL3, dd2Var), l46Var), l46Var, 56);
                        j10 = jL3;
                        j8 = jL;
                        j9 = jL2;
                    } else {
                        l46Var.Z();
                        j09Var3 = j09Var2;
                        j8 = j5;
                        j9 = j6;
                        j10 = j7;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: im8
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                z7f.i(j09Var3, j8, j9, j10, dd2Var, (l46) obj, k99.P(i2 | 1), i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i4 |= 3072;
                j7 = j4;
                if ((i2 & 24576) == 0) {
                    if (l46Var.i(dd2Var)) {
                        i9 = 16384;
                    } else {
                        i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i9;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i4 & 1, z)) {
                    if (i10 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if (i11 != 0) {
                        jL = w6c.l(17);
                    } else {
                        jL = j5;
                    }
                    if (i5 != 0) {
                        jL2 = w6c.l(27);
                    } else {
                        jL2 = j6;
                    }
                    if (i7 != 0) {
                        jL3 = w6c.l(18);
                    } else {
                        jL3 = j7;
                    }
                    pr4 pr4Var2 = nte.a;
                    mh3.a(pr4Var2.a(mue.a((mue) l46Var.k(pr4Var2), 0L, jL, ar5.b, ((y8b) l46Var.k(x8b.a)).c, 0L, null, 0, jL2, null, null, 16646105)), af1.b0(1038138783, new cq1(j09Var3, jL3, dd2Var), l46Var), l46Var, 56);
                    j10 = jL3;
                    j8 = jL;
                    j9 = jL2;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    j8 = j5;
                    j9 = j6;
                    j10 = j7;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: im8
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            z7f.i(j09Var3, j8, j9, j10, dd2Var, (l46) obj, k99.P(i2 | 1), i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 384;
            j6 = j3;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    j7 = j4;
                    if (l46Var.f(j7)) {
                        i8 = 2048;
                    } else {
                        i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i4 |= i8;
                }
                if ((i2 & 24576) == 0) {
                    if (l46Var.i(dd2Var)) {
                        i9 = 16384;
                    } else {
                        i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i9;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i4 & 1, z)) {
                    if (i10 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if (i11 != 0) {
                        jL = w6c.l(17);
                    } else {
                        jL = j5;
                    }
                    if (i5 != 0) {
                        jL2 = w6c.l(27);
                    } else {
                        jL2 = j6;
                    }
                    if (i7 != 0) {
                        jL3 = w6c.l(18);
                    } else {
                        jL3 = j7;
                    }
                    pr4 pr4Var3 = nte.a;
                    mh3.a(pr4Var3.a(mue.a((mue) l46Var.k(pr4Var3), 0L, jL, ar5.b, ((y8b) l46Var.k(x8b.a)).c, 0L, null, 0, jL2, null, null, 16646105)), af1.b0(1038138783, new cq1(j09Var3, jL3, dd2Var), l46Var), l46Var, 56);
                    j10 = jL3;
                    j8 = jL;
                    j9 = jL2;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    j8 = j5;
                    j9 = j6;
                    j10 = j7;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: im8
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            z7f.i(j09Var3, j8, j9, j10, dd2Var, (l46) obj, k99.P(i2 | 1), i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 3072;
            j7 = j4;
            if ((i2 & 24576) == 0) {
                if (l46Var.i(dd2Var)) {
                    i9 = 16384;
                } else {
                    i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i9;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i4 & 1, z)) {
                if (i10 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                if (i11 != 0) {
                    jL = w6c.l(17);
                } else {
                    jL = j5;
                }
                if (i5 != 0) {
                    jL2 = w6c.l(27);
                } else {
                    jL2 = j6;
                }
                if (i7 != 0) {
                    jL3 = w6c.l(18);
                } else {
                    jL3 = j7;
                }
                pr4 pr4Var4 = nte.a;
                mh3.a(pr4Var4.a(mue.a((mue) l46Var.k(pr4Var4), 0L, jL, ar5.b, ((y8b) l46Var.k(x8b.a)).c, 0L, null, 0, jL2, null, null, 16646105)), af1.b0(1038138783, new cq1(j09Var3, jL3, dd2Var), l46Var), l46Var, 56);
                j10 = jL3;
                j8 = jL;
                j9 = jL2;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                j8 = j5;
                j9 = j6;
                j10 = j7;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: im8
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        z7f.i(j09Var3, j8, j9, j10, dd2Var, (l46) obj, k99.P(i2 | 1), i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 48;
        j5 = j2;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                j6 = j3;
                if (l46Var.f(j6)) {
                    i6 = 256;
                } else {
                    i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    j7 = j4;
                    if (l46Var.f(j7)) {
                        i8 = 2048;
                    } else {
                        i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i4 |= i8;
                }
                if ((i2 & 24576) == 0) {
                    if (l46Var.i(dd2Var)) {
                        i9 = 16384;
                    } else {
                        i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i9;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i4 & 1, z)) {
                    if (i10 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if (i11 != 0) {
                        jL = w6c.l(17);
                    } else {
                        jL = j5;
                    }
                    if (i5 != 0) {
                        jL2 = w6c.l(27);
                    } else {
                        jL2 = j6;
                    }
                    if (i7 != 0) {
                        jL3 = w6c.l(18);
                    } else {
                        jL3 = j7;
                    }
                    pr4 pr4Var5 = nte.a;
                    mh3.a(pr4Var5.a(mue.a((mue) l46Var.k(pr4Var5), 0L, jL, ar5.b, ((y8b) l46Var.k(x8b.a)).c, 0L, null, 0, jL2, null, null, 16646105)), af1.b0(1038138783, new cq1(j09Var3, jL3, dd2Var), l46Var), l46Var, 56);
                    j10 = jL3;
                    j8 = jL;
                    j9 = jL2;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    j8 = j5;
                    j9 = j6;
                    j10 = j7;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: im8
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            z7f.i(j09Var3, j8, j9, j10, dd2Var, (l46) obj, k99.P(i2 | 1), i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 3072;
            j7 = j4;
            if ((i2 & 24576) == 0) {
                if (l46Var.i(dd2Var)) {
                    i9 = 16384;
                } else {
                    i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i9;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i4 & 1, z)) {
                if (i10 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                if (i11 != 0) {
                    jL = w6c.l(17);
                } else {
                    jL = j5;
                }
                if (i5 != 0) {
                    jL2 = w6c.l(27);
                } else {
                    jL2 = j6;
                }
                if (i7 != 0) {
                    jL3 = w6c.l(18);
                } else {
                    jL3 = j7;
                }
                pr4 pr4Var6 = nte.a;
                mh3.a(pr4Var6.a(mue.a((mue) l46Var.k(pr4Var6), 0L, jL, ar5.b, ((y8b) l46Var.k(x8b.a)).c, 0L, null, 0, jL2, null, null, 16646105)), af1.b0(1038138783, new cq1(j09Var3, jL3, dd2Var), l46Var), l46Var, 56);
                j10 = jL3;
                j8 = jL;
                j9 = jL2;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                j8 = j5;
                j9 = j6;
                j10 = j7;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: im8
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        z7f.i(j09Var3, j8, j9, j10, dd2Var, (l46) obj, k99.P(i2 | 1), i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 384;
        j6 = j3;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & 3072) == 0) {
                j7 = j4;
                if (l46Var.f(j7)) {
                    i8 = 2048;
                } else {
                    i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i4 |= i8;
            }
            if ((i2 & 24576) == 0) {
                if (l46Var.i(dd2Var)) {
                    i9 = 16384;
                } else {
                    i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i9;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i4 & 1, z)) {
                if (i10 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                if (i11 != 0) {
                    jL = w6c.l(17);
                } else {
                    jL = j5;
                }
                if (i5 != 0) {
                    jL2 = w6c.l(27);
                } else {
                    jL2 = j6;
                }
                if (i7 != 0) {
                    jL3 = w6c.l(18);
                } else {
                    jL3 = j7;
                }
                pr4 pr4Var7 = nte.a;
                mh3.a(pr4Var7.a(mue.a((mue) l46Var.k(pr4Var7), 0L, jL, ar5.b, ((y8b) l46Var.k(x8b.a)).c, 0L, null, 0, jL2, null, null, 16646105)), af1.b0(1038138783, new cq1(j09Var3, jL3, dd2Var), l46Var), l46Var, 56);
                j10 = jL3;
                j8 = jL;
                j9 = jL2;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                j8 = j5;
                j9 = j6;
                j10 = j7;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: im8
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        z7f.i(j09Var3, j8, j9, j10, dd2Var, (l46) obj, k99.P(i2 | 1), i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 3072;
        j7 = j4;
        if ((i2 & 24576) == 0) {
            if (l46Var.i(dd2Var)) {
                i9 = 16384;
            } else {
                i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i4 |= i9;
        }
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i4 & 1, z)) {
            if (i10 != 0) {
                j09Var3 = g09.a;
            } else {
                j09Var3 = j09Var2;
            }
            if (i11 != 0) {
                jL = w6c.l(17);
            } else {
                jL = j5;
            }
            if (i5 != 0) {
                jL2 = w6c.l(27);
            } else {
                jL2 = j6;
            }
            if (i7 != 0) {
                jL3 = w6c.l(18);
            } else {
                jL3 = j7;
            }
            pr4 pr4Var8 = nte.a;
            mh3.a(pr4Var8.a(mue.a((mue) l46Var.k(pr4Var8), 0L, jL, ar5.b, ((y8b) l46Var.k(x8b.a)).c, 0L, null, 0, jL2, null, null, 16646105)), af1.b0(1038138783, new cq1(j09Var3, jL3, dd2Var), l46Var), l46Var, 56);
            j10 = jL3;
            j8 = jL;
            j9 = jL2;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
            j8 = j5;
            j9 = j6;
            j10 = j7;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: im8
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z7f.i(j09Var3, j8, j9, j10, dd2Var, (l46) obj, k99.P(i2 | 1), i3);
                    return wef.a;
                }
            };
        }
    }

    public static final void j(RedeemPopup redeemPopup, a26 a26Var, x16 x16Var, l46 l46Var, int i2) {
        int i3;
        a26 a26Var2;
        x16 x16Var2;
        String text;
        x16 x16Var3 = x16Var;
        a26Var.getClass();
        x16Var3.getClass();
        l46Var.h0(-1472332459);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var.g(redeemPopup) : l46Var.i(redeemPopup) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(a26Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(x16Var3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i4 = i3;
        boolean z = true;
        boolean z2 = false;
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            RedeemPopupAction actionButton = redeemPopup.getActionButton();
            RedeemPopupAction cancelButton = redeemPopup.getCancelButton();
            String text2 = actionButton != null ? actionButton.getText() : null;
            if (text2 == null) {
                text2 = tec.i(l46Var, -1867245278, R.string.button_continue, l46Var, false);
            } else {
                l46Var.f0(-1867246084);
                l46Var.r(false);
            }
            String str = text2;
            boolean z3 = (i4 & 14) == 4 || ((i4 & 8) != 0 && l46Var.g(redeemPopup));
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z3 || objR == i8cVar) {
                objR = q1c.f(Boolean.FALSE);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            int i5 = i4 & 896;
            boolean zG = l46Var.g(e89Var) | ((i4 & 112) == 32) | l46Var.i(actionButton) | (i5 == 256);
            Object objR2 = l46Var.R();
            if (zG || objR2 == i8cVar) {
                zlb zlbVar = new zlb(a26Var, actionButton, x16Var3, e89Var, 0);
                l46Var.p0(zlbVar);
                objR2 = zlbVar;
            }
            x16 x16Var4 = (x16) objR2;
            if (cancelButton == null) {
                l46Var.f0(-2049706059);
                l46Var.r(false);
                x16Var2 = null;
            } else {
                l46Var.f0(-2049706058);
                boolean z4 = i5 == 256;
                Object objR3 = l46Var.R();
                if (z4 || objR3 == i8cVar) {
                    objR3 = new yca(8, x16Var3);
                    l46Var.p0(objR3);
                }
                x16Var2 = (x16) objR3;
                l46Var.r(false);
            }
            if (cancelButton == null || (text = cancelButton.getText()) == null) {
                text = "";
            }
            String title = redeemPopup.getTitle();
            dd2 dd2VarB0 = af1.b0(-2117588412, new wf8(14, redeemPopup), l46Var);
            s84 s84Var = new s84(z, z2, 4);
            int i6 = ((i4 << 15) & 29360128) | 1572912;
            x16 x16Var5 = x16Var2;
            a26Var2 = a26Var;
            kj0.F(title, dd2VarB0, str, text, false, false, s84Var, x16Var3, x16Var5, x16Var4, l46Var, i6, 48);
            x16Var3 = x16Var3;
        } else {
            a26Var2 = a26Var;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(redeemPopup, a26Var2, x16Var3, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v42 */
    public static final void k(boolean z, zhe zheVar, boolean z2, boolean z3, boolean z4, final a26 a26Var, a26 a26Var2, l46 l46Var, int i2) {
        final zhe zheVar2;
        boolean z5;
        j09 j09VarW;
        final int i3;
        d31 d31Var;
        Object obj;
        int i4;
        boolean z6;
        l46 l46Var2;
        Object obj2;
        final a26 a26Var3 = a26Var2;
        l46 l46Var3 = l46Var;
        int i5 = zheVar.b;
        l46Var3.h0(-161387686);
        int i6 = i2 | (l46Var3.h(z) ? 4 : 2) | (l46Var3.g(zheVar) ? 32 : 16) | (l46Var3.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var3.h(z3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var3.h(z4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var3.i(a26Var) ? 131072 : 65536) | (l46Var3.i(a26Var3) ? 1048576 : 524288);
        if (l46Var3.W(i6 & 1, (599187 & i6) != 599186)) {
            boolean z7 = i5 != -1;
            TarotCardType tarotCardType = zheVar.a;
            boolean zH = ((i6 & 896) == 256) | ((i6 & 14) == 4) | l46Var3.h(z7);
            Object objR = l46Var3.R();
            Object obj3 = sf2.a;
            if (zH || objR == obj3) {
                objR = Boolean.valueOf(z2 || (z && i5 == -1));
                l46Var3.p0(objR);
            }
            boolean zBooleanValue = ((Boolean) objR).booleanValue();
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var3, 54);
            int iHashCode = Long.hashCode(l46Var3.T);
            u8a u8aVarM = l46Var3.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var3, g09Var);
            lf2.q.getClass();
            l46Var3.j0();
            boolean z8 = l46Var3.S;
            x16 x16Var = LayoutNode.h1;
            if (z8) {
                l46Var3.l(x16Var);
            } else {
                l46Var3.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var3, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var3, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var3, numValueOf);
            dec.k(l46Var3);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var3, j09VarJ);
            j09 j09VarP = pa7.p(g09Var, zBooleanValue ? 0.4f : 1.0f);
            if (z4) {
                l46Var3.f0(1933705379);
                j09VarW = db6.w(g09Var, 2.0f, ((m82) l46Var3.k(o82.a)).a, a7c.b(eze.a(l46Var3).a.f));
                z5 = false;
                l46Var3.r(false);
            } else {
                z5 = false;
                l46Var3.f0(-1877278440);
                l46Var3.r(false);
                j09VarW = g09Var;
            }
            j09 j09VarD = j09VarP.D(j09VarW);
            lx0 lx0Var = ndb.b;
            xn8 xn8VarC = s21.c(lx0Var, z5);
            int iHashCode2 = Long.hashCode(l46Var3.T);
            u8a u8aVarM2 = l46Var3.m();
            j09 j09VarJ2 = m93.J(l46Var3, j09VarD);
            l46Var3.j0();
            if (l46Var3.S) {
                l46Var3.l(x16Var);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var, l46Var3, xn8VarC);
            dec.l(he2Var2, l46Var3, u8aVarM2);
            ib8.s(iHashCode2, l46Var3, he2Var3, l46Var3);
            dec.l(he2Var4, l46Var3, j09VarJ2);
            boolean z9 = !z2;
            int i7 = i6 & 458752;
            int i8 = i6 & 112;
            boolean z10 = (i7 == 131072) | (i8 == 32);
            Object objR2 = l46Var3.R();
            if (z10 || objR2 == obj3) {
                zheVar2 = zheVar;
                i3 = 0;
                objR2 = new x16() { // from class: ks1
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i9 = i3;
                        wef wefVar = wef.a;
                        zhe zheVar3 = zheVar2;
                        a26 a26Var4 = a26Var;
                        switch (i9) {
                            case 0:
                                a26Var4.d(zheVar3.a);
                                break;
                            default:
                                a26Var4.d(zheVar3.a);
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var3.p0(objR2);
            } else {
                zheVar2 = zheVar;
                i3 = 0;
            }
            j09 j09VarC = androidx.compose.foundation.b.c(g09Var, z9, null, null, (x16) objR2, 14);
            String cardKey = tarotCardType.getCardKey();
            final int i9 = 1;
            int i10 = !zheVar2.c ? 1 : 0;
            cardKey.getClass();
            o7c.d(j09VarC, new qhe(cardKey, i10), null, true, null, eze.a(l46Var3).a.f, null, false, l46Var, 3072, 212);
            l46 l46Var4 = l46Var;
            d31 d31Var2 = d31.a;
            if (z3) {
                d31Var = d31Var2;
                obj = obj3;
                i4 = 32;
                z6 = 0;
                l46Var4.f0(1148440268);
                l46Var4.r(false);
            } else {
                l46Var4.f0(1147955676);
                j09 j09VarA = d31Var2.a(ynb.d0(0.0f, 8.0f, 8.0f, 0.0f, 9, b.l(g09Var, 20.0f)), ndb.d);
                boolean z11 = i5 != -1;
                pr4 pr4Var = o82.a;
                d31Var = d31Var2;
                qy1 qy1VarN = an1.n(((m82) l46Var4.k(pr4Var)).a, y72.e, ((m82) l46Var4.k(pr4Var)).b, l46Var4, 56);
                boolean z12 = i7 == 131072;
                i4 = 32;
                boolean z13 = (i8 == 32) | z12;
                Object objR3 = l46Var4.R();
                if (z13) {
                    obj2 = obj3;
                } else {
                    obj2 = obj3;
                    if (objR3 == obj2) {
                    }
                    obj = obj2;
                    qk2.i(z11, j09VarA, false, 0.0f, qy1VarN, (a26) objR3, l46Var4, 0, 12);
                    z6 = 0;
                    l46Var4.r(false);
                }
                objR3 = new l0(28, a26Var, zheVar2);
                l46Var4.p0(objR3);
                obj = obj2;
                qk2.i(z11, j09VarA, false, 0.0f, qy1VarN, (a26) objR3, l46Var4, 0, 12);
                z6 = 0;
                l46Var4.r(false);
            }
            if (i5 == -1 || z3) {
                l46Var4.f0(1148733900);
                l46Var4.r(z6);
            } else {
                l46Var4.f0(1148501338);
                s21.a(tm7.o(d31Var.b(g09Var), ((e8b) l46Var4.k(l8b.a)).m, a7c.b(eze.a(l46Var4).a.f)), l46Var4, z6);
                l46Var4.r(z6);
            }
            if (i5 != -1) {
                l46Var4.f0(1148795776);
                boolean z14 = z6;
                nte.b(String.valueOf(i5 + 1), d31Var.a(ynb.d0(10.0f, 0.0f, 0.0f, 0.0f, 12, g09Var), lx0Var), 0L, w6c.l(17), null, null, 0L, null, null, w6c.k(27.2d), 0, false, 0, 0, null, mue.a((mue) l46Var4.k(nte.a), y72.e, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), l46Var, 24576, 48, 129004);
                l46 l46Var5 = l46Var;
                if (z3) {
                    a26Var3 = a26Var2;
                    l46Var5.f0(1149691180);
                    l46Var5.r(z14);
                } else {
                    l46Var5.f0(1149167125);
                    j09 j09VarN = tm7.n(d31Var.a(b.l(g09Var, 32.0f), ndb.v), new ibb(t72.I(new y72(y72.b(y72.b, 0.5f)), new y72(y72.j)), null, 9205357640488583168L, Float.POSITIVE_INFINITY), a7c.a, 4);
                    boolean z15 = (i8 == i4 ? true : z14 ? 1 : 0) | ((i6 & 3670016) == 1048576 ? true : z14 ? 1 : 0);
                    Object objR4 = l46Var5.R();
                    if (z15 != 0 || objR4 == obj) {
                        a26Var3 = a26Var2;
                        objR4 = new x16() { // from class: ks1
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i11 = i9;
                                wef wefVar = wef.a;
                                zhe zheVar3 = zheVar2;
                                a26 a26Var4 = a26Var3;
                                switch (i11) {
                                    case 0:
                                        a26Var4.d(zheVar3.a);
                                        break;
                                    default:
                                        a26Var4.d(zheVar3.a);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                        l46Var5.p0(objR4);
                    } else {
                        a26Var3 = a26Var2;
                    }
                    bm8.h((x16) objR4, j09VarN, false, null, null, af1.b, l46Var5, 1572864, 60);
                    l46Var5.r(z14);
                }
                l46Var5.r(z14);
                l46Var2 = l46Var5;
            } else {
                a26Var3 = a26Var2;
                l46Var4.f0(1149699116);
                l46Var4.r(z6);
                l46Var2 = l46Var4;
            }
            l46Var2.r(true);
            nte.b(afc.q(tarotCardType.getTitleRes(), l46Var2), null, 0L, w6c.l(12), null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var, 24576, 0, 261102);
            l46Var3 = l46Var;
            l46Var3.r(true);
        } else {
            zheVar2 = zheVar;
            l46Var3.Z();
        }
        ojb ojbVarV = l46Var3.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ls1(z, zheVar2, z2, z3, z4, a26Var, a26Var3, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016a  */
    /* JADX WARN: Code duplicated, block: B:103:0x016c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0177 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x0179  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01be  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:124:0x0218  */
    /* JADX WARN: Code duplicated, block: B:125:0x021e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0247  */
    /* JADX WARN: Code duplicated, block: B:131:0x024f A[LOOP:0: B:127:0x0241->B:131:0x024f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x0273  */
    /* JADX WARN: Code duplicated, block: B:137:0x0280  */
    /* JADX WARN: Code duplicated, block: B:139:0x0292  */
    /* JADX WARN: Code duplicated, block: B:142:0x029f  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ac A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:145:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x0104  */
    /* JADX WARN: Code duplicated, block: B:86:0x0111  */
    /* JADX WARN: Code duplicated, block: B:88:0x0123  */
    /* JADX WARN: Code duplicated, block: B:91:0x0135  */
    /* JADX WARN: Code duplicated, block: B:94:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x0148  */
    /* JADX WARN: Code duplicated, block: B:98:0x015c  */
    /* JADX WARN: Code duplicated, block: B:99:0x015e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r25v0, types: [l46] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [int] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    public static final void l(j09 j09Var, String str, boolean z, int i2, a26 a26Var, a26 a26Var2, l46 l46Var, int i3, int i4) {
        j09 j09Var2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        a26 a26Var3;
        int i8;
        int i9;
        boolean z3;
        int i10;
        boolean z4;
        a26 a26Var4;
        ojb ojbVarV;
        l26 c06Var;
        boolean z5;
        a26 a26Var5;
        Object objR;
        i8c i8cVar;
        Object obj;
        Object objR2;
        Object objF;
        s69 s69Var;
        a26 a26Var6;
        e89 e89VarI;
        Object objR3;
        Object objF2;
        s69 s69Var2;
        boolean zG;
        Object obj2;
        boolean z6;
        boolean z7;
        boolean z8;
        Object objR4;
        a26 a26Var7;
        ?? r10;
        int i11;
        ?? M0;
        ?? r6;
        int i12;
        Object obj3;
        int iT;
        List listC0;
        ?? Substring;
        Iterator itS;
        ?? r7;
        Object next;
        int i13;
        boolean z9;
        boolean z10;
        Object obj4;
        int i14;
        String str2 = str;
        str2.getClass();
        a26Var.getClass();
        l46Var.h0(928198524);
        int i15 = i4 & 1;
        if (i15 != 0) {
            i5 = i3 | 6;
            j09Var2 = j09Var;
        } else if ((i3 & 6) == 0) {
            j09Var2 = j09Var;
            i5 = (l46Var.g(j09Var2) ? 4 : 2) | i3;
        } else {
            j09Var2 = j09Var;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= l46Var.g(str2) ? 32 : 16;
        }
        int i16 = i4 & 4;
        if (i16 == 0) {
            if ((i3 & 384) == 0) {
                z2 = z;
                i5 |= l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i6 = i5 | 3072;
            if ((i3 & 24576) == 0) {
                if (l46Var.i(a26Var)) {
                    i14 = 16384;
                } else {
                    i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i6 |= i14;
            }
            i7 = i4 & 32;
            if (i7 != 0) {
                if ((196608 & i3) == 0) {
                    a26Var3 = a26Var2;
                    if (l46Var.i(a26Var3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i6 |= i8;
                }
                i9 = i6;
                if ((74899 & i9) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i9 & 1, z3)) {
                    if (i15 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i16 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i7 != 0) {
                        a26Var5 = null;
                    } else {
                        a26Var5 = a26Var3;
                    }
                    objR = l46Var.R();
                    i8cVar = sf2.a;
                    obj = objR;
                    if (objR == i8cVar) {
                        Boolean boolValueOf = Boolean.valueOf(z5);
                        l46Var.p0(boolValueOf);
                        obj = boolValueOf;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        boolean z11 = z5;
                        l46Var.f0(963201414);
                        l46Var.r(false);
                        objR2 = l46Var.R();
                        if (objR2 == i8cVar) {
                            objF = objR2;
                            objF = kv2.f(0, l46Var);
                        }
                        objF = objR2;
                        s69Var = (s69) objF;
                        a26Var6 = a26Var5;
                        e89VarI = q1c.i(a26Var, l46Var);
                        objR3 = l46Var.R();
                        objF2 = objR3;
                        if (objR3 == i8cVar) {
                            objF2 = kv2.f(0, l46Var);
                        }
                        s69Var2 = (s69) objF2;
                        zG = l46Var.g(e89VarI);
                        Object objR5 = l46Var.R();
                        obj2 = objR5;
                        if (zG || objR5 == i8cVar) {
                            sg4 sg4Var = new sg4(s69Var2, e89VarI, 2);
                            l46Var.p0(sg4Var);
                            obj2 = sg4Var;
                        }
                        af1.g(wef.a, (a26) obj2, l46Var);
                        if ((i9 & 112) == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        boolean zG2 = z6 | l46Var.g(e89VarI);
                        if ((i9 & 7168) == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = zG2 | z7;
                        objR4 = l46Var.R();
                        if (!z8 || objR4 == i8cVar) {
                            a26Var7 = a26Var6;
                            r10 = 0;
                            jm8 jm8Var = new jm8(str, 60, s69Var, s69Var2, e89VarI, null);
                            str2 = str;
                            i11 = 60;
                            l46Var.p0(jm8Var);
                            objR4 = jm8Var;
                        } else {
                            a26Var7 = a26Var6;
                            r10 = 0;
                            i11 = 60;
                            str2 = str;
                        }
                        af1.o((l26) objR4, l46Var, str2);
                        M0 = v4e.m0(((sz9) s69Var).j(), str2);
                        if ((i9 & 458752) == 131072) {
                            r6 = 1;
                        } else {
                            r6 = r10;
                        }
                        i12 = (l46Var.g(M0) ? 1 : 0) | r6;
                        Object objR6 = l46Var.R();
                        obj3 = objR6;
                        if (i12 == 0 || objR6 == i8cVar) {
                            n43 n43Var = new n43(4, a26Var7, M0);
                            l46Var.p0(n43Var);
                            obj3 = n43Var;
                        }
                        af1.u((x16) obj3, l46Var);
                        iT = v4e.T(M0, "\n\n", r10, 6);
                        if (iT < 0) {
                            listC0 = pu4.a;
                            Substring = M0;
                        } else {
                            listC0 = v4e.c0(M0.substring(r10, iT), new String[]{"\n\n"}, 6);
                            Substring = M0.substring(iT + 2);
                        }
                        c92 c92VarA = a92.a(new uc0(18.0f, true, new qc0(r10)), ndb.Y, l46Var, 6);
                        int iHashCode = Long.hashCode(l46Var.T);
                        u8a u8aVarM = l46Var.m();
                        j09 j09VarJ = m93.J(l46Var, j09Var2);
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, c92VarA);
                        dec.l(hj6.y, l46Var, u8aVarM);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                        dec.k(l46Var);
                        itS = kv2.s(l46Var, j09VarJ, hj6.x, -1369400892, listC0);
                        r7 = r10;
                        while (itS.hasNext()) {
                            next = itS.next();
                            i13 = r7 + 1;
                            if (r7 >= 0) {
                                t72.Z();
                                throw null;
                            }
                            l46Var.d0(-320381671, Integer.valueOf((int) r7));
                            g(r10, 1, l46Var, null, (String) next);
                            l46Var.r(r10);
                            r7 = i13;
                        }
                        l46Var.r(r10);
                        if (Substring.length() > 0) {
                            l46Var.f0(498395288);
                            g(r10, 1, l46Var, null, Substring);
                            l46Var.r(r10);
                        } else {
                            l46Var.f0(498449104);
                            l46Var.r(r10);
                        }
                        l46Var.r(true);
                        i10 = i11;
                        a26Var4 = a26Var7;
                        j09Var2 = j09Var2;
                        z4 = z11;
                    } else {
                        l46Var.f0(963069757);
                        if ((i9 & 458752) == 131072) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = z9 | ((i9 & 112) == 32);
                        Object objR7 = l46Var.R();
                        obj4 = objR7;
                        if (z10 || objR7 == i8cVar) {
                            n43 n43Var2 = new n43(3, a26Var5, str2);
                            l46Var.p0(n43Var2);
                            obj4 = n43Var2;
                        }
                        af1.u((x16) obj4, l46Var);
                        g(i9 & 126, 0, l46Var, j09Var2, str2);
                        l46Var.r(false);
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            return;
                        } else {
                            c06Var = new jv1(j09Var2, str2, z5, a26Var, a26Var5, i3, i4, 4);
                        }
                    }
                    ojbVarV.d = c06Var;
                }
                l46Var.Z();
                i10 = i2;
                z4 = z2;
                a26Var4 = a26Var3;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    c06Var = new c06(j09Var2, str2, z4, i10, a26Var, a26Var4, i3, i4);
                    ojbVarV.d = c06Var;
                }
            }
            i6 |= 196608;
            a26Var3 = a26Var2;
            i9 = i6;
            if ((74899 & i9) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i9 & 1, z3)) {
                if (i15 != 0) {
                    j09Var2 = g09.a;
                }
                if (i16 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i7 != 0) {
                    a26Var5 = null;
                } else {
                    a26Var5 = a26Var3;
                }
                objR = l46Var.R();
                i8cVar = sf2.a;
                obj = objR;
                if (objR == i8cVar) {
                    Boolean boolValueOf2 = Boolean.valueOf(z5);
                    l46Var.p0(boolValueOf2);
                    obj = boolValueOf2;
                }
                if (((Boolean) obj).booleanValue()) {
                    l46Var.f0(963069757);
                    if ((i9 & 458752) == 131072) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z9 | ((i9 & 112) == 32);
                    Object objR8 = l46Var.R();
                    obj4 = objR8;
                    if (z10) {
                        n43 n43Var3 = new n43(3, a26Var5, str2);
                        l46Var.p0(n43Var3);
                        obj4 = n43Var3;
                    } else {
                        n43 n43Var4 = new n43(3, a26Var5, str2);
                        l46Var.p0(n43Var4);
                        obj4 = n43Var4;
                    }
                    af1.u((x16) obj4, l46Var);
                    g(i9 & 126, 0, l46Var, j09Var2, str2);
                    l46Var.r(false);
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        return;
                    } else {
                        c06Var = new jv1(j09Var2, str2, z5, a26Var, a26Var5, i3, i4, 4);
                    }
                } else {
                    boolean z12 = z5;
                    l46Var.f0(963201414);
                    l46Var.r(false);
                    objR2 = l46Var.R();
                    if (objR2 == i8cVar) {
                        objF = objR2;
                        objF = kv2.f(0, l46Var);
                    }
                    objF = objR2;
                    s69Var = (s69) objF;
                    a26Var6 = a26Var5;
                    e89VarI = q1c.i(a26Var, l46Var);
                    objR3 = l46Var.R();
                    objF2 = objR3;
                    if (objR3 == i8cVar) {
                        objF2 = kv2.f(0, l46Var);
                    }
                    s69Var2 = (s69) objF2;
                    zG = l46Var.g(e89VarI);
                    Object objR9 = l46Var.R();
                    obj2 = objR9;
                    if (zG) {
                        sg4 sg4Var2 = new sg4(s69Var2, e89VarI, 2);
                        l46Var.p0(sg4Var2);
                        obj2 = sg4Var2;
                    } else {
                        sg4 sg4Var3 = new sg4(s69Var2, e89VarI, 2);
                        l46Var.p0(sg4Var3);
                        obj2 = sg4Var3;
                    }
                    af1.g(wef.a, (a26) obj2, l46Var);
                    if ((i9 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean zG3 = z6 | l46Var.g(e89VarI);
                    if ((i9 & 7168) == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = zG3 | z7;
                    objR4 = l46Var.R();
                    if (z8) {
                        a26Var7 = a26Var6;
                        r10 = 0;
                        jm8 jm8Var2 = new jm8(str, 60, s69Var, s69Var2, e89VarI, null);
                        str2 = str;
                        i11 = 60;
                        l46Var.p0(jm8Var2);
                        objR4 = jm8Var2;
                    } else {
                        a26Var7 = a26Var6;
                        r10 = 0;
                        jm8 jm8Var3 = new jm8(str, 60, s69Var, s69Var2, e89VarI, null);
                        str2 = str;
                        i11 = 60;
                        l46Var.p0(jm8Var3);
                        objR4 = jm8Var3;
                    }
                    af1.o((l26) objR4, l46Var, str2);
                    M0 = v4e.m0(((sz9) s69Var).j(), str2);
                    if ((i9 & 458752) == 131072) {
                        r6 = 1;
                    } else {
                        r6 = r10;
                    }
                    i12 = (l46Var.g(M0) ? 1 : 0) | r6;
                    Object objR10 = l46Var.R();
                    obj3 = objR10;
                    if (i12 == 0) {
                        n43 n43Var5 = new n43(4, a26Var7, M0);
                        l46Var.p0(n43Var5);
                        obj3 = n43Var5;
                    } else {
                        n43 n43Var6 = new n43(4, a26Var7, M0);
                        l46Var.p0(n43Var6);
                        obj3 = n43Var6;
                    }
                    af1.u((x16) obj3, l46Var);
                    iT = v4e.T(M0, "\n\n", r10, 6);
                    if (iT < 0) {
                        listC0 = pu4.a;
                        Substring = M0;
                    } else {
                        listC0 = v4e.c0(M0.substring(r10, iT), new String[]{"\n\n"}, 6);
                        Substring = M0.substring(iT + 2);
                    }
                    c92 c92VarA2 = a92.a(new uc0(18.0f, true, new qc0(r10)), ndb.Y, l46Var, 6);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09Var2);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA2);
                    dec.l(hj6.y, l46Var, u8aVarM2);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode2));
                    dec.k(l46Var);
                    itS = kv2.s(l46Var, j09VarJ2, hj6.x, -1369400892, listC0);
                    r7 = r10;
                    while (itS.hasNext()) {
                        next = itS.next();
                        i13 = r7 + 1;
                        if (r7 >= 0) {
                            t72.Z();
                            throw null;
                        }
                        l46Var.d0(-320381671, Integer.valueOf((int) r7));
                        g(r10, 1, l46Var, null, (String) next);
                        l46Var.r(r10);
                        r7 = i13;
                    }
                    l46Var.r(r10);
                    if (Substring.length() > 0) {
                        l46Var.f0(498395288);
                        g(r10, 1, l46Var, null, Substring);
                        l46Var.r(r10);
                    } else {
                        l46Var.f0(498449104);
                        l46Var.r(r10);
                    }
                    l46Var.r(true);
                    i10 = i11;
                    a26Var4 = a26Var7;
                    j09Var2 = j09Var2;
                    z4 = z12;
                }
                ojbVarV.d = c06Var;
            }
            l46Var.Z();
            i10 = i2;
            z4 = z2;
            a26Var4 = a26Var3;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                c06Var = new c06(j09Var2, str2, z4, i10, a26Var, a26Var4, i3, i4);
                ojbVarV.d = c06Var;
            }
        }
        i5 |= 384;
        z2 = z;
        i6 = i5 | 3072;
        if ((i3 & 24576) == 0) {
            if (l46Var.i(a26Var)) {
                i14 = 16384;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i6 |= i14;
        }
        i7 = i4 & 32;
        if (i7 != 0) {
            if ((196608 & i3) == 0) {
                a26Var3 = a26Var2;
                if (l46Var.i(a26Var3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i6 |= i8;
            }
            i9 = i6;
            if ((74899 & i9) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i9 & 1, z3)) {
                if (i15 != 0) {
                    j09Var2 = g09.a;
                }
                if (i16 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i7 != 0) {
                    a26Var5 = null;
                } else {
                    a26Var5 = a26Var3;
                }
                objR = l46Var.R();
                i8cVar = sf2.a;
                obj = objR;
                if (objR == i8cVar) {
                    Boolean boolValueOf3 = Boolean.valueOf(z5);
                    l46Var.p0(boolValueOf3);
                    obj = boolValueOf3;
                }
                if (((Boolean) obj).booleanValue()) {
                    l46Var.f0(963069757);
                    if ((i9 & 458752) == 131072) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z9 | ((i9 & 112) == 32);
                    Object objR11 = l46Var.R();
                    obj4 = objR11;
                    if (z10) {
                        n43 n43Var7 = new n43(3, a26Var5, str2);
                        l46Var.p0(n43Var7);
                        obj4 = n43Var7;
                    } else {
                        n43 n43Var8 = new n43(3, a26Var5, str2);
                        l46Var.p0(n43Var8);
                        obj4 = n43Var8;
                    }
                    af1.u((x16) obj4, l46Var);
                    g(i9 & 126, 0, l46Var, j09Var2, str2);
                    l46Var.r(false);
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        return;
                    } else {
                        c06Var = new jv1(j09Var2, str2, z5, a26Var, a26Var5, i3, i4, 4);
                    }
                } else {
                    boolean z13 = z5;
                    l46Var.f0(963201414);
                    l46Var.r(false);
                    objR2 = l46Var.R();
                    if (objR2 == i8cVar) {
                        objF = objR2;
                        objF = kv2.f(0, l46Var);
                    }
                    objF = objR2;
                    s69Var = (s69) objF;
                    a26Var6 = a26Var5;
                    e89VarI = q1c.i(a26Var, l46Var);
                    objR3 = l46Var.R();
                    objF2 = objR3;
                    if (objR3 == i8cVar) {
                        objF2 = kv2.f(0, l46Var);
                    }
                    s69Var2 = (s69) objF2;
                    zG = l46Var.g(e89VarI);
                    Object objR12 = l46Var.R();
                    obj2 = objR12;
                    if (zG) {
                        sg4 sg4Var4 = new sg4(s69Var2, e89VarI, 2);
                        l46Var.p0(sg4Var4);
                        obj2 = sg4Var4;
                    } else {
                        sg4 sg4Var5 = new sg4(s69Var2, e89VarI, 2);
                        l46Var.p0(sg4Var5);
                        obj2 = sg4Var5;
                    }
                    af1.g(wef.a, (a26) obj2, l46Var);
                    if ((i9 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean zG4 = z6 | l46Var.g(e89VarI);
                    if ((i9 & 7168) == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = zG4 | z7;
                    objR4 = l46Var.R();
                    if (z8) {
                        a26Var7 = a26Var6;
                        r10 = 0;
                        jm8 jm8Var4 = new jm8(str, 60, s69Var, s69Var2, e89VarI, null);
                        str2 = str;
                        i11 = 60;
                        l46Var.p0(jm8Var4);
                        objR4 = jm8Var4;
                    } else {
                        a26Var7 = a26Var6;
                        r10 = 0;
                        jm8 jm8Var5 = new jm8(str, 60, s69Var, s69Var2, e89VarI, null);
                        str2 = str;
                        i11 = 60;
                        l46Var.p0(jm8Var5);
                        objR4 = jm8Var5;
                    }
                    af1.o((l26) objR4, l46Var, str2);
                    M0 = v4e.m0(((sz9) s69Var).j(), str2);
                    if ((i9 & 458752) == 131072) {
                        r6 = 1;
                    } else {
                        r6 = r10;
                    }
                    i12 = (l46Var.g(M0) ? 1 : 0) | r6;
                    Object objR13 = l46Var.R();
                    obj3 = objR13;
                    if (i12 == 0) {
                        n43 n43Var9 = new n43(4, a26Var7, M0);
                        l46Var.p0(n43Var9);
                        obj3 = n43Var9;
                    } else {
                        n43 n43Var10 = new n43(4, a26Var7, M0);
                        l46Var.p0(n43Var10);
                        obj3 = n43Var10;
                    }
                    af1.u((x16) obj3, l46Var);
                    iT = v4e.T(M0, "\n\n", r10, 6);
                    if (iT < 0) {
                        listC0 = pu4.a;
                        Substring = M0;
                    } else {
                        listC0 = v4e.c0(M0.substring(r10, iT), new String[]{"\n\n"}, 6);
                        Substring = M0.substring(iT + 2);
                    }
                    c92 c92VarA3 = a92.a(new uc0(18.0f, true, new qc0(r10)), ndb.Y, l46Var, 6);
                    int iHashCode3 = Long.hashCode(l46Var.T);
                    u8a u8aVarM3 = l46Var.m();
                    j09 j09VarJ3 = m93.J(l46Var, j09Var2);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA3);
                    dec.l(hj6.y, l46Var, u8aVarM3);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode3));
                    dec.k(l46Var);
                    itS = kv2.s(l46Var, j09VarJ3, hj6.x, -1369400892, listC0);
                    r7 = r10;
                    while (itS.hasNext()) {
                        next = itS.next();
                        i13 = r7 + 1;
                        if (r7 >= 0) {
                            t72.Z();
                            throw null;
                        }
                        l46Var.d0(-320381671, Integer.valueOf((int) r7));
                        g(r10, 1, l46Var, null, (String) next);
                        l46Var.r(r10);
                        r7 = i13;
                    }
                    l46Var.r(r10);
                    if (Substring.length() > 0) {
                        l46Var.f0(498395288);
                        g(r10, 1, l46Var, null, Substring);
                        l46Var.r(r10);
                    } else {
                        l46Var.f0(498449104);
                        l46Var.r(r10);
                    }
                    l46Var.r(true);
                    i10 = i11;
                    a26Var4 = a26Var7;
                    j09Var2 = j09Var2;
                    z4 = z13;
                }
                ojbVarV.d = c06Var;
            }
            l46Var.Z();
            i10 = i2;
            z4 = z2;
            a26Var4 = a26Var3;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                c06Var = new c06(j09Var2, str2, z4, i10, a26Var, a26Var4, i3, i4);
                ojbVarV.d = c06Var;
            }
        }
        i6 |= 196608;
        a26Var3 = a26Var2;
        i9 = i6;
        if ((74899 & i9) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i9 & 1, z3)) {
            if (i15 != 0) {
                j09Var2 = g09.a;
            }
            if (i16 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i7 != 0) {
                a26Var5 = null;
            } else {
                a26Var5 = a26Var3;
            }
            objR = l46Var.R();
            i8cVar = sf2.a;
            obj = objR;
            if (objR == i8cVar) {
                Boolean boolValueOf4 = Boolean.valueOf(z5);
                l46Var.p0(boolValueOf4);
                obj = boolValueOf4;
            }
            if (((Boolean) obj).booleanValue()) {
                l46Var.f0(963069757);
                if ((i9 & 458752) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z9 | ((i9 & 112) == 32);
                Object objR14 = l46Var.R();
                obj4 = objR14;
                if (z10) {
                    n43 n43Var11 = new n43(3, a26Var5, str2);
                    l46Var.p0(n43Var11);
                    obj4 = n43Var11;
                } else {
                    n43 n43Var12 = new n43(3, a26Var5, str2);
                    l46Var.p0(n43Var12);
                    obj4 = n43Var12;
                }
                af1.u((x16) obj4, l46Var);
                g(i9 & 126, 0, l46Var, j09Var2, str2);
                l46Var.r(false);
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    return;
                } else {
                    c06Var = new jv1(j09Var2, str2, z5, a26Var, a26Var5, i3, i4, 4);
                }
            } else {
                boolean z14 = z5;
                l46Var.f0(963201414);
                l46Var.r(false);
                objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objF = objR2;
                    objF = kv2.f(0, l46Var);
                }
                objF = objR2;
                s69Var = (s69) objF;
                a26Var6 = a26Var5;
                e89VarI = q1c.i(a26Var, l46Var);
                objR3 = l46Var.R();
                objF2 = objR3;
                if (objR3 == i8cVar) {
                    objF2 = kv2.f(0, l46Var);
                }
                s69Var2 = (s69) objF2;
                zG = l46Var.g(e89VarI);
                Object objR15 = l46Var.R();
                obj2 = objR15;
                if (zG) {
                    sg4 sg4Var6 = new sg4(s69Var2, e89VarI, 2);
                    l46Var.p0(sg4Var6);
                    obj2 = sg4Var6;
                } else {
                    sg4 sg4Var7 = new sg4(s69Var2, e89VarI, 2);
                    l46Var.p0(sg4Var7);
                    obj2 = sg4Var7;
                }
                af1.g(wef.a, (a26) obj2, l46Var);
                if ((i9 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean zG5 = z6 | l46Var.g(e89VarI);
                if ((i9 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = zG5 | z7;
                objR4 = l46Var.R();
                if (z8) {
                    a26Var7 = a26Var6;
                    r10 = 0;
                    jm8 jm8Var6 = new jm8(str, 60, s69Var, s69Var2, e89VarI, null);
                    str2 = str;
                    i11 = 60;
                    l46Var.p0(jm8Var6);
                    objR4 = jm8Var6;
                } else {
                    a26Var7 = a26Var6;
                    r10 = 0;
                    jm8 jm8Var7 = new jm8(str, 60, s69Var, s69Var2, e89VarI, null);
                    str2 = str;
                    i11 = 60;
                    l46Var.p0(jm8Var7);
                    objR4 = jm8Var7;
                }
                af1.o((l26) objR4, l46Var, str2);
                M0 = v4e.m0(((sz9) s69Var).j(), str2);
                if ((i9 & 458752) == 131072) {
                    r6 = 1;
                } else {
                    r6 = r10;
                }
                i12 = (l46Var.g(M0) ? 1 : 0) | r6;
                Object objR16 = l46Var.R();
                obj3 = objR16;
                if (i12 == 0) {
                    n43 n43Var13 = new n43(4, a26Var7, M0);
                    l46Var.p0(n43Var13);
                    obj3 = n43Var13;
                } else {
                    n43 n43Var14 = new n43(4, a26Var7, M0);
                    l46Var.p0(n43Var14);
                    obj3 = n43Var14;
                }
                af1.u((x16) obj3, l46Var);
                iT = v4e.T(M0, "\n\n", r10, 6);
                if (iT < 0) {
                    listC0 = pu4.a;
                    Substring = M0;
                } else {
                    listC0 = v4e.c0(M0.substring(r10, iT), new String[]{"\n\n"}, 6);
                    Substring = M0.substring(iT + 2);
                }
                c92 c92VarA4 = a92.a(new uc0(18.0f, true, new qc0(r10)), ndb.Y, l46Var, 6);
                int iHashCode4 = Long.hashCode(l46Var.T);
                u8a u8aVarM4 = l46Var.m();
                j09 j09VarJ4 = m93.J(l46Var, j09Var2);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, c92VarA4);
                dec.l(hj6.y, l46Var, u8aVarM4);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode4));
                dec.k(l46Var);
                itS = kv2.s(l46Var, j09VarJ4, hj6.x, -1369400892, listC0);
                r7 = r10;
                while (itS.hasNext()) {
                    next = itS.next();
                    i13 = r7 + 1;
                    if (r7 >= 0) {
                        t72.Z();
                        throw null;
                    }
                    l46Var.d0(-320381671, Integer.valueOf((int) r7));
                    g(r10, 1, l46Var, null, (String) next);
                    l46Var.r(r10);
                    r7 = i13;
                }
                l46Var.r(r10);
                if (Substring.length() > 0) {
                    l46Var.f0(498395288);
                    g(r10, 1, l46Var, null, Substring);
                    l46Var.r(r10);
                } else {
                    l46Var.f0(498449104);
                    l46Var.r(r10);
                }
                l46Var.r(true);
                i10 = i11;
                a26Var4 = a26Var7;
                j09Var2 = j09Var2;
                z4 = z14;
            }
            ojbVarV.d = c06Var;
        }
        l46Var.Z();
        i10 = i2;
        z4 = z2;
        a26Var4 = a26Var3;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            c06Var = new c06(j09Var2, str2, z4, i10, a26Var, a26Var4, i3, i4);
            ojbVarV.d = c06Var;
        }
    }

    public static final void m(s69 s69Var, h0e h0eVar, boolean z) {
        sz9 sz9Var = (sz9) s69Var;
        if (sz9Var.j() == z) {
            return;
        }
        sz9Var.k(z ? 1 : 0);
        ((a26) h0eVar.getValue()).d(Boolean.valueOf(z));
    }

    public static void n(um9 um9Var, u84 u84Var, a26 a26Var, int i2) {
        if ((i2 & 1) != 0) {
            u84Var = null;
        }
        um9Var.getClass();
        yr0 yr0Var = new yr0(a26Var);
        if (u84Var != null) {
            um9Var.a(u84Var, yr0Var);
            return;
        }
        pm9 pm9Var = new pm9(yr0Var, new rm9(null, yr0Var));
        yr0Var.a.add(pm9Var);
        szc.x(um9Var.b().c, pm9Var);
    }

    public static final void o(jg3 jg3Var, a26[] a26VarArr, a26 a26Var) {
        if (!(jg3Var instanceof p1)) {
            qc0.p("impossible");
            return;
        }
        p1 p1Var = (p1) jg3Var;
        a26[] a26VarArr2 = (a26[]) Arrays.copyOf(a26VarArr, a26VarArr.length);
        t(1, a26Var);
        ArrayList arrayList = new ArrayList(a26VarArr2.length);
        for (a26 a26Var2 : a26VarArr2) {
            p1 p1VarL = p1Var.l();
            a26Var2.d(p1VarL);
            arrayList.add(new fh2(p1VarL.e().a));
        }
        p1 p1VarL2 = p1Var.l();
        a26Var.d(p1VarL2);
        p1Var.e().a(new zj(new fh2(p1VarL2.e().a), arrayList));
    }

    public static Collection p(Object obj) {
        if ((obj instanceof zm7) && !(obj instanceof an7)) {
            b0(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e2) {
            pa7.c0(e2, z7f.class.getName());
            throw e2;
        }
    }

    public static Map q(Object obj) {
        if ((obj instanceof zm7) && !(obj instanceof cn7)) {
            b0(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            pa7.c0(e2, z7f.class.getName());
            throw e2;
        }
    }

    public static Set r(Object obj) {
        if ((obj instanceof zm7) && !(obj instanceof jn7)) {
            b0(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e2) {
            pa7.c0(e2, z7f.class.getName());
            throw e2;
        }
    }

    public static final boolean s(h1e h1eVar, int i2, y9a y9aVar) {
        boolean z;
        synchronized (k) {
            int i3 = h1eVar.d;
            if (i3 == i2) {
                h1eVar.c = y9aVar;
                z = true;
                h1eVar.d = i3 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static Object t(int i2, Object obj) {
        if (obj == null || L(i2, obj)) {
            return obj;
        }
        b0(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static final void u(jg3 jg3Var, char c2) {
        jg3Var.getClass();
        jg3Var.a(String.valueOf(c2));
    }

    public static final void v(sn4 sn4Var, x4d x4dVar, a26 a26Var) {
        zt ztVarA;
        zt ztVar;
        vs9 vs9VarA = x4dVar.a(sn4Var.f(), sn4Var.getLayoutDirection(), sn4Var);
        if (vs9VarA instanceof ss9) {
            ztVar = ((ss9) vs9VarA).a;
        } else {
            if (vs9VarA instanceof ts9) {
                ztVarA = cu.a();
                zt.b(ztVarA, ((ts9) vs9VarA).a);
            } else if (!(vs9VarA instanceof us9)) {
                ap.c();
                return;
            } else {
                ztVarA = cu.a();
                zt.c(ztVarA, ((us9) vs9VarA).a);
            }
            ztVar = ztVarA;
        }
        ta0 ta0VarV0 = sn4Var.v0();
        long jZ = ta0VarV0.z();
        ta0VarV0.p().g();
        try {
            ((vd9) ta0VarV0.c).k(ztVar, 1);
            a26Var.d(sn4Var);
        } finally {
            ks0.t(ta0VarV0, jZ);
        }
    }

    public static final e89 w(m77 m77Var, l46 l46Var, int i2) {
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = q1c.f(Boolean.FALSE);
            l46Var.p0(objR);
        }
        e89 e89Var = (e89) objR;
        boolean z = (((i2 & 14) ^ 6) > 4 && l46Var.g(m77Var)) || (i2 & 6) == 4;
        Object objR2 = l46Var.R();
        if (z || objR2 == i8cVar) {
            objR2 = new tn5(m77Var, e89Var, null);
            l46Var.p0(objR2);
        }
        af1.o((l26) objR2, l46Var, m77Var);
        return e89Var;
    }

    public static final p7d x(r7d r7dVar, l46 l46Var) {
        y6c y6cVar = eze.a(l46Var).a.j;
        long j2 = ((e8b) l46Var.k(l8b.a)).d;
        List listH = t72.H(r7dVar);
        bx9 bx9Var = new bx9(20.0f, 20.0f, 20.0f, 20.0f);
        boolean zG = l46Var.g(y6cVar) | l46Var.f(j2);
        Object objR = l46Var.R();
        Object obj = sf2.a;
        if (zG || objR == obj) {
            objR = new ot2(y6cVar, j2, 0);
            l46Var.p0(objR);
        }
        a26 a26Var = (a26) objR;
        boolean zG2 = l46Var.g(y6cVar) | l46Var.f(j2);
        Object objR2 = l46Var.R();
        if (zG2 || objR2 == obj) {
            objR2 = new ot2(y6cVar, j2, 1);
            l46Var.p0(objR2);
        }
        return new p7d(listH, bx9Var, 0.0f, null, 0.0f, a26Var, (a26) objR2, 60);
    }

    public static final long y(yhb yhbVar, a71 a71Var, int i2, long j2, long j3) {
        a71 a71Var2;
        f41 f41Var = yhbVar.b;
        a71Var.getClass();
        long j4 = i2;
        vpf.s(a71Var.e(), 0L, j4);
        if (yhbVar.c) {
            qc0.p("closed");
            return 0L;
        }
        long jMax = j2;
        int i3 = i2;
        a71 a71Var3 = a71Var;
        while (true) {
            long jA = b.a(f41Var, a71Var3, jMax, j3, i3);
            long j5 = jMax;
            if (jA != -1) {
                return jA;
            }
            long j6 = f41Var.b;
            long j7 = (j6 - j4) + 1;
            if (j7 < j3) {
                if (j6 < j3) {
                    a71Var2 = a71Var;
                } else {
                    int iMax = (int) Math.max(1L, (j6 - j3) + 1);
                    int iMin = ((int) Math.min(j4, (f41Var.b - j5) + 1)) - 1;
                    if (iMax <= iMin) {
                        while (true) {
                            a71Var2 = a71Var;
                            if (f41Var.g0(f41Var.b - ((long) iMin), a71Var2, iMin)) {
                                break;
                            }
                            if (iMin != iMax) {
                                iMin--;
                            }
                        }
                    }
                }
                if (yhbVar.a.c0(f41Var, 8192L) != -1) {
                    i3 = i2;
                    jMax = Math.max(j5, j7);
                    a71Var3 = a71Var2;
                }
            }
            return -1L;
        }
    }

    public static final List z(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return pu4.a;
        }
        if (size == 1) {
            return t72.H(s72.v0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
