package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import coil3.compose.AsyncImagePainter;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import tech.chatmind.api.InvitationInfo;
import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bzd {
    public static g0c i;
    public static final kaf j;
    public static final kaf k;
    public static gx6 m;
    public static gx6 n;
    public static final Object[] a = new Object[0];
    public static final dd2 b = new dd2(new md2(16), false, -829207772);
    public static final dd2 c = new dd2(new kd2(23), false, -742619745);
    public static final dd2 d = new dd2(new ce2(7), false, 983610598);
    public static final dd2 e = new dd2(new ce2(8), false, 121197263);
    public static final dd2 f = new dd2(new he2(13), false, -1185913881);
    public static final dd2 g = new dd2(new he2(14), false, -1828185097);
    public static final dd2 h = new dd2(new he2(15), false, -714296480);
    public static final Object l = new Object();

    static {
        boolean z = false;
        j = new kaf(z, 10);
        k = new kaf(z, 9);
    }

    public static final boolean A(Uri uri) {
        String host = uri.getHost();
        return host != null && (c5e.u(host, "askquin.ai", false) || c5e.u(host, "askquin.cn", false) || c5e.u(host, "quinlove.cn", false) || c5e.u(host, "quin.love", false));
    }

    public static final boolean B(ywc ywcVar, Resources resources) {
        if (x57.X(ywcVar)) {
            return false;
        }
        twc twcVar = ywcVar.d;
        if (twcVar.c) {
            return true;
        }
        Object objG = twcVar.a.g(cxc.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !((list != null ? (String) s72.x0(list) : null) == null && v(ywcVar) == null && u(ywcVar, resources) == null && !t(ywcVar)) && C(ywcVar);
    }

    public static final boolean C(ywc ywcVar) {
        if (!ywcVar.n()) {
            List listI = ywcVar.i((4 & 1) != 0 ? !ywcVar.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (gdc.g((ywc) listI.get(i2))) {
                }
            }
            LayoutNode layoutNodeF = ywcVar.c.F();
            while (true) {
                if (layoutNodeF == null) {
                    layoutNodeF = null;
                    break;
                }
                twc twcVarH = layoutNodeF.H();
                if (twcVarH != null && twcVarH.c) {
                    break;
                }
                layoutNodeF = layoutNodeF.F();
            }
            return !(layoutNodeF != null);
        }
        return false;
    }

    public static List D(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    public static final boolean E(qlb qlbVar, String str) {
        String str2;
        qlbVar.getClass();
        if (qlbVar.equals(llb.a)) {
            str2 = "quinlove:///app/chat";
        } else if (qlbVar instanceof nlb) {
            str2 = "quinlove:///app/tarot-theme-settings";
        } else if (qlbVar.equals(mlb.a)) {
            str2 = "quinlove:///app/seasonal-fortune-entry";
        } else {
            if (!qlbVar.equals(plb.a)) {
                if (qlbVar.equals(olb.a)) {
                    return false;
                }
                ap.c();
                return false;
            }
            str2 = "quinlove:///app/fortune-report-2026";
        }
        return str.equals(str2);
    }

    public static g51 F(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        z67 z67Var = new z67(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(t72.u(z67Var, 10));
        Iterator it = z67Var.iterator();
        while (((y67) it).c) {
            ((q67) it).nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int[] iArrI1 = s72.i1(arrayList);
        int[] iArrCopyOf = Arrays.copyOf(iArrI1, iArrI1.length);
        return new g51(Arrays.copyOf(iArrCopyOf, iArrCopyOf.length));
    }

    public static Executor G(Executor executor, hn5 hn5Var) {
        executor.getClass();
        return executor == f94.a ? executor : new f39(executor, hn5Var, 0);
    }

    public static void H(File file) {
        File[] fileArrListFiles;
        try {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    H(file2);
                }
            }
            if (file.getName().contains("MixpanelAPI.Images.") || file.getName().contains("MP_IMG_")) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    public static String I(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static final Object[] J(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] K(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final void L() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ea  */
    public static final void a(final dh0 dh0Var, final String str, final j09 j09Var, final a26 a26Var, final a26 a26Var2, final yi yiVar, final bn2 bn2Var, final float f2, final c82 c82Var, final int i2, final boolean z, l46 l46Var, final int i3, final int i4) {
        int i5;
        String str2;
        a26 a26Var3;
        a26 a26Var4;
        yi yiVar2;
        int i6;
        boolean z2;
        int i7;
        sw6 sw6Var;
        boolean z3;
        l46Var.h0(1236588022);
        if ((i3 & 6) == 0) {
            i5 = (l46Var.g(dh0Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            str2 = str;
            i5 |= l46Var.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i3 & 384) == 0) {
            i5 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            a26Var3 = a26Var;
            i5 |= l46Var.i(a26Var3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            a26Var3 = a26Var;
        }
        if ((i3 & 24576) == 0) {
            a26Var4 = a26Var2;
            i5 |= l46Var.i(a26Var4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        } else {
            a26Var4 = a26Var2;
        }
        if ((196608 & i3) == 0) {
            yiVar2 = yiVar;
            i5 |= l46Var.g(yiVar2) ? 131072 : 65536;
        } else {
            yiVar2 = yiVar;
        }
        if ((1572864 & i3) == 0) {
            i5 |= l46Var.g(bn2Var) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i5 |= l46Var.d(f2) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i5 |= l46Var.g(c82Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i6 = i2;
            i5 |= l46Var.e(i6) ? 536870912 : 268435456;
        } else {
            i6 = i2;
        }
        if ((i4 & 6) == 0) {
            z2 = z;
            i7 = i4 | (l46Var.h(z2) ? 4 : 2);
        } else {
            z2 = z;
            i7 = i4;
        }
        if (l46Var.W(i5 & 1, ((i5 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            Object obj = dh0Var.a;
            int i8 = crf.b;
            l46Var.f0(-329318062);
            boolean z4 = obj instanceof sw6;
            Object obj2 = sf2.a;
            if (z4) {
                l46Var.f0(-1008942344);
                sw6Var = (sw6) obj;
                if (sw6Var.s.e != null) {
                    l46Var.f0(-1008902292);
                    z3 = false;
                    l46Var.r(false);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-1008854118);
                    hld hldVarB = crf.b(bn2Var, l46Var);
                    boolean zG = l46Var.g(obj) | l46Var.g(hldVarB);
                    Object objR = l46Var.R();
                    if (zG || objR == obj2) {
                        pw6 pw6VarA = sw6.a(sw6Var);
                        pw6VarA.j = hldVarB;
                        objR = pw6VarA.a();
                        l46Var.p0(objR);
                    }
                    sw6Var = (sw6) objR;
                    tec.s(l46Var, false, false, false);
                }
                crf.f(sw6Var);
                j09 j09VarD = j09Var.D(new ym2(sw6Var, dh0Var.c, dh0Var.b, a26Var3, a26Var4, i6, yiVar2, bn2Var, f2, c82Var, z2, crf.a(l46Var), str2));
                mr mrVar = mr.m;
                int iHashCode = Long.hashCode(l46Var.T);
                j09 j09VarJ = m93.J(l46Var, j09VarD);
                u8a u8aVarM = l46Var.m();
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, mrVar);
                dec.l(hj6.y, l46Var, u8aVarM);
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                l46Var.r(true);
            } else {
                l46Var.f0(-1008595950);
                Context context = (Context) l46Var.k(uq.b);
                hld hldVarB2 = crf.b(bn2Var, l46Var);
                boolean zG2 = l46Var.g(context) | l46Var.g(obj) | l46Var.g(hldVarB2);
                Object objR2 = l46Var.R();
                if (zG2 || objR2 == obj2) {
                    pw6 pw6Var = new pw6(context);
                    pw6Var.c = obj;
                    pw6Var.j = hldVarB2;
                    objR2 = pw6Var.a();
                    l46Var.p0(objR2);
                }
                sw6Var = (sw6) objR2;
                z3 = false;
                l46Var.r(false);
            }
            l46Var.r(z3);
            crf.f(sw6Var);
            j09 j09VarD2 = j09Var.D(new ym2(sw6Var, dh0Var.c, dh0Var.b, a26Var3, a26Var4, i6, yiVar2, bn2Var, f2, c82Var, z2, crf.a(l46Var), str2));
            mr mrVar2 = mr.m;
            int iHashCode2 = Long.hashCode(l46Var.T);
            j09 j09VarJ2 = m93.J(l46Var, j09VarD2);
            u8a u8aVarM2 = l46Var.m();
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, mrVar2);
            dec.l(hj6.y, l46Var, u8aVarM2);
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ2);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode2));
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: ug0
                @Override // defpackage.l26
                public final Object z(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iP = k99.P(i3 | 1);
                    int iP2 = k99.P(i4);
                    bzd.a(dh0Var, str, j09Var, a26Var, a26Var2, yiVar, bn2Var, f2, c82Var, i2, z, (l46) obj3, iP, iP2);
                    return wef.a;
                }
            };
        }
    }

    public static final void b(Object obj, String str, aw6 aw6Var, j09 j09Var, bn2 bn2Var, c82 c82Var, l46 l46Var, int i2, int i3, int i4) {
        int i5 = i2 >> 3;
        a(new dh0(obj, (vg0) l46Var.k(ha8.a), aw6Var), str, j09Var, AsyncImagePainter.K0, null, ndb.f, bn2Var, 1.0f, (i4 & 512) != 0 ? null : c82Var, 1, true, l46Var, (i2 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (i5 & 234881024) | ((i3 << 27) & 1879048192), (i3 >> 3) & 14);
    }

    public static final void c(x16 x16Var, j09 j09Var, boolean z, x4d x4dVar, rp1 rp1Var, cr1 cr1Var, dd2 dd2Var, l46 l46Var, int i2) {
        int i3;
        boolean z2;
        cr1 cr1Var2;
        cr1 cr1VarQ;
        int i4;
        boolean z3;
        l46Var.h0(2136075085);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(x16Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(j09Var) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i5 |= l46Var.g(x4dVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i5 |= l46Var.g(rp1Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            i5 |= 65536;
        }
        int i6 = i5 | 14155776;
        if ((100663296 & i2) == 0) {
            i6 |= l46Var.i(dd2Var) ? 67108864 : 33554432;
        }
        if (l46Var.W(i6 & 1, (38347923 & i6) != 38347922)) {
            l46Var.b0();
            if ((i2 & 1) == 0 || l46Var.C()) {
                cr1VarQ = z5c.q(63);
                i4 = i6 & (-458753);
                z3 = true;
            } else {
                l46Var.Z();
                cr1VarQ = cr1Var;
                i4 = i6 & (-458753);
                z3 = z;
            }
            l46Var.s();
            l46Var.f0(1577885006);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = ib8.e(l46Var);
            }
            t69 t69Var = (t69) objR;
            l46Var.r(false);
            long j2 = z3 ? rp1Var.a : rp1Var.c;
            boolean z4 = z3;
            nae.c(x16Var, j09Var, z4, x4dVar, j2, z3 ? rp1Var.b : rp1Var.d, 0.0f, ((yi4) cr1VarQ.a(z3, t69Var, l46Var, (i4 >> 6) & 14).getValue()).a, null, t69Var, af1.b0(-1347531112, new gr1(dd2Var, 1), l46Var), l46Var, (i4 & 8190) | ((i4 << 6) & 234881024), 64);
            cr1Var2 = cr1VarQ;
            z2 = z4;
        } else {
            l46Var.Z();
            z2 = z;
            cr1Var2 = cr1Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fc(x16Var, j09Var, z2, x4dVar, rp1Var, cr1Var2, dd2Var, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d3 A[PHI: r2 r3 r4 r5
  0x00d3: PHI (r2v22 int) = (r2v14 int), (r2v24 int), (r2v25 int) binds: [B:91:0x0100, B:79:0x00cf, B:80:0x00d1] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r3v19 x4d) = (r3v5 x4d), (r3v2 x4d), (r3v2 x4d) binds: [B:91:0x0100, B:79:0x00cf, B:80:0x00d1] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r4v12 rp1) = (r4v5 rp1), (r4v2 rp1), (r4v2 rp1) binds: [B:91:0x0100, B:79:0x00cf, B:80:0x00d1] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r5v10 cr1) = (r5v5 cr1), (r5v2 cr1), (r5v2 cr1) binds: [B:91:0x0100, B:79:0x00cf, B:80:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00da  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x0147  */
    /* JADX WARN: Code duplicated, block: B:97:0x0154  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void d(j09 j09Var, x4d x4dVar, rp1 rp1Var, cr1 cr1Var, q11 q11Var, dd2 dd2Var, l46 l46Var, int i2, int i3) {
        int i4;
        x4d x4dVarB;
        rp1 rp1VarW;
        cr1 cr1VarQ;
        q11 q11Var2;
        boolean z;
        x4d x4dVar2;
        rp1 rp1Var2;
        cr1 cr1Var2;
        q11 q11Var3;
        ojb ojbVarV;
        x4d x4dVar3;
        q11 q11Var4;
        int i5;
        int i6;
        int i7;
        l46Var.h0(1359693790);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                x4dVarB = x4dVar;
                int i8 = l46Var.g(x4dVarB) ? 32 : 16;
                i4 |= i8;
            } else {
                x4dVarB = x4dVar;
            }
            i4 |= i8;
        } else {
            x4dVarB = x4dVar;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                rp1VarW = rp1Var;
                if (l46Var.g(rp1VarW)) {
                    i7 = 256;
                }
                i4 |= i7;
            } else {
                rp1VarW = rp1Var;
            }
            i7 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            i4 |= i7;
        } else {
            rp1VarW = rp1Var;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                cr1VarQ = cr1Var;
                if (l46Var.g(cr1VarQ)) {
                    i6 = 2048;
                }
                i4 |= i6;
            } else {
                cr1VarQ = cr1Var;
            }
            i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i4 |= i6;
        } else {
            cr1VarQ = cr1Var;
        }
        int i9 = i3 & 16;
        if (i9 == 0) {
            if ((i2 & 24576) == 0) {
                q11Var2 = q11Var;
                i4 |= l46Var.g(q11Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            if ((196608 & i2) == 0) {
                if (l46Var.i(dd2Var)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i4 |= i5;
            }
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i4 & 1, z)) {
                l46Var.b0();
                if ((i2 & 1) != 0 || l46Var.C()) {
                    if ((i3 & 2) != 0) {
                        x4dVarB = u5d.b(mh3.i, l46Var);
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        rp1VarW = z5c.w((m82) l46Var.k(o82.a));
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        cr1VarQ = z5c.q(63);
                        i4 &= -7169;
                    }
                    if (i9 != 0) {
                        x4dVar3 = x4dVarB;
                        q11Var4 = null;
                    }
                    l46Var.s();
                    nae.a(j09Var, x4dVar3, rp1VarW.a, rp1VarW.b, 0.0f, ((yi4) cr1VarQ.a(true, null, l46Var, ((i4 >> 3) & 896) | 54).getValue()).a, q11Var4, af1.b0(-97109725, new gr1(dd2Var, 0), l46Var), l46Var, (i4 & 14) | 12582912 | (i4 & 112) | ((i4 << 6) & 3670016), 16);
                    rp1Var2 = rp1VarW;
                    cr1Var2 = cr1VarQ;
                    x4dVar2 = x4dVar3;
                    q11Var3 = q11Var4;
                } else {
                    l46Var.Z();
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                }
                x4dVar3 = x4dVarB;
                q11Var4 = q11Var2;
                l46Var.s();
                nae.a(j09Var, x4dVar3, rp1VarW.a, rp1VarW.b, 0.0f, ((yi4) cr1VarQ.a(true, null, l46Var, ((i4 >> 3) & 896) | 54).getValue()).a, q11Var4, af1.b0(-97109725, new gr1(dd2Var, 0), l46Var), l46Var, (i4 & 14) | 12582912 | (i4 & 112) | ((i4 << 6) & 3670016), 16);
                rp1Var2 = rp1VarW;
                cr1Var2 = cr1VarQ;
                x4dVar2 = x4dVar3;
                q11Var3 = q11Var4;
            } else {
                l46Var.Z();
                x4dVar2 = x4dVarB;
                rp1Var2 = rp1VarW;
                cr1Var2 = cr1VarQ;
                q11Var3 = q11Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new fr1(j09Var, x4dVar2, rp1Var2, cr1Var2, q11Var3, dd2Var, i2, i3, 0);
            }
        }
        i4 |= 24576;
        q11Var2 = q11Var;
        if ((196608 & i2) == 0) {
            if (l46Var.i(dd2Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i4 |= i5;
        }
        if ((74899 & i4) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i4 & 1, z)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if ((i3 & 2) != 0) {
                    x4dVarB = u5d.b(mh3.i, l46Var);
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    rp1VarW = z5c.w((m82) l46Var.k(o82.a));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    cr1VarQ = z5c.q(63);
                    i4 &= -7169;
                }
                if (i9 != 0) {
                    x4dVar3 = x4dVarB;
                    q11Var4 = null;
                } else {
                    x4dVar3 = x4dVarB;
                    q11Var4 = q11Var2;
                }
            } else {
                if ((i3 & 2) != 0) {
                    x4dVarB = u5d.b(mh3.i, l46Var);
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    rp1VarW = z5c.w((m82) l46Var.k(o82.a));
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    cr1VarQ = z5c.q(63);
                    i4 &= -7169;
                }
                if (i9 != 0) {
                    x4dVar3 = x4dVarB;
                    q11Var4 = null;
                } else {
                    x4dVar3 = x4dVarB;
                    q11Var4 = q11Var2;
                }
            }
            l46Var.s();
            nae.a(j09Var, x4dVar3, rp1VarW.a, rp1VarW.b, 0.0f, ((yi4) cr1VarQ.a(true, null, l46Var, ((i4 >> 3) & 896) | 54).getValue()).a, q11Var4, af1.b0(-97109725, new gr1(dd2Var, 0), l46Var), l46Var, (i4 & 14) | 12582912 | (i4 & 112) | ((i4 << 6) & 3670016), 16);
            rp1Var2 = rp1VarW;
            cr1Var2 = cr1VarQ;
            x4dVar2 = x4dVar3;
            q11Var3 = q11Var4;
        } else {
            l46Var.Z();
            x4dVar2 = x4dVarB;
            rp1Var2 = rp1VarW;
            cr1Var2 = cr1VarQ;
            q11Var3 = q11Var2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fr1(j09Var, x4dVar2, rp1Var2, cr1Var2, q11Var3, dd2Var, i2, i3, 0);
        }
    }

    public static final void e(int i2, l46 l46Var) {
        l46 l46Var2;
        l46Var.h0(-1920319493);
        if (l46Var.W(i2 & 1, i2 != 0)) {
            l46Var2 = l46Var;
            af1.w(af1.c0("rotation", l46Var, 0), 0.0f, 360.0f, b21.D(b21.T(1000, 0, null, 6), lrb.a, 4), "rotation", l46Var2, 29112, 0);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new aka(i2, 2);
        }
    }

    public static final void f(tr2 tr2Var, l46 l46Var, int i2) {
        tr2 tr2Var2;
        Object next;
        pwf pwfVarH;
        l46Var.h0(280581083);
        int i3 = (l46Var.i(tr2Var) ? 4 : 2) | i2;
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
            Object obj = sf2.a;
            if (zBooleanValue) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(uq.b);
                Object objR = l46Var.R();
                if (objR == obj) {
                    objR = zo1.I0;
                    l46Var.p0(objR);
                }
                Iterator it = fyc.u((a26) objR, objK).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Context) next) instanceof pwf));
                pwfVarH = (pwf) next;
                l46Var.r(false);
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            gy2 gy2VarR = b21.r(pwfVarH);
            kob kobVar = job.a;
            dc9 dc9Var = (dc9) z5c.G(kobVar.b(dc9.class), pwfVarH.g(), null, gy2VarR, nfcVarB, null);
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            m25 m25Var = (m25) z5c.G(kobVar.b(m25.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            Context context = (Context) l46Var.k(uq.b);
            boolean zI = l46Var.i(dc9Var) | l46Var.i(tr2Var) | l46Var.i(context) | l46Var.i(m25Var);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj) {
                tr2Var2 = tr2Var;
                Object wr2Var = new wr2(dc9Var, tr2Var2, context, m25Var, null);
                l46Var.p0(wr2Var);
                objR2 = wr2Var;
            } else {
                tr2Var2 = tr2Var;
            }
            af1.o((l26) objR2, l46Var, wef.a);
        } else {
            tr2Var2 = tr2Var;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ur2(tr2Var2, i2, i4);
        }
    }

    public static final void g(int i2, x16 x16Var, l46 l46Var, j09 j09Var) {
        j09 j09Var2;
        l46Var.h0(-236630253);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(x16Var) ? 32 : 16;
        }
        int i4 = 0;
        int i5 = 1;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            oc7 oc7Var = (oc7) z5c.G(job.a.b(oc7.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            int rewardedAddOnCount = ((InvitationInfo) oc7Var.f.getValue()).getRewardedAddOnCount();
            Context context = (Context) l46Var.k(uq.b);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = q1c.f(Boolean.FALSE);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            if (((Boolean) e89Var.getValue()).booleanValue()) {
                l46Var.f0(-1410225036);
                boolean zI = l46Var.i(oc7Var) | l46Var.i(context);
                Object objR2 = l46Var.R();
                if (zI || objR2 == obj) {
                    objR2 = new oc2(oc7Var, context, e89Var, i5);
                    l46Var.p0(objR2);
                }
                a26 a26Var = (a26) objR2;
                Object objR3 = l46Var.R();
                if (objR3 == obj) {
                    objR3 = new ok3(e89Var, 26);
                    l46Var.p0(objR3);
                }
                d8c.c(null, 0L, 0L, a26Var, (x16) objR3, l46Var, 196608);
                l46Var.r(false);
            } else {
                l46Var.f0(-1410045329);
                l46Var.r(false);
            }
            nh5 nh5VarP = m93.p(0.0f, 0.0f, 14);
            g09 g09Var = g09.a;
            xdc.a(g09Var, af1.b0(544051927, new fi4(11, x16Var), l46Var), af1.b0(-638965608, new hr(e89Var, 10), l46Var), null, null, 0, 0L, 0L, nh5VarP, af1.b0(461821666, new dc7(oc7Var, rewardedAddOnCount, i4), l46Var), l46Var, (i3 & 14) | 805306800, 248);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ca5(j09Var2, x16Var, i2, 1, (byte) 0);
        }
    }

    public static final void h(x16 x16Var, a26 a26Var, l46 l46Var, int i2) {
        x16Var.getClass();
        l46Var.h0(1228116348);
        int i3 = (l46Var.i(x16Var) ? 4 : 2) | i2 | (l46Var.i(a26Var) ? 32 : 16);
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            gy2 gy2VarR = b21.r(pwfVarA);
            nfc nfcVarB = kr7.b(l46Var);
            kob kobVar = job.a;
            oc7 oc7Var = (oc7) z5c.G(kobVar.b(oc7.class), pwfVarA.g(), null, gy2VarR, nfcVarB, null);
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = nfcVarB2.b(kobVar.b(t7.class), null, null);
                l46Var.p0(objR);
            }
            Boolean boolValueOf = Boolean.valueOf(((mo3) ((t7) objR)).b());
            boolean zI = l46Var.i(oc7Var) | ((i3 & 112) == 32);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj) {
                objR2 = new ec7(a26Var, oc7Var, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, boolValueOf);
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = new fc7(2, null);
                l46Var.p0(objR3);
            }
            af1.o((l26) objR3, l46Var, wef.a);
            g((i3 << 3) & 112, x16Var, l46Var, null);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vz6(x16Var, a26Var, i2, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:64:0x010b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0110  */
    /* JADX WARN: Code duplicated, block: B:67:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    /* JADX WARN: Code duplicated, block: B:70:0x012d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0131  */
    /* JADX WARN: Code duplicated, block: B:73:0x0137  */
    /* JADX WARN: Code duplicated, block: B:75:0x013b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0146  */
    /* JADX WARN: Code duplicated, block: B:78:0x014a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0157  */
    /* JADX WARN: Code duplicated, block: B:81:0x015b  */
    /* JADX WARN: Code duplicated, block: B:84:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x018d  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bd  */
    public static final void i(c4c c4cVar, rf0 rf0Var, j09 j09Var, l46 l46Var, int i2, int i3) {
        int i4;
        j09 j09Var2;
        int i5;
        boolean z;
        j09 j09Var3;
        ojb ojbVarV;
        j09 j09Var4;
        boolean z2;
        Object objR;
        os osVar;
        i00 i00Var;
        List listH;
        rf0 rf0Var2;
        boolean z3;
        Integer num;
        z5c z5cVar;
        int i6;
        Object obj;
        boolean z4;
        Integer numValueOf;
        rf0Var.getClass();
        l46Var.h0(1311725673);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.g(c4cVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.g(rf0Var) ? 32 : 16;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 384) == 0) {
                j09Var2 = j09Var;
                i4 |= l46Var.g(j09Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i5 = 1;
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i4 & 1, z)) {
                if (i7 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if ((i4 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objR = l46Var.R();
                if (z2 || objR == sf2.a) {
                    osVar = new os(10, (byte) 0);
                    i00Var = (i00) osVar.c;
                    listH = t72.H(new vf0(rf0Var, false, null));
                    while (!listH.isEmpty()) {
                        vf0 vf0Var = (vf0) s72.v0(listH);
                        rf0Var2 = vf0Var.a;
                        z3 = vf0Var.b;
                        num = vf0Var.c;
                        rf0Var2.getClass();
                        z5cVar = rf0Var2.a;
                        listH = s72.r0(listH, i5);
                        if (z3) {
                            i6 = i5;
                            obj = null;
                        } else {
                            z4 = z5cVar instanceof cf0;
                            if (z4) {
                                int iP = osVar.p(e4c.d);
                                String str = ((cf0) z5cVar).l;
                                str.getClass();
                                i00Var.f(str);
                                i00Var.h(iP);
                            } else {
                                if (z5cVar instanceof ff0) {
                                    numValueOf = Integer.valueOf(osVar.p(f4c.d));
                                } else {
                                    if (z5cVar instanceof zf0) {
                                        numValueOf = Integer.valueOf(osVar.p(h4c.d));
                                    } else if (z5cVar instanceof lf0) {
                                        os.b(osVar, new o37(new nd8(11), new dd2(new hm8(z5cVar, 0), true, 786218717), 2));
                                    } else if (z5cVar instanceof of0) {
                                        numValueOf = Integer.valueOf(osVar.p(new g4c(((of0) z5cVar).l)));
                                    } else if (z5cVar instanceof yf0) {
                                        i00Var.f(" ");
                                    } else if (z5cVar instanceof hf0) {
                                        i00Var.f("\n");
                                    } else if (z5cVar instanceof ag0) {
                                        numValueOf = Integer.valueOf(osVar.p(d4c.d));
                                    } else if (z5cVar instanceof hg0) {
                                        String str2 = ((hg0) z5cVar).l;
                                        str2.getClass();
                                        i00Var.f(str2);
                                    } else if (z5cVar instanceof pf0) {
                                        numValueOf = Integer.valueOf(osVar.p(new g4c(((pf0) z5cVar).m)));
                                    }
                                    ArrayList arrayListQ0 = s72.Q0(t72.H(new vf0(rf0Var2, true, numValueOf)), listH);
                                    if (!(z5cVar instanceof hg0) || z4 || (z5cVar instanceof lf0) || (z5cVar instanceof yf0) || (z5cVar instanceof hf0)) {
                                        i6 = 1;
                                    } else {
                                        i6 = 1;
                                        Iterator it = arb.g(rf0Var2, true).iterator();
                                        while (it.hasNext()) {
                                            arrayListQ0 = s72.Q0(t72.H(new vf0((rf0) it.next(), false, null)), arrayListQ0);
                                        }
                                    }
                                    obj = null;
                                    listH = arrayListQ0;
                                }
                                ArrayList arrayListQ1 = s72.Q0(t72.H(new vf0(rf0Var2, true, numValueOf)), listH);
                                if (z5cVar instanceof hg0) {
                                    i6 = 1;
                                } else {
                                    i6 = 1;
                                }
                                obj = null;
                                listH = arrayListQ1;
                            }
                            numValueOf = null;
                            ArrayList arrayListQ2 = s72.Q0(t72.H(new vf0(rf0Var2, true, numValueOf)), listH);
                            if (z5cVar instanceof hg0) {
                                i6 = 1;
                            } else {
                                i6 = 1;
                            }
                            obj = null;
                            listH = arrayListQ2;
                        }
                        if (num != null) {
                            i00Var.h(num.intValue());
                        }
                        i5 = i6;
                    }
                    m4c m4cVar = new m4c(i00Var.l(), bm8.X((LinkedHashMap) osVar.d));
                    l46Var.p0(m4cVar);
                    objR = m4cVar;
                }
                rrb.f(c4cVar, (m4c) objR, j09Var4, null, false, 0, 0, l46Var, i4 & 910, 60);
                j09Var3 = j09Var4;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new gm8(c4cVar, rf0Var, j09Var3, i2, i3, 0);
            }
        }
        i4 |= 384;
        j09Var2 = j09Var;
        i5 = 1;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i4 & 1, z)) {
            if (i7 != 0) {
                j09Var4 = g09.a;
            } else {
                j09Var4 = j09Var2;
            }
            if ((i4 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objR = l46Var.R();
            if (z2) {
                osVar = new os(10, (byte) 0);
                i00Var = (i00) osVar.c;
                listH = t72.H(new vf0(rf0Var, false, null));
                while (!listH.isEmpty()) {
                    vf0 vf0Var2 = (vf0) s72.v0(listH);
                    rf0Var2 = vf0Var2.a;
                    z3 = vf0Var2.b;
                    num = vf0Var2.c;
                    rf0Var2.getClass();
                    z5cVar = rf0Var2.a;
                    listH = s72.r0(listH, i5);
                    if (z3) {
                        z4 = z5cVar instanceof cf0;
                        if (z4) {
                            int iP2 = osVar.p(e4c.d);
                            String str3 = ((cf0) z5cVar).l;
                            str3.getClass();
                            i00Var.f(str3);
                            i00Var.h(iP2);
                        } else {
                            if (z5cVar instanceof ff0) {
                                numValueOf = Integer.valueOf(osVar.p(f4c.d));
                            } else {
                                if (z5cVar instanceof zf0) {
                                    numValueOf = Integer.valueOf(osVar.p(h4c.d));
                                } else if (z5cVar instanceof lf0) {
                                    os.b(osVar, new o37(new nd8(11), new dd2(new hm8(z5cVar, 0), true, 786218717), 2));
                                } else if (z5cVar instanceof of0) {
                                    numValueOf = Integer.valueOf(osVar.p(new g4c(((of0) z5cVar).l)));
                                } else if (z5cVar instanceof yf0) {
                                    i00Var.f(" ");
                                } else if (z5cVar instanceof hf0) {
                                    i00Var.f("\n");
                                } else if (z5cVar instanceof ag0) {
                                    numValueOf = Integer.valueOf(osVar.p(d4c.d));
                                } else if (z5cVar instanceof hg0) {
                                    String str4 = ((hg0) z5cVar).l;
                                    str4.getClass();
                                    i00Var.f(str4);
                                } else if (z5cVar instanceof pf0) {
                                    numValueOf = Integer.valueOf(osVar.p(new g4c(((pf0) z5cVar).m)));
                                }
                                ArrayList arrayListQ3 = s72.Q0(t72.H(new vf0(rf0Var2, true, numValueOf)), listH);
                                if (z5cVar instanceof hg0) {
                                    i6 = 1;
                                } else {
                                    i6 = 1;
                                }
                                obj = null;
                                listH = arrayListQ3;
                            }
                            ArrayList arrayListQ4 = s72.Q0(t72.H(new vf0(rf0Var2, true, numValueOf)), listH);
                            if (z5cVar instanceof hg0) {
                                i6 = 1;
                            } else {
                                i6 = 1;
                            }
                            obj = null;
                            listH = arrayListQ4;
                        }
                        numValueOf = null;
                        ArrayList arrayListQ5 = s72.Q0(t72.H(new vf0(rf0Var2, true, numValueOf)), listH);
                        if (z5cVar instanceof hg0) {
                            i6 = 1;
                        } else {
                            i6 = 1;
                        }
                        obj = null;
                        listH = arrayListQ5;
                    } else {
                        i6 = i5;
                        obj = null;
                    }
                    if (num != null) {
                        i00Var.h(num.intValue());
                    }
                    i5 = i6;
                }
                m4c m4cVar2 = new m4c(i00Var.l(), bm8.X((LinkedHashMap) osVar.d));
                l46Var.p0(m4cVar2);
                objR = m4cVar2;
            } else {
                osVar = new os(10, (byte) 0);
                i00Var = (i00) osVar.c;
                listH = t72.H(new vf0(rf0Var, false, null));
                while (!listH.isEmpty()) {
                    vf0 vf0Var3 = (vf0) s72.v0(listH);
                    rf0Var2 = vf0Var3.a;
                    z3 = vf0Var3.b;
                    num = vf0Var3.c;
                    rf0Var2.getClass();
                    z5cVar = rf0Var2.a;
                    listH = s72.r0(listH, i5);
                    if (z3) {
                        z4 = z5cVar instanceof cf0;
                        if (z4) {
                            int iP3 = osVar.p(e4c.d);
                            String str5 = ((cf0) z5cVar).l;
                            str5.getClass();
                            i00Var.f(str5);
                            i00Var.h(iP3);
                        } else {
                            if (z5cVar instanceof ff0) {
                                numValueOf = Integer.valueOf(osVar.p(f4c.d));
                            } else {
                                if (z5cVar instanceof zf0) {
                                    numValueOf = Integer.valueOf(osVar.p(h4c.d));
                                } else if (z5cVar instanceof lf0) {
                                    os.b(osVar, new o37(new nd8(11), new dd2(new hm8(z5cVar, 0), true, 786218717), 2));
                                } else if (z5cVar instanceof of0) {
                                    numValueOf = Integer.valueOf(osVar.p(new g4c(((of0) z5cVar).l)));
                                } else if (z5cVar instanceof yf0) {
                                    i00Var.f(" ");
                                } else if (z5cVar instanceof hf0) {
                                    i00Var.f("\n");
                                } else if (z5cVar instanceof ag0) {
                                    numValueOf = Integer.valueOf(osVar.p(d4c.d));
                                } else if (z5cVar instanceof hg0) {
                                    String str6 = ((hg0) z5cVar).l;
                                    str6.getClass();
                                    i00Var.f(str6);
                                } else if (z5cVar instanceof pf0) {
                                    numValueOf = Integer.valueOf(osVar.p(new g4c(((pf0) z5cVar).m)));
                                }
                                ArrayList arrayListQ6 = s72.Q0(t72.H(new vf0(rf0Var2, true, numValueOf)), listH);
                                if (z5cVar instanceof hg0) {
                                    i6 = 1;
                                } else {
                                    i6 = 1;
                                }
                                obj = null;
                                listH = arrayListQ6;
                            }
                            ArrayList arrayListQ7 = s72.Q0(t72.H(new vf0(rf0Var2, true, numValueOf)), listH);
                            if (z5cVar instanceof hg0) {
                                i6 = 1;
                            } else {
                                i6 = 1;
                            }
                            obj = null;
                            listH = arrayListQ7;
                        }
                        numValueOf = null;
                        ArrayList arrayListQ8 = s72.Q0(t72.H(new vf0(rf0Var2, true, numValueOf)), listH);
                        if (z5cVar instanceof hg0) {
                            i6 = 1;
                        } else {
                            i6 = 1;
                        }
                        obj = null;
                        listH = arrayListQ8;
                    } else {
                        i6 = i5;
                        obj = null;
                    }
                    if (num != null) {
                        i00Var.h(num.intValue());
                    }
                    i5 = i6;
                }
                m4c m4cVar3 = new m4c(i00Var.l(), bm8.X((LinkedHashMap) osVar.d));
                l46Var.p0(m4cVar3);
                objR = m4cVar3;
            }
            rrb.f(c4cVar, (m4c) objR, j09Var4, null, false, 0, 0, l46Var, i4 & 910, 60);
            j09Var3 = j09Var4;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gm8(c4cVar, rf0Var, j09Var3, i2, i3, 0);
        }
    }

    public static final void j(boolean z, x16 x16Var, l46 l46Var, int i2) {
        Object l4aVar;
        h48 h48Var;
        x16Var.getClass();
        l46Var.h0(-207202098);
        int i3 = (l46Var.h(z) ? 4 : 2) | i2 | (l46Var.i(x16Var) ? 32 : 16);
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            h48 h48VarK = ((x48) l46Var.k(cb8.a)).k();
            whb whbVarN = if9.n(((a58) h48VarK).j);
            e89 e89VarI = jzb.i(whbVarN, whbVarN.getValue(), l46Var, 0, 0);
            Object[] objArr = new Object[0];
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = new vy9(9);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) vfh.I(objArr, (x16) objR, l46Var, 48);
            e89 e89VarI2 = q1c.i(x16Var, l46Var);
            int i4 = i3 & 14;
            e89 e89VarI3 = q1c.i(Boolean.valueOf(z), l46Var);
            Boolean boolValueOf = Boolean.valueOf(z);
            g48 g48Var = (g48) e89VarI.getValue();
            boolean zG = l46Var.g(e89Var) | (i4 == 4) | l46Var.g(e89VarI) | l46Var.g(e89VarI3) | l46Var.i(h48VarK) | l46Var.g(e89VarI2);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                h48Var = h48VarK;
                l4aVar = new l4a(z, h48Var, e89Var, e89VarI, e89VarI3, e89VarI2, null);
                l46Var.p0(l4aVar);
            } else {
                l4aVar = objR2;
                h48Var = h48VarK;
            }
            af1.q(boolValueOf, h48Var, g48Var, (l26) l4aVar, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mb0(z, x16Var, i2, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0053  */
    /* JADX WARN: Code duplicated, block: B:36:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0059  */
    /* JADX WARN: Code duplicated, block: B:38:0x005b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x0068  */
    /* JADX WARN: Code duplicated, block: B:46:0x0070  */
    /* JADX WARN: Code duplicated, block: B:48:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x0079  */
    /* JADX WARN: Code duplicated, block: B:53:0x0082  */
    /* JADX WARN: Code duplicated, block: B:54:0x0084  */
    /* JADX WARN: Code duplicated, block: B:57:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x008f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0093  */
    /* JADX WARN: Code duplicated, block: B:61:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00df  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void k(j09 j09Var, final boolean z, long j2, bxa bxaVar, l46 l46Var, final int i2, final int i3) {
        int i4;
        long j3;
        int i5;
        int iOrdinal;
        int i6;
        boolean z2;
        final j09 j09Var2;
        final long j4;
        final bxa bxaVar2;
        ojb ojbVarV;
        long jC;
        bxa bxaVar3;
        int i7;
        l46Var.h0(-1118157302);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.h(z) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 == 0) {
            if ((i2 & 384) == 0) {
                j3 = j2;
                i4 |= l46Var.f(j3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                if (bxaVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = bxaVar.ordinal();
                }
                if (l46Var.e(iOrdinal)) {
                    i6 = 2048;
                } else {
                    i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i4 |= i6;
            }
            if ((i2 & 24576) == 0) {
                if (l46Var.g(null)) {
                    i7 = 16384;
                } else {
                    i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i7;
            }
            if ((i4 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i4 & 1, z2)) {
                if (i8 != 0) {
                    j09Var = g09.a;
                }
                if (i9 != 0) {
                    jC = abg.c(754974720);
                } else {
                    jC = j3;
                }
                if (i5 != 0) {
                    bxaVar3 = bxa.a;
                } else {
                    bxaVar3 = bxaVar;
                }
                int i10 = ((i4 >> 3) & 14) | 200064 | ((i4 << 3) & 112);
                j09Var2 = j09Var;
                m93.d(z, j09Var2, rw4.f(null, 3), rw4.g(null, 3), null, af1.b0(-1652304334, new mq1(jC, bxaVar3), l46Var), l46Var, i10, 16);
                j4 = jC;
                bxaVar2 = bxaVar3;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                j4 = j3;
                bxaVar2 = bxaVar;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: twa
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        bzd.k(j09Var2, z, j4, bxaVar2, (l46) obj, k99.P(i2 | 1), i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 384;
        j3 = j2;
        i5 = i3 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (bxaVar == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = bxaVar.ordinal();
            }
            if (l46Var.e(iOrdinal)) {
                i6 = 2048;
            } else {
                i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i4 |= i6;
        }
        if ((i2 & 24576) == 0) {
            if (l46Var.g(null)) {
                i7 = 16384;
            } else {
                i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i4 |= i7;
        }
        if ((i4 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var.W(i4 & 1, z2)) {
            if (i8 != 0) {
                j09Var = g09.a;
            }
            if (i9 != 0) {
                jC = abg.c(754974720);
            } else {
                jC = j3;
            }
            if (i5 != 0) {
                bxaVar3 = bxa.a;
            } else {
                bxaVar3 = bxaVar;
            }
            int i11 = ((i4 >> 3) & 14) | 200064 | ((i4 << 3) & 112);
            j09Var2 = j09Var;
            m93.d(z, j09Var2, rw4.f(null, 3), rw4.g(null, 3), null, af1.b0(-1652304334, new mq1(jC, bxaVar3), l46Var), l46Var, i11, 16);
            j4 = jC;
            bxaVar2 = bxaVar3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            j4 = j3;
            bxaVar2 = bxaVar;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: twa
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bzd.k(j09Var2, z, j4, bxaVar2, (l46) obj, k99.P(i2 | 1), i3);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:57:0x010b  */
    /* JADX WARN: Code duplicated, block: B:60:0x011a  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public static final void l(j09 j09Var, final boolean z, long j2, bxa bxaVar, yi yiVar, final dd2 dd2Var, l46 l46Var, final int i2, final int i3) {
        j09 j09Var2;
        int i4;
        yi yiVar2;
        int i5;
        boolean z2;
        final bxa bxaVar2;
        final yi yiVar3;
        final long j3;
        final j09 j09Var3;
        ojb ojbVarV;
        g09 g09Var;
        yi yiVar4;
        int i6;
        l46Var.h0(-1657841321);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            j09Var2 = j09Var;
        } else if ((i2 & 6) == 0) {
            j09Var2 = j09Var;
            i4 = (l46Var.g(j09Var2) ? 4 : 2) | i2;
        } else {
            j09Var2 = j09Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.h(z) ? 32 : 16;
        }
        int i8 = i4 | 3456;
        int i9 = i3 & 16;
        if (i9 == 0) {
            if ((i2 & 24576) == 0) {
                yiVar2 = yiVar;
                i8 |= l46Var.g(yiVar2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i5 = i8 | 196608;
            if ((1572864 & i2) == 0) {
                if (l46Var.i(dd2Var)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i5 |= i6;
            }
            if ((599187 & i5) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i5 & 1, z2)) {
                g09Var = g09.a;
                if (i7 != 0) {
                    j09Var2 = g09Var;
                }
                long jC = abg.c(754974720);
                if (i9 != 0) {
                    yiVar4 = ndb.f;
                } else {
                    yiVar4 = yiVar2;
                }
                j09 j09VarD = j09Var2.D(b.c);
                xn8 xn8VarC = s21.c(yiVar4, false);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarD);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, xn8VarC);
                dec.l(hj6.y, l46Var, u8aVarM);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ);
                dd2Var.m(d31.a, l46Var, Integer.valueOf(((i5 >> 15) & 112) | 6));
                bxa bxaVar3 = bxa.a;
                k(g09Var, z, jC, bxaVar3, l46Var, (i5 & 112) | 6 | (i5 & 896) | (i5 & 7168) | ((i5 >> 3) & 57344), 0);
                l46Var.r(true);
                yiVar3 = yiVar4;
                j3 = jC;
                bxaVar2 = bxaVar3;
            } else {
                l46Var.Z();
                bxaVar2 = bxaVar;
                yiVar3 = yiVar2;
                j3 = j2;
            }
            j09Var3 = j09Var2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: swa
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        bzd.l(j09Var3, z, j3, bxaVar2, yiVar3, dd2Var, (l46) obj, k99.P(i2 | 1), i3);
                        return wef.a;
                    }
                };
            }
        }
        i8 = i4 | 28032;
        yiVar2 = yiVar;
        i5 = i8 | 196608;
        if ((1572864 & i2) == 0) {
            if (l46Var.i(dd2Var)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i5 |= i6;
        }
        if ((599187 & i5) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var.W(i5 & 1, z2)) {
            g09Var = g09.a;
            if (i7 != 0) {
                j09Var2 = g09Var;
            }
            long jC2 = abg.c(754974720);
            if (i9 != 0) {
                yiVar4 = ndb.f;
            } else {
                yiVar4 = yiVar2;
            }
            j09 j09VarD2 = j09Var2.D(b.c);
            xn8 xn8VarC2 = s21.c(yiVar4, false);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarD2);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC2);
            dec.l(hj6.y, l46Var, u8aVarM2);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode2));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ2);
            dd2Var.m(d31.a, l46Var, Integer.valueOf(((i5 >> 15) & 112) | 6));
            bxa bxaVar4 = bxa.a;
            k(g09Var, z, jC2, bxaVar4, l46Var, (i5 & 112) | 6 | (i5 & 896) | (i5 & 7168) | ((i5 >> 3) & 57344), 0);
            l46Var.r(true);
            yiVar3 = yiVar4;
            j3 = jC2;
            bxaVar2 = bxaVar4;
        } else {
            l46Var.Z();
            bxaVar2 = bxaVar;
            yiVar3 = yiVar2;
            j3 = j2;
        }
        j09Var3 = j09Var2;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: swa
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bzd.l(j09Var3, z, j3, bxaVar2, yiVar3, dd2Var, (l46) obj, k99.P(i2 | 1), i3);
                    return wef.a;
                }
            };
        }
    }

    public static void m(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = md7.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = bfa.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final xhb n(wkd wkdVar) {
        wkdVar.getClass();
        return new xhb(wkdVar);
    }

    public static final yhb o(mtd mtdVar) {
        mtdVar.getClass();
        return new yhb(mtdVar);
    }

    public static final File p(Context context, String str) {
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static final int q(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final boolean r(ywc ywcVar) {
        return !ywcVar.k().a.c(cxc.j);
    }

    public static final View s(i09 i09Var) {
        uvf uvfVar = vd0.s0(i09Var.a).E0;
        View interopView = uvfVar != null ? uvfVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        qc0.p("Could not fetch interop view");
        return null;
    }

    public static final boolean t(ywc ywcVar) {
        Object objG = ywcVar.d.a.g(cxc.L);
        if (objG == null) {
            objG = null;
        }
        yye yyeVar = (yye) objG;
        w79 w79Var = ywcVar.d.a;
        Object objG2 = w79Var.g(cxc.z);
        if (objG2 == null) {
            objG2 = null;
        }
        i5c i5cVar = (i5c) objG2;
        boolean z = yyeVar != null;
        Object objG3 = w79Var.g(cxc.K);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (i5cVar != null && i5cVar.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String u(ywc ywcVar, Resources resources) {
        int iO;
        twc twcVar = ywcVar.d;
        twc twcVar2 = ywcVar.d;
        Object objG = twcVar.a.g(cxc.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        w79 w79Var = twcVar2.a;
        Object objG2 = w79Var.g(cxc.L);
        if (objG2 == null) {
            objG2 = null;
        }
        yye yyeVar = (yye) objG2;
        Object objG3 = w79Var.g(cxc.z);
        if (objG3 == null) {
            objG3 = null;
        }
        i5c i5cVar = (i5c) objG3;
        if (yyeVar != null) {
            int iOrdinal = yyeVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        ap.c();
                        return null;
                    }
                    if (objG == null) {
                        objG = resources.getString(R.string.indeterminate);
                    }
                } else if (i5cVar != null && i5cVar.a == 2 && objG == null) {
                    objG = resources.getString(R.string.state_off);
                }
            } else if (i5cVar != null && i5cVar.a == 2 && objG == null) {
                objG = resources.getString(R.string.state_on);
            }
        }
        Object objG4 = w79Var.g(cxc.K);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((i5cVar == null || i5cVar.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objG5 = w79Var.g(cxc.c);
        if (objG5 == null) {
            objG5 = null;
        }
        rwa rwaVar = (rwa) objG5;
        if (rwaVar != null) {
            if (rwaVar != rwa.d) {
                if (objG == null) {
                    b62 b62Var = rwaVar.b;
                    float f2 = b62Var.b;
                    float f3 = b62Var.a;
                    float f4 = f2 - f3 == 0.0f ? 0.0f : (rwaVar.a - f3) / (b62Var.b - f3);
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    if (f4 > 1.0f) {
                        f4 = 1.0f;
                    }
                    if (f4 == 0.0f) {
                        iO = 0;
                    } else {
                        iO = f4 == 1.0f ? 100 : mh3.o(Math.round(f4 * 100.0f), 1, 99);
                    }
                    objG = resources.getString(R.string.template_percent, Integer.valueOf(iO));
                }
            } else if (objG == null) {
                objG = resources.getString(R.string.in_progress);
            }
        }
        gxc gxcVar = cxc.G;
        if (w79Var.c(gxcVar)) {
            w79 w79Var2 = new ywc(ywcVar.a, true, ywcVar.c, twcVar2).k().a;
            Object objG6 = w79Var2.g(cxc.a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = w79Var2.g(cxc.C);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = w79Var2.g(gxcVar);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final k00 v(ywc ywcVar) {
        Object objG = ywcVar.d.a.g(cxc.G);
        if (objG == null) {
            objG = null;
        }
        k00 k00Var = (k00) objG;
        Object objG2 = ywcVar.d.a.g(cxc.C);
        if (objG2 == null) {
            objG2 = null;
        }
        List list = (List) objG2;
        return k00Var == null ? list != null ? (k00) s72.x0(list) : null : k00Var;
    }

    public static final ti7 w(q9b q9bVar, t7 t7Var, k86 k86Var, String str) {
        eab eabVar = (eab) q9bVar;
        QuotaUsage quotaUsageB = eabVar.b();
        js3 js3Var = ga4.a;
        h86 h86Var = (h86) z5c.I(hr3.c, new lqa((pqa) k86Var, null));
        boolean zB = ((mo3) t7Var).b();
        boolean z = false;
        boolean z2 = quotaUsageB != null && quotaUsageB.getHasSubscription();
        boolean z3 = quotaUsageB != null && quotaUsageB.getHasPurchasedGiftCard();
        fl8 fl8Var = new fl8();
        if (str != null) {
        }
        fl8Var.put("signedIn", oh7.a(Boolean.valueOf(zB)));
        fl8Var.put("quotaPresent", oh7.a(Boolean.valueOf(quotaUsageB != null)));
        fl8Var.put("localMockActive", oh7.a(Boolean.valueOf(eabVar.b != null)));
        fl8Var.put("hasSubscription", oh7.a(Boolean.valueOf(z2)));
        fl8Var.put("hasPurchasedGiftCard", oh7.a(Boolean.valueOf(z3)));
        fl8Var.put("persistedShown", oh7.a(Boolean.valueOf(h86Var.a)));
        fl8Var.put("exposureReserved", oh7.a(Boolean.valueOf(h86Var.b)));
        fl8Var.put("closed", oh7.a(Boolean.valueOf(h86Var.c)));
        if (zB && z2 && !z3 && !h86Var.c) {
            z = true;
        }
        fl8Var.put("eligible", oh7.a(Boolean.valueOf(z)));
        return new ti7(fl8Var.j());
    }

    public static final j09 x(j09 j09Var, a26 a26Var) {
        return j09Var.D(new b01(a26Var));
    }

    public static j09 y(j09 j09Var, float f2, float f3, float f4, float f5, float f6, long j2, x4d x4dVar, boolean z, long j3, long j4, int i2) {
        return j09Var.D(new le6((i2 & 1) != 0 ? 1.0f : f2, (i2 & 2) != 0 ? 1.0f : f3, (i2 & 4) != 0 ? 1.0f : f4, 0.0f, 0.0f, (i2 & 32) != 0 ? 0.0f : f5, 0.0f, 0.0f, (i2 & 256) != 0 ? 0.0f : f6, 8.0f, (i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r2f.b : j2, (i2 & 2048) != 0 ? g21.f : x4dVar, (i2 & 4096) != 0 ? false : z, null, (i2 & 16384) != 0 ? oe6.a : j3, (i2 & 32768) != 0 ? oe6.a : j4, 0, 3, null, uu7.a));
    }

    public static j09 z(j09 j09Var, float f2, float f3, float f4, float f5, x4d x4dVar, int i2) {
        float f6 = (i2 & 1) != 0 ? 1.0f : f2;
        float f7 = (i2 & 2) != 0 ? 1.0f : f3;
        float f8 = (i2 & 4) != 0 ? 1.0f : f4;
        float f9 = (i2 & 32) != 0 ? 0.0f : f5;
        long j2 = r2f.b;
        x4d x4dVar2 = (i2 & 2048) != 0 ? g21.f : x4dVar;
        long j3 = oe6.a;
        return y(j09Var, f6, f7, f8, f9, 0.0f, j2, x4dVar2, false, j3, j3, 524288);
    }
}
