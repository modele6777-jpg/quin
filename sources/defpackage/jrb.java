package defpackage;

import ai.askquin.R;
import android.os.Trace;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jrb {
    public static volatile hl a;

    public static int A(Object obj, yng yngVar, byte[] bArr, int i, int i2, tlg tlgVar) throws bng {
        int iQ = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iQ = q(i3, bArr, iQ, tlgVar);
            i3 = tlgVar.a;
        }
        int i4 = iQ;
        if (i3 < 0 || i3 > i2 - i4) {
            s8f.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = tlgVar.d + 1;
        tlgVar.d = i5;
        if (i5 >= 100) {
            s8f.q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i4 + i3;
        yngVar.h(obj, bArr, i4, i6, tlgVar);
        tlgVar.d--;
        tlgVar.c = obj;
        return i6;
    }

    public static int B(Object obj, yng yngVar, byte[] bArr, int i, int i2, int i3, tlg tlgVar) throws bng {
        qng qngVar = (qng) yngVar;
        int i4 = tlgVar.d + 1;
        tlgVar.d = i4;
        if (i4 >= 100) {
            s8f.q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iY = qngVar.y(obj, bArr, i, i2, i3, tlgVar);
        tlgVar.d--;
        tlgVar.c = obj;
        return iY;
    }

    public static int C(int i, byte[] bArr, int i2, int i3, zmg zmgVar, tlg tlgVar) {
        pmg pmgVar = (pmg) zmgVar;
        int iP = p(bArr, i2, tlgVar);
        pmgVar.e(tlgVar.a);
        while (iP < i3) {
            int iP2 = p(bArr, iP, tlgVar);
            if (i != tlgVar.a) {
                break;
            }
            iP = p(bArr, iP2, tlgVar);
            pmgVar.e(tlgVar.a);
        }
        return iP;
    }

    public static int D(byte[] bArr, int i, zmg zmgVar, tlg tlgVar) throws bng {
        pmg pmgVar = (pmg) zmgVar;
        int iP = p(bArr, i, tlgVar);
        int i2 = tlgVar.a + iP;
        while (iP < i2) {
            iP = p(bArr, iP, tlgVar);
            pmgVar.e(tlgVar.a);
        }
        if (iP == i2) {
            return iP;
        }
        s8f.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int E(yng yngVar, int i, byte[] bArr, int i2, int i3, zmg zmgVar, tlg tlgVar) throws bng {
        omg omgVarB = yngVar.b();
        yng yngVar2 = yngVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        tlg tlgVar2 = tlgVar;
        int iA = A(omgVarB, yngVar2, bArr2, i2, i4, tlgVar2);
        yngVar2.c(omgVarB);
        tlgVar2.c = omgVarB;
        zmgVar.add(omgVarB);
        while (iA < i4) {
            tlg tlgVar3 = tlgVar2;
            int i5 = i4;
            int iP = p(bArr2, iA, tlgVar3);
            if (i != tlgVar3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            yng yngVar3 = yngVar2;
            omg omgVarB2 = yngVar3.b();
            iA = A(omgVarB2, yngVar3, bArr3, iP, i5, tlgVar3);
            yngVar2 = yngVar3;
            bArr2 = bArr3;
            i4 = i5;
            tlgVar2 = tlgVar3;
            yngVar2.c(omgVarB2);
            tlgVar2.c = omgVarB2;
            zmgVar.add(omgVarB2);
        }
        return iA;
    }

    public static int F(int i, byte[] bArr, int i2, int i3, gog gogVar, tlg tlgVar) throws bng {
        if ((i >>> 3) == 0) {
            s8f.q("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iS = s(bArr, i2, tlgVar);
            gogVar.d(i, Long.valueOf(tlgVar.b));
            return iS;
        }
        if (i4 == 1) {
            gogVar.d(i, Long.valueOf(w(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iP = p(bArr, i2, tlgVar);
            int i5 = tlgVar.a;
            if (i5 < 0) {
                s8f.q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iP) {
                s8f.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                gogVar.d(i, xlg.a);
            } else {
                gogVar.d(i, xlg.k(bArr, iP, i5));
            }
            return iP + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                gogVar.d(i, Integer.valueOf(u(bArr, i2)));
                return i2 + 4;
            }
            s8f.q("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        gog gogVarA = gog.a();
        int i7 = tlgVar.d + 1;
        tlgVar.d = i7;
        if (i7 >= 100) {
            s8f.q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (i2 < i3) {
            int iP2 = p(bArr, i2, tlgVar);
            int i9 = tlgVar.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iP2;
                break;
            }
            i2 = F(i9, bArr, iP2, i3, gogVarA, tlgVar);
            i8 = i9;
        }
        tlgVar.d--;
        if (i2 > i3 || i8 != i6) {
            s8f.q("Failed to parse the message.");
            return 0;
        }
        gogVar.d(i, gogVarA);
        return i2;
    }

    public static int G(int i, byte[] bArr, int i2, int i3, tlg tlgVar) throws bng {
        if ((i >>> 3) == 0) {
            s8f.q("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return s(bArr, i2, tlgVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return p(bArr, i2, tlgVar) + tlgVar.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            s8f.q("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = p(bArr, i2, tlgVar);
            i6 = tlgVar.a;
            if (i6 == i5) {
                break;
            }
            i2 = G(i6, bArr, i2, i3, tlgVar);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        s8f.q("Failed to parse the message.");
        return 0;
    }

    public static final void a(fqd fqdVar, j09 j09Var, dd2 dd2Var, l46 l46Var, int i) {
        Object obj;
        boolean z;
        l46Var.h0(-977568115);
        int i2 = (i & 6) == 0 ? (l46Var.g(fqdVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(dd2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        boolean z2 = false;
        boolean z3 = true;
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            String strH = tgc.h(R.string.m3c_snackbar_pane_title, l46Var);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                obj = objR;
                z95 z95Var = new z95();
                z95Var.a = new Object();
                z95Var.b = new ArrayList();
                l46Var.p0(z95Var);
                obj = z95Var;
            }
            obj = objR;
            z95 z95Var2 = (z95) obj;
            Object obj2 = z95Var2.a;
            ArrayList arrayList = z95Var2.b;
            if (pa7.t(fqdVar, obj2)) {
                z = true;
                l46Var.f0(1443908949);
                l46Var.r(false);
            } else {
                l46Var.f0(1154891761);
                z95Var2.a = fqdVar;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((fqd) ((y95) arrayList.get(i3)).a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(fqdVar)) {
                    arrayList3.add(fqdVar);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj3 = arrayList3.get(i4);
                    if (obj3 != null) {
                        arrayList4.add(obj3);
                    }
                }
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    fqd fqdVar2 = (fqd) arrayList4.get(i5);
                    arrayList.add(new y95(fqdVar2, af1.b0(-1952400805, new hqd(fqdVar2, fqdVar, z95Var2, strH), l46Var)));
                    i5++;
                    z3 = z3;
                }
                z = z3;
                l46Var.r(false);
            }
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            he2 he2Var = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var);
            }
            dec.l(hj6.x, l46Var, j09VarJ);
            ojb ojbVarB = l46Var.B();
            if (ojbVarB == null) {
                qc0.p("no recompose scope found");
                return;
            }
            ojbVarB.b |= 1;
            z95Var2.c = ojbVarB;
            l46Var.f0(-1888182177);
            int size4 = arrayList.size();
            for (int i6 = 0; i6 < size4; i6++) {
                y95 y95Var = (y95) arrayList.get(i6);
                Object obj4 = (fqd) y95Var.a;
                dd2 dd2Var2 = y95Var.b;
                l46Var.d0(1325010085, obj4);
                dd2Var2.m(af1.b0(-1893791890, new fw0(dd2Var, obj4, z2, 13), l46Var), l46Var, 6);
                l46Var.r(false);
            }
            l46Var.r(false);
            l46Var.r(z);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(i, fqdVar, j09Var, dd2Var, 17);
        }
    }

    public static final void b(String str, boolean z, mue mueVar, j09 j09Var, co0 co0Var, l46 l46Var, int i, int i2) {
        j09 j09Var2;
        int i3;
        co0 co0Var2;
        int i4;
        j09 j09Var3;
        co0 co0Var3;
        j09 j09Var4;
        boolean z2;
        l46 l46Var2 = l46Var;
        str.getClass();
        l46Var2.h0(-912447297);
        int i5 = i | (l46Var2.g(str) ? 4 : 2) | (l46Var2.h(z) ? 32 : 16) | (l46Var2.g(mueVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            j09Var2 = j09Var;
        } else {
            j09Var2 = j09Var;
            i3 = i5 | (l46Var2.g(j09Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i3 | 24576;
            co0Var2 = co0Var;
        } else {
            co0Var2 = co0Var;
            i4 = i3 | (l46Var2.g(co0Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }
        if (l46Var2.W(i4 & 1, (i4 & 9363) != 9362)) {
            g09 g09Var = g09.a;
            j09 j09Var5 = i6 != 0 ? g09Var : j09Var2;
            co0 co0Var4 = i7 != 0 ? null : co0Var2;
            t7c t7cVarA = s7c.a(new uc0(2.0f, true, new jv2(3, ndb.Z)), ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var5);
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
            if (z) {
                l46Var2.f0(-458379139);
                String strQ = afc.q(R.string.text_reverse_tag, l46Var2);
                pr4 pr4Var = l8b.a;
                j09 j09VarZ = ynb.Z(tm7.o(g09Var, ((e8b) l46Var2.k(pr4Var)).m, a7c.b(2.0f)), 2.0f);
                mue mueVar2 = pue.a;
                j09Var4 = j09Var5;
                z2 = false;
                nte.b(strQ, j09VarZ, ((e8b) l46Var2.k(pr4Var)).r, w6c.l(8), null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.h(l46Var2), l46Var, 24576, 0, 130024);
                l46Var.r(false);
            } else {
                j09Var4 = j09Var5;
                z2 = false;
                l46Var2.f0(-458056057);
                l46Var2.r(false);
            }
            l46Var2 = l46Var;
            co0 co0Var5 = co0Var4;
            vd0.e(str, new jw7(1.0f, z2), mue.a(mueVar, 0L, 0L, null, null, 0L, null, 3, 0L, null, null, 16744447), null, 2, false, 1, 0, co0Var5, l46Var2, (i4 & 14) | 1597440 | ((i4 << 15) & 1879048192), 424);
            l46Var2.r(true);
            co0Var3 = co0Var5;
            j09Var3 = j09Var4;
        } else {
            l46Var2.Z();
            j09Var3 = j09Var2;
            co0Var3 = co0Var2;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dk(str, z, mueVar, j09Var3, co0Var3, i, i2);
        }
    }

    public static final void c(nqd nqdVar, j09 j09Var, dd2 dd2Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-1077081618);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(nqdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(dd2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            fqd fqdVar = (fqd) nqdVar.b.getValue();
            n6 n6Var = (n6) l46Var.k(zg2.a);
            boolean zG = l46Var.g(fqdVar) | l46Var.i(n6Var);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = new iqd(fqdVar, n6Var, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, fqdVar);
            a((fqd) nqdVar.b.getValue(), j09Var, dd2Var, l46Var, i2 & 1008);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(i, nqdVar, j09Var, dd2Var, 16);
        }
    }

    public static final String d(t7 t7Var) {
        t7Var.getClass();
        hs3 hs3Var = xqa.A;
        CharSequence charSequenceA = (CharSequence) z5c.I(nu4.a, new jnf(hs3Var.a, hs3Var.b, null));
        if (v4e.Q(charSequenceA)) {
            mo3 mo3Var = (mo3) t7Var;
            charSequenceA = mo3Var.a();
            if (!mo3Var.b()) {
                charSequenceA = null;
            }
            if (charSequenceA == null) {
                charSequenceA = "";
            }
        }
        return (String) (v4e.Q((String) charSequenceA) ? null : charSequenceA);
    }

    public static String e(b71 b71Var) {
        StringBuilder sb = new StringBuilder(b71Var.size());
        for (int i = 0; i < b71Var.size(); i++) {
            byte bA = b71Var.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        sb.append("\\n");
                        break;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        break;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        sb.append("\\f");
                        break;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final int f(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] g(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        qd0.d0(0, i, 6, objArr, objArr2);
        qd0.Z(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0082  */
    public static final n4d h(n4d n4dVar, n4d n4dVar2, float f) {
        float fP = abg.P(n4dVar.a, n4dVar2.a, f);
        float fP2 = abg.P(n4dVar.b, n4dVar2.b, f);
        long j = n4dVar.c;
        long j2 = n4dVar2.c;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(abg.P(aj4.a(j), aj4.a(j2), f))) << 32) | (((long) Float.floatToRawIntBits(abg.P(aj4.b(j), aj4.b(j2), f))) & 4294967295L);
        long jR = abg.R(n4dVar.e, n4dVar2.e, f);
        Object obj = n4dVar.f;
        Object obj2 = n4dVar2.f;
        if (!pa7.t(obj, obj2)) {
            Object objB = obj instanceof i97 ? ((i97) obj).b(f, obj2) : null;
            if (objB == null && (obj2 instanceof i97)) {
                objB = ((i97) obj2).b(1.0f - f, obj);
            }
            if (objB != null) {
                obj = objB;
            } else if (f >= 0.5f) {
                obj = obj2;
            }
        } else if (f >= 0.5f) {
            obj = obj2;
        }
        b41 b41Var = obj instanceof b41 ? (b41) obj : null;
        float fP3 = abg.P(n4dVar.g, n4dVar2.g, f);
        if (f >= 0.5f) {
            n4dVar = n4dVar2;
        }
        return new n4d(fP, fP2, jFloatToRawIntBits, jR, b41Var, fP3, n4dVar.d);
    }

    public static void i(s03 s03Var) {
        s03Var.k = -3.4028235E38f;
        s03Var.j = Integer.MIN_VALUE;
        CharSequence charSequenceValueOf = s03Var.a;
        if (charSequenceValueOf instanceof Spanned) {
            if (!(charSequenceValueOf instanceof Spannable)) {
                charSequenceValueOf = SpannableString.valueOf(charSequenceValueOf);
                s03Var.a = charSequenceValueOf;
                s03Var.b = null;
            }
            charSequenceValueOf.getClass();
            Spannable spannable = (Spannable) charSequenceValueOf;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static final Object[] j(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        qd0.d0(0, i, 6, objArr, objArr2);
        qd0.Z(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final String k(String str, String str2, x16 x16Var, x16 x16Var2, a26 a26Var) {
        str.getClass();
        str2.getClass();
        a26Var.getClass();
        String str3 = (String) x16Var.invoke();
        String strM = m(str, tec.l(str3, "Mutable"), str2, str3, tec.l(str3, "(Mutable)"));
        if (strM != null) {
            return strM;
        }
        String strM2 = m(str, str3.concat("MutableMap.MutableEntry"), str2, str3.concat("Map.Entry"), str3.concat("(Mutable)Map.(Mutable)Entry"));
        if (strM2 != null) {
            return strM2;
        }
        String str4 = (String) x16Var2.invoke();
        StringBuilder sbO = ub3.o(str4);
        sbO.append((String) a26Var.d("Array<"));
        String string = sbO.toString();
        StringBuilder sbO2 = ub3.o(str4);
        sbO2.append((String) a26Var.d("Array<out "));
        String string2 = sbO2.toString();
        StringBuilder sbO3 = ub3.o(str4);
        sbO3.append((String) a26Var.d("Array<(out) "));
        String strM3 = m(str, string, str2, string2, sbO3.toString());
        if (strM3 != null) {
            return strM3;
        }
        return null;
    }

    public static final String l(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t99 t99Var = (t99) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(rxg.Q(t99Var));
        }
        return sb.toString();
    }

    public static final String m(String str, String str2, String str3, String str4, String str5) {
        tec.x(str, str3, str4);
        if (!c5e.C(str, str2, false) || !c5e.C(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        String strSubstring2 = str3.substring(str4.length());
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (o(strSubstring, strSubstring2)) {
            return strConcat.concat("!");
        }
        return null;
    }

    public static float n(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    public static final boolean o(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.equals(c5e.A(str2, "?", ""))) {
            return true;
        }
        if (c5e.u(str2, "?", false) && str.concat("?").equals(str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return sb.toString().equals(str2);
    }

    public static int p(byte[] bArr, int i, tlg tlgVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return q(b, bArr, i2, tlgVar);
        }
        tlgVar.a = b;
        return i2;
    }

    public static int q(int i, byte[] bArr, int i2, tlg tlgVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            tlgVar.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            tlgVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            tlgVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            tlgVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                tlgVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static void r(weh wehVar) {
        if (v(wehVar) || wehVar.a == null) {
            Trace.beginSection(wehVar.c);
            x(wehVar);
        } else {
            r(wehVar.a);
            x(wehVar);
        }
    }

    public static int s(byte[] bArr, int i, tlg tlgVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            tlgVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        tlgVar.b = j2;
        return i3;
    }

    public static void t(weh wehVar) {
        if (v(wehVar) || wehVar.a == null) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            t(wehVar.a);
        }
    }

    public static int u(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static boolean v(weh wehVar) {
        return wehVar.e != Thread.currentThread();
    }

    public static long w(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static void x(weh wehVar) {
        String strSubstring = wehVar.d;
        AtomicReference atomicReference = dfh.a;
        if (strSubstring.length() > 127) {
            strSubstring = strSubstring.substring(0, 127);
        }
        Trace.beginSection(strSubstring);
    }

    public static int y(byte[] bArr, int i, tlg tlgVar) throws bng {
        int iP = p(bArr, i, tlgVar);
        int i2 = tlgVar.a;
        if (i2 < 0) {
            s8f.q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            tlgVar.c = "";
            return iP;
        }
        tlgVar.c = kog.d(bArr, iP, i2);
        return iP + i2;
    }

    public static int z(byte[] bArr, int i, tlg tlgVar) throws bng {
        int iP = p(bArr, i, tlgVar);
        int i2 = tlgVar.a;
        if (i2 < 0) {
            s8f.q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iP) {
            s8f.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            tlgVar.c = xlg.a;
            return iP;
        }
        tlgVar.c = xlg.k(bArr, iP, i2);
        return iP + i2;
    }
}
