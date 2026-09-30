package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.util.Base64;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o5c {
    public static final void a(boolean z, boolean z2, x16 x16Var, x16 x16Var2, j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1402850945);
        int i2 = i | (l46Var2.h(z) ? 4 : 2) | (l46Var2.h(z2) ? 32 : 16) | (l46Var2.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.g(j09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var2.W(i2 & 1, (i2 & 9363) != 9362)) {
            j09 j09VarD0 = ynb.d0(0.0f, 16.0f, 0.0f, 16.0f, 5, ynb.b0(20.0f, 0.0f, mh3.N(tm7.n(b.c(j09Var, 1.0f), gec.N(((sw3) l46Var2.k(zg2.h)).p0(40.0f), 8, t72.I(new y72(y72.j), new y72(bx5.g(l46Var2)))), null, 6)), 2));
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
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
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            cx4 cx4VarA = rw4.f(null, 3).a(rw4.b(null, null, 15));
            f45 f45VarA = rw4.g(null, 3).a(rw4.i(null, null, 15));
            dd2 dd2VarB0 = af1.b0(-174189637, new n(12, x16Var), l46Var2);
            v7c v7cVar = v7c.a;
            m93.c(v7cVar, !z, null, cx4VarA, f45VarA, null, dd2VarB0, l46Var2, 1600518, 18);
            g09 g09Var = g09.a;
            f(l46Var2, v7cVar.a(g09Var, 1.0f, true));
            j09 j09VarF = b.f(48.0f, 0.0f, g09Var, 2);
            bx9 bx9Var = v51.a;
            c8b.k(j09VarF, false, null, v51.a(bx5.b(l46Var2).a, ((e8b) l46Var2.k(l8b.a)).v, 0L, 0L, l46Var, 12), null, new bx9(24.0f, 12.0f, 24.0f, 12.0f), false, x16Var2, af1.b0(-1817265299, new g8(z2, 5), l46Var), l46Var, (29360128 & (i2 << 12)) | 100859910, 86);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new z50(z, z2, x16Var, x16Var2, j09Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:70:0x0192  */
    /* JADX WARN: Code duplicated, block: B:73:0x019c  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void b(kkc kkcVar, int i, j09 j09Var, l46 l46Var, int i2, int i3) {
        int i4;
        j09 j09Var2;
        boolean z;
        j09 j09Var3;
        ojb ojbVarV;
        j09 j09Var4;
        int iOrdinal;
        int i5;
        int i6;
        i00 i00Var;
        int iK;
        int iK2;
        l46Var.h0(-915443664);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.e(kkcVar.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.e(i) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & 384) == 0) {
                j09Var2 = j09Var;
                i4 |= l46Var.g(j09Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
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
                iOrdinal = kkcVar.ordinal();
                if (iOrdinal != 0) {
                    i5 = R.string.seasonal_position_major;
                } else if (iOrdinal != 1) {
                    i5 = R.string.seasonal_position_wands;
                } else if (iOrdinal != 2) {
                    i5 = R.string.seasonal_position_cups;
                } else if (iOrdinal != 3) {
                    i5 = R.string.seasonal_position_swords;
                } else {
                    if (iOrdinal == 4) {
                        ap.c();
                        return;
                    }
                    i5 = R.string.seasonal_position_pentacles;
                }
                if (i != 0) {
                    i6 = R.string.seasonal_reading_heading_overall;
                } else if (i != 1) {
                    i6 = R.string.seasonal_reading_heading_action;
                } else if (i != 2) {
                    i6 = R.string.seasonal_reading_heading_relationship;
                } else if (i != 3) {
                    i6 = R.string.seasonal_reading_heading_reality;
                } else {
                    i6 = R.string.seasonal_reading_heading_thought;
                }
                String strQ = afc.q(i5, l46Var);
                String strQ2 = afc.q(i6, l46Var);
                l46Var.f0(726968313);
                i00Var = new i00();
                iK = i00Var.k(new xtd(((e8b) l46Var.k(l8b.a)).q, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    i00Var.f(strQ);
                    i00Var.f(" · ");
                    i00Var.h(iK);
                    iK2 = i00Var.k(new xtd(bx5.d(l46Var), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        i00Var.f(strQ2);
                        i00Var.h(iK2);
                        k00 k00VarL = i00Var.l();
                        l46Var.r(false);
                        j09 j09VarC = b.c(j09Var4, 1.0f);
                        mue mueVar = pue.a;
                        vd0.d(k00VarL, j09VarC, mue.a(pue.n(l46Var), 0L, 0L, null, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 3, w6c.l(40), null, null, 16613343), null, 0, false, 1, 0, null, new co0(w6c.l(16), w6c.l(27), w6c.k(0.25d)), l46Var, 1769472, 0, 920);
                        j09Var3 = j09Var4;
                    } catch (Throwable th) {
                        i00Var.h(iK2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    i00Var.h(iK);
                    throw th2;
                }
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new vb(kkcVar, i, j09Var3, i2, i3);
            }
        }
        i4 |= 384;
        j09Var2 = j09Var;
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
            iOrdinal = kkcVar.ordinal();
            if (iOrdinal != 0) {
                i5 = R.string.seasonal_position_major;
            } else if (iOrdinal != 1) {
                i5 = R.string.seasonal_position_wands;
            } else if (iOrdinal != 2) {
                i5 = R.string.seasonal_position_cups;
            } else if (iOrdinal != 3) {
                i5 = R.string.seasonal_position_swords;
            } else {
                if (iOrdinal == 4) {
                    ap.c();
                    return;
                }
                i5 = R.string.seasonal_position_pentacles;
            }
            if (i != 0) {
                i6 = R.string.seasonal_reading_heading_overall;
            } else if (i != 1) {
                i6 = R.string.seasonal_reading_heading_action;
            } else if (i != 2) {
                i6 = R.string.seasonal_reading_heading_relationship;
            } else if (i != 3) {
                i6 = R.string.seasonal_reading_heading_reality;
            } else {
                i6 = R.string.seasonal_reading_heading_thought;
            }
            String strQ3 = afc.q(i5, l46Var);
            String strQ4 = afc.q(i6, l46Var);
            l46Var.f0(726968313);
            i00Var = new i00();
            iK = i00Var.k(new xtd(((e8b) l46Var.k(l8b.a)).q, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            i00Var.f(strQ3);
            i00Var.f(" · ");
            i00Var.h(iK);
            iK2 = i00Var.k(new xtd(bx5.d(l46Var), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            i00Var.f(strQ4);
            i00Var.h(iK2);
            k00 k00VarL2 = i00Var.l();
            l46Var.r(false);
            j09 j09VarC2 = b.c(j09Var4, 1.0f);
            mue mueVar2 = pue.a;
            vd0.d(k00VarL2, j09VarC2, mue.a(pue.n(l46Var), 0L, 0L, null, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 3, w6c.l(40), null, null, 16613343), null, 0, false, 1, 0, null, new co0(w6c.l(16), w6c.l(27), w6c.k(0.25d)), l46Var, 1769472, 0, 920);
            j09Var3 = j09Var4;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vb(kkcVar, i, j09Var3, i2, i3);
        }
    }

    public static final void c(final fpc fpcVar, final int i, final SolarTerm solarTerm, final boolean z, final boolean z2, final x16 x16Var, final x16 x16Var2, l46 l46Var, final int i2) {
        ojb ojbVarV;
        l26 l26Var;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-135569627);
        int i3 = i2 | (l46Var.g(fpcVar) ? 4 : 2) | (l46Var.e(i) ? 32 : 16) | (l46Var.e(solarTerm.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var) ? 131072 : 65536) | (l46Var.i(x16Var2) ? 1048576 : 524288) | 12582912;
        if (l46Var.W(i3 & 1, (i3 & 4793491) != 4793490)) {
            final String strE = n3d.e(i, solarTerm);
            if (strE == null) {
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                }
                final int i4 = 0;
                l26Var = new l26(fpcVar, i, solarTerm, z, z2, x16Var, x16Var2, i2, i4) { // from class: poc
                    public final /* synthetic */ int a;
                    public final /* synthetic */ fpc b;
                    public final /* synthetic */ int c;
                    public final /* synthetic */ SolarTerm d;
                    public final /* synthetic */ boolean e;
                    public final /* synthetic */ boolean f;
                    public final /* synthetic */ x16 g;
                    public final /* synthetic */ x16 v;

                    {
                        this.a = i4;
                    }

                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i5 = this.a;
                        wef wefVar = wef.a;
                        switch (i5) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(1);
                                o5c.c(this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj, iP);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP2 = k99.P(1);
                                o5c.c(this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj, iP2);
                                break;
                        }
                        return wefVar;
                    }
                };
            } else {
                final x48 x48Var = (x48) l46Var.k(cb8.a);
                Object objR = l46Var.R();
                ii6 ii6VarB0 = null;
                Object obj = sf2.a;
                if (objR == obj) {
                    objR = q1c.f(null);
                    l46Var.p0(objR);
                }
                final e89 e89Var = (e89) objR;
                Object objR2 = l46Var.R();
                if (objR2 == obj) {
                    objR2 = q1c.f(Boolean.FALSE);
                    l46Var.p0(objR2);
                }
                final e89 e89Var2 = (e89) objR2;
                List list = fpcVar != null ? fpcVar.b : null;
                if (list == null) {
                    list = pu4.a;
                }
                final List list2 = list;
                Object objR3 = l46Var.R();
                if (objR3 == obj) {
                    objR3 = new osd();
                    l46Var.p0(objR3);
                }
                final osd osdVar = (osd) objR3;
                boolean zI = l46Var.i(list2);
                Object objR4 = l46Var.R();
                int i5 = 6;
                if (zI || objR4 == obj) {
                    objR4 = new h53(list2, i5);
                    l46Var.p0(objR4);
                }
                final cs3 cs3VarB = ay9.b(0, 6, 2, (x16) objR4, l46Var);
                if (solarTerm == SolarTerm.AUTUMN_EQUINOX) {
                    l46Var.f0(-1433348904);
                    ii6VarB0 = g21.b0(l46Var);
                } else {
                    l46Var.f0(-1484118728);
                }
                l46Var.r(false);
                final ii6 ii6Var = ii6VarB0;
                g21.o(ii6Var, af1.b0(-838794167, new n26() { // from class: soc
                    @Override // defpackage.n26
                    public final Object m(Object obj2, Object obj3, Object obj4) {
                        l46 l46Var2 = (l46) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        ((c31) obj2).getClass();
                        if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                            long j = y72.j;
                            x16 x16Var3 = x16Var;
                            SolarTerm solarTerm2 = solarTerm;
                            boolean z3 = z2;
                            xdc.a(null, af1.b0(-745994227, new l30(x16Var3, solarTerm2, z3, fpcVar, e89Var2), l46Var2), null, null, null, 0, j, 0L, null, af1.b0(-1080648680, new e8(list2, cs3VarB, x48Var, z3, z, strE, x16Var2, ii6Var, osdVar, e89Var), l46Var2), l46Var2, 806879280, 445);
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, 48, 0);
                if (fpcVar != null) {
                    l46Var.f0(-1478740506);
                    boolean zBooleanValue = ((Boolean) e89Var2.getValue()).booleanValue();
                    Object objR5 = l46Var.R();
                    if (objR5 == obj) {
                        objR5 = new xfc(e89Var2, 5);
                        l46Var.p0(objR5);
                    }
                    o7c.f(zBooleanValue, (x16) objR5, fpcVar, new urc(((sz9) cs3VarB.d.c).j()), l46Var, 48 | ((i3 << 6) & 896), 0);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-1478472387);
                    l46Var.r(false);
                }
            }
            ojbVarV.d = l26Var;
        }
        l46Var.Z();
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final int i6 = 1;
            l26Var = new l26(fpcVar, i, solarTerm, z, z2, x16Var, x16Var2, i2, i6) { // from class: poc
                public final /* synthetic */ int a;
                public final /* synthetic */ fpc b;
                public final /* synthetic */ int c;
                public final /* synthetic */ SolarTerm d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ x16 g;
                public final /* synthetic */ x16 v;

                {
                    this.a = i6;
                }

                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    int i7 = this.a;
                    wef wefVar = wef.a;
                    switch (i7) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int iP = k99.P(1);
                            o5c.c(this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj2, iP);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int iP2 = k99.P(1);
                            o5c.c(this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj2, iP2);
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var;
        }
    }

    public static final void d(int i, int i2, l46 l46Var) {
        int i3;
        int i4;
        l46Var.h0(-483127694);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            if (i == 0) {
                i4 = R.string.seasonal_reading_section_overall;
            } else if (i == 1) {
                i4 = R.string.seasonal_reading_section_action;
            } else if (i != 2) {
                i4 = i != 3 ? R.string.seasonal_reading_section_reality : R.string.seasonal_reading_section_thought;
            } else {
                i4 = R.string.seasonal_reading_section_relationship;
            }
            String strQ = afc.q(i4, l46Var);
            mue mueVar = pue.a;
            nte.b(strQ, null, bx5.d(l46Var), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.d(l46Var), l46Var, 0, 0, 131066);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dq1(i, i2);
        }
    }

    public static final void e(lf0 lf0Var, l46 l46Var, int i) {
        Object obj;
        l46Var.h0(247558302);
        int i2 = (l46Var.g(lf0Var) ? 4 : 2) | i;
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            String str = lf0Var.m;
            boolean zG = l46Var.g(str);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                obj = objR;
                boolean zC = c5e.C(str, "data:image", false);
                Object objDecode = str;
                if (zC && v4e.F(str, "base64,", false)) {
                    objDecode = str;
                    objDecode = Base64.decode(v4e.f0(str, "base64,", str), 0);
                }
                objDecode = str;
                l46Var.p0(objDecode);
                obj = objDecode;
            }
            obj = objR;
            nk8.d(b.c(g09.a, 1.0f), ndb.f, af1.b0(1286671368, new sz7((Context) l46Var.k(uq.b), (Serializable) obj, (aw6) l46Var.k(n72.a), lf0Var, 16), l46Var), l46Var, 3126, 4);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new z8d(lf0Var, i, i3);
        }
    }

    public static final void f(l46 l46Var, j09 j09Var) {
        mr mrVar = mr.k;
        int iHashCode = Long.hashCode(l46Var.T);
        j09 j09VarJ = m93.J(l46Var, j09Var);
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
    }

    public static final void g(x16 x16Var, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        l46Var2.h0(1345899667);
        int i2 = (l46Var2.i(x16Var) ? 4 : 2) | i;
        if (l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) l46Var2.k(uq.b);
            j09 j09VarO = tm7.o(b.c, ((e8b) l46Var2.k(l8b.a)).a, g21.f);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarO);
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
            pa7.a(null, 0L, 0L, null, vpf.f, null, false, false, x16Var, l46Var, ((i2 << 24) & 234881024) | 24576, 239);
            l46Var2 = l46Var;
            t4c.f(48, 0, l46Var2, ynb.d0(0.0f, 8.0f, 0.0f, 16.0f, 5, ynb.b0(32.0f, 0.0f, mh3.d0(new jw7(1.0f, true), mh3.T(l46Var2), false, 14), 2)), false);
            j09 j09VarA0 = ynb.a0(mh3.N(b.c(g09.a, 1.0f)), 32.0f, 16.0f);
            String strQ = afc.q(R.string.widget_onboarding_guide_cta_account, l46Var2);
            boolean zI = l46Var2.i(context);
            Object objR = l46Var2.R();
            if (zI || objR == sf2.a) {
                objR = new y3d(context, 7);
                l46Var2.p0(objR);
            }
            t4c.g(strQ, (x16) objR, j09VarA0, l46Var2, 0, 0);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fkc(i, 13, x16Var);
        }
    }

    public static final td0 h(rf0 rf0Var) {
        return new td0(3, new a9d(rf0Var, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    public static g8f i(ArrayList arrayList, g8f g8fVar, bo7 bo7Var, ClassLoader classLoader) {
        bo7 bo7VarO0;
        arrayList.getClass();
        ArrayList<ao7> arrayList2 = new ArrayList(t72.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            yq7 yq7Var = (yq7) it.next();
            wnb wnbVar = bo7Var instanceof wnb ? (wnb) bo7Var : null;
            if (wnbVar == null || (bo7VarO0 = ynb.o0(wnbVar)) == null) {
                bo7VarO0 = bo7Var;
            }
            String str = yq7Var.b;
            io7 io7VarE0 = abg.e0(yq7Var.d);
            si0.z.F(si0.a[52], yq7Var);
            str.getClass();
            arrayList2.add(new ao7(null, bo7VarO0, str, io7VarE0));
        }
        sd0 sd0VarQ1 = s72.q1(arrayList);
        int iF = bm8.F(t72.u(sd0VarQ1, 10));
        if (iF < 16) {
            iF = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
        Iterator it2 = sd0VarQ1.iterator();
        while (true) {
            iq4 iq4Var = (iq4) it2;
            if (!iq4Var.b.hasNext()) {
                break;
            }
            n17 n17Var = (n17) iq4Var.next();
            iy9 iy9Var = new iy9(Integer.valueOf(((yq7) n17Var.b).c), arrayList2.get(n17Var.a));
            linkedHashMap.put(iy9Var.d(), iy9Var.e());
        }
        g8f g8fVar2 = new g8f(arrayList2, linkedHashMap, g8fVar);
        int i = 0;
        for (ao7 ao7Var : arrayList2) {
            int i2 = i + 1;
            ArrayList arrayList3 = ((yq7) arrayList.get(i)).e;
            ?? arrayList4 = new ArrayList(t72.u(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(abg.d0((wq7) it3.next(), classLoader, g8fVar2, null, 8));
            }
            if (arrayList4.isEmpty()) {
                arrayList4 = t72.H(qyd.b);
            }
            ao7Var.getClass();
            ao7Var.f = arrayList4;
            i = i2;
        }
        return g8fVar2;
    }

    public static final r5c j(Context context, Class cls, String str) {
        if (v4e.Q(str)) {
            qc0.j("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!str.equals(":memory:")) {
            return new r5c(context, cls, str);
        }
        qc0.j("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    public static final String k(j7f j7fVar) {
        StringBuilder sb = new StringBuilder("type: " + j7fVar);
        sb.append('\n');
        sb.append("hashCode: " + j7fVar.hashCode());
        sb.append('\n');
        sb.append("javaClass: " + j7fVar.getClass().getCanonicalName());
        sb.append('\n');
        for (bm3 bm3VarM = j7fVar.m(); bm3VarM != null; bm3VarM = bm3VarM.k()) {
            sb.append("fqName: ".concat(jz3.c.n(bm3VarM)));
            sb.append('\n');
            sb.append("javaClass: " + bm3VarM.getClass().getCanonicalName());
            sb.append('\n');
        }
        return sb.toString();
    }

    public static final String l(BufferedReader bufferedReader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        int i = bufferedReader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = bufferedReader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static final r7d m(String str, l46 l46Var) {
        str.getClass();
        Object objR = l46Var.R();
        Object obj = sf2.a;
        if (objR == obj) {
            objR = new ja2();
            l46Var.p0(objR);
        }
        ja2 ja2Var = (ja2) objR;
        boolean zG = l46Var.g(str);
        Object objR2 = l46Var.R();
        if (zG || objR2 == obj) {
            objR2 = ja2Var.a(w4e.p(str));
            l46Var.p0(objR2);
        }
        rf0 rf0Var = (rf0) objR2;
        sw3 sw3Var = (sw3) l46Var.k(zg2.h);
        long j = ((y72) l46Var.k(em2.a)).a;
        mue mueVar = (mue) l46Var.k(nte.a);
        long jC = mueVar.c();
        long j2 = jC != 16 ? jC : j;
        mue mueVarA = mue.a(mueVar, j2, w6c.l(17), ar5.b, ((y8b) l46Var.k(x8b.a)).c, 0L, null, 0, w6c.l(27), null, null, 16646104);
        Object objA = uyb.A(0, 1, l46Var);
        boolean zG2 = l46Var.g(rf0Var) | l46Var.g(mueVarA) | l46Var.f(j) | l46Var.g(sw3Var) | l46Var.g(objA);
        Object objR3 = l46Var.R();
        if (zG2 || objR3 == obj) {
            p4c p4cVar = new p4c(5, sw3Var, objA);
            rf0Var.getClass();
            sw3Var.getClass();
            y8d y8dVar = new y8d(mueVarA, j, sw3Var, p4cVar);
            objR3 = y8dVar.a(rf0Var, mueVarA, y8dVar.d, 0);
            l46Var.p0(objR3);
        }
        return (r7d) objR3;
    }

    public static final TarotCardChoice n(r33 r33Var) {
        r33Var.getClass();
        fie fieVar = TarotCardType.Companion;
        String str = r33Var.d;
        fieVar.getClass();
        TarotCardType tarotCardTypeA = fie.a(str);
        if (tarotCardTypeA != null) {
            return new TarotCardChoice(tarotCardTypeA, r33Var.c == 0, (String) null, 4, (rp3) null);
        }
        return null;
    }

    public static int o(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }
}
