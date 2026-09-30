package defpackage;

import ai.askquin.R;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Map;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.giftcard.GiftCardSku;
import tech.chatmind.api.giftcard.GiftCardStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x76 {
    public static final /* synthetic */ wn7[] a = {new q79(x76.class, "giftCardQrCodeValue", "getGiftCardQrCodeValue(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)};
    public static final float b = 2.0f;
    public static final gxc c = new gxc("GiftCardQrCodeValue");
    public static final Map d = bm8.G(new iy9(bv4.c, 0));

    public static final void a(GiftCardStatus giftCardStatus, l46 l46Var, int i) {
        int i2;
        iy9 iy9Var;
        l46 l46Var2 = l46Var;
        giftCardStatus.getClass();
        l46Var2.h0(456437291);
        int i3 = i | (l46Var2.e(giftCardStatus.ordinal()) ? 4 : 2);
        int i4 = 0;
        if (!l46Var2.W(i3 & 1, (i3 & 3) != 2)) {
            i2 = 1;
            l46Var2.Z();
        } else {
            if (giftCardStatus == GiftCardStatus.Unknown) {
                l46Var2.f0(-143030728);
                nte.b("—", null, ((e8b) l46Var2.k(l8b.a)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 6, 0, 262138);
                l46Var.r(false);
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new t76(giftCardStatus, i, i4);
                    return;
                }
                return;
            }
            l46Var2.f0(-142970185);
            l46Var2.r(false);
            switch (w76.a[giftCardStatus.ordinal()]) {
                case 1:
                    l46Var2.f0(549579830);
                    Integer numValueOf = Integer.valueOf(R.string.gift_card_status_unclaimed);
                    long j = va6.c;
                    long j2 = ((e8b) l46Var2.k(l8b.a)).u;
                    if (!we6.e(l46Var2)) {
                        j = j2;
                    }
                    iy9Var = new iy9(numValueOf, new y72(j));
                    l46Var2.r(false);
                    break;
                case 2:
                    l46Var2.f0(549585268);
                    Integer numValueOf2 = Integer.valueOf(R.string.gift_card_status_pending);
                    long j3 = va6.c;
                    long j4 = ((e8b) l46Var2.k(l8b.a)).u;
                    if (!we6.e(l46Var2)) {
                        j3 = j4;
                    }
                    iy9Var = new iy9(numValueOf2, new y72(j3));
                    l46Var2.r(false);
                    break;
                case 3:
                    l46Var2.f0(549590566);
                    iy9Var = new iy9(Integer.valueOf(R.string.gift_card_status_claimed), new y72(((e8b) l46Var2.k(l8b.a)).s));
                    l46Var2.r(false);
                    break;
                case 4:
                    l46Var2.f0(549593446);
                    iy9Var = new iy9(Integer.valueOf(R.string.gift_card_status_expired), new y72(((e8b) l46Var2.k(l8b.a)).s));
                    l46Var2.r(false);
                    break;
                case 5:
                    l46Var2.f0(549596377);
                    Integer numValueOf3 = Integer.valueOf(R.string.gift_card_status_used_up);
                    long j5 = va6.e;
                    long j6 = ((e8b) l46Var2.k(l8b.a)).k;
                    if (!we6.e(l46Var2)) {
                        j5 = j6;
                    }
                    iy9Var = new iy9(numValueOf3, new y72(j5));
                    l46Var2.r(false);
                    break;
                case 6:
                    l46Var2.f0(549601884);
                    Integer numValueOf4 = Integer.valueOf(R.string.gift_card_status_active);
                    long j7 = va6.g;
                    long j8 = ((e8b) l46Var2.k(l8b.a)).l;
                    if (!we6.e(l46Var2)) {
                        j7 = j8;
                    }
                    iy9Var = new iy9(numValueOf4, new y72(j7));
                    l46Var2.r(false);
                    break;
                case 7:
                    l46Var2.f0(549607562);
                    iy9Var = new iy9(Integer.valueOf(R.string.gift_card_status_invalidated), new y72(((e8b) l46Var2.k(l8b.a)).s));
                    l46Var2.r(false);
                    break;
                case 8:
                    l46Var2.f0(549610529);
                    l46Var2.r(false);
                    qc0.p("Handled above");
                    return;
                default:
                    throw tec.d(549579192, l46Var2, false);
            }
            int iIntValue = ((Number) iy9Var.a()).intValue();
            long j9 = ((y72) iy9Var.b()).a;
            String str = "gift_card_detail_status:" + giftCardStatus.name();
            g09 g09Var = g09.a;
            j09 j09VarA = b.a(g09Var, str);
            t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(0)), ndb.z, l46Var2, 54);
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
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            s21.a(b.a(tm7.o(androidx.compose.foundation.layout.b.l(g09Var, 8.0f), j9, a7c.a), "gift_card_detail_status_dot"), l46Var2, 0);
            String strQ = afc.q(iIntValue, l46Var2);
            mue mueVar = oue.a;
            i2 = 1;
            nte.b(strQ, null, j9, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var2), l46Var2, 0, 0, 131066);
            l46Var2 = l46Var2;
            l46Var2.r(true);
        }
        ojb ojbVarV2 = l46Var2.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new t76(giftCardStatus, i, i2);
        }
    }

    public static final void b(GiftCardItem giftCardItem, wa6 wa6Var, x16 x16Var, l46 l46Var, int i) {
        int i2;
        giftCardItem.getClass();
        wa6Var.getClass();
        x16Var.getClass();
        l46Var.h0(1735325010);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(giftCardItem) : l46Var.i(giftCardItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.e(wa6Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            long j = ((e8b) l46Var.k(l8b.a)).c;
            if (we6.e(l46Var)) {
                j = y72.j;
            }
            nae.c(x16Var, b.a(androidx.compose.foundation.layout.b.c(g09.a, 1.0f), "gift_card_list_row"), false, eze.a(l46Var).a.j, j, 0L, 0.0f, 0.0f, null, null, af1.b0(630625053, new o14(25, giftCardItem, wa6Var), l46Var), l46Var, ((i2 >> 6) & 14) | 48, 996);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(i, giftCardItem, wa6Var, x16Var, 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00ef A[PHI: r16
  0x00ef: PHI (r16v12 java.lang.String) = (r16v4 java.lang.String), (r16v15 java.lang.String) binds: [B:74:0x0104, B:67:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f4  */
    public static final void c(final GiftCardSku giftCardSku, final String str, final String str2, final String str3, final String str4, final boolean z, final j09 j09Var, boolean z2, l46 l46Var, final int i, final int i2) {
        boolean z3;
        int i3;
        final boolean z4;
        String str5;
        String string;
        ov7 ov7Var;
        boolean z5;
        boolean z6;
        l46 l46Var2 = l46Var;
        giftCardSku.getClass();
        str3.getClass();
        j09Var.getClass();
        l46Var2.h0(-283083520);
        int i4 = (l46Var2.e(giftCardSku.ordinal()) ? 4 : 2) | i | (l46Var2.g(str) ? 32 : 16);
        if ((i & 384) == 0) {
            i4 |= l46Var2.g(str2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i5 = i4 | (l46Var2.g(str3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if ((i & 24576) == 0) {
            i5 |= l46Var2.g(str4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i5 |= l46Var2.h(z) ? 131072 : 65536;
        }
        int i6 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i6 != 0) {
            i3 = i5 | 12582912;
            z3 = z2;
        } else {
            z3 = z2;
            i3 = i5 | (l46Var2.h(z3) ? 8388608 : 4194304);
        }
        if (l46Var2.W(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean z7 = i6 != 0 ? false : z3;
            y6c y6cVarB = a7c.b(32.0f);
            long j = vpf.N(giftCardSku).c;
            float f = z ? 1.0f : 0.48f;
            String string2 = v4e.o0(str3).toString();
            String str6 = string2.length() > 0 ? string2 : null;
            if (str != null && (string = v4e.o0(str).toString()) != null) {
                if (string.length() <= 0) {
                    string = null;
                }
                if (string == null) {
                    if (str2 != null) {
                    }
                    str5 = null;
                } else {
                    str5 = string;
                }
            } else if (str2 != null || (string = v4e.o0(str2).toString()) == null || string.length() <= 0) {
                str5 = null;
            } else {
                str5 = string;
            }
            j09 j09VarD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(j09Var, 1.0f), 215.0f);
            lx0 lx0Var = ndb.b;
            int i7 = i3;
            xn8 xn8VarC = s21.c(lx0Var, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarD);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z8 = l46Var2.S;
            ov7 ov7Var2 = LayoutNode.h1;
            if (z8) {
                l46Var2.l(ov7Var2);
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
            d31 d31Var = d31.a;
            g09 g09Var = g09.a;
            j09 j09VarB = d31Var.b(g09Var);
            v86 v86Var = u86.c;
            s21.a(rrb.h(j09VarB, y6cVarB, new n4d(24.0f, y72.b(j, 0.1f * f), 0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L), 52)), l46Var2, 0);
            j09 j09VarP = pa7.p(oa7.E(d31Var.b(g09Var), y6cVarB), f);
            xn8 xn8VarC2 = s21.c(lx0Var, false);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarP);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var2);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, xn8VarC2);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new oz5(4);
                l46Var2.p0(objR);
            }
            int i8 = i7 & 14;
            kn2.c(giftCardSku, fillElement, (a26) objR, null, "giftCardArtwork", null, cgg.c, l46Var2, i8 | 1597872, 40);
            j09 j09VarB2 = d31Var.b(g09Var);
            long jC = abg.c(227314828);
            y02 y02Var = g21.f;
            s21.a(tm7.o(j09VarB2, jC, y02Var), l46Var2, 0);
            j09 j09VarJ3 = rrb.j(d31Var.b(g09Var), y6cVarB, new n4d(16.0f, y72.b(abg.d(4293519849L), 0.32f), 0.0f, 0L, 60));
            long j2 = y72.e;
            s21.a(db6.w(rrb.j(rrb.j(j09VarJ3, y6cVarB, new n4d(8.0f, y72.b(j2, 0.22f), 0.0f, 0L, 60)), y6cVarB, new n4d(0.5f, y72.b(j2, 0.25f), -3.5f, (((long) Float.floatToRawIntBits(3.0f)) << 32) | (((long) Float.floatToRawIntBits(3.0f)) & 4294967295L), 48)), 0.5f, y72.b(j, 0.25f), y6cVarB), l46Var2, 0);
            j09 j09VarZ = ynb.Z(fillElement, 24.0f);
            xn8 xn8VarC3 = s21.c(lx0Var, false);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ4 = m93.J(l46Var2, j09VarZ);
            l46Var2.j0();
            if (l46Var2.S) {
                ov7Var = ov7Var2;
                l46Var2.l(ov7Var);
            } else {
                ov7Var = ov7Var2;
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, xn8VarC3);
            dec.l(he2Var2, l46Var2, u8aVarM3);
            ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ4);
            j09 j09VarC = androidx.compose.foundation.layout.b.c(d31Var.a(g09Var, ndb.c), 1.0f);
            t7c t7cVarA = s7c.a(xc0.g, ndb.z, l46Var2, 54);
            int iHashCode4 = Long.hashCode(l46Var2.T);
            u8a u8aVarM4 = l46Var2.m();
            j09 j09VarJ5 = m93.J(l46Var2, j09VarC);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, t7cVarA);
            dec.l(he2Var2, l46Var2, u8aVarM4);
            ib8.s(iHashCode4, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ5);
            String strQ = afc.q(R.string.gift_card_badge, l46Var2);
            pr4 pr4Var = l8b.a;
            j09 j09VarA0 = ynb.a0(db6.w(g09Var, 0.5f, ((e8b) l46Var2.k(pr4Var)).w, a7c.b(999.0f)), 8.0f, 3.0f);
            mue mueVar = pue.a;
            ov7 ov7Var3 = ov7Var;
            nte.b(strQ, j09VarA0, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.j(l46Var2), l46Var, 384, 0, 131064);
            l46Var2 = l46Var;
            feg.j(od4.A(R.drawable.gift_card_quin_mark, 0, l46Var2), null, androidx.compose.foundation.layout.b.l(g09Var, 22.0f), null, null, 0.0f, null, l46Var2, 440, 120);
            l46Var2.r(true);
            lx0 lx0Var2 = ndb.e;
            j09 j09VarA = d31Var.a(g09Var, lx0Var2);
            Object objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = new oz5(5);
                l46Var2.p0(objR2);
            }
            kn2.c(giftCardSku, j09VarA, (a26) objR2, lx0Var2, "giftCardMembershipTitle", null, cgg.d, l46Var2, i8 | 1600896, 32);
            if (str6 == null && str5 == null) {
                l46Var2.f0(-1787973919);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-1789290489);
                j09 j09VarA2 = d31Var.a(g09Var, ndb.v);
                int i9 = 6;
                c92 c92VarA = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                int iHashCode5 = Long.hashCode(l46Var2.T);
                u8a u8aVarM5 = l46Var2.m();
                j09 j09VarJ6 = m93.J(l46Var2, j09VarA2);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var3);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var, l46Var2, c92VarA);
                dec.l(he2Var2, l46Var2, u8aVarM5);
                ib8.s(iHashCode5, l46Var2, he2Var3, l46Var2);
                dec.l(he2Var4, l46Var2, j09VarJ6);
                if (str6 == null) {
                    l46Var2.f0(1572632047);
                    z5 = false;
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(1572632048);
                    Object objR3 = l46Var2.R();
                    if (objR3 == i8cVar) {
                        objR3 = new oz5(i9);
                        l46Var2.p0(objR3);
                    }
                    kn2.c(str6, null, (a26) objR3, lx0Var2, "giftCardBlessing", null, cgg.e, l46Var2, 1600896, 34);
                    z5 = false;
                    l46Var2.r(false);
                }
                if (str5 == null) {
                    l46Var2.f0(1573440806);
                    l46Var2.r(z5);
                    z6 = false;
                } else {
                    l46Var2.f0(1573440807);
                    String strR = afc.r(R.string.gift_card_from, new Object[]{str5}, l46Var2);
                    j09 j09VarA3 = b.a(g09Var, "gift_card_preview_sender");
                    mue mueVar2 = oue.a;
                    nte.b(strR, j09VarA3, y72.b(j2, 0.72f), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var2), l46Var, 432, 0, 131064);
                    l46Var2 = l46Var;
                    z6 = false;
                    l46Var2.r(false);
                }
                l46Var2.r(true);
                l46Var2.r(z6);
            }
            l46Var2.r(true);
            String str7 = (str4 == null || v4e.Q(str4)) ? null : str4;
            if (str7 == null) {
                l46Var2.f0(1105934254);
                l46Var2.r(false);
            } else {
                l46Var2.f0(1105934255);
                d(0, l46Var2, ynb.Z(d31Var.a(g09Var, ndb.x), 24.0f), str7);
                l46Var2.r(false);
            }
            if (z7) {
                l46Var2.f0(1106128253);
                s21.a(b.a(tm7.o(d31Var.b(g09Var), ((e8b) l46Var2.k(pr4Var)).o, y02Var), "gift_card_preview_mask"), l46Var2, 0);
                l46Var2.r(false);
            } else {
                l46Var2.f0(1106314687);
                l46Var2.r(false);
            }
            l46Var2.r(true);
            l46Var2.r(true);
            z4 = z7;
        } else {
            l46Var2.Z();
            z4 = z3;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: u76
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x76.c(giftCardSku, str, str2, str3, str4, z, j09Var, z4, (l46) obj, k99.P(i | 1), i2);
                    return wef.a;
                }
            };
        }
    }

    public static final void d(int i, l46 l46Var, j09 j09Var, String str) {
        j09Var.getClass();
        l46Var.h0(-771064946);
        int i2 = i | (l46Var.g(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z || objR == i8cVar) {
                objR = f(208, str);
                l46Var.p0(objR);
            }
            cv6 cv6Var = (cv6) objR;
            if (cv6Var == null) {
                l46Var.f0(-1310550076);
                l46Var.r(false);
            } else {
                l46Var.f0(-1310550075);
                xn8 xn8VarC = s21.c(ndb.b, false);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09Var);
                lf2.q.getClass();
                l46Var.j0();
                boolean z2 = l46Var.S;
                ov7 ov7Var = LayoutNode.h1;
                if (z2) {
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
                y6c y6cVarB = a7c.b(4.0f);
                g09 g09Var = g09.a;
                j09 j09VarE = oa7.E(androidx.compose.foundation.layout.b.l(g09Var, 48.0f), y6cVarB);
                pr4 pr4Var = l8b.a;
                j09 j09VarW = db6.w(tm7.o(j09VarE, ((e8b) l46Var.k(pr4Var)).j, g21.f), 0.5f, ((e8b) l46Var.k(pr4Var)).A, y6cVarB);
                boolean z3 = i3 == 4;
                Object objR2 = l46Var.R();
                if (z3 || objR2 == i8cVar) {
                    objR2 = new bt5(str, 3);
                    l46Var.p0(objR2);
                }
                j09 j09VarA = b.a(vwc.b(j09VarW, false, (a26) objR2), "gift_card_qr_code");
                xn8 xn8VarC2 = s21.c(ndb.f, false);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarA);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, xn8VarC2);
                dec.l(he2Var2, l46Var, u8aVarM2);
                ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ2);
                feg.k(cv6Var, null, b.a(ynb.Z(d31.a.b(g09Var), b), "gift_card_qr_code_image"), null, 0, l46Var, 48, 120);
                tec.s(l46Var, true, true, false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o43(str, j09Var, i, 3, (byte) 0);
        }
    }

    public static final void e(GiftCardStatus giftCardStatus, l46 l46Var, int i) {
        GiftCardStatus giftCardStatus2;
        m5f m5fVar;
        giftCardStatus.getClass();
        l46Var.h0(2015214286);
        int i2 = i | (l46Var.e(giftCardStatus.ordinal()) ? 4 : 2);
        if (!l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            giftCardStatus2 = giftCardStatus;
            l46Var.Z();
        } else {
            if (giftCardStatus == GiftCardStatus.Unknown) {
                l46Var.f0(196021973);
                nte.b("—", null, ((e8b) l46Var.k(l8b.a)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 6, 0, 262138);
                l46Var.r(false);
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new t76(giftCardStatus, i, 2);
                    return;
                }
                return;
            }
            giftCardStatus2 = giftCardStatus;
            l46Var.f0(196082516);
            l46Var.r(false);
            switch (w76.a[giftCardStatus2.ordinal()]) {
                case 1:
                    l46Var.f0(-409313398);
                    Integer numValueOf = Integer.valueOf(R.string.gift_card_status_unclaimed);
                    long j = va6.b;
                    long j2 = va6.a;
                    if (!we6.e(l46Var)) {
                        j = j2;
                    }
                    y72 y72Var = new y72(j);
                    long j3 = va6.c;
                    long j4 = ((e8b) l46Var.k(l8b.a)).u;
                    if (!we6.e(l46Var)) {
                        j3 = j4;
                    }
                    m5fVar = new m5f(numValueOf, y72Var, new y72(j3));
                    l46Var.r(false);
                    break;
                case 2:
                    l46Var.f0(-409303320);
                    Integer numValueOf2 = Integer.valueOf(R.string.gift_card_status_pending);
                    long j5 = va6.b;
                    long j6 = va6.a;
                    if (!we6.e(l46Var)) {
                        j5 = j6;
                    }
                    y72 y72Var2 = new y72(j5);
                    long j7 = va6.c;
                    long j8 = ((e8b) l46Var.k(l8b.a)).u;
                    if (!we6.e(l46Var)) {
                        j7 = j8;
                    }
                    m5fVar = new m5f(numValueOf2, y72Var2, new y72(j7));
                    l46Var.r(false);
                    break;
                case 3:
                    l46Var.f0(-409293474);
                    Integer numValueOf3 = Integer.valueOf(R.string.gift_card_status_claimed);
                    pr4 pr4Var = l8b.a;
                    m5fVar = new m5f(numValueOf3, new y72(((e8b) l46Var.k(pr4Var)).m), new y72(((e8b) l46Var.k(pr4Var)).s));
                    l46Var.r(false);
                    break;
                case 4:
                    l46Var.f0(-409288898);
                    Integer numValueOf4 = Integer.valueOf(R.string.gift_card_status_expired);
                    pr4 pr4Var2 = l8b.a;
                    m5fVar = new m5f(numValueOf4, new y72(((e8b) l46Var.k(pr4Var2)).m), new y72(((e8b) l46Var.k(pr4Var2)).s));
                    l46Var.r(false);
                    break;
                case 5:
                    l46Var.f0(-409284269);
                    Integer numValueOf5 = Integer.valueOf(R.string.gift_card_status_used_up);
                    y72 y72Var3 = new y72(va6.d);
                    long j9 = va6.e;
                    long j10 = ((e8b) l46Var.k(l8b.a)).k;
                    if (!we6.e(l46Var)) {
                        j9 = j10;
                    }
                    m5fVar = new m5f(numValueOf5, y72Var3, new y72(j9));
                    l46Var.r(false);
                    break;
                case 6:
                    l46Var.f0(-409277000);
                    Integer numValueOf6 = Integer.valueOf(R.string.gift_card_status_active);
                    y72 y72Var4 = new y72(va6.f);
                    long j11 = va6.g;
                    long j12 = ((e8b) l46Var.k(l8b.a)).l;
                    if (!we6.e(l46Var)) {
                        j11 = j12;
                    }
                    m5fVar = new m5f(numValueOf6, y72Var4, new y72(j11));
                    l46Var.r(false);
                    break;
                case 7:
                    l46Var.f0(-409269502);
                    Integer numValueOf7 = Integer.valueOf(R.string.gift_card_status_invalidated);
                    pr4 pr4Var3 = l8b.a;
                    m5fVar = new m5f(numValueOf7, new y72(((e8b) l46Var.k(pr4Var3)).m), new y72(((e8b) l46Var.k(pr4Var3)).s));
                    l46Var.r(false);
                    break;
                case 8:
                    l46Var.f0(-409264892);
                    l46Var.r(false);
                    qc0.p("Handled above");
                    return;
                default:
                    throw tec.d(-409313620, l46Var, false);
            }
            int iIntValue = ((Number) m5fVar.a()).intValue();
            long j13 = ((y72) m5fVar.b()).a;
            long j14 = ((y72) m5fVar.c()).a;
            nae.a(b.a(g09.a, "gift_card_status:" + giftCardStatus2.name()), a7c.b(12.0f), j13, 0L, 0.0f, 0.0f, null, af1.b0(-1969997591, new v76(iIntValue, j14), l46Var), l46Var, 12582912, 120);
        }
        ojb ojbVarV2 = l46Var.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new t76(giftCardStatus2, i, 3);
        }
    }

    public static final cv6 f(int i, String str) {
        Object dzbVar;
        try {
            sy0 sy0VarU = urg.u(str, i, i, d);
            int[] iArr = new int[i * i];
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[(i2 * i) + i3] = sy0VarU.a(i3, i2) ? -16777216 : -1;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, i, i, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            dzbVar = new ks(bitmapCreateBitmap);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        return (cv6) dzbVar;
    }

    public static final gb6 g(GiftCardSku giftCardSku) {
        giftCardSku.getClass();
        return giftCardSku == GiftCardSku.OneYear ? new gb6(R.drawable.gift_card_year, R.drawable.gift_card_year_mask) : new gb6(R.drawable.gift_card_month, R.drawable.gift_card_month_mask);
    }
}
