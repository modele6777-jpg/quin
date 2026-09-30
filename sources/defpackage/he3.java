package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class he3 {
    public static final bx9 a = ynb.r(24.0f, 10.0f, 24.0f, 0.0f, 8);
    public static final float b = 16.0f;

    public static final void a(Long l, a26 a26Var, j91 j91Var, z67 z67Var, ne3 ne3Var, euc eucVar, ke3 ke3Var, fo5 fo5Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-432341251);
        int i3 = i | (l46Var.g(l) ? 4 : 2) | (l46Var.i(a26Var) ? 32 : 16) | (l46Var.i(j91Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(z67Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(ne3Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.g(eucVar) ? 131072 : 65536) | (l46Var.g(ke3Var) ? 1048576 : 524288) | (l46Var.g(fo5Var) ? 8388608 : 4194304);
        if (l46Var.W(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean zG = l46Var.g(j91Var.a);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                Locale locale = j91Var.a;
                String strZ = v4e.Z(c5e.A(new rob("y{1,4}").h(new rob("M{1,2}").h(new rob("d{1,2}").h(new rob("[^dMy/\\-.]").h(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale), ""), "dd"), "MM"), "yyyy"), "My", "M/y"), ".");
                um8 um8VarB = rob.b(new rob("[/\\-.]"), strZ);
                um8VarB.getClass();
                rm8 rm8VarD = um8VarB.c.d(0);
                rm8VarD.getClass();
                objR = new be3(strZ, rm8VarD.a.charAt(0));
                l46Var.p0(objR);
            }
            be3 be3Var = (be3) objR;
            String strH = tgc.h(R.string.m3c_date_input_invalid_for_pattern, l46Var);
            String strH2 = tgc.h(R.string.m3c_date_input_invalid_year_range, l46Var);
            String strH3 = tgc.h(R.string.m3c_date_input_invalid_not_allowed, l46Var);
            boolean zG2 = l46Var.g(be3Var) | ((57344 & i3) == 16384);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == obj) {
                i2 = 0;
                objR2 = new ie3(z67Var, eucVar, be3Var, ne3Var, strH, strH2, strH3);
                l46Var.p0(objR2);
            } else {
                i2 = 0;
            }
            ie3 ie3Var = (ie3) objR2;
            String upperCase = be3Var.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String strH4 = tgc.h(R.string.m3c_date_input_label, l46Var);
            j09 j09VarY = ynb.Y(b.c(g09.a, 1.0f), a);
            ie3Var.getClass();
            Locale locale2 = j91Var.a;
            dd2 dd2VarB0 = af1.b0(-752164549, new fw0(2, strH4, upperCase), l46Var);
            dd2 dd2VarB1 = af1.b0(-1179434278, new de3(upperCase, i2), l46Var);
            int i4 = i3 << 3;
            b(j09VarY, l, a26Var, j91Var, dd2VarB0, dd2VarB1, ie3Var, be3Var, locale2, ke3Var, fo5Var, l46Var, (i4 & 7168) | (i4 & 112) | 1794054 | (i4 & 896), (i3 >> 18) & 126);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new bq1(l, a26Var, j91Var, z67Var, ne3Var, eucVar, ke3Var, fo5Var, i);
        }
    }

    public static final void b(final j09 j09Var, Long l, final a26 a26Var, final j91 j91Var, final dd2 dd2Var, final dd2 dd2Var2, final ie3 ie3Var, final be3 be3Var, final Locale locale, final ke3 ke3Var, final fo5 fo5Var, l46 l46Var, final int i, final int i2) {
        int i3;
        int i4;
        l46 l46Var2;
        Object obj;
        Object m8Var;
        int i5;
        e89 e89Var;
        Object ms2Var;
        char c;
        boolean z;
        be3 be3Var2;
        e89 e89Var2;
        final Long l2 = l;
        j91 j91Var2 = j91Var;
        Locale locale2 = locale;
        l46Var.h0(1456309913);
        if ((i & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.g(l2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i3 |= l46Var.i(j91Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i3 |= l46Var.i(dd2Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((i & 196608) == 0) {
            i3 |= l46Var.i(dd2Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= l46Var.e(0) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= l46Var.g(ie3Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= l46Var.g(be3Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= l46Var.i(locale2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (l46Var.g(ke3Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.g(fo5Var) ? 32 : 16;
        }
        int i6 = i4;
        if (l46Var.W(i3 & 1, ((i3 & 306783379) == 306783378 && (i6 & 19) == 18) ? false : true)) {
            Object[] objArr = new Object[0];
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                obj = objR;
                os2 os2Var = new os2(26);
                l46Var.p0(os2Var);
                obj = os2Var;
            }
            obj = objR;
            e89 e89VarH = vfh.H(objArr, zse.d, (x16) obj, l46Var);
            Object[] objArr2 = {(zse) e89VarH.getValue()};
            int i7 = i3 & 29360128;
            boolean zG = (i7 == 8388608) | l46Var.g(e89VarH) | l46Var.i(j91Var2);
            int i8 = 234881024 & i3;
            int i9 = i3 & 3670016;
            boolean zI = zG | (i8 == 67108864) | l46Var.i(locale2) | (i9 == 1048576);
            Object objR2 = l46Var.R();
            if (zI || objR2 == i8cVar) {
                i5 = i9;
                m8Var = new m8(ie3Var, j91Var2, be3Var, locale2, e89VarH, 5);
                j91Var2 = j91Var2;
                e89Var = e89VarH;
                l46Var.p0(m8Var);
            } else {
                m8Var = objR2;
                i5 = i9;
                e89Var = e89VarH;
            }
            e89 e89Var3 = (e89) vfh.I(objArr2, (x16) m8Var, l46Var, 0);
            boolean zQ = v4e.Q((CharSequence) e89Var3.getValue());
            float f = b;
            if (!zQ) {
                if (!((16.0f >= 0.0f) & (4.0f >= 0.0f) & (16.0f >= 0.0f) & (0.0f >= 0.0f))) {
                    g37.a("Padding must be non-negative");
                }
                f -= 0.0f + 4.0f;
            }
            float f2 = f;
            zse zseVar = (zse) e89Var.getValue();
            boolean zG2 = (i5 == 1048576) | ((i3 & 896) == 256) | (i8 == 67108864) | l46Var.g(e89Var) | l46Var.g(e89Var3) | l46Var.i(j91Var2) | l46Var.i(locale2) | (i7 == 8388608);
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == i8cVar) {
                e89 e89Var4 = e89Var;
                c = 0;
                z = false;
                j91 j91Var3 = j91Var2;
                ms2Var = new ms2(be3Var, e89Var3, a26Var, j91Var3, locale2, ie3Var, e89Var4);
                be3Var2 = be3Var;
                e89Var2 = e89Var3;
                j91Var2 = j91Var3;
                locale2 = locale2;
                e89Var = e89Var4;
                l46Var.p0(ms2Var);
            } else {
                e89Var2 = e89Var3;
                ms2Var = objR3;
                c = 0;
                z = false;
                be3Var2 = be3Var;
            }
            a26 a26Var2 = (a26) ms2Var;
            boolean z2 = z;
            j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, f2, 7, j09Var);
            boolean zG3 = l46Var.g(e89Var2);
            Object objR4 = l46Var.R();
            Object obj2 = objR4;
            if (zG3 || objR4 == i8cVar) {
                pg pgVar = new pg(e89Var2, 24);
                l46Var.p0(pgVar);
                obj2 = pgVar;
            }
            j09 j09VarB = vwc.b(j09VarD0, z2, (a26) obj2);
            j09 j09VarU = g09.a;
            if (fo5Var != null) {
                j09VarU = ok8.u(j09VarU, fo5Var);
            }
            b21.k(zseVar, a26Var2, j09VarB.D(j09VarU), false, null, dd2Var, dd2Var2, af1.b0(-357881838, new ee3(e89Var2, z2 ? 1 : 0), l46Var), !v4e.Q((CharSequence) e89Var2.getValue()), new xg3(be3Var2), new wo7(3, 7, 113), null, true, 0, 0, null, ke3Var.y, l46Var, (i3 << 6) & 33030144);
            l46Var2 = l46Var;
            boolean z3 = (i6 & 112) == 32;
            Object objR5 = l46Var2.R();
            if (z3 || objR5 == i8cVar) {
                objR5 = new fe3(fo5Var, null);
                l46Var2.p0(objR5);
            }
            af1.o((l26) objR5, l46Var2, wef.a);
            boolean zI2 = l46Var2.i(j91Var2) | ((i3 & 112) == 32) | (i8 == 67108864) | l46Var2.i(locale2) | l46Var2.g(e89Var);
            Object objR6 = l46Var2.R();
            if (zI2 || objR6 == i8cVar) {
                ge3 ge3Var = new ge3(l, j91Var2, be3Var, locale2, e89Var, null);
                l2 = l;
                l46Var2.p0(ge3Var);
                objR6 = ge3Var;
            } else {
                l2 = l;
            }
            af1.o((l26) objR6, l46Var2, l2);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: ce3
                @Override // defpackage.l26
                public final Object z(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iP = k99.P(i | 1);
                    int iP2 = k99.P(i2);
                    he3.b(j09Var, l2, a26Var, j91Var, dd2Var, dd2Var2, ie3Var, be3Var, locale, ke3Var, fo5Var, (l46) obj3, iP, iP2);
                    return wef.a;
                }
            };
        }
    }
}
