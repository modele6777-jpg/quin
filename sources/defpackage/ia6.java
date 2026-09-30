package defpackage;

import ai.askquin.R;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ia6 implements l26 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ x16 d;

    public /* synthetic */ ia6(int i, int i2, x16 x16Var, x16 x16Var2) {
        this.b = i;
        this.c = x16Var;
        this.d = x16Var2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        final x16 x16Var = this.d;
        final x16 x16Var2 = this.c;
        final int i2 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                pa6.f(x16Var2, x16Var, (l46) obj, k99.P(i2 | 1));
                break;
            case 1:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    rs0.f(b.c, false, af1.b0(-1056625450, new n26() { // from class: ai9
                        /* JADX WARN: Code duplicated, block: B:56:0x029e  */
                        @Override // defpackage.n26
                        public final Object m(Object obj3, Object obj4, Object obj5) {
                            iy9 iy9Var;
                            boolean z;
                            c31 c31Var = (c31) obj3;
                            l46 l46Var2 = (l46) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            c31Var.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= l46Var2.g(c31Var) ? 4 : 2;
                            }
                            if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                lx0 lx0Var = ndb.b;
                                g09 g09Var = g09.a;
                                j09 j09VarD0 = ynb.d0(9.0f, 9.0f, 0.0f, 0.0f, 12, mh3.W(c31Var.a(g09Var, lx0Var)));
                                int i3 = i2;
                                boolean zE = l46Var2.e(i3);
                                x16 x16Var3 = x16Var2;
                                boolean zG = zE | l46Var2.g(x16Var3);
                                Object objR = l46Var2.R();
                                i8c i8cVar = sf2.a;
                                if (zG || objR == i8cVar) {
                                    objR = new m83(i3, 3, x16Var3);
                                    l46Var2.p0(objR);
                                }
                                c8b.h(j09VarD0, false, 0L, 0L, null, (x16) objR, l46Var2, 0, 30);
                                j09 j09VarD1 = ynb.d0(0.0f, 72.0f, 0.0f, 16.0f, 5, mh3.Y(b.c));
                                jx0 jx0Var = ndb.Z;
                                sc0 sc0Var = xc0.c;
                                c92 c92VarA = a92.a(sc0Var, jx0Var, l46Var2, 48);
                                int iHashCode = Long.hashCode(l46Var2.T);
                                u8a u8aVarM = l46Var2.m();
                                j09 j09VarJ = m93.J(l46Var2, j09VarD1);
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
                                j09 j09VarB0 = ynb.b0(24.0f, 0.0f, g09Var, 2);
                                String strQ = afc.q(R.string.notification_permission_tp_title, l46Var2);
                                mue mueVar = pue.a;
                                mue mueVarA = mue.a(pue.m(l46Var2), 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183);
                                pr4 pr4Var = l8b.a;
                                nte.b(strQ, j09VarB0, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarA, l46Var2, 48, 0, 130040);
                                o5c.f(l46Var2, b.d(g09Var, 12.0f));
                                nte.b(afc.q(R.string.notification_permission_tp_subtitle, l46Var2), ynb.b0(24.0f, 0.0f, g09Var, 2), ((e8b) l46Var2.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var2), l46Var2, 48, 0, 130040);
                                Locale locale = ((Configuration) l46Var2.k(uq.a)).getLocales().get(0);
                                String language = locale.getLanguage();
                                if (language == null) {
                                    iy9Var = new iy9(Integer.valueOf(R.drawable.img_notification_tp1_en), Integer.valueOf(R.drawable.img_notification_tp1_neo_en));
                                } else {
                                    int iHashCode2 = language.hashCode();
                                    if (iHashCode2 != 3246) {
                                        if (iHashCode2 != 3383) {
                                            if (iHashCode2 != 3428) {
                                                if (iHashCode2 == 3886 && language.equals("zh")) {
                                                    iy9Var = (pa7.t(locale.getCountry(), "TW") || pa7.t(locale.getCountry(), "HK")) ? new iy9(Integer.valueOf(R.drawable.img_notification_tp1_tc), Integer.valueOf(R.drawable.img_notification_tp1_neo_tc)) : new iy9(Integer.valueOf(R.drawable.img_notification_tp1_sc), Integer.valueOf(R.drawable.img_notification_tp1_neo_sc));
                                                } else {
                                                    iy9Var = new iy9(Integer.valueOf(R.drawable.img_notification_tp1_en), Integer.valueOf(R.drawable.img_notification_tp1_neo_en));
                                                }
                                            } else if (language.equals("ko")) {
                                                iy9Var = new iy9(Integer.valueOf(R.drawable.img_notification_tp1_kr), Integer.valueOf(R.drawable.img_notification_tp1_neo_kr));
                                            } else {
                                                iy9Var = new iy9(Integer.valueOf(R.drawable.img_notification_tp1_en), Integer.valueOf(R.drawable.img_notification_tp1_neo_en));
                                            }
                                        } else if (language.equals("ja")) {
                                            iy9Var = new iy9(Integer.valueOf(R.drawable.img_notification_tp1_jp), Integer.valueOf(R.drawable.img_notification_tp1_neo_jp));
                                        } else {
                                            iy9Var = new iy9(Integer.valueOf(R.drawable.img_notification_tp1_en), Integer.valueOf(R.drawable.img_notification_tp1_neo_en));
                                        }
                                    } else if (language.equals("es")) {
                                        iy9Var = new iy9(Integer.valueOf(R.drawable.img_notification_tp1_sp), Integer.valueOf(R.drawable.img_notification_tp1_neo_sp));
                                    } else {
                                        iy9Var = new iy9(Integer.valueOf(R.drawable.img_notification_tp1_en), Integer.valueOf(R.drawable.img_notification_tp1_neo_en));
                                    }
                                }
                                int iIntValue3 = ((Number) iy9Var.a()).intValue();
                                int iIntValue4 = ((Number) iy9Var.b()).intValue();
                                if (we6.e(l46Var2)) {
                                    iIntValue3 = iIntValue4;
                                }
                                feg.j(od4.A(iIntValue3, 0, l46Var2), null, b.c(new jw7(1.0f, true), 1.0f), null, an2.b, 0.0f, null, l46Var2, 24632, 104);
                                j09 j09VarB1 = ynb.b0(24.0f, 0.0f, g09Var, 2);
                                c92 c92VarA2 = a92.a(sc0Var, jx0Var, l46Var2, 48);
                                int iHashCode3 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM2 = l46Var2.m();
                                j09 j09VarJ2 = m93.J(l46Var2, j09VarB1);
                                l46Var2.j0();
                                if (l46Var2.S) {
                                    l46Var2.l(ov7Var);
                                } else {
                                    l46Var2.s0();
                                }
                                dec.l(he2Var, l46Var2, c92VarA2);
                                dec.l(he2Var2, l46Var2, u8aVarM2);
                                ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
                                dec.l(he2Var4, l46Var2, j09VarJ2);
                                c8b.i(b.f(56.0f, 0.0f, b.c(g09Var, 1.0f), 2), afc.q(R.string.notification_permission_tp_cta, l46Var2), null, null, 0L, 0.0f, false, null, null, false, null, null, x16Var, l46Var2, 6, 0, 4092);
                                j09 j09VarE = kv2.e(g09Var, 8.0f, l46Var2, g09Var, 1.0f);
                                boolean zE2 = l46Var2.e(i3) | l46Var2.g(x16Var3);
                                Object objR2 = l46Var2.R();
                                if (zE2 || objR2 == i8cVar) {
                                    z = true;
                                    objR2 = new m83(i3, 1, x16Var3);
                                    l46Var2.p0(objR2);
                                } else {
                                    z = true;
                                }
                                cgg.m((x16) objR2, j09VarE, false, null, null, null, od4.i, l46Var2, 805306416, 508);
                                l46Var2.r(z);
                                l46Var2.r(z);
                            } else {
                                l46Var2.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, 390, 2);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                pa7.j(i2, x16Var2, x16Var, (l46) obj, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ia6(int i, x16 x16Var, x16 x16Var2) {
        this.b = i;
        this.c = x16Var;
        this.d = x16Var2;
    }

    public /* synthetic */ ia6(x16 x16Var, x16 x16Var2, int i) {
        this.c = x16Var;
        this.d = x16Var2;
        this.b = i;
    }
}
