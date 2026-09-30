package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Looper;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.network.ErrorCodes;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class urg {
    public static final n82 A;
    public static final g5d B;
    public static final float C;
    public static final n82 D;
    public static final float E;
    public static final n82 F;
    public static final n82 G;
    public static final float H;
    public static final float I;
    public static final float J;
    public static final g5d K;
    public static final float L;
    public static final n82 M;
    public static final n82 N;
    public static final float O;
    public static final n82 P;
    public static final n82 Q;
    public static gx6 R;
    public static ClassLoader a;
    public static Thread b;
    public static final dd2 h;
    public static final dd2 k;
    public static final ju n;
    public static final ju o;
    public static final n82 p;
    public static final float q;
    public static final n82 r;
    public static final float s;
    public static final n82 t;
    public static final float u;
    public static final n82 v;
    public static final float w;
    public static final n82 x;
    public static final float y;
    public static final n82 z;
    public static final dd2 c = new dd2(new ym0(17), false, -1617030095);
    public static final dd2 d = new dd2(new a7(10), false, 1692592338);
    public static final dd2 e = new dd2(new ed2(0), false, 793273424);
    public static final dd2 f = new dd2(new ym0(18), false, -1035892142);
    public static final dd2 g = new dd2(new ym0(19), false, 1084395057);
    public static final dd2 i = new dd2(new ym0(20), false, -1090285040);
    public static final dd2 j = new dd2(new xd2(6), false, -1171514717);
    public static final dd2 l = new dd2(new ce2(14), false, -86924687);
    public static final ju m = new ju(1000);

    static {
        int i2 = 11;
        h = new dd2(new a7(i2), false, -1144423881);
        k = new dd2(new de2(i2), false, -1721272527);
        new ju(ErrorCodes.IO_EXCEPTION);
        n = new ju(1008);
        o = new ju(ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
        p = n82.Z;
        q = 1.0f;
        n82 n82Var = n82.v;
        r = n82Var;
        s = 0.38f;
        t = n82Var;
        u = 0.12f;
        v = n82Var;
        w = 0.38f;
        n82 n82Var2 = n82.G0;
        x = n82Var2;
        y = 0.38f;
        z = n82Var2;
        A = n82Var;
        g5d g5dVar = g5d.d;
        B = g5dVar;
        C = 28.0f;
        D = n82.e;
        E = 24.0f;
        F = n82.f;
        G = n82.z;
        H = 40.0f;
        I = 32.0f;
        J = 2.0f;
        K = g5dVar;
        L = 52.0f;
        n82 n82Var3 = n82.x;
        M = n82Var3;
        N = n82Var3;
        O = 16.0f;
        P = n82Var2;
        Q = n82Var2;
    }

    public static final pv2 A(w5c w5cVar, boolean z2, zn2 zn2Var) {
        j2f j2fVar = (j2f) zn2Var.getContext().F0(j2f.b);
        pv2 pv2Var = j2fVar != null ? j2fVar.a : null;
        if (!w5cVar.k()) {
            pv2 pv2VarH = w5cVar.h();
            if (pv2Var == null) {
                pv2Var = nu4.a;
            }
            return pv2VarH.p0(pv2Var);
        }
        if (pv2Var != null) {
            return w5cVar.h().p0(pv2Var);
        }
        if (!z2) {
            return w5cVar.h();
        }
        pv2 pv2Var2 = w5cVar.b;
        if (pv2Var2 != null) {
            return pv2Var2;
        }
        pa7.g0("transactionContext");
        throw null;
    }

    public static final Type[] B(Constructor constructor) {
        Class declaringClass = constructor.getDeclaringClass();
        Class<?> declaringClass2 = declaringClass.getDeclaringClass();
        if (declaringClass2 == null || Modifier.isStatic(declaringClass.getModifiers())) {
            declaringClass2 = null;
        }
        if (declaringClass2 == null) {
            return C(constructor);
        }
        mx mxVar = new mx(2);
        mxVar.b(declaringClass2);
        mxVar.c(C(constructor));
        ArrayList arrayList = mxVar.a;
        return (Type[]) arrayList.toArray(new Type[arrayList.size()]);
    }

    public static final Type[] C(Constructor constructor) {
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        if (genericParameterTypes.length == constructor.getParameterTypes().length) {
            Class declaringClass = constructor.getDeclaringClass();
            if (!Modifier.isStatic(declaringClass.getModifiers()) && declaringClass.getDeclaringClass() != null) {
                return (Type[]) qd0.g0(1, genericParameterTypes).toArray(new Type[0]);
            }
        }
        return genericParameterTypes;
    }

    public static final j69 D(dx5 dx5Var, em7 em7Var) {
        dx5Var.getClass();
        em7Var.getClass();
        return new j69(em7Var, dx5Var.a.a, new k69(em7Var, dx5Var), new k69(dx5Var, em7Var));
    }

    public static final Paint E(dy9 dy9Var) {
        if (!(dy9Var instanceof rt)) {
            h37.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + job.a.b(dy9Var.getClass()).g());
        }
        return ((rt) dy9Var).a;
    }

    public static final j09 F(j09 j09Var, ia7 ia7Var) {
        return j09Var.D(new ea7(ia7Var));
    }

    public static String G(ct6 ct6Var) {
        ct6Var.getClass();
        a71 a71Var = a71.c;
        return m8c.u(ct6Var.i).c("MD5").g();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f9  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
    
        if (defpackage.qz3.g(r1).equals(defpackage.qz3.g(r2)) != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.xl7 H(defpackage.c36 r6, defpackage.xrf r7) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.urg.H(c36, xrf):xl7");
    }

    public static final Object I(w5c w5cVar, boolean z2, boolean z3, a26 a26Var) {
        w5cVar.getClass();
        ThreadLocal threadLocal = w5cVar.i;
        w5cVar.a();
        if (w5cVar.k() && !w5cVar.l()) {
            pv2 pv2Var = (pv2) threadLocal.get();
            if ((pv2Var != null ? (j2f) pv2Var.F0(j2f.b) : null) != null) {
                qc0.p("Cannot access database on a different coroutine context inherited from a suspending transaction.");
                return null;
            }
        }
        pv2 pv2Var2 = (pv2) threadLocal.get();
        if (pv2Var2 == null) {
            pv2Var2 = nu4.a;
        }
        return d8c.r(new y13(pv2Var2, w5cVar, z3, z2, a26Var, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object J(w5c w5cVar, a26 a26Var, zn2 zn2Var) {
        a23 a23Var;
        w5c w5cVar2;
        a26 a26Var2;
        if (zn2Var instanceof a23) {
            a23Var = (a23) zn2Var;
            int i2 = a23Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a23Var.label = i2 - Integer.MIN_VALUE;
            } else {
                a23Var = new a23(zn2Var);
            }
        } else {
            a23Var = new a23(zn2Var);
        }
        a23 a23Var2 = a23Var;
        Object objA = a23Var2.result;
        int i3 = a23Var2.label;
        Object obj = bw2.a;
        if (i3 == 0) {
            jzb.q(objA);
            if (w5cVar.k()) {
                d23 d23Var = new d23(null, a26Var, w5cVar);
                a23Var2.label = 1;
                Object objO = z5c.O(a23Var2, d23Var, w5cVar);
                if (objO != obj) {
                    return objO;
                }
            } else if (w5cVar.k() && w5cVar.o() && w5cVar.l()) {
                f23 f23Var = new f23(null, a26Var, w5cVar, true, false);
                a23Var2.label = 2;
                Object objR = w5cVar.r(false, f23Var, a23Var2);
                if (objR != obj) {
                    return objR;
                }
            } else {
                a23Var2.L$0 = w5cVar;
                a23Var2.L$1 = a26Var;
                a23Var2.label = 3;
                objA = A(w5cVar, true, a23Var2);
                if (objA != obj) {
                    w5cVar2 = w5cVar;
                    a26Var2 = a26Var;
                }
            }
        }
        if (i3 == 1) {
            jzb.q(objA);
            return objA;
        }
        if (i3 == 2) {
            jzb.q(objA);
            return objA;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                jzb.q(objA);
                return objA;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        a26Var2 = (a26) a23Var2.L$1;
        w5cVar2 = (w5c) a23Var2.L$0;
        jzb.q(objA);
        z13 z13Var = new z13(null, a26Var2, w5cVar2);
        a23Var2.L$0 = null;
        a23Var2.L$1 = null;
        a23Var2.label = 4;
        Object objP0 = ynb.p0((pv2) objA, z13Var, a23Var2);
        return objP0 == obj ? obj : objP0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object K(xn2 xn2Var, a26 a26Var, w5c w5cVar, boolean z2, boolean z3) {
        h23 h23Var;
        boolean z4;
        a26 a26Var2;
        w5c w5cVar2;
        boolean z5;
        if (xn2Var instanceof h23) {
            h23Var = (h23) xn2Var;
            int i2 = h23Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h23Var.label = i2 - Integer.MIN_VALUE;
            } else {
                h23Var = new h23(xn2Var);
            }
        } else {
            h23Var = new h23(xn2Var);
        }
        h23 h23Var2 = h23Var;
        Object obj = h23Var2.result;
        int i3 = h23Var2.label;
        bw2 bw2Var = bw2.a;
        if (i3 == 0) {
            jzb.q(obj);
            if (w5cVar.k() && w5cVar.o() && w5cVar.l()) {
                j23 j23Var = new j23(null, a26Var, w5cVar, z3, z2);
                h23Var2.label = 1;
                Object objR = w5cVar.r(z2, j23Var, h23Var2);
                if (objR != bw2Var) {
                    return objR;
                }
            } else {
                z4 = z3;
                h23Var2.L$0 = w5cVar;
                h23Var2.L$1 = a26Var;
                h23Var2.Z$0 = z2;
                h23Var2.Z$1 = z4;
                h23Var2.label = 2;
                pv2 pv2VarA = A(w5cVar, z4, h23Var2);
                if (pv2VarA != bw2Var) {
                    a26Var2 = a26Var;
                    w5cVar2 = w5cVar;
                    obj = pv2VarA;
                    z5 = z2;
                }
            }
        }
        if (i3 == 1) {
            jzb.q(obj);
            return obj;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z4 = h23Var2.Z$1;
        boolean z6 = h23Var2.Z$0;
        a26 a26Var3 = (a26) h23Var2.L$1;
        w5c w5cVar3 = (w5c) h23Var2.L$0;
        jzb.q(obj);
        z5 = z6;
        a26Var2 = a26Var3;
        w5cVar2 = w5cVar3;
        g23 g23Var = new g23(null, a26Var2, w5cVar2, z5, z4);
        h23Var2.L$0 = null;
        h23Var2.L$1 = null;
        h23Var2.label = 3;
        Object objP0 = ynb.p0((pv2) obj, g23Var, h23Var2);
        return objP0 == bw2Var ? bw2Var : objP0;
    }

    public static final boolean L(oo5 oo5Var, it3 it3Var) {
        Object[] objArr = new oo5[16];
        if (!oo5Var.a.Y) {
            i37.c("visitChildren called on an unattached node");
        }
        p89 p89Var = new p89(0, new i09[16]);
        i09 i09Var = oo5Var.a;
        i09 i09Var2 = i09Var.f;
        if (i09Var2 == null) {
            vd0.H(p89Var, i09Var);
        } else {
            p89Var.b(i09Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = p89Var.c;
            if (i3 == 0) {
                break;
            }
            i09 i09VarM0 = (i09) p89Var.k(i3 - 1);
            if ((i09VarM0.d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                vd0.H(p89Var, i09VarM0);
            } else {
                while (i09VarM0 != null) {
                    if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        p89 p89Var2 = null;
                        while (i09VarM0 != null) {
                            if (i09VarM0 instanceof oo5) {
                                oo5 oo5Var2 = (oo5) i09VarM0;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = oo5Var2;
                                i2 = i4;
                            } else if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM0 instanceof sv3)) {
                                int i5 = 0;
                                for (i09 i09Var3 = ((sv3) i09VarM0).E0; i09Var3 != null; i09Var3 = i09Var3.f) {
                                    if ((i09Var3.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            i09VarM0 = i09Var3;
                                        } else {
                                            if (p89Var2 == null) {
                                                p89Var2 = new p89(0, new i09[16]);
                                            }
                                            if (i09VarM0 != null) {
                                                p89Var2.b(i09VarM0);
                                                i09VarM0 = null;
                                            }
                                            p89Var2.b(i09Var3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            i09VarM0 = vd0.m0(p89Var2);
                        }
                        break;
                    }
                    i09VarM0 = i09VarM0.f;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, ww2.c);
        int i6 = i2 - 1;
        if (i6 < objArr.length) {
            while (i6 >= 0) {
                oo5 oo5Var3 = (oo5) objArr[i6];
                if (vpf.I(oo5Var3) && k(oo5Var3, it3Var)) {
                    return true;
                }
                i6--;
            }
        }
        return false;
    }

    public static final boolean M(oo5 oo5Var, it3 it3Var) {
        Object[] objArr = new oo5[16];
        if (!oo5Var.a.Y) {
            i37.c("visitChildren called on an unattached node");
        }
        p89 p89Var = new p89(0, new i09[16]);
        i09 i09Var = oo5Var.a;
        i09 i09Var2 = i09Var.f;
        if (i09Var2 == null) {
            vd0.H(p89Var, i09Var);
        } else {
            p89Var.b(i09Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = p89Var.c;
            if (i3 == 0) {
                break;
            }
            i09 i09VarM0 = (i09) p89Var.k(i3 - 1);
            if ((i09VarM0.d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                vd0.H(p89Var, i09VarM0);
            } else {
                while (i09VarM0 != null) {
                    if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        p89 p89Var2 = null;
                        while (i09VarM0 != null) {
                            if (i09VarM0 instanceof oo5) {
                                oo5 oo5Var2 = (oo5) i09VarM0;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = oo5Var2;
                                i2 = i4;
                            } else if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM0 instanceof sv3)) {
                                int i5 = 0;
                                for (i09 i09Var3 = ((sv3) i09VarM0).E0; i09Var3 != null; i09Var3 = i09Var3.f) {
                                    if ((i09Var3.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            i09VarM0 = i09Var3;
                                        } else {
                                            if (p89Var2 == null) {
                                                p89Var2 = new p89(0, new i09[16]);
                                            }
                                            if (i09VarM0 != null) {
                                                p89Var2.b(i09VarM0);
                                                i09VarM0 = null;
                                            }
                                            p89Var2.b(i09Var3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            i09VarM0 = vd0.m0(p89Var2);
                        }
                        break;
                    }
                    i09VarM0 = i09VarM0.f;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, ww2.c);
        for (int i6 = 0; i6 < i2; i6++) {
            oo5 oo5Var3 = (oo5) objArr[i6];
            if (vpf.I(oo5Var3) && w(oo5Var3, it3Var)) {
                return true;
            }
        }
        return false;
    }

    public static int P(yhb yhbVar) throws IOException {
        try {
            f41 f41Var = yhbVar.b;
            yhbVar.h0(1L);
            long j2 = 0;
            while (true) {
                long j3 = j2 + 1;
                if (!yhbVar.request(j3)) {
                    break;
                }
                byte bG = f41Var.G(j2);
                if ((bG >= 48 && bG <= 57) || (j2 == 0 && bG == 45)) {
                    j2 = j3;
                }
                if (j2 != 0) {
                    break;
                }
                tq.o(16);
                String string = Integer.toString(bG, 16);
                string.getClass();
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            long jF0 = f41Var.F0();
            String strG0 = yhbVar.g0(Long.MAX_VALUE);
            if (jF0 >= 0 && jF0 <= 2147483647L && strG0.length() <= 0) {
                return (int) jF0;
            }
            throw new IOException("expected an int but was \"" + jF0 + strG0 + '\"');
        } catch (NumberFormatException e2) {
            yg5.m(e2.getMessage());
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:129:0x019e  */
    /* JADX WARN: Code duplicated, block: B:158:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[ADDED_TO_REGION, LOOP:6: B:92:0x013a->B:120:0x0187, LOOP_START, PHI: r13
  0x013a: PHI (r13v13 i09) = (r13v7 i09), (r13v14 i09) binds: [B:91:0x0138, B:120:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    public static final boolean Q(oo5 oo5Var, oo5 oo5Var2, int i2, it3 it3Var) {
        i09 i09Var;
        i09 i09Var2;
        LayoutNode layoutNodeS0;
        wo0 wo0Var;
        i09 i09VarM0;
        p89 p89Var;
        if (oo5Var.q1() != ko5.b) {
            qc0.p("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new oo5[16];
        if (!oo5Var.a.Y) {
            i37.c("visitChildren called on an unattached node");
        }
        p89 p89Var2 = new p89(0, new i09[16]);
        i09 i09Var3 = oo5Var.a;
        i09 i09Var4 = i09Var3.f;
        if (i09Var4 == null) {
            vd0.H(p89Var2, i09Var3);
        } else {
            p89Var2.b(i09Var4);
        }
        int i3 = 0;
        while (true) {
            int i4 = p89Var2.c;
            i09Var = null;
            if (i4 == 0) {
                break;
            }
            i09 i09VarM1 = (i09) p89Var2.k(i4 - 1);
            if ((i09VarM1.d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                vd0.H(p89Var2, i09VarM1);
            } else {
                while (i09VarM1 != null) {
                    if ((i09VarM1.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        p89 p89Var3 = null;
                        while (i09VarM1 != null) {
                            if (i09VarM1 instanceof oo5) {
                                oo5 oo5Var3 = (oo5) i09VarM1;
                                int i5 = i3 + 1;
                                if (objArr.length < i5) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i5, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i3] = oo5Var3;
                                i3 = i5;
                            } else if ((i09VarM1.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM1 instanceof sv3)) {
                                int i6 = 0;
                                for (i09 i09Var5 = ((sv3) i09VarM1).E0; i09Var5 != null; i09Var5 = i09Var5.f) {
                                    if ((i09Var5.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            i09VarM1 = i09Var5;
                                        } else {
                                            if (p89Var3 == null) {
                                                p89Var3 = new p89(0, new i09[16]);
                                            }
                                            if (i09VarM1 != null) {
                                                p89Var3.b(i09VarM1);
                                                i09VarM1 = null;
                                            }
                                            p89Var3.b(i09Var5);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            i09VarM1 = vd0.m0(p89Var3);
                        }
                        break;
                    }
                    i09VarM1 = i09VarM1.f;
                }
            }
        }
        Arrays.sort(objArr, 0, i3, ww2.c);
        if (i2 != 1) {
            if (i2 != 2) {
                qc0.p("This function should only be used for 1-D focus search");
                return false;
            }
            z67 z67VarC0 = mh3.c0(0, i3);
            int i7 = z67VarC0.a;
            int i8 = z67VarC0.b;
            if (i7 <= i8) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        oo5 oo5Var4 = (oo5) objArr[i8];
                        if (vpf.I(oo5Var4) && k(oo5Var4, it3Var)) {
                            return true;
                        }
                    }
                    if (pa7.t(objArr[i8], oo5Var2)) {
                        z2 = true;
                    }
                    if (i8 == i7) {
                        break;
                    }
                    i8--;
                }
            }
            if (i2 != 1) {
                if (!oo5Var.a.Y) {
                    i37.c("visitAncestors called on an unattached node");
                }
                i09Var2 = oo5Var.a.e;
                layoutNodeS0 = vd0.s0(oo5Var);
                loop5: while (layoutNodeS0 != null) {
                    if ((((i09) layoutNodeS0.V0.g).d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        while (i09Var2 != null) {
                            if ((i09Var2.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                i09VarM0 = i09Var2;
                                p89Var = null;
                                while (i09VarM0 != null) {
                                    if (i09VarM0 instanceof oo5) {
                                        i09Var = i09VarM0;
                                        break loop5;
                                    }
                                    if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                                    }
                                    i09VarM0 = vd0.m0(p89Var);
                                }
                            }
                            i09Var2 = i09Var2.e;
                        }
                    }
                    layoutNodeS0 = layoutNodeS0.F();
                    if (layoutNodeS0 != null) {
                    }
                }
                if (i09Var != null) {
                    return ((Boolean) it3Var.d(oo5Var)).booleanValue();
                }
            }
            return false;
        }
        z67 z67VarC1 = mh3.c0(0, i3);
        int i9 = z67VarC1.a;
        int i10 = z67VarC1.b;
        if (i9 <= i10) {
            boolean z3 = false;
            while (true) {
                if (z3) {
                    oo5 oo5Var5 = (oo5) objArr[i9];
                    if (vpf.I(oo5Var5) && w(oo5Var5, it3Var)) {
                        return true;
                    }
                }
                if (pa7.t(objArr[i9], oo5Var2)) {
                    z3 = true;
                }
                if (i9 == i10) {
                    break;
                }
                i9++;
            }
        }
        if (i2 != 1 && oo5Var.n1().a) {
            if (!oo5Var.a.Y) {
                i37.c("visitAncestors called on an unattached node");
            }
            i09Var2 = oo5Var.a.e;
            layoutNodeS0 = vd0.s0(oo5Var);
            loop5: while (layoutNodeS0 != null) {
                if ((((i09) layoutNodeS0.V0.g).d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    while (i09Var2 != null) {
                        if ((i09Var2.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            i09VarM0 = i09Var2;
                            p89Var = null;
                            while (i09VarM0 != null) {
                                if (i09VarM0 instanceof oo5) {
                                    i09Var = i09VarM0;
                                    break loop5;
                                }
                                if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 && (i09VarM0 instanceof sv3)) {
                                    int i11 = 0;
                                    for (i09 i09Var6 = ((sv3) i09VarM0).E0; i09Var6 != null; i09Var6 = i09Var6.f) {
                                        if ((i09Var6.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                i09VarM0 = i09Var6;
                                            } else {
                                                if (p89Var == null) {
                                                    p89Var = new p89(0, new i09[16]);
                                                }
                                                if (i09VarM0 != null) {
                                                    p89Var.b(i09VarM0);
                                                    i09VarM0 = null;
                                                }
                                                p89Var.b(i09Var6);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                i09VarM0 = vd0.m0(p89Var);
                            }
                        }
                        i09Var2 = i09Var2.e;
                    }
                }
                layoutNodeS0 = layoutNodeS0.F();
                i09Var2 = (layoutNodeS0 != null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
            }
            if (i09Var != null) {
                return ((Boolean) it3Var.d(oo5Var)).booleanValue();
            }
        }
        return false;
    }

    public static String R(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3) ? ib8.j("CornerRadius.circular(", k99.O(Float.intBitsToFloat(i2)), ")") : tec.m("CornerRadius.elliptical(", k99.O(Float.intBitsToFloat(i2)), ", ", k99.O(Float.intBitsToFloat(i3)), ")");
    }

    public static Set S(si6 si6Var) {
        int size = si6Var.size();
        TreeSet treeSet = null;
        for (int i2 = 0; i2 < size; i2++) {
            if ("Vary".equalsIgnoreCase(xdc.i(si6Var, i2))) {
                String strK = xdc.k(si6Var, i2);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    comparator.getClass();
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = v4e.d0(strK, new char[]{','}, 6).iterator();
                while (it.hasNext()) {
                    treeSet.add(v4e.o0((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? xu4.a : treeSet;
    }

    public static final j09 T(j09 j09Var) {
        return j09Var.D(new ka7());
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b8 A[Catch: all -> 0x00b4, PHI: r2
  0x00b8: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:62:0x00e7, B:12:0x0023, B:52:0x00b7, B:53:0x00b8, B:65:0x00eb, B:54:0x00b9, B:60:0x00e5, B:59:0x00c3, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040), top: B:77:0x0003, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader U() {
        ClassLoader classLoader;
        SecurityException e2;
        Thread thread;
        ThreadGroup threadGroup;
        classLoader = a;
        if (classLoader == null) {
            Thread thread2 = b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = b.getContextClassLoader();
                    } catch (SecurityException e3) {
                        String message = e3.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 41);
                        sb.append("Failed to get thread context classloader ");
                        sb.append(message);
                        b1.l("DynamiteLoaderV2CL", sb.toString());
                    }
                }
                classLoader = contextClassLoader;
                a = classLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i2 = 0;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i3];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i3++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i2 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i2];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (thread == null) {
                                    try {
                                        fh0 fh0Var = new fh0(threadGroup, "GmsDynamite");
                                        try {
                                            fh0Var.setContextClassLoader(null);
                                            fh0Var.start();
                                            thread = fh0Var;
                                        } catch (SecurityException e4) {
                                            e2 = e4;
                                            thread = fh0Var;
                                            String message2 = e2.getMessage();
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb2.append("Failed to enumerate thread/threadgroup ");
                                            sb2.append(message2);
                                            b1.l("DynamiteLoaderV2CL", sb2.toString());
                                        }
                                    } catch (SecurityException e5) {
                                        e2 = e5;
                                    }
                                }
                            } catch (SecurityException e6) {
                                e2 = e6;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = b.getContextClassLoader();
                    }
                }
                classLoader = contextClassLoader;
                a = classLoader;
            }
        }
        return classLoader;
    }

    public static r41 a(int i2, i41 i41Var, a26 a26Var, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = i3 & 2;
        i41 i41Var2 = i41.a;
        if (i4 != 0) {
            i41Var = i41Var2;
        }
        if ((i3 & 4) != 0) {
            a26Var = null;
        }
        if (i2 == -2) {
            if (i41Var != i41Var2) {
                return new tj2(1, i41Var, a26Var);
            }
            yv1.p.getClass();
            return new r41(xv1.b, a26Var);
        }
        if (i2 == -1) {
            if (i41Var == i41Var2) {
                return new tj2(1, i41.b, a26Var);
            }
            qc0.j("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i2 == 0) {
            return i41Var == i41Var2 ? new r41(0, a26Var) : new tj2(1, i41Var, a26Var);
        }
        if (i2 != Integer.MAX_VALUE) {
            return i41Var == i41Var2 ? new r41(i2, a26Var) : new tj2(i2, i41Var, a26Var);
        }
        return new r41(Integer.MAX_VALUE, a26Var);
    }

    public static final void b(fwc fwcVar, dd2 dd2Var, l46 l46Var, int i2) {
        l46Var.h0(-614342087);
        int i3 = (l46Var.i(fwcVar) ? 4 : 2) | i2;
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            l46Var.f0(-1009319487);
            b21.o(vd0.x0(y7h.M(new awc(fwcVar, null)), fwcVar.g, new bwc(fwcVar, null), null, new cvc(fwcVar, 3)), dd2Var, l46Var, 48);
            l46Var.r(false);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fa2(fwcVar, dd2Var, i2, i4);
        }
    }

    public static final void c(cre creVar, dd2 dd2Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(1533506138);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(creVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(dd2Var) ? 32 : 16;
        }
        int i5 = 0;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            l46Var.f0(-885604480);
            b21.o(!creVar.i() ? g09.a : vd0.x0(y7h.M(new qqe(creVar, null)), creVar.x, new rqe(creVar, null), new sqe(creVar, null), new su2(creVar, i4)), dd2Var, l46Var, i3 & 112);
            l46Var.r(false);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ea2(creVar, dd2Var, i2, i5);
        }
    }

    public static final void d(jse jseVar, boolean z2, dd2 dd2Var, l46 l46Var, int i2) {
        int i3;
        j09 j09VarM;
        l46Var.h0(-1442752422);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(jseVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.h(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(dd2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            l46Var.f0(-1299459355);
            if (z2) {
                l46Var.f0(-1299415211);
                boolean zI = l46Var.i(jseVar);
                Object objR = l46Var.R();
                if (zI || objR == sf2.a) {
                    objR = new ga2(jseVar, null);
                    l46Var.p0(objR);
                }
                j09VarM = y7h.M((l26) objR);
                l46Var.r(false);
            } else {
                l46Var.f0(-1298836224);
                l46Var.r(false);
                j09VarM = g09.a;
            }
            b21.o(j09VarM, dd2Var, l46Var, (i3 >> 3) & 112);
            l46Var.r(false);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new da2(jseVar, z2, dd2Var, i2, 0);
        }
    }

    public static final void e(final TarotSkinIdentify tarotSkinIdentify, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, final x16 x16Var4, j09 j09Var, l46 l46Var, int i2) {
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        x16Var4.getClass();
        l46Var.h0(1440024535);
        int i3 = i2 | (l46Var.e(tarotSkinIdentify.ordinal()) ? 4 : 2) | (l46Var.h(z2) ? 32 : 16) | (l46Var.h(z3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.h(z5) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.h(z6) ? 131072 : 65536) | (l46Var.i(x16Var) ? 1048576 : 524288) | (l46Var.i(x16Var2) ? 8388608 : 4194304) | (l46Var.i(x16Var3) ? 67108864 : 33554432) | (l46Var.i(x16Var4) ? 536870912 : 268435456);
        int i4 = l46Var.g(j09Var) ? 4 : 2;
        if (l46Var.W(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            nk8.d(j09Var, ndb.f, af1.b0(470620461, new n26() { // from class: yh3
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    Object ci3Var;
                    gh6 gh6Var;
                    hi3 hi3Var;
                    aw2 aw2Var;
                    boolean z7;
                    e31 e31Var = (e31) obj;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    e31Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var2.g(e31Var) ? 4 : 2;
                    }
                    boolean zW = l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18);
                    wef wefVar = wef.a;
                    if (!zW) {
                        l46Var2.Z();
                        return wefVar;
                    }
                    float f2 = ((yi4) i7h.D(new yi4(e31Var.d() * 0.56f), new yi4(e31Var.c() * 0.6f))).a;
                    float f3 = f2 / 0.6f;
                    e89 e89VarI = q1c.i(x16Var2, l46Var2);
                    Object objR = l46Var2.R();
                    i8c i8cVar = sf2.a;
                    if (objR == i8cVar) {
                        objR = new qz9(22.0f);
                        l46Var2.p0(objR);
                    }
                    n69 n69Var = (n69) objR;
                    e89 e89VarJ = z8c.j(true, l46Var2, 390, 2);
                    gh6 gh6VarW0 = kj0.w0(l46Var2);
                    Object objR2 = l46Var2.R();
                    if (objR2 == i8cVar) {
                        objR2 = af1.E(l46Var2);
                        l46Var2.p0(objR2);
                    }
                    aw2 aw2Var2 = (aw2) objR2;
                    Object objR3 = l46Var2.R();
                    if (objR3 == i8cVar) {
                        objR3 = new hi3();
                        l46Var2.p0(objR3);
                    }
                    hi3 hi3Var2 = (hi3) objR3;
                    Object objR4 = l46Var2.R();
                    if (objR4 == i8cVar) {
                        objR4 = q1c.f(Boolean.FALSE);
                        l46Var2.p0(objR4);
                    }
                    e89 e89Var = (e89) objR4;
                    boolean z8 = z3;
                    boolean zH = l46Var2.h(z8) | l46Var2.g(e89VarI);
                    Object objR5 = l46Var2.R();
                    if (zH || objR5 == i8cVar) {
                        objR5 = new f8(z8, e89VarI, e89Var, 1);
                        l46Var2.p0(objR5);
                    }
                    x16 x16Var5 = (x16) objR5;
                    Object objR6 = l46Var2.R();
                    if (objR6 == i8cVar) {
                        objR6 = q1c.f(Boolean.FALSE);
                        l46Var2.p0(objR6);
                    }
                    e89 e89Var2 = (e89) objR6;
                    Object objR7 = l46Var2.R();
                    if (objR7 == i8cVar) {
                        objR7 = new zh3(e89Var2, null);
                        l46Var2.p0(objR7);
                    }
                    af1.o((l26) objR7, l46Var2, wefVar);
                    float f4 = z8 ? 1.25f : 1.0526316f;
                    boolean zBooleanValue = ((Boolean) e89Var2.getValue()).booleanValue();
                    boolean z9 = z2;
                    if (!zBooleanValue || z9) {
                        f4 = 1.0f;
                    }
                    h0e h0eVarB = vx.b(f4, b21.T(280, 0, hs4.a, 2), "boxStageScale", null, l46Var2, 3072, 20);
                    e89 e89VarI2 = q1c.i(x16Var, l46Var2);
                    boolean z10 = z5;
                    Boolean boolValueOf = Boolean.valueOf(z10);
                    Boolean boolValueOf2 = Boolean.valueOf(z9);
                    boolean zH2 = l46Var2.h(z10) | l46Var2.h(z9) | l46Var2.g(e89VarI2);
                    Object objR8 = l46Var2.R();
                    if (zH2 || objR8 == i8cVar) {
                        objR8 = new ai3(z10, z9, e89VarI2, null);
                        l46Var2.p0(objR8);
                    }
                    af1.p(boolValueOf, boolValueOf2, (l26) objR8, l46Var2);
                    e89 e89VarI3 = q1c.i(x16Var3, l46Var2);
                    Boolean boolValueOf3 = Boolean.valueOf(z10);
                    Boolean boolValueOf4 = Boolean.valueOf(z8);
                    boolean zH3 = l46Var2.h(z10) | l46Var2.h(z8);
                    boolean z11 = z6;
                    boolean zH4 = zH3 | l46Var2.h(z11) | l46Var2.g(e89VarI3) | l46Var2.i(hi3Var2) | l46Var2.i(aw2Var2);
                    Object objR9 = l46Var2.R();
                    if (zH4 || objR9 == i8cVar) {
                        gh6Var = gh6VarW0;
                        ci3Var = new ci3(z10, z8, z11, e89VarI3, hi3Var2, aw2Var2, n69Var, null);
                        hi3Var = hi3Var2;
                        aw2Var = aw2Var2;
                        n69Var = n69Var;
                        l46Var2.p0(ci3Var);
                    } else {
                        aw2Var = aw2Var2;
                        hi3Var = hi3Var2;
                        ci3Var = objR9;
                        gh6Var = gh6VarW0;
                    }
                    af1.p(boolValueOf3, boolValueOf4, (l26) ci3Var, l46Var2);
                    Boolean boolValueOf5 = Boolean.valueOf(z9);
                    boolean zH5 = l46Var2.h(z9) | l46Var2.i(hi3Var);
                    x16 x16Var6 = x16Var4;
                    boolean zG = zH5 | l46Var2.g(x16Var6);
                    Object objR10 = l46Var2.R();
                    if (zG || objR10 == i8cVar) {
                        z7 = z9;
                        objR10 = new di3(z7, hi3Var, x16Var6, n69Var, null);
                        l46Var2.p0(objR10);
                    } else {
                        z7 = z9;
                    }
                    af1.o((l26) objR10, l46Var2, boolValueOf5);
                    j09 j09VarM = b.m(g09.a, f2, f3);
                    boolean zG2 = l46Var2.g(h0eVarB);
                    Object objR11 = l46Var2.R();
                    if (zG2 || objR11 == i8cVar) {
                        objR11 = new wh1(1, h0eVarB);
                        l46Var2.p0(objR11);
                    }
                    j09 j09VarX = bzd.x(j09VarM, (a26) objR11);
                    Boolean boolValueOf6 = Boolean.valueOf(z7);
                    boolean zH6 = l46Var2.h(z7) | l46Var2.i(hi3Var) | l46Var2.g(x16Var5) | l46Var2.i(gh6Var) | l46Var2.i(aw2Var);
                    Object objR12 = l46Var2.R();
                    if (zH6 || objR12 == i8cVar) {
                        gi3 gi3Var = new gi3(z7, hi3Var, aw2Var, n69Var, x16Var5, gh6Var);
                        l46Var2.p0(gi3Var);
                        objR12 = gi3Var;
                    }
                    j09 j09VarA = ibe.a(j09VarX, boolValueOf6, (PointerInputEventHandler) objR12);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarA);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(LayoutNode.h1);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, xn8VarC);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    a6c.d(t72.H(new age(tarotSkinIdentify, (((fxe) e89VarJ.getValue()).a * 8.0f) - 5.0f, (((fxe) e89VarJ.getValue()).b * 8.0f) + ((qz9) n69Var).j(), z4)), b.c, 0L, l46Var2, 48);
                    l46Var2.r(true);
                    return wefVar;
                }
            }, l46Var), l46Var, (i4 & 14) | 3120, 4);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new v43(tarotSkinIdentify, z2, z3, z4, z5, z6, x16Var, x16Var2, x16Var3, x16Var4, j09Var, i2);
        }
    }

    public static zxb f(int i2, ar5 ar5Var, int i3) {
        if ((i3 & 2) != 0) {
            ar5Var = ar5.w;
        }
        return new zxb(i2, ar5Var, (i3 & 4) != 0 ? 0 : 1, new zq5(new yq5[0]));
    }

    public static final void g(x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        x16 x16Var3;
        l46 l46Var2;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(858735486);
        int i3 = (l46Var.i(x16Var) ? 4 : 2) | i2 | (l46Var.i(x16Var2) ? 32 : 16);
        int i4 = 18;
        boolean z2 = false;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            x16Var3 = x16Var2;
            l46Var2 = l46Var;
            t72.b(x16Var3, new s84(true, false, false), af1.b0(1930267335, new b20(x16Var2, x16Var, z2, i4), l46Var), l46Var2, ((i3 >> 3) & 14) | 432, 0);
        } else {
            x16Var3 = x16Var2;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i2, 19, x16Var, x16Var3);
        }
    }

    public static final rt h() {
        return new rt(new Paint(7));
    }

    public static final void i(final x16 x16Var, final x16 x16Var2, final x16 x16Var3, final a26 a26Var, final x16 x16Var4, l46 l46Var, final int i2) {
        x16 x16Var5;
        i8c i8cVar;
        int i3;
        boolean z2;
        int i4;
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        a26Var.getClass();
        x16Var4.getClass();
        l46Var2.h0(-713187487);
        int i5 = i2 | (l46Var2.i(x16Var) ? 4 : 2) | (l46Var2.i(x16Var2) ? 32 : 16) | (l46Var2.i(x16Var3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.i(x16Var4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var2.W(i5 & 1, (i5 & 9363) != 9362)) {
            pwf pwfVarA = qd8.a(l46Var2);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            aba abaVar = (aba) z5c.G(job.a.b(aba.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var2), null);
            e89 e89VarT = tm7.t(abaVar.c, l46Var2);
            Object objR = l46Var2.R();
            i8c i8cVar2 = sf2.a;
            if (objR == i8cVar2) {
                objR = q1c.f(Boolean.FALSE);
                l46Var2.p0(objR);
            }
            e89 e89Var = (e89) objR;
            Context context = (Context) l46Var2.k(uq.b);
            boolean z3 = (e89VarT.getValue() instanceof saa) && ((Boolean) e89Var.getValue()).booleanValue();
            boolean z4 = (e89VarT.getValue() instanceof uaa) && ((Boolean) e89Var.getValue()).booleanValue();
            boolean z5 = (e89VarT.getValue() instanceof taa) && ((Boolean) e89Var.getValue()).booleanValue();
            Boolean boolValueOf = Boolean.valueOf(z5);
            int i6 = i5 & 896;
            boolean zH = l46Var2.h(z5) | (i6 == 256);
            Object objR2 = l46Var2.R();
            if (zH || objR2 == i8cVar2) {
                objR2 = new oaa(z5, x16Var3, null);
                l46Var2.p0(objR2);
            }
            af1.o((l26) objR2, l46Var2, boolValueOf);
            if (z4) {
                l46Var2.f0(635540219);
                Object value = e89VarT.getValue();
                uaa uaaVar = value instanceof uaa ? (uaa) value : null;
                if (uaaVar == null) {
                    l46Var2.r(false);
                    ojb ojbVarV = l46Var2.v();
                    if (ojbVarV != null) {
                        final int i7 = 0;
                        ojbVarV.d = new l26(x16Var, x16Var2, x16Var3, a26Var, x16Var4, i2, i7) { // from class: naa
                            public final /* synthetic */ int a;
                            public final /* synthetic */ x16 b;
                            public final /* synthetic */ x16 c;
                            public final /* synthetic */ x16 d;
                            public final /* synthetic */ a26 e;
                            public final /* synthetic */ x16 f;

                            {
                                this.a = i7;
                            }

                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                int i8 = this.a;
                                wef wefVar = wef.a;
                                switch (i8) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iP = k99.P(1);
                                        urg.i(this.b, this.c, this.d, this.e, this.f, (l46) obj, iP);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iP2 = k99.P(1);
                                        urg.i(this.b, this.c, this.d, this.e, this.f, (l46) obj, iP2);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                        return;
                    }
                    return;
                }
                String str = uaaVar.a;
                String strQ = afc.q(R.string.personality_unfinished_test_content_resume, l46Var2);
                String strQ2 = afc.q(R.string.personality_unfinished_test_content_retry, l46Var2);
                s84 s84Var = new s84(true, false, 4);
                dd2 dd2Var = if9.c;
                Object objR3 = l46Var2.R();
                if (objR3 == i8cVar2) {
                    objR3 = new x08(e89Var, 21);
                    l46Var2.p0(objR3);
                }
                x16 x16Var6 = (x16) objR3;
                boolean z6 = i6 == 256;
                Object objR4 = l46Var2.R();
                if (z6 || objR4 == i8cVar2) {
                    objR4 = new k8(x16Var3, e89Var, 8);
                    l46Var2.p0(objR4);
                }
                x16 x16Var7 = (x16) objR4;
                boolean zG = ((i5 & 7168) == 2048) | l46Var2.g(str);
                Object objR5 = l46Var2.R();
                if (zG || objR5 == i8cVar2) {
                    objR5 = new n25(a26Var, str, e89Var, 22);
                    l46Var2.p0(objR5);
                }
                i8cVar = i8cVar2;
                i3 = 16384;
                i4 = 1;
                z2 = false;
                kj0.F(null, dd2Var, strQ, strQ2, false, false, s84Var, x16Var6, x16Var7, (x16) objR5, l46Var, 14155830, 48);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                i8cVar = i8cVar2;
                i3 = 16384;
                z2 = false;
                i4 = 1;
                l46Var2.f0(636437793);
                l46Var2.r(false);
            }
            int i8 = i3;
            boolean z7 = z2;
            int i9 = i4;
            x16Var5 = x16Var4;
            bzd.l(b.c, z3, 0L, null, null, af1.b0(-704428515, new qi3(context, x16Var4, x16Var, x16Var2, e89Var, abaVar), l46Var2), l46Var2, 1572870, 60);
            int i10 = (i5 & 57344) == i8 ? i9 : z7 ? 1 : 0;
            Object objR6 = l46Var2.R();
            if (i10 != 0 || objR6 == i8cVar) {
                objR6 = new k8(x16Var5, e89Var, 9);
                l46Var2.p0(objR6);
            }
            rxg.a(z7, (x16) objR6, l46Var2, z7 ? 1 : 0, i9);
        } else {
            x16Var5 = x16Var4;
            l46Var2.Z();
        }
        ojb ojbVarV2 = l46Var2.v();
        if (ojbVarV2 != null) {
            final int i11 = 1;
            final x16 x16Var8 = x16Var5;
            ojbVarV2.d = new l26(x16Var, x16Var2, x16Var3, a26Var, x16Var8, i2, i11) { // from class: naa
                public final /* synthetic */ int a;
                public final /* synthetic */ x16 b;
                public final /* synthetic */ x16 c;
                public final /* synthetic */ x16 d;
                public final /* synthetic */ a26 e;
                public final /* synthetic */ x16 f;

                {
                    this.a = i11;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i12 = this.a;
                    wef wefVar = wef.a;
                    switch (i12) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP = k99.P(1);
                            urg.i(this.b, this.c, this.d, this.e, this.f, (l46) obj, iP);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP2 = k99.P(1);
                            urg.i(this.b, this.c, this.d, this.e, this.f, (l46) obj, iP2);
                            break;
                    }
                    return wefVar;
                }
            };
        }
    }

    public static b68 j(ci6 ci6Var) {
        ci6Var.getClass();
        if (!(ci6Var instanceof ci6)) {
            ap.c();
            return null;
        }
        ArrayList arrayList = new ArrayList(20);
        for (int i2 = 0; i2 < 20; i2++) {
            arrayList.add(new y72(y72.b(y72.i, q3c.m(0.48f, 0.0f, ci6Var.a.b((i2 * 1.0f) / 19.0f)))));
        }
        return new b68(arrayList, null, ci6Var.b, ci6Var.c);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[RETURN] */
    public static final boolean k(oo5 oo5Var, it3 it3Var) {
        int iOrdinal = oo5Var.q1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                oo5 oo5VarC = vpf.C(oo5Var);
                if (oo5VarC == null) {
                    qc0.p("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = oo5VarC.q1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (k(oo5VarC, it3Var) || z(oo5Var, oo5VarC, 2, it3Var) || (oo5VarC.n1().a && ((Boolean) it3Var.d(oo5VarC)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            ap.c();
                            return false;
                        }
                        qc0.p("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                return z(oo5Var, oo5VarC, 2, it3Var);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    ap.c();
                    return false;
                }
                if (!L(oo5Var, it3Var)) {
                    if (!(oo5Var.n1().a ? ((Boolean) it3Var.d(oo5Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return L(oo5Var, it3Var);
    }

    public static q78 o(long j2, l46 l46Var) {
        long j3 = y72.k;
        m82 m82Var = (m82) l46Var.k(o82.a);
        q78 q78Var = m82Var.h0;
        if (q78Var == null) {
            q78 q78Var2 = new q78(o82.c(m82Var, cn1.w), o82.c(m82Var, cn1.F0), o82.c(m82Var, cn1.H0), o82.c(m82Var, cn1.J0), o82.c(m82Var, cn1.K0), o82.c(m82Var, cn1.M0), y72.b(o82.c(m82Var, cn1.y), cn1.z), y72.b(o82.c(m82Var, cn1.X), cn1.Y), y72.b(o82.c(m82Var, cn1.Z), cn1.E0));
            m82Var.h0 = q78Var2;
            q78Var = q78Var2;
        }
        return new q78(j2 != 16 ? j2 : q78Var.a, j3 != 16 ? j3 : q78Var.b, j3 != 16 ? j3 : q78Var.c, j3 != 16 ? j3 : q78Var.d, j3 != 16 ? j3 : q78Var.e, j3 != 16 ? j3 : q78Var.f, j3 != 16 ? j3 : q78Var.g, j3 != 16 ? j3 : q78Var.h, j3 != 16 ? j3 : q78Var.i);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final sa1 p(at7 at7Var, boolean z2) {
        vk7 vk7Var;
        sa1 fb1Var;
        sa1 g97Var;
        boolean zF;
        kt7 kt7VarF = at7Var.F();
        boolean zG = cgg.G(kt7VarF);
        uq7 uq7Var = kt7VarF.f;
        if (zG) {
            return swe.a;
        }
        xm7 xm7Var = kt7VarF.c;
        if (z2) {
            uq7Var.getClass();
            vk7Var = cn1.D(uq7Var).c;
        } else {
            uq7Var.getClass();
            vk7Var = cn1.D(uq7Var).d;
        }
        Method methodF = vk7Var != null ? xm7Var.F(vk7Var.E0, vk7Var.F0) : null;
        int i2 = 2;
        int i3 = 6;
        boolean z3 = false;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        if (methodF == null) {
            if (w6c.p(kt7VarF) && kt7VarF.getVisibility() == jo7.c) {
                Class clsW = w6c.w(((aob) s72.X0(kt7VarF.getParameters())).u());
                if (clsW == null) {
                    throw new pt7("Underlying property of inline class " + kt7VarF + " should have a field");
                }
                Method methodJ = w6c.j(clsW, kt7VarF);
                g97Var = ynb.Q(at7Var) ? new g97(methodJ, ynb.J(at7Var.F())) : new h97(methodJ);
            } else {
                Field fieldL = kt7VarF.l();
                if (fieldL == null) {
                    ho7.m(kt7VarF, "No accessors or field is found for property ");
                    return null;
                }
                boolean z4 = true;
                if ((xm7Var instanceof nm7) && ((nm7) xm7Var).S() == k22.COMPANION_OBJECT) {
                    Class<?> enclosingClass = af1.R((em7) xm7Var).getEnclosingClass();
                    enclosingClass.getClass();
                    em7 em7VarB = job.a.b(enclosingClass);
                    nm7 nm7Var = em7VarB instanceof nm7 ? (nm7) em7VarB : null;
                    if (nm7Var == null) {
                        zF = false;
                    } else if (nm7Var.S() == k22.INTERFACE || nm7Var.S() == k22.ANNOTATION_CLASS) {
                        wn7[] wn7VarArr = sj7.a;
                        uq7Var.getClass();
                        zF = sj7.b.F(sj7.a[6], uq7Var);
                    } else {
                        zF = true;
                    }
                } else {
                    zF = false;
                }
                if (!zF && Modifier.isStatic(fieldL.getModifiers())) {
                    q(at7Var);
                    fb1Var = z2 ? new xa1(fieldL, z3, i2) : new bb1(fieldL, !sqf.k(kt7VarF.getReturnType()), b7 == true ? 1 : 0, i2);
                } else if (z2) {
                    fb1Var = ynb.Q(at7Var) ? new va1(fieldL, ynb.J(at7Var.F())) : new xa1(fieldL, z4, b6 == true ? 1 : 0);
                } else {
                    fb1Var = ynb.Q(at7Var) ? new za1(fieldL, !sqf.k(kt7VarF.getReturnType()), ynb.J(at7Var.F())) : new bb1(fieldL, !sqf.k(kt7VarF.getReturnType()), z4, b5 == true ? 1 : 0);
                }
            }
            return w6c.h(g97Var, at7Var, pu4.a, false);
        }
        if (Modifier.isStatic(methodF.getModifiers())) {
            q(at7Var);
            fb1Var = ynb.Q(at7Var) ? new fb1(methodF, false, ynb.J(at7Var.F())) : new gb1(methodF, b2 == true ? 1 : 0, i3, i2);
        } else {
            fb1Var = ynb.Q(at7Var) ? new db1(methodF, ynb.J(at7Var.F())) : new gb1(methodF, b4 == true ? 1 : 0, i3, b3 == true ? 1 : 0);
        }
        g97Var = fb1Var;
        return w6c.h(g97Var, at7Var, pu4.a, false);
    }

    public static final void q(at7 at7Var) {
        if (at7Var.F().c instanceof nn7) {
            return;
        }
        StringBuilder sb = new StringBuilder("Only top-level properties are supported for now: ");
        sb.append(at7Var.F().c);
        String name = at7Var.getName();
        sb.append('/');
        sb.append(name);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static final String r(TarotSkinIdentify tarotSkinIdentify) {
        tarotSkinIdentify.getClass();
        switch (u65.a[tarotSkinIdentify.ordinal()]) {
            case 1:
            case 2:
                return "default";
            case 3:
                return "cat";
            case 4:
                return "romantic";
            case 5:
                return "puppet";
            case 6:
                return "symbolism";
            case 7:
                return "minimalism";
            case 8:
                return "fable";
            case 9:
                return "woodcut";
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return "dream";
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return "prism";
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return "midnight";
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return "darkgold";
            case 14:
                return "zenith_day";
            case 15:
                return "eternal_night";
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return "transformation";
            case 17:
                return "secret_manor";
            case 18:
                return "magic_awakening";
            default:
                ap.c();
                return null;
        }
    }

    public static boolean s(ca1 ca1Var, ca1 ca1Var2) {
        ca1Var.getClass();
        ca1Var2.getClass();
        if (!(ca1Var2 instanceof if7) || !(ca1Var instanceof c36)) {
            return false;
        }
        if7 if7Var = (if7) ca1Var2;
        if7Var.G().size();
        c36 c36Var = (c36) ca1Var;
        c36Var.G().size();
        List listG = if7Var.C0().G();
        listG.getClass();
        List listG2 = c36Var.a().G();
        listG2.getClass();
        for (iy9 iy9Var : s72.r1(listG, listG2)) {
            xrf xrfVar = (xrf) iy9Var.a();
            xrf xrfVar2 = (xrf) iy9Var.b();
            xrfVar.getClass();
            boolean z2 = H((c36) ca1Var2, xrfVar) instanceof wl7;
            xrfVar2.getClass();
            if (z2 != (H(c36Var, xrfVar2) instanceof wl7)) {
                return true;
            }
        }
        return false;
    }

    public static final void t(rv3 rv3Var, fj4 fj4Var) {
        Activity activity;
        ClipData clipData = fj4Var.a.getClipData();
        int itemCount = clipData.getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            Uri uri = clipData.getItemAt(i2).getUri();
            if (uri != null && pa7.t(uri.getScheme(), "content")) {
                if (((i09) rv3Var).a.Y) {
                    Context context = kj0.x0(rv3Var).getContext();
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            activity = null;
                            break;
                        } else {
                            if (context instanceof Activity) {
                                activity = (Activity) context;
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                    if (activity == null) {
                        return;
                    }
                    activity.requestDragAndDropPermissions(fj4Var.a);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x025e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0274  */
    /* JADX WARN: Code duplicated, block: B:121:0x028c  */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[PHI: r6
  0x003c: PHI (r6v1 cy4) = (r6v0 cy4), (r6v43 cy4) binds: [B:7:0x0011, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:335:0x0727  */
    /* JADX WARN: Code duplicated, block: B:391:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:394:0x07d9 A[LOOP:33: B:390:0x07cf->B:394:0x07d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:400:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:429:0x083d  */
    /* JADX WARN: Code duplicated, block: B:498:0x09bc A[LOOP:43: B:120:0x028a->B:498:0x09bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:501:0x09d6 A[LOOP:42: B:115:0x026e->B:501:0x09d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:593:0x07dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x07e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x09ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x09d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x0296 A[EDGE_INSN: B:615:0x0296->B:123:0x0296 BREAK  A[LOOP:42: B:115:0x026e->B:501:0x09d6], SYNTHETIC] */
    public static sy0 u(String str, int i2, int i3, Map map) throws vcg {
        int i4;
        boolean z2;
        boolean z3;
        Charset charsetForName;
        f09 f09Var;
        int i5;
        int iB;
        int i6;
        mtf mtfVarA;
        int iB2;
        int i7;
        mtf mtfVarA2;
        qy0 qy0Var;
        mtf mtfVar;
        nx1 nx1Var;
        int i8;
        int i9;
        int i10;
        int i11;
        byte[][] bArr;
        int i12;
        int i13;
        int i14;
        int i15;
        char c2;
        int[] iArr;
        q66 q66Var;
        q66 q66Var2;
        mtf mtfVar2;
        char c3;
        q66 q66Var3;
        if (str.isEmpty()) {
            qc0.j("Found empty contents");
            return null;
        }
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i2 + 'x' + i3);
        }
        int i16 = 4;
        cy4 cy4VarValueOf = cy4.L;
        if (map != null) {
            bv4 bv4Var = bv4.a;
            if (map.containsKey(bv4Var)) {
                cy4VarValueOf = cy4.valueOf(map.get(bv4Var).toString());
            }
            bv4 bv4Var2 = bv4.c;
            if (map.containsKey(bv4Var2)) {
                i4 = Integer.parseInt(map.get(bv4Var2).toString());
            } else {
                i4 = 4;
            }
        } else {
            i4 = 4;
        }
        Charset charset = dv4.b;
        if (map != null) {
            bv4 bv4Var3 = bv4.g;
            if (map.containsKey(bv4Var3) && Boolean.parseBoolean(map.get(bv4Var3).toString())) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (map != null) {
            bv4 bv4Var4 = bv4.f;
            if (map.containsKey(bv4Var4) && Boolean.parseBoolean(map.get(bv4Var4).toString())) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        bv4 bv4Var5 = bv4.b;
        boolean z4 = map != null && map.containsKey(bv4Var5);
        if (z4) {
            try {
                charsetForName = Charset.forName(map.get(bv4Var5).toString());
            } catch (UnsupportedCharsetException unused) {
                charsetForName = charset;
            }
        } else {
            charsetForName = charset;
        }
        int i17 = 1;
        int i18 = 2;
        f09 f09Var2 = f09.ECI;
        if (z3) {
            if (charsetForName.equals(charset)) {
                charsetForName = null;
            }
            zi0 zi0Var = new zi0();
            zi0Var.b = str;
            zi0Var.a = z2;
            zi0Var.c = new ds4(str, charsetForName);
            zi0Var.d = cy4VarValueOf;
            cy4 cy4Var = (cy4) zi0Var.d;
            mtf[] mtfVarArr = {zi0.p(wv8.SMALL), zi0.p(wv8.MEDIUM), zi0.p(wv8.LARGE)};
            gg7[] gg7VarArr = {zi0Var.l(mtfVarArr[0]), zi0Var.l(mtfVarArr[1]), zi0Var.l(mtfVarArr[2])};
            int i19 = Integer.MAX_VALUE;
            int i20 = -1;
            for (int i21 = 0; i21 < 3; i21++) {
                gg7 gg7Var = gg7VarArr[i21];
                int iQ = gg7Var.q((mtf) gg7Var.c);
                if (dv4.c(iQ, mtfVarArr[i21], cy4Var) && iQ < i19) {
                    i19 = iQ;
                    i20 = i21;
                }
            }
            if (i20 < 0) {
                throw new vcg("Data too big for any version");
            }
            gg7 gg7Var2 = gg7VarArr[i20];
            qy0Var = new qy0();
            for (vv8 vv8Var : (ArrayList) gg7Var2.b) {
                int i22 = vv8Var.c;
                gg7 gg7Var3 = vv8Var.e;
                zi0 zi0Var2 = (zi0) gg7Var3.d;
                f09 f09Var3 = vv8Var.a;
                qy0Var.b(f09Var3.a(), i16);
                int i23 = vv8Var.d;
                if (i23 > 0) {
                    qy0Var.b(vv8Var.a(), f09Var3.b((mtf) gg7Var3.c));
                }
                if (f09Var3 == f09Var2) {
                    qy0Var.b(((nx1) nx1.b.get(((ds4) zi0Var2.c).a[i22].charset().name())).a(), 8);
                } else if (i23 > 0) {
                    String str2 = (String) zi0Var2.b;
                    int i24 = vv8Var.b;
                    dv4.a(str2.substring(i24, i23 + i24), f09Var3, qy0Var, ((ds4) zi0Var2.c).a[i22].charset());
                }
                i16 = 4;
            }
            mtfVar = (mtf) gg7Var2.c;
        } else {
            Charset charset2 = s4e.b;
            f09 f09Var4 = f09.BYTE;
            if (charset2 == null || !charset2.equals(charsetForName) || !dv4.b(str)) {
                boolean z5 = false;
                boolean z6 = false;
                int i25 = 0;
                while (true) {
                    if (i25 < str.length()) {
                        char cCharAt = str.charAt(i25);
                        if (cCharAt >= '0' && cCharAt <= '9') {
                            z6 = true;
                        } else if ((cCharAt < '`' ? dv4.a[cCharAt] : -1) != -1) {
                            z5 = true;
                        }
                        i25++;
                    } else {
                        if (z5) {
                            f09Var = f09.ALPHANUMERIC;
                            break;
                        }
                        if (z6) {
                            f09Var = f09.NUMERIC;
                            break;
                        }
                    }
                    f09Var = f09Var4;
                    break;
                }
            }
            f09Var = f09.KANJI;
            qy0 qy0Var2 = new qy0();
            if (f09Var == f09Var4 && z4 && (nx1Var = (nx1) nx1.b.get(charsetForName.name())) != null) {
                i5 = 4;
                qy0Var2.b(f09Var2.a(), 4);
                qy0Var2.b(nx1Var.a(), 8);
            } else {
                i5 = 4;
            }
            if (z2) {
                qy0Var2.b(f09.FNC1_FIRST_POSITION.a(), i5);
            }
            qy0Var2.b(f09Var.a(), i5);
            qy0 qy0Var3 = new qy0();
            dv4.a(str, f09Var, qy0Var3, charsetForName);
            if (map != null) {
                bv4 bv4Var6 = bv4.d;
                if (map.containsKey(bv4Var6)) {
                    mtf mtfVarA3 = mtf.a(Integer.parseInt(map.get(bv4Var6).toString()));
                    if (!dv4.c(f09Var.b(mtfVarA3) + qy0Var2.b + qy0Var3.b, mtfVarA3, cy4VarValueOf)) {
                        throw new vcg("Data too big for requested version");
                    }
                    mtfVarA2 = mtfVarA3;
                } else {
                    iB = f09Var.b(mtf.a(1)) + qy0Var2.b + qy0Var3.b;
                    i6 = 1;
                    while (true) {
                        if (i6 <= 40) {
                            throw new vcg("Data too big");
                        }
                        mtfVarA = mtf.a(i6);
                        if (dv4.c(iB, mtfVarA, cy4VarValueOf)) {
                            iB2 = f09Var.b(mtfVarA) + qy0Var2.b + qy0Var3.b;
                            i7 = 1;
                            while (true) {
                                if (i7 <= 40) {
                                    throw new vcg("Data too big");
                                }
                                mtfVarA2 = mtf.a(i7);
                                if (dv4.c(iB2, mtfVarA2, cy4VarValueOf)) {
                                    break;
                                }
                                i7++;
                                cy4VarValueOf = cy4VarValueOf;
                            }
                        } else {
                            i6++;
                            cy4VarValueOf = cy4VarValueOf;
                        }
                    }
                }
            } else {
                iB = f09Var.b(mtf.a(1)) + qy0Var2.b + qy0Var3.b;
                i6 = 1;
                while (true) {
                    if (i6 <= 40) {
                        throw new vcg("Data too big");
                    }
                    mtfVarA = mtf.a(i6);
                    if (dv4.c(iB, mtfVarA, cy4VarValueOf)) {
                        iB2 = f09Var.b(mtfVarA) + qy0Var2.b + qy0Var3.b;
                        i7 = 1;
                        while (true) {
                            if (i7 <= 40) {
                                throw new vcg("Data too big");
                            }
                            mtfVarA2 = mtf.a(i7);
                            if (dv4.c(iB2, mtfVarA2, cy4VarValueOf)) {
                                break;
                                break;
                            }
                            i7++;
                            cy4VarValueOf = cy4VarValueOf;
                        }
                    } else {
                        i6++;
                        cy4VarValueOf = cy4VarValueOf;
                    }
                }
            }
            qy0 qy0Var4 = new qy0();
            int i26 = qy0Var2.b;
            qy0Var4.c(i26);
            for (int i27 = 0; i27 < i26; i27++) {
                qy0Var4.a(qy0Var2.d(i27));
            }
            int iE = f09Var == f09Var4 ? qy0Var3.e() : str.length();
            int iB3 = f09Var.b(mtfVarA2);
            int i28 = 1 << iB3;
            if (iE >= i28) {
                StringBuilder sb = new StringBuilder();
                sb.append(iE);
                sb.append(" is bigger than ");
                sb.append(i28 - 1);
                throw new vcg(sb.toString());
            }
            qy0Var4.b(iE, iB3);
            int i29 = qy0Var3.b;
            qy0Var4.c(qy0Var4.b + i29);
            for (int i30 = 0; i30 < i29; i30++) {
                qy0Var4.a(qy0Var3.d(i30));
            }
            qy0Var = qy0Var4;
            mtfVar = mtfVarA2;
        }
        sug sugVar = mtfVar.b[cy4VarValueOf.ordinal()];
        int i31 = mtfVar.c;
        int i32 = sugVar.b;
        h71[] h71VarArr = (h71[]) sugVar.c;
        int i33 = 0;
        for (h71 h71Var : h71VarArr) {
            i33 += h71Var.b;
        }
        int i34 = i31 - (i33 * i32);
        int i35 = i34 * 8;
        if (qy0Var.b > i35) {
            throw new vcg("data bits cannot fit in the QR Code" + qy0Var.b + " > " + i35);
        }
        for (int i36 = 0; i36 < 4 && qy0Var.b < i35; i36++) {
            qy0Var.a(false);
        }
        int i37 = qy0Var.b & 7;
        if (i37 > 0) {
            while (i37 < 8) {
                qy0Var.a(false);
                i37++;
            }
        }
        int iE2 = i34 - qy0Var.e();
        for (int i38 = 0; i38 < iE2; i38++) {
            qy0Var.b((i38 & 1) == 0 ? 236 : 17, 8);
        }
        if (qy0Var.b != i35) {
            throw new vcg("Bits size does not equal capacity");
        }
        int i39 = 0;
        for (h71 h71Var2 : h71VarArr) {
            i39 += h71Var2.b;
        }
        if (qy0Var.e() != i34) {
            throw new vcg("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i39);
        int i40 = 0;
        int i41 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i40 < i39) {
            int i42 = i4;
            int i43 = i17;
            int[] iArr2 = new int[i43];
            int[] iArr3 = new int[i43];
            if (i40 >= i39) {
                throw new vcg("Block ID too large");
            }
            int i44 = i31 % i39;
            int i45 = i39 - i44;
            int i46 = i31 / i39;
            int i47 = i34 / i39;
            int i48 = i47 + 1;
            int i49 = i46 - i47;
            int i50 = (i46 + 1) - i48;
            if (i49 != i50) {
                throw new vcg("EC bytes mismatch");
            }
            if (i39 != i45 + i44) {
                throw new vcg("RS blocks mismatch");
            }
            if (i31 != ((i48 + i50) * i44) + ((i47 + i49) * i45)) {
                throw new vcg("Total bytes mismatch");
            }
            if (i40 < i45) {
                c2 = 0;
                iArr2[0] = i47;
                iArr3[0] = i49;
            } else {
                c2 = 0;
                iArr2[0] = i48;
                iArr3[0] = i50;
            }
            int i51 = iArr2[c2];
            byte[] bArr2 = new byte[i51];
            int i52 = i41 * 8;
            int i53 = i40;
            int i54 = 0;
            while (i54 < i51) {
                int i55 = i54;
                int i56 = i39;
                int i57 = 0;
                for (int i58 = 0; i58 < 8; i58++) {
                    if (qy0Var.d(i52)) {
                        i57 = (1 << (7 - i58)) | i57;
                    }
                    i52++;
                }
                bArr2[i55] = (byte) i57;
                i54 = i55 + 1;
                i39 = i56;
            }
            int i59 = i39;
            int i60 = iArr3[0];
            int i61 = i51 + i60;
            int[] iArr4 = new int[i61];
            int i62 = 0;
            while (i62 < i51) {
                iArr4[i62] = bArr2[i62] & 255;
                i62++;
                i61 = i61;
            }
            int i63 = i61;
            p66 p66Var = p66.g;
            ArrayList arrayList2 = new ArrayList();
            qy0 qy0Var5 = qy0Var;
            cy4 cy4Var2 = cy4VarValueOf;
            arrayList2.add(new q66(p66Var, new int[]{1}));
            if (i60 == 0) {
                qc0.j("No error correction bytes");
                return null;
            }
            int i64 = i63 - i60;
            if (i64 <= 0) {
                qc0.j("No data bytes provided");
                return null;
            }
            if (i60 >= arrayList2.size()) {
                q66 q66Var4 = (q66) ks0.f(1, arrayList2);
                int size = arrayList2.size();
                while (size <= i60) {
                    int i65 = size;
                    int[] iArr5 = {1, p66Var.a[(size - 1) + p66Var.f]};
                    if (iArr5[0] == 0) {
                        mtfVar2 = mtfVar;
                        int i66 = i18;
                        int i67 = 1;
                        while (i67 < i66 && iArr5[i67] == 0) {
                            i67++;
                        }
                        if (i67 == i66) {
                            c3 = 0;
                            iArr5 = new int[]{0};
                        } else {
                            c3 = 0;
                            int i68 = 2 - i67;
                            int[] iArr6 = new int[i68];
                            System.arraycopy(iArr5, i67, iArr6, 0, i68);
                            iArr5 = iArr6;
                        }
                    } else {
                        mtfVar2 = mtfVar;
                        c3 = 0;
                    }
                    q66 q66Var5 = q66Var4;
                    p66 p66Var2 = q66Var5.a;
                    if (!p66Var2.equals(p66Var)) {
                        qc0.j("GenericGFPolys do not have same GenericGF field");
                        return null;
                    }
                    if (q66Var5.c() || iArr5[c3] == 0) {
                        q66Var3 = p66Var2.c;
                    } else {
                        int[] iArr7 = q66Var5.b;
                        int length = iArr7.length;
                        int length2 = iArr5.length;
                        int[] iArr8 = new int[(length + length2) - 1];
                        int[] iArr9 = iArr5;
                        int i69 = 0;
                        while (i69 < length) {
                            int i70 = length;
                            int i71 = iArr7[i69];
                            int i72 = i69;
                            int i73 = 0;
                            while (i73 < length2) {
                                int i74 = i72 + i73;
                                int i75 = i73;
                                iArr8[i74] = iArr8[i74] ^ p66Var2.a(i71, iArr9[i75]);
                                i73 = i75 + 1;
                            }
                            i69 = i72 + 1;
                            length = i70;
                        }
                        q66Var3 = new q66(p66Var2, iArr8);
                    }
                    arrayList2.add(q66Var3);
                    size = i65 + 1;
                    q66Var4 = q66Var3;
                    mtfVar = mtfVar2;
                    i31 = i31;
                    i34 = i34;
                    i18 = 2;
                }
            }
            mtf mtfVar3 = mtfVar;
            int i76 = i31;
            int i77 = i34;
            q66 q66Var6 = (q66) arrayList2.get(i60);
            int[] iArr10 = new int[i64];
            System.arraycopy(iArr4, 0, iArr10, 0, i64);
            if (i64 == 0) {
                cva.s();
                return null;
            }
            if (i64 > 1 && iArr10[0] == 0) {
                int i78 = 1;
                while (i78 < i64 && iArr10[i78] == 0) {
                    i78++;
                }
                if (i78 == i64) {
                    iArr10 = new int[]{0};
                } else {
                    int i79 = i64 - i78;
                    int[] iArr11 = new int[i79];
                    System.arraycopy(iArr10, i78, iArr11, 0, i79);
                    iArr10 = iArr11;
                }
            }
            if (i60 < 0) {
                cva.s();
                return null;
            }
            int length3 = iArr10.length;
            int[] iArr12 = new int[length3 + i60];
            int i80 = 0;
            while (i80 < length3) {
                iArr12[i80] = p66Var.a(iArr10[i80], 1);
                i80++;
                iArr10 = iArr10;
            }
            q66 q66Var7 = new q66(p66Var, iArr12);
            p66 p66Var3 = q66Var6.a;
            int[] iArr13 = q66Var6.b;
            boolean zEquals = p66Var.equals(p66Var3);
            q66 q66Var8 = p66Var.c;
            if (!zEquals) {
                qc0.j("GenericGFPolys do not have same GenericGF field");
                return null;
            }
            if (q66Var6.c()) {
                qc0.j("Divide by 0");
                return null;
            }
            int i81 = iArr13[(iArr13.length - 1) - q66Var6.b()];
            if (i81 == 0) {
                throw new ArithmeticException();
            }
            int i82 = p66Var.a[(p66Var.d - p66Var.b[i81]) - 1];
            q66 q66VarA = q66Var8;
            q66 q66VarA2 = q66Var7;
            while (true) {
                q66 q66Var9 = q66Var8;
                if (q66VarA2.b() < q66Var6.b() || q66VarA2.c()) {
                    break;
                }
                int iB4 = q66VarA2.b() - q66Var6.b();
                int iB5 = q66VarA2.b();
                int[] iArr14 = q66VarA2.b;
                int iA = p66Var.a(iArr14[(iArr14.length - 1) - iB5], i82);
                p66 p66Var4 = q66Var6.a;
                if (iB4 < 0) {
                    cva.s();
                    return null;
                }
                if (iA == 0) {
                    q66Var = p66Var4.c;
                    iArr = iArr13;
                } else {
                    int length4 = iArr13.length;
                    int[] iArr15 = new int[length4 + iB4];
                    iArr = iArr13;
                    int i83 = 0;
                    while (i83 < length4) {
                        iArr15[i83] = p66Var4.a(iArr[i83], iA);
                        i83++;
                        length4 = length4;
                    }
                    q66Var = new q66(p66Var4, iArr15);
                }
                if (iB4 < 0) {
                    cva.s();
                    return null;
                }
                if (iA == 0) {
                    q66Var2 = q66Var9;
                } else {
                    int[] iArr16 = new int[iB4 + 1];
                    iArr16[0] = iA;
                    q66Var2 = new q66(p66Var, iArr16);
                }
                q66VarA = q66VarA.a(q66Var2);
                q66VarA2 = q66VarA2.a(q66Var);
                q66Var8 = q66Var9;
                q66Var6 = q66Var6;
                i82 = i82;
                iArr13 = iArr;
            }
            int[] iArr17 = new q66[]{q66VarA, q66VarA2}[1].b;
            int length5 = i60 - iArr17.length;
            for (int i84 = 0; i84 < length5; i84++) {
                iArr4[i64 + i84] = 0;
            }
            System.arraycopy(iArr17, 0, iArr4, i64 + length5, iArr17.length);
            byte[] bArr3 = new byte[i60];
            for (int i85 = 0; i85 < i60; i85++) {
                bArr3[i85] = (byte) iArr4[i51 + i85];
            }
            arrayList.add(new d01(bArr2, bArr3));
            iMax = Math.max(iMax, i51);
            iMax2 = Math.max(iMax2, i60);
            i41 += iArr2[0];
            i40 = i53 + 1;
            i4 = i42;
            qy0Var = qy0Var5;
            i39 = i59;
            mtfVar = mtfVar3;
            cy4VarValueOf = cy4Var2;
            i31 = i76;
            i34 = i77;
            i17 = 1;
            i18 = 2;
        }
        mtf mtfVar4 = mtfVar;
        int i86 = i31;
        cy4 cy4Var3 = cy4VarValueOf;
        int i87 = i4;
        if (i34 != i41) {
            throw new vcg("Data bytes does not match offset");
        }
        qy0 qy0Var6 = new qy0();
        for (int i88 = 0; i88 < iMax; i88++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr4 = ((d01) it.next()).a;
                if (i88 < bArr4.length) {
                    qy0Var6.b(bArr4[i88], 8);
                }
            }
        }
        for (int i89 = 0; i89 < iMax2; i89++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr5 = ((d01) it2.next()).b;
                if (i89 < bArr5.length) {
                    qy0Var6.b(bArr5[i89], 8);
                }
            }
        }
        if (i86 != qy0Var6.e()) {
            StringBuilder sbN = ub3.n(i86, "Interleaving error: ", " and ");
            sbN.append(qy0Var6.e());
            sbN.append(" differ.");
            throw new vcg(sbN.toString());
        }
        int i90 = (mtfVar4.a * 4) + 17;
        yl9 yl9Var = new yl9(i90, i90, 2);
        int i91 = yl9Var.c;
        int i92 = yl9Var.b;
        if (map != null) {
            bv4 bv4Var7 = bv4.e;
            if (map.containsKey(bv4Var7)) {
                i9 = Integer.parseInt(map.get(bv4Var7).toString());
                i8 = 8;
                if (i9 < 0 || i9 >= 8) {
                }
            } else {
                i8 = 8;
            }
            i9 = -1;
        } else {
            i8 = 8;
            i9 = -1;
        }
        int i93 = -1;
        if (i9 == -1) {
            int i94 = Integer.MAX_VALUE;
            int i95 = 0;
            while (i95 < i8) {
                cy4 cy4Var4 = cy4Var3;
                m93.s(qy0Var6, cy4Var4, mtfVar4, i95, yl9Var);
                int i96 = 0;
                int iK = vpf.k(yl9Var, false) + vpf.k(yl9Var, true);
                byte[][] bArr6 = (byte[][]) yl9Var.d;
                int i97 = 0;
                int i98 = 0;
                while (i97 < i91 - 1) {
                    byte[] bArr7 = bArr6[i97];
                    int i99 = i96;
                    while (i99 < i92 - 1) {
                        byte b2 = bArr7[i99];
                        int i100 = i99 + 1;
                        int i101 = i99;
                        if (b2 == bArr7[i100]) {
                            byte[] bArr8 = bArr6[i97 + 1];
                            if (b2 == bArr8[i101] && b2 == bArr8[i100]) {
                                i98++;
                            }
                        }
                        i99 = i100;
                    }
                    i97++;
                    i96 = 0;
                }
                int i102 = (i98 * 3) + iK;
                int i103 = 0;
                for (int i104 = 0; i104 < i91; i104++) {
                    int i105 = 0;
                    while (i105 < i92) {
                        byte[] bArr9 = bArr6[i104];
                        int i106 = i105 + 6;
                        int i107 = i103;
                        if (i106 < i92) {
                            i10 = i102;
                            byte b3 = 1;
                            if (bArr9[i105] == 1 && bArr9[i105 + 1] == 0 && bArr9[i105 + 2] == 1 && bArr9[i105 + 3] == 1 && bArr9[i105 + 4] == 1 && bArr9[i105 + 5] == 0 && bArr9[i106] == 1) {
                                int i108 = i105 - 4;
                                if (i108 < 0 || bArr9.length < i105) {
                                    i13 = i105 + 7;
                                    i14 = i105 + 11;
                                    if (i13 >= 0 && bArr9.length >= i14) {
                                        while (true) {
                                            if (i13 < i14) {
                                                i15 = i13;
                                                if (bArr9[i13] == 1) {
                                                    i13 = i15 + 1;
                                                }
                                            } else {
                                                i103 = i107 + 1;
                                            }
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (i108 < i105) {
                                            if (bArr9[i108] == b3) {
                                                i13 = i105 + 7;
                                                i14 = i105 + 11;
                                                if (i13 >= 0) {
                                                    while (true) {
                                                        if (i13 < i14) {
                                                            i15 = i13;
                                                            if (bArr9[i13] == 1) {
                                                                i13 = i15 + 1;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                i108++;
                                                b3 = 1;
                                            }
                                        }
                                        i103 = i107 + 1;
                                    }
                                }
                            }
                            i11 = i104 + 6;
                            if (i11 < i91) {
                                byte b4 = 1;
                                if (bArr6[i104][i105] != 1 && bArr6[i104 + 1][i105] == 0 && bArr6[i104 + 2][i105] == 1 && bArr6[i104 + 3][i105] == 1 && bArr6[i104 + 4][i105] == 1 && bArr6[i104 + 5][i105] == 0 && bArr6[i11][i105] == 1) {
                                    int i109 = i104 - 4;
                                    if (i109 < 0 || bArr6.length < i104) {
                                        i12 = i104 + 7;
                                        int i110 = i104 + 11;
                                        if (i12 >= 0 || bArr6.length < i110) {
                                            bArr = bArr6;
                                        } else {
                                            while (true) {
                                                if (i12 < i110) {
                                                    bArr = bArr6;
                                                    if (bArr6[i12][i105] != 1) {
                                                        i12++;
                                                        bArr6 = bArr;
                                                    }
                                                } else {
                                                    bArr = bArr6;
                                                    i103++;
                                                }
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (i109 < i104) {
                                                if (bArr6[i109][i105] == b4) {
                                                    i12 = i104 + 7;
                                                    int i111 = i104 + 11;
                                                    if (i12 >= 0) {
                                                        bArr = bArr6;
                                                    } else {
                                                        bArr = bArr6;
                                                    }
                                                } else {
                                                    i109++;
                                                    b4 = 1;
                                                }
                                            }
                                            bArr = bArr6;
                                            i103++;
                                        }
                                    }
                                } else {
                                    bArr = bArr6;
                                }
                            } else {
                                bArr = bArr6;
                            }
                            i105++;
                            i102 = i10;
                            bArr6 = bArr;
                        } else {
                            i10 = i102;
                        }
                        i103 = i107;
                        i11 = i104 + 6;
                        if (i11 < i91) {
                            byte b5 = 1;
                            if (bArr6[i104][i105] != 1) {
                                bArr = bArr6;
                            } else {
                                bArr = bArr6;
                            }
                        } else {
                            bArr = bArr6;
                        }
                        i105++;
                        i102 = i10;
                        bArr6 = bArr;
                    }
                }
                byte[][] bArr10 = bArr6;
                int i112 = (i103 * 40) + i102;
                int i113 = 0;
                for (int i114 = 0; i114 < i91; i114++) {
                    byte[] bArr11 = bArr10[i114];
                    for (int i115 = 0; i115 < i92; i115++) {
                        if (bArr11[i115] == 1) {
                            i113++;
                        }
                    }
                }
                int i116 = i91 * i92;
                int iAbs = (((Math.abs((i113 * 2) - i116) * 10) / i116) * 10) + i112;
                if (iAbs < i94) {
                    i94 = iAbs;
                    i93 = i95;
                }
                i95++;
                cy4Var3 = cy4Var4;
                i8 = 8;
            }
            i9 = i93;
        }
        m93.s(qy0Var6, cy4Var3, mtfVar4, i9, yl9Var);
        int i117 = i87 * 2;
        int i118 = i92 + i117;
        int i119 = i117 + i91;
        int iMax3 = Math.max(i2, i118);
        int iMax4 = Math.max(i3, i119);
        int iMin = Math.min(iMax3 / i118, iMax4 / i119);
        int i120 = (iMax3 - (i92 * iMin)) / 2;
        int i121 = (iMax4 - (i91 * iMin)) / 2;
        sy0 sy0Var = new sy0();
        if (iMax3 < 1 || iMax4 < 1) {
            qc0.j("Both dimensions must be greater than 0");
            return null;
        }
        sy0Var.a = iMax3;
        sy0Var.b = iMax4;
        int i122 = (iMax3 + 31) / 32;
        sy0Var.c = i122;
        sy0Var.d = new int[i122 * iMax4];
        int i123 = 0;
        while (i123 < i91) {
            int i124 = i120;
            int i125 = 0;
            while (i125 < i92) {
                if (yl9Var.w(i125, i123) == 1) {
                    if (i121 < 0 || i124 < 0) {
                        qc0.j("Left and top must be nonnegative");
                        return null;
                    }
                    if (iMin < 1 || iMin < 1) {
                        qc0.j("Height and width must be at least 1");
                        return null;
                    }
                    int i126 = i124 + iMin;
                    int i127 = i121 + iMin;
                    if (i127 > sy0Var.b || i126 > sy0Var.a) {
                        qc0.j("The region must fit inside the matrix");
                        return null;
                    }
                    for (int i128 = i121; i128 < i127; i128++) {
                        int i129 = sy0Var.c * i128;
                        for (int i130 = i124; i130 < i126; i130++) {
                            int[] iArr18 = sy0Var.d;
                            int i131 = (i130 / 32) + i129;
                            iArr18[i131] = iArr18[i131] | (1 << (i130 & 31));
                        }
                    }
                }
                i125++;
                i124 += iMin;
            }
            i123++;
            i121 += iMin;
        }
        return sy0Var;
    }

    public static final boolean v(long j2, long j3) {
        return j2 == j3;
    }

    public static final boolean w(oo5 oo5Var, it3 it3Var) {
        int iOrdinal = oo5Var.q1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                oo5 oo5VarC = vpf.C(oo5Var);
                if (oo5VarC != null) {
                    return w(oo5VarC, it3Var) || z(oo5Var, oo5VarC, 1, it3Var);
                }
                qc0.p("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return oo5Var.n1().a ? ((Boolean) it3Var.d(oo5Var)).booleanValue() : M(oo5Var, it3Var);
                }
                ap.c();
                return false;
            }
        }
        return M(oo5Var, it3Var);
    }

    public static final boolean z(oo5 oo5Var, oo5 oo5Var2, int i2, it3 it3Var) {
        if (Q(oo5Var, oo5Var2, i2, it3Var)) {
            return true;
        }
        Boolean bool = (Boolean) b21.N(oo5Var, i2, new b92(i2, 3, ((bo5) vd0.t0(oo5Var).getFocusOwner()).g(), oo5Var, oo5Var2, it3Var));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public abstract void N(e2 e2Var, e2 e2Var2);

    public abstract void O(e2 e2Var, Thread thread);

    public abstract boolean l(f2 f2Var, w1 w1Var, w1 w1Var2);

    public abstract boolean m(f2 f2Var, Object obj, Object obj2);

    public abstract boolean n(f2 f2Var, e2 e2Var, e2 e2Var2);

    public abstract w1 x(f2 f2Var);

    public abstract e2 y(f2 f2Var);
}
