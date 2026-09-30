package defpackage;

import ai.askquin.R;
import ai.askquin.ui.router.GiftCardPerspective;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import java.util.WeakHashMap;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.giftcard.GiftCardSku;
import tech.chatmind.api.giftcard.GiftCardStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pa6 {
    public static final m8b a;
    public static final n07 b;

    static {
        hf8.Q.getClass();
        a = ef8.a("GiftCardCopy");
        b = new n07(m86.a, "¥28.8", null, 0.0d, null, "gift-card-1month", null, 220);
        new GiftCardItem("gift-card-preview", GiftCardSku.OneYear, GiftCardStatus.Pending, (String) null, (String) null, (String) null, (String) null, "Quin", "May good things find you", "2026-08-17T09:12:33.000Z", "2026-10-01T00:00:00.000Z", "2027-10-01T00:00:00.000Z", 120, (rp3) null);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00d5  */
    public static final void a(z76 z76Var, GiftCardPerspective giftCardPerspective, boolean z, x16 x16Var, x16 x16Var2, a26 a26Var, l26 l26Var, l46 l46Var, int i) {
        int i2;
        GiftCardItem giftCardItem;
        z76Var.getClass();
        giftCardPerspective.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        a26Var.getClass();
        l26Var.getClass();
        l46Var.h0(-388144018);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(z76Var) : l46Var.i(z76Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.e(giftCardPerspective.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.i(a26Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= l46Var.i(l26Var) ? 1048576 : 524288;
        }
        if (l46Var.W(i2 & 1, (599187 & i2) != 599186)) {
            y76 y76Var = z76Var.a;
            v86 v86VarN = null;
            if (y76Var != null) {
                giftCardItem = y76Var.a;
                GiftCardItem giftCardItem2 = y76Var.b;
                int i3 = oa6.a[giftCardPerspective.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        ap.c();
                        return;
                    } else if (giftCardItem2 != null) {
                        giftCardItem = giftCardItem2;
                    }
                } else if (giftCardItem == null) {
                    giftCardItem = giftCardItem2;
                }
            } else {
                giftCardItem = null;
            }
            if (giftCardItem == null) {
                l46Var.f0(-1146150681);
            } else {
                l46Var.f0(-1146150680);
                GiftCardSku sku = giftCardItem.getSku();
                sku.getClass();
                if (k8b.e((e8b) l46Var.k(l8b.a))) {
                    v86VarN = vpf.N(sku);
                }
            }
            l46Var.r(false);
            GiftCardItem giftCardItem3 = giftCardItem;
            v86 v86Var = v86VarN;
            vpf.d(v86Var, b.c, af1.b0(-1222520413, new cj3(x16Var, z76Var, giftCardItem3, x16Var2, giftCardPerspective, v86Var, z, a26Var, l26Var), l46Var), l46Var, 432);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fc(z76Var, giftCardPerspective, z, x16Var, x16Var2, a26Var, l26Var, i);
        }
    }

    public static final void b(GiftCardItem giftCardItem, GiftCardPerspective giftCardPerspective, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-1306424741);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(giftCardItem) : l46Var.i(giftCardItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.e(giftCardPerspective.ordinal()) ? 32 : 16;
        }
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            nae.a(androidx.compose.ui.platform.b.a(g09.a, "gift_card_detail_info"), a7c.b(32.0f), ((e8b) l46Var.k(l8b.a)).c, 0L, 0.0f, 0.0f, null, af1.b0(-1232618186, new o14(27, giftCardPerspective, giftCardItem), l46Var), l46Var, 12582918, 120);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(giftCardItem, giftCardPerspective, i, 24);
        }
    }

    public static final void c(GiftCardItem giftCardItem, GiftCardPerspective giftCardPerspective, v86 v86Var, boolean z, boolean z2, a26 a26Var, l26 l26Var, l46 l46Var, int i) {
        int i2;
        boolean z3;
        y72 y72Var;
        long j;
        boolean z4;
        String shareUrl;
        GiftCardItem giftCardItem2 = giftCardItem;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1791765821);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var2.g(giftCardItem2) : l46Var2.i(giftCardItem2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var2.e(giftCardPerspective.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? l46Var2.g(v86Var) : l46Var2.i(v86Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var2.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            z3 = z2;
            i2 |= l46Var2.h(z3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        } else {
            z3 = z2;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var2.i(a26Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= l46Var2.i(l26Var) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (l46Var2.W(i3 & 1, (599187 & i3) != 599186)) {
            if (v86Var == null) {
                l46Var2.f0(-641711698);
                l46Var2.r(false);
                y72Var = null;
            } else {
                l46Var2.f0(394941619);
                long jM = vpf.M(v86Var, l46Var2);
                l46Var2.r(false);
                y72Var = new y72(jM);
            }
            if (y72Var == null) {
                l46Var2.f0(394943085);
                j = ((m82) l46Var2.k(o82.a)).n;
                l46Var2.r(false);
            } else {
                l46Var2.f0(394941163);
                l46Var2.r(false);
                j = y72Var.a;
            }
            FillElement fillElement = b.c;
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, fillElement);
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
            g09 g09Var = g09.a;
            j09 j09VarD = b.c(g09Var, 1.0f).D(new jw7(1.0f, true));
            long j2 = j;
            bx9 bx9Var = new bx9(16.0f, z ? 0.0f : 16.0f, 16.0f, 12.0f);
            uc0 uc0Var = new uc0(16.0f, true, new qc0(0));
            int i4 = i3 & 14;
            boolean z5 = ((i3 & 7168) == 2048) | (i4 == 4 || ((i3 & 8) != 0 && l46Var2.i(giftCardItem2))) | ((i3 & 57344) == 16384) | ((i3 & 112) == 32) | ((3670016 & i3) == 1048576);
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (z5 || objR == i8cVar) {
                ut1 ut1Var = new ut1(z, z3, giftCardItem2, giftCardPerspective, l26Var);
                giftCardItem2 = giftCardItem2;
                l46Var2.p0(ut1Var);
                objR = ut1Var;
            }
            af1.s(j09VarD, null, bx9Var, uc0Var, null, null, false, null, (a26) objR, l46Var2, 24576, 490);
            if (giftCardItem2.getStatus() != GiftCardStatus.Unclaimed || (shareUrl = giftCardItem2.getShareUrl()) == null || v4e.Q(shareUrl)) {
                l46Var2 = l46Var2;
                z4 = true;
                l46Var2.f0(-849964983);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-850438756);
                String strQ = afc.q(R.string.gift_card_share, l46Var2);
                boolean z6 = (i4 == 4 || ((i3 & 8) != 0 && l46Var2.i(giftCardItem2))) | ((458752 & i3) == 131072);
                Object objR2 = l46Var2.R();
                if (z6 || objR2 == i8cVar) {
                    objR2 = new jt3(27, a26Var, giftCardItem2);
                    l46Var2.p0(objR2);
                }
                l46Var2 = l46Var2;
                z4 = true;
                l(strQ, (x16) objR2, true, false, v86Var, "gift_card_success_share_button", ynb.c0(mh3.N(tm7.o(b.c(g09Var, 1.0f), j2, g21.f)), 16.0f, 12.0f, 16.0f, 24.0f), l46Var2, ((i3 << 6) & 57344) | 200064);
                l46Var2.r(false);
            }
            l46Var2.r(z4);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new iy0(giftCardItem, giftCardPerspective, v86Var, z, z2, a26Var, l26Var, i);
        }
    }

    public static final void d(String str, GiftCardPerspective giftCardPerspective, boolean z, x16 x16Var, l46 l46Var, int i) {
        str.getClass();
        giftCardPerspective.getClass();
        x16Var.getClass();
        l46Var.h0(-284795453);
        int i2 = i | (l46Var.g(str) ? 4 : 2) | (l46Var.e(giftCardPerspective.ordinal()) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z2 || objR == obj) {
                objR = new t8(str, 6);
                l46Var.p0(objR);
            }
            x16 x16Var2 = (x16) objR;
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            b86 b86Var = (b86) z5c.G(job.a.b(b86.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var2);
            e89 e89VarT = tm7.t(b86Var.f, l46Var);
            Context context = (Context) l46Var.k(uq.b);
            s76 s76Var = z ? s76.PurchaseSuccess : s76.Detail;
            boolean z3 = i3 == 4;
            int i4 = i2 & 896;
            boolean z4 = z3 | (i4 == 256);
            Object objR2 = l46Var.R();
            if (z4 || objR2 == obj) {
                objR2 = q1c.f(null);
                l46Var.p0(objR2);
            }
            e89 e89Var = (e89) objR2;
            z76 z76Var = (z76) e89VarT.getValue();
            boolean zI = l46Var.i(b86Var);
            Object objR3 = l46Var.R();
            if (zI || objR3 == obj) {
                objR3 = new sk3(0, b86Var, b86.class, "load", "load()V", 0, 17);
                l46Var.p0(objR3);
            }
            x16 x16Var3 = (x16) ((ym7) objR3);
            boolean zE = l46Var.e(s76Var.ordinal()) | l46Var.g(e89Var);
            Object objR4 = l46Var.R();
            if (zE || objR4 == obj) {
                objR4 = new n96(s76Var, e89Var, 1);
                l46Var.p0(objR4);
            }
            a26 a26Var = (a26) objR4;
            boolean zI2 = l46Var.i(context) | l46Var.e(s76Var.ordinal());
            Object objR5 = l46Var.R();
            if (zI2 || objR5 == obj) {
                objR5 = new o96(context, s76Var, 1);
                l46Var.p0(objR5);
            }
            a(z76Var, giftCardPerspective, z, x16Var, x16Var3, a26Var, (l26) objR5, l46Var, (i2 & 7168) | (i2 & 112) | 8 | i4);
            GiftCardItem giftCardItem = (GiftCardItem) e89Var.getValue();
            if (giftCardItem == null) {
                l46Var.f0(-1779986741);
                l46Var.r(false);
            } else {
                l46Var.f0(-1779986740);
                boolean zG = l46Var.g(e89Var);
                Object objR6 = l46Var.R();
                if (zG || objR6 == obj) {
                    objR6 = new ok3(e89Var, 24);
                    l46Var.p0(objR6);
                }
                feg.i(giftCardItem, (x16) objR6, l46Var, GiftCardItem.$stable);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o50((Object) str, (Object) giftCardPerspective, z, x16Var, i, 13);
        }
    }

    public static final void e(x16 x16Var, l46 l46Var, int i) {
        int i2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(15273959);
        if ((i & 6) == 0) {
            i2 = i | (l46Var2.i(x16Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            FillElement fillElement = b.c;
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, fillElement);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ2 = m93.J(l46Var2, g09Var);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            nte.b(afc.q(R.string.gift_card_load_failed, l46Var2), null, ((e8b) l46Var2.k(l8b.a)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var2, 0, 0, 262138);
            nte.b(afc.q(R.string.gift_card_try_again, l46Var2), ynb.Z(androidx.compose.foundation.b.c(g09Var, false, null, null, x16Var, 15), 16.0f), ((m82) l46Var2.k(o82.a)).a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262136);
            l46Var2 = l46Var;
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new lk3(i, 5, x16Var);
        }
    }

    public static final void f(x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        int i2;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(488749220);
        if ((i & 6) == 0) {
            i2 = (l46Var.i(x16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var2) ? 32 : 16;
        }
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2;
            int i4 = ((i3 << 21) & 29360128) | 48;
            int i5 = i3 << 24;
            kj0.F(afc.q(R.string.gift_card_generation_failed_title, l46Var), lmg.g, afc.q(R.string.gift_card_generation_failed_contact_support, l46Var), afc.q(R.string.gift_card_generation_failed_later, l46Var), false, false, null, x16Var, x16Var, x16Var2, l46Var, i4 | (234881024 & i5) | (i5 & 1879048192), 112);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ia6(x16Var, x16Var2, i);
        }
    }

    public static final void g(x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(321115722);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i | (l46Var.i(x16Var2) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new IllegalStateException("QA gift-card generation failure preview");
                l46Var.p0(objR);
            }
            IllegalStateException illegalStateException = (IllegalStateException) objR;
            f96 f96Var = new f96(bm8.G(new iy9(GiftCardSku.OneMonth, b)), new y86("qa-preview-order", illegalStateException, true), illegalStateException, 39);
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new oz5(13);
                l46Var.p0(objR2);
            }
            a26 a26Var = (a26) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = new oz5(14);
                l46Var.p0(objR3);
            }
            a26 a26Var2 = (a26) objR3;
            Object objR4 = l46Var.R();
            if (objR4 == i8cVar) {
                objR4 = new oz5(15);
                l46Var.p0(objR4);
            }
            a26 a26Var3 = (a26) objR4;
            Object objR5 = l46Var.R();
            if (objR5 == i8cVar) {
                objR5 = new w66(10);
                l46Var.p0(objR5);
            }
            int i3 = i2 << 21;
            m(f96Var, x16Var, x16Var, a26Var, a26Var2, a26Var3, (x16) objR5, x16Var, x16Var2, l46Var, ((i2 << 3) & 112) | 1797128 | ((i2 << 6) & 896) | (29360128 & i3) | (i3 & 234881024));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i, 12, x16Var, x16Var2);
        }
    }

    public static final void h(int i, dd2 dd2Var, l46 l46Var, j09 j09Var, String str) {
        dd2 dd2Var2;
        boolean z;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1694121732);
        int i2 = i | (l46Var2.g(str) ? 4 : 2);
        if (l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
            j09 j09VarD = b.d(b.c(j09Var, 1.0f), 64.0f);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarD);
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
            if (v4e.Q(str)) {
                l46Var2.f0(-972638013);
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                z = true;
                o5c.f(l46Var2, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                l46Var2.r(false);
            } else {
                l46Var2.f0(-87089200);
                long j = ((e8b) l46Var2.k(l8b.a)).q;
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                nte.b(str, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var2, i2 & 14, 0, 262136);
                l46Var2 = l46Var2;
                l46Var2.r(false);
                z = true;
            }
            dd2Var2 = dd2Var;
            tec.q(6, dd2Var2, l46Var2, z);
        } else {
            dd2Var2 = dd2Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m65(i, str, j09Var, dd2Var2, 9);
        }
    }

    public static final void i(final String str, final String str2, final String str3, final a26 a26Var, final boolean z, final String str4, final List list, l46 l46Var, int i) {
        float f;
        l46Var.h0(-1795483900);
        int i2 = i | (l46Var.g(str) ? 4 : 2) | (l46Var.g(str2) ? 32 : 16) | (l46Var.g(str3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.h(z) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if ((i & 1572864) == 0) {
            i2 |= l46Var.g(list) ? 1048576 : 524288;
        }
        if (l46Var.W(i2 & 1, (599187 & i2) != 599186)) {
            pr4 pr4Var = l8b.a;
            final boolean zF = k8b.f((e8b) l46Var.k(pr4Var));
            final kx1 kx1Var = new kx1(((e8b) l46Var.k(pr4Var)).t, ((e8b) l46Var.k(pr4Var)).k);
            final y6c y6cVarB = a7c.b(zF ? 0.0f : 12.0f);
            long j = ((e8b) l46Var.k(pr4Var)).c;
            if (zF) {
                v86 v86Var = u86.c;
                f = 8.0f;
            } else {
                f = 32.0f;
            }
            nae.a(null, a7c.b(f), j, 0L, 0.0f, 0.0f, null, af1.b0(-1011193569, new l26() { // from class: ka6
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i3;
                    l46 l46Var2 = (l46) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                        g09 g09Var = g09.a;
                        j09 j09VarZ = ynb.Z(g09Var, 24.0f);
                        c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarZ);
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
                        t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
                        int iHashCode2 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM2 = l46Var2.m();
                        j09 j09VarJ2 = m93.J(l46Var2, g09Var);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, t7cVarA);
                        dec.l(he2Var2, l46Var2, u8aVarM2);
                        ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ2);
                        long jC = l8b.c(l46Var2);
                        mue mueVar = oue.a;
                        nte.b(str, new jw7(1.0f, true), jC, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.f(l46Var2), l46Var2, 0, 0, 131064);
                        String str5 = str2;
                        String strG = ub3.g(str5.length(), "/15");
                        int length = str5.length();
                        kx1 kx1Var2 = kx1Var;
                        nte.b(strG, null, length >= 15 ? kx1Var2.b : kx1Var2.a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var2), l46Var2, 0, 0, 131066);
                        l46Var2.r(true);
                        j09 j09Var = g09Var;
                        j09 j09VarD0 = ynb.d0(0.0f, 10.0f, 0.0f, 0.0f, 13, b.c(j09Var, 1.0f));
                        boolean z3 = zF;
                        y6c y6cVar = y6cVarB;
                        if (z3) {
                            l46Var2.f0(232577913);
                            j09 j09VarW = db6.w(j09Var, 0.5f, l8b.m(l46Var2), y6cVar);
                            i3 = 0;
                            l46Var2.r(false);
                            j09Var = j09VarW;
                        } else {
                            i3 = 0;
                            l46Var2.f0(232677299);
                            l46Var2.r(false);
                        }
                        j09 j09VarA = androidx.compose.ui.platform.b.a(j09VarD0.D(j09Var), str4);
                        mue mueVarC = pue.c(l46Var2);
                        wo7 wo7Var = new wo7(i3, 7, 119);
                        long jI = l8b.i(l46Var2);
                        long jI2 = l8b.i(l46Var2);
                        long jI3 = l8b.i(l46Var2);
                        long j2 = y72.j;
                        wne wneVarV0 = qk6.v0(l8b.b(l46Var2), l8b.b(l46Var2), l8b.c(l46Var2), jI, jI2, jI3, 0L, l8b.b(l46Var2), j2, j2, j2, 0L, 0L, l46Var2, 2147468936);
                        a26 a26Var2 = a26Var;
                        boolean zG = l46Var2.g(a26Var2);
                        Object objR = l46Var2.R();
                        if (zG || objR == sf2.a) {
                            objR = new hy0(a26Var2, 11);
                            l46Var2.p0(objR);
                        }
                        dd2 dd2VarB0 = af1.b0(-1294905904, new o8(str3, 17), l46Var2);
                        boolean z4 = z;
                        b21.l(str5, (a26) objR, j09VarA, z4, mueVarC, dd2VarB0, null, wo7Var, null, true, 0, 0, y6cVar, wneVarV0, l46Var2, 12582912);
                        List list2 = list;
                        if (list2.isEmpty()) {
                            l46Var2.f0(234619449);
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(233814131);
                            g21.r(af1.b0(-309435061, new kg(list2, a26Var2, z4, 6), l46Var2), l46Var2, 6);
                            l46Var2.r(false);
                        }
                        l46Var2.r(true);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 12582912, 121);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fc(str, str2, str3, a26Var, z, str4, list, i, 4);
        }
    }

    public static final void j(p86 p86Var, x16 x16Var, a26 a26Var, a26 a26Var2, x16 x16Var2, l46 l46Var, int i) {
        int i2;
        a26 a26Var3;
        boolean z;
        l46 l46Var2 = l46Var;
        lx0 lx0Var = ndb.f;
        p86Var.getClass();
        wa6 wa6Var = p86Var.a;
        x16Var.getClass();
        a26Var.getClass();
        a26Var2.getClass();
        x16Var2.getClass();
        l46Var2.h0(-632414009);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var2.g(p86Var) : l46Var2.i(p86Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var2.i(x16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var2.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var2.i(a26Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var2.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var2.W(i2 & 1, (i2 & 9363) != 9362)) {
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var2.k(pr4Var));
            WeakHashMap weakHashMap = m8g.w;
            float fA = m93.q(q7c.k(l46Var2).e, l46Var2).a();
            FillElement fillElement = b.c;
            j09 j09VarO = tm7.o(fillElement, ((e8b) l46Var2.k(pr4Var)).e, g21.f);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarO);
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
            int i3 = i2;
            pa7.a(null, 0L, 0L, null, lmg.h, null, false, false, x16Var, l46Var, ((i2 << 21) & 234881024) | 24576, 239);
            l46Var2 = l46Var;
            s(wa6Var, a26Var, l46Var2, (i3 >> 3) & 112);
            if (p86Var.c) {
                l46Var2.f0(1711416843);
                xn8 xn8VarC = s21.c(lx0Var, false);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, fillElement);
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
                axa.a(0.0f, 0.0f, 0, 0, 63, 0L, 0L, l46Var2, null);
                l46Var2.r(true);
                l46Var2.r(false);
                z = true;
                a26Var3 = a26Var2;
            } else {
                if (p86Var.d != null) {
                    l46Var2.f0(1711421235);
                    e(x16Var2, l46Var2, (i3 >> 12) & 14);
                    l46Var2.r(false);
                    a26Var3 = a26Var2;
                } else if (p86Var.b.isEmpty()) {
                    l46Var2.f0(1711423256);
                    xn8 xn8VarC2 = s21.c(lx0Var, false);
                    int iHashCode3 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM3 = l46Var2.m();
                    j09 j09VarJ3 = m93.J(l46Var2, fillElement);
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var, l46Var2, xn8VarC2);
                    dec.l(he2Var2, l46Var2, u8aVarM3);
                    ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
                    dec.l(he2Var4, l46Var2, j09VarJ3);
                    nte.b(afc.q(wa6Var == wa6.Sent ? R.string.gift_card_empty_sent : R.string.gift_card_empty_received, l46Var2), null, ((e8b) l46Var2.k(pr4Var)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262138);
                    l46Var2 = l46Var;
                    l46Var2.r(true);
                    l46Var2.r(false);
                    a26Var3 = a26Var2;
                } else {
                    l46Var2.f0(1711434293);
                    bx9 bx9Var = new bx9(eze.a(l46Var2).c.a, eze.a(l46Var2).c.a, eze.a(l46Var2).c.a, eze.a(l46Var2).c.a + fA);
                    uc0 uc0Var = new uc0(eze.a(l46Var2).c.b, true, new qc0(0));
                    int i4 = 4;
                    boolean zH = ((i3 & 7168) == 2048) | ((i3 & 14) == 4 || ((i3 & 8) != 0 && l46Var2.i(p86Var))) | l46Var2.h(zF);
                    Object objR = l46Var2.R();
                    if (zH || objR == sf2.a) {
                        a26Var3 = a26Var2;
                        objR = new so2(p86Var, a26Var3, zF, i4);
                        l46Var2.p0(objR);
                    } else {
                        a26Var3 = a26Var2;
                    }
                    af1.s(null, null, bx9Var, uc0Var, null, null, false, null, (a26) objR, l46Var2, 0, 491);
                    l46Var2.r(false);
                }
                z = true;
            }
            l46Var2.r(z);
        } else {
            a26Var3 = a26Var2;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new yb((Object) p86Var, x16Var, (m26) a26Var, (m26) a26Var3, (m26) x16Var2, i, 7);
        }
    }

    public static final void k(x16 x16Var, l26 l26Var, l46 l46Var, int i) {
        x16Var.getClass();
        l26Var.getClass();
        l46Var.h0(-154483277);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i | (l46Var.i(l26Var) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            s86 s86Var = (s86) z5c.G(job.a.b(s86.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            e89 e89VarT = tm7.t(s86Var.f, l46Var);
            p86 p86Var = (p86) e89VarT.getValue();
            boolean zI = l46Var.i(s86Var);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zI || objR == obj) {
                Object uj3Var = new uj3(1, s86Var, s86.class, "selectTab", "selectTab(Ltech/chatmind/api/giftcard/GiftCardTab;)V", 0, 16);
                l46Var.p0(uj3Var);
                objR = uj3Var;
            }
            a26 a26Var = (a26) ((ym7) objR);
            boolean zG = l46Var.g(e89VarT) | l46Var.i(s86Var) | ((i2 & 112) == 32);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = new it3(s86Var, l26Var, e89VarT, 10);
                l46Var.p0(objR2);
            }
            a26 a26Var2 = (a26) objR2;
            boolean zI2 = l46Var.i(s86Var);
            Object objR3 = l46Var.R();
            if (zI2 || objR3 == obj) {
                Object sk3Var = new sk3(0, s86Var, s86.class, "load", "load()V", 0, 18);
                l46Var.p0(sk3Var);
                objR3 = sk3Var;
            }
            j(p86Var, x16Var, a26Var, a26Var2, (x16) ((ym7) objR3), l46Var, 8 | ((i2 << 3) & 112));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o14(x16Var, l26Var, i, 26);
        }
    }

    public static final void l(String str, x16 x16Var, boolean z, boolean z2, v86 v86Var, String str2, j09 j09Var, l46 l46Var, int i) {
        String str3;
        int i2;
        l46 l46Var2;
        g09 g09Var;
        boolean z3;
        long j;
        l46Var.h0(-1079960060);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (l46Var.g(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? l46Var.g(v86Var) : l46Var.i(v86Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.g(str2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= l46Var.g(j09Var) ? 1048576 : 524288;
        }
        if (l46Var.W(i2 & 1, (599187 & i2) != 599186)) {
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
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
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            String str4 = z2 ? "" : str3;
            g09 g09Var2 = g09.a;
            if (v86Var != null) {
                l46Var.f0(482273193);
                y6c y6cVarB = a7c.b(32.0f);
                bx9 bx9Var = v51.a;
                long j2 = v86Var.c;
                long j3 = y72.e;
                g09Var = g09Var2;
                z3 = false;
                c8b.i(androidx.compose.ui.platform.b.a(b.d(b.c(g09Var, 1.0f), 56.0f), str2), str4, null, null, 0L, 0.0f, z, y6cVarB, v51.a(j2, j3, y72.b(j2, 0.54f), y72.b(j3, 0.72f), l46Var, 0), false, null, null, x16Var, l46Var, (i2 << 12) & 3670016, (i2 << 3) & 896, 3644);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                g09Var = g09Var2;
                z3 = false;
                l46Var.f0(482817615);
                nk8.i(str4, x16Var, androidx.compose.ui.platform.b.a(b.c(g09Var, 1.0f), str2), 0.0f, 0.0f, 345.0f, z, null, null, null, false, l46Var, (i2 & 112) | 1572864 | ((i2 << 15) & 29360128), 0, 3896);
                l46Var2 = l46Var;
                l46Var2.r(false);
            }
            if (z2) {
                l46Var2.f0(483055509);
                j09 j09VarA = androidx.compose.ui.platform.b.a(b.l(d31.a.a(g09Var, ndb.f), 24.0f), "gift_card_purchase_loading");
                if (v86Var != null) {
                    l46Var2.f0(1401062755);
                    l46Var2.r(z3);
                    j = y72.e;
                } else {
                    l46Var2.f0(1401063340);
                    j = ((e8b) l46Var2.k(l8b.a)).q;
                    l46Var2.r(z3);
                }
                axa.a(2.0f, 0.0f, 0, 384, 56, j, 0L, l46Var, j09VarA);
                l46Var2 = l46Var;
                l46Var2.r(z3);
            } else {
                l46Var2.f0(483346692);
                l46Var2.r(z3);
            }
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new iy0(str, x16Var, z, z2, v86Var, str2, j09Var, i, 3);
        }
    }

    public static final void m(final f96 f96Var, x16 x16Var, x16 x16Var2, a26 a26Var, a26 a26Var2, a26 a26Var3, x16 x16Var3, x16 x16Var4, x16 x16Var5, l46 l46Var, int i) {
        int i2;
        x16 x16Var6;
        x16 x16Var7;
        a26 a26Var4;
        a26 a26Var5;
        a26 a26Var6;
        x16 x16Var8;
        x16 x16Var9;
        x16 x16Var10;
        l46 l46Var2;
        String strI;
        y72 y72Var;
        long j;
        f96Var.getClass();
        GiftCardSku giftCardSku = f96Var.a;
        e96 e96Var = f96Var.e;
        x16Var.getClass();
        x16Var2.getClass();
        a26Var.getClass();
        a26Var2.getClass();
        a26Var3.getClass();
        x16Var3.getClass();
        x16Var4.getClass();
        x16Var5.getClass();
        l46Var.h0(1064280370);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(f96Var) : l46Var.i(f96Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            x16Var6 = x16Var;
            i2 |= l46Var.i(x16Var6) ? 32 : 16;
        } else {
            x16Var6 = x16Var;
        }
        if ((i & 384) == 0) {
            x16Var7 = x16Var2;
            i2 |= l46Var.i(x16Var7) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            x16Var7 = x16Var2;
        }
        if ((i & 3072) == 0) {
            a26Var4 = a26Var;
            i2 |= l46Var.i(a26Var4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            a26Var4 = a26Var;
        }
        if ((i & 24576) == 0) {
            a26Var5 = a26Var2;
            i2 |= l46Var.i(a26Var5) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        } else {
            a26Var5 = a26Var2;
        }
        if ((196608 & i) == 0) {
            a26Var6 = a26Var3;
            i2 |= l46Var.i(a26Var6) ? 131072 : 65536;
        } else {
            a26Var6 = a26Var3;
        }
        if ((1572864 & i) == 0) {
            x16Var8 = x16Var3;
            i2 |= l46Var.i(x16Var8) ? 1048576 : 524288;
        } else {
            x16Var8 = x16Var3;
        }
        if ((12582912 & i) == 0) {
            i2 |= l46Var.i(x16Var4) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= l46Var.i(x16Var5) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (l46Var.W(i3 & 1, (i3 & 38347923) != 38347922)) {
            giftCardSku.getClass();
            final v86 v86VarN = k8b.e((e8b) l46Var.k(l8b.a)) ? vpf.N(giftCardSku) : null;
            a96 a96Var = a96.a;
            if (pa7.t(e96Var, a96Var)) {
                strI = tec.i(l46Var, 571234717, R.string.gift_card_my_cards, l46Var, false);
            } else {
                strI = e96Var instanceof y86 ? tec.i(l46Var, 571237757, R.string.gift_card_my_cards, l46Var, false) : tec.i(l46Var, 571239549, R.string.gift_card_purchase, l46Var, false);
            }
            x16 x16Var11 = (pa7.t(e96Var, a96Var) || (e96Var instanceof y86)) ? x16Var7 : x16Var8;
            boolean z = !pa7.t(e96Var, b96.a) ? !(pa7.t(e96Var, a96Var) || (e96Var instanceof y86)) : !((e96Var instanceof b96) && f96Var.d.get(giftCardSku) != null);
            if (v86VarN == null) {
                l46Var.f0(529043071);
                l46Var.r(false);
                y72Var = null;
            } else {
                l46Var.f0(571255234);
                long jM = vpf.M(v86VarN, l46Var);
                l46Var.r(false);
                y72Var = new y72(jM);
            }
            if (y72Var == null) {
                l46Var.f0(571256700);
                j = ((m82) l46Var.k(o82.a)).n;
                l46Var.r(false);
            } else {
                l46Var.f0(571254778);
                l46Var.r(false);
                j = y72Var.a;
            }
            WeakHashMap weakHashMap = m8g.w;
            final float fA = m93.q(q7c.k(l46Var).e, l46Var).a() + 132.0f;
            final String str = strI;
            final x16 x16Var12 = x16Var11;
            final boolean z2 = z;
            l46Var2 = l46Var;
            final long j2 = j;
            final x16 x16Var13 = x16Var6;
            final x16 x16Var14 = x16Var7;
            final a26 a26Var7 = a26Var4;
            final a26 a26Var8 = a26Var5;
            final a26 a26Var9 = a26Var6;
            vpf.d(v86VarN, b.c, af1.b0(207946855, new n26() { // from class: ga6
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    f96 f96Var2;
                    v86 v86Var;
                    l46 l46Var3 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((c31) obj).getClass();
                    if (l46Var3.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        FillElement fillElement = b.c;
                        c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var3, 0);
                        int iHashCode = Long.hashCode(l46Var3.T);
                        u8a u8aVarM = l46Var3.m();
                        j09 j09VarJ = m93.J(l46Var3, fillElement);
                        lf2.q.getClass();
                        l46Var3.j0();
                        boolean z3 = l46Var3.S;
                        ov7 ov7Var = LayoutNode.h1;
                        if (z3) {
                            l46Var3.l(ov7Var);
                        } else {
                            l46Var3.s0();
                        }
                        he2 he2Var = hj6.z;
                        dec.l(he2Var, l46Var3, c92VarA);
                        he2 he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var3, u8aVarM);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        he2 he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var3, numValueOf);
                        dec.k(l46Var3);
                        he2 he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var3, j09VarJ);
                        pa7.a(null, 0L, 0L, null, lmg.b, af1.b0(1349047710, new n(7, x16Var14), l46Var3), false, false, x16Var13, l46Var3, 221184, 207);
                        g09 g09Var = g09.a;
                        j09 j09VarL = mh3.L(b.c(g09Var, 1.0f).D(new jw7(1.0f, true)));
                        xn8 xn8VarC = s21.c(ndb.b, false);
                        int iHashCode2 = Long.hashCode(l46Var3.T);
                        u8a u8aVarM2 = l46Var3.m();
                        j09 j09VarJ2 = m93.J(l46Var3, j09VarL);
                        l46Var3.j0();
                        if (l46Var3.S) {
                            l46Var3.l(ov7Var);
                        } else {
                            l46Var3.s0();
                        }
                        dec.l(he2Var, l46Var3, xn8VarC);
                        dec.l(he2Var2, l46Var3, u8aVarM2);
                        ib8.s(iHashCode2, l46Var3, he2Var3, l46Var3);
                        dec.l(he2Var4, l46Var3, j09VarJ2);
                        j09 j09VarA = androidx.compose.ui.platform.b.a(fillElement, "gift_card_purchase_list");
                        bx9 bx9VarR = ynb.r(16.0f, 0.0f, 16.0f, fA, 2);
                        uc0 uc0Var = new uc0(12.0f, true, new qc0(0));
                        f96 f96Var3 = f96Var;
                        boolean zI = l46Var3.i(f96Var3);
                        v86 v86Var2 = v86VarN;
                        boolean zI2 = zI | l46Var3.i(v86Var2);
                        a26 a26Var10 = a26Var7;
                        boolean zG = zI2 | l46Var3.g(a26Var10);
                        a26 a26Var11 = a26Var9;
                        boolean zG2 = zG | l46Var3.g(a26Var11);
                        a26 a26Var12 = a26Var8;
                        boolean zG3 = zG2 | l46Var3.g(a26Var12);
                        Object objR = l46Var3.R();
                        if (zG3 || objR == sf2.a) {
                            f96Var2 = f96Var3;
                            v86Var = v86Var2;
                            objR = new kf(f96Var2, v86Var, a26Var10, a26Var11, a26Var12, 11);
                            l46Var3.p0(objR);
                        } else {
                            f96Var2 = f96Var3;
                            v86Var = v86Var2;
                        }
                        af1.s(j09VarA, null, bx9VarR, uc0Var, null, null, false, null, (a26) objR, l46Var3, 24582, 490);
                        oa7.b(b.c(d31.a.a(g09Var, ndb.w), 1.0f), j2, 0.0f, af1.b0(1051531047, new cl(str, x16Var12, z2, f96Var2, v86Var, 4), l46Var3), l46Var3, 3072, 4);
                        l46Var3.r(true);
                        l46Var3.r(true);
                    } else {
                        l46Var3.Z();
                    }
                    return wef.a;
                }
            }, l46Var2), l46Var2, 432);
            y86 y86Var = e96Var instanceof y86 ? (y86) e96Var : null;
            if (y86Var == null || !y86Var.c) {
                x16Var9 = x16Var4;
                x16Var10 = x16Var5;
                l46Var2.f0(535629456);
                l46Var2.r(false);
            } else {
                l46Var2.f0(535496838);
                x16Var9 = x16Var4;
                x16Var10 = x16Var5;
                f(x16Var9, x16Var10, l46Var2, (i3 >> 21) & 126);
                l46Var2.r(false);
            }
        } else {
            x16Var9 = x16Var4;
            x16Var10 = x16Var5;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new re3(f96Var, x16Var, x16Var2, a26Var, a26Var2, a26Var3, x16Var3, x16Var9, x16Var10, i);
        }
    }

    public static final void n(int i, l46 l46Var) {
        l46Var.h0(610061608);
        int i2 = 1;
        byte b2 = 0;
        if (l46Var.W(i & 1, i != 0)) {
            nae.a(androidx.compose.ui.platform.b.a(g09.a, "gift_card_purchase_notice"), a7c.b(32.0f), ((e8b) l46Var.k(l8b.a)).c, 0L, 0.0f, 0.0f, null, af1.b0(988411053, new ch3(t72.I(afc.q(R.string.gift_card_purchase_notice_1, l46Var), afc.q(R.string.gift_card_purchase_notice_2, l46Var), afc.q(R.string.gift_card_purchase_notice_3, l46Var), afc.q(R.string.gift_card_purchase_notice_4, l46Var)), i2, b2), l46Var), l46Var, 12582918, 120);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new sz5(i, 5);
        }
    }

    public static final void o(x16 x16Var, final x16 x16Var2, final x16 x16Var3, a26 a26Var, l46 l46Var, int i) {
        Class cls;
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        a26Var.getClass();
        l46Var.h0(1698584557);
        int i2 = i | (l46Var.i(x16Var) ? 4 : 2) | (l46Var.i(x16Var2) ? 32 : 16) | (l46Var.i(x16Var3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final j96 j96Var = (j96) z5c.G(job.a.b(j96.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            e89 e89VarT = tm7.t(j96Var.V0, l46Var);
            Object obj = (Context) l46Var.k(uq.b);
            int i3 = j96.Y0;
            j96Var.L(8, l46Var);
            GiftCardItem giftCardItem = ((f96) e89VarT.getValue()).f;
            String cardId = giftCardItem != null ? giftCardItem.getCardId() : null;
            boolean zG = l46Var.g(e89VarT) | ((i2 & 7168) == 2048);
            Object objR = l46Var.R();
            Object obj2 = sf2.a;
            if (zG || objR == obj2) {
                objR = new na6(a26Var, e89VarT, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, cardId);
            f96 f96Var = (f96) e89VarT.getValue();
            boolean zI = ((i2 & 112) == 32) | l46Var.i(j96Var);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj2) {
                final int i4 = 0;
                objR2 = new x16() { // from class: ha6
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i5 = i4;
                        wef wefVar = wef.a;
                        x16 x16Var4 = x16Var2;
                        j96 j96Var2 = j96Var;
                        switch (i5) {
                            case 0:
                                n26 n26Var = j96Var2.S0;
                                n26Var.getClass();
                                db6.b1("view_my_gift_cards", n26Var, new oz5(16));
                                x16Var4.invoke();
                                break;
                            default:
                                j96Var2.Q();
                                x16Var4.invoke();
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var.p0(objR2);
            }
            x16 x16Var4 = (x16) objR2;
            boolean zI2 = l46Var.i(j96Var);
            Object objR3 = l46Var.R();
            if (zI2 || objR3 == obj2) {
                cls = j96.class;
                objR3 = new uj3(1, j96Var, cls, "selectSku", "selectSku(Ltech/chatmind/api/giftcard/GiftCardSku;)V", 0, 17);
                l46Var.p0(objR3);
            } else {
                cls = j96.class;
            }
            a26 a26Var2 = (a26) ((ym7) objR3);
            boolean zI3 = l46Var.i(j96Var);
            Object objR4 = l46Var.R();
            if (zI3 || objR4 == obj2) {
                objR4 = new uj3(1, j96Var, cls, "setNickname", "setNickname(Ljava/lang/String;)V", 0, 18);
                l46Var.p0(objR4);
            }
            a26 a26Var3 = (a26) ((ym7) objR4);
            boolean zI4 = l46Var.i(j96Var);
            Object objR5 = l46Var.R();
            if (zI4 || objR5 == obj2) {
                objR5 = new uj3(1, j96Var, cls, "setBlessing", "setBlessing(Ljava/lang/String;)V", 0, 19);
                l46Var.p0(objR5);
            }
            a26 a26Var4 = (a26) ((ym7) objR5);
            boolean zI5 = l46Var.i(obj) | l46Var.i(j96Var);
            Object objR6 = l46Var.R();
            if (zI5 || objR6 == obj2) {
                objR6 = new jt3(28, obj, j96Var);
                l46Var.p0(objR6);
            }
            x16 x16Var5 = (x16) objR6;
            boolean zI6 = l46Var.i(j96Var);
            Object objR7 = l46Var.R();
            if (zI6 || objR7 == obj2) {
                objR7 = new sk3(0, j96Var, cls, "dismissConfirmationFailure", "dismissConfirmationFailure()V", 0, 19);
                l46Var.p0(objR7);
            }
            x16 x16Var6 = (x16) ((ym7) objR7);
            boolean zI7 = l46Var.i(j96Var) | ((i2 & 896) == 256);
            Object objR8 = l46Var.R();
            if (zI7 || objR8 == obj2) {
                final int i5 = 1;
                objR8 = new x16() { // from class: ha6
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i6 = i5;
                        wef wefVar = wef.a;
                        x16 x16Var7 = x16Var3;
                        j96 j96Var2 = j96Var;
                        switch (i6) {
                            case 0:
                                n26 n26Var = j96Var2.S0;
                                n26Var.getClass();
                                db6.b1("view_my_gift_cards", n26Var, new oz5(16));
                                x16Var7.invoke();
                                break;
                            default:
                                j96Var2.Q();
                                x16Var7.invoke();
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var.p0(objR8);
            }
            m(f96Var, x16Var, x16Var4, a26Var2, a26Var3, a26Var4, x16Var5, x16Var6, (x16) objR8, l46Var, 8 | ((i2 << 3) & 112));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q8(x16Var, (Object) x16Var2, (Object) x16Var3, (Object) a26Var, i, 21);
        }
    }

    public static final void p(int i, x16 x16Var, l46 l46Var, j09 j09Var, String str, boolean z) {
        l46Var.h0(-1415820814);
        int i2 = i | (l46Var.g(str) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            pr4 pr4Var = l8b.a;
            nae.c(x16Var, j09Var, z, a7c.b(k8b.f((e8b) l46Var.k(pr4Var)) ? 0.0f : 999.0f), y72.j, 0L, 0.0f, 0.0f, x57.b(((e8b) l46Var.k(pr4Var)).z, 0.5f), null, af1.b0(359342973, new y01(z, str, 7), l46Var), l46Var, ((i2 >> 3) & 14) | 24576 | ((i2 >> 6) & 112) | (i2 & 896), 736);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o50((Object) str, x16Var, z, (Object) j09Var, i, 14);
        }
    }

    public static final void q(String str, x16 x16Var, l46 l46Var, int i) {
        String str2;
        x16 x16Var2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-658631788);
        int i2 = i | (l46Var2.g(str) ? 4 : 2) | (l46Var2.i(x16Var) ? 32 : 16);
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
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
            j09 j09VarD0 = ynb.d0(24.0f, 0.0f, 0.0f, 0.0f, 14, b.c(g09Var, 1.0f));
            t7c t7cVarA = s7c.a(xc0.a, ndb.y, l46Var2, 0);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarD0);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, t7cVarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            String strQ = afc.q(R.string.gift_card_redeem_code, l46Var2);
            pr4 pr4Var = l8b.a;
            long j = ((e8b) l46Var2.k(pr4Var)).t;
            mue mueVar = oue.a;
            nte.b(strQ, androidx.compose.ui.platform.b.a(g09Var, "gift_card_success_redeem_title"), j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.f(l46Var2), l46Var, 48, 0, 131064);
            l46Var2 = l46Var;
            l46Var2.r(true);
            str2 = str;
            x16Var2 = x16Var;
            nae.a(androidx.compose.ui.platform.b.a(g09Var, "gift_card_success_redeem_card"), a7c.b(32.0f), ((e8b) l46Var2.k(pr4Var)).c, 0L, 0.0f, 0.0f, null, af1.b0(750701603, new mb(str2, x16Var, 7), l46Var2), l46Var2, 12582918, 120);
            l46Var2.r(true);
        } else {
            str2 = str;
            x16Var2 = x16Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mb(str2, x16Var2, i, 8);
        }
    }

    public static final void r(GiftCardSku giftCardSku, String str, boolean z, boolean z2, v86 v86Var, x16 x16Var, j09 j09Var, l46 l46Var, int i) {
        float f;
        long j;
        int i2;
        b68 b68VarO;
        Float fValueOf = Float.valueOf(0.399f);
        Float fValueOf2 = Float.valueOf(0.0f);
        Float fValueOf3 = Float.valueOf(1.0f);
        l46Var.h0(-1264273101);
        int i3 = i | (l46Var.g(str) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(v86Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var) ? 131072 : 65536) | (l46Var.g(j09Var) ? 1048576 : 524288);
        if (l46Var.W(i3 & 1, (599187 & i3) != 599186)) {
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var.k(pr4Var));
            if (zF) {
                v86 v86Var2 = u86.c;
                f = 8.0f;
            } else {
                f = 20.0f;
            }
            y6c y6cVarB = a7c.b(f);
            long j2 = ((e8b) l46Var.k(pr4Var)).c;
            y72 y72Var = v86Var != null ? new y72(v86Var.c) : null;
            if (y72Var == null) {
                l46Var.f0(509310394);
                j = ((m82) l46Var.k(o82.a)).a;
                l46Var.r(false);
            } else {
                l46Var.f0(509308782);
                l46Var.r(false);
                j = y72Var.a;
            }
            if (zF) {
                i2 = i3;
                b68VarO = gec.O(new iy9[]{new iy9(fValueOf2, new y72(j2)), new iy9(fValueOf, new y72(j2)), new iy9(fValueOf3, new y72(abg.r(y72.b(y72.e, 0.05f), j2)))}, 0.0f, 0.0f, 14);
            } else {
                i2 = i3;
                b68VarO = (!z || v86Var == null) ? null : gec.O(new iy9[]{new iy9(fValueOf2, new y72(j2)), new iy9(fValueOf, new y72(j2)), new iy9(fValueOf3, new y72(abg.r(y72.b(v86Var.c, 0.1f), j2)))}, 0.0f, 0.0f, 14);
            }
            j09 j09VarD = b.d(j09Var, 92.0f);
            j09 j09VarH = g09.a;
            if (z && v86Var != null) {
                v86 v86Var3 = u86.c;
                j09VarH = rrb.h(j09VarH, y6cVarB, new n4d(12.0f, y72.b(j, 0.25f), 0.0f, 0L, 60));
            }
            nae.c(x16Var, j09VarD.D(j09VarH), z2, y6cVarB, j2, 0L, 0.0f, 0.0f, z ? x57.b(j, 1.0f) : null, null, af1.b0(-1120740408, new yu(b68VarO, giftCardSku, str, z, j), l46Var), l46Var, ((i2 >> 15) & 14) | ((i2 >> 3) & 896), 736);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new we3(giftCardSku, str, z, z2, v86Var, x16Var, j09Var, i);
        }
    }

    public static final void s(wa6 wa6Var, a26 a26Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(1981557501);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (l46Var.e(wa6Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(a26Var) ? 32 : 16;
        }
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(0.0f, 8.0f, b.c(g09Var, 1.0f), 1);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarB0);
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
            mx4 mx4Var = wa6.d;
            j09 j09VarP = b.p(g09Var, 84.0f * mx4Var.c());
            int iC = mx4Var.c();
            int iIndexOf = mx4Var.indexOf(wa6Var);
            if (iIndexOf < 0) {
                iIndexOf = 0;
            }
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            g20 g20Var = new g20(14, mx4Var);
            boolean zI = l46Var.i(mx4Var) | ((i2 & 112) == 32);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new so5(i3, mx4Var, a26Var);
                l46Var.p0(objR);
            }
            ief.f(j09VarP, iC, iIndexOf, zF, g20Var, (a26) objR, l46Var, 0);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(wa6Var, a26Var, i, 23);
        }
    }

    public static final void t(Context context, String str, s76 s76Var) {
        context.getClass();
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        ClipData clipDataNewPlainText = ClipData.newPlainText("gift-card", str);
        if (Build.VERSION.SDK_INT >= 33) {
            ClipDescription description = clipDataNewPlainText.getDescription();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putBoolean("android.content.extra.IS_SENSITIVE", true);
            description.setExtras(persistableBundle);
        }
        clipboardManager.setPrimaryClip(clipDataNewPlainText);
        a.e("Gift card redeem code copied: page=" + s76Var + ", codeLength=" + str.length());
        jcc.k(0, Integer.valueOf(R.string.gift_card_copied));
        db6.b1("copy_redeem_code", bb6.a, new ya6(s76Var, 1));
    }
}
