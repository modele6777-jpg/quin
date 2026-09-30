package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import tech.chatmind.api.seasonal.model.SeasonalHistoryItem;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vlc {
    public static final DateTimeFormatter a;

    static {
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy.M.d HH:mm", Locale.getDefault());
        dateTimeFormatterOfPattern.getClass();
        a = dateTimeFormatterOfPattern;
        t72.I(new SeasonalHistoryItem(2026, SolarTerm.SUMMER_SOLSTICE, "2026-06-21T14:21:00+08:00"), new SeasonalHistoryItem(2026, SolarTerm.AUTUMN_EQUINOX, "2026-09-23T09:05:00+08:00"));
    }

    public static final void a(SeasonalHistoryItem seasonalHistoryItem, x16 x16Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(1037059792);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(seasonalHistoryItem) : l46Var.i(seasonalHistoryItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            j09 j09VarC = b.c(androidx.compose.foundation.layout.b.c(g09.a, 1.0f), false, null, null, x16Var, 15);
            y6c y6cVar = eze.a(l46Var).a.j;
            pr4 pr4Var = l8b.a;
            nae.a(j09VarC, y6cVar, ((e8b) l46Var.k(pr4Var)).c, 0L, 0.0f, 0.0f, x57.b(((e8b) l46Var.k(pr4Var)).A, 0.5f), af1.b0(-1723412523, new wf8(20, seasonalHistoryItem), l46Var), l46Var, 12582912, 56);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k38(seasonalHistoryItem, x16Var, i, 8);
        }
    }

    public static final void b(final boolean z, final ii6 ii6Var, final x16 x16Var, final a26 a26Var, l46 l46Var, final int i) {
        x16Var.getClass();
        a26Var.getClass();
        l46Var.h0(758919346);
        int i2 = i | (l46Var.h(z) ? 4 : 2) | (l46Var.g(ii6Var) ? 32 : 16) | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (!l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            l46Var.Z();
        } else {
            if (!z) {
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    final int i3 = 0;
                    ojbVarV.d = new l26(z, ii6Var, x16Var, a26Var, i, i3) { // from class: rlc
                        public final /* synthetic */ int a;
                        public final /* synthetic */ boolean b;
                        public final /* synthetic */ ii6 c;
                        public final /* synthetic */ x16 d;
                        public final /* synthetic */ a26 e;

                        {
                            this.a = i3;
                        }

                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i4 = this.a;
                            wef wefVar = wef.a;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(385);
                                    vlc.b(this.b, this.c, this.d, this.e, (l46) obj, iP);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP2 = k99.P(385);
                                    vlc.b(this.b, this.c, this.d, this.e, (l46) obj, iP2);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    return;
                }
                return;
            }
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            bmc bmcVar = (bmc) z5c.G(job.a.b(bmc.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            e89 e89VarT = tm7.t(bmcVar.d, l46Var);
            boolean zI = l46Var.i(bmcVar);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new ulc(bmcVar, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, wef.a);
            t72.b(x16Var, new s84(false, false, 3), af1.b0(750982139, new r19((Object) ii6Var, x16Var, (Object) a26Var, e89VarT, 9), l46Var), l46Var, 438, 0);
        }
        ojb ojbVarV2 = l46Var.v();
        if (ojbVarV2 != null) {
            final int i4 = 1;
            ojbVarV2.d = new l26(z, ii6Var, x16Var, a26Var, i, i4) { // from class: rlc
                public final /* synthetic */ int a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ ii6 c;
                public final /* synthetic */ x16 d;
                public final /* synthetic */ a26 e;

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
                            int iP = k99.P(385);
                            vlc.b(this.b, this.c, this.d, this.e, (l46) obj, iP);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP2 = k99.P(385);
                            vlc.b(this.b, this.c, this.d, this.e, (l46) obj, iP2);
                            break;
                    }
                    return wefVar;
                }
            };
        }
    }

    public static final void c(zlc zlcVar, x16 x16Var, a26 a26Var, l46 l46Var, int i) {
        l46Var.h0(-811543268);
        int i2 = i | (l46Var.g(zlcVar) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            g09 g09Var = g09.a;
            j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarC);
            lf2.q.getClass();
            l46Var.j0();
            boolean z = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
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
            j09 j09VarD0 = ynb.d0(0.0f, 32.0f, 0.0f, 32.0f, 5, ynb.b0(16.0f, 0.0f, androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 2));
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarD0);
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
            String strQ = afc.q(R.string.seasonal_history_title, l46Var);
            mue mueVar = pue.a;
            mue mueVarN = pue.n(l46Var);
            yp5 yp5Var = ((y8b) l46Var.k(x8b.a)).a;
            pr4 pr4Var = l8b.a;
            nte.b(strQ, ynb.a0(g09Var, 32.0f, 12.0f), ((e8b) l46Var.k(pr4Var)).q, 0L, null, yp5Var, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarN, l46Var, 48, 0, 129912);
            if (pa7.t(zlcVar, ylc.a)) {
                l46Var.f0(2196708);
                l46Var.r(false);
            } else if (pa7.t(zlcVar, xlc.a)) {
                l46Var.f0(68171358);
                nte.b(afc.q(R.string.seasonal_history_empty, l46Var), ynb.b0(0.0f, 32.0f, androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 1), ((e8b) l46Var.k(pr4Var)).t, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.a, l46Var, 48, 0, 130040);
                l46Var.r(false);
            } else {
                if (!(zlcVar instanceof wlc)) {
                    throw tec.d(2195526, l46Var, false);
                }
                l46Var.f0(2211576);
                j09 j09VarF = androidx.compose.foundation.layout.b.f(0.0f, 360.0f, androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 1);
                uc0 uc0Var = new uc0(8.0f, true, new qc0(0));
                boolean z2 = ((i2 & 14) == 4) | ((i2 & 896) == 256);
                Object objR = l46Var.R();
                if (z2 || objR == sf2.a) {
                    objR = new h6b(13, zlcVar, a26Var);
                    l46Var.p0(objR);
                }
                af1.s(j09VarF, null, null, uc0Var, null, null, false, null, (a26) objR, l46Var, 24582, 494);
                l46Var.r(false);
            }
            l46Var.r(true);
            c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), false, 0L, ((e8b) l46Var.k(pr4Var)).t, afc.q(R.string.seasonal_history_close, l46Var), x16Var, l46Var, (i2 << 12) & 458752, 6);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tlc(zlcVar, x16Var, a26Var, i);
        }
    }

    public static final void d(zlc zlcVar, ii6 ii6Var, x16 x16Var, a26 a26Var, j09 j09Var, l46 l46Var, int i) {
        zlcVar.getClass();
        x16Var.getClass();
        a26Var.getClass();
        l46Var.h0(451101727);
        int i2 = i | (l46Var.g(zlcVar) ? 4 : 2) | (l46Var.g(ii6Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            j09 j09VarE = oa7.E(androidx.compose.foundation.layout.b.c(j09Var, 1.0f), eze.a(l46Var).a.i);
            long j = y72.j;
            List listH = t72.H(new li6(j));
            pr4 pr4Var = l8b.a;
            nae.a(z7f.J(j09VarE, ii6Var, new ji6(j, listH, 36.0f, 0.0f, new li6(((e8b) l46Var.k(pr4Var)).c)), null, 4), eze.a(l46Var).a.i, ((e8b) l46Var.k(pr4Var)).g, 0L, 0.0f, 0.0f, null, af1.b0(1652575780, new tlc(zlcVar, x16Var, a26Var), l46Var), l46Var, 12582912, 120);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cm(zlcVar, ii6Var, x16Var, a26Var, j09Var, i);
        }
    }
}
