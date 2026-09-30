package defpackage;

import ai.askquin.R;
import ai.askquin.data.SeasonalDraftStore$Draft;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.b;
import com.adjust.sdk.Constants;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.charset.Charset;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.seasonal.model.SeasonalCareerStatus;
import tech.chatmind.api.seasonal.model.SeasonalGender;
import tech.chatmind.api.seasonal.model.SeasonalLoveStatus;
import tech.chatmind.api.seasonal.model.SeasonalUserInfo;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uyb {
    public static final aue A(int i, int i2, l46 l46Var) {
        boolean z = true;
        int i3 = (i2 & 1) != 0 ? 8 : 16;
        xp5 xp5Var = (xp5) l46Var.k(zg2.k);
        sw3 sw3Var = (sw3) l46Var.k(zg2.h);
        cv7 cv7Var = (cv7) l46Var.k(zg2.n);
        boolean zG = l46Var.g(xp5Var) | l46Var.g(sw3Var) | l46Var.e(cv7Var.ordinal());
        if ((((i & 14) ^ 6) <= 4 || !l46Var.e(i3)) && (i & 6) != 4) {
            z = false;
        }
        boolean z2 = zG | z;
        Object objR = l46Var.R();
        if (z2 || objR == sf2.a) {
            objR = new aue(xp5Var, sw3Var, cv7Var, i3);
            l46Var.p0(objR);
        }
        return (aue) objR;
    }

    public static final String B(int i, String str) {
        int iN;
        CharSequence charSequenceSubSequence;
        if (str.length() >= i + 12 && v4e.G("+-", str.charAt(0)) && (iN = v4e.N(str, '-', 1, 4)) >= 12) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (str.charAt(i3) != '0') {
                    break;
                }
                i2 = i3;
            }
            if (iN - i2 < 12) {
                int i4 = iN - 10;
                if (i4 < 1) {
                    r3.i(tec.f(i4, "End index (", ") is less than start index (1)."));
                    return null;
                }
                if (i4 == 1) {
                    charSequenceSubSequence = str.subSequence(0, str.length());
                } else {
                    StringBuilder sb = new StringBuilder(str.length() - (iN - 11));
                    sb.append((CharSequence) str, 0, 1);
                    sb.append((CharSequence) str, i4, str.length());
                    charSequenceSubSequence = sb;
                }
                return charSequenceSubSequence.toString();
            }
        }
        return str;
    }

    public static final boolean C(int i, it3 it3Var, oo5 oo5Var, hkb hkbVar) {
        oo5 oo5VarQ;
        p89 p89Var = new p89(0, new oo5[16]);
        if (!oo5Var.a.Y) {
            i37.c("visitChildren called on an unattached node");
        }
        p89 p89Var2 = new p89(0, new i09[16]);
        i09 i09Var = oo5Var.a;
        i09 i09Var2 = i09Var.f;
        if (i09Var2 == null) {
            vd0.H(p89Var2, i09Var);
        } else {
            p89Var2.b(i09Var2);
        }
        while (true) {
            int i2 = p89Var2.c;
            if (i2 == 0) {
                break;
            }
            i09 i09VarM0 = (i09) p89Var2.k(i2 - 1);
            if ((i09VarM0.d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                vd0.H(p89Var2, i09VarM0);
            } else {
                while (i09VarM0 != null) {
                    if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        p89 p89Var3 = null;
                        while (i09VarM0 != null) {
                            if (i09VarM0 instanceof oo5) {
                                oo5 oo5Var2 = (oo5) i09VarM0;
                                if (oo5Var2.Y) {
                                    p89Var.b(oo5Var2);
                                }
                            } else if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM0 instanceof sv3)) {
                                int i3 = 0;
                                for (i09 i09Var3 = ((sv3) i09VarM0).E0; i09Var3 != null; i09Var3 = i09Var3.f) {
                                    if ((i09Var3.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            i09VarM0 = i09Var3;
                                        } else {
                                            if (p89Var3 == null) {
                                                p89Var3 = new p89(0, new i09[16]);
                                            }
                                            if (i09VarM0 != null) {
                                                p89Var3.b(i09VarM0);
                                                i09VarM0 = null;
                                            }
                                            p89Var3.b(i09Var3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            i09VarM0 = vd0.m0(p89Var3);
                        }
                        break;
                    }
                    i09VarM0 = i09VarM0.f;
                }
            }
        }
        while (p89Var.c != 0 && (oo5VarQ = q(p89Var, hkbVar, i)) != null) {
            if (oo5VarQ.n1().a) {
                return ((Boolean) it3Var.d(oo5VarQ)).booleanValue();
            }
            if (s(i, it3Var, oo5VarQ, hkbVar)) {
                return true;
            }
            p89Var.j(oo5VarQ);
        }
        return false;
    }

    public static final Boolean D(int i, it3 it3Var, oo5 oo5Var, hkb hkbVar) {
        int iOrdinal = oo5Var.q1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                oo5 oo5VarC = vpf.C(oo5Var);
                if (oo5VarC == null) {
                    qc0.p("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = oo5VarC.q1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolD = D(i, it3Var, oo5VarC, hkbVar);
                        if (!pa7.t(boolD, Boolean.FALSE)) {
                            return boolD;
                        }
                        if (hkbVar == null) {
                            if (oo5VarC.q1() != ko5.b) {
                                qc0.p("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            oo5 oo5VarX = vpf.x(oo5VarC);
                            if (oo5VarX == null) {
                                qc0.p("ActiveParent must have a focusedChild");
                                return null;
                            }
                            hkbVar = vpf.z(oo5VarX);
                        }
                        return Boolean.valueOf(s(i, it3Var, oo5Var, hkbVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            ap.c();
                            return null;
                        }
                        qc0.p("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (hkbVar == null) {
                    hkbVar = vpf.z(oo5VarC);
                }
                return Boolean.valueOf(s(i, it3Var, oo5Var, hkbVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    ap.c();
                    return null;
                }
                if (oo5Var.n1().a) {
                    return (Boolean) it3Var.d(oo5Var);
                }
                return hkbVar == null ? Boolean.valueOf(r(oo5Var, i, it3Var)) : Boolean.valueOf(C(i, it3Var, oo5Var, hkbVar));
            }
        }
        return Boolean.valueOf(r(oo5Var, i, it3Var));
    }

    public static final void E(StringBuilder sb, Iterator it, w1e w1eVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(w1e.o(entry.getKey()));
            sb.append(" : ");
            sb.append(w1e.o(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(w1e.o(entry2.getKey()));
                sb.append(" : ");
                sb.append(w1e.o(entry2.getValue()));
            }
        }
    }

    public static final void a(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(1187580139);
        int i2 = 2;
        if (l46Var2.W(i & 1, (i & 3) != 2)) {
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(Boolean.FALSE);
                l46Var2.p0(objR);
            }
            e89 e89Var = (e89) objR;
            Object objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var2.p0(objR2);
            }
            e89 e89Var2 = (e89) objR2;
            boolean zBooleanValue = ((Boolean) l46Var2.k(h57.a)).booleanValue();
            j09 j09VarA = b.a(j09Var, "autumn-loading-animation");
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
            g09 g09Var = g09.a;
            d31 d31Var = d31.a;
            if (zBooleanValue || ((Boolean) e89Var2.getValue()).booleanValue()) {
                l46Var2.f0(-277557455);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-277815003);
                Object objR3 = l46Var2.R();
                if (objR3 == i8cVar) {
                    objR3 = Uri.parse("asset:///seasonal/autumn_loading.mp4");
                    objR3.getClass();
                    l46Var2.p0(objR3);
                }
                Uri uri = (Uri) objR3;
                Object objR4 = l46Var2.R();
                if (objR4 == i8cVar) {
                    objR4 = new xfc(e89Var, i2);
                    l46Var2.p0(objR4);
                }
                x16 x16Var = (x16) objR4;
                Object objR5 = l46Var2.R();
                if (objR5 == i8cVar) {
                    objR5 = new xfc(e89Var2, 3);
                    l46Var2.p0(objR5);
                }
                tm7.a(uri, x16Var, (x16) objR5, d31Var.b(g09Var), l46Var2, 432);
                l46Var2.r(false);
            }
            if (zBooleanValue || !((Boolean) e89Var.getValue()).booleanValue() || ((Boolean) e89Var2.getValue()).booleanValue()) {
                l46Var2.f0(-277485163);
                feg.j(od4.A(R.drawable.autumn_loading_poster, 0, l46Var2), null, d31Var.b(g09Var), null, an2.b, 0.0f, null, l46Var, 24632, 104);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                l46Var2.f0(-277273743);
                l46Var2.r(false);
            }
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new do6(i, 5, j09Var);
        }
    }

    public static final void b(upc upcVar, boolean z, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        int i2;
        upcVar.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-1169225514);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(upcVar) : l46Var.i(upcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            g21.o(null, af1.b0(1887884026, new ck(x16Var, upcVar, x16Var2, z, 8), l46Var), l46Var, 48, 1);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new a60(i, 10, x16Var2, upcVar, x16Var, z);
        }
    }

    public static final void c(int i, x16 x16Var, l46 l46Var, j09 j09Var) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(1459946275);
        int i2 = i | (l46Var2.i(x16Var) ? 4 : 2) | (l46Var.g(j09Var) ? 32 : 16);
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            j09 j09VarB0 = ynb.b0(24.0f, 0.0f, j09Var, 2);
            c92 c92VarA = a92.a(xc0.e, ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
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
            String strQ = afc.q(R.string.seasonal_generating_error_title, l46Var2);
            mue mueVar = pue.a;
            mue mueVarM = pue.m(l46Var2);
            pr4 pr4Var = l8b.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarM, l46Var2, 0, 0, 131066);
            g09 g09Var = g09.a;
            nte.b(ks0.h(8.0f, R.string.seasonal_generating_error_subtitle, l46Var2, l46Var2, g09Var), null, ((e8b) l46Var2.k(pr4Var)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var2), l46Var2, 0, 0, 131066);
            l46Var2 = l46Var2;
            c8b.i(null, ks0.h(24.0f, R.string.seasonal_generating_retry, l46Var2, l46Var2, g09Var), null, null, 0L, 0.0f, false, null, bx5.c(l46Var2), false, null, null, x16Var, l46Var2, 0, (i2 << 6) & 896, 3837);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fc5(x16Var, j09Var, i);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12221. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void d(int r52, defpackage.l46 r53, defpackage.j09 r54, boolean r55) {
        /*
            Method dump skipped, instruction units count: 1222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uyb.d(int, l46, j09, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v0, types: [l46] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    public static final void e(final orc orcVar, final int i, final SolarTerm solarTerm, final boolean z, final boolean z2, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, l46 l46Var, final int i2) {
        final SolarTerm solarTerm2;
        final int i3;
        ojb ojbVarV;
        l26 l26Var;
        boolean z3;
        int i4;
        orcVar.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var.h0(-1275271184);
        int i5 = (l46Var.i(x16Var3) ? 8388608 : 4194304) | i2 | (l46Var.i(orcVar) ? 4 : 2) | (l46Var.e(i) ? 32 : 16) | (l46Var.e(solarTerm.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var) ? 131072 : 65536) | (l46Var.i(x16Var2) ? 1048576 : 524288);
        if (l46Var.W(i5 & 1, (4793491 & i5) != 4793490)) {
            String strE = n3d.e(i, solarTerm);
            if (strE == null) {
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                }
                final int i6 = 0;
                l26Var = new l26(orcVar, i, solarTerm, z, z2, x16Var, x16Var2, x16Var3, i2, i6) { // from class: jmc
                    public final /* synthetic */ int a;
                    public final /* synthetic */ orc b;
                    public final /* synthetic */ int c;
                    public final /* synthetic */ SolarTerm d;
                    public final /* synthetic */ boolean e;
                    public final /* synthetic */ boolean f;
                    public final /* synthetic */ x16 g;
                    public final /* synthetic */ x16 v;
                    public final /* synthetic */ x16 w;

                    {
                        this.a = i6;
                    }

                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i7 = this.a;
                        wef wefVar = wef.a;
                        switch (i7) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(9);
                                uyb.e(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj, iP);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP2 = k99.P(9);
                                uyb.e(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj, iP2);
                                break;
                        }
                        return wefVar;
                    }
                };
            } else {
                solarTerm2 = solarTerm;
                i3 = i;
                e89 e89VarT = tm7.t(orcVar.E0, l46Var);
                int i7 = i5 & 112;
                int i8 = i5 & 896;
                int i9 = i5 & 57344;
                boolean z4 = (i7 == 32) | (i8 == 256) | (i9 == 16384);
                Object objR = l46Var.R();
                Object obj = sf2.a;
                if (z4 || objR == obj) {
                    objR = q1c.f(Boolean.FALSE);
                    l46Var.p0(objR);
                }
                e89 e89Var = (e89) objR;
                int i10 = i5 & 14;
                boolean z5 = (i7 == 32) | (i9 == 16384) | (i10 == 4 || l46Var.i(orcVar)) | (i8 == 256);
                Object objR2 = l46Var.R();
                if (z5 || objR2 == obj) {
                    objR2 = new x16() { // from class: kmc
                        /* JADX WARN: Code duplicated, block: B:17:0x0039  */
                        /* JADX WARN: Code duplicated, block: B:19:0x0045  */
                        /* JADX WARN: Code duplicated, block: B:20:0x0047  */
                        /* JADX WARN: Code duplicated, block: B:23:0x0057  */
                        /* JADX WARN: Code duplicated, block: B:26:0x0067  */
                        /* JADX WARN: Code duplicated, block: B:29:0x0077  */
                        /* JADX WARN: Code duplicated, block: B:31:0x0082  */
                        /* JADX WARN: Code duplicated, block: B:32:0x0087  */
                        /* JADX WARN: Code duplicated, block: B:34:0x0095  */
                        /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
                        @Override // defpackage.x16
                        public final Object invoke() {
                            SeasonalDraftStore$Draft seasonalDraftStore$DraftB;
                            a56 a56VarP;
                            pu1 pu1VarV;
                            kpb kpbVarH;
                            List<TarotCardChoice> listT0;
                            String question;
                            arc arcVar;
                            boolean z6 = z2;
                            orc orcVar2 = orcVar;
                            int i11 = i3;
                            SolarTerm solarTerm3 = solarTerm2;
                            if (z6) {
                                orcVar2.m(i11, solarTerm3);
                            } else {
                                s0e s0eVar = orcVar2.Z;
                                hrc hrcVarF = orcVar2.f(i11, solarTerm3);
                                if (hrcVarF == null) {
                                    s0eVar.n(null, new opc(null));
                                } else {
                                    frc frcVar = orcVar2.d;
                                    if (frcVar == null) {
                                        seasonalDraftStore$DraftB = orcVar2.c.b(i11, solarTerm3.getWireValue());
                                        if (seasonalDraftStore$DraftB == null) {
                                            arcVar = null;
                                        } else {
                                            String genderKey = seasonalDraftStore$DraftB.getGenderKey();
                                            a56.a.getClass();
                                            a56VarP = y25.p(genderKey);
                                            if (a56VarP == null) {
                                                arcVar = null;
                                            } else {
                                                String careerKey = seasonalDraftStore$DraftB.getCareerKey();
                                                pu1.a.getClass();
                                                pu1VarV = m8c.v(careerKey);
                                                if (pu1VarV == null) {
                                                    arcVar = null;
                                                } else {
                                                    String relationshipKey = seasonalDraftStore$DraftB.getRelationshipKey();
                                                    kpb.a.getClass();
                                                    kpbVarH = yx4.h(relationshipKey);
                                                    if (kpbVarH != null) {
                                                        if (seasonalDraftStore$DraftB.getVirtualChoices().size() == 5) {
                                                            listT0 = seasonalDraftStore$DraftB.getVirtualChoices();
                                                        } else if (s72.t0(seasonalDraftStore$DraftB.getPhysicalSlots()).size() == 5) {
                                                            listT0 = s72.t0(seasonalDraftStore$DraftB.getPhysicalSlots());
                                                        } else {
                                                            arcVar = null;
                                                        }
                                                        SeasonalGender seasonalGenderU = an1.U(a56VarP);
                                                        SeasonalCareerStatus seasonalCareerStatusT = an1.T(pu1VarV);
                                                        SeasonalLoveStatus seasonalLoveStatusV = an1.V(kpbVarH);
                                                        question = seasonalDraftStore$DraftB.getQuestion();
                                                        if (question != null || v4e.Q(question)) {
                                                            question = null;
                                                        }
                                                        arcVar = new arc(new SeasonalUserInfo(seasonalGenderU, seasonalCareerStatusT, seasonalLoveStatusV, question), an1.S(listT0));
                                                    } else {
                                                        arcVar = null;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (!frcVar.a.equals(hrcVarF.a)) {
                                            frcVar = null;
                                        }
                                        if (frcVar != null) {
                                            arcVar = frcVar.b;
                                        } else {
                                            seasonalDraftStore$DraftB = orcVar2.c.b(i11, solarTerm3.getWireValue());
                                            if (seasonalDraftStore$DraftB == null) {
                                                arcVar = null;
                                            } else {
                                                String genderKey2 = seasonalDraftStore$DraftB.getGenderKey();
                                                a56.a.getClass();
                                                a56VarP = y25.p(genderKey2);
                                                if (a56VarP == null) {
                                                    arcVar = null;
                                                } else {
                                                    String careerKey2 = seasonalDraftStore$DraftB.getCareerKey();
                                                    pu1.a.getClass();
                                                    pu1VarV = m8c.v(careerKey2);
                                                    if (pu1VarV == null) {
                                                        arcVar = null;
                                                    } else {
                                                        String relationshipKey2 = seasonalDraftStore$DraftB.getRelationshipKey();
                                                        kpb.a.getClass();
                                                        kpbVarH = yx4.h(relationshipKey2);
                                                        if (kpbVarH != null) {
                                                            if (seasonalDraftStore$DraftB.getVirtualChoices().size() == 5) {
                                                                listT0 = seasonalDraftStore$DraftB.getVirtualChoices();
                                                            } else if (s72.t0(seasonalDraftStore$DraftB.getPhysicalSlots()).size() == 5) {
                                                                listT0 = s72.t0(seasonalDraftStore$DraftB.getPhysicalSlots());
                                                            } else {
                                                                arcVar = null;
                                                            }
                                                            SeasonalGender seasonalGenderU2 = an1.U(a56VarP);
                                                            SeasonalCareerStatus seasonalCareerStatusT2 = an1.T(pu1VarV);
                                                            SeasonalLoveStatus seasonalLoveStatusV2 = an1.V(kpbVarH);
                                                            question = seasonalDraftStore$DraftB.getQuestion();
                                                            if (question != null) {
                                                                question = null;
                                                            } else {
                                                                question = null;
                                                            }
                                                            arcVar = new arc(new SeasonalUserInfo(seasonalGenderU2, seasonalCareerStatusT2, seasonalLoveStatusV2, question), an1.S(listT0));
                                                        } else {
                                                            arcVar = null;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    arc arcVar2 = arcVar;
                                    if (arcVar2 == null) {
                                        orcVar2.d().g("Seasonal creation input unavailable; probing the existing cloud reading");
                                        orcVar2.m(i11, solarTerm3);
                                    } else {
                                        hrc hrcVarG = orcVar2.g(hrcVarF);
                                        s0eVar.n(null, ppc.a);
                                        orcVar2.e = ynb.V(hwf.a(orcVar2), null, null, new mrc(orcVar2, i11, solarTerm3, arcVar2, hrcVarG, null), 3);
                                    }
                                }
                            }
                            return wef.a;
                        }
                    };
                    l46Var.p0(objR2);
                }
                x16 x16Var4 = (x16) objR2;
                Integer numValueOf = Integer.valueOf(i3);
                Boolean boolValueOf = Boolean.valueOf(z2);
                boolean zG = l46Var.g(x16Var4) | l46Var.g(e89Var);
                Object objR3 = l46Var.R();
                if (zG || objR3 == obj) {
                    objR3 = new mmc(x16Var4, e89Var, null);
                    l46Var.p0(objR3);
                }
                af1.q(numValueOf, solarTerm2, boolValueOf, (l26) objR3, l46Var);
                upc upcVar = (upc) e89VarT.getValue();
                Boolean bool = (Boolean) e89Var.getValue();
                bool.getClass();
                boolean zG2 = l46Var.g(e89Var) | l46Var.g(e89VarT) | (i10 == 4 || l46Var.i(orcVar)) | ((3670016 & i5) == 1048576) | ((29360128 & i5) == 8388608);
                Object objR4 = l46Var.R();
                if (zG2 || objR4 == obj) {
                    z3 = false;
                    nmc nmcVar = new nmc(orcVar, x16Var2, x16Var3, e89Var, e89VarT, null);
                    l46Var.p0(nmcVar);
                    objR4 = nmcVar;
                } else {
                    z3 = false;
                }
                af1.p(upcVar, bool, (l26) objR4, l46Var);
                if (z) {
                    l46Var.f0(1678179001);
                    boolean zG3 = l46Var.g(strE);
                    Object objR5 = l46Var.R();
                    if (zG3 || objR5 == obj) {
                        i4 = 1;
                        objR5 = new alc(strE, i4);
                        l46Var.p0(objR5);
                    } else {
                        i4 = 1;
                    }
                    dec.b("page_view", (a26) objR5, l46Var, 6);
                    l46Var.r(z3);
                } else {
                    i4 = 1;
                    l46Var.f0(1678387538);
                    l46Var.r(z3);
                }
                upc upcVar2 = (upc) e89VarT.getValue();
                mic.a.getClass();
                b(upcVar2, jy4.o(i, solarTerm) == mic.AutumnEquinox2026 ? i4 : z3, x16Var, x16Var4, l46Var, (i5 >> 9) & 896);
            }
            ojbVarV.d = l26Var;
        }
        solarTerm2 = solarTerm;
        i3 = i;
        l46Var.Z();
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final int i11 = 1;
            final int i12 = i3;
            final SolarTerm solarTerm3 = solarTerm2;
            l26Var = new l26(orcVar, i12, solarTerm3, z, z2, x16Var, x16Var2, x16Var3, i2, i11) { // from class: jmc
                public final /* synthetic */ int a;
                public final /* synthetic */ orc b;
                public final /* synthetic */ int c;
                public final /* synthetic */ SolarTerm d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ x16 g;
                public final /* synthetic */ x16 v;
                public final /* synthetic */ x16 w;

                {
                    this.a = i11;
                }

                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    int i13 = this.a;
                    wef wefVar = wef.a;
                    switch (i13) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int iP = k99.P(9);
                            uyb.e(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj2, iP);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int iP2 = k99.P(9);
                            uyb.e(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj2, iP2);
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var;
        }
    }

    public static final void f(int i, int i2, l26 l26Var, j09 j09Var, boolean z, z67 z67Var, l46 l46Var, int i3, int i4) {
        int i5;
        z67 z67Var2;
        z67 z67Var3;
        l26Var.getClass();
        l46Var.h0(-426908509);
        if ((i3 & 6) == 0) {
            i5 = (l46Var.e(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= l46Var.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= l46Var.i(l26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i5 |= l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            i5 |= l46Var.h(z) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i3) == 0) {
            if ((i4 & 32) == 0) {
                z67Var2 = z67Var;
                int i6 = l46Var.i(z67Var2) ? 131072 : 65536;
                i5 |= i6;
            } else {
                z67Var2 = z67Var;
            }
            i5 |= i6;
        } else {
            z67Var2 = z67Var;
        }
        if (l46Var.W(i5 & 1, (74899 & i5) != 74898)) {
            l46Var.b0();
            if ((i3 & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
                if ((i4 & 32) != 0) {
                    i5 &= -458753;
                }
            } else if ((i4 & 32) != 0) {
                z67Var2 = new z67(0, 23, 1);
                i5 &= -458753;
            }
            z67 z67Var4 = z67Var2;
            l46Var.s();
            if (z67Var4.isEmpty() || z67Var4.a < 0 || z67Var4.b > 23) {
                qc0.j("hourRange must contain at least one hour within 0..23");
                return;
            }
            if (z) {
                l46Var.f0(-632827982);
                i(i, i2, l26Var, j09Var, z67Var4, l46Var, (i5 & 8190) | ((i5 >> 3) & 57344));
                l46Var.r(false);
            } else {
                l46Var.f0(-632745646);
                g(i, i2, l26Var, j09Var, z67Var4, l46Var, (i5 & 8190) | ((i5 >> 3) & 57344));
                l46Var.r(false);
            }
            z67Var3 = z67Var4;
        } else {
            l46Var.Z();
            z67Var3 = z67Var2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ni2(i, i2, l26Var, j09Var, z, z67Var3, i3, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(final int i, final int i2, final l26 l26Var, j09 j09Var, final z67 z67Var, l46 l46Var, int i3) {
        int i4;
        int i5;
        Object obj;
        l46Var.h0(73848006);
        int i6 = (i3 & 6) == 0 ? (l46Var.e(i) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i6 |= l46Var.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= l46Var.i(l26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i6 |= l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            i6 |= l46Var.i(z67Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i6 & 1, (i6 & 9363) != 9362)) {
            Object objR = l46Var.R();
            Object obj2 = sf2.a;
            if (objR == obj2) {
                String[] strArr = new String[60];
                int i7 = 0;
                for (int i8 = 60; i7 < i8; i8 = 60) {
                    strArr[i7] = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i7)}, 1));
                    i7++;
                }
                l46Var.p0(strArr);
                objR = strArr;
            }
            final String[] strArr2 = (String[]) objR;
            Object objR2 = l46Var.R();
            if (objR2 == obj2) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(Locale.getDefault());
                String[] strArr3 = {dateFormatSymbols.getAmPmStrings()[0], dateFormatSymbols.getAmPmStrings()[1]};
                l46Var.p0(strArr3);
                objR2 = strArr3;
            }
            String[] strArr4 = (String[]) objR2;
            final int i9 = i == 0 ? 12 : i > 12 ? i - 12 : i;
            boolean z = i >= 12;
            boolean zG = l46Var.g(z67Var);
            Object objR3 = l46Var.R();
            if (zG || objR3 == obj2) {
                List listI = t72.I(Boolean.FALSE, Boolean.TRUE);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : listI) {
                    int i10 = i6;
                    boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                    if (!(z67Var instanceof Collection) || !((Collection) z67Var).isEmpty()) {
                        Iterator it = z67Var.iterator();
                        while (((y67) it).c) {
                            if ((((q67) it).nextInt() >= 12) == zBooleanValue) {
                                arrayList.add(obj3);
                                break;
                            }
                        }
                    }
                    i6 = i10;
                }
                i4 = i6;
                l46Var.p0(arrayList);
                objR3 = arrayList;
            } else {
                i4 = i6;
            }
            final List list = (List) objR3;
            int iIndexOf = list.indexOf(Boolean.valueOf(z));
            Integer numValueOf = Integer.valueOf(iIndexOf);
            if (iIndexOf < 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            final boolean zBooleanValue2 = ((Boolean) list.get(iIntValue)).booleanValue();
            boolean zG2 = l46Var.g(z67Var) | l46Var.h(zBooleanValue2);
            Object objR4 = l46Var.R();
            if (zG2 || objR4 == obj2) {
                z67 z67Var2 = new z67(1, 12, 1);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = z67Var2.iterator();
                while (((y67) it2).c) {
                    Object next = ((q67) it2).next();
                    int iIntValue2 = ((Number) next).intValue();
                    int i11 = iIntValue;
                    int i12 = z67Var.a;
                    Iterator it3 = it2;
                    int i13 = z67Var.b;
                    int iH = h(iIntValue2, zBooleanValue2);
                    if (i12 <= iH && iH <= i13) {
                        arrayList2.add(next);
                    }
                    iIntValue = i11;
                    it2 = it3;
                }
                i5 = iIntValue;
                l46Var.p0(arrayList2);
                obj = arrayList2;
            } else {
                i5 = iIntValue;
                obj = objR4;
            }
            final List list2 = (List) obj;
            int iIndexOf2 = list2.indexOf(Integer.valueOf(i9));
            Integer numValueOf2 = Integer.valueOf(iIndexOf2);
            if (iIndexOf2 < 0) {
                numValueOf2 = null;
            }
            final int iIntValue3 = numValueOf2 != null ? numValueOf2.intValue() : 0;
            boolean zG3 = l46Var.g(list2);
            Object objR5 = l46Var.R();
            Object obj4 = objR5;
            if (zG3 || objR5 == obj2) {
                ArrayList arrayList3 = new ArrayList(t72.u(list2, 10));
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(String.valueOf(((Number) it4.next()).intValue()));
                }
                Object obj5 = (String[]) arrayList3.toArray(new String[0]);
                l46Var.p0(obj5);
                obj4 = obj5;
            }
            final String[] strArr5 = (String[]) obj4;
            boolean zG4 = l46Var.g(list) | l46Var.g(strArr4);
            Object objR6 = l46Var.R();
            Object obj6 = objR6;
            if (zG4 || objR6 == obj2) {
                ArrayList arrayList4 = new ArrayList(t72.u(list, 10));
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(strArr4[((Boolean) it5.next()).booleanValue() ? 1 : 0]);
                }
                Object obj7 = (String[]) arrayList4.toArray(new String[0]);
                l46Var.p0(obj7);
                obj6 = obj7;
            }
            final String[] strArr6 = (String[]) obj6;
            final int i14 = i5;
            xxb.l(j09Var, 0.0f, 0.0f, xc0.f, 0L, af1.b0(-2017210661, new n26() { // from class: u3g
                /* JADX WARN: Code duplicated, block: B:30:0x013a  */
                @Override // defpackage.n26
                public final Object m(Object obj8, Object obj9, Object obj10) {
                    i8c i8cVar;
                    List list3;
                    int i15;
                    z67 z67Var3;
                    boolean zI;
                    Object objR7;
                    u7c u7cVar = (u7c) obj8;
                    l46 l46Var2 = (l46) obj9;
                    int iIntValue4 = ((Integer) obj10).intValue();
                    u7cVar.getClass();
                    if ((iIntValue4 & 6) == 0) {
                        iIntValue4 |= l46Var2.g(u7cVar) ? 4 : 2;
                    }
                    if (l46Var2.W(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                        List list4 = list2;
                        z67 z67VarB = t72.B(list4);
                        g09 g09Var = g09.a;
                        j09 j09VarA = u7cVar.a(g09Var, 1.0f, true);
                        l26 l26Var2 = l26Var;
                        boolean zG5 = l46Var2.g(l26Var2) | l46Var2.i(list4);
                        boolean z2 = zBooleanValue2;
                        boolean zH = zG5 | l46Var2.h(z2);
                        int i16 = i2;
                        boolean zE = zH | l46Var2.e(i16);
                        Object objR8 = l46Var2.R();
                        i8c i8cVar2 = sf2.a;
                        if (zE || objR8 == i8cVar2) {
                            objR8 = new px6(l26Var2, list4, z2, i16);
                            l46Var2.p0(objR8);
                        }
                        xxb.k(iIntValue3, z67VarB, (a26) objR8, j09VarA, strArr5, null, 0.0f, 0, 0.0f, null, null, l46Var2, 0, 2016);
                        int iO = mh3.o(i16, 0, 59);
                        z67 z67Var4 = new z67(0, 59, 1);
                        j09 j09VarA2 = u7cVar.a(g09Var, 1.0f, true);
                        boolean zG6 = l46Var2.g(l26Var2);
                        int i17 = i;
                        boolean zE2 = zG6 | l46Var2.e(i17);
                        Object objR9 = l46Var2.R();
                        if (zE2) {
                            i8cVar = i8cVar2;
                        } else {
                            i8cVar = i8cVar2;
                            if (objR9 == i8cVar) {
                            }
                            i8c i8cVar3 = i8cVar;
                            xxb.k(iO, z67Var4, (a26) objR9, j09VarA2, strArr2, null, 0.0f, 0, 0.0f, null, null, l46Var2, 0, 2016);
                            list3 = list;
                            z67 z67VarB2 = t72.B(list3);
                            j09 j09VarA3 = u7cVar.a(g09Var, 1.0f, true);
                            boolean zI2 = l46Var2.i(list3);
                            i15 = i9;
                            boolean zE3 = zI2 | l46Var2.e(i15);
                            z67Var3 = z67Var;
                            zI = zE3 | l46Var2.i(z67Var3) | l46Var2.g(l26Var2) | l46Var2.e(i16);
                            objR7 = l46Var2.R();
                            if (zI || objR7 == i8cVar3) {
                                w3g w3gVar = new w3g(list3, i15, z67Var3, l26Var2, i16);
                                l46Var2.p0(w3gVar);
                                objR7 = w3gVar;
                            }
                            xxb.k(i14, z67VarB2, (a26) objR7, j09VarA3, strArr6, null, 0.0f, 0, 0.0f, null, null, l46Var2, 0, 2016);
                        }
                        objR9 = new v3g(i17, 0, l26Var2);
                        l46Var2.p0(objR9);
                        i8c i8cVar4 = i8cVar;
                        xxb.k(iO, z67Var4, (a26) objR9, j09VarA2, strArr2, null, 0.0f, 0, 0.0f, null, null, l46Var2, 0, 2016);
                        list3 = list;
                        z67 z67VarB3 = t72.B(list3);
                        j09 j09VarA4 = u7cVar.a(g09Var, 1.0f, true);
                        boolean zI3 = l46Var2.i(list3);
                        i15 = i9;
                        boolean zE4 = zI3 | l46Var2.e(i15);
                        z67Var3 = z67Var;
                        zI = zE4 | l46Var2.i(z67Var3) | l46Var2.g(l26Var2) | l46Var2.e(i16);
                        objR7 = l46Var2.R();
                        if (zI) {
                            w3g w3gVar2 = new w3g(list3, i15, z67Var3, l26Var2, i16);
                            l46Var2.p0(w3gVar2);
                            objR7 = w3gVar2;
                        } else {
                            w3g w3gVar3 = new w3g(list3, i15, z67Var3, l26Var2, i16);
                            l46Var2.p0(w3gVar3);
                            objR7 = w3gVar3;
                        }
                        xxb.k(i14, z67VarB3, (a26) objR7, j09VarA4, strArr6, null, 0.0f, 0, 0.0f, null, null, l46Var2, 0, 2016);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, ((i4 >> 9) & 14) | 199680, 22);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new t3g(i, i2, l26Var, j09Var, z67Var, i3, 1);
        }
    }

    public static final int h(int i, boolean z) {
        if (!z && i == 12) {
            return 0;
        }
        if (z && i == 12) {
            return 12;
        }
        return z ? i + 12 : i;
    }

    public static final void i(int i, int i2, l26 l26Var, j09 j09Var, z67 z67Var, l46 l46Var, int i3) {
        int i4;
        int i5;
        int i6;
        l26 l26Var2;
        j09 j09Var2;
        l46Var.h0(-662074043);
        if ((i3 & 6) == 0) {
            i4 = i;
            i5 = (l46Var.e(i4) ? 4 : 2) | i3;
        } else {
            i4 = i;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 = i2;
            i5 |= l46Var.e(i6) ? 32 : 16;
        } else {
            i6 = i2;
        }
        if ((i3 & 384) == 0) {
            l26Var2 = l26Var;
            i5 |= l46Var.i(l26Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            l26Var2 = l26Var;
        }
        if ((i3 & 3072) == 0) {
            j09Var2 = j09Var;
            i5 |= l46Var.g(j09Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            j09Var2 = j09Var;
        }
        if ((i3 & 24576) == 0) {
            i5 |= l46Var.i(z67Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i5 & 1, (i5 & 9363) != 9362)) {
            boolean zG = l46Var.g(z67Var);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = s72.j1(z67Var);
                l46Var.p0(objR);
            }
            List list = (List) objR;
            boolean zG2 = l46Var.g(list);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == obj) {
                ArrayList arrayList = new ArrayList(t72.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((Number) it.next()).intValue())}, 1)));
                }
                objR2 = (String[]) arrayList.toArray(new String[0]);
                l46Var.p0(objR2);
            }
            String[] strArr = (String[]) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                String[] strArr2 = new String[60];
                for (int i7 = 0; i7 < 60; i7++) {
                    strArr2[i7] = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i7)}, 1));
                }
                l46Var.p0(strArr2);
                objR3 = strArr2;
            }
            String[] strArr3 = (String[]) objR3;
            int iIndexOf = list.indexOf(Integer.valueOf(i4));
            Integer numValueOf = Integer.valueOf(iIndexOf);
            if (iIndexOf < 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            xxb.l(j09Var2, 0.0f, 0.0f, xc0.f, 0L, af1.b0(1541834586, new kxf(list, iIntValue, l26Var2, i6, strArr, i4, strArr3), l46Var), l46Var, ((i5 >> 9) & 14) | 199680, 22);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new t3g(i, i2, l26Var, j09Var, z67Var, i3, 0);
        }
    }

    public static Intent j(Context context) {
        context.getClass();
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        return intent;
    }

    public static final boolean k(Context context) {
        context.getClass();
        return new nh9(context).b.areNotificationsEnabled();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        defpackage.qc0.p("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        defpackage.qc0.p("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean l(defpackage.hkb r18, defpackage.hkb r19, defpackage.hkb r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = m(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = m(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            defpackage.qc0.p(r4)
            return r12
        L94:
            defpackage.qc0.p(r4)
            return r12
        L98:
            return r18
        L99:
            defpackage.qc0.p(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uyb.l(hkb, hkb, hkb, int):boolean");
    }

    public static final boolean m(int i, hkb hkbVar, hkb hkbVar2) {
        if (i == 3 || i == 4) {
            return hkbVar.d > hkbVar2.b && hkbVar.b < hkbVar2.d;
        }
        if (i == 5 || i == 6) {
            return hkbVar.c > hkbVar2.a && hkbVar.a < hkbVar2.c;
        }
        qc0.p("This function should only be used for 2-D focus search");
        return false;
    }

    public static b6d n(x6d x6dVar, e8d e8dVar, String str) {
        x6dVar.getClass();
        e8dVar.getClass();
        fl8 fl8Var = new fl8();
        fl8Var.putAll(q3c.l(x6dVar, e8dVar));
        fl8Var.put("pathway", str);
        fl8Var.put("scene", x6dVar.a(e8dVar));
        int iOrdinal = e8dVar.ordinal();
        String str2 = null;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                str2 = "short";
            } else {
                if (iOrdinal != 2) {
                    ap.c();
                    return null;
                }
                str2 = Constants.LONG;
            }
        }
        if (str2 != null) {
            fl8Var.put("layout", str2);
        }
        return new b6d("card_share", fl8Var.j());
    }

    public static final void o(oo5 oo5Var, p89 p89Var) {
        if (!oo5Var.a.Y) {
            i37.c("visitChildren called on an unattached node");
        }
        p89 p89Var2 = new p89(0, new i09[16]);
        i09 i09Var = oo5Var.a;
        i09 i09Var2 = i09Var.f;
        if (i09Var2 == null) {
            vd0.H(p89Var2, i09Var);
        } else {
            p89Var2.b(i09Var2);
        }
        while (true) {
            int i = p89Var2.c;
            if (i == 0) {
                return;
            }
            i09 i09VarM0 = (i09) p89Var2.k(i - 1);
            if ((i09VarM0.d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                vd0.H(p89Var2, i09VarM0);
            } else {
                while (i09VarM0 != null) {
                    if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        p89 p89Var3 = null;
                        while (i09VarM0 != null) {
                            if (i09VarM0 instanceof oo5) {
                                oo5 oo5Var2 = (oo5) i09VarM0;
                                if (oo5Var2.Y && !vd0.s0(oo5Var2).f1) {
                                    if (oo5Var2.n1().a) {
                                        p89Var.b(oo5Var2);
                                    } else {
                                        o(oo5Var2, p89Var);
                                    }
                                }
                            } else if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM0 instanceof sv3)) {
                                int i2 = 0;
                                for (i09 i09Var3 = ((sv3) i09VarM0).E0; i09Var3 != null; i09Var3 = i09Var3.f) {
                                    if ((i09Var3.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            i09VarM0 = i09Var3;
                                        } else {
                                            if (p89Var3 == null) {
                                                p89Var3 = new p89(0, new i09[16]);
                                            }
                                            if (i09VarM0 != null) {
                                                p89Var3.b(i09VarM0);
                                                i09VarM0 = null;
                                            }
                                            p89Var3.b(i09Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            i09VarM0 = vd0.m0(p89Var3);
                        }
                        break;
                    }
                    i09VarM0 = i09VarM0.f;
                }
            }
        }
    }

    public static tyb p(String str, oq8 oq8Var) {
        str.getClass();
        iy9 iy9VarK = pa7.K(oq8Var);
        Charset charset = (Charset) iy9VarK.a();
        oq8 oq8Var2 = (oq8) iy9VarK.b();
        f41 f41Var = new f41();
        charset.getClass();
        int length = str.length();
        str.getClass();
        if (length < 0) {
            qc0.o(ks0.k("endIndex < beginIndex: ", length, " < ", 0));
        } else if (length > str.length()) {
            qc0.h(str.length(), ub3.n(length, "endIndex > string.length: ", " > "));
        } else if (charset.equals(ox1.a)) {
            f41Var.m1(0, length, str);
        } else {
            byte[] bytes = str.substring(0, length).getBytes(charset);
            bytes.getClass();
            f41Var.g1(bytes, bytes.length);
        }
        return new tyb(oq8Var2, f41Var.b, f41Var);
    }

    public static final oo5 q(p89 p89Var, hkb hkbVar, int i) {
        hkb hkbVarJ;
        oo5 oo5Var = null;
        if (i == 3) {
            hkbVarJ = hkbVar.j((hkbVar.c - hkbVar.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            hkbVarJ = hkbVar.j(-((hkbVar.c - hkbVar.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            hkbVarJ = hkbVar.j(0.0f, (hkbVar.d - hkbVar.b) + 1.0f);
        } else {
            if (i != 6) {
                qc0.p("This function should only be used for 2-D focus search");
                return null;
            }
            hkbVarJ = hkbVar.j(0.0f, -((hkbVar.d - hkbVar.b) + 1.0f));
        }
        Object[] objArr = p89Var.a;
        int i2 = p89Var.c;
        for (int i3 = 0; i3 < i2; i3++) {
            oo5 oo5Var2 = (oo5) objArr[i3];
            if (vpf.I(oo5Var2)) {
                hkb hkbVarZ = vpf.z(oo5Var2);
                if (u(hkbVarZ, hkbVarJ, hkbVar, i)) {
                    oo5Var = oo5Var2;
                    hkbVarJ = hkbVarZ;
                }
            }
        }
        return oo5Var;
    }

    public static final boolean r(oo5 oo5Var, int i, a26 a26Var) {
        hkb hkbVar;
        p89 p89Var = new p89(0, new oo5[16]);
        o(oo5Var, p89Var);
        int i2 = p89Var.c;
        if (i2 <= 1) {
            oo5 oo5Var2 = (oo5) (i2 == 0 ? null : p89Var.a[0]);
            if (oo5Var2 != null) {
                return ((Boolean) a26Var.d(oo5Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                hkb hkbVarZ = vpf.z(oo5Var);
                float f = hkbVarZ.a;
                float f2 = hkbVarZ.b;
                hkbVar = new hkb(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    qc0.p("This function should only be used for 2-D focus search");
                    return false;
                }
                hkb hkbVarZ2 = vpf.z(oo5Var);
                float f3 = hkbVarZ2.c;
                float f4 = hkbVarZ2.d;
                hkbVar = new hkb(f3, f4, f3, f4);
            }
            oo5 oo5VarQ = q(p89Var, hkbVar, i);
            if (oo5VarQ != null) {
                return ((Boolean) a26Var.d(oo5VarQ)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean s(int i, it3 it3Var, oo5 oo5Var, hkb hkbVar) {
        if (C(i, it3Var, oo5Var, hkbVar)) {
            return true;
        }
        Boolean bool = (Boolean) b21.N(oo5Var, i, new b92(i, 4, ((bo5) vd0.t0(oo5Var).getFocusOwner()).g(), oo5Var, hkbVar, it3Var));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean t(char c) {
        return '0' <= c && c < ':';
    }

    public static final boolean u(hkb hkbVar, hkb hkbVar2, hkb hkbVar3, int i) {
        if (!v(i, hkbVar, hkbVar3)) {
            return false;
        }
        if (v(i, hkbVar2, hkbVar3) && !l(hkbVar3, hkbVar, hkbVar2, i)) {
            return !l(hkbVar3, hkbVar2, hkbVar, i) && w(i, hkbVar3, hkbVar) < w(i, hkbVar3, hkbVar2);
        }
        return true;
    }

    public static final boolean v(int i, hkb hkbVar, hkb hkbVar2) {
        if (i == 3) {
            float f = hkbVar2.c;
            float f2 = hkbVar2.a;
            float f3 = hkbVar.c;
            return (f > f3 || f2 >= f3) && f2 > hkbVar.a;
        }
        if (i == 4) {
            float f4 = hkbVar2.a;
            float f5 = hkbVar2.c;
            float f6 = hkbVar.a;
            return (f4 < f6 || f5 <= f6) && f5 < hkbVar.c;
        }
        if (i == 5) {
            float f7 = hkbVar2.d;
            float f8 = hkbVar2.b;
            float f9 = hkbVar.d;
            return (f7 > f9 || f8 >= f9) && f8 > hkbVar.b;
        }
        if (i != 6) {
            qc0.p("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = hkbVar2.b;
        float f11 = hkbVar2.d;
        float f12 = hkbVar.b;
        return (f10 < f12 || f11 <= f12) && f11 < hkbVar.d;
    }

    public static final long w(int i, hkb hkbVar, hkb hkbVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = hkbVar.a;
            f2 = hkbVar2.c;
        } else if (i == 4) {
            f = hkbVar2.a;
            f2 = hkbVar.c;
        } else if (i == 5) {
            f = hkbVar.b;
            f2 = hkbVar2.d;
        } else {
            if (i != 6) {
                qc0.p("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = hkbVar2.b;
            f2 = hkbVar.d;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = hkbVar.b;
            f3 = ((hkbVar.d - f7) / 2.0f) + f7;
            f4 = hkbVar2.b;
            f5 = hkbVar2.d;
        } else {
            if (i != 5 && i != 6) {
                qc0.p("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = hkbVar.a;
            f3 = ((hkbVar.c - f8) / 2.0f) + f8;
            f4 = hkbVar2.a;
            f5 = hkbVar2.c;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    public static final e89 x(l26 l26Var, l46 l46Var, Object obj) {
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = q1c.f(obj);
            l46Var.p0(objR);
        }
        e89 e89Var = (e89) objR;
        boolean zI = l46Var.i(l26Var);
        Object objR2 = l46Var.R();
        if (zI || objR2 == i8cVar) {
            objR2 = new asd(l26Var, e89Var, null);
            l46Var.p0(objR2);
        }
        af1.o((l26) objR2, l46Var, wef.a);
        return e89Var;
    }

    public static final e89 y(Object obj, Object obj2, Object obj3, l26 l26Var, l46 l46Var, int i) {
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = q1c.f(obj);
            l46Var.p0(objR);
        }
        e89 e89Var = (e89) objR;
        boolean zI = l46Var.i(l26Var);
        Object objR2 = l46Var.R();
        if (zI || objR2 == i8cVar) {
            objR2 = new csd(l26Var, e89Var, null);
            l46Var.p0(objR2);
        }
        af1.p(obj2, obj3, (l26) objR2, l46Var);
        return e89Var;
    }

    public static final e89 z(Object obj, Object[] objArr, l26 l26Var, l46 l46Var) {
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = q1c.f(obj);
            l46Var.p0(objR);
        }
        e89 e89Var = (e89) objR;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zI = l46Var.i(l26Var);
        Object objR2 = l46Var.R();
        if (zI || objR2 == i8cVar) {
            objR2 = new esd(l26Var, e89Var, null);
            l46Var.p0(objR2);
        }
        af1.r(objArrCopyOf, (l26) objR2, l46Var);
        return e89Var;
    }
}
