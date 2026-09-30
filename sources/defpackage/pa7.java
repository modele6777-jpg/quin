package defpackage;

import ai.askquin.R;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Path;
import android.net.Uri;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.core.content.FileProvider;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.config.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pa7 {
    public static final dd2 a = new dd2(new hd2(2), false, 636288403);
    public static final dd2 b = new dd2(new hd2(3), false, -1357803046);
    public static final dd2 c = new dd2(new yd2(21), false, -1123793730);
    public static final dd2 d = new dd2(new ie2(5), false, 1356413079);
    public static final za5 e;
    public static final za5[] f;
    public static volatile w g;
    public static volatile hl h;

    static {
        za5 za5Var = new za5("GET_CREDENTIAL", 1L);
        e = za5Var;
        f = new za5[]{za5Var, new za5("CREDENTIAL_REGISTRY", 1L), new za5("CLEAR_REGISTRY", 2L), new za5("CLEAR_CREATION_OPTIONS", 1L), new za5("CLEAR_CREDENTIAL_STATE", 1L), new za5("CREATE_CREDENTIAL", 3L), new za5("REGISTER_CREATION_OPTIONS", 1L), new za5("REGISTER_EXPORT", 1L), new za5("IMPORT_CREDENTIALS", 1L), new za5("SIGNAL_CREDENTIAL_STATE", 1L), new za5("CLEAR_EXPORT", 1L), new za5("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new za5("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new za5("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }

    public static void A(boolean z) {
        if (z) {
            return;
        }
        cva.s();
    }

    public static void B(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        qc0.j(rfc.l(str, obj));
    }

    public static void C(int i, int i2) {
        String strL;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strL = rfc.l("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    qc0.j(tec.e(i2, "negative size: "));
                    return;
                }
                strL = rfc.l("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strL);
        }
    }

    public static void D(m88 m88Var, String str, Object obj) {
        if (m88Var != null) {
            return;
        }
        r82.g(rfc.l(str, obj));
    }

    public static void E(Object obj) {
        obj.getClass();
    }

    public static void F(Object obj, String str) {
        if (obj != null) {
            return;
        }
        r82.g(str);
    }

    public static void G(int i, int i2) {
        if (i < 0 || i > i2) {
            r3.i(v(i, i2, "index"));
        }
    }

    public static void H(int i, int i2, int i3) {
        String strV;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strV = v(i, i3, "start index");
            } else {
                strV = (i2 < 0 || i2 > i3) ? v(i2, i3, "end index") : rfc.l("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strV);
        }
    }

    public static void I(String str, boolean z) {
        if (z) {
            return;
        }
        qc0.p(str);
    }

    public static void J(boolean z) {
        if (z) {
            return;
        }
        r3.l();
    }

    public static final iy9 K(oq8 oq8Var) {
        Charset charset = ox1.a;
        if (oq8Var != null) {
            Charset charsetA = oq8.a(oq8Var);
            if (charsetA == null) {
                try {
                    oq8Var = kj0.c0(oq8Var + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    oq8Var = null;
                }
            } else {
                charset = charsetA;
            }
        }
        return new iy9(charset, oq8Var);
    }

    public static int L(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int M(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static final void N(File file, OutputStream outputStream, gbe gbeVar) throws IOException {
        FileInputStream fileInputStreamB = a.b(file, new FileInputStream(file));
        try {
            byte[] bArr = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
            while (true) {
                tq.v(gbeVar.getContext());
                int i = fileInputStreamB.read(bArr);
                if (i < 0) {
                    fileInputStreamB.close();
                    return;
                }
                outputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ym8.t(fileInputStreamB, th);
                throw th2;
            }
        }
    }

    public static final void O(zt ztVar, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        double d11 = d6;
        double d12 = (d8 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12);
        double d13 = ((d3 * dSin) + (d2 * dCos)) / d11;
        double d14 = ((d3 * dCos) + ((-d2) * dSin)) / d7;
        double d15 = ((d5 * dSin) + (d4 * dCos)) / d11;
        double d16 = ((d5 * dCos) + ((-d4) * dSin)) / d7;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d14 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            O(ztVar, d2, d3, d4, d5, d11 * dSqrt, d7 * dSqrt, d8, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d22);
        double d23 = d17 * dSqrt2;
        double d24 = dSqrt2 * d18;
        if (z == z2) {
            d9 = d19 - d24;
            d10 = d20 + d23;
        } else {
            d9 = d19 + d24;
            d10 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d14 - d10, d13 - d9);
        double dAtan3 = Math.atan2(d16 - d10, d15 - d9) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d25 = d9 * d11;
        double d26 = d10 * d7;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d12);
        double dSin2 = Math.sin(d12);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d29 = -d11;
        double d30 = d29 * dCos2;
        double d31 = d7 * dSin2;
        double d32 = (d30 * dSin3) - (d31 * dCos3);
        double d33 = d29 * dSin2;
        double d34 = d7 * dCos2;
        double d35 = (dCos3 * d34) + (dSin3 * d33);
        double d36 = dAtan3 / ((double) iCeil);
        double d37 = dAtan2;
        double d38 = d32;
        int i = 0;
        double d39 = d35;
        double d40 = d3;
        while (i < iCeil) {
            double d41 = d37 + d36;
            double dSin4 = Math.sin(d41);
            double dCos4 = Math.cos(d41);
            int i2 = iCeil;
            double d42 = (((d11 * dCos2) * dCos4) + d27) - (d31 * dSin4);
            double d43 = (d34 * dSin4) + (d11 * dSin2 * dCos4) + d28;
            double d44 = (d30 * dSin4) - (d31 * dCos4);
            double d45 = (dCos4 * d34) + (dSin4 * d33);
            double d46 = d41 - d37;
            double dTan = Math.tan(d46 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
            ztVar.a.cubicTo((float) ((d38 * dSqrt3) + d2), (float) ((d39 * dSqrt3) + d40), (float) (d42 - (dSqrt3 * d44)), (float) (d43 - (dSqrt3 * d45)), (float) d42, (float) d43);
            d36 = d36;
            dSin2 = dSin2;
            d27 = d27;
            d2 = d42;
            i++;
            d33 = d33;
            d37 = d41;
            d39 = d45;
            d38 = d44;
            iCeil = i2;
            d40 = d43;
            d11 = d6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void P(xj5 xj5Var, Object obj, Object obj2, zn2 zn2Var) {
        nl5 nl5Var;
        if (zn2Var instanceof nl5) {
            nl5Var = (nl5) zn2Var;
            int i = nl5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nl5Var.label = i - Integer.MIN_VALUE;
            } else {
                nl5Var = new nl5(zn2Var);
            }
        } else {
            nl5Var = new nl5(zn2Var);
        }
        Object obj3 = nl5Var.result;
        int i2 = nl5Var.label;
        if (i2 == 0) {
            jzb.q(obj3);
            nl5Var.L$0 = null;
            nl5Var.L$1 = null;
            nl5Var.L$2 = obj2;
            nl5Var.label = 1;
            if (xj5Var.a(obj, nl5Var) == bw2.a) {
                return;
            }
        } else if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return;
        } else {
            obj2 = nl5Var.L$2;
            jzb.q(obj3);
        }
        throw new l(obj2);
    }

    public static final mx4 Q(Enum[] enumArr) {
        enumArr.getClass();
        return new mx4(enumArr);
    }

    public static long R(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    ll2.l(i6);
                    oo3.f();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return ll2.a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long S(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    ll2.l(i6);
                    oo3.f();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return ll2.a(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    public static Object T(Future future) {
        Object obj;
        if (!future.isDone()) {
            qc0.p(rfc.l("Future was expected to be done: %s", future));
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final em7 U(um7 um7Var) {
        if (um7Var instanceof em7) {
            return (em7) um7Var;
        }
        Object obj = null;
        if (!(um7Var instanceof ao7)) {
            ho7.m(um7Var, "Cannot calculate JVM erasure for type: ");
            return null;
        }
        List upperBounds = ((ao7) um7Var).getUpperBounds();
        for (Object obj2 : upperBounds) {
            um7 um7VarB = ((yn7) obj2).B();
            nm7 nm7Var = um7VarB instanceof nm7 ? (nm7) um7VarB : null;
            if (nm7Var != null && nm7Var.S() != k22.INTERFACE && nm7Var.S() != k22.ANNOTATION_CLASS) {
                obj = obj2;
                break;
            }
        }
        yn7 yn7Var = (yn7) obj;
        if (yn7Var == null) {
            yn7Var = (yn7) s72.x0(upperBounds);
        }
        return yn7Var != null ? V(yn7Var) : job.a.b(Object.class);
    }

    public static final em7 V(yn7 yn7Var) {
        yn7Var.getClass();
        um7 um7VarB = yn7Var.B();
        if (um7VarB != null) {
            return U(um7VarB);
        }
        ho7.m(yn7Var, "Cannot calculate JVM erasure for type: ");
        return null;
    }

    public static final pl1 W(xn2 xn2Var) {
        Unsafe unsafe;
        pl1 pl1Var;
        pl1 pl1Var2;
        if (!(xn2Var instanceof z94)) {
            return new pl1(1, xn2Var);
        }
        z94 z94Var = (z94) xn2Var;
        long j = z94.v;
        loop0: while (true) {
            unsafe = ud0.a;
            Object objectVolatile = unsafe.getObjectVolatile(z94Var, j);
            pl1Var = null;
            ig4 ig4Var = aa4.b;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(z94Var, j, ig4Var);
                pl1Var2 = null;
                break;
            }
            if (objectVolatile instanceof pl1) {
                do {
                    unsafe = ud0.a;
                    if (unsafe.compareAndSwapObject(z94Var, z94.v, objectVolatile, ig4Var)) {
                        pl1Var2 = (pl1) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(z94Var, j) == objectVolatile);
            } else if (objectVolatile != ig4Var && !(objectVolatile instanceof Throwable)) {
                pd4.i(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (pl1Var2 != null) {
            long j2 = pl1.v;
            Object objectVolatile2 = unsafe.getObjectVolatile(pl1Var2, j2);
            if (!(objectVolatile2 instanceof cb2) || ((cb2) objectVolatile2).d == null) {
                unsafe.putIntVolatile(pl1Var2, pl1.f, 536870911);
                unsafe.putObjectVolatile(pl1Var2, j2, fd.a);
                pl1Var = pl1Var2;
            } else {
                pl1Var2.o();
            }
            if (pl1Var != null) {
                return pl1Var;
            }
        }
        return new pl1(2, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object X(Collection collection, xn2 xn2Var) {
        sr0 sr0Var;
        Iterator it;
        int i;
        if (xn2Var instanceof sr0) {
            sr0Var = (sr0) xn2Var;
            int i2 = sr0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sr0Var.label = i2 - Integer.MIN_VALUE;
            } else {
                sr0Var = new sr0(xn2Var);
            }
        } else {
            sr0Var = new sr0(xn2Var);
        }
        Object obj = sr0Var.result;
        int i3 = sr0Var.label;
        if (i3 == 0) {
            jzb.q(obj);
            it = collection.iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = sr0Var.I$0;
            it = (Iterator) sr0Var.L$2;
            jzb.q(obj);
        }
        while (it.hasNext()) {
            dg7 dg7Var = (dg7) it.next();
            sr0Var.L$0 = null;
            sr0Var.L$1 = null;
            sr0Var.L$2 = it;
            sr0Var.L$3 = null;
            sr0Var.L$4 = null;
            sr0Var.I$0 = i;
            sr0Var.I$1 = 0;
            sr0Var.label = 1;
            Object objU0 = dg7Var.U0(sr0Var);
            bw2 bw2Var = bw2.a;
            if (objU0 == bw2Var) {
                return bw2Var;
            }
        }
        return wef.a;
    }

    public static final q8d Y(File file) throws IOException {
        q8d q8dVar;
        FileInputStream fileInputStreamB = a.b(file, new FileInputStream(file));
        try {
            byte[] bArr = new byte[8];
            int i = fileInputStreamB.read(bArr);
            if (i == 8 && Arrays.equals(bArr, new byte[]{-119, 80, 78, 71, 13, 10, 26, 10})) {
                q8dVar = q8d.a;
            } else {
                if (i < 3 || bArr[0] != -1 || bArr[1] != -40 || bArr[2] != -1) {
                    throw new IOException("Unsupported image format");
                }
                q8dVar = q8d.b;
            }
            fileInputStreamB.close();
            return q8dVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ym8.t(fileInputStreamB, th);
                throw th2;
            }
        }
    }

    public static final tjd Z(tt7 tt7Var) {
        tt7Var.getClass();
        jgf jgfVarK0 = tt7Var.k0();
        if (jgfVarK0 instanceof bj5) {
            return ((bj5) jgfVarK0).b;
        }
        if (jgfVarK0 instanceof tjd) {
            return (tjd) jgfVarK0;
        }
        ap.c();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x013c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0141  */
    /* JADX WARN: Code duplicated, block: B:109:0x015b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0162  */
    /* JADX WARN: Code duplicated, block: B:112:0x0166  */
    /* JADX WARN: Code duplicated, block: B:113:0x0169  */
    /* JADX WARN: Code duplicated, block: B:115:0x016c  */
    /* JADX WARN: Code duplicated, block: B:116:0x016f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0172  */
    /* JADX WARN: Code duplicated, block: B:119:0x0175  */
    /* JADX WARN: Code duplicated, block: B:121:0x0179  */
    /* JADX WARN: Code duplicated, block: B:122:0x017c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0194  */
    /* JADX WARN: Code duplicated, block: B:130:0x019c  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:137:0x0204  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    public static final void a(j09 j09Var, long j, long j2, g7g g7gVar, l26 l26Var, n26 n26Var, boolean z, boolean z2, final x16 x16Var, l46 l46Var, final int i, final int i2) {
        j09 j09Var2;
        int i3;
        long j3;
        g7g g7gVar2;
        int i4;
        l26 l26Var2;
        int i5;
        int i6;
        n26 n26Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        final boolean z4;
        final j09 j09Var3;
        final long j4;
        final g7g g7gVar3;
        final l26 l26Var3;
        final n26 n26Var3;
        final long j5;
        final boolean z5;
        ojb ojbVarV;
        long jB;
        int i12;
        int i13;
        g7g g7gVarP;
        l26 l26Var4;
        n26 n26Var4;
        boolean z6;
        boolean z7;
        g7g g7gVar4;
        long j6;
        n26 n26Var5;
        boolean z8;
        j09 j09Var4;
        l26 l26Var5;
        int i14;
        boolean z9;
        Object objR;
        int i15;
        int i16;
        l46Var.h0(304880838);
        int i17 = i2 & 1;
        if (i17 != 0) {
            i3 = i | 6;
            j09Var2 = j09Var;
        } else if ((i & 6) == 0) {
            j09Var2 = j09Var;
            i3 = (l46Var.g(j09Var2) ? 4 : 2) | i;
        } else {
            j09Var2 = j09Var;
            i3 = i;
        }
        int i18 = i2 & 2;
        if (i18 == 0) {
            if ((i & 48) == 0) {
                j3 = j;
                i3 |= l46Var.f(j3) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    g7gVar2 = g7gVar;
                    if (l46Var.g(g7gVar2)) {
                        i16 = 2048;
                    }
                    i3 |= i16;
                } else {
                    g7gVar2 = g7gVar;
                }
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i3 |= i16;
            } else {
                g7gVar2 = g7gVar;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    l26Var2 = l26Var;
                    if (l46Var.i(l26Var2)) {
                        i5 = 16384;
                    } else {
                        i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        n26Var2 = n26Var;
                        if (l46Var.i(n26Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (l46Var.h(z)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    if (i10 != 0) {
                        if ((i & 12582912) == 0) {
                            if (l46Var.h(z2)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                            i3 |= i11;
                        }
                        if ((i & 100663296) == 0) {
                            if (l46Var.i(x16Var)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                            i3 |= i15;
                        }
                        if ((i3 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (l46Var.W(i3 & 1, z3)) {
                            l46Var.b0();
                            if ((i & 1) != 0 || l46Var.C()) {
                                if (i17 != 0) {
                                    j09Var2 = g09.a;
                                }
                                if (i18 != 0) {
                                    j3 = y72.j;
                                }
                                jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                                i12 = i3 & (-897);
                                if ((i2 & 8) != 0) {
                                    g7gVarP = fdc.p(l46Var);
                                    i13 = i3 & (-8065);
                                } else {
                                    i13 = i12;
                                    g7gVarP = g7gVar2;
                                }
                                if (i4 != 0) {
                                    l26Var4 = vfh.a;
                                } else {
                                    l26Var4 = l26Var2;
                                }
                                if (i6 != 0) {
                                    n26Var4 = vfh.b;
                                } else {
                                    n26Var4 = n26Var2;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z;
                                }
                                if (i10 != 0) {
                                    z7 = true;
                                } else {
                                    z7 = z2;
                                }
                                g7gVar4 = g7gVarP;
                                j6 = j3;
                                n26Var5 = n26Var4;
                                z8 = z7;
                                j09Var4 = j09Var2;
                                l26Var5 = l26Var4;
                                i14 = 67108864;
                            } else {
                                l46Var.Z();
                                int i19 = i3 & (-897);
                                if ((i2 & 8) != 0) {
                                    i19 = i3 & (-8065);
                                }
                                l26 l26Var6 = l26Var2;
                                j09Var4 = j09Var2;
                                l26Var5 = l26Var6;
                                z6 = z;
                                z8 = z2;
                                i13 = i19;
                                g7gVar4 = g7gVar2;
                                n26Var5 = n26Var2;
                                i14 = 67108864;
                                jB = j2;
                                j6 = j3;
                            }
                            l46Var.s();
                            z9 = (234881024 & i13) == i14;
                            objR = l46Var.R();
                            if (z9 || objR == sf2.a) {
                                objR = new c20(5, x16Var);
                                l46Var.p0(objR);
                            }
                            long j7 = jB;
                            c(j09Var4, j6, j7, g7gVar4, l26Var5, n26Var5, af1.b0(-867946026, new qb0(z8, feg.c((x16) objR, l46Var, 6), z6, jB), l46Var), l46Var, (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                            z5 = z6;
                            j09Var3 = j09Var4;
                            j5 = j7;
                            g7gVar3 = g7gVar4;
                            l26Var3 = l26Var5;
                            n26Var3 = n26Var5;
                            z4 = z8;
                            j4 = j6;
                        } else {
                            l46Var.Z();
                            z4 = z2;
                            j09Var3 = j09Var2;
                            j4 = j3;
                            g7gVar3 = g7gVar2;
                            l26Var3 = l26Var2;
                            n26Var3 = n26Var2;
                            j5 = j2;
                            z5 = z;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new l26() { // from class: rb0
                                @Override // defpackage.l26
                                public final Object z(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i | 1);
                                    pa7.a(j09Var3, j4, j5, g7gVar3, l26Var3, n26Var3, z5, z4, x16Var, (l46) obj, iP, i2);
                                    return wef.a;
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    if ((i & 100663296) == 0) {
                        if (l46Var.i(x16Var)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i3 |= i15;
                    }
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (l46Var.W(i3 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i18 != 0) {
                                j3 = y72.j;
                            }
                            jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            i12 = i3 & (-897);
                            if ((i2 & 8) != 0) {
                                g7gVarP = fdc.p(l46Var);
                                i13 = i3 & (-8065);
                            } else {
                                i13 = i12;
                                g7gVarP = g7gVar2;
                            }
                            if (i4 != 0) {
                                l26Var4 = vfh.a;
                            } else {
                                l26Var4 = l26Var2;
                            }
                            if (i6 != 0) {
                                n26Var4 = vfh.b;
                            } else {
                                n26Var4 = n26Var2;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            } else {
                                z6 = z;
                            }
                            if (i10 != 0) {
                                z7 = true;
                            } else {
                                z7 = z2;
                            }
                            g7gVar4 = g7gVarP;
                            j6 = j3;
                            n26Var5 = n26Var4;
                            z8 = z7;
                            j09Var4 = j09Var2;
                            l26Var5 = l26Var4;
                            i14 = 67108864;
                        } else {
                            if (i17 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i18 != 0) {
                                j3 = y72.j;
                            }
                            jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            i12 = i3 & (-897);
                            if ((i2 & 8) != 0) {
                                g7gVarP = fdc.p(l46Var);
                                i13 = i3 & (-8065);
                            } else {
                                i13 = i12;
                                g7gVarP = g7gVar2;
                            }
                            if (i4 != 0) {
                                l26Var4 = vfh.a;
                            } else {
                                l26Var4 = l26Var2;
                            }
                            if (i6 != 0) {
                                n26Var4 = vfh.b;
                            } else {
                                n26Var4 = n26Var2;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            } else {
                                z6 = z;
                            }
                            if (i10 != 0) {
                                z7 = true;
                            } else {
                                z7 = z2;
                            }
                            g7gVar4 = g7gVarP;
                            j6 = j3;
                            n26Var5 = n26Var4;
                            z8 = z7;
                            j09Var4 = j09Var2;
                            l26Var5 = l26Var4;
                            i14 = 67108864;
                        }
                        l46Var.s();
                        if ((234881024 & i13) == i14) {
                        }
                        objR = l46Var.R();
                        if (z9) {
                            objR = new c20(5, x16Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new c20(5, x16Var);
                            l46Var.p0(objR);
                        }
                        long j8 = jB;
                        c(j09Var4, j6, j8, g7gVar4, l26Var5, n26Var5, af1.b0(-867946026, new qb0(z8, feg.c((x16) objR, l46Var, 6), z6, jB), l46Var), l46Var, (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                        z5 = z6;
                        j09Var3 = j09Var4;
                        j5 = j8;
                        g7gVar3 = g7gVar4;
                        l26Var3 = l26Var5;
                        n26Var3 = n26Var5;
                        z4 = z8;
                        j4 = j6;
                    } else {
                        l46Var.Z();
                        z4 = z2;
                        j09Var3 = j09Var2;
                        j4 = j3;
                        g7gVar3 = g7gVar2;
                        l26Var3 = l26Var2;
                        n26Var3 = n26Var2;
                        j5 = j2;
                        z5 = z;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: rb0
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i | 1);
                                pa7.a(j09Var3, j4, j5, g7gVar3, l26Var3, n26Var3, z5, z4, x16Var, (l46) obj, iP, i2);
                                return wef.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                n26Var2 = n26Var;
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (l46Var.h(z)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i10 != 0) {
                    if ((i & 12582912) == 0) {
                        if (l46Var.h(z2)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    if ((i & 100663296) == 0) {
                        if (l46Var.i(x16Var)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i3 |= i15;
                    }
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (l46Var.W(i3 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i18 != 0) {
                                j3 = y72.j;
                            }
                            jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            i12 = i3 & (-897);
                            if ((i2 & 8) != 0) {
                                g7gVarP = fdc.p(l46Var);
                                i13 = i3 & (-8065);
                            } else {
                                i13 = i12;
                                g7gVarP = g7gVar2;
                            }
                            if (i4 != 0) {
                                l26Var4 = vfh.a;
                            } else {
                                l26Var4 = l26Var2;
                            }
                            if (i6 != 0) {
                                n26Var4 = vfh.b;
                            } else {
                                n26Var4 = n26Var2;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            } else {
                                z6 = z;
                            }
                            if (i10 != 0) {
                                z7 = true;
                            } else {
                                z7 = z2;
                            }
                            g7gVar4 = g7gVarP;
                            j6 = j3;
                            n26Var5 = n26Var4;
                            z8 = z7;
                            j09Var4 = j09Var2;
                            l26Var5 = l26Var4;
                            i14 = 67108864;
                        } else {
                            if (i17 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i18 != 0) {
                                j3 = y72.j;
                            }
                            jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            i12 = i3 & (-897);
                            if ((i2 & 8) != 0) {
                                g7gVarP = fdc.p(l46Var);
                                i13 = i3 & (-8065);
                            } else {
                                i13 = i12;
                                g7gVarP = g7gVar2;
                            }
                            if (i4 != 0) {
                                l26Var4 = vfh.a;
                            } else {
                                l26Var4 = l26Var2;
                            }
                            if (i6 != 0) {
                                n26Var4 = vfh.b;
                            } else {
                                n26Var4 = n26Var2;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            } else {
                                z6 = z;
                            }
                            if (i10 != 0) {
                                z7 = true;
                            } else {
                                z7 = z2;
                            }
                            g7gVar4 = g7gVarP;
                            j6 = j3;
                            n26Var5 = n26Var4;
                            z8 = z7;
                            j09Var4 = j09Var2;
                            l26Var5 = l26Var4;
                            i14 = 67108864;
                        }
                        l46Var.s();
                        if ((234881024 & i13) == i14) {
                        }
                        objR = l46Var.R();
                        if (z9) {
                            objR = new c20(5, x16Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new c20(5, x16Var);
                            l46Var.p0(objR);
                        }
                        long j9 = jB;
                        c(j09Var4, j6, j9, g7gVar4, l26Var5, n26Var5, af1.b0(-867946026, new qb0(z8, feg.c((x16) objR, l46Var, 6), z6, jB), l46Var), l46Var, (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                        z5 = z6;
                        j09Var3 = j09Var4;
                        j5 = j9;
                        g7gVar3 = g7gVar4;
                        l26Var3 = l26Var5;
                        n26Var3 = n26Var5;
                        z4 = z8;
                        j4 = j6;
                    } else {
                        l46Var.Z();
                        z4 = z2;
                        j09Var3 = j09Var2;
                        j4 = j3;
                        g7gVar3 = g7gVar2;
                        l26Var3 = l26Var2;
                        n26Var3 = n26Var2;
                        j5 = j2;
                        z5 = z;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: rb0
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i | 1);
                                pa7.a(j09Var3, j4, j5, g7gVar3, l26Var3, n26Var3, z5, z4, x16Var, (l46) obj, iP, i2);
                                return wef.a;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                if ((i & 100663296) == 0) {
                    if (l46Var.i(x16Var)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i3 |= i15;
                }
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i3 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i18 != 0) {
                            j3 = y72.j;
                        }
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i12 = i3 & (-897);
                        if ((i2 & 8) != 0) {
                            g7gVarP = fdc.p(l46Var);
                            i13 = i3 & (-8065);
                        } else {
                            i13 = i12;
                            g7gVarP = g7gVar2;
                        }
                        if (i4 != 0) {
                            l26Var4 = vfh.a;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.b;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        } else {
                            z6 = z;
                        }
                        if (i10 != 0) {
                            z7 = true;
                        } else {
                            z7 = z2;
                        }
                        g7gVar4 = g7gVarP;
                        j6 = j3;
                        n26Var5 = n26Var4;
                        z8 = z7;
                        j09Var4 = j09Var2;
                        l26Var5 = l26Var4;
                        i14 = 67108864;
                    } else {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i18 != 0) {
                            j3 = y72.j;
                        }
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i12 = i3 & (-897);
                        if ((i2 & 8) != 0) {
                            g7gVarP = fdc.p(l46Var);
                            i13 = i3 & (-8065);
                        } else {
                            i13 = i12;
                            g7gVarP = g7gVar2;
                        }
                        if (i4 != 0) {
                            l26Var4 = vfh.a;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.b;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        } else {
                            z6 = z;
                        }
                        if (i10 != 0) {
                            z7 = true;
                        } else {
                            z7 = z2;
                        }
                        g7gVar4 = g7gVarP;
                        j6 = j3;
                        n26Var5 = n26Var4;
                        z8 = z7;
                        j09Var4 = j09Var2;
                        l26Var5 = l26Var4;
                        i14 = 67108864;
                    }
                    l46Var.s();
                    if ((234881024 & i13) == i14) {
                    }
                    objR = l46Var.R();
                    if (z9) {
                        objR = new c20(5, x16Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new c20(5, x16Var);
                        l46Var.p0(objR);
                    }
                    long j10 = jB;
                    c(j09Var4, j6, j10, g7gVar4, l26Var5, n26Var5, af1.b0(-867946026, new qb0(z8, feg.c((x16) objR, l46Var, 6), z6, jB), l46Var), l46Var, (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                    z5 = z6;
                    j09Var3 = j09Var4;
                    j5 = j10;
                    g7gVar3 = g7gVar4;
                    l26Var3 = l26Var5;
                    n26Var3 = n26Var5;
                    z4 = z8;
                    j4 = j6;
                } else {
                    l46Var.Z();
                    z4 = z2;
                    j09Var3 = j09Var2;
                    j4 = j3;
                    g7gVar3 = g7gVar2;
                    l26Var3 = l26Var2;
                    n26Var3 = n26Var2;
                    j5 = j2;
                    z5 = z;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: rb0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            pa7.a(j09Var3, j4, j5, g7gVar3, l26Var3, n26Var3, z5, z4, x16Var, (l46) obj, iP, i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            l26Var2 = l26Var;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (l46Var.h(z)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i10 != 0) {
                    if ((i & 12582912) == 0) {
                        if (l46Var.h(z2)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    if ((i & 100663296) == 0) {
                        if (l46Var.i(x16Var)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i3 |= i15;
                    }
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (l46Var.W(i3 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i18 != 0) {
                                j3 = y72.j;
                            }
                            jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            i12 = i3 & (-897);
                            if ((i2 & 8) != 0) {
                                g7gVarP = fdc.p(l46Var);
                                i13 = i3 & (-8065);
                            } else {
                                i13 = i12;
                                g7gVarP = g7gVar2;
                            }
                            if (i4 != 0) {
                                l26Var4 = vfh.a;
                            } else {
                                l26Var4 = l26Var2;
                            }
                            if (i6 != 0) {
                                n26Var4 = vfh.b;
                            } else {
                                n26Var4 = n26Var2;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            } else {
                                z6 = z;
                            }
                            if (i10 != 0) {
                                z7 = true;
                            } else {
                                z7 = z2;
                            }
                            g7gVar4 = g7gVarP;
                            j6 = j3;
                            n26Var5 = n26Var4;
                            z8 = z7;
                            j09Var4 = j09Var2;
                            l26Var5 = l26Var4;
                            i14 = 67108864;
                        } else {
                            if (i17 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i18 != 0) {
                                j3 = y72.j;
                            }
                            jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            i12 = i3 & (-897);
                            if ((i2 & 8) != 0) {
                                g7gVarP = fdc.p(l46Var);
                                i13 = i3 & (-8065);
                            } else {
                                i13 = i12;
                                g7gVarP = g7gVar2;
                            }
                            if (i4 != 0) {
                                l26Var4 = vfh.a;
                            } else {
                                l26Var4 = l26Var2;
                            }
                            if (i6 != 0) {
                                n26Var4 = vfh.b;
                            } else {
                                n26Var4 = n26Var2;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            } else {
                                z6 = z;
                            }
                            if (i10 != 0) {
                                z7 = true;
                            } else {
                                z7 = z2;
                            }
                            g7gVar4 = g7gVarP;
                            j6 = j3;
                            n26Var5 = n26Var4;
                            z8 = z7;
                            j09Var4 = j09Var2;
                            l26Var5 = l26Var4;
                            i14 = 67108864;
                        }
                        l46Var.s();
                        if ((234881024 & i13) == i14) {
                        }
                        objR = l46Var.R();
                        if (z9) {
                            objR = new c20(5, x16Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new c20(5, x16Var);
                            l46Var.p0(objR);
                        }
                        long j11 = jB;
                        c(j09Var4, j6, j11, g7gVar4, l26Var5, n26Var5, af1.b0(-867946026, new qb0(z8, feg.c((x16) objR, l46Var, 6), z6, jB), l46Var), l46Var, (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                        z5 = z6;
                        j09Var3 = j09Var4;
                        j5 = j11;
                        g7gVar3 = g7gVar4;
                        l26Var3 = l26Var5;
                        n26Var3 = n26Var5;
                        z4 = z8;
                        j4 = j6;
                    } else {
                        l46Var.Z();
                        z4 = z2;
                        j09Var3 = j09Var2;
                        j4 = j3;
                        g7gVar3 = g7gVar2;
                        l26Var3 = l26Var2;
                        n26Var3 = n26Var2;
                        j5 = j2;
                        z5 = z;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: rb0
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i | 1);
                                pa7.a(j09Var3, j4, j5, g7gVar3, l26Var3, n26Var3, z5, z4, x16Var, (l46) obj, iP, i2);
                                return wef.a;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                if ((i & 100663296) == 0) {
                    if (l46Var.i(x16Var)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i3 |= i15;
                }
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i3 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i18 != 0) {
                            j3 = y72.j;
                        }
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i12 = i3 & (-897);
                        if ((i2 & 8) != 0) {
                            g7gVarP = fdc.p(l46Var);
                            i13 = i3 & (-8065);
                        } else {
                            i13 = i12;
                            g7gVarP = g7gVar2;
                        }
                        if (i4 != 0) {
                            l26Var4 = vfh.a;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.b;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        } else {
                            z6 = z;
                        }
                        if (i10 != 0) {
                            z7 = true;
                        } else {
                            z7 = z2;
                        }
                        g7gVar4 = g7gVarP;
                        j6 = j3;
                        n26Var5 = n26Var4;
                        z8 = z7;
                        j09Var4 = j09Var2;
                        l26Var5 = l26Var4;
                        i14 = 67108864;
                    } else {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i18 != 0) {
                            j3 = y72.j;
                        }
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i12 = i3 & (-897);
                        if ((i2 & 8) != 0) {
                            g7gVarP = fdc.p(l46Var);
                            i13 = i3 & (-8065);
                        } else {
                            i13 = i12;
                            g7gVarP = g7gVar2;
                        }
                        if (i4 != 0) {
                            l26Var4 = vfh.a;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.b;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        } else {
                            z6 = z;
                        }
                        if (i10 != 0) {
                            z7 = true;
                        } else {
                            z7 = z2;
                        }
                        g7gVar4 = g7gVarP;
                        j6 = j3;
                        n26Var5 = n26Var4;
                        z8 = z7;
                        j09Var4 = j09Var2;
                        l26Var5 = l26Var4;
                        i14 = 67108864;
                    }
                    l46Var.s();
                    if ((234881024 & i13) == i14) {
                    }
                    objR = l46Var.R();
                    if (z9) {
                        objR = new c20(5, x16Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new c20(5, x16Var);
                        l46Var.p0(objR);
                    }
                    long j12 = jB;
                    c(j09Var4, j6, j12, g7gVar4, l26Var5, n26Var5, af1.b0(-867946026, new qb0(z8, feg.c((x16) objR, l46Var, 6), z6, jB), l46Var), l46Var, (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                    z5 = z6;
                    j09Var3 = j09Var4;
                    j5 = j12;
                    g7gVar3 = g7gVar4;
                    l26Var3 = l26Var5;
                    n26Var3 = n26Var5;
                    z4 = z8;
                    j4 = j6;
                } else {
                    l46Var.Z();
                    z4 = z2;
                    j09Var3 = j09Var2;
                    j4 = j3;
                    g7gVar3 = g7gVar2;
                    l26Var3 = l26Var2;
                    n26Var3 = n26Var2;
                    j5 = j2;
                    z5 = z;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: rb0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            pa7.a(j09Var3, j4, j5, g7gVar3, l26Var3, n26Var3, z5, z4, x16Var, (l46) obj, iP, i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            n26Var2 = n26Var;
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (l46Var.h(z)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i10 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i10 != 0) {
                if ((i & 12582912) == 0) {
                    if (l46Var.h(z2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((i & 100663296) == 0) {
                    if (l46Var.i(x16Var)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i3 |= i15;
                }
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i3 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i18 != 0) {
                            j3 = y72.j;
                        }
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i12 = i3 & (-897);
                        if ((i2 & 8) != 0) {
                            g7gVarP = fdc.p(l46Var);
                            i13 = i3 & (-8065);
                        } else {
                            i13 = i12;
                            g7gVarP = g7gVar2;
                        }
                        if (i4 != 0) {
                            l26Var4 = vfh.a;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.b;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        } else {
                            z6 = z;
                        }
                        if (i10 != 0) {
                            z7 = true;
                        } else {
                            z7 = z2;
                        }
                        g7gVar4 = g7gVarP;
                        j6 = j3;
                        n26Var5 = n26Var4;
                        z8 = z7;
                        j09Var4 = j09Var2;
                        l26Var5 = l26Var4;
                        i14 = 67108864;
                    } else {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i18 != 0) {
                            j3 = y72.j;
                        }
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i12 = i3 & (-897);
                        if ((i2 & 8) != 0) {
                            g7gVarP = fdc.p(l46Var);
                            i13 = i3 & (-8065);
                        } else {
                            i13 = i12;
                            g7gVarP = g7gVar2;
                        }
                        if (i4 != 0) {
                            l26Var4 = vfh.a;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.b;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        } else {
                            z6 = z;
                        }
                        if (i10 != 0) {
                            z7 = true;
                        } else {
                            z7 = z2;
                        }
                        g7gVar4 = g7gVarP;
                        j6 = j3;
                        n26Var5 = n26Var4;
                        z8 = z7;
                        j09Var4 = j09Var2;
                        l26Var5 = l26Var4;
                        i14 = 67108864;
                    }
                    l46Var.s();
                    if ((234881024 & i13) == i14) {
                    }
                    objR = l46Var.R();
                    if (z9) {
                        objR = new c20(5, x16Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new c20(5, x16Var);
                        l46Var.p0(objR);
                    }
                    long j13 = jB;
                    c(j09Var4, j6, j13, g7gVar4, l26Var5, n26Var5, af1.b0(-867946026, new qb0(z8, feg.c((x16) objR, l46Var, 6), z6, jB), l46Var), l46Var, (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                    z5 = z6;
                    j09Var3 = j09Var4;
                    j5 = j13;
                    g7gVar3 = g7gVar4;
                    l26Var3 = l26Var5;
                    n26Var3 = n26Var5;
                    z4 = z8;
                    j4 = j6;
                } else {
                    l46Var.Z();
                    z4 = z2;
                    j09Var3 = j09Var2;
                    j4 = j3;
                    g7gVar3 = g7gVar2;
                    l26Var3 = l26Var2;
                    n26Var3 = n26Var2;
                    j5 = j2;
                    z5 = z;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: rb0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            pa7.a(j09Var3, j4, j5, g7gVar3, l26Var3, n26Var3, z5, z4, x16Var, (l46) obj, iP, i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 12582912;
            if ((i & 100663296) == 0) {
                if (l46Var.i(x16Var)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i3 |= i15;
            }
            if ((i3 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i18 != 0) {
                        j3 = y72.j;
                    }
                    jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    i12 = i3 & (-897);
                    if ((i2 & 8) != 0) {
                        g7gVarP = fdc.p(l46Var);
                        i13 = i3 & (-8065);
                    } else {
                        i13 = i12;
                        g7gVarP = g7gVar2;
                    }
                    if (i4 != 0) {
                        l26Var4 = vfh.a;
                    } else {
                        l26Var4 = l26Var2;
                    }
                    if (i6 != 0) {
                        n26Var4 = vfh.b;
                    } else {
                        n26Var4 = n26Var2;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    } else {
                        z6 = z;
                    }
                    if (i10 != 0) {
                        z7 = true;
                    } else {
                        z7 = z2;
                    }
                    g7gVar4 = g7gVarP;
                    j6 = j3;
                    n26Var5 = n26Var4;
                    z8 = z7;
                    j09Var4 = j09Var2;
                    l26Var5 = l26Var4;
                    i14 = 67108864;
                } else {
                    if (i17 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i18 != 0) {
                        j3 = y72.j;
                    }
                    jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    i12 = i3 & (-897);
                    if ((i2 & 8) != 0) {
                        g7gVarP = fdc.p(l46Var);
                        i13 = i3 & (-8065);
                    } else {
                        i13 = i12;
                        g7gVarP = g7gVar2;
                    }
                    if (i4 != 0) {
                        l26Var4 = vfh.a;
                    } else {
                        l26Var4 = l26Var2;
                    }
                    if (i6 != 0) {
                        n26Var4 = vfh.b;
                    } else {
                        n26Var4 = n26Var2;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    } else {
                        z6 = z;
                    }
                    if (i10 != 0) {
                        z7 = true;
                    } else {
                        z7 = z2;
                    }
                    g7gVar4 = g7gVarP;
                    j6 = j3;
                    n26Var5 = n26Var4;
                    z8 = z7;
                    j09Var4 = j09Var2;
                    l26Var5 = l26Var4;
                    i14 = 67108864;
                }
                l46Var.s();
                if ((234881024 & i13) == i14) {
                }
                objR = l46Var.R();
                if (z9) {
                    objR = new c20(5, x16Var);
                    l46Var.p0(objR);
                } else {
                    objR = new c20(5, x16Var);
                    l46Var.p0(objR);
                }
                long j14 = jB;
                c(j09Var4, j6, j14, g7gVar4, l26Var5, n26Var5, af1.b0(-867946026, new qb0(z8, feg.c((x16) objR, l46Var, 6), z6, jB), l46Var), l46Var, (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                z5 = z6;
                j09Var3 = j09Var4;
                j5 = j14;
                g7gVar3 = g7gVar4;
                l26Var3 = l26Var5;
                n26Var3 = n26Var5;
                z4 = z8;
                j4 = j6;
            } else {
                l46Var.Z();
                z4 = z2;
                j09Var3 = j09Var2;
                j4 = j3;
                g7gVar3 = g7gVar2;
                l26Var3 = l26Var2;
                n26Var3 = n26Var2;
                j5 = j2;
                z5 = z;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: rb0
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i | 1);
                        pa7.a(j09Var3, j4, j5, g7gVar3, l26Var3, n26Var3, z5, z4, x16Var, (l46) obj, iP, i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 48;
        j3 = j;
        if ((i & 384) == 0) {
            i3 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                g7gVar2 = g7gVar;
                if (l46Var.g(g7gVar2)) {
                    i16 = 2048;
                }
                i3 |= i16;
            } else {
                g7gVar2 = g7gVar;
            }
            i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i3 |= i16;
        } else {
            g7gVar2 = g7gVar;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                l26Var2 = l26Var;
                if (l46Var.i(l26Var2)) {
                    i5 = 16384;
                } else {
                    i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (l46Var.h(z)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i10 != 0) {
                    if ((i & 12582912) == 0) {
                        if (l46Var.h(z2)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    if ((i & 100663296) == 0) {
                        if (l46Var.i(x16Var)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i3 |= i15;
                    }
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (l46Var.W(i3 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i18 != 0) {
                                j3 = y72.j;
                            }
                            jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            i12 = i3 & (-897);
                            if ((i2 & 8) != 0) {
                                g7gVarP = fdc.p(l46Var);
                                i13 = i3 & (-8065);
                            } else {
                                i13 = i12;
                                g7gVarP = g7gVar2;
                            }
                            if (i4 != 0) {
                                l26Var4 = vfh.a;
                            } else {
                                l26Var4 = l26Var2;
                            }
                            if (i6 != 0) {
                                n26Var4 = vfh.b;
                            } else {
                                n26Var4 = n26Var2;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            } else {
                                z6 = z;
                            }
                            if (i10 != 0) {
                                z7 = true;
                            } else {
                                z7 = z2;
                            }
                            g7gVar4 = g7gVarP;
                            j6 = j3;
                            n26Var5 = n26Var4;
                            z8 = z7;
                            j09Var4 = j09Var2;
                            l26Var5 = l26Var4;
                            i14 = 67108864;
                        } else {
                            if (i17 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i18 != 0) {
                                j3 = y72.j;
                            }
                            jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            i12 = i3 & (-897);
                            if ((i2 & 8) != 0) {
                                g7gVarP = fdc.p(l46Var);
                                i13 = i3 & (-8065);
                            } else {
                                i13 = i12;
                                g7gVarP = g7gVar2;
                            }
                            if (i4 != 0) {
                                l26Var4 = vfh.a;
                            } else {
                                l26Var4 = l26Var2;
                            }
                            if (i6 != 0) {
                                n26Var4 = vfh.b;
                            } else {
                                n26Var4 = n26Var2;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            } else {
                                z6 = z;
                            }
                            if (i10 != 0) {
                                z7 = true;
                            } else {
                                z7 = z2;
                            }
                            g7gVar4 = g7gVarP;
                            j6 = j3;
                            n26Var5 = n26Var4;
                            z8 = z7;
                            j09Var4 = j09Var2;
                            l26Var5 = l26Var4;
                            i14 = 67108864;
                        }
                        l46Var.s();
                        if ((234881024 & i13) == i14) {
                        }
                        objR = l46Var.R();
                        if (z9) {
                            objR = new c20(5, x16Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new c20(5, x16Var);
                            l46Var.p0(objR);
                        }
                        long j15 = jB;
                        c(j09Var4, j6, j15, g7gVar4, l26Var5, n26Var5, af1.b0(-867946026, new qb0(z8, feg.c((x16) objR, l46Var, 6), z6, jB), l46Var), l46Var, (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                        z5 = z6;
                        j09Var3 = j09Var4;
                        j5 = j15;
                        g7gVar3 = g7gVar4;
                        l26Var3 = l26Var5;
                        n26Var3 = n26Var5;
                        z4 = z8;
                        j4 = j6;
                    } else {
                        l46Var.Z();
                        z4 = z2;
                        j09Var3 = j09Var2;
                        j4 = j3;
                        g7gVar3 = g7gVar2;
                        l26Var3 = l26Var2;
                        n26Var3 = n26Var2;
                        j5 = j2;
                        z5 = z;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: rb0
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i | 1);
                                pa7.a(j09Var3, j4, j5, g7gVar3, l26Var3, n26Var3, z5, z4, x16Var, (l46) obj, iP, i2);
                                return wef.a;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                if ((i & 100663296) == 0) {
                    if (l46Var.i(x16Var)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i3 |= i15;
                }
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i3 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i18 != 0) {
                            j3 = y72.j;
                        }
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i12 = i3 & (-897);
                        if ((i2 & 8) != 0) {
                            g7gVarP = fdc.p(l46Var);
                            i13 = i3 & (-8065);
                        } else {
                            i13 = i12;
                            g7gVarP = g7gVar2;
                        }
                        if (i4 != 0) {
                            l26Var4 = vfh.a;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.b;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        } else {
                            z6 = z;
                        }
                        if (i10 != 0) {
                            z7 = true;
                        } else {
                            z7 = z2;
                        }
                        g7gVar4 = g7gVarP;
                        j6 = j3;
                        n26Var5 = n26Var4;
                        z8 = z7;
                        j09Var4 = j09Var2;
                        l26Var5 = l26Var4;
                        i14 = 67108864;
                    } else {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i18 != 0) {
                            j3 = y72.j;
                        }
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i12 = i3 & (-897);
                        if ((i2 & 8) != 0) {
                            g7gVarP = fdc.p(l46Var);
                            i13 = i3 & (-8065);
                        } else {
                            i13 = i12;
                            g7gVarP = g7gVar2;
                        }
                        if (i4 != 0) {
                            l26Var4 = vfh.a;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.b;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        } else {
                            z6 = z;
                        }
                        if (i10 != 0) {
                            z7 = true;
                        } else {
                            z7 = z2;
                        }
                        g7gVar4 = g7gVarP;
                        j6 = j3;
                        n26Var5 = n26Var4;
                        z8 = z7;
                        j09Var4 = j09Var2;
                        l26Var5 = l26Var4;
                        i14 = 67108864;
                    }
                    l46Var.s();
                    if ((234881024 & i13) == i14) {
                    }
                    objR = l46Var.R();
                    if (z9) {
                        objR = new c20(5, x16Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new c20(5, x16Var);
                        l46Var.p0(objR);
                    }
                    long j16 = jB;
                    c(j09Var4, j6, j16, g7gVar4, l26Var5, n26Var5, af1.b0(-867946026, new qb0(z8, feg.c((x16) objR, l46Var, 6), z6, jB), l46Var), l46Var, (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                    z5 = z6;
                    j09Var3 = j09Var4;
                    j5 = j16;
                    g7gVar3 = g7gVar4;
                    l26Var3 = l26Var5;
                    n26Var3 = n26Var5;
                    z4 = z8;
                    j4 = j6;
                } else {
                    l46Var.Z();
                    z4 = z2;
                    j09Var3 = j09Var2;
                    j4 = j3;
                    g7gVar3 = g7gVar2;
                    l26Var3 = l26Var2;
                    n26Var3 = n26Var2;
                    j5 = j2;
                    z5 = z;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: rb0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            pa7.a(j09Var3, j4, j5, g7gVar3, l26Var3, n26Var3, z5, z4, x16Var, (l46) obj, iP, i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            n26Var2 = n26Var;
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (l46Var.h(z)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i10 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i10 != 0) {
                if ((i & 12582912) == 0) {
                    if (l46Var.h(z2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((i & 100663296) == 0) {
                    if (l46Var.i(x16Var)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i3 |= i15;
                }
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i3 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i18 != 0) {
                            j3 = y72.j;
                        }
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i12 = i3 & (-897);
                        if ((i2 & 8) != 0) {
                            g7gVarP = fdc.p(l46Var);
                            i13 = i3 & (-8065);
                        } else {
                            i13 = i12;
                            g7gVarP = g7gVar2;
                        }
                        if (i4 != 0) {
                            l26Var4 = vfh.a;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.b;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        } else {
                            z6 = z;
                        }
                        if (i10 != 0) {
                            z7 = true;
                        } else {
                            z7 = z2;
                        }
                        g7gVar4 = g7gVarP;
                        j6 = j3;
                        n26Var5 = n26Var4;
                        z8 = z7;
                        j09Var4 = j09Var2;
                        l26Var5 = l26Var4;
                        i14 = 67108864;
                    } else {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i18 != 0) {
                            j3 = y72.j;
                        }
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i12 = i3 & (-897);
                        if ((i2 & 8) != 0) {
                            g7gVarP = fdc.p(l46Var);
                            i13 = i3 & (-8065);
                        } else {
                            i13 = i12;
                            g7gVarP = g7gVar2;
                        }
                        if (i4 != 0) {
                            l26Var4 = vfh.a;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.b;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        } else {
                            z6 = z;
                        }
                        if (i10 != 0) {
                            z7 = true;
                        } else {
                            z7 = z2;
                        }
                        g7gVar4 = g7gVarP;
                        j6 = j3;
                        n26Var5 = n26Var4;
                        z8 = z7;
                        j09Var4 = j09Var2;
                        l26Var5 = l26Var4;
                        i14 = 67108864;
                    }
                    l46Var.s();
                    if ((234881024 & i13) == i14) {
                    }
                    objR = l46Var.R();
                    if (z9) {
                        objR = new c20(5, x16Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new c20(5, x16Var);
                        l46Var.p0(objR);
                    }
                    long j17 = jB;
                    c(j09Var4, j6, j17, g7gVar4, l26Var5, n26Var5, af1.b0(-867946026, new qb0(z8, feg.c((x16) objR, l46Var, 6), z6, jB), l46Var), l46Var, (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                    z5 = z6;
                    j09Var3 = j09Var4;
                    j5 = j17;
                    g7gVar3 = g7gVar4;
                    l26Var3 = l26Var5;
                    n26Var3 = n26Var5;
                    z4 = z8;
                    j4 = j6;
                } else {
                    l46Var.Z();
                    z4 = z2;
                    j09Var3 = j09Var2;
                    j4 = j3;
                    g7gVar3 = g7gVar2;
                    l26Var3 = l26Var2;
                    n26Var3 = n26Var2;
                    j5 = j2;
                    z5 = z;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: rb0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            pa7.a(j09Var3, j4, j5, g7gVar3, l26Var3, n26Var3, z5, z4, x16Var, (l46) obj, iP, i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 12582912;
            if ((i & 100663296) == 0) {
                if (l46Var.i(x16Var)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i3 |= i15;
            }
            if ((i3 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i18 != 0) {
                        j3 = y72.j;
                    }
                    jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    i12 = i3 & (-897);
                    if ((i2 & 8) != 0) {
                        g7gVarP = fdc.p(l46Var);
                        i13 = i3 & (-8065);
                    } else {
                        i13 = i12;
                        g7gVarP = g7gVar2;
                    }
                    if (i4 != 0) {
                        l26Var4 = vfh.a;
                    } else {
                        l26Var4 = l26Var2;
                    }
                    if (i6 != 0) {
                        n26Var4 = vfh.b;
                    } else {
                        n26Var4 = n26Var2;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    } else {
                        z6 = z;
                    }
                    if (i10 != 0) {
                        z7 = true;
                    } else {
                        z7 = z2;
                    }
                    g7gVar4 = g7gVarP;
                    j6 = j3;
                    n26Var5 = n26Var4;
                    z8 = z7;
                    j09Var4 = j09Var2;
                    l26Var5 = l26Var4;
                    i14 = 67108864;
                } else {
                    if (i17 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i18 != 0) {
                        j3 = y72.j;
                    }
                    jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    i12 = i3 & (-897);
                    if ((i2 & 8) != 0) {
                        g7gVarP = fdc.p(l46Var);
                        i13 = i3 & (-8065);
                    } else {
                        i13 = i12;
                        g7gVarP = g7gVar2;
                    }
                    if (i4 != 0) {
                        l26Var4 = vfh.a;
                    } else {
                        l26Var4 = l26Var2;
                    }
                    if (i6 != 0) {
                        n26Var4 = vfh.b;
                    } else {
                        n26Var4 = n26Var2;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    } else {
                        z6 = z;
                    }
                    if (i10 != 0) {
                        z7 = true;
                    } else {
                        z7 = z2;
                    }
                    g7gVar4 = g7gVarP;
                    j6 = j3;
                    n26Var5 = n26Var4;
                    z8 = z7;
                    j09Var4 = j09Var2;
                    l26Var5 = l26Var4;
                    i14 = 67108864;
                }
                l46Var.s();
                if ((234881024 & i13) == i14) {
                }
                objR = l46Var.R();
                if (z9) {
                    objR = new c20(5, x16Var);
                    l46Var.p0(objR);
                } else {
                    objR = new c20(5, x16Var);
                    l46Var.p0(objR);
                }
                long j18 = jB;
                c(j09Var4, j6, j18, g7gVar4, l26Var5, n26Var5, af1.b0(-867946026, new qb0(z8, feg.c((x16) objR, l46Var, 6), z6, jB), l46Var), l46Var, (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                z5 = z6;
                j09Var3 = j09Var4;
                j5 = j18;
                g7gVar3 = g7gVar4;
                l26Var3 = l26Var5;
                n26Var3 = n26Var5;
                z4 = z8;
                j4 = j6;
            } else {
                l46Var.Z();
                z4 = z2;
                j09Var3 = j09Var2;
                j4 = j3;
                g7gVar3 = g7gVar2;
                l26Var3 = l26Var2;
                n26Var3 = n26Var2;
                j5 = j2;
                z5 = z;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: rb0
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i | 1);
                        pa7.a(j09Var3, j4, j5, g7gVar3, l26Var3, n26Var3, z5, z4, x16Var, (l46) obj, iP, i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 24576;
        l26Var2 = l26Var;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                n26Var2 = n26Var;
                if (l46Var.i(n26Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (l46Var.h(z)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i10 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i10 != 0) {
                if ((i & 12582912) == 0) {
                    if (l46Var.h(z2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((i & 100663296) == 0) {
                    if (l46Var.i(x16Var)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i3 |= i15;
                }
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i3 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i18 != 0) {
                            j3 = y72.j;
                        }
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i12 = i3 & (-897);
                        if ((i2 & 8) != 0) {
                            g7gVarP = fdc.p(l46Var);
                            i13 = i3 & (-8065);
                        } else {
                            i13 = i12;
                            g7gVarP = g7gVar2;
                        }
                        if (i4 != 0) {
                            l26Var4 = vfh.a;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.b;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        } else {
                            z6 = z;
                        }
                        if (i10 != 0) {
                            z7 = true;
                        } else {
                            z7 = z2;
                        }
                        g7gVar4 = g7gVarP;
                        j6 = j3;
                        n26Var5 = n26Var4;
                        z8 = z7;
                        j09Var4 = j09Var2;
                        l26Var5 = l26Var4;
                        i14 = 67108864;
                    } else {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i18 != 0) {
                            j3 = y72.j;
                        }
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i12 = i3 & (-897);
                        if ((i2 & 8) != 0) {
                            g7gVarP = fdc.p(l46Var);
                            i13 = i3 & (-8065);
                        } else {
                            i13 = i12;
                            g7gVarP = g7gVar2;
                        }
                        if (i4 != 0) {
                            l26Var4 = vfh.a;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.b;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        } else {
                            z6 = z;
                        }
                        if (i10 != 0) {
                            z7 = true;
                        } else {
                            z7 = z2;
                        }
                        g7gVar4 = g7gVarP;
                        j6 = j3;
                        n26Var5 = n26Var4;
                        z8 = z7;
                        j09Var4 = j09Var2;
                        l26Var5 = l26Var4;
                        i14 = 67108864;
                    }
                    l46Var.s();
                    if ((234881024 & i13) == i14) {
                    }
                    objR = l46Var.R();
                    if (z9) {
                        objR = new c20(5, x16Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new c20(5, x16Var);
                        l46Var.p0(objR);
                    }
                    long j19 = jB;
                    c(j09Var4, j6, j19, g7gVar4, l26Var5, n26Var5, af1.b0(-867946026, new qb0(z8, feg.c((x16) objR, l46Var, 6), z6, jB), l46Var), l46Var, (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                    z5 = z6;
                    j09Var3 = j09Var4;
                    j5 = j19;
                    g7gVar3 = g7gVar4;
                    l26Var3 = l26Var5;
                    n26Var3 = n26Var5;
                    z4 = z8;
                    j4 = j6;
                } else {
                    l46Var.Z();
                    z4 = z2;
                    j09Var3 = j09Var2;
                    j4 = j3;
                    g7gVar3 = g7gVar2;
                    l26Var3 = l26Var2;
                    n26Var3 = n26Var2;
                    j5 = j2;
                    z5 = z;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: rb0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i | 1);
                            pa7.a(j09Var3, j4, j5, g7gVar3, l26Var3, n26Var3, z5, z4, x16Var, (l46) obj, iP, i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 12582912;
            if ((i & 100663296) == 0) {
                if (l46Var.i(x16Var)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i3 |= i15;
            }
            if ((i3 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i18 != 0) {
                        j3 = y72.j;
                    }
                    jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    i12 = i3 & (-897);
                    if ((i2 & 8) != 0) {
                        g7gVarP = fdc.p(l46Var);
                        i13 = i3 & (-8065);
                    } else {
                        i13 = i12;
                        g7gVarP = g7gVar2;
                    }
                    if (i4 != 0) {
                        l26Var4 = vfh.a;
                    } else {
                        l26Var4 = l26Var2;
                    }
                    if (i6 != 0) {
                        n26Var4 = vfh.b;
                    } else {
                        n26Var4 = n26Var2;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    } else {
                        z6 = z;
                    }
                    if (i10 != 0) {
                        z7 = true;
                    } else {
                        z7 = z2;
                    }
                    g7gVar4 = g7gVarP;
                    j6 = j3;
                    n26Var5 = n26Var4;
                    z8 = z7;
                    j09Var4 = j09Var2;
                    l26Var5 = l26Var4;
                    i14 = 67108864;
                } else {
                    if (i17 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i18 != 0) {
                        j3 = y72.j;
                    }
                    jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    i12 = i3 & (-897);
                    if ((i2 & 8) != 0) {
                        g7gVarP = fdc.p(l46Var);
                        i13 = i3 & (-8065);
                    } else {
                        i13 = i12;
                        g7gVarP = g7gVar2;
                    }
                    if (i4 != 0) {
                        l26Var4 = vfh.a;
                    } else {
                        l26Var4 = l26Var2;
                    }
                    if (i6 != 0) {
                        n26Var4 = vfh.b;
                    } else {
                        n26Var4 = n26Var2;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    } else {
                        z6 = z;
                    }
                    if (i10 != 0) {
                        z7 = true;
                    } else {
                        z7 = z2;
                    }
                    g7gVar4 = g7gVarP;
                    j6 = j3;
                    n26Var5 = n26Var4;
                    z8 = z7;
                    j09Var4 = j09Var2;
                    l26Var5 = l26Var4;
                    i14 = 67108864;
                }
                l46Var.s();
                if ((234881024 & i13) == i14) {
                }
                objR = l46Var.R();
                if (z9) {
                    objR = new c20(5, x16Var);
                    l46Var.p0(objR);
                } else {
                    objR = new c20(5, x16Var);
                    l46Var.p0(objR);
                }
                long j110 = jB;
                c(j09Var4, j6, j110, g7gVar4, l26Var5, n26Var5, af1.b0(-867946026, new qb0(z8, feg.c((x16) objR, l46Var, 6), z6, jB), l46Var), l46Var, (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                z5 = z6;
                j09Var3 = j09Var4;
                j5 = j110;
                g7gVar3 = g7gVar4;
                l26Var3 = l26Var5;
                n26Var3 = n26Var5;
                z4 = z8;
                j4 = j6;
            } else {
                l46Var.Z();
                z4 = z2;
                j09Var3 = j09Var2;
                j4 = j3;
                g7gVar3 = g7gVar2;
                l26Var3 = l26Var2;
                n26Var3 = n26Var2;
                j5 = j2;
                z5 = z;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: rb0
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i | 1);
                        pa7.a(j09Var3, j4, j5, g7gVar3, l26Var3, n26Var3, z5, z4, x16Var, (l46) obj, iP, i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 196608;
        n26Var2 = n26Var;
        i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (l46Var.h(z)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        i10 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i10 != 0) {
            if ((i & 12582912) == 0) {
                if (l46Var.h(z2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
            if ((i & 100663296) == 0) {
                if (l46Var.i(x16Var)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i3 |= i15;
            }
            if ((i3 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i18 != 0) {
                        j3 = y72.j;
                    }
                    jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    i12 = i3 & (-897);
                    if ((i2 & 8) != 0) {
                        g7gVarP = fdc.p(l46Var);
                        i13 = i3 & (-8065);
                    } else {
                        i13 = i12;
                        g7gVarP = g7gVar2;
                    }
                    if (i4 != 0) {
                        l26Var4 = vfh.a;
                    } else {
                        l26Var4 = l26Var2;
                    }
                    if (i6 != 0) {
                        n26Var4 = vfh.b;
                    } else {
                        n26Var4 = n26Var2;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    } else {
                        z6 = z;
                    }
                    if (i10 != 0) {
                        z7 = true;
                    } else {
                        z7 = z2;
                    }
                    g7gVar4 = g7gVarP;
                    j6 = j3;
                    n26Var5 = n26Var4;
                    z8 = z7;
                    j09Var4 = j09Var2;
                    l26Var5 = l26Var4;
                    i14 = 67108864;
                } else {
                    if (i17 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i18 != 0) {
                        j3 = y72.j;
                    }
                    jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    i12 = i3 & (-897);
                    if ((i2 & 8) != 0) {
                        g7gVarP = fdc.p(l46Var);
                        i13 = i3 & (-8065);
                    } else {
                        i13 = i12;
                        g7gVarP = g7gVar2;
                    }
                    if (i4 != 0) {
                        l26Var4 = vfh.a;
                    } else {
                        l26Var4 = l26Var2;
                    }
                    if (i6 != 0) {
                        n26Var4 = vfh.b;
                    } else {
                        n26Var4 = n26Var2;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    } else {
                        z6 = z;
                    }
                    if (i10 != 0) {
                        z7 = true;
                    } else {
                        z7 = z2;
                    }
                    g7gVar4 = g7gVarP;
                    j6 = j3;
                    n26Var5 = n26Var4;
                    z8 = z7;
                    j09Var4 = j09Var2;
                    l26Var5 = l26Var4;
                    i14 = 67108864;
                }
                l46Var.s();
                if ((234881024 & i13) == i14) {
                }
                objR = l46Var.R();
                if (z9) {
                    objR = new c20(5, x16Var);
                    l46Var.p0(objR);
                } else {
                    objR = new c20(5, x16Var);
                    l46Var.p0(objR);
                }
                long j111 = jB;
                c(j09Var4, j6, j111, g7gVar4, l26Var5, n26Var5, af1.b0(-867946026, new qb0(z8, feg.c((x16) objR, l46Var, 6), z6, jB), l46Var), l46Var, (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                z5 = z6;
                j09Var3 = j09Var4;
                j5 = j111;
                g7gVar3 = g7gVar4;
                l26Var3 = l26Var5;
                n26Var3 = n26Var5;
                z4 = z8;
                j4 = j6;
            } else {
                l46Var.Z();
                z4 = z2;
                j09Var3 = j09Var2;
                j4 = j3;
                g7gVar3 = g7gVar2;
                l26Var3 = l26Var2;
                n26Var3 = n26Var2;
                j5 = j2;
                z5 = z;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: rb0
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i | 1);
                        pa7.a(j09Var3, j4, j5, g7gVar3, l26Var3, n26Var3, z5, z4, x16Var, (l46) obj, iP, i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 12582912;
        if ((i & 100663296) == 0) {
            if (l46Var.i(x16Var)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i3 |= i15;
        }
        if ((i3 & 38347923) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i3 & 1, z3)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if (i17 != 0) {
                    j09Var2 = g09.a;
                }
                if (i18 != 0) {
                    j3 = y72.j;
                }
                jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                i12 = i3 & (-897);
                if ((i2 & 8) != 0) {
                    g7gVarP = fdc.p(l46Var);
                    i13 = i3 & (-8065);
                } else {
                    i13 = i12;
                    g7gVarP = g7gVar2;
                }
                if (i4 != 0) {
                    l26Var4 = vfh.a;
                } else {
                    l26Var4 = l26Var2;
                }
                if (i6 != 0) {
                    n26Var4 = vfh.b;
                } else {
                    n26Var4 = n26Var2;
                }
                if (i8 != 0) {
                    z6 = true;
                } else {
                    z6 = z;
                }
                if (i10 != 0) {
                    z7 = true;
                } else {
                    z7 = z2;
                }
                g7gVar4 = g7gVarP;
                j6 = j3;
                n26Var5 = n26Var4;
                z8 = z7;
                j09Var4 = j09Var2;
                l26Var5 = l26Var4;
                i14 = 67108864;
            } else {
                if (i17 != 0) {
                    j09Var2 = g09.a;
                }
                if (i18 != 0) {
                    j3 = y72.j;
                }
                jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                i12 = i3 & (-897);
                if ((i2 & 8) != 0) {
                    g7gVarP = fdc.p(l46Var);
                    i13 = i3 & (-8065);
                } else {
                    i13 = i12;
                    g7gVarP = g7gVar2;
                }
                if (i4 != 0) {
                    l26Var4 = vfh.a;
                } else {
                    l26Var4 = l26Var2;
                }
                if (i6 != 0) {
                    n26Var4 = vfh.b;
                } else {
                    n26Var4 = n26Var2;
                }
                if (i8 != 0) {
                    z6 = true;
                } else {
                    z6 = z;
                }
                if (i10 != 0) {
                    z7 = true;
                } else {
                    z7 = z2;
                }
                g7gVar4 = g7gVarP;
                j6 = j3;
                n26Var5 = n26Var4;
                z8 = z7;
                j09Var4 = j09Var2;
                l26Var5 = l26Var4;
                i14 = 67108864;
            }
            l46Var.s();
            if ((234881024 & i13) == i14) {
            }
            objR = l46Var.R();
            if (z9) {
                objR = new c20(5, x16Var);
                l46Var.p0(objR);
            } else {
                objR = new c20(5, x16Var);
                l46Var.p0(objR);
            }
            long j112 = jB;
            c(j09Var4, j6, j112, g7gVar4, l26Var5, n26Var5, af1.b0(-867946026, new qb0(z8, feg.c((x16) objR, l46Var, 6), z6, jB), l46Var), l46Var, (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
            z5 = z6;
            j09Var3 = j09Var4;
            j5 = j112;
            g7gVar3 = g7gVar4;
            l26Var3 = l26Var5;
            n26Var3 = n26Var5;
            z4 = z8;
            j4 = j6;
        } else {
            l46Var.Z();
            z4 = z2;
            j09Var3 = j09Var2;
            j4 = j3;
            g7gVar3 = g7gVar2;
            l26Var3 = l26Var2;
            n26Var3 = n26Var2;
            j5 = j2;
            z5 = z;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: rb0
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(i | 1);
                    pa7.a(j09Var3, j4, j5, g7gVar3, l26Var3, n26Var3, z5, z4, x16Var, (l46) obj, iP, i2);
                    return wef.a;
                }
            };
        }
    }

    public static m88 a0(m88 m88Var) {
        if (m88Var.isDone()) {
            return m88Var;
        }
        x36 x36Var = new x36();
        x36Var.v = m88Var;
        m88Var.b(x36Var, f94.a);
        return x36Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0113  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    /* JADX WARN: Code duplicated, block: B:52:0x0156  */
    /* JADX WARN: Code duplicated, block: B:53:0x015a  */
    /* JADX WARN: Code duplicated, block: B:56:0x018e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0192  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x0238  */
    /* JADX WARN: Code duplicated, block: B:66:0x023c  */
    /* JADX WARN: Code duplicated, block: B:70:0x025d  */
    /* JADX WARN: Code duplicated, block: B:73:0x026d  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void b(j09 j09Var, String str, boolean z, boolean z2, x16 x16Var, dd2 dd2Var, l46 l46Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        dd2 dd2Var2;
        j09 j09Var2;
        boolean z4;
        boolean z5;
        ojb ojbVarV;
        boolean z6;
        boolean z7;
        dd2 dd2VarB0;
        dd2 dd2VarB1;
        g09 g09Var;
        j09 j09VarO;
        rc0 rc0Var;
        v7c v7cVar;
        m8c m8cVar;
        ov7 ov7Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        kx0 kx0Var = ndb.y;
        kx0 kx0Var2 = ndb.z;
        x16Var.getClass();
        l46Var.h0(-1028346411);
        int i7 = i | 6 | (l46Var.g(str) ? 32 : 16);
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                i7 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i3 = i2 & 8;
            if (i3 != 0) {
                if ((i & 3072) == 0) {
                    if (l46Var.h(z2)) {
                        i4 = 2048;
                    } else {
                        i4 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i7 |= i4;
                }
                if (l46Var.i(x16Var)) {
                    i5 = 16384;
                } else {
                    i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i6 = i7 | i5;
                if ((i6 & 74899) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i6 & 1, z3)) {
                    if (i8 != 0) {
                        z6 = false;
                    } else {
                        z6 = z;
                    }
                    if (i3 != 0) {
                        z7 = false;
                    } else {
                        z7 = z2;
                    }
                    dd2VarB0 = af1.b0(-1951053886, new mb0(z7, x16Var, 0), l46Var);
                    dd2VarB1 = af1.b0(1704923967, new ob0(str, 0), l46Var);
                    g09Var = g09.a;
                    z = z6;
                    boolean z8 = z7;
                    j09VarO = tm7.o(b.d(mh3.W(b.c(g09Var, 1.0f)), 44.0f), y72.j, g21.f);
                    rc0Var = xc0.a;
                    v7cVar = v7c.a;
                    m8cVar = xc0.g;
                    ov7Var = LayoutNode.h1;
                    if (z) {
                        l46Var.f0(535391559);
                        xn8 xn8VarC = s21.c(ndb.f, false);
                        int iHashCode = Long.hashCode(l46Var.T);
                        u8a u8aVarM = l46Var.m();
                        j09 j09VarJ = m93.J(l46Var, j09VarO);
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var4, l46Var, xn8VarC);
                        dec.l(he2Var3, l46Var, u8aVarM);
                        ib8.s(iHashCode, l46Var, he2Var2, l46Var);
                        dec.l(he2Var, l46Var, j09VarJ);
                        dd2VarB1.m(ynb.b0(56.0f, 0.0f, b.c(g09Var, 1.0f), 2), l46Var, 54);
                        j09 j09VarC = b.c(g09Var, 1.0f);
                        t7c t7cVarA = s7c.a(m8cVar, kx0Var2, l46Var, 54);
                        int iHashCode2 = Long.hashCode(l46Var.T);
                        u8a u8aVarM2 = l46Var.m();
                        j09 j09VarJ2 = m93.J(l46Var, j09VarC);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var4, l46Var, t7cVarA);
                        dec.l(he2Var3, l46Var, u8aVarM2);
                        ib8.s(iHashCode2, l46Var, he2Var2, l46Var);
                        dec.l(he2Var, l46Var, j09VarJ2);
                        dd2VarB0.z(l46Var, 6);
                        t7c t7cVarA2 = s7c.a(rc0Var, kx0Var, l46Var, 0);
                        int iHashCode3 = Long.hashCode(l46Var.T);
                        u8a u8aVarM3 = l46Var.m();
                        j09 j09VarJ3 = m93.J(l46Var, g09Var);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var4, l46Var, t7cVarA2);
                        dec.l(he2Var3, l46Var, u8aVarM3);
                        ib8.s(iHashCode3, l46Var, he2Var2, l46Var);
                        dec.l(he2Var, l46Var, j09VarJ3);
                        dd2Var.m(v7cVar, l46Var, 54);
                        l46Var.r(true);
                        l46Var.r(true);
                        l46Var.r(true);
                        l46Var.r(false);
                        dd2Var2 = dd2Var;
                    } else {
                        l46Var.f0(535781012);
                        t7c t7cVarA3 = s7c.a(m8cVar, kx0Var2, l46Var, 54);
                        int iHashCode4 = Long.hashCode(l46Var.T);
                        u8a u8aVarM4 = l46Var.m();
                        j09 j09VarJ4 = m93.J(l46Var, j09VarO);
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var4, l46Var, t7cVarA3);
                        dec.l(he2Var3, l46Var, u8aVarM4);
                        ib8.s(iHashCode4, l46Var, he2Var2, l46Var);
                        dec.l(he2Var, l46Var, j09VarJ4);
                        dd2VarB0.z(l46Var, 6);
                        dd2VarB1.m(ynb.b0(16.0f, 0.0f, v7cVar.a(g09Var, 1.0f, true), 2), l46Var, 48);
                        t7c t7cVarA4 = s7c.a(rc0Var, kx0Var, l46Var, 0);
                        int iHashCode5 = Long.hashCode(l46Var.T);
                        u8a u8aVarM5 = l46Var.m();
                        j09 j09VarJ5 = m93.J(l46Var, g09Var);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var4, l46Var, t7cVarA4);
                        dec.l(he2Var3, l46Var, u8aVarM5);
                        ib8.s(iHashCode5, l46Var, he2Var2, l46Var);
                        dec.l(he2Var, l46Var, j09VarJ5);
                        dd2Var2 = dd2Var;
                        dd2Var2.m(v7cVar, l46Var, 54);
                        tec.s(l46Var, true, true, false);
                    }
                    j09Var2 = g09Var;
                    z4 = z8;
                } else {
                    dd2Var2 = dd2Var;
                    l46Var.Z();
                    j09Var2 = j09Var;
                    z4 = z2;
                }
                z5 = z;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new pb0(j09Var2, str, z5, z4, x16Var, dd2Var2, i, i2);
                }
            }
            i7 |= 3072;
            if (l46Var.i(x16Var)) {
                i5 = 16384;
            } else {
                i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i6 = i7 | i5;
            if ((i6 & 74899) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i6 & 1, z3)) {
                if (i8 != 0) {
                    z6 = false;
                } else {
                    z6 = z;
                }
                if (i3 != 0) {
                    z7 = false;
                } else {
                    z7 = z2;
                }
                dd2VarB0 = af1.b0(-1951053886, new mb0(z7, x16Var, 0), l46Var);
                dd2VarB1 = af1.b0(1704923967, new ob0(str, 0), l46Var);
                g09Var = g09.a;
                z = z6;
                boolean z9 = z7;
                j09VarO = tm7.o(b.d(mh3.W(b.c(g09Var, 1.0f)), 44.0f), y72.j, g21.f);
                rc0Var = xc0.a;
                v7cVar = v7c.a;
                m8cVar = xc0.g;
                ov7Var = LayoutNode.h1;
                if (z) {
                    l46Var.f0(535391559);
                    xn8 xn8VarC2 = s21.c(ndb.f, false);
                    int iHashCode6 = Long.hashCode(l46Var.T);
                    u8a u8aVarM6 = l46Var.m();
                    j09 j09VarJ6 = m93.J(l46Var, j09VarO);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var4, l46Var, xn8VarC2);
                    dec.l(he2Var3, l46Var, u8aVarM6);
                    ib8.s(iHashCode6, l46Var, he2Var2, l46Var);
                    dec.l(he2Var, l46Var, j09VarJ6);
                    dd2VarB1.m(ynb.b0(56.0f, 0.0f, b.c(g09Var, 1.0f), 2), l46Var, 54);
                    j09 j09VarC2 = b.c(g09Var, 1.0f);
                    t7c t7cVarA5 = s7c.a(m8cVar, kx0Var2, l46Var, 54);
                    int iHashCode7 = Long.hashCode(l46Var.T);
                    u8a u8aVarM7 = l46Var.m();
                    j09 j09VarJ7 = m93.J(l46Var, j09VarC2);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var4, l46Var, t7cVarA5);
                    dec.l(he2Var3, l46Var, u8aVarM7);
                    ib8.s(iHashCode7, l46Var, he2Var2, l46Var);
                    dec.l(he2Var, l46Var, j09VarJ7);
                    dd2VarB0.z(l46Var, 6);
                    t7c t7cVarA6 = s7c.a(rc0Var, kx0Var, l46Var, 0);
                    int iHashCode8 = Long.hashCode(l46Var.T);
                    u8a u8aVarM8 = l46Var.m();
                    j09 j09VarJ8 = m93.J(l46Var, g09Var);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var4, l46Var, t7cVarA6);
                    dec.l(he2Var3, l46Var, u8aVarM8);
                    ib8.s(iHashCode8, l46Var, he2Var2, l46Var);
                    dec.l(he2Var, l46Var, j09VarJ8);
                    dd2Var.m(v7cVar, l46Var, 54);
                    l46Var.r(true);
                    l46Var.r(true);
                    l46Var.r(true);
                    l46Var.r(false);
                    dd2Var2 = dd2Var;
                } else {
                    l46Var.f0(535781012);
                    t7c t7cVarA7 = s7c.a(m8cVar, kx0Var2, l46Var, 54);
                    int iHashCode9 = Long.hashCode(l46Var.T);
                    u8a u8aVarM9 = l46Var.m();
                    j09 j09VarJ9 = m93.J(l46Var, j09VarO);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var4, l46Var, t7cVarA7);
                    dec.l(he2Var3, l46Var, u8aVarM9);
                    ib8.s(iHashCode9, l46Var, he2Var2, l46Var);
                    dec.l(he2Var, l46Var, j09VarJ9);
                    dd2VarB0.z(l46Var, 6);
                    dd2VarB1.m(ynb.b0(16.0f, 0.0f, v7cVar.a(g09Var, 1.0f, true), 2), l46Var, 48);
                    t7c t7cVarA8 = s7c.a(rc0Var, kx0Var, l46Var, 0);
                    int iHashCode10 = Long.hashCode(l46Var.T);
                    u8a u8aVarM10 = l46Var.m();
                    j09 j09VarJ10 = m93.J(l46Var, g09Var);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var4, l46Var, t7cVarA8);
                    dec.l(he2Var3, l46Var, u8aVarM10);
                    ib8.s(iHashCode10, l46Var, he2Var2, l46Var);
                    dec.l(he2Var, l46Var, j09VarJ10);
                    dd2Var2 = dd2Var;
                    dd2Var2.m(v7cVar, l46Var, 54);
                    tec.s(l46Var, true, true, false);
                }
                j09Var2 = g09Var;
                z4 = z9;
            } else {
                dd2Var2 = dd2Var;
                l46Var.Z();
                j09Var2 = j09Var;
                z4 = z2;
            }
            z5 = z;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new pb0(j09Var2, str, z5, z4, x16Var, dd2Var2, i, i2);
            }
        }
        i7 |= 384;
        i3 = i2 & 8;
        if (i3 != 0) {
            if ((i & 3072) == 0) {
                if (l46Var.h(z2)) {
                    i4 = 2048;
                } else {
                    i4 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i7 |= i4;
            }
            if (l46Var.i(x16Var)) {
                i5 = 16384;
            } else {
                i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i6 = i7 | i5;
            if ((i6 & 74899) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i6 & 1, z3)) {
                if (i8 != 0) {
                    z6 = false;
                } else {
                    z6 = z;
                }
                if (i3 != 0) {
                    z7 = false;
                } else {
                    z7 = z2;
                }
                dd2VarB0 = af1.b0(-1951053886, new mb0(z7, x16Var, 0), l46Var);
                dd2VarB1 = af1.b0(1704923967, new ob0(str, 0), l46Var);
                g09Var = g09.a;
                z = z6;
                boolean z10 = z7;
                j09VarO = tm7.o(b.d(mh3.W(b.c(g09Var, 1.0f)), 44.0f), y72.j, g21.f);
                rc0Var = xc0.a;
                v7cVar = v7c.a;
                m8cVar = xc0.g;
                ov7Var = LayoutNode.h1;
                if (z) {
                    l46Var.f0(535391559);
                    xn8 xn8VarC3 = s21.c(ndb.f, false);
                    int iHashCode11 = Long.hashCode(l46Var.T);
                    u8a u8aVarM11 = l46Var.m();
                    j09 j09VarJ11 = m93.J(l46Var, j09VarO);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var4, l46Var, xn8VarC3);
                    dec.l(he2Var3, l46Var, u8aVarM11);
                    ib8.s(iHashCode11, l46Var, he2Var2, l46Var);
                    dec.l(he2Var, l46Var, j09VarJ11);
                    dd2VarB1.m(ynb.b0(56.0f, 0.0f, b.c(g09Var, 1.0f), 2), l46Var, 54);
                    j09 j09VarC3 = b.c(g09Var, 1.0f);
                    t7c t7cVarA9 = s7c.a(m8cVar, kx0Var2, l46Var, 54);
                    int iHashCode12 = Long.hashCode(l46Var.T);
                    u8a u8aVarM12 = l46Var.m();
                    j09 j09VarJ12 = m93.J(l46Var, j09VarC3);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var4, l46Var, t7cVarA9);
                    dec.l(he2Var3, l46Var, u8aVarM12);
                    ib8.s(iHashCode12, l46Var, he2Var2, l46Var);
                    dec.l(he2Var, l46Var, j09VarJ12);
                    dd2VarB0.z(l46Var, 6);
                    t7c t7cVarA10 = s7c.a(rc0Var, kx0Var, l46Var, 0);
                    int iHashCode13 = Long.hashCode(l46Var.T);
                    u8a u8aVarM13 = l46Var.m();
                    j09 j09VarJ13 = m93.J(l46Var, g09Var);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var4, l46Var, t7cVarA10);
                    dec.l(he2Var3, l46Var, u8aVarM13);
                    ib8.s(iHashCode13, l46Var, he2Var2, l46Var);
                    dec.l(he2Var, l46Var, j09VarJ13);
                    dd2Var.m(v7cVar, l46Var, 54);
                    l46Var.r(true);
                    l46Var.r(true);
                    l46Var.r(true);
                    l46Var.r(false);
                    dd2Var2 = dd2Var;
                } else {
                    l46Var.f0(535781012);
                    t7c t7cVarA11 = s7c.a(m8cVar, kx0Var2, l46Var, 54);
                    int iHashCode14 = Long.hashCode(l46Var.T);
                    u8a u8aVarM14 = l46Var.m();
                    j09 j09VarJ14 = m93.J(l46Var, j09VarO);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var4, l46Var, t7cVarA11);
                    dec.l(he2Var3, l46Var, u8aVarM14);
                    ib8.s(iHashCode14, l46Var, he2Var2, l46Var);
                    dec.l(he2Var, l46Var, j09VarJ14);
                    dd2VarB0.z(l46Var, 6);
                    dd2VarB1.m(ynb.b0(16.0f, 0.0f, v7cVar.a(g09Var, 1.0f, true), 2), l46Var, 48);
                    t7c t7cVarA12 = s7c.a(rc0Var, kx0Var, l46Var, 0);
                    int iHashCode15 = Long.hashCode(l46Var.T);
                    u8a u8aVarM15 = l46Var.m();
                    j09 j09VarJ15 = m93.J(l46Var, g09Var);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var4, l46Var, t7cVarA12);
                    dec.l(he2Var3, l46Var, u8aVarM15);
                    ib8.s(iHashCode15, l46Var, he2Var2, l46Var);
                    dec.l(he2Var, l46Var, j09VarJ15);
                    dd2Var2 = dd2Var;
                    dd2Var2.m(v7cVar, l46Var, 54);
                    tec.s(l46Var, true, true, false);
                }
                j09Var2 = g09Var;
                z4 = z10;
            } else {
                dd2Var2 = dd2Var;
                l46Var.Z();
                j09Var2 = j09Var;
                z4 = z2;
            }
            z5 = z;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new pb0(j09Var2, str, z5, z4, x16Var, dd2Var2, i, i2);
            }
        }
        i7 |= 3072;
        if (l46Var.i(x16Var)) {
            i5 = 16384;
        } else {
            i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        i6 = i7 | i5;
        if ((i6 & 74899) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i6 & 1, z3)) {
            if (i8 != 0) {
                z6 = false;
            } else {
                z6 = z;
            }
            if (i3 != 0) {
                z7 = false;
            } else {
                z7 = z2;
            }
            dd2VarB0 = af1.b0(-1951053886, new mb0(z7, x16Var, 0), l46Var);
            dd2VarB1 = af1.b0(1704923967, new ob0(str, 0), l46Var);
            g09Var = g09.a;
            z = z6;
            boolean z11 = z7;
            j09VarO = tm7.o(b.d(mh3.W(b.c(g09Var, 1.0f)), 44.0f), y72.j, g21.f);
            rc0Var = xc0.a;
            v7cVar = v7c.a;
            m8cVar = xc0.g;
            ov7Var = LayoutNode.h1;
            if (z) {
                l46Var.f0(535391559);
                xn8 xn8VarC4 = s21.c(ndb.f, false);
                int iHashCode16 = Long.hashCode(l46Var.T);
                u8a u8aVarM16 = l46Var.m();
                j09 j09VarJ16 = m93.J(l46Var, j09VarO);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var4, l46Var, xn8VarC4);
                dec.l(he2Var3, l46Var, u8aVarM16);
                ib8.s(iHashCode16, l46Var, he2Var2, l46Var);
                dec.l(he2Var, l46Var, j09VarJ16);
                dd2VarB1.m(ynb.b0(56.0f, 0.0f, b.c(g09Var, 1.0f), 2), l46Var, 54);
                j09 j09VarC4 = b.c(g09Var, 1.0f);
                t7c t7cVarA13 = s7c.a(m8cVar, kx0Var2, l46Var, 54);
                int iHashCode17 = Long.hashCode(l46Var.T);
                u8a u8aVarM17 = l46Var.m();
                j09 j09VarJ17 = m93.J(l46Var, j09VarC4);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var4, l46Var, t7cVarA13);
                dec.l(he2Var3, l46Var, u8aVarM17);
                ib8.s(iHashCode17, l46Var, he2Var2, l46Var);
                dec.l(he2Var, l46Var, j09VarJ17);
                dd2VarB0.z(l46Var, 6);
                t7c t7cVarA14 = s7c.a(rc0Var, kx0Var, l46Var, 0);
                int iHashCode18 = Long.hashCode(l46Var.T);
                u8a u8aVarM18 = l46Var.m();
                j09 j09VarJ18 = m93.J(l46Var, g09Var);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var4, l46Var, t7cVarA14);
                dec.l(he2Var3, l46Var, u8aVarM18);
                ib8.s(iHashCode18, l46Var, he2Var2, l46Var);
                dec.l(he2Var, l46Var, j09VarJ18);
                dd2Var.m(v7cVar, l46Var, 54);
                l46Var.r(true);
                l46Var.r(true);
                l46Var.r(true);
                l46Var.r(false);
                dd2Var2 = dd2Var;
            } else {
                l46Var.f0(535781012);
                t7c t7cVarA15 = s7c.a(m8cVar, kx0Var2, l46Var, 54);
                int iHashCode19 = Long.hashCode(l46Var.T);
                u8a u8aVarM19 = l46Var.m();
                j09 j09VarJ19 = m93.J(l46Var, j09VarO);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var4, l46Var, t7cVarA15);
                dec.l(he2Var3, l46Var, u8aVarM19);
                ib8.s(iHashCode19, l46Var, he2Var2, l46Var);
                dec.l(he2Var, l46Var, j09VarJ19);
                dd2VarB0.z(l46Var, 6);
                dd2VarB1.m(ynb.b0(16.0f, 0.0f, v7cVar.a(g09Var, 1.0f, true), 2), l46Var, 48);
                t7c t7cVarA16 = s7c.a(rc0Var, kx0Var, l46Var, 0);
                int iHashCode110 = Long.hashCode(l46Var.T);
                u8a u8aVarM110 = l46Var.m();
                j09 j09VarJ110 = m93.J(l46Var, g09Var);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var4, l46Var, t7cVarA16);
                dec.l(he2Var3, l46Var, u8aVarM110);
                ib8.s(iHashCode110, l46Var, he2Var2, l46Var);
                dec.l(he2Var, l46Var, j09VarJ110);
                dd2Var2 = dd2Var;
                dd2Var2.m(v7cVar, l46Var, 54);
                tec.s(l46Var, true, true, false);
            }
            j09Var2 = g09Var;
            z4 = z11;
        } else {
            dd2Var2 = dd2Var;
            l46Var.Z();
            j09Var2 = j09Var;
            z4 = z2;
        }
        z5 = z;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new pb0(j09Var2, str, z5, z4, x16Var, dd2Var2, i, i2);
        }
    }

    public static String b0(int i, String str, boolean z) {
        if ((i & 2) != 0) {
            z = false;
        }
        ca2.a.getClass();
        if (ca2.c) {
            return null;
        }
        if (z && str == null) {
            return null;
        }
        return t(str, "experiment") ? "g2_6_readings" : "g1_5_readings";
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0110  */
    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:104:0x012a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0133  */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x0191  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:93:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Code duplicated, block: B:97:0x0109  */
    public static final void c(j09 j09Var, long j, long j2, g7g g7gVar, l26 l26Var, n26 n26Var, final dd2 dd2Var, l46 l46Var, final int i, final int i2) {
        int i3;
        long j3;
        final g7g g7gVarP;
        int i4;
        l26 l26Var2;
        int i5;
        int i6;
        n26 n26Var2;
        int i7;
        dd2 dd2Var2;
        boolean z;
        final j09 j09Var2;
        final long j4;
        final n26 n26Var3;
        final long j5;
        final l26 l26Var3;
        ojb ojbVarV;
        j09 j09Var3;
        long jB;
        int i8;
        long j6;
        g7g g7gVar2;
        long j7;
        int i9;
        int i10;
        int i11;
        l46Var.h0(-599804723);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                j3 = j;
                i3 |= l46Var.f(j3) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0 || !l46Var.f(j2)) {
                    i11 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                } else {
                    i11 = 256;
                }
                i3 |= i11;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    g7gVarP = g7gVar;
                    if (l46Var.g(g7gVarP)) {
                        i10 = 2048;
                    }
                    i3 |= i10;
                } else {
                    g7gVarP = g7gVar;
                }
                i10 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i3 |= i10;
            } else {
                g7gVarP = g7gVar;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    l26Var2 = l26Var;
                    if (l46Var.i(l26Var2)) {
                        i5 = 16384;
                    } else {
                        i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        n26Var2 = n26Var;
                        if (l46Var.i(n26Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        dd2Var2 = dd2Var;
                        if (l46Var.i(dd2Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    } else {
                        dd2Var2 = dd2Var;
                    }
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i3 & 1, z)) {
                        l46Var.b0();
                        if ((i & 1) != 0 || l46Var.C()) {
                            if (i12 != 0) {
                                j09Var3 = g09.a;
                            } else {
                                j09Var3 = j09Var;
                            }
                            if (i13 != 0) {
                                j3 = y72.j;
                            }
                            if ((i2 & 4) != 0) {
                                jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                                i3 &= -897;
                            } else {
                                jB = j2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                g7gVarP = fdc.p(l46Var);
                            }
                            if (i4 != 0) {
                                l26Var2 = vfh.f;
                            }
                            if (i6 != 0) {
                                n26Var2 = vfh.g;
                            }
                            i8 = i3;
                            j6 = j3;
                            g7gVar2 = g7gVarP;
                            j7 = jB;
                        } else {
                            l46Var.Z();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            j09Var3 = j09Var;
                            i8 = i3;
                            j6 = j3;
                            g7gVar2 = g7gVarP;
                            j7 = j2;
                        }
                        l46Var.s();
                        j09Var2 = j09Var3;
                        g7g g7gVar3 = g7gVar2;
                        n26 n26Var4 = n26Var2;
                        v70.a(af1.b0(962173618, new sb0(0, l26Var2), l46Var), j09Var2, dd2Var2, n26Var4, 0.0f, g7gVar3, fdc.v(j6, j6, j7, j7, l46Var, 40), l46Var, ((i8 << 3) & 112) | 6 | ((i8 >> 12) & 896) | ((i8 >> 6) & 7168) | ((i8 << 6) & 458752), 144);
                        n26Var3 = n26Var4;
                        g7gVarP = g7gVar3;
                        j4 = j6;
                        j5 = j7;
                    } else {
                        l46Var.Z();
                        j09Var2 = j09Var;
                        j4 = j3;
                        n26Var3 = n26Var2;
                        j5 = j2;
                    }
                    l26Var3 = l26Var2;
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: tb0
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                pa7.c(j09Var2, j4, j5, g7gVarP, l26Var3, n26Var3, dd2Var, (l46) obj, k99.P(i | 1), i2);
                                return wef.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                n26Var2 = n26Var;
                if ((1572864 & i) == 0) {
                    dd2Var2 = dd2Var;
                    if (l46Var.i(dd2Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    dd2Var2 = dd2Var;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i3 & 1, z)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i13 != 0) {
                            j3 = y72.j;
                        }
                        if ((i2 & 4) != 0) {
                            jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            i3 &= -897;
                        } else {
                            jB = j2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            g7gVarP = fdc.p(l46Var);
                        }
                        if (i4 != 0) {
                            l26Var2 = vfh.f;
                        }
                        if (i6 != 0) {
                            n26Var2 = vfh.g;
                        }
                        i8 = i3;
                        j6 = j3;
                        g7gVar2 = g7gVarP;
                        j7 = jB;
                    } else {
                        if (i12 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i13 != 0) {
                            j3 = y72.j;
                        }
                        if ((i2 & 4) != 0) {
                            jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            i3 &= -897;
                        } else {
                            jB = j2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            g7gVarP = fdc.p(l46Var);
                        }
                        if (i4 != 0) {
                            l26Var2 = vfh.f;
                        }
                        if (i6 != 0) {
                            n26Var2 = vfh.g;
                        }
                        i8 = i3;
                        j6 = j3;
                        g7gVar2 = g7gVarP;
                        j7 = jB;
                    }
                    l46Var.s();
                    j09Var2 = j09Var3;
                    g7g g7gVar4 = g7gVar2;
                    n26 n26Var5 = n26Var2;
                    v70.a(af1.b0(962173618, new sb0(0, l26Var2), l46Var), j09Var2, dd2Var2, n26Var5, 0.0f, g7gVar4, fdc.v(j6, j6, j7, j7, l46Var, 40), l46Var, ((i8 << 3) & 112) | 6 | ((i8 >> 12) & 896) | ((i8 >> 6) & 7168) | ((i8 << 6) & 458752), 144);
                    n26Var3 = n26Var5;
                    g7gVarP = g7gVar4;
                    j4 = j6;
                    j5 = j7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    j4 = j3;
                    n26Var3 = n26Var2;
                    j5 = j2;
                }
                l26Var3 = l26Var2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: tb0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            pa7.c(j09Var2, j4, j5, g7gVarP, l26Var3, n26Var3, dd2Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            l26Var2 = l26Var;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    dd2Var2 = dd2Var;
                    if (l46Var.i(dd2Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    dd2Var2 = dd2Var;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i3 & 1, z)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i13 != 0) {
                            j3 = y72.j;
                        }
                        if ((i2 & 4) != 0) {
                            jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            i3 &= -897;
                        } else {
                            jB = j2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            g7gVarP = fdc.p(l46Var);
                        }
                        if (i4 != 0) {
                            l26Var2 = vfh.f;
                        }
                        if (i6 != 0) {
                            n26Var2 = vfh.g;
                        }
                        i8 = i3;
                        j6 = j3;
                        g7gVar2 = g7gVarP;
                        j7 = jB;
                    } else {
                        if (i12 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i13 != 0) {
                            j3 = y72.j;
                        }
                        if ((i2 & 4) != 0) {
                            jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            i3 &= -897;
                        } else {
                            jB = j2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            g7gVarP = fdc.p(l46Var);
                        }
                        if (i4 != 0) {
                            l26Var2 = vfh.f;
                        }
                        if (i6 != 0) {
                            n26Var2 = vfh.g;
                        }
                        i8 = i3;
                        j6 = j3;
                        g7gVar2 = g7gVarP;
                        j7 = jB;
                    }
                    l46Var.s();
                    j09Var2 = j09Var3;
                    g7g g7gVar5 = g7gVar2;
                    n26 n26Var6 = n26Var2;
                    v70.a(af1.b0(962173618, new sb0(0, l26Var2), l46Var), j09Var2, dd2Var2, n26Var6, 0.0f, g7gVar5, fdc.v(j6, j6, j7, j7, l46Var, 40), l46Var, ((i8 << 3) & 112) | 6 | ((i8 >> 12) & 896) | ((i8 >> 6) & 7168) | ((i8 << 6) & 458752), 144);
                    n26Var3 = n26Var6;
                    g7gVarP = g7gVar5;
                    j4 = j6;
                    j5 = j7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    j4 = j3;
                    n26Var3 = n26Var2;
                    j5 = j2;
                }
                l26Var3 = l26Var2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: tb0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            pa7.c(j09Var2, j4, j5, g7gVarP, l26Var3, n26Var3, dd2Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            n26Var2 = n26Var;
            if ((1572864 & i) == 0) {
                dd2Var2 = dd2Var;
                if (l46Var.i(dd2Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                dd2Var2 = dd2Var;
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i3 & 1, z)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i13 != 0) {
                        j3 = y72.j;
                    }
                    if ((i2 & 4) != 0) {
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i3 &= -897;
                    } else {
                        jB = j2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        g7gVarP = fdc.p(l46Var);
                    }
                    if (i4 != 0) {
                        l26Var2 = vfh.f;
                    }
                    if (i6 != 0) {
                        n26Var2 = vfh.g;
                    }
                    i8 = i3;
                    j6 = j3;
                    g7gVar2 = g7gVarP;
                    j7 = jB;
                } else {
                    if (i12 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i13 != 0) {
                        j3 = y72.j;
                    }
                    if ((i2 & 4) != 0) {
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i3 &= -897;
                    } else {
                        jB = j2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        g7gVarP = fdc.p(l46Var);
                    }
                    if (i4 != 0) {
                        l26Var2 = vfh.f;
                    }
                    if (i6 != 0) {
                        n26Var2 = vfh.g;
                    }
                    i8 = i3;
                    j6 = j3;
                    g7gVar2 = g7gVarP;
                    j7 = jB;
                }
                l46Var.s();
                j09Var2 = j09Var3;
                g7g g7gVar6 = g7gVar2;
                n26 n26Var7 = n26Var2;
                v70.a(af1.b0(962173618, new sb0(0, l26Var2), l46Var), j09Var2, dd2Var2, n26Var7, 0.0f, g7gVar6, fdc.v(j6, j6, j7, j7, l46Var, 40), l46Var, ((i8 << 3) & 112) | 6 | ((i8 >> 12) & 896) | ((i8 >> 6) & 7168) | ((i8 << 6) & 458752), 144);
                n26Var3 = n26Var7;
                g7gVarP = g7gVar6;
                j4 = j6;
                j5 = j7;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                j4 = j3;
                n26Var3 = n26Var2;
                j5 = j2;
            }
            l26Var3 = l26Var2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: tb0
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        pa7.c(j09Var2, j4, j5, g7gVarP, l26Var3, n26Var3, dd2Var, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 48;
        j3 = j;
        if ((i & 384) != 0) {
            if ((i2 & 4) == 0) {
                i11 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            } else {
                i11 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i3 |= i11;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                g7gVarP = g7gVar;
                if (l46Var.g(g7gVarP)) {
                    i10 = 2048;
                }
                i3 |= i10;
            } else {
                g7gVarP = g7gVar;
            }
            i10 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i3 |= i10;
        } else {
            g7gVarP = g7gVar;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                l26Var2 = l26Var;
                if (l46Var.i(l26Var2)) {
                    i5 = 16384;
                } else {
                    i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    dd2Var2 = dd2Var;
                    if (l46Var.i(dd2Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    dd2Var2 = dd2Var;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i3 & 1, z)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i13 != 0) {
                            j3 = y72.j;
                        }
                        if ((i2 & 4) != 0) {
                            jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            i3 &= -897;
                        } else {
                            jB = j2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            g7gVarP = fdc.p(l46Var);
                        }
                        if (i4 != 0) {
                            l26Var2 = vfh.f;
                        }
                        if (i6 != 0) {
                            n26Var2 = vfh.g;
                        }
                        i8 = i3;
                        j6 = j3;
                        g7gVar2 = g7gVarP;
                        j7 = jB;
                    } else {
                        if (i12 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var;
                        }
                        if (i13 != 0) {
                            j3 = y72.j;
                        }
                        if ((i2 & 4) != 0) {
                            jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            i3 &= -897;
                        } else {
                            jB = j2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            g7gVarP = fdc.p(l46Var);
                        }
                        if (i4 != 0) {
                            l26Var2 = vfh.f;
                        }
                        if (i6 != 0) {
                            n26Var2 = vfh.g;
                        }
                        i8 = i3;
                        j6 = j3;
                        g7gVar2 = g7gVarP;
                        j7 = jB;
                    }
                    l46Var.s();
                    j09Var2 = j09Var3;
                    g7g g7gVar7 = g7gVar2;
                    n26 n26Var8 = n26Var2;
                    v70.a(af1.b0(962173618, new sb0(0, l26Var2), l46Var), j09Var2, dd2Var2, n26Var8, 0.0f, g7gVar7, fdc.v(j6, j6, j7, j7, l46Var, 40), l46Var, ((i8 << 3) & 112) | 6 | ((i8 >> 12) & 896) | ((i8 >> 6) & 7168) | ((i8 << 6) & 458752), 144);
                    n26Var3 = n26Var8;
                    g7gVarP = g7gVar7;
                    j4 = j6;
                    j5 = j7;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    j4 = j3;
                    n26Var3 = n26Var2;
                    j5 = j2;
                }
                l26Var3 = l26Var2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: tb0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            pa7.c(j09Var2, j4, j5, g7gVarP, l26Var3, n26Var3, dd2Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            n26Var2 = n26Var;
            if ((1572864 & i) == 0) {
                dd2Var2 = dd2Var;
                if (l46Var.i(dd2Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                dd2Var2 = dd2Var;
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i3 & 1, z)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i13 != 0) {
                        j3 = y72.j;
                    }
                    if ((i2 & 4) != 0) {
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i3 &= -897;
                    } else {
                        jB = j2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        g7gVarP = fdc.p(l46Var);
                    }
                    if (i4 != 0) {
                        l26Var2 = vfh.f;
                    }
                    if (i6 != 0) {
                        n26Var2 = vfh.g;
                    }
                    i8 = i3;
                    j6 = j3;
                    g7gVar2 = g7gVarP;
                    j7 = jB;
                } else {
                    if (i12 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i13 != 0) {
                        j3 = y72.j;
                    }
                    if ((i2 & 4) != 0) {
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i3 &= -897;
                    } else {
                        jB = j2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        g7gVarP = fdc.p(l46Var);
                    }
                    if (i4 != 0) {
                        l26Var2 = vfh.f;
                    }
                    if (i6 != 0) {
                        n26Var2 = vfh.g;
                    }
                    i8 = i3;
                    j6 = j3;
                    g7gVar2 = g7gVarP;
                    j7 = jB;
                }
                l46Var.s();
                j09Var2 = j09Var3;
                g7g g7gVar8 = g7gVar2;
                n26 n26Var9 = n26Var2;
                v70.a(af1.b0(962173618, new sb0(0, l26Var2), l46Var), j09Var2, dd2Var2, n26Var9, 0.0f, g7gVar8, fdc.v(j6, j6, j7, j7, l46Var, 40), l46Var, ((i8 << 3) & 112) | 6 | ((i8 >> 12) & 896) | ((i8 >> 6) & 7168) | ((i8 << 6) & 458752), 144);
                n26Var3 = n26Var9;
                g7gVarP = g7gVar8;
                j4 = j6;
                j5 = j7;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                j4 = j3;
                n26Var3 = n26Var2;
                j5 = j2;
            }
            l26Var3 = l26Var2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: tb0
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        pa7.c(j09Var2, j4, j5, g7gVarP, l26Var3, n26Var3, dd2Var, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 24576;
        l26Var2 = l26Var;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                n26Var2 = n26Var;
                if (l46Var.i(n26Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                dd2Var2 = dd2Var;
                if (l46Var.i(dd2Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                dd2Var2 = dd2Var;
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i3 & 1, z)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i13 != 0) {
                        j3 = y72.j;
                    }
                    if ((i2 & 4) != 0) {
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i3 &= -897;
                    } else {
                        jB = j2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        g7gVarP = fdc.p(l46Var);
                    }
                    if (i4 != 0) {
                        l26Var2 = vfh.f;
                    }
                    if (i6 != 0) {
                        n26Var2 = vfh.g;
                    }
                    i8 = i3;
                    j6 = j3;
                    g7gVar2 = g7gVarP;
                    j7 = jB;
                } else {
                    if (i12 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if (i13 != 0) {
                        j3 = y72.j;
                    }
                    if ((i2 & 4) != 0) {
                        jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        i3 &= -897;
                    } else {
                        jB = j2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        g7gVarP = fdc.p(l46Var);
                    }
                    if (i4 != 0) {
                        l26Var2 = vfh.f;
                    }
                    if (i6 != 0) {
                        n26Var2 = vfh.g;
                    }
                    i8 = i3;
                    j6 = j3;
                    g7gVar2 = g7gVarP;
                    j7 = jB;
                }
                l46Var.s();
                j09Var2 = j09Var3;
                g7g g7gVar9 = g7gVar2;
                n26 n26Var10 = n26Var2;
                v70.a(af1.b0(962173618, new sb0(0, l26Var2), l46Var), j09Var2, dd2Var2, n26Var10, 0.0f, g7gVar9, fdc.v(j6, j6, j7, j7, l46Var, 40), l46Var, ((i8 << 3) & 112) | 6 | ((i8 >> 12) & 896) | ((i8 >> 6) & 7168) | ((i8 << 6) & 458752), 144);
                n26Var3 = n26Var10;
                g7gVarP = g7gVar9;
                j4 = j6;
                j5 = j7;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                j4 = j3;
                n26Var3 = n26Var2;
                j5 = j2;
            }
            l26Var3 = l26Var2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: tb0
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        pa7.c(j09Var2, j4, j5, g7gVarP, l26Var3, n26Var3, dd2Var, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 196608;
        n26Var2 = n26Var;
        if ((1572864 & i) == 0) {
            dd2Var2 = dd2Var;
            if (l46Var.i(dd2Var2)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        } else {
            dd2Var2 = dd2Var;
        }
        if ((i3 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i3 & 1, z)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var;
                }
                if (i13 != 0) {
                    j3 = y72.j;
                }
                if ((i2 & 4) != 0) {
                    jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    i3 &= -897;
                } else {
                    jB = j2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    g7gVarP = fdc.p(l46Var);
                }
                if (i4 != 0) {
                    l26Var2 = vfh.f;
                }
                if (i6 != 0) {
                    n26Var2 = vfh.g;
                }
                i8 = i3;
                j6 = j3;
                g7gVar2 = g7gVarP;
                j7 = jB;
            } else {
                if (i12 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var;
                }
                if (i13 != 0) {
                    j3 = y72.j;
                }
                if ((i2 & 4) != 0) {
                    jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    i3 &= -897;
                } else {
                    jB = j2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    g7gVarP = fdc.p(l46Var);
                }
                if (i4 != 0) {
                    l26Var2 = vfh.f;
                }
                if (i6 != 0) {
                    n26Var2 = vfh.g;
                }
                i8 = i3;
                j6 = j3;
                g7gVar2 = g7gVarP;
                j7 = jB;
            }
            l46Var.s();
            j09Var2 = j09Var3;
            g7g g7gVar10 = g7gVar2;
            n26 n26Var11 = n26Var2;
            v70.a(af1.b0(962173618, new sb0(0, l26Var2), l46Var), j09Var2, dd2Var2, n26Var11, 0.0f, g7gVar10, fdc.v(j6, j6, j7, j7, l46Var, 40), l46Var, ((i8 << 3) & 112) | 6 | ((i8 >> 12) & 896) | ((i8 >> 6) & 7168) | ((i8 << 6) & 458752), 144);
            n26Var3 = n26Var11;
            g7gVarP = g7gVar10;
            j4 = j6;
            j5 = j7;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            j4 = j3;
            n26Var3 = n26Var2;
            j5 = j2;
        }
        l26Var3 = l26Var2;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: tb0
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pa7.c(j09Var2, j4, j5, g7gVarP, l26Var3, n26Var3, dd2Var, (l46) obj, k99.P(i | 1), i2);
                    return wef.a;
                }
            };
        }
    }

    public static void c0(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0152  */
    /* JADX WARN: Code duplicated, block: B:106:0x018e  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:85:0x0101  */
    /* JADX WARN: Code duplicated, block: B:88:0x011d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0120  */
    /* JADX WARN: Code duplicated, block: B:91:0x0123  */
    /* JADX WARN: Code duplicated, block: B:92:0x0126  */
    /* JADX WARN: Code duplicated, block: B:94:0x0129  */
    /* JADX WARN: Code duplicated, block: B:99:0x0145  */
    public static final void d(j09 j09Var, long j, long j2, g7g g7gVar, l26 l26Var, n26 n26Var, boolean z, final x16 x16Var, l46 l46Var, final int i, final int i2) {
        j09 j09Var2;
        int i3;
        long j3;
        int i4;
        l26 l26Var2;
        int i5;
        int i6;
        n26 n26Var2;
        int i7;
        int i8;
        boolean z2;
        int i9;
        boolean z3;
        final long j4;
        final j09 j09Var3;
        final long j5;
        final l26 l26Var3;
        final n26 n26Var3;
        final boolean z4;
        final g7g g7gVar2;
        ojb ojbVarV;
        int i10;
        l26 l26Var4;
        n26 n26Var4;
        boolean z5;
        long j6;
        n26 n26Var5;
        g7g g7gVar3;
        l26 l26Var5;
        j09 j09Var4;
        long j7;
        int i11;
        boolean z6;
        Object objR;
        int i12;
        int i13;
        l46Var.h0(1350188639);
        int i14 = i2 & 1;
        if (i14 != 0) {
            i3 = i | 6;
            j09Var2 = j09Var;
        } else if ((i & 6) == 0) {
            j09Var2 = j09Var;
            i3 = (l46Var.g(j09Var2) ? 4 : 2) | i;
        } else {
            j09Var2 = j09Var;
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 == 0) {
            if ((i & 48) == 0) {
                j3 = j;
                i3 |= l46Var.f(j3) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i & 3072) == 0) {
                i3 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    l26Var2 = l26Var;
                    if (l46Var.i(l26Var2)) {
                        i5 = 16384;
                    } else {
                        i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        n26Var2 = n26Var;
                        if (l46Var.i(n26Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((i & 1572864) == 0) {
                            z2 = z;
                            if (l46Var.h(z2)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        if ((i & 12582912) == 0) {
                            if (l46Var.i(x16Var)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 4793491) != 4793490) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (l46Var.W(i3 & 1, z3)) {
                            l46Var.b0();
                            if ((i & 1) != 0 || l46Var.C()) {
                                if (i14 != 0) {
                                    j09Var2 = g09.a;
                                }
                                if (i15 != 0) {
                                    j3 = y72.j;
                                }
                                long jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                                m58 m58VarP = fdc.p(l46Var);
                                i10 = i3 & (-8065);
                                if (i4 != 0) {
                                    l26Var4 = vfh.d;
                                } else {
                                    l26Var4 = l26Var2;
                                }
                                if (i6 != 0) {
                                    n26Var4 = vfh.e;
                                } else {
                                    n26Var4 = n26Var2;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                z5 = z2;
                                j6 = jB;
                                n26Var5 = n26Var4;
                                g7gVar3 = m58VarP;
                                l26Var5 = l26Var4;
                                j09Var4 = j09Var2;
                                j7 = j3;
                                i11 = 8388608;
                            } else {
                                l46Var.Z();
                                i10 = i3 & (-8065);
                                n26Var5 = n26Var2;
                                z5 = z2;
                                j6 = j2;
                                g7gVar3 = g7gVar;
                                l26Var5 = l26Var2;
                                j09Var4 = j09Var2;
                                i11 = 8388608;
                                j7 = j3;
                            }
                            l46Var.s();
                            z6 = (29360128 & i10) == i11;
                            objR = l46Var.R();
                            i12 = 6;
                            if (z6 || objR == sf2.a) {
                                objR = new c20(i12, x16Var);
                                l46Var.p0(objR);
                            }
                            c(j09Var4, j7, j6, g7gVar3, l26Var5, n26Var5, af1.b0(-1854358705, new hc(j6, feg.c((x16) objR, l46Var, 6), z5), l46Var), l46Var, (i10 & 14) | 1572864 | (i10 & 112) | (57344 & i10) | (458752 & i10), 0);
                            z4 = z5;
                            j09Var3 = j09Var4;
                            j5 = j7;
                            j4 = j6;
                            g7gVar2 = g7gVar3;
                            l26Var3 = l26Var5;
                            n26Var3 = n26Var5;
                        } else {
                            l46Var.Z();
                            j4 = j2;
                            j09Var3 = j09Var2;
                            j5 = j3;
                            l26Var3 = l26Var2;
                            n26Var3 = n26Var2;
                            z4 = z2;
                            g7gVar2 = g7gVar;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new l26() { // from class: nb0
                                @Override // defpackage.l26
                                public final Object z(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    pa7.d(j09Var3, j5, j4, g7gVar2, l26Var3, n26Var3, z4, x16Var, (l46) obj, k99.P(i | 1), i2);
                                    return wef.a;
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    z2 = z;
                    if ((i & 12582912) == 0) {
                        if (l46Var.i(x16Var)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (l46Var.W(i3 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i14 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i15 != 0) {
                                j3 = y72.j;
                            }
                            long jB2 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            m58 m58VarP2 = fdc.p(l46Var);
                            i10 = i3 & (-8065);
                            if (i4 != 0) {
                                l26Var4 = vfh.d;
                            } else {
                                l26Var4 = l26Var2;
                            }
                            if (i6 != 0) {
                                n26Var4 = vfh.e;
                            } else {
                                n26Var4 = n26Var2;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            z5 = z2;
                            j6 = jB2;
                            n26Var5 = n26Var4;
                            g7gVar3 = m58VarP2;
                            l26Var5 = l26Var4;
                            j09Var4 = j09Var2;
                            j7 = j3;
                            i11 = 8388608;
                        } else {
                            if (i14 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i15 != 0) {
                                j3 = y72.j;
                            }
                            long jB3 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            m58 m58VarP3 = fdc.p(l46Var);
                            i10 = i3 & (-8065);
                            if (i4 != 0) {
                                l26Var4 = vfh.d;
                            } else {
                                l26Var4 = l26Var2;
                            }
                            if (i6 != 0) {
                                n26Var4 = vfh.e;
                            } else {
                                n26Var4 = n26Var2;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            z5 = z2;
                            j6 = jB3;
                            n26Var5 = n26Var4;
                            g7gVar3 = m58VarP3;
                            l26Var5 = l26Var4;
                            j09Var4 = j09Var2;
                            j7 = j3;
                            i11 = 8388608;
                        }
                        l46Var.s();
                        if ((29360128 & i10) == i11) {
                        }
                        objR = l46Var.R();
                        i12 = 6;
                        if (z6) {
                            objR = new c20(i12, x16Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new c20(i12, x16Var);
                            l46Var.p0(objR);
                        }
                        c(j09Var4, j7, j6, g7gVar3, l26Var5, n26Var5, af1.b0(-1854358705, new hc(j6, feg.c((x16) objR, l46Var, 6), z5), l46Var), l46Var, (i10 & 14) | 1572864 | (i10 & 112) | (57344 & i10) | (458752 & i10), 0);
                        z4 = z5;
                        j09Var3 = j09Var4;
                        j5 = j7;
                        j4 = j6;
                        g7gVar2 = g7gVar3;
                        l26Var3 = l26Var5;
                        n26Var3 = n26Var5;
                    } else {
                        l46Var.Z();
                        j4 = j2;
                        j09Var3 = j09Var2;
                        j5 = j3;
                        l26Var3 = l26Var2;
                        n26Var3 = n26Var2;
                        z4 = z2;
                        g7gVar2 = g7gVar;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: nb0
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                pa7.d(j09Var3, j5, j4, g7gVar2, l26Var3, n26Var3, z4, x16Var, (l46) obj, k99.P(i | 1), i2);
                                return wef.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                n26Var2 = n26Var;
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((i & 1572864) == 0) {
                        z2 = z;
                        if (l46Var.h(z2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((i & 12582912) == 0) {
                        if (l46Var.i(x16Var)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (l46Var.W(i3 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i14 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i15 != 0) {
                                j3 = y72.j;
                            }
                            long jB4 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            m58 m58VarP4 = fdc.p(l46Var);
                            i10 = i3 & (-8065);
                            if (i4 != 0) {
                                l26Var4 = vfh.d;
                            } else {
                                l26Var4 = l26Var2;
                            }
                            if (i6 != 0) {
                                n26Var4 = vfh.e;
                            } else {
                                n26Var4 = n26Var2;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            z5 = z2;
                            j6 = jB4;
                            n26Var5 = n26Var4;
                            g7gVar3 = m58VarP4;
                            l26Var5 = l26Var4;
                            j09Var4 = j09Var2;
                            j7 = j3;
                            i11 = 8388608;
                        } else {
                            if (i14 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i15 != 0) {
                                j3 = y72.j;
                            }
                            long jB5 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            m58 m58VarP5 = fdc.p(l46Var);
                            i10 = i3 & (-8065);
                            if (i4 != 0) {
                                l26Var4 = vfh.d;
                            } else {
                                l26Var4 = l26Var2;
                            }
                            if (i6 != 0) {
                                n26Var4 = vfh.e;
                            } else {
                                n26Var4 = n26Var2;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            z5 = z2;
                            j6 = jB5;
                            n26Var5 = n26Var4;
                            g7gVar3 = m58VarP5;
                            l26Var5 = l26Var4;
                            j09Var4 = j09Var2;
                            j7 = j3;
                            i11 = 8388608;
                        }
                        l46Var.s();
                        if ((29360128 & i10) == i11) {
                        }
                        objR = l46Var.R();
                        i12 = 6;
                        if (z6) {
                            objR = new c20(i12, x16Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new c20(i12, x16Var);
                            l46Var.p0(objR);
                        }
                        c(j09Var4, j7, j6, g7gVar3, l26Var5, n26Var5, af1.b0(-1854358705, new hc(j6, feg.c((x16) objR, l46Var, 6), z5), l46Var), l46Var, (i10 & 14) | 1572864 | (i10 & 112) | (57344 & i10) | (458752 & i10), 0);
                        z4 = z5;
                        j09Var3 = j09Var4;
                        j5 = j7;
                        j4 = j6;
                        g7gVar2 = g7gVar3;
                        l26Var3 = l26Var5;
                        n26Var3 = n26Var5;
                    } else {
                        l46Var.Z();
                        j4 = j2;
                        j09Var3 = j09Var2;
                        j5 = j3;
                        l26Var3 = l26Var2;
                        n26Var3 = n26Var2;
                        z4 = z2;
                        g7gVar2 = g7gVar;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: nb0
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                pa7.d(j09Var3, j5, j4, g7gVar2, l26Var3, n26Var3, z4, x16Var, (l46) obj, k99.P(i | 1), i2);
                                return wef.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                z2 = z;
                if ((i & 12582912) == 0) {
                    if (l46Var.i(x16Var)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i3 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i14 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i15 != 0) {
                            j3 = y72.j;
                        }
                        long jB6 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        m58 m58VarP6 = fdc.p(l46Var);
                        i10 = i3 & (-8065);
                        if (i4 != 0) {
                            l26Var4 = vfh.d;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.e;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        z5 = z2;
                        j6 = jB6;
                        n26Var5 = n26Var4;
                        g7gVar3 = m58VarP6;
                        l26Var5 = l26Var4;
                        j09Var4 = j09Var2;
                        j7 = j3;
                        i11 = 8388608;
                    } else {
                        if (i14 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i15 != 0) {
                            j3 = y72.j;
                        }
                        long jB7 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        m58 m58VarP7 = fdc.p(l46Var);
                        i10 = i3 & (-8065);
                        if (i4 != 0) {
                            l26Var4 = vfh.d;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.e;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        z5 = z2;
                        j6 = jB7;
                        n26Var5 = n26Var4;
                        g7gVar3 = m58VarP7;
                        l26Var5 = l26Var4;
                        j09Var4 = j09Var2;
                        j7 = j3;
                        i11 = 8388608;
                    }
                    l46Var.s();
                    if ((29360128 & i10) == i11) {
                    }
                    objR = l46Var.R();
                    i12 = 6;
                    if (z6) {
                        objR = new c20(i12, x16Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new c20(i12, x16Var);
                        l46Var.p0(objR);
                    }
                    c(j09Var4, j7, j6, g7gVar3, l26Var5, n26Var5, af1.b0(-1854358705, new hc(j6, feg.c((x16) objR, l46Var, 6), z5), l46Var), l46Var, (i10 & 14) | 1572864 | (i10 & 112) | (57344 & i10) | (458752 & i10), 0);
                    z4 = z5;
                    j09Var3 = j09Var4;
                    j5 = j7;
                    j4 = j6;
                    g7gVar2 = g7gVar3;
                    l26Var3 = l26Var5;
                    n26Var3 = n26Var5;
                } else {
                    l46Var.Z();
                    j4 = j2;
                    j09Var3 = j09Var2;
                    j5 = j3;
                    l26Var3 = l26Var2;
                    n26Var3 = n26Var2;
                    z4 = z2;
                    g7gVar2 = g7gVar;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: nb0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            pa7.d(j09Var3, j5, j4, g7gVar2, l26Var3, n26Var3, z4, x16Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            l26Var2 = l26Var;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((i & 1572864) == 0) {
                        z2 = z;
                        if (l46Var.h(z2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((i & 12582912) == 0) {
                        if (l46Var.i(x16Var)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (l46Var.W(i3 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i14 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i15 != 0) {
                                j3 = y72.j;
                            }
                            long jB8 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            m58 m58VarP8 = fdc.p(l46Var);
                            i10 = i3 & (-8065);
                            if (i4 != 0) {
                                l26Var4 = vfh.d;
                            } else {
                                l26Var4 = l26Var2;
                            }
                            if (i6 != 0) {
                                n26Var4 = vfh.e;
                            } else {
                                n26Var4 = n26Var2;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            z5 = z2;
                            j6 = jB8;
                            n26Var5 = n26Var4;
                            g7gVar3 = m58VarP8;
                            l26Var5 = l26Var4;
                            j09Var4 = j09Var2;
                            j7 = j3;
                            i11 = 8388608;
                        } else {
                            if (i14 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i15 != 0) {
                                j3 = y72.j;
                            }
                            long jB9 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            m58 m58VarP9 = fdc.p(l46Var);
                            i10 = i3 & (-8065);
                            if (i4 != 0) {
                                l26Var4 = vfh.d;
                            } else {
                                l26Var4 = l26Var2;
                            }
                            if (i6 != 0) {
                                n26Var4 = vfh.e;
                            } else {
                                n26Var4 = n26Var2;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            z5 = z2;
                            j6 = jB9;
                            n26Var5 = n26Var4;
                            g7gVar3 = m58VarP9;
                            l26Var5 = l26Var4;
                            j09Var4 = j09Var2;
                            j7 = j3;
                            i11 = 8388608;
                        }
                        l46Var.s();
                        if ((29360128 & i10) == i11) {
                        }
                        objR = l46Var.R();
                        i12 = 6;
                        if (z6) {
                            objR = new c20(i12, x16Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new c20(i12, x16Var);
                            l46Var.p0(objR);
                        }
                        c(j09Var4, j7, j6, g7gVar3, l26Var5, n26Var5, af1.b0(-1854358705, new hc(j6, feg.c((x16) objR, l46Var, 6), z5), l46Var), l46Var, (i10 & 14) | 1572864 | (i10 & 112) | (57344 & i10) | (458752 & i10), 0);
                        z4 = z5;
                        j09Var3 = j09Var4;
                        j5 = j7;
                        j4 = j6;
                        g7gVar2 = g7gVar3;
                        l26Var3 = l26Var5;
                        n26Var3 = n26Var5;
                    } else {
                        l46Var.Z();
                        j4 = j2;
                        j09Var3 = j09Var2;
                        j5 = j3;
                        l26Var3 = l26Var2;
                        n26Var3 = n26Var2;
                        z4 = z2;
                        g7gVar2 = g7gVar;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: nb0
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                pa7.d(j09Var3, j5, j4, g7gVar2, l26Var3, n26Var3, z4, x16Var, (l46) obj, k99.P(i | 1), i2);
                                return wef.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                z2 = z;
                if ((i & 12582912) == 0) {
                    if (l46Var.i(x16Var)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i3 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i14 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i15 != 0) {
                            j3 = y72.j;
                        }
                        long jB10 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        m58 m58VarP10 = fdc.p(l46Var);
                        i10 = i3 & (-8065);
                        if (i4 != 0) {
                            l26Var4 = vfh.d;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.e;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        z5 = z2;
                        j6 = jB10;
                        n26Var5 = n26Var4;
                        g7gVar3 = m58VarP10;
                        l26Var5 = l26Var4;
                        j09Var4 = j09Var2;
                        j7 = j3;
                        i11 = 8388608;
                    } else {
                        if (i14 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i15 != 0) {
                            j3 = y72.j;
                        }
                        long jB11 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        m58 m58VarP11 = fdc.p(l46Var);
                        i10 = i3 & (-8065);
                        if (i4 != 0) {
                            l26Var4 = vfh.d;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.e;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        z5 = z2;
                        j6 = jB11;
                        n26Var5 = n26Var4;
                        g7gVar3 = m58VarP11;
                        l26Var5 = l26Var4;
                        j09Var4 = j09Var2;
                        j7 = j3;
                        i11 = 8388608;
                    }
                    l46Var.s();
                    if ((29360128 & i10) == i11) {
                    }
                    objR = l46Var.R();
                    i12 = 6;
                    if (z6) {
                        objR = new c20(i12, x16Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new c20(i12, x16Var);
                        l46Var.p0(objR);
                    }
                    c(j09Var4, j7, j6, g7gVar3, l26Var5, n26Var5, af1.b0(-1854358705, new hc(j6, feg.c((x16) objR, l46Var, 6), z5), l46Var), l46Var, (i10 & 14) | 1572864 | (i10 & 112) | (57344 & i10) | (458752 & i10), 0);
                    z4 = z5;
                    j09Var3 = j09Var4;
                    j5 = j7;
                    j4 = j6;
                    g7gVar2 = g7gVar3;
                    l26Var3 = l26Var5;
                    n26Var3 = n26Var5;
                } else {
                    l46Var.Z();
                    j4 = j2;
                    j09Var3 = j09Var2;
                    j5 = j3;
                    l26Var3 = l26Var2;
                    n26Var3 = n26Var2;
                    z4 = z2;
                    g7gVar2 = g7gVar;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: nb0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            pa7.d(j09Var3, j5, j4, g7gVar2, l26Var3, n26Var3, z4, x16Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            n26Var2 = n26Var;
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((i & 1572864) == 0) {
                    z2 = z;
                    if (l46Var.h(z2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i & 12582912) == 0) {
                    if (l46Var.i(x16Var)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i3 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i14 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i15 != 0) {
                            j3 = y72.j;
                        }
                        long jB12 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        m58 m58VarP12 = fdc.p(l46Var);
                        i10 = i3 & (-8065);
                        if (i4 != 0) {
                            l26Var4 = vfh.d;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.e;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        z5 = z2;
                        j6 = jB12;
                        n26Var5 = n26Var4;
                        g7gVar3 = m58VarP12;
                        l26Var5 = l26Var4;
                        j09Var4 = j09Var2;
                        j7 = j3;
                        i11 = 8388608;
                    } else {
                        if (i14 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i15 != 0) {
                            j3 = y72.j;
                        }
                        long jB13 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        m58 m58VarP13 = fdc.p(l46Var);
                        i10 = i3 & (-8065);
                        if (i4 != 0) {
                            l26Var4 = vfh.d;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.e;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        z5 = z2;
                        j6 = jB13;
                        n26Var5 = n26Var4;
                        g7gVar3 = m58VarP13;
                        l26Var5 = l26Var4;
                        j09Var4 = j09Var2;
                        j7 = j3;
                        i11 = 8388608;
                    }
                    l46Var.s();
                    if ((29360128 & i10) == i11) {
                    }
                    objR = l46Var.R();
                    i12 = 6;
                    if (z6) {
                        objR = new c20(i12, x16Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new c20(i12, x16Var);
                        l46Var.p0(objR);
                    }
                    c(j09Var4, j7, j6, g7gVar3, l26Var5, n26Var5, af1.b0(-1854358705, new hc(j6, feg.c((x16) objR, l46Var, 6), z5), l46Var), l46Var, (i10 & 14) | 1572864 | (i10 & 112) | (57344 & i10) | (458752 & i10), 0);
                    z4 = z5;
                    j09Var3 = j09Var4;
                    j5 = j7;
                    j4 = j6;
                    g7gVar2 = g7gVar3;
                    l26Var3 = l26Var5;
                    n26Var3 = n26Var5;
                } else {
                    l46Var.Z();
                    j4 = j2;
                    j09Var3 = j09Var2;
                    j5 = j3;
                    l26Var3 = l26Var2;
                    n26Var3 = n26Var2;
                    z4 = z2;
                    g7gVar2 = g7gVar;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: nb0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            pa7.d(j09Var3, j5, j4, g7gVar2, l26Var3, n26Var3, z4, x16Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            z2 = z;
            if ((i & 12582912) == 0) {
                if (l46Var.i(x16Var)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i15 != 0) {
                        j3 = y72.j;
                    }
                    long jB14 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    m58 m58VarP14 = fdc.p(l46Var);
                    i10 = i3 & (-8065);
                    if (i4 != 0) {
                        l26Var4 = vfh.d;
                    } else {
                        l26Var4 = l26Var2;
                    }
                    if (i6 != 0) {
                        n26Var4 = vfh.e;
                    } else {
                        n26Var4 = n26Var2;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    z5 = z2;
                    j6 = jB14;
                    n26Var5 = n26Var4;
                    g7gVar3 = m58VarP14;
                    l26Var5 = l26Var4;
                    j09Var4 = j09Var2;
                    j7 = j3;
                    i11 = 8388608;
                } else {
                    if (i14 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i15 != 0) {
                        j3 = y72.j;
                    }
                    long jB15 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    m58 m58VarP15 = fdc.p(l46Var);
                    i10 = i3 & (-8065);
                    if (i4 != 0) {
                        l26Var4 = vfh.d;
                    } else {
                        l26Var4 = l26Var2;
                    }
                    if (i6 != 0) {
                        n26Var4 = vfh.e;
                    } else {
                        n26Var4 = n26Var2;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    z5 = z2;
                    j6 = jB15;
                    n26Var5 = n26Var4;
                    g7gVar3 = m58VarP15;
                    l26Var5 = l26Var4;
                    j09Var4 = j09Var2;
                    j7 = j3;
                    i11 = 8388608;
                }
                l46Var.s();
                if ((29360128 & i10) == i11) {
                }
                objR = l46Var.R();
                i12 = 6;
                if (z6) {
                    objR = new c20(i12, x16Var);
                    l46Var.p0(objR);
                } else {
                    objR = new c20(i12, x16Var);
                    l46Var.p0(objR);
                }
                c(j09Var4, j7, j6, g7gVar3, l26Var5, n26Var5, af1.b0(-1854358705, new hc(j6, feg.c((x16) objR, l46Var, 6), z5), l46Var), l46Var, (i10 & 14) | 1572864 | (i10 & 112) | (57344 & i10) | (458752 & i10), 0);
                z4 = z5;
                j09Var3 = j09Var4;
                j5 = j7;
                j4 = j6;
                g7gVar2 = g7gVar3;
                l26Var3 = l26Var5;
                n26Var3 = n26Var5;
            } else {
                l46Var.Z();
                j4 = j2;
                j09Var3 = j09Var2;
                j5 = j3;
                l26Var3 = l26Var2;
                n26Var3 = n26Var2;
                z4 = z2;
                g7gVar2 = g7gVar;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: nb0
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        pa7.d(j09Var3, j5, j4, g7gVar2, l26Var3, n26Var3, z4, x16Var, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 48;
        j3 = j;
        if ((i & 384) == 0) {
            i3 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i3 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                l26Var2 = l26Var;
                if (l46Var.i(l26Var2)) {
                    i5 = 16384;
                } else {
                    i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((i & 1572864) == 0) {
                        z2 = z;
                        if (l46Var.h(z2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((i & 12582912) == 0) {
                        if (l46Var.i(x16Var)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (l46Var.W(i3 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i14 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i15 != 0) {
                                j3 = y72.j;
                            }
                            long jB16 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            m58 m58VarP16 = fdc.p(l46Var);
                            i10 = i3 & (-8065);
                            if (i4 != 0) {
                                l26Var4 = vfh.d;
                            } else {
                                l26Var4 = l26Var2;
                            }
                            if (i6 != 0) {
                                n26Var4 = vfh.e;
                            } else {
                                n26Var4 = n26Var2;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            z5 = z2;
                            j6 = jB16;
                            n26Var5 = n26Var4;
                            g7gVar3 = m58VarP16;
                            l26Var5 = l26Var4;
                            j09Var4 = j09Var2;
                            j7 = j3;
                            i11 = 8388608;
                        } else {
                            if (i14 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i15 != 0) {
                                j3 = y72.j;
                            }
                            long jB17 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                            m58 m58VarP17 = fdc.p(l46Var);
                            i10 = i3 & (-8065);
                            if (i4 != 0) {
                                l26Var4 = vfh.d;
                            } else {
                                l26Var4 = l26Var2;
                            }
                            if (i6 != 0) {
                                n26Var4 = vfh.e;
                            } else {
                                n26Var4 = n26Var2;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            z5 = z2;
                            j6 = jB17;
                            n26Var5 = n26Var4;
                            g7gVar3 = m58VarP17;
                            l26Var5 = l26Var4;
                            j09Var4 = j09Var2;
                            j7 = j3;
                            i11 = 8388608;
                        }
                        l46Var.s();
                        if ((29360128 & i10) == i11) {
                        }
                        objR = l46Var.R();
                        i12 = 6;
                        if (z6) {
                            objR = new c20(i12, x16Var);
                            l46Var.p0(objR);
                        } else {
                            objR = new c20(i12, x16Var);
                            l46Var.p0(objR);
                        }
                        c(j09Var4, j7, j6, g7gVar3, l26Var5, n26Var5, af1.b0(-1854358705, new hc(j6, feg.c((x16) objR, l46Var, 6), z5), l46Var), l46Var, (i10 & 14) | 1572864 | (i10 & 112) | (57344 & i10) | (458752 & i10), 0);
                        z4 = z5;
                        j09Var3 = j09Var4;
                        j5 = j7;
                        j4 = j6;
                        g7gVar2 = g7gVar3;
                        l26Var3 = l26Var5;
                        n26Var3 = n26Var5;
                    } else {
                        l46Var.Z();
                        j4 = j2;
                        j09Var3 = j09Var2;
                        j5 = j3;
                        l26Var3 = l26Var2;
                        n26Var3 = n26Var2;
                        z4 = z2;
                        g7gVar2 = g7gVar;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: nb0
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                pa7.d(j09Var3, j5, j4, g7gVar2, l26Var3, n26Var3, z4, x16Var, (l46) obj, k99.P(i | 1), i2);
                                return wef.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                z2 = z;
                if ((i & 12582912) == 0) {
                    if (l46Var.i(x16Var)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i3 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i14 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i15 != 0) {
                            j3 = y72.j;
                        }
                        long jB18 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        m58 m58VarP18 = fdc.p(l46Var);
                        i10 = i3 & (-8065);
                        if (i4 != 0) {
                            l26Var4 = vfh.d;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.e;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        z5 = z2;
                        j6 = jB18;
                        n26Var5 = n26Var4;
                        g7gVar3 = m58VarP18;
                        l26Var5 = l26Var4;
                        j09Var4 = j09Var2;
                        j7 = j3;
                        i11 = 8388608;
                    } else {
                        if (i14 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i15 != 0) {
                            j3 = y72.j;
                        }
                        long jB19 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        m58 m58VarP19 = fdc.p(l46Var);
                        i10 = i3 & (-8065);
                        if (i4 != 0) {
                            l26Var4 = vfh.d;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.e;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        z5 = z2;
                        j6 = jB19;
                        n26Var5 = n26Var4;
                        g7gVar3 = m58VarP19;
                        l26Var5 = l26Var4;
                        j09Var4 = j09Var2;
                        j7 = j3;
                        i11 = 8388608;
                    }
                    l46Var.s();
                    if ((29360128 & i10) == i11) {
                    }
                    objR = l46Var.R();
                    i12 = 6;
                    if (z6) {
                        objR = new c20(i12, x16Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new c20(i12, x16Var);
                        l46Var.p0(objR);
                    }
                    c(j09Var4, j7, j6, g7gVar3, l26Var5, n26Var5, af1.b0(-1854358705, new hc(j6, feg.c((x16) objR, l46Var, 6), z5), l46Var), l46Var, (i10 & 14) | 1572864 | (i10 & 112) | (57344 & i10) | (458752 & i10), 0);
                    z4 = z5;
                    j09Var3 = j09Var4;
                    j5 = j7;
                    j4 = j6;
                    g7gVar2 = g7gVar3;
                    l26Var3 = l26Var5;
                    n26Var3 = n26Var5;
                } else {
                    l46Var.Z();
                    j4 = j2;
                    j09Var3 = j09Var2;
                    j5 = j3;
                    l26Var3 = l26Var2;
                    n26Var3 = n26Var2;
                    z4 = z2;
                    g7gVar2 = g7gVar;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: nb0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            pa7.d(j09Var3, j5, j4, g7gVar2, l26Var3, n26Var3, z4, x16Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            n26Var2 = n26Var;
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((i & 1572864) == 0) {
                    z2 = z;
                    if (l46Var.h(z2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i & 12582912) == 0) {
                    if (l46Var.i(x16Var)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i3 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i14 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i15 != 0) {
                            j3 = y72.j;
                        }
                        long jB110 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        m58 m58VarP110 = fdc.p(l46Var);
                        i10 = i3 & (-8065);
                        if (i4 != 0) {
                            l26Var4 = vfh.d;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.e;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        z5 = z2;
                        j6 = jB110;
                        n26Var5 = n26Var4;
                        g7gVar3 = m58VarP110;
                        l26Var5 = l26Var4;
                        j09Var4 = j09Var2;
                        j7 = j3;
                        i11 = 8388608;
                    } else {
                        if (i14 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i15 != 0) {
                            j3 = y72.j;
                        }
                        long jB111 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        m58 m58VarP111 = fdc.p(l46Var);
                        i10 = i3 & (-8065);
                        if (i4 != 0) {
                            l26Var4 = vfh.d;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.e;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        z5 = z2;
                        j6 = jB111;
                        n26Var5 = n26Var4;
                        g7gVar3 = m58VarP111;
                        l26Var5 = l26Var4;
                        j09Var4 = j09Var2;
                        j7 = j3;
                        i11 = 8388608;
                    }
                    l46Var.s();
                    if ((29360128 & i10) == i11) {
                    }
                    objR = l46Var.R();
                    i12 = 6;
                    if (z6) {
                        objR = new c20(i12, x16Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new c20(i12, x16Var);
                        l46Var.p0(objR);
                    }
                    c(j09Var4, j7, j6, g7gVar3, l26Var5, n26Var5, af1.b0(-1854358705, new hc(j6, feg.c((x16) objR, l46Var, 6), z5), l46Var), l46Var, (i10 & 14) | 1572864 | (i10 & 112) | (57344 & i10) | (458752 & i10), 0);
                    z4 = z5;
                    j09Var3 = j09Var4;
                    j5 = j7;
                    j4 = j6;
                    g7gVar2 = g7gVar3;
                    l26Var3 = l26Var5;
                    n26Var3 = n26Var5;
                } else {
                    l46Var.Z();
                    j4 = j2;
                    j09Var3 = j09Var2;
                    j5 = j3;
                    l26Var3 = l26Var2;
                    n26Var3 = n26Var2;
                    z4 = z2;
                    g7gVar2 = g7gVar;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: nb0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            pa7.d(j09Var3, j5, j4, g7gVar2, l26Var3, n26Var3, z4, x16Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            z2 = z;
            if ((i & 12582912) == 0) {
                if (l46Var.i(x16Var)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i15 != 0) {
                        j3 = y72.j;
                    }
                    long jB112 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    m58 m58VarP112 = fdc.p(l46Var);
                    i10 = i3 & (-8065);
                    if (i4 != 0) {
                        l26Var4 = vfh.d;
                    } else {
                        l26Var4 = l26Var2;
                    }
                    if (i6 != 0) {
                        n26Var4 = vfh.e;
                    } else {
                        n26Var4 = n26Var2;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    z5 = z2;
                    j6 = jB112;
                    n26Var5 = n26Var4;
                    g7gVar3 = m58VarP112;
                    l26Var5 = l26Var4;
                    j09Var4 = j09Var2;
                    j7 = j3;
                    i11 = 8388608;
                } else {
                    if (i14 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i15 != 0) {
                        j3 = y72.j;
                    }
                    long jB113 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    m58 m58VarP113 = fdc.p(l46Var);
                    i10 = i3 & (-8065);
                    if (i4 != 0) {
                        l26Var4 = vfh.d;
                    } else {
                        l26Var4 = l26Var2;
                    }
                    if (i6 != 0) {
                        n26Var4 = vfh.e;
                    } else {
                        n26Var4 = n26Var2;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    z5 = z2;
                    j6 = jB113;
                    n26Var5 = n26Var4;
                    g7gVar3 = m58VarP113;
                    l26Var5 = l26Var4;
                    j09Var4 = j09Var2;
                    j7 = j3;
                    i11 = 8388608;
                }
                l46Var.s();
                if ((29360128 & i10) == i11) {
                }
                objR = l46Var.R();
                i12 = 6;
                if (z6) {
                    objR = new c20(i12, x16Var);
                    l46Var.p0(objR);
                } else {
                    objR = new c20(i12, x16Var);
                    l46Var.p0(objR);
                }
                c(j09Var4, j7, j6, g7gVar3, l26Var5, n26Var5, af1.b0(-1854358705, new hc(j6, feg.c((x16) objR, l46Var, 6), z5), l46Var), l46Var, (i10 & 14) | 1572864 | (i10 & 112) | (57344 & i10) | (458752 & i10), 0);
                z4 = z5;
                j09Var3 = j09Var4;
                j5 = j7;
                j4 = j6;
                g7gVar2 = g7gVar3;
                l26Var3 = l26Var5;
                n26Var3 = n26Var5;
            } else {
                l46Var.Z();
                j4 = j2;
                j09Var3 = j09Var2;
                j5 = j3;
                l26Var3 = l26Var2;
                n26Var3 = n26Var2;
                z4 = z2;
                g7gVar2 = g7gVar;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: nb0
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        pa7.d(j09Var3, j5, j4, g7gVar2, l26Var3, n26Var3, z4, x16Var, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 24576;
        l26Var2 = l26Var;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                n26Var2 = n26Var;
                if (l46Var.i(n26Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((i & 1572864) == 0) {
                    z2 = z;
                    if (l46Var.h(z2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i & 12582912) == 0) {
                    if (l46Var.i(x16Var)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i3 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i14 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i15 != 0) {
                            j3 = y72.j;
                        }
                        long jB114 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        m58 m58VarP114 = fdc.p(l46Var);
                        i10 = i3 & (-8065);
                        if (i4 != 0) {
                            l26Var4 = vfh.d;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.e;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        z5 = z2;
                        j6 = jB114;
                        n26Var5 = n26Var4;
                        g7gVar3 = m58VarP114;
                        l26Var5 = l26Var4;
                        j09Var4 = j09Var2;
                        j7 = j3;
                        i11 = 8388608;
                    } else {
                        if (i14 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i15 != 0) {
                            j3 = y72.j;
                        }
                        long jB115 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                        m58 m58VarP115 = fdc.p(l46Var);
                        i10 = i3 & (-8065);
                        if (i4 != 0) {
                            l26Var4 = vfh.d;
                        } else {
                            l26Var4 = l26Var2;
                        }
                        if (i6 != 0) {
                            n26Var4 = vfh.e;
                        } else {
                            n26Var4 = n26Var2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        z5 = z2;
                        j6 = jB115;
                        n26Var5 = n26Var4;
                        g7gVar3 = m58VarP115;
                        l26Var5 = l26Var4;
                        j09Var4 = j09Var2;
                        j7 = j3;
                        i11 = 8388608;
                    }
                    l46Var.s();
                    if ((29360128 & i10) == i11) {
                    }
                    objR = l46Var.R();
                    i12 = 6;
                    if (z6) {
                        objR = new c20(i12, x16Var);
                        l46Var.p0(objR);
                    } else {
                        objR = new c20(i12, x16Var);
                        l46Var.p0(objR);
                    }
                    c(j09Var4, j7, j6, g7gVar3, l26Var5, n26Var5, af1.b0(-1854358705, new hc(j6, feg.c((x16) objR, l46Var, 6), z5), l46Var), l46Var, (i10 & 14) | 1572864 | (i10 & 112) | (57344 & i10) | (458752 & i10), 0);
                    z4 = z5;
                    j09Var3 = j09Var4;
                    j5 = j7;
                    j4 = j6;
                    g7gVar2 = g7gVar3;
                    l26Var3 = l26Var5;
                    n26Var3 = n26Var5;
                } else {
                    l46Var.Z();
                    j4 = j2;
                    j09Var3 = j09Var2;
                    j5 = j3;
                    l26Var3 = l26Var2;
                    n26Var3 = n26Var2;
                    z4 = z2;
                    g7gVar2 = g7gVar;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: nb0
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            pa7.d(j09Var3, j5, j4, g7gVar2, l26Var3, n26Var3, z4, x16Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            z2 = z;
            if ((i & 12582912) == 0) {
                if (l46Var.i(x16Var)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i15 != 0) {
                        j3 = y72.j;
                    }
                    long jB116 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    m58 m58VarP116 = fdc.p(l46Var);
                    i10 = i3 & (-8065);
                    if (i4 != 0) {
                        l26Var4 = vfh.d;
                    } else {
                        l26Var4 = l26Var2;
                    }
                    if (i6 != 0) {
                        n26Var4 = vfh.e;
                    } else {
                        n26Var4 = n26Var2;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    z5 = z2;
                    j6 = jB116;
                    n26Var5 = n26Var4;
                    g7gVar3 = m58VarP116;
                    l26Var5 = l26Var4;
                    j09Var4 = j09Var2;
                    j7 = j3;
                    i11 = 8388608;
                } else {
                    if (i14 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i15 != 0) {
                        j3 = y72.j;
                    }
                    long jB117 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    m58 m58VarP117 = fdc.p(l46Var);
                    i10 = i3 & (-8065);
                    if (i4 != 0) {
                        l26Var4 = vfh.d;
                    } else {
                        l26Var4 = l26Var2;
                    }
                    if (i6 != 0) {
                        n26Var4 = vfh.e;
                    } else {
                        n26Var4 = n26Var2;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    z5 = z2;
                    j6 = jB117;
                    n26Var5 = n26Var4;
                    g7gVar3 = m58VarP117;
                    l26Var5 = l26Var4;
                    j09Var4 = j09Var2;
                    j7 = j3;
                    i11 = 8388608;
                }
                l46Var.s();
                if ((29360128 & i10) == i11) {
                }
                objR = l46Var.R();
                i12 = 6;
                if (z6) {
                    objR = new c20(i12, x16Var);
                    l46Var.p0(objR);
                } else {
                    objR = new c20(i12, x16Var);
                    l46Var.p0(objR);
                }
                c(j09Var4, j7, j6, g7gVar3, l26Var5, n26Var5, af1.b0(-1854358705, new hc(j6, feg.c((x16) objR, l46Var, 6), z5), l46Var), l46Var, (i10 & 14) | 1572864 | (i10 & 112) | (57344 & i10) | (458752 & i10), 0);
                z4 = z5;
                j09Var3 = j09Var4;
                j5 = j7;
                j4 = j6;
                g7gVar2 = g7gVar3;
                l26Var3 = l26Var5;
                n26Var3 = n26Var5;
            } else {
                l46Var.Z();
                j4 = j2;
                j09Var3 = j09Var2;
                j5 = j3;
                l26Var3 = l26Var2;
                n26Var3 = n26Var2;
                z4 = z2;
                g7gVar2 = g7gVar;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: nb0
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        pa7.d(j09Var3, j5, j4, g7gVar2, l26Var3, n26Var3, z4, x16Var, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 196608;
        n26Var2 = n26Var;
        i8 = i2 & 64;
        if (i8 != 0) {
            if ((i & 1572864) == 0) {
                z2 = z;
                if (l46Var.h(z2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((i & 12582912) == 0) {
                if (l46Var.i(x16Var)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i15 != 0) {
                        j3 = y72.j;
                    }
                    long jB118 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    m58 m58VarP118 = fdc.p(l46Var);
                    i10 = i3 & (-8065);
                    if (i4 != 0) {
                        l26Var4 = vfh.d;
                    } else {
                        l26Var4 = l26Var2;
                    }
                    if (i6 != 0) {
                        n26Var4 = vfh.e;
                    } else {
                        n26Var4 = n26Var2;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    z5 = z2;
                    j6 = jB118;
                    n26Var5 = n26Var4;
                    g7gVar3 = m58VarP118;
                    l26Var5 = l26Var4;
                    j09Var4 = j09Var2;
                    j7 = j3;
                    i11 = 8388608;
                } else {
                    if (i14 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i15 != 0) {
                        j3 = y72.j;
                    }
                    long jB119 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                    m58 m58VarP119 = fdc.p(l46Var);
                    i10 = i3 & (-8065);
                    if (i4 != 0) {
                        l26Var4 = vfh.d;
                    } else {
                        l26Var4 = l26Var2;
                    }
                    if (i6 != 0) {
                        n26Var4 = vfh.e;
                    } else {
                        n26Var4 = n26Var2;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    z5 = z2;
                    j6 = jB119;
                    n26Var5 = n26Var4;
                    g7gVar3 = m58VarP119;
                    l26Var5 = l26Var4;
                    j09Var4 = j09Var2;
                    j7 = j3;
                    i11 = 8388608;
                }
                l46Var.s();
                if ((29360128 & i10) == i11) {
                }
                objR = l46Var.R();
                i12 = 6;
                if (z6) {
                    objR = new c20(i12, x16Var);
                    l46Var.p0(objR);
                } else {
                    objR = new c20(i12, x16Var);
                    l46Var.p0(objR);
                }
                c(j09Var4, j7, j6, g7gVar3, l26Var5, n26Var5, af1.b0(-1854358705, new hc(j6, feg.c((x16) objR, l46Var, 6), z5), l46Var), l46Var, (i10 & 14) | 1572864 | (i10 & 112) | (57344 & i10) | (458752 & i10), 0);
                z4 = z5;
                j09Var3 = j09Var4;
                j5 = j7;
                j4 = j6;
                g7gVar2 = g7gVar3;
                l26Var3 = l26Var5;
                n26Var3 = n26Var5;
            } else {
                l46Var.Z();
                j4 = j2;
                j09Var3 = j09Var2;
                j5 = j3;
                l26Var3 = l26Var2;
                n26Var3 = n26Var2;
                z4 = z2;
                g7gVar2 = g7gVar;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: nb0
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        pa7.d(j09Var3, j5, j4, g7gVar2, l26Var3, n26Var3, z4, x16Var, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 1572864;
        z2 = z;
        if ((i & 12582912) == 0) {
            if (l46Var.i(x16Var)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i3 |= i13;
        }
        if ((i3 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i3 & 1, z3)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    j09Var2 = g09.a;
                }
                if (i15 != 0) {
                    j3 = y72.j;
                }
                long jB1110 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                m58 m58VarP1110 = fdc.p(l46Var);
                i10 = i3 & (-8065);
                if (i4 != 0) {
                    l26Var4 = vfh.d;
                } else {
                    l26Var4 = l26Var2;
                }
                if (i6 != 0) {
                    n26Var4 = vfh.e;
                } else {
                    n26Var4 = n26Var2;
                }
                if (i8 != 0) {
                    z2 = true;
                }
                z5 = z2;
                j6 = jB1110;
                n26Var5 = n26Var4;
                g7gVar3 = m58VarP1110;
                l26Var5 = l26Var4;
                j09Var4 = j09Var2;
                j7 = j3;
                i11 = 8388608;
            } else {
                if (i14 != 0) {
                    j09Var2 = g09.a;
                }
                if (i15 != 0) {
                    j3 = y72.j;
                }
                long jB1111 = y72.b(((m82) l46Var.k(o82.a)).q, 0.88f);
                m58 m58VarP1111 = fdc.p(l46Var);
                i10 = i3 & (-8065);
                if (i4 != 0) {
                    l26Var4 = vfh.d;
                } else {
                    l26Var4 = l26Var2;
                }
                if (i6 != 0) {
                    n26Var4 = vfh.e;
                } else {
                    n26Var4 = n26Var2;
                }
                if (i8 != 0) {
                    z2 = true;
                }
                z5 = z2;
                j6 = jB1111;
                n26Var5 = n26Var4;
                g7gVar3 = m58VarP1111;
                l26Var5 = l26Var4;
                j09Var4 = j09Var2;
                j7 = j3;
                i11 = 8388608;
            }
            l46Var.s();
            if ((29360128 & i10) == i11) {
            }
            objR = l46Var.R();
            i12 = 6;
            if (z6) {
                objR = new c20(i12, x16Var);
                l46Var.p0(objR);
            } else {
                objR = new c20(i12, x16Var);
                l46Var.p0(objR);
            }
            c(j09Var4, j7, j6, g7gVar3, l26Var5, n26Var5, af1.b0(-1854358705, new hc(j6, feg.c((x16) objR, l46Var, 6), z5), l46Var), l46Var, (i10 & 14) | 1572864 | (i10 & 112) | (57344 & i10) | (458752 & i10), 0);
            z4 = z5;
            j09Var3 = j09Var4;
            j5 = j7;
            j4 = j6;
            g7gVar2 = g7gVar3;
            l26Var3 = l26Var5;
            n26Var3 = n26Var5;
        } else {
            l46Var.Z();
            j4 = j2;
            j09Var3 = j09Var2;
            j5 = j3;
            l26Var3 = l26Var2;
            n26Var3 = n26Var2;
            z4 = z2;
            g7gVar2 = g7gVar;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: nb0
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pa7.d(j09Var3, j5, j4, g7gVar2, l26Var3, n26Var3, z4, x16Var, (l46) obj, k99.P(i | 1), i2);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x013d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    public static final Object d0(File file, Context context, bi biVar, zn2 zn2Var) throws Throwable {
        h8d h8dVar;
        ContentResolver contentResolver;
        Throwable th;
        imb imbVar;
        mmb mmbVar;
        ContentResolver contentResolver2;
        mmb mmbVar2;
        pv2 pv2VarI;
        j8d j8dVar;
        if (zn2Var instanceof h8d) {
            h8dVar = (h8d) zn2Var;
            int i = h8dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                h8dVar.label = i - Integer.MIN_VALUE;
            } else {
                h8dVar = new h8d(zn2Var);
            }
        } else {
            h8dVar = new h8d(zn2Var);
        }
        Object objP0 = h8dVar.result;
        ?? r2 = h8dVar.label;
        bw2 bw2Var = bw2.a;
        try {
            if (r2 == 0) {
                mmb mmbVarD = ks0.d(objP0);
                mmb mmbVar3 = new mmb();
                imbVar = new imb();
                ContentResolver contentResolver3 = context.getContentResolver();
                try {
                    js3 js3Var = ga4.a;
                    hr3 hr3Var = hr3.c;
                    i8d i8dVar = new i8d(file, contentResolver3, mmbVarD, biVar, mmbVar3, context, null);
                    mmbVar = mmbVar3;
                    try {
                        h8dVar.L$0 = null;
                        h8dVar.L$1 = null;
                        h8dVar.L$2 = null;
                        h8dVar.L$3 = mmbVarD;
                        h8dVar.L$4 = mmbVar;
                        h8dVar.L$5 = imbVar;
                        h8dVar.L$6 = contentResolver3;
                        h8dVar.label = 1;
                        objP0 = ynb.p0(hr3Var, i8dVar, h8dVar);
                        if (objP0 != bw2Var) {
                            contentResolver2 = contentResolver3;
                            mmbVar2 = mmbVarD;
                        }
                    } catch (CancellationException e2) {
                        e = e2;
                        throw e;
                    } catch (Exception e3) {
                        e = e3;
                        contentResolver2 = contentResolver3;
                        mmbVar2 = mmbVarD;
                        hf8.Q.getClass();
                        ef8.a("ShareImageFile").c("Failed to save image file to MediaStore", e);
                        if (!imbVar.element) {
                            fg9 fg9Var = fg9.b;
                            js3 js3Var2 = ga4.a;
                            hr3 hr3Var2 = hr3.c;
                            fg9Var.getClass();
                            pv2VarI = i7h.I(fg9Var, hr3Var2);
                            j8dVar = new j8d(mmbVar2, mmbVar, contentResolver2, null);
                            h8dVar.L$0 = null;
                            h8dVar.L$1 = null;
                            h8dVar.L$2 = null;
                            h8dVar.L$3 = null;
                            h8dVar.L$4 = null;
                            h8dVar.L$5 = null;
                            h8dVar.L$6 = null;
                            h8dVar.L$7 = null;
                            h8dVar.label = 3;
                            if (ynb.p0(pv2VarI, j8dVar, h8dVar) == bw2Var) {
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        contentResolver = contentResolver3;
                        if (imbVar.element) {
                            throw th;
                        }
                        fg9 fg9Var2 = fg9.b;
                        js3 js3Var3 = ga4.a;
                        hr3 hr3Var3 = hr3.c;
                        fg9Var2.getClass();
                        pv2 pv2VarI2 = i7h.I(fg9Var2, hr3Var3);
                        j8d j8dVar2 = new j8d(mmbVarD, mmbVar, contentResolver, null);
                        h8dVar.L$0 = null;
                        h8dVar.L$1 = null;
                        h8dVar.L$2 = null;
                        h8dVar.L$3 = null;
                        h8dVar.L$4 = null;
                        h8dVar.L$5 = null;
                        h8dVar.L$6 = null;
                        h8dVar.L$7 = th;
                        h8dVar.label = 4;
                        if (ynb.p0(pv2VarI2, j8dVar2, h8dVar) != bw2Var) {
                            throw th;
                        }
                    }
                } catch (CancellationException e4) {
                    e = e4;
                } catch (Exception e5) {
                    e = e5;
                    mmbVar = mmbVar3;
                } catch (Throwable th3) {
                    th = th3;
                    mmbVar = mmbVar3;
                }
                return bw2Var;
            }
            if (r2 != 1) {
                if (r2 == 2) {
                    Object obj = h8dVar.L$7;
                    jzb.q(objP0);
                    return obj;
                }
                if (r2 == 3) {
                    jzb.q(objP0);
                    return null;
                }
                if (r2 != 4) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th4 = (Throwable) h8dVar.L$7;
                jzb.q(objP0);
                throw th4;
            }
            contentResolver2 = (ContentResolver) h8dVar.L$6;
            imbVar = (imb) h8dVar.L$5;
            mmbVar = (mmb) h8dVar.L$4;
            mmbVar2 = (mmb) h8dVar.L$3;
            try {
                jzb.q(objP0);
                contentResolver2 = contentResolver2;
            } catch (CancellationException e6) {
                throw e6;
            } catch (Exception e7) {
                e = e7;
                hf8.Q.getClass();
                ef8.a("ShareImageFile").c("Failed to save image file to MediaStore", e);
                if (!imbVar.element) {
                    fg9 fg9Var3 = fg9.b;
                    js3 js3Var4 = ga4.a;
                    hr3 hr3Var4 = hr3.c;
                    fg9Var3.getClass();
                    pv2VarI = i7h.I(fg9Var3, hr3Var4);
                    j8dVar = new j8d(mmbVar2, mmbVar, contentResolver2, null);
                    h8dVar.L$0 = null;
                    h8dVar.L$1 = null;
                    h8dVar.L$2 = null;
                    h8dVar.L$3 = null;
                    h8dVar.L$4 = null;
                    h8dVar.L$5 = null;
                    h8dVar.L$6 = null;
                    h8dVar.L$7 = null;
                    h8dVar.label = 3;
                    if (ynb.p0(pv2VarI, j8dVar, h8dVar) == bw2Var) {
                        return bw2Var;
                    }
                }
                return null;
            }
            imbVar.element = true;
            return objP0;
        } catch (Throwable th5) {
            contentResolver = r2;
            th = th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00da  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void e(e83 e83Var, boolean z, a26 a26Var, x16 x16Var, x16 x16Var2, String str, dd2 dd2Var, l46 l46Var, int i, int i2) {
        int i3;
        String str2;
        dd2 dd2Var2;
        boolean z2;
        String str3;
        ojb ojbVarV;
        String str4;
        int i4;
        e83Var.getClass();
        a26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-2000840155);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? l46Var.g(e83Var) : l46Var.i(e83Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i3 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i3 |= l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((196608 & i) == 0) {
                str2 = str;
                i3 |= l46Var.g(str2) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                dd2Var2 = dd2Var;
                if (l46Var.i(dd2Var2)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            } else {
                dd2Var2 = dd2Var;
            }
            if ((599187 & i3) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i3 & 1, z2)) {
                if (i5 != 0) {
                    str4 = "onboarding-reminder-cta";
                } else {
                    str4 = str2;
                }
                lmg.J(b.c, af1.b0(-605424434, new dj3(dd2Var2, str4, e83Var, z, x16Var, x16Var2, a26Var), l46Var), l46Var, 54);
                str3 = str4;
            } else {
                l46Var.Z();
                str3 = str2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new c61(e83Var, z, a26Var, x16Var, x16Var2, str3, dd2Var, i, i2);
            }
        }
        i3 |= 196608;
        str2 = str;
        if ((1572864 & i) == 0) {
            dd2Var2 = dd2Var;
            if (l46Var.i(dd2Var2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        } else {
            dd2Var2 = dd2Var;
        }
        if ((599187 & i3) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var.W(i3 & 1, z2)) {
            if (i5 != 0) {
                str4 = "onboarding-reminder-cta";
            } else {
                str4 = str2;
            }
            lmg.J(b.c, af1.b0(-605424434, new dj3(dd2Var2, str4, e83Var, z, x16Var, x16Var2, a26Var), l46Var), l46Var, 54);
            str3 = str4;
        } else {
            l46Var.Z();
            str3 = str2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new c61(e83Var, z, a26Var, x16Var, x16Var2, str3, dd2Var, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object e0(File file, Context context, zn2 zn2Var) throws Throwable {
        k8d k8dVar;
        imb imbVar;
        Throwable th;
        mmb mmbVar;
        mmb mmbVar2;
        Exception e2;
        imb imbVar2;
        pv2 pv2VarI;
        m8d m8dVar;
        if (zn2Var instanceof k8d) {
            k8dVar = (k8d) zn2Var;
            int i = k8dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                k8dVar.label = i - Integer.MIN_VALUE;
            } else {
                k8dVar = new k8d(zn2Var);
            }
        } else {
            k8dVar = new k8d(zn2Var);
        }
        Object obj = k8dVar.result;
        int i2 = k8dVar.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                mmb mmbVarD = ks0.d(obj);
                imb imbVar3 = new imb();
                try {
                    js3 js3Var = ga4.a;
                    hr3 hr3Var = hr3.c;
                    l8d l8dVar = new l8d(file, context, mmbVarD, null);
                    k8dVar.L$0 = null;
                    k8dVar.L$1 = null;
                    k8dVar.L$2 = mmbVarD;
                    k8dVar.L$3 = imbVar3;
                    k8dVar.label = 1;
                    Object objP0 = ynb.p0(hr3Var, l8dVar, k8dVar);
                    if (objP0 != bw2Var) {
                        mmbVar2 = mmbVarD;
                        obj = objP0;
                        imbVar2 = imbVar3;
                    }
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    mmbVar2 = mmbVarD;
                    e2 = e4;
                    imbVar2 = imbVar3;
                    hf8.Q.getClass();
                    ef8.a("ShareImageFile").c("Failed to copy image file for sharing", e2);
                    if (!imbVar2.element) {
                        fg9 fg9Var = fg9.b;
                        js3 js3Var2 = ga4.a;
                        hr3 hr3Var2 = hr3.c;
                        fg9Var.getClass();
                        pv2VarI = i7h.I(fg9Var, hr3Var2);
                        m8dVar = new m8d(mmbVar2, null);
                        k8dVar.L$0 = null;
                        k8dVar.L$1 = null;
                        k8dVar.L$2 = null;
                        k8dVar.L$3 = null;
                        k8dVar.L$4 = null;
                        k8dVar.label = 3;
                        if (ynb.p0(pv2VarI, m8dVar, k8dVar) == bw2Var) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    mmbVar = mmbVarD;
                    imbVar = imbVar3;
                    if (imbVar.element) {
                        throw th;
                    }
                    fg9 fg9Var2 = fg9.b;
                    js3 js3Var3 = ga4.a;
                    hr3 hr3Var3 = hr3.c;
                    fg9Var2.getClass();
                    pv2 pv2VarI2 = i7h.I(fg9Var2, hr3Var3);
                    m8d m8dVar2 = new m8d(mmbVar, null);
                    k8dVar.L$0 = null;
                    k8dVar.L$1 = null;
                    k8dVar.L$2 = null;
                    k8dVar.L$3 = null;
                    k8dVar.L$4 = th;
                    k8dVar.label = 4;
                    if (ynb.p0(pv2VarI2, m8dVar2, k8dVar) != bw2Var) {
                        throw th;
                    }
                }
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    Object obj2 = k8dVar.L$4;
                    jzb.q(obj);
                    return obj2;
                }
                if (i2 == 3) {
                    jzb.q(obj);
                    return null;
                }
                if (i2 != 4) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th3 = (Throwable) k8dVar.L$4;
                jzb.q(obj);
                throw th3;
            }
            imbVar2 = (imb) k8dVar.L$3;
            mmbVar2 = (mmb) k8dVar.L$2;
            try {
                jzb.q(obj);
                imbVar2 = imbVar2;
            } catch (CancellationException e5) {
                throw e5;
            } catch (Exception e6) {
                e2 = e6;
                hf8.Q.getClass();
                ef8.a("ShareImageFile").c("Failed to copy image file for sharing", e2);
                if (!imbVar2.element) {
                    fg9 fg9Var3 = fg9.b;
                    js3 js3Var4 = ga4.a;
                    hr3 hr3Var4 = hr3.c;
                    fg9Var3.getClass();
                    pv2VarI = i7h.I(fg9Var3, hr3Var4);
                    m8dVar = new m8d(mmbVar2, null);
                    k8dVar.L$0 = null;
                    k8dVar.L$1 = null;
                    k8dVar.L$2 = null;
                    k8dVar.L$3 = null;
                    k8dVar.L$4 = null;
                    k8dVar.label = 3;
                    if (ynb.p0(pv2VarI, m8dVar, k8dVar) == bw2Var) {
                        return bw2Var;
                    }
                }
                return null;
            }
            imbVar2.element = true;
            return obj;
        } catch (Throwable th4) {
            imbVar = file;
            th = th4;
            mmbVar = context;
        }
    }

    public static final void f(c4c c4cVar, l46 l46Var, int i) {
        int i2;
        l46Var.h0(1642175075);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (l46Var.g(c4cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            long jB = y72.b(b4c.c(c4cVar, l46Var), 0.2f);
            l46Var.f0(1877252904);
            sw3 sw3Var = (sw3) l46Var.k(zg2.h);
            wue wueVar = q4c.c(q4c.b(c4cVar, l46Var)).a;
            wueVar.getClass();
            float F = sw3Var.F(wueVar.a);
            l46Var.r(false);
            s21.a(tm7.o(b.d(b.c(ynb.d0(0.0f, F, 0.0f, F, 5, g09.a), 1.0f), 1.0f), jB, g21.f), l46Var, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new st5(c4cVar, i, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0137  */
    /* JADX WARN: Code duplicated, block: B:59:0x0184  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v2 */
    public static final Object f0(File file, Context context, String str, zn2 zn2Var) throws Throwable {
        n8d n8dVar;
        Context context2;
        String str2;
        File file2;
        imb imbVar;
        Boolean bool;
        pv2 pv2VarI;
        p8d p8dVar;
        pv2 pv2VarI2;
        p8d p8dVar2;
        if (zn2Var instanceof n8d) {
            n8dVar = (n8d) zn2Var;
            int i = n8dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                n8dVar.label = i - Integer.MIN_VALUE;
            } else {
                n8dVar = new n8d(zn2Var);
            }
        } else {
            n8dVar = new n8d(zn2Var);
        }
        Object obj = n8dVar.result;
        imb imbVar2 = n8dVar.label;
        File file3 = 2;
        bw2 bw2Var = bw2.a;
        try {
            if (imbVar2 == 0) {
                jzb.q(obj);
                n8dVar.L$0 = null;
                n8dVar.L$1 = context;
                n8dVar.L$2 = str;
                n8dVar.label = 1;
                Object objE0 = e0(file, context, n8dVar);
                if (objE0 != bw2Var) {
                    context2 = context;
                    str2 = str;
                    obj = objE0;
                }
                return bw2Var;
            }
            if (imbVar2 == 1) {
                String str3 = (String) n8dVar.L$2;
                Context context3 = (Context) n8dVar.L$1;
                jzb.q(obj);
                str2 = str3;
                context2 = context3;
            } else {
                if (imbVar2 != 2) {
                    if (imbVar2 == 3) {
                        Object obj2 = n8dVar.L$6;
                        jzb.q(obj);
                        return obj2;
                    }
                    if (imbVar2 == 4) {
                        Boolean bool2 = (Boolean) n8dVar.L$6;
                        jzb.q(obj);
                        return bool2;
                    }
                    if (imbVar2 != 5) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th = (Throwable) n8dVar.L$5;
                    jzb.q(obj);
                    throw th;
                }
                imbVar = (imb) n8dVar.L$4;
                file2 = (File) n8dVar.L$3;
                try {
                    jzb.q(obj);
                    if (!imbVar.element) {
                        fg9 fg9Var = fg9.b;
                        js3 js3Var = ga4.a;
                        hr3 hr3Var = hr3.c;
                        fg9Var.getClass();
                        pv2VarI2 = i7h.I(fg9Var, hr3Var);
                        p8dVar2 = new p8d(file2, null);
                        n8dVar.L$0 = null;
                        n8dVar.L$1 = null;
                        n8dVar.L$2 = null;
                        n8dVar.L$3 = null;
                        n8dVar.L$4 = null;
                        n8dVar.L$5 = null;
                        n8dVar.L$6 = obj;
                        n8dVar.label = 3;
                        if (ynb.p0(pv2VarI2, p8dVar2, n8dVar) == bw2Var) {
                            return bw2Var;
                        }
                    }
                    return obj;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception e3) {
                    e = e3;
                    hf8.Q.getClass();
                    ef8.a("ShareImageFile").c("Failed to share image file", e);
                    bool = Boolean.FALSE;
                    if (!imbVar.element) {
                        return bool;
                    }
                    fg9 fg9Var2 = fg9.b;
                    js3 js3Var2 = ga4.a;
                    hr3 hr3Var2 = hr3.c;
                    fg9Var2.getClass();
                    pv2VarI = i7h.I(fg9Var2, hr3Var2);
                    p8dVar = new p8d(file2, null);
                    n8dVar.L$0 = null;
                    n8dVar.L$1 = null;
                    n8dVar.L$2 = null;
                    n8dVar.L$3 = null;
                    n8dVar.L$4 = null;
                    n8dVar.L$5 = null;
                    n8dVar.L$6 = bool;
                    n8dVar.label = 4;
                    if (ynb.p0(pv2VarI, p8dVar, n8dVar) == bw2Var) {
                        return bool;
                    }
                }
            }
            File file4 = (File) obj;
            if (file4 == null) {
                return Boolean.FALSE;
            }
            imb imbVar3 = new imb();
            try {
                Uri uriC = FileProvider.c(context2, context2.getPackageName() + ".contentprovider", file4);
                js3 js3Var3 = ga4.a;
                wg6 wg6Var = mk8.a;
                o8d o8dVar = new o8d(context2, uriC, str2, imbVar3, null);
                n8dVar.L$0 = null;
                n8dVar.L$1 = null;
                n8dVar.L$2 = null;
                n8dVar.L$3 = file4;
                n8dVar.L$4 = imbVar3;
                n8dVar.L$5 = null;
                n8dVar.label = 2;
                Object objP0 = ynb.p0(wg6Var, o8dVar, n8dVar);
                if (objP0 != bw2Var) {
                    file2 = file4;
                    imbVar = imbVar3;
                    obj = objP0;
                    if (!imbVar.element) {
                        fg9 fg9Var3 = fg9.b;
                        js3 js3Var4 = ga4.a;
                        hr3 hr3Var3 = hr3.c;
                        fg9Var3.getClass();
                        pv2VarI2 = i7h.I(fg9Var3, hr3Var3);
                        p8dVar2 = new p8d(file2, null);
                        n8dVar.L$0 = null;
                        n8dVar.L$1 = null;
                        n8dVar.L$2 = null;
                        n8dVar.L$3 = null;
                        n8dVar.L$4 = null;
                        n8dVar.L$5 = null;
                        n8dVar.L$6 = obj;
                        n8dVar.label = 3;
                        if (ynb.p0(pv2VarI2, p8dVar2, n8dVar) == bw2Var) {
                        }
                    }
                    return obj;
                }
            } catch (CancellationException e4) {
                throw e4;
            } catch (Exception e5) {
                e = e5;
                file2 = file4;
                imbVar = imbVar3;
                hf8.Q.getClass();
                ef8.a("ShareImageFile").c("Failed to share image file", e);
                bool = Boolean.FALSE;
                if (!imbVar.element) {
                    return bool;
                }
                fg9 fg9Var4 = fg9.b;
                js3 js3Var5 = ga4.a;
                hr3 hr3Var4 = hr3.c;
                fg9Var4.getClass();
                pv2VarI = i7h.I(fg9Var4, hr3Var4);
                p8dVar = new p8d(file2, null);
                n8dVar.L$0 = null;
                n8dVar.L$1 = null;
                n8dVar.L$2 = null;
                n8dVar.L$3 = null;
                n8dVar.L$4 = null;
                n8dVar.L$5 = null;
                n8dVar.L$6 = bool;
                n8dVar.label = 4;
                if (ynb.p0(pv2VarI, p8dVar, n8dVar) == bw2Var) {
                    return bool;
                }
            } catch (Throwable th2) {
                th = th2;
                file3 = file4;
                imbVar2 = imbVar3;
                if (imbVar2.element) {
                    throw th;
                }
                fg9 fg9Var5 = fg9.b;
                js3 js3Var6 = ga4.a;
                hr3 hr3Var5 = hr3.c;
                fg9Var5.getClass();
                pv2 pv2VarI3 = i7h.I(fg9Var5, hr3Var5);
                p8d p8dVar3 = new p8d(file3, null);
                n8dVar.L$0 = null;
                n8dVar.L$1 = null;
                n8dVar.L$2 = null;
                n8dVar.L$3 = null;
                n8dVar.L$4 = null;
                n8dVar.L$5 = th;
                n8dVar.label = 5;
                if (ynb.p0(pv2VarI3, p8dVar3, n8dVar) != bw2Var) {
                    throw th;
                }
            }
            return bw2Var;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final void g(int i, l46 l46Var, j09 j09Var, String str) {
        j09 j09Var2;
        l46 l46Var2 = l46Var;
        String str2 = str;
        str2.getClass();
        l46Var2.h0(-420524208);
        int i2 = i | 6 | (l46Var2.g(str2) ? 32 : 16);
        int i3 = 0;
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            t7c t7cVarA = s7c.a(new uc0(12.0f, true, new qc0(i3)), ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var);
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
            feg.j(od4.A(R.drawable.invitation_line_left, 0, l46Var2), null, null, null, null, 0.0f, null, l46Var2, 56, 124);
            mue mueVar = pue.a;
            nte.b(str, null, ((m82) l46Var2.k(o82.a)).a, 0L, new ar5(600), cr5.c, 0L, null, null, 0L, 0, false, 0, 0, null, pue.p(l46Var2), l46Var2, ((i2 >> 3) & 14) | 1572864, 0, 130874);
            str2 = str;
            l46Var2 = l46Var2;
            feg.j(od4.A(R.drawable.invitation_line_right, 0, l46Var2), null, null, null, null, 0.0f, null, l46Var2, 56, 124);
            l46Var2.r(true);
            j09Var2 = g09Var;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p8(j09Var2, str2, i, 6);
        }
    }

    public static void g0(String str) {
        sef sefVar = new sef(ib8.j("lateinit property ", str, " has not been initialized"));
        c0(sefVar, pa7.class.getName());
        throw sefVar;
    }

    public static final void h(String str, x16 x16Var, j09 j09Var, float f2, float f3, float f4, boolean z, mue mueVar, y72 y72Var, xw9 xw9Var, boolean z2, l46 l46Var, int i, int i2) {
        int i3;
        int i4;
        xw9 xw9Var2;
        float f5;
        y6c y6cVar;
        j09 j09VarQ;
        boolean z3;
        l46 l46Var2 = l46Var;
        str.getClass();
        x16Var.getClass();
        l46Var2.h0(-1546291275);
        if ((i & 6) == 0) {
            i3 = (l46Var2.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var2.i(x16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= l46Var2.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i3 |= l46Var2.g(null) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i3 |= l46Var2.d(f2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i3 |= l46Var2.d(f3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= l46Var2.d(f4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= l46Var2.h(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= l46Var2.g(mueVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= l46Var2.g(y72Var) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (l46Var2.g(xw9Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var2.h(z2) ? 32 : 16;
        }
        int i6 = i4;
        if (l46Var2.W(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 19) == 18) ? false : true)) {
            l46Var2.b0();
            if ((i & 1) != 0 && !l46Var2.C()) {
                l46Var2.Z();
            }
            l46Var2.s();
            gh6 gh6VarW0 = kj0.w0(l46Var2);
            y6c y6cVarB = a7c.b(f2);
            p27 p27VarC0 = af1.c0("star_animation", l46Var2, 0);
            pd4 pd4Var = hs4.c;
            x6f x6fVarT = b21.T(2000, 0, pd4Var, 2);
            lrb lrbVar = lrb.b;
            m27 m27VarW = af1.w(p27VarC0, 0.8f, 1.2f, b21.D(x6fVarT, lrbVar, 4), "star_scale", l46Var2, 29112, 0);
            m27 m27VarW2 = af1.w(p27VarC0, 0.2f, 1.0f, b21.D(b21.T(1000, 0, pd4Var, 2), lrbVar, 4), "star_alpha", l46Var, 29112, 0);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                c78 c78VarW = t72.w();
                Float fValueOf = Float.valueOf(0.3f);
                c78VarW.add(new iy9(fValueOf, fValueOf));
                Float fValueOf2 = Float.valueOf(0.05f);
                c78VarW.add(new iy9(fValueOf2, Float.valueOf(-0.2f)));
                c78VarW.add(new iy9(Float.valueOf(0.1f), Float.valueOf(0.7f)));
                c78VarW.add(new iy9(fValueOf, Float.valueOf(-0.1f)));
                c78VarW.add(new iy9(fValueOf2, Float.valueOf(-0.3f)));
                objR = c78VarW.n();
                l46Var.p0(objR);
            }
            List list = (List) objR;
            Context context = (Context) l46Var.k(uq.b);
            l46Var.f0(72824105);
            if (z) {
                j09VarQ = rrb.q(j09Var, 12.0f, y6cVarB, abg.c(1081371895), abg.d(4285820151L), 4);
                y6cVar = y6cVarB;
            } else {
                y6cVar = y6cVarB;
                j09VarQ = j09Var;
            }
            j09 j09VarE = oa7.E(ynb.Z(j09VarQ, 6.0f), y6cVar);
            boolean zI = ((i5 & 112) == 32) | ((i6 & 112) == 32) | l46Var.i(gh6VarW0);
            Object objR2 = l46Var.R();
            if (zI || objR2 == i8cVar) {
                objR2 = new j28(z2, gh6VarW0, x16Var, 1);
                l46Var.p0(objR2);
            }
            y6c y6cVar2 = y6cVar;
            j09 j09VarA = b.a(androidx.compose.foundation.b.c(j09VarE, z, null, null, (x16) objR2, 14), f4, f3);
            if (z) {
                l46Var.f0(874562904);
                boolean zI2 = ((i5 & 1879048192) == 536870912) | l46Var.i(list) | l46Var.g(m27VarW2) | l46Var.g(m27VarW);
                Object objR3 = l46Var.R();
                if (zI2 || objR3 == i8cVar) {
                    objR3 = new wg(y72Var, list, m27VarW2, m27VarW, 20);
                    l46Var.p0(objR3);
                }
                j09VarA = b21.u(j09VarA, (a26) objR3);
                z3 = false;
                l46Var.r(false);
            } else {
                z3 = false;
                l46Var.f0(874578854);
                l46Var.r(false);
            }
            l46Var.r(z3);
            xn8 xn8VarC = s21.c(ndb.f, z3);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarA);
            lf2.q.getClass();
            l46Var.j0();
            boolean z4 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z4) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            d31 d31Var = d31.a;
            g09 g09Var = g09.a;
            j09 j09VarP = p(d31Var.b(g09Var), z ? 1.0f : 0.54f);
            boolean zI3 = l46Var.i(context);
            Object objR4 = l46Var.R();
            if (zI3 || objR4 == i8cVar) {
                objR4 = new i06(context, 2);
                l46Var.p0(objR4);
            }
            f5 = f2;
            s21.a(q7c.o(rrb.q(b21.s(j09VarP, (a26) objR4), 1.0f, y6cVar2, abg.c(1088748543), abg.c(1088748543), 4), f5, t72.I(new y72(abg.d(4291671783L)), new y72(abg.d(4294835711L)), new y72(abg.d(4293196799L)), new y72(abg.d(4287996910L)), new y72(abg.d(4294835711L))), 10000), l46Var, 0);
            xw9Var2 = xw9Var;
            j09 j09VarY = ynb.Y(g09Var, xw9Var2);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarY);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            nte.b(str, null, y72.e, 0L, ar5.e, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVar, l46Var, (i5 & 14) | 1573248, (i5 >> 3) & 29360128, 129850);
            l46Var2 = l46Var;
            l46Var2.f0(-2119992485);
            l46Var2.r(false);
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            xw9Var2 = xw9Var;
            f5 = f2;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kk8(str, x16Var, j09Var, f5, f3, f4, z, mueVar, y72Var, xw9Var2, z2, i, i2, 0);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final defpackage.a52 h0(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static final void i(e83 e83Var, boolean z, a26 a26Var, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(1376895883);
        int i2 = i | (l46Var2.g(e83Var) ? 4 : 2) | (l46Var2.h(z) ? 32 : 16) | (l46Var2.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
            ghc ghcVarT = mh3.T(l46Var2);
            j09 j09VarD0 = ynb.d0(0.0f, 12.0f, 0.0f, 0.0f, 13, ynb.b0(24.0f, 0.0f, b.c, 2));
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarD0);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z2 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            rs0.e(0, l46Var2, null, afc.q(R.string.daily_fortune_reminder_multi_title, l46Var2));
            g09 g09Var = g09.a;
            j09 j09VarD1 = ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, g09Var);
            String strQ = afc.q(R.string.daily_fortune_reminder_multi_subtitle, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, j09VarD1, ((e8b) l46Var2.k(l8b.a)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var2), l46Var, 48, 0, 130040);
            l46Var2 = l46Var;
            jgb.m(ynb.d0(0.0f, 16.0f, 0.0f, 0.0f, 13, g09Var), l46Var2, 6);
            j09 j09VarD = b.c(g09Var, 1.0f).D(new jw7(1.0f, true));
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarD);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, xn8VarC);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            jgb.o(e83Var, a26Var, mh3.d0(ynb.b0(0.0f, 8.0f, g09Var, 1), ghcVarT, false, 14), z, l46Var2, (i2 & 14) | ((i2 >> 3) & 112) | ((i2 << 6) & 7168));
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kg(e83Var, z, a26Var, i, 10);
        }
    }

    public static final void i0(List list, zt ztVar) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        List list2 = list;
        zt ztVar2 = ztVar;
        Path path = ztVar2.a;
        Path.FillType fillType = path.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        ztVar2.l();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path.setFillType(fillType2);
        d2a d2aVar = list2.isEmpty() ? l1a.c : (d2a) list2.get(0);
        int size = list2.size();
        float f12 = 0.0f;
        int i = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (i < size) {
            d2a d2aVar2 = (d2a) list2.get(i);
            if (d2aVar2 instanceof l1a) {
                ztVar2.e();
                path = path;
                size = size;
                f12 = f12;
                i = i;
                d2aVar2 = d2aVar2;
                f13 = f17;
                f15 = f13;
                f14 = f18;
                f16 = f14;
            } else {
                if (d2aVar2 instanceof x1a) {
                    x1a x1aVar = (x1a) d2aVar2;
                    float f19 = x1aVar.c;
                    f15 += f19;
                    float f20 = x1aVar.d;
                    f16 += f20;
                    path.rMoveTo(f19, f20);
                    path = path;
                    f17 = f15;
                    f18 = f16;
                } else if (d2aVar2 instanceof p1a) {
                    p1a p1aVar = (p1a) d2aVar2;
                    float f21 = p1aVar.c;
                    float f22 = p1aVar.d;
                    ztVar2.h(f21, f22);
                    f16 = f22;
                    f18 = f16;
                    f15 = f21;
                    f17 = f15;
                } else if (d2aVar2 instanceof w1a) {
                    w1a w1aVar = (w1a) d2aVar2;
                    float f23 = w1aVar.d;
                    float f24 = w1aVar.c;
                    path.rLineTo(f24, f23);
                    f15 += f24;
                    f16 += f23;
                } else if (d2aVar2 instanceof o1a) {
                    o1a o1aVar = (o1a) d2aVar2;
                    float f25 = o1aVar.d;
                    float f26 = o1aVar.c;
                    ztVar2.g(f26, f25);
                    f15 = f26;
                    f16 = f25;
                } else if (d2aVar2 instanceof v1a) {
                    float f27 = ((v1a) d2aVar2).c;
                    path.rLineTo(f27, f12);
                    f15 += f27;
                } else if (d2aVar2 instanceof n1a) {
                    float f28 = ((n1a) d2aVar2).c;
                    ztVar2.g(f28, f16);
                    f15 = f28;
                } else if (d2aVar2 instanceof b2a) {
                    float f29 = ((b2a) d2aVar2).c;
                    path.rLineTo(f12, f29);
                    f16 += f29;
                } else if (d2aVar2 instanceof c2a) {
                    float f30 = ((c2a) d2aVar2).c;
                    ztVar2.g(f15, f30);
                    f16 = f30;
                } else {
                    if (d2aVar2 instanceof u1a) {
                        u1a u1aVar = (u1a) d2aVar2;
                        path.rCubicTo(u1aVar.c, u1aVar.d, u1aVar.e, u1aVar.f, u1aVar.g, u1aVar.h);
                        f4 = u1aVar.e + f15;
                        f5 = u1aVar.f + f16;
                        f15 += u1aVar.g;
                        f11 = u1aVar.h;
                    } else {
                        if (d2aVar2 instanceof m1a) {
                            m1a m1aVar = (m1a) d2aVar2;
                            path.cubicTo(m1aVar.c, m1aVar.d, m1aVar.e, m1aVar.f, m1aVar.g, m1aVar.h);
                            f4 = m1aVar.e;
                            f6 = m1aVar.f;
                            f7 = m1aVar.g;
                            f8 = m1aVar.h;
                        } else if (d2aVar2 instanceof z1a) {
                            if (d2aVar.a) {
                                f9 = f15 - f13;
                                f10 = f16 - f14;
                            } else {
                                f9 = f12;
                                f10 = f9;
                            }
                            z1a z1aVar = (z1a) d2aVar2;
                            path.rCubicTo(f9, f10, z1aVar.c, z1aVar.d, z1aVar.e, z1aVar.f);
                            f4 = z1aVar.c + f15;
                            f5 = z1aVar.d + f16;
                            f15 += z1aVar.e;
                            f11 = z1aVar.f;
                        } else if (d2aVar2 instanceof r1a) {
                            if (d2aVar.a) {
                                f15 = (f15 * 2.0f) - f13;
                                f16 = (2.0f * f16) - f14;
                            }
                            r1a r1aVar = (r1a) d2aVar2;
                            path.cubicTo(f15, f16, r1aVar.c, r1aVar.d, r1aVar.e, r1aVar.f);
                            f4 = r1aVar.c;
                            f6 = r1aVar.d;
                            f7 = r1aVar.e;
                            f8 = r1aVar.f;
                        } else if (d2aVar2 instanceof y1a) {
                            y1a y1aVar = (y1a) d2aVar2;
                            float f31 = y1aVar.f;
                            float f32 = y1aVar.e;
                            float f33 = y1aVar.d;
                            float f34 = y1aVar.c;
                            path.rQuadTo(f34, f33, f32, f31);
                            float f35 = f34 + f15;
                            float f36 = f33 + f16;
                            f15 += f32;
                            f16 += f31;
                            f13 = f35;
                            f14 = f36;
                        } else if (d2aVar2 instanceof q1a) {
                            q1a q1aVar = (q1a) d2aVar2;
                            float f37 = q1aVar.f;
                            float f38 = q1aVar.e;
                            float f39 = q1aVar.d;
                            f4 = q1aVar.c;
                            ztVar2.j(f4, f39, f38, f37);
                            f16 = f37;
                            f15 = f38;
                            f14 = f39;
                            f13 = f4;
                        } else if (d2aVar2 instanceof a2a) {
                            if (d2aVar.b) {
                                f2 = f15 - f13;
                                f3 = f16 - f14;
                            } else {
                                f2 = f12;
                                f3 = f2;
                            }
                            a2a a2aVar = (a2a) d2aVar2;
                            float f40 = a2aVar.d;
                            float f41 = a2aVar.c;
                            path.rQuadTo(f2, f3, f41, f40);
                            f4 = f2 + f15;
                            f5 = f3 + f16;
                            f15 += f41;
                            f16 += f40;
                            f14 = f5;
                            f13 = f4;
                        } else if (d2aVar2 instanceof s1a) {
                            if (d2aVar.b) {
                                f15 = (f15 * 2.0f) - f13;
                                f16 = (2.0f * f16) - f14;
                            }
                            s1a s1aVar = (s1a) d2aVar2;
                            float f42 = s1aVar.d;
                            float f43 = s1aVar.c;
                            ztVar2.j(f15, f16, f43, f42);
                            path = path;
                            size = size;
                            f12 = f12;
                            i = i;
                            f14 = f16;
                            d2aVar2 = d2aVar2;
                            f16 = f42;
                            f13 = f15;
                            f15 = f43;
                        } else if (d2aVar2 instanceof t1a) {
                            t1a t1aVar = (t1a) d2aVar2;
                            float f44 = t1aVar.h + f15;
                            float f45 = t1aVar.i + f16;
                            size = size;
                            f12 = 0.0f;
                            path = path;
                            i = i;
                            O(ztVar, f15, f16, f44, f45, t1aVar.c, t1aVar.d, t1aVar.e, t1aVar.f, t1aVar.g);
                            f13 = f44;
                            f15 = f13;
                            f14 = f45;
                            f16 = f14;
                            d2aVar2 = d2aVar2;
                        } else {
                            path = path;
                            size = size;
                            f12 = f12;
                            i = i;
                            if (!(d2aVar2 instanceof k1a)) {
                                ap.c();
                                return;
                            }
                            k1a k1aVar = (k1a) d2aVar2;
                            float f46 = k1aVar.i;
                            float f47 = k1aVar.h;
                            d2aVar2 = d2aVar2;
                            O(ztVar, f15, f16, f47, f46, k1aVar.c, k1aVar.d, k1aVar.e, k1aVar.f, k1aVar.g);
                            f14 = f46;
                            f16 = f14;
                            f13 = f47;
                            f15 = f13;
                        }
                        path = path;
                        f15 = f7;
                        f16 = f8;
                        f14 = f6;
                        f13 = f4;
                    }
                    f16 += f11;
                    f14 = f5;
                    f13 = f4;
                }
                d2aVar2 = d2aVar2;
            }
            i++;
            list2 = list;
            ztVar2 = ztVar;
            size = size;
            path = path;
            d2aVar = d2aVar2;
            f12 = f12;
        }
    }

    public static final void j(int i, x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        int i3;
        x16 x16Var3;
        Object zh9Var;
        x16 x16Var4 = x16Var2;
        x16Var.getClass();
        x16Var4.getClass();
        l46Var.h0(-633299902);
        int i4 = (l46Var.e(i) ? 4 : 2) | i2 | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var4) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i5 = 0;
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = nfcVarB.b(job.a.b(gpf.class), null, null);
                l46Var.p0(objR);
            }
            gpf gpfVar = (gpf) objR;
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG2 = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == obj) {
                objR2 = nfcVarB2.b(job.a.b(o9.class), null, null);
                l46Var.p0(objR2);
            }
            o9 o9Var = (o9) objR2;
            Integer numValueOf = Integer.valueOf(i);
            int i6 = i4 & 14;
            boolean z = i6 == 4;
            Object objR3 = l46Var.R();
            if (z || objR3 == obj) {
                objR3 = new bi9(i, null);
                l46Var.p0(objR3);
            }
            af1.o((l26) objR3, l46Var, numValueOf);
            boolean z2 = i6 == 4;
            Object objR4 = l46Var.R();
            if (z2 || objR4 == obj) {
                objR4 = tm7.O(i);
                l46Var.p0(objR4);
            }
            ei9 ei9Var = (ei9) objR4;
            int i7 = i4 & 112;
            boolean zI = l46Var.i(gpfVar) | l46Var.i(o9Var) | (i7 == 32);
            Object objR5 = l46Var.R();
            if (zI || objR5 == obj) {
                objR5 = new it3(x16Var, gpfVar, o9Var, 25);
                l46Var.p0(objR5);
            }
            uh9 uh9VarZ = oa7.Z((a26) objR5, ei9Var, l46Var);
            boolean zI2 = l46Var.i(gpfVar) | l46Var.i(o9Var) | (i7 == 32);
            Object objR6 = l46Var.R();
            if (zI2 || objR6 == obj) {
                objR6 = new yh9(x16Var, gpfVar, o9Var, i5);
                l46Var.p0(objR6);
            }
            uo uoVarY = oa7.Y(ei9Var, (x16) objR6, l46Var, 0);
            boolean zG3 = ((i4 & 896) == 256) | l46Var.g(uh9VarZ) | l46Var.g(gpfVar) | (i7 == 32) | l46Var.g(uoVarY);
            Object objR7 = l46Var.R();
            if (zG3 || objR7 == obj) {
                zh9Var = new zh9(i, uh9VarZ, x16Var4, x16Var, gpfVar, o9Var, uoVarY);
                l46Var.p0(zh9Var);
            } else {
                zh9Var = objR7;
            }
            x16 x16Var5 = (x16) zh9Var;
            int i8 = (i6 == 4 ? 1 : 0) | (i7 == 32 ? 1 : 0);
            Object objR8 = l46Var.R();
            if (i8 != 0 || objR8 == obj) {
                objR8 = new m83(i, 2, x16Var);
                l46Var.p0(objR8);
            }
            t72.b((x16) objR8, new s84(false, false, false, false, 231), af1.b0(1060567641, new ia6(i3, x16Var3, x16Var5), l46Var), l46Var, 432, 0);
        } else {
            i3 = i;
            x16Var4 = x16Var4;
            x16Var3 = x16Var;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ia6(i3, i2, x16Var3, x16Var4);
        }
    }

    public static final tjd j0(tt7 tt7Var) {
        tt7Var.getClass();
        jgf jgfVarK0 = tt7Var.k0();
        if (jgfVarK0 instanceof bj5) {
            return ((bj5) jgfVarK0).c;
        }
        if (jgfVarK0 instanceof tjd) {
            return (tjd) jgfVarK0;
        }
        ap.c();
        return null;
    }

    public static final void k(x16 x16Var, l46 l46Var, int i) {
        x16Var.getClass();
        l46Var.h0(-529102972);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            Object[] objArr = new Object[0];
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = new fk8(24);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) vfh.I(objArr, (x16) objR, l46Var, 48);
            Object[] objArr2 = new Object[0];
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = new fk8(29);
                l46Var.p0(objR2);
            }
            e89 e89Var2 = (e89) vfh.I(objArr2, (x16) objR2, l46Var, 48);
            e83 e83Var = new e83(((Boolean) e89Var.getValue()).booleanValue(), ((Boolean) e89Var2.getValue()).booleanValue());
            boolean zG = l46Var.g(e89Var) | l46Var.g(e89Var2);
            Object objR3 = l46Var.R();
            if (zG || objR3 == obj) {
                objR3 = new ls2(e89Var, e89Var2, 3);
                l46Var.p0(objR3);
            }
            e(e83Var, false, (a26) objR3, x16Var, x16Var, null, af1.b0(514784812, new fi4(16, x16Var), l46Var), l46Var, ((i2 << 9) & 7168) | 1572912 | ((i2 << 12) & 57344), 32);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fi4(i, 17, x16Var);
        }
    }

    public static final void l(final x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        x16 x16Var3;
        x16 x16Var4;
        Object ms2Var;
        aw2 aw2Var;
        final g83 g83Var;
        boolean z;
        boolean z2;
        final e83 e83Var;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-1901457628);
        int i2 = i | (l46Var.i(x16Var) ? 4 : 2) | (l46Var.i(x16Var2) ? 32 : 16);
        final int i3 = 1;
        final int i4 = 0;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            final Context context = (Context) l46Var.k(uq.b);
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = nfcVarB.b(job.a.b(gpf.class), null, null);
                l46Var.p0(objR);
            }
            final gpf gpfVar = (gpf) objR;
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG2 = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == i8cVar) {
                objR2 = nfcVarB2.b(job.a.b(o9.class), null, null);
                l46Var.p0(objR2);
            }
            final o9 o9Var = (o9) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = af1.E(l46Var);
                l46Var.p0(objR3);
            }
            aw2 aw2Var2 = (aw2) objR3;
            Object objR4 = l46Var.R();
            if (objR4 == i8cVar) {
                y93 y93Var = y93.a;
                objR4 = ndc.d(d83.b, y93.e() != null, y93.h() != null);
                l46Var.p0(objR4);
            }
            final e83 e83Var2 = (e83) objR4;
            Object[] objArr = new Object[0];
            boolean zI = l46Var.i(e83Var2);
            Object objR5 = l46Var.R();
            if (zI || objR5 == i8cVar) {
                objR5 = new x16() { // from class: gi9
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i5 = i4;
                        e83 e83Var3 = e83Var2;
                        switch (i5) {
                            case 0:
                                return q1c.f(Boolean.valueOf(e83Var3.a));
                            default:
                                return q1c.f(Boolean.valueOf(e83Var3.b));
                        }
                    }
                };
                l46Var.p0(objR5);
            }
            e89 e89Var = (e89) vfh.I(objArr, (x16) objR5, l46Var, 0);
            Object[] objArr2 = new Object[0];
            boolean zI2 = l46Var.i(e83Var2);
            Object objR6 = l46Var.R();
            if (zI2 || objR6 == i8cVar) {
                objR6 = new x16() { // from class: gi9
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i5 = i3;
                        e83 e83Var3 = e83Var2;
                        switch (i5) {
                            case 0:
                                return q1c.f(Boolean.valueOf(e83Var3.a));
                            default:
                                return q1c.f(Boolean.valueOf(e83Var3.b));
                        }
                    }
                };
                l46Var.p0(objR6);
            }
            e89 e89Var2 = (e89) vfh.I(objArr2, (x16) objR6, l46Var, 0);
            Object[] objArr3 = new Object[0];
            Object objR7 = l46Var.R();
            if (objR7 == i8cVar) {
                objR7 = new fk8(25);
                l46Var.p0(objR7);
            }
            final e89 e89Var3 = (e89) vfh.I(objArr3, (x16) objR7, l46Var, 48);
            e83 e83Var3 = new e83(((Boolean) e89Var.getValue()).booleanValue(), ((Boolean) e89Var2.getValue()).booleanValue());
            Object[] objArr4 = new Object[0];
            vea veaVar = g83.b;
            Object objR8 = l46Var.R();
            if (objR8 == i8cVar) {
                objR8 = new fk8(26);
                l46Var.p0(objR8);
            }
            g83 g83Var2 = (g83) vfh.J(objArr4, veaVar, (x16) objR8, l46Var, 384);
            Object objR9 = l46Var.R();
            if (objR9 == i8cVar) {
                objR9 = new ei9("onboarding_notification_permission", "onboarding_notification_permission", null);
                l46Var.p0(objR9);
            }
            ei9 ei9Var = (ei9) objR9;
            int i5 = i2 & 14;
            boolean zG3 = (i5 == 4) | l46Var.g(e89Var3) | l46Var.i(g83Var2) | l46Var.i(aw2Var2) | l46Var.i(context) | l46Var.i(gpfVar) | l46Var.i(o9Var);
            Object objR10 = l46Var.R();
            if (zG3 || objR10 == i8cVar) {
                aw2Var = aw2Var2;
                g83Var = g83Var2;
                ms2Var = new ms2(g83Var, aw2Var, e89Var3, context, gpfVar, o9Var, x16Var);
                l46Var.p0(ms2Var);
            } else {
                ms2Var = objR10;
                aw2Var = aw2Var2;
                g83Var = g83Var2;
            }
            final uh9 uh9VarZ = oa7.Z((a26) ms2Var, ei9Var, l46Var);
            Object objR11 = l46Var.R();
            if (objR11 == i8cVar) {
                objR11 = new fk8(27);
                l46Var.p0(objR11);
            }
            final uo uoVarY = oa7.Y(ei9Var, (x16) objR11, l46Var, 48);
            boolean zBooleanValue = ((Boolean) e89Var3.getValue()).booleanValue();
            Object objR12 = l46Var.R();
            if (objR12 == i8cVar) {
                objR12 = new fk8(28);
                l46Var.p0(objR12);
            }
            rxg.a(zBooleanValue, (x16) objR12, l46Var, 48, 0);
            boolean zBooleanValue2 = ((Boolean) e89Var3.getValue()).booleanValue();
            boolean zG4 = l46Var.g(e89Var) | l46Var.g(e89Var2);
            Object objR13 = l46Var.R();
            if (zG4 || objR13 == i8cVar) {
                objR13 = new ls2(e89Var, e89Var2, 2);
                l46Var.p0(objR13);
            }
            a26 a26Var = (a26) objR13;
            boolean zI3 = l46Var.i(g83Var) | l46Var.i(e83Var3) | l46Var.i(uh9VarZ) | l46Var.g(e89Var3) | l46Var.i(aw2Var) | l46Var.i(context) | l46Var.i(gpfVar) | l46Var.i(o9Var) | (i5 == 4) | l46Var.i(uoVarY);
            Object objR14 = l46Var.R();
            if (zI3 || objR14 == i8cVar) {
                z = false;
                z2 = true;
                final aw2 aw2Var3 = aw2Var;
                e83Var = e83Var3;
                Object obj = new x16() { // from class: fi9
                    @Override // defpackage.x16
                    public final Object invoke() {
                        g83 g83Var3 = g83Var;
                        g83Var3.getClass();
                        e83 e83VarA = e83.a(e83Var, false, false, 3);
                        g83Var3.a = e83VarA;
                        x1f x1fVar = x1f.a;
                        x1f.k(p05.a, new p59(6, e83VarA), 2);
                        aw2 aw2Var4 = aw2Var3;
                        e89 e89Var4 = e89Var3;
                        Context context2 = context;
                        gpf gpfVar2 = gpfVar;
                        o9 o9Var2 = o9Var;
                        x16 x16Var5 = x16Var;
                        uh9VarZ.a(new hi9(g83Var3, aw2Var4, e89Var4, context2, gpfVar2, o9Var2, x16Var5), new jf6(28, uoVarY, x16Var5));
                        return wef.a;
                    }
                };
                e89Var3 = e89Var3;
                x16Var3 = x16Var;
                l46Var.p0(obj);
                objR14 = obj;
            } else {
                e83Var = e83Var3;
                z = false;
                z2 = true;
                x16Var3 = x16Var;
            }
            x16 x16Var5 = (x16) objR14;
            boolean z3 = i5 == 4 ? z2 : z;
            Object objR15 = l46Var.R();
            if (z3 || objR15 == i8cVar) {
                objR15 = new fn6(21, x16Var3);
                l46Var.p0(objR15);
            }
            x16Var4 = x16Var2;
            e(e83Var, zBooleanValue2, a26Var, x16Var5, (x16) objR15, null, af1.b0(-2023992372, new s95(x16Var4, e89Var3, 2), l46Var), l46Var, 1572864, 32);
        } else {
            x16Var3 = x16Var;
            x16Var4 = x16Var2;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i, 24, x16Var3, x16Var4);
        }
    }

    public static final void m(g83 g83Var, aw2 aw2Var, e89 e89Var, Context context, gpf gpfVar, o9 o9Var, x16 x16Var) {
        e83 e83Var;
        if (((Boolean) e89Var.getValue()).booleanValue() || (e83Var = g83Var.a) == null) {
            return;
        }
        e89Var.setValue(Boolean.TRUE);
        ynb.V(aw2Var, null, null, new ii9(e83Var, context, gpfVar, o9Var, x16Var, e89Var, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006f A[PHI: r0 r1 r2 r4 r5 r6
  0x006f: PHI (r0v28 ??) = (r0v36 ??), (r0v37 ??) binds: [B:68:0x0268, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r1v18 bw2) = (r1v15 bw2), (r1v19 bw2) binds: [B:68:0x0268, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r2v35 boolean) = (r2v33 boolean), (r2v40 boolean) binds: [B:68:0x0268, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r4v36 x16) = (r4v31 x16), (r4v40 x16) binds: [B:68:0x0268, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r5v26 int) = (r5v19 int), (r5v33 int) binds: [B:68:0x0268, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r6v19 java.lang.Object) = (r6v17 java.lang.Object), (r6v21 java.lang.Object) binds: [B:68:0x0268, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0158  */
    /* JADX WARN: Code duplicated, block: B:32:0x015c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0162  */
    /* JADX WARN: Code duplicated, block: B:35:0x0164  */
    /* JADX WARN: Code duplicated, block: B:39:0x016a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0192  */
    /* JADX WARN: Code duplicated, block: B:49:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:63:0x021c  */
    /* JADX WARN: Code duplicated, block: B:67:0x024b A[PHI: r0 r1 r2 r4 r6
  0x024b: PHI (r0v26 ??) = (r0v38 ??), (r0v39 ??) binds: [B:65:0x0248, B:16:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r1v15 bw2) = (r1v13 bw2), (r1v16 bw2) binds: [B:65:0x0248, B:16:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r2v33 boolean) = (r2v31 boolean), (r2v34 boolean) binds: [B:65:0x0248, B:16:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r4v31 x16) = (r4v22 x16), (r4v35 x16) binds: [B:65:0x0248, B:16:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r6v17 java.lang.Object) = (r6v11 java.lang.Object), (r6v18 java.lang.Object) binds: [B:65:0x0248, B:16:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0286, code lost:
    
        if (defpackage.bsa.p(3, new defpackage.ie2(r5), r14) == r1) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v26, types: [int] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object n(android.content.Context r25, defpackage.gpf r26, defpackage.o9 r27, defpackage.x16 r28, defpackage.e83 r29, defpackage.zn2 r30) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa7.n(android.content.Context, gpf, o9, x16, e83, zn2):java.lang.Object");
    }

    public static final void o(ted tedVar, long j, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i, int i2) {
        long j2;
        Object obj;
        ted tedVar2;
        long j3;
        ted tedVarF;
        long jB;
        int i3;
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var.h0(717022524);
        int i4 = i | 2;
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                int i5 = l46Var.f(j2) ? 32 : 16;
                i4 |= i5;
            } else {
                j2 = j;
            }
            i4 |= i5;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            i4 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i4 |= l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            obj = x16Var3;
            i4 |= l46Var.i(obj) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        } else {
            obj = x16Var3;
        }
        if (l46Var.W(i4 & 1, (i4 & 9363) != 9362)) {
            l46Var.b0();
            int i6 = 3;
            if ((i & 1) == 0 || l46Var.C()) {
                tedVarF = zz8.f(0, 3, null, l46Var);
                int i7 = i4 & (-15);
                if ((i2 & 2) != 0) {
                    y11 y11Var = y11.a;
                    i3 = i4 & (-127);
                    jB = y11.b(l46Var);
                } else {
                    jB = j2;
                    i3 = i7;
                }
            } else {
                l46Var.Z();
                int i8 = i4 & (-15);
                if ((i2 & 2) != 0) {
                    i8 = i4 & (-127);
                }
                jB = j2;
                i3 = i8;
                tedVarF = tedVar;
            }
            l46Var.s();
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = af1.E(l46Var);
                l46Var.p0(objR);
            }
            aw2 aw2Var = (aw2) objR;
            af afVar = new af(i6);
            boolean z = (i3 & 7168) == 2048;
            Object objR2 = l46Var.R();
            if (z || objR2 == i8cVar) {
                objR2 = new p9(5, x16Var2);
                l46Var.p0(objR2);
            }
            yk8 yk8VarP = qn4.P(afVar, (a26) objR2, l46Var);
            j09 j09VarR = b.r(ynb.Z(g09.a, we6.e(l46Var) ? 0.0f : 16.0f));
            long j4 = ((m82) l46Var.k(o82.a)).p;
            x4d x4dVarB = a7c.b(32.0f);
            if (we6.e(l46Var)) {
                x4dVarB = g21.f;
            }
            ted tedVar3 = tedVarF;
            zz8.a(x16Var3, j09VarR, tedVar3, 0.0f, false, x4dVarB, j4, 0L, jB, null, null, null, af1.b0(-1995404518, new n50(1, x16Var, yk8VarP, aw2Var, tedVar3, obj), l46Var), l46Var, ((i3 >> 12) & 14) | ((i3 << 24) & 1879048192), 3078, 6552);
            tedVar2 = tedVar3;
            j3 = jB;
        } else {
            l46Var.Z();
            tedVar2 = tedVar;
            j3 = j2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new t11(tedVar2, j3, x16Var, x16Var2, x16Var3, i, i2);
        }
    }

    public static final j09 p(j09 j09Var, float f2) {
        return f2 == 1.0f ? j09Var : bzd.y(j09Var, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0L, null, true, 0L, 0L, 1044475);
    }

    public static final Context q(nfc nfcVar) throws bw8 {
        nfcVar.getClass();
        try {
            return (Context) nfcVar.g(job.a.b(Context.class), null, null);
        } catch (kf9 unused) {
            throw new bw8("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }

    public static final List r(w1e w1eVar, int i, int i2, ArrayList arrayList, r67 r67Var, int i3, int i4, int i5, boolean z, a26 a26Var) {
        int i6;
        p69 p69Var;
        int i7;
        Object obj;
        int i8;
        if (w1eVar == null || arrayList.isEmpty() || (i6 = r67Var.b) == 0) {
            return pu4.a;
        }
        int i9 = -1;
        int i10 = 0;
        if (i2 - i < 0 || i6 == 0) {
            p69Var = s67.a;
        } else {
            z67 z67VarC0 = mh3.c0(0, i6);
            int i11 = z67VarC0.a;
            int i12 = z67VarC0.b;
            int iA = -1;
            if (i11 <= i12) {
                while (r67Var.a(i11) <= i) {
                    iA = r67Var.a(i11);
                    if (i11 == i12) {
                        break;
                    }
                    i11++;
                }
            }
            if (iA == -1) {
                p69Var = s67.a;
            } else {
                p69 p69Var2 = s67.a;
                p69Var = new p69(1);
                p69Var.c(iA);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj2 = arrayList.get(i13);
            int index = ((vz7) obj2).getIndex();
            int[] iArr = r67Var.a;
            int i14 = r67Var.b;
            for (int i15 = i10; i15 < i14; i15++) {
                if (iArr[i15] == index) {
                    arrayList3.add(obj2);
                    break;
                }
            }
            i13++;
            i10 = 0;
        }
        int[] iArr2 = p69Var.a;
        int i16 = p69Var.b;
        int i17 = 0;
        while (i17 < i16) {
            int i18 = iArr2[i17];
            Iterator it = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = i9;
                    break;
                }
                if (((vz7) it.next()).getIndex() == i18) {
                    break;
                }
                i19++;
            }
            vz7 vz7Var = i19 == i9 ? (vz7) a26Var.d(Integer.valueOf(i18)) : (vz7) arrayList.remove(i19);
            int iH = b21.H(vz7Var, z);
            if (i19 == i9) {
                i17 = i17;
                i7 = Integer.MIN_VALUE;
            } else {
                long jM = vz7Var.m(0);
                i7 = (int) (z ? jM & 4294967295L : jM >> 32);
            }
            int size2 = arrayList3.size();
            int i20 = 0;
            while (true) {
                if (i20 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i20);
                if (((vz7) obj).getIndex() != i18) {
                    break;
                }
                i20++;
            }
            vz7 vz7Var2 = (vz7) obj;
            if (vz7Var2 != null) {
                long jM2 = vz7Var2.m(0);
                i8 = (int) (z ? jM2 & 4294967295L : jM2 >> 32);
            } else {
                i8 = Integer.MIN_VALUE;
            }
            int iMax = i7 == Integer.MIN_VALUE ? -i3 : Math.max(-i3, i7);
            if (i8 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i8 - iH);
            }
            vz7Var.p();
            vz7Var.g(iMax, 0, i4, i5);
            arrayList2.add(vz7Var);
            i17++;
            i9 = -1;
        }
        return arrayList2;
    }

    public static boolean s(float f2, Float f3) {
        return f3 != null && f2 == f3.floatValue();
    }

    public static boolean t(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object u(Collection collection, zn2 zn2Var) {
        if (collection.isEmpty()) {
            return pu4.a;
        }
        nu3[] nu3VarArr = (nu3[]) collection.toArray(new nu3[0]);
        pr0 pr0Var = new pr0(nu3VarArr);
        pl1 pl1Var = new pl1(1, k99.D(zn2Var));
        pl1Var.v();
        int length = nu3VarArr.length;
        nr0[] nr0VarArr = new nr0[length];
        for (int i = 0; i < length; i++) {
            ba4 ba4Var = nu3VarArr[i];
            ba4Var.start();
            nr0 nr0Var = new nr0(pr0Var, pl1Var);
            nr0Var.f = tq.E(ba4Var, true, nr0Var);
            nr0VarArr[i] = nr0Var;
        }
        or0 or0Var = new or0(nr0VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            nr0 nr0Var2 = nr0VarArr[i2];
            nr0Var2.getClass();
            ud0.a.putObjectVolatile(nr0Var2, nr0.v, or0Var);
        }
        if (pl1Var.z()) {
            or0Var.a();
        } else {
            pl1Var.y(or0Var);
        }
        return pl1Var.t();
    }

    public static String v(int i, int i2, String str) {
        if (i < 0) {
            return rfc.l("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return rfc.l("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        qc0.j(tec.e(i2, "negative size: "));
        return null;
    }

    public static void w(int i, String str, boolean z) {
        if (z) {
            return;
        }
        qc0.j(rfc.l(str, Integer.valueOf(i)));
    }

    public static void x(long j, boolean z, String str) {
        if (z) {
            return;
        }
        qc0.j(rfc.l(str, Long.valueOf(j)));
    }

    public static void y(String str, int i, int i2, boolean z) {
        if (z) {
            return;
        }
        qc0.j(rfc.l(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void z(String str, boolean z) {
        if (z) {
            return;
        }
        qc0.j(str);
    }
}
