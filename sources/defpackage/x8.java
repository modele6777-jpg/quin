package defpackage;

import ai.askquin.R;
import android.content.Context;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x8 {
    public static final void a(final x9 x9Var, x16 x16Var, a26 a26Var, l46 l46Var, int i) {
        Object next;
        pwf pwfVarH;
        x9Var.getClass();
        x16Var.getClass();
        a26Var.getClass();
        l46Var.h0(1044706563);
        int i2 = i | (l46Var.i(x9Var) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            e89 e89VarT = tm7.t(x9Var.y, l46Var);
            e89 e89VarT2 = tm7.t(x9Var.z, l46Var);
            b1b b1bVar = uq.b;
            final Context context = (Context) l46Var.k(b1bVar);
            nfc nfcVarB = kr7.b(l46Var);
            boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
            Object obj = sf2.a;
            if (zBooleanValue) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(b1bVar);
                Object objR = l46Var.R();
                if (objR == obj) {
                    objR = v8.b;
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
            dc9 dc9Var = (dc9) z5c.G(job.a.b(dc9.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB, null);
            int i3 = i2 & 14;
            boolean z = i3 == 4 || l46Var.i(x9Var);
            Object objR2 = l46Var.R();
            if (z || objR2 == obj) {
                objR2 = new w8(x9Var, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, wef.a);
            mo3 mo3Var = (mo3) x9Var.b;
            String str = (String) mo3Var.b.getValue();
            if (v4e.Q(str)) {
                str = (String) mo3Var.c.getValue();
            }
            yof yofVar = (yof) e89VarT.getValue();
            String str2 = (String) x9Var.w.getValue();
            boolean zBooleanValue2 = ((Boolean) x9Var.x.getValue()).booleanValue();
            boolean z2 = ((dn0) e89VarT2.getValue()).a;
            boolean z3 = ((dn0) e89VarT2.getValue()).b;
            boolean z4 = i3 == 4 || l46Var.i(x9Var);
            Object objR3 = l46Var.R();
            if (z4 || objR3 == obj) {
                objR3 = new c1(3, x9Var);
                l46Var.p0(objR3);
            }
            a26 a26Var2 = (a26) objR3;
            boolean zI = l46Var.i(dc9Var);
            Object objR4 = l46Var.R();
            if (zI || objR4 == obj) {
                objR4 = new l8(dc9Var, 0);
                l46Var.p0(objR4);
            }
            x16 x16Var2 = (x16) objR4;
            boolean zI2 = (i3 == 4 || l46Var.i(x9Var)) | l46Var.i(context);
            Object objR5 = l46Var.R();
            if (zI2 || objR5 == obj) {
                final int i4 = 0;
                objR5 = new x16() { // from class: s8
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i5 = i4;
                        wef wefVar = wef.a;
                        Context context2 = context;
                        x9 x9Var2 = x9Var;
                        switch (i5) {
                            case 0:
                                u8 u8Var = new u8(context2, 1);
                                x9Var2.getClass();
                                ynb.V(hwf.a(x9Var2), null, null, new u9(x9Var2, null), 3).E(new c1(4, u8Var));
                                break;
                            default:
                                u8 u8Var2 = new u8(context2, 0);
                                x9Var2.getClass();
                                vz9 vz9Var = x9Var2.x;
                                if (!((Boolean) vz9Var.getValue()).booleanValue()) {
                                    vz9Var.setValue(Boolean.TRUE);
                                    ynb.V(hwf.a(x9Var2), null, null, new r9(x9Var2, u8Var2, null), 3);
                                }
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var.p0(objR5);
            }
            x16 x16Var3 = (x16) objR5;
            boolean zI3 = (i3 == 4 || l46Var.i(x9Var)) | l46Var.i(context);
            Object objR6 = l46Var.R();
            if (zI3 || objR6 == obj) {
                final int i5 = 1;
                objR6 = new x16() { // from class: s8
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i6 = i5;
                        wef wefVar = wef.a;
                        Context context2 = context;
                        x9 x9Var2 = x9Var;
                        switch (i6) {
                            case 0:
                                u8 u8Var = new u8(context2, 1);
                                x9Var2.getClass();
                                ynb.V(hwf.a(x9Var2), null, null, new u9(x9Var2, null), 3).E(new c1(4, u8Var));
                                break;
                            default:
                                u8 u8Var2 = new u8(context2, 0);
                                x9Var2.getClass();
                                vz9 vz9Var = x9Var2.x;
                                if (!((Boolean) vz9Var.getValue()).booleanValue()) {
                                    vz9Var.setValue(Boolean.TRUE);
                                    ynb.V(hwf.a(x9Var2), null, null, new r9(x9Var2, u8Var2, null), 3);
                                }
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var.p0(objR6);
            }
            b(str, yofVar, str2, zBooleanValue2, z2, z3, a26Var2, a26Var, x16Var2, x16Var3, (x16) objR6, x16Var, l46Var, (i2 << 15) & 29360128, i2 & 112, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x6(x9Var, x16Var, false, a26Var, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0131  */
    /* JADX WARN: Code duplicated, block: B:109:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x013d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x0145  */
    /* JADX WARN: Code duplicated, block: B:114:0x0148  */
    /* JADX WARN: Code duplicated, block: B:116:0x014c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0154  */
    /* JADX WARN: Code duplicated, block: B:120:0x0162  */
    /* JADX WARN: Code duplicated, block: B:123:0x0172  */
    /* JADX WARN: Code duplicated, block: B:125:0x0186  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0117  */
    public static final void b(final String str, final yof yofVar, String str2, boolean z, final boolean z2, boolean z3, final a26 a26Var, final a26 a26Var2, x16 x16Var, final x16 x16Var2, final x16 x16Var3, x16 x16Var4, l46 l46Var, int i, int i2, int i3) {
        int i4;
        String str3;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z6;
        x16 x16Var5;
        boolean z7;
        String str4;
        ojb ojbVarV;
        final String str5;
        final boolean z8;
        final x16 x16Var6;
        final boolean zF;
        y6c y6cVarA;
        Object objR;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        l46Var.h0(-776306005);
        if ((i & 6) == 0) {
            i4 = (l46Var.g(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= l46Var.i(yofVar) ? 32 : 16;
        }
        int i17 = i3 & 4;
        if (i17 == 0) {
            if ((i & 384) == 0) {
                str3 = str2;
                i4 |= l46Var.g(str3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i & 3072) == 0) {
                z4 = z;
                if (l46Var.h(z4)) {
                    i16 = 2048;
                } else {
                    i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i4 |= i16;
            } else {
                z4 = z;
            }
            if ((i & 24576) != 0) {
                if (l46Var.h(z2)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i15;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                i4 |= 196608;
                z5 = z3;
            } else {
                z5 = z3;
                if ((i & 196608) == 0) {
                    if (l46Var.h(z5)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
            }
            if ((i & 1572864) == 0) {
                if (l46Var.i(a26Var)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i4 |= i14;
            }
            if ((i & 12582912) == 0) {
                if (l46Var.i(a26Var2)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
            i7 = i3 & 256;
            if (i7 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (l46Var.i(x16Var)) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i4 |= i8;
            }
            if ((i & 805306368) == 0) {
                if (l46Var.i(x16Var2)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            if ((i2 & 6) == 0) {
                if (l46Var.i(x16Var3)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                i9 = i2 | i11;
            } else {
                i9 = i2;
            }
            if ((i2 & 48) == 0) {
                if (l46Var.i(x16Var4)) {
                    i10 = 32;
                } else {
                    i10 = 16;
                }
                i9 |= i10;
            }
            if ((i4 & 306783379) == 306783378 || (i9 & 19) != 18) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (l46Var.W(i4 & 1, z6)) {
                if (i17 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i5 != 0) {
                    z8 = false;
                } else {
                    z8 = z5;
                }
                if (i7 != 0) {
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = new q(2);
                        l46Var.p0(objR);
                    }
                    x16Var6 = (x16) objR;
                } else {
                    x16Var6 = x16Var;
                }
                zF = k8b.f((e8b) l46Var.k(l8b.a));
                if (zF) {
                    l46Var.f0(1294256017);
                    y6cVarA = eze.a(l46Var).a.j;
                    l46Var.r(false);
                } else {
                    l46Var.f0(1294256417);
                    l46Var.r(false);
                    y6cVarA = a7c.a();
                }
                final y6c y6cVar = y6cVarA;
                final boolean z9 = z4;
                str3 = str5;
                xdc.a(mh3.N(b.c), af1.b0(1964485991, new m(4, x16Var4), l46Var), null, null, null, 0, 0L, 0L, null, af1.b0(-307833028, new n26() { // from class: c8
                    /* JADX WARN: Code duplicated, block: B:70:0x0338  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.n26
                    public final Object m(Object obj, Object obj2, Object obj3) {
                        Object obj4;
                        e89 e89Var;
                        e89 e89Var2;
                        int i18;
                        Object obj5;
                        Object obj6;
                        e89 e89Var3;
                        int i19;
                        Object obj7;
                        Object obj8;
                        Object next;
                        pwf pwfVarH;
                        Object obj9;
                        e89 e89Var4;
                        Object obj10;
                        Object objR2;
                        Object obj11;
                        y6c y6cVarA2;
                        e89 e89Var5;
                        Object obj12;
                        xw9 xw9Var = (xw9) obj;
                        l46 l46Var2 = (l46) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        xw9Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= l46Var2.g(xw9Var) ? 4 : 2;
                        }
                        if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                            Object objR3 = l46Var2.R();
                            Object obj13 = sf2.a;
                            if (objR3 == obj13) {
                                obj4 = objR3;
                                Object objF = q1c.f(Boolean.FALSE);
                                l46Var2.p0(objF);
                                obj4 = objF;
                            }
                            obj4 = objR3;
                            e89 e89Var6 = (e89) obj4;
                            Object objR4 = l46Var2.R();
                            Object obj14 = objR4;
                            if (objR4 == obj13) {
                                Object objF2 = q1c.f(Boolean.FALSE);
                                l46Var2.p0(objF2);
                                obj14 = objF2;
                            }
                            e89 e89Var7 = (e89) obj14;
                            Object objR5 = l46Var2.R();
                            Object obj15 = objR5;
                            if (objR5 == obj13) {
                                Object objF3 = q1c.f(Boolean.FALSE);
                                l46Var2.p0(objF3);
                                obj15 = objF3;
                            }
                            e89 e89Var8 = (e89) obj15;
                            float f = k8b.e((e8b) l46Var2.k(l8b.a)) ? 8.0f : 0.0f;
                            g09 g09Var = g09.a;
                            j09 j09VarB0 = ynb.b0(f, 0.0f, b.d(b.c(g09Var, 1.0f), 64.0f), 2);
                            j09 j09VarB1 = ynb.b0((f * 2.0f) + 8.0f, 0.0f, g09Var, 2);
                            j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, ynb.Y(b.c(g09Var, 1.0f), xw9Var));
                            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
                            int iHashCode = Long.hashCode(l46Var2.T);
                            u8a u8aVarM = l46Var2.m();
                            j09 j09VarJ = m93.J(l46Var2, j09VarD0);
                            lf2.q.getClass();
                            l46Var2.j0();
                            if (l46Var2.S) {
                                l46Var2.l(LayoutNode.h1);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(hj6.z, l46Var2, c92VarA);
                            dec.l(hj6.y, l46Var2, u8aVarM);
                            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                            dec.k(l46Var2);
                            dec.l(hj6.x, l46Var2, j09VarJ);
                            j09 j09VarB2 = ynb.b0(eze.a(l46Var2).c.a, 0.0f, g09Var, 2);
                            String str6 = str;
                            String str7 = str5;
                            yof yofVar2 = yofVar;
                            a26 a26Var3 = a26Var2;
                            boolean z10 = z2;
                            boolean z11 = z8;
                            b4d.j(j09VarB2, null, af1.b0(1562869457, new e8(str6, j09VarB0, j09VarB1, str7, yofVar2, a26Var3, z10, z11, x16Var6, e89Var6), l46Var2), l46Var2, 384, 2);
                            o5c.f(l46Var2, new jw7(1.0f, true));
                            j09 j09VarB3 = ynb.b0(16.0f, 0.0f, b.d(b.c(g09Var, 1.0f), 56.0f), 2);
                            bx9 bx9Var = v51.a;
                            b1b b1bVar = o82.a;
                            u51 u51VarA = v51.a(((m82) l46Var2.k(b1bVar)).p, ((m82) l46Var2.k(b1bVar)).q, 0L, 0L, l46Var2, 12);
                            dd2 dd2Var = feg.b;
                            x16 x16Var7 = x16Var2;
                            x4d x4dVar = y6cVar;
                            cgg.a(x16Var7, j09VarB3, false, x4dVar, u51VarA, null, null, null, dd2Var, l46Var2, 805306416, 484);
                            j09 j09VarB4 = ynb.b0(16.0f, 0.0f, b.d(kv2.e(g09Var, 8.0f, l46Var2, g09Var, 1.0f), 56.0f), 2);
                            boolean z12 = z9;
                            boolean z13 = !z12;
                            boolean zH = l46Var2.h(z11);
                            Object objR6 = l46Var2.R();
                            if (zH || objR6 == obj13) {
                                e89Var = e89Var7;
                                e89Var2 = e89Var8;
                                i18 = 0;
                                Object f8Var = new f8(z11, e89Var2, e89Var, 0);
                                l46Var2.p0(f8Var);
                                obj5 = f8Var;
                            } else {
                                e89Var = e89Var7;
                                e89Var2 = e89Var8;
                                i18 = 0;
                                obj5 = objR6;
                            }
                            e89 e89Var9 = e89Var2;
                            boolean z14 = i18;
                            cgg.m((x16) obj5, j09VarB4, z13, x4dVar, null, null, af1.b0(1023320495, new g8(z12, i18), l46Var2), l46Var2, 805306416, 496);
                            l46Var2.r(true);
                            boolean zG = l46Var2.g(yofVar2);
                            Object objR7 = l46Var2.R();
                            Object obj16 = objR7;
                            if (zG || objR7 == obj13) {
                                Object useVar = new use(yofVar2.a, 2);
                                l46Var2.p0(useVar);
                                obj16 = useVar;
                            }
                            Object obj17 = (use) obj16;
                            if (((Boolean) e89Var6.getValue()).booleanValue()) {
                                l46Var2.f0(-894046772);
                                if (zF) {
                                    l46Var2.f0(525350082);
                                    y6cVarA2 = eze.a(l46Var2).a.j;
                                    l46Var2.r(z14);
                                } else {
                                    l46Var2.f0(525350482);
                                    l46Var2.r(z14);
                                    y6cVarA2 = a7c.a();
                                }
                                String strQ = afc.q(R.string.account_profile_edit_nickname, l46Var2);
                                s84 s84Var = new s84(true, z14, 4);
                                dd2 dd2VarB0 = af1.b0(-1924908986, new h8(z14 ? 1 : 0, obj17, y6cVarA2), l46Var2);
                                Object objR8 = l46Var2.R();
                                if (objR8 == obj13) {
                                    e89Var5 = e89Var6;
                                    Object i8Var = new i8(e89Var5, z14 ? 1 : 0);
                                    l46Var2.p0(i8Var);
                                    obj12 = i8Var;
                                } else {
                                    e89Var5 = e89Var6;
                                    obj12 = objR8;
                                }
                                x16 x16Var8 = (x16) obj12;
                                Object obj18 = a26Var;
                                boolean zG2 = l46Var2.g(obj18) | l46Var2.g(obj17);
                                Object objR9 = l46Var2.R();
                                Object obj19 = objR9;
                                if (zG2 || objR9 == obj13) {
                                    Object j8Var = new j8(obj18, obj17, e89Var5, z14 ? 1 : 0);
                                    l46Var2.p0(j8Var);
                                    obj19 = j8Var;
                                }
                                e89Var3 = e89Var;
                                obj6 = obj13;
                                kj0.F(strQ, dd2VarB0, null, null, false, false, s84Var, null, x16Var8, (x16) obj19, l46Var2, 102236208, 188);
                                l46Var2.r(z14);
                            } else {
                                obj6 = obj13;
                                e89Var3 = e89Var;
                                l46Var2.f0(-893129978);
                                l46Var2.r(z14);
                            }
                            if (((Boolean) e89Var3.getValue()).booleanValue()) {
                                l46Var2.f0(-893058585);
                                String strQ2 = afc.q(R.string.sure_to_delete_account, l46Var2);
                                s84 s84Var2 = new s84(true, z14, 4);
                                String strQ3 = afc.q(R.string.button_cancel, l46Var2);
                                String strQ4 = afc.q(R.string.do_delete, l46Var2);
                                dd2 dd2Var2 = feg.c;
                                x16 x16Var9 = x16Var3;
                                boolean zG3 = l46Var2.g(x16Var9);
                                Object objR10 = l46Var2.R();
                                if (zG3) {
                                    obj9 = obj6;
                                } else {
                                    obj9 = obj6;
                                    if (objR10 != obj9) {
                                        e89Var4 = e89Var3;
                                        obj10 = objR10;
                                    }
                                    x16 x16Var10 = (x16) obj10;
                                    objR2 = l46Var2.R();
                                    obj11 = objR2;
                                    if (objR2 == obj9) {
                                        Object i8Var2 = new i8(e89Var4, 1);
                                        l46Var2.p0(i8Var2);
                                        obj11 = i8Var2;
                                    }
                                    x16 x16Var11 = (x16) obj11;
                                    i19 = R.string.sure_to_delete_account;
                                    obj7 = obj9;
                                    kj0.F(strQ2, dd2Var2, strQ3, strQ4, false, false, s84Var2, null, x16Var10, x16Var11, l46Var2, 806879280, 176);
                                    l46Var2.r(z14);
                                }
                                e89Var4 = e89Var3;
                                Object k8Var = new k8(x16Var9, e89Var4, z14 ? 1 : 0);
                                l46Var2.p0(k8Var);
                                obj10 = k8Var;
                                x16 x16Var12 = (x16) obj10;
                                objR2 = l46Var2.R();
                                obj11 = objR2;
                                if (objR2 == obj9) {
                                    Object i8Var3 = new i8(e89Var4, 1);
                                    l46Var2.p0(i8Var3);
                                    obj11 = i8Var3;
                                }
                                x16 x16Var13 = (x16) obj11;
                                i19 = R.string.sure_to_delete_account;
                                obj7 = obj9;
                                kj0.F(strQ2, dd2Var2, strQ3, strQ4, false, false, s84Var2, null, x16Var12, x16Var13, l46Var2, 806879280, 176);
                                l46Var2.r(z14);
                            } else {
                                i19 = R.string.sure_to_delete_account;
                                obj7 = obj6;
                                l46Var2.f0(-892407802);
                                l46Var2.r(z14);
                            }
                            if (((Boolean) e89Var9.getValue()).booleanValue()) {
                                l46Var2.f0(-892323668);
                                b1b b1bVar2 = uq.b;
                                Object obj20 = (Context) l46Var2.k(b1bVar2);
                                nfc nfcVarB = kr7.b(l46Var2);
                                boolean zG4 = l46Var2.g(null) | l46Var2.g(nfcVarB);
                                Object objR11 = l46Var2.R();
                                if (zG4 || objR11 == obj7) {
                                    objR11 = nfcVarB.b(job.a.b(t7.class), null, null);
                                    l46Var2.p0(objR11);
                                }
                                Object obj21 = (t7) objR11;
                                nfc nfcVarB2 = kr7.b(l46Var2);
                                boolean zG5 = l46Var2.g(null) | l46Var2.g(nfcVarB2);
                                Object objR12 = l46Var2.R();
                                if (zG5 || objR12 == obj7) {
                                    objR12 = nfcVarB2.b(job.a.b(q9b.class), null, null);
                                    l46Var2.p0(objR12);
                                }
                                Object obj22 = (q9b) objR12;
                                nfc nfcVarB3 = kr7.b(l46Var2);
                                if (((Boolean) l46Var2.k(h57.a)).booleanValue()) {
                                    pwfVarH = ib8.h(l46Var2, 1471494079, l46Var2, z14);
                                } else {
                                    l46Var2.f0(1471494731);
                                    Object objK = l46Var2.k(b1bVar2);
                                    Object objR13 = l46Var2.R();
                                    if (objR13 == obj7) {
                                        obj8 = objR13;
                                        Object obj23 = v8.c;
                                        l46Var2.p0(obj23);
                                        obj8 = obj23;
                                    }
                                    obj8 = objR13;
                                    Iterator it = fyc.u((a26) obj8, objK).iterator();
                                    do {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (!(((Context) next) instanceof pwf));
                                    pwfVarH = (pwf) next;
                                    l46Var2.r(z14);
                                }
                                if (pwfVarH == null) {
                                    qc0.p("No ViewModelStoreOwner found in the context chain");
                                    return null;
                                }
                                Object obj24 = (dc9) z5c.G(job.a.b(dc9.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB3, null);
                                String strQ5 = afc.q(i19, l46Var2);
                                s84 s84Var3 = new s84(true, z14, 4);
                                String strQ6 = afc.q(R.string.button_confirm, l46Var2);
                                dd2 dd2Var3 = feg.d;
                                boolean zI = l46Var2.i(obj20) | l46Var2.i(obj22) | l46Var2.i(obj21) | l46Var2.i(obj24);
                                Object objR14 = l46Var2.R();
                                if (zI || objR14 == obj7) {
                                    objR14 = new m8(obj20, obj22, obj21, obj24, e89Var9, 0);
                                    l46Var2.p0(objR14);
                                }
                                kj0.F(strQ5, dd2Var3, strQ6, null, false, false, s84Var3, null, null, (x16) objR14, l46Var2, 102236208, 184);
                                l46Var2.r(z14);
                            } else {
                                l46Var2.f0(-891314618);
                                l46Var2.r(z14);
                            }
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, 805306416, 508);
                z7 = z8;
                x16Var5 = x16Var6;
            } else {
                l46Var.Z();
                x16Var5 = x16Var;
                z7 = z5;
            }
            str4 = str3;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new d8(str, yofVar, str4, z, z2, z7, a26Var, a26Var2, x16Var5, x16Var2, x16Var3, x16Var4, i, i2, i3);
            }
        }
        i4 |= 384;
        str3 = str2;
        if ((i & 3072) == 0) {
            z4 = z;
            if (l46Var.h(z4)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i4 |= i16;
        } else {
            z4 = z;
        }
        if ((i & 24576) != 0) {
            if (l46Var.h(z2)) {
                i15 = 16384;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i4 |= i15;
        }
        i5 = i3 & 32;
        if (i5 != 0) {
            i4 |= 196608;
            z5 = z3;
        } else {
            z5 = z3;
            if ((i & 196608) == 0) {
                if (l46Var.h(z5)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
        }
        if ((i & 1572864) == 0) {
            if (l46Var.i(a26Var)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i4 |= i14;
        }
        if ((i & 12582912) == 0) {
            if (l46Var.i(a26Var2)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i4 |= i13;
        }
        i7 = i3 & 256;
        if (i7 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (l46Var.i(x16Var)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i4 |= i8;
        }
        if ((i & 805306368) == 0) {
            if (l46Var.i(x16Var2)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i4 |= i12;
        }
        if ((i2 & 6) == 0) {
            if (l46Var.i(x16Var3)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i2 | i11;
        } else {
            i9 = i2;
        }
        if ((i2 & 48) == 0) {
            if (l46Var.i(x16Var4)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i4 & 306783379) == 306783378) {
            z6 = true;
        } else {
            z6 = true;
        }
        if (l46Var.W(i4 & 1, z6)) {
            if (i17 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            if (i5 != 0) {
                z8 = false;
            } else {
                z8 = z5;
            }
            if (i7 != 0) {
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = new q(2);
                    l46Var.p0(objR);
                }
                x16Var6 = (x16) objR;
            } else {
                x16Var6 = x16Var;
            }
            zF = k8b.f((e8b) l46Var.k(l8b.a));
            if (zF) {
                l46Var.f0(1294256017);
                y6cVarA = eze.a(l46Var).a.j;
                l46Var.r(false);
            } else {
                l46Var.f0(1294256417);
                l46Var.r(false);
                y6cVarA = a7c.a();
            }
            final y6c y6cVar2 = y6cVarA;
            final boolean z10 = z4;
            str3 = str5;
            xdc.a(mh3.N(b.c), af1.b0(1964485991, new m(4, x16Var4), l46Var), null, null, null, 0, 0L, 0L, null, af1.b0(-307833028, new n26() { // from class: c8
                /* JADX WARN: Code duplicated, block: B:70:0x0338  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    Object obj4;
                    e89 e89Var;
                    e89 e89Var2;
                    int i18;
                    Object obj5;
                    Object obj6;
                    e89 e89Var3;
                    int i19;
                    Object obj7;
                    Object obj8;
                    Object next;
                    pwf pwfVarH;
                    Object obj9;
                    e89 e89Var4;
                    Object obj10;
                    Object objR2;
                    Object obj11;
                    y6c y6cVarA2;
                    e89 e89Var5;
                    Object obj12;
                    xw9 xw9Var = (xw9) obj;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    xw9Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var2.g(xw9Var) ? 4 : 2;
                    }
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        Object objR3 = l46Var2.R();
                        Object obj13 = sf2.a;
                        if (objR3 == obj13) {
                            obj4 = objR3;
                            Object objF = q1c.f(Boolean.FALSE);
                            l46Var2.p0(objF);
                            obj4 = objF;
                        }
                        obj4 = objR3;
                        e89 e89Var6 = (e89) obj4;
                        Object objR4 = l46Var2.R();
                        Object obj14 = objR4;
                        if (objR4 == obj13) {
                            Object objF2 = q1c.f(Boolean.FALSE);
                            l46Var2.p0(objF2);
                            obj14 = objF2;
                        }
                        e89 e89Var7 = (e89) obj14;
                        Object objR5 = l46Var2.R();
                        Object obj15 = objR5;
                        if (objR5 == obj13) {
                            Object objF3 = q1c.f(Boolean.FALSE);
                            l46Var2.p0(objF3);
                            obj15 = objF3;
                        }
                        e89 e89Var8 = (e89) obj15;
                        float f = k8b.e((e8b) l46Var2.k(l8b.a)) ? 8.0f : 0.0f;
                        g09 g09Var = g09.a;
                        j09 j09VarB0 = ynb.b0(f, 0.0f, b.d(b.c(g09Var, 1.0f), 64.0f), 2);
                        j09 j09VarB1 = ynb.b0((f * 2.0f) + 8.0f, 0.0f, g09Var, 2);
                        j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, ynb.Y(b.c(g09Var, 1.0f), xw9Var));
                        c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarD0);
                        lf2.q.getClass();
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(LayoutNode.h1);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(hj6.z, l46Var2, c92VarA);
                        dec.l(hj6.y, l46Var2, u8aVarM);
                        dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                        dec.k(l46Var2);
                        dec.l(hj6.x, l46Var2, j09VarJ);
                        j09 j09VarB2 = ynb.b0(eze.a(l46Var2).c.a, 0.0f, g09Var, 2);
                        String str6 = str;
                        String str7 = str5;
                        yof yofVar2 = yofVar;
                        a26 a26Var3 = a26Var2;
                        boolean z11 = z2;
                        boolean z12 = z8;
                        b4d.j(j09VarB2, null, af1.b0(1562869457, new e8(str6, j09VarB0, j09VarB1, str7, yofVar2, a26Var3, z11, z12, x16Var6, e89Var6), l46Var2), l46Var2, 384, 2);
                        o5c.f(l46Var2, new jw7(1.0f, true));
                        j09 j09VarB3 = ynb.b0(16.0f, 0.0f, b.d(b.c(g09Var, 1.0f), 56.0f), 2);
                        bx9 bx9Var = v51.a;
                        b1b b1bVar = o82.a;
                        u51 u51VarA = v51.a(((m82) l46Var2.k(b1bVar)).p, ((m82) l46Var2.k(b1bVar)).q, 0L, 0L, l46Var2, 12);
                        dd2 dd2Var = feg.b;
                        x16 x16Var7 = x16Var2;
                        x4d x4dVar = y6cVar2;
                        cgg.a(x16Var7, j09VarB3, false, x4dVar, u51VarA, null, null, null, dd2Var, l46Var2, 805306416, 484);
                        j09 j09VarB4 = ynb.b0(16.0f, 0.0f, b.d(kv2.e(g09Var, 8.0f, l46Var2, g09Var, 1.0f), 56.0f), 2);
                        boolean z13 = z10;
                        boolean z14 = !z13;
                        boolean zH = l46Var2.h(z12);
                        Object objR6 = l46Var2.R();
                        if (zH || objR6 == obj13) {
                            e89Var = e89Var7;
                            e89Var2 = e89Var8;
                            i18 = 0;
                            Object f8Var = new f8(z12, e89Var2, e89Var, 0);
                            l46Var2.p0(f8Var);
                            obj5 = f8Var;
                        } else {
                            e89Var = e89Var7;
                            e89Var2 = e89Var8;
                            i18 = 0;
                            obj5 = objR6;
                        }
                        e89 e89Var9 = e89Var2;
                        boolean z15 = i18;
                        cgg.m((x16) obj5, j09VarB4, z14, x4dVar, null, null, af1.b0(1023320495, new g8(z13, i18), l46Var2), l46Var2, 805306416, 496);
                        l46Var2.r(true);
                        boolean zG = l46Var2.g(yofVar2);
                        Object objR7 = l46Var2.R();
                        Object obj16 = objR7;
                        if (zG || objR7 == obj13) {
                            Object useVar = new use(yofVar2.a, 2);
                            l46Var2.p0(useVar);
                            obj16 = useVar;
                        }
                        Object obj17 = (use) obj16;
                        if (((Boolean) e89Var6.getValue()).booleanValue()) {
                            l46Var2.f0(-894046772);
                            if (zF) {
                                l46Var2.f0(525350082);
                                y6cVarA2 = eze.a(l46Var2).a.j;
                                l46Var2.r(z15);
                            } else {
                                l46Var2.f0(525350482);
                                l46Var2.r(z15);
                                y6cVarA2 = a7c.a();
                            }
                            String strQ = afc.q(R.string.account_profile_edit_nickname, l46Var2);
                            s84 s84Var = new s84(true, z15, 4);
                            dd2 dd2VarB0 = af1.b0(-1924908986, new h8(z15 ? 1 : 0, obj17, y6cVarA2), l46Var2);
                            Object objR8 = l46Var2.R();
                            if (objR8 == obj13) {
                                e89Var5 = e89Var6;
                                Object i8Var = new i8(e89Var5, z15 ? 1 : 0);
                                l46Var2.p0(i8Var);
                                obj12 = i8Var;
                            } else {
                                e89Var5 = e89Var6;
                                obj12 = objR8;
                            }
                            x16 x16Var8 = (x16) obj12;
                            Object obj18 = a26Var;
                            boolean zG2 = l46Var2.g(obj18) | l46Var2.g(obj17);
                            Object objR9 = l46Var2.R();
                            Object obj19 = objR9;
                            if (zG2 || objR9 == obj13) {
                                Object j8Var = new j8(obj18, obj17, e89Var5, z15 ? 1 : 0);
                                l46Var2.p0(j8Var);
                                obj19 = j8Var;
                            }
                            e89Var3 = e89Var;
                            obj6 = obj13;
                            kj0.F(strQ, dd2VarB0, null, null, false, false, s84Var, null, x16Var8, (x16) obj19, l46Var2, 102236208, 188);
                            l46Var2.r(z15);
                        } else {
                            obj6 = obj13;
                            e89Var3 = e89Var;
                            l46Var2.f0(-893129978);
                            l46Var2.r(z15);
                        }
                        if (((Boolean) e89Var3.getValue()).booleanValue()) {
                            l46Var2.f0(-893058585);
                            String strQ2 = afc.q(R.string.sure_to_delete_account, l46Var2);
                            s84 s84Var2 = new s84(true, z15, 4);
                            String strQ3 = afc.q(R.string.button_cancel, l46Var2);
                            String strQ4 = afc.q(R.string.do_delete, l46Var2);
                            dd2 dd2Var2 = feg.c;
                            x16 x16Var9 = x16Var3;
                            boolean zG3 = l46Var2.g(x16Var9);
                            Object objR10 = l46Var2.R();
                            if (zG3) {
                                obj9 = obj6;
                            } else {
                                obj9 = obj6;
                                if (objR10 != obj9) {
                                    e89Var4 = e89Var3;
                                    obj10 = objR10;
                                }
                                x16 x16Var12 = (x16) obj10;
                                objR2 = l46Var2.R();
                                obj11 = objR2;
                                if (objR2 == obj9) {
                                    Object i8Var3 = new i8(e89Var4, 1);
                                    l46Var2.p0(i8Var3);
                                    obj11 = i8Var3;
                                }
                                x16 x16Var13 = (x16) obj11;
                                i19 = R.string.sure_to_delete_account;
                                obj7 = obj9;
                                kj0.F(strQ2, dd2Var2, strQ3, strQ4, false, false, s84Var2, null, x16Var12, x16Var13, l46Var2, 806879280, 176);
                                l46Var2.r(z15);
                            }
                            e89Var4 = e89Var3;
                            Object k8Var = new k8(x16Var9, e89Var4, z15 ? 1 : 0);
                            l46Var2.p0(k8Var);
                            obj10 = k8Var;
                            x16 x16Var14 = (x16) obj10;
                            objR2 = l46Var2.R();
                            obj11 = objR2;
                            if (objR2 == obj9) {
                                Object i8Var4 = new i8(e89Var4, 1);
                                l46Var2.p0(i8Var4);
                                obj11 = i8Var4;
                            }
                            x16 x16Var15 = (x16) obj11;
                            i19 = R.string.sure_to_delete_account;
                            obj7 = obj9;
                            kj0.F(strQ2, dd2Var2, strQ3, strQ4, false, false, s84Var2, null, x16Var14, x16Var15, l46Var2, 806879280, 176);
                            l46Var2.r(z15);
                        } else {
                            i19 = R.string.sure_to_delete_account;
                            obj7 = obj6;
                            l46Var2.f0(-892407802);
                            l46Var2.r(z15);
                        }
                        if (((Boolean) e89Var9.getValue()).booleanValue()) {
                            l46Var2.f0(-892323668);
                            b1b b1bVar2 = uq.b;
                            Object obj20 = (Context) l46Var2.k(b1bVar2);
                            nfc nfcVarB = kr7.b(l46Var2);
                            boolean zG4 = l46Var2.g(null) | l46Var2.g(nfcVarB);
                            Object objR11 = l46Var2.R();
                            if (zG4 || objR11 == obj7) {
                                objR11 = nfcVarB.b(job.a.b(t7.class), null, null);
                                l46Var2.p0(objR11);
                            }
                            Object obj21 = (t7) objR11;
                            nfc nfcVarB2 = kr7.b(l46Var2);
                            boolean zG5 = l46Var2.g(null) | l46Var2.g(nfcVarB2);
                            Object objR12 = l46Var2.R();
                            if (zG5 || objR12 == obj7) {
                                objR12 = nfcVarB2.b(job.a.b(q9b.class), null, null);
                                l46Var2.p0(objR12);
                            }
                            Object obj22 = (q9b) objR12;
                            nfc nfcVarB3 = kr7.b(l46Var2);
                            if (((Boolean) l46Var2.k(h57.a)).booleanValue()) {
                                pwfVarH = ib8.h(l46Var2, 1471494079, l46Var2, z15);
                            } else {
                                l46Var2.f0(1471494731);
                                Object objK = l46Var2.k(b1bVar2);
                                Object objR13 = l46Var2.R();
                                if (objR13 == obj7) {
                                    obj8 = objR13;
                                    Object obj23 = v8.c;
                                    l46Var2.p0(obj23);
                                    obj8 = obj23;
                                }
                                obj8 = objR13;
                                Iterator it = fyc.u((a26) obj8, objK).iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!(((Context) next) instanceof pwf));
                                pwfVarH = (pwf) next;
                                l46Var2.r(z15);
                            }
                            if (pwfVarH == null) {
                                qc0.p("No ViewModelStoreOwner found in the context chain");
                                return null;
                            }
                            Object obj24 = (dc9) z5c.G(job.a.b(dc9.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB3, null);
                            String strQ5 = afc.q(i19, l46Var2);
                            s84 s84Var3 = new s84(true, z15, 4);
                            String strQ6 = afc.q(R.string.button_confirm, l46Var2);
                            dd2 dd2Var3 = feg.d;
                            boolean zI = l46Var2.i(obj20) | l46Var2.i(obj22) | l46Var2.i(obj21) | l46Var2.i(obj24);
                            Object objR14 = l46Var2.R();
                            if (zI || objR14 == obj7) {
                                objR14 = new m8(obj20, obj22, obj21, obj24, e89Var9, 0);
                                l46Var2.p0(objR14);
                            }
                            kj0.F(strQ5, dd2Var3, strQ6, null, false, false, s84Var3, null, null, (x16) objR14, l46Var2, 102236208, 184);
                            l46Var2.r(z15);
                        } else {
                            l46Var2.f0(-891314618);
                            l46Var2.r(z15);
                        }
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 805306416, 508);
            z7 = z8;
            x16Var5 = x16Var6;
        } else {
            l46Var.Z();
            x16Var5 = x16Var;
            z7 = z5;
        }
        str4 = str3;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new d8(str, yofVar, str4, z, z2, z7, a26Var, a26Var2, x16Var5, x16Var2, x16Var3, x16Var4, i, i2, i3);
        }
    }

    public static final void c(int i, l46 l46Var, j09 j09Var, String str) {
        l46Var.h0(1091639585);
        int i2 = (l46Var.g(j09Var) ? 4 : 2) | i | (l46Var.g(str) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            rxg.k(af1.b0(1769778687, new o8(str, 0), l46Var), j09Var, urg.o(y72.j, l46Var), l46Var, ((i2 << 3) & 112) | 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p8(j09Var, str, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final void d(String str, String str2, j09 j09Var, y72 y72Var, x16 x16Var, l46 l46Var, int i, int i2) {
        y72 y72Var2;
        int i3;
        x16 x16Var2;
        boolean z;
        y72 y72Var3;
        x16 x16Var3;
        ojb ojbVarV;
        x16 x16Var4;
        j09 j09Var2;
        j09 j09VarC;
        l46Var.h0(695023652);
        int i4 = (l46Var.g(str) ? 4 : 2) | i | (l46Var.g(str2) ? 32 : 16) | (l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            y72Var2 = y72Var;
        } else {
            y72Var2 = y72Var;
            i3 = i4 | (l46Var.g(y72Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                x16Var2 = x16Var;
                i3 |= l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i3 & 1, z)) {
                if (i5 != 0) {
                    y72Var2 = null;
                }
                if (i6 != 0) {
                    x16Var4 = null;
                } else {
                    x16Var4 = x16Var2;
                }
                j09Var2 = g09.a;
                if (x16Var4 != null && (j09VarC = androidx.compose.foundation.b.c(j09Var2, false, null, null, x16Var4, 15)) != null) {
                    j09Var2 = j09VarC;
                }
                rxg.k(af1.b0(-104990202, new q8(str, y72Var2, str2, x16Var4), l46Var), j09Var.D(j09Var2), urg.o(y72.j, l46Var), l46Var, 6);
                y72Var3 = y72Var2;
                x16Var3 = x16Var4;
            } else {
                l46Var.Z();
                y72Var3 = y72Var2;
                x16Var3 = x16Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new r8(str, str2, j09Var, y72Var3, x16Var3, i, i2, 0);
            }
        }
        i3 |= 24576;
        x16Var2 = x16Var;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i3 & 1, z)) {
            if (i5 != 0) {
                y72Var2 = null;
            }
            if (i6 != 0) {
                x16Var4 = null;
            } else {
                x16Var4 = x16Var2;
            }
            j09Var2 = g09.a;
            if (x16Var4 != null) {
                j09Var2 = j09VarC;
            }
            rxg.k(af1.b0(-104990202, new q8(str, y72Var2, str2, x16Var4), l46Var), j09Var.D(j09Var2), urg.o(y72.j, l46Var), l46Var, 6);
            y72Var3 = y72Var2;
            x16Var3 = x16Var4;
        } else {
            l46Var.Z();
            y72Var3 = y72Var2;
            x16Var3 = x16Var2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r8(str, str2, j09Var, y72Var3, x16Var3, i, i2, 0);
        }
    }
}
