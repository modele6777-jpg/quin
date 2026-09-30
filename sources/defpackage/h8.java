package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.share.SharedConversationEntry;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Iterator;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h8 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        pr4 pr4Var;
        long j;
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        i8c i8cVar = sf2.a;
        g09 g09Var = g09.a;
        int i2 = 7;
        wef wefVar = wef.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                use useVar = (use) obj4;
                x4d x4dVar = (x4d) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, g09Var);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    nte.b(afc.q(R.string.account_profile_edit_nickname_tips, l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262142);
                    b21.j(useVar, null, false, null, null, null, null, null, null, gec.x, null, x4dVar, null, null, l46Var, 0, 100663296, 31195134);
                    l46Var.r(true);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                ((ho) obj4).a(fFloatValue, ((Float) obj2).floatValue());
                ((jmb) obj3).element = fFloatValue;
                return wefVar;
            case 2:
                zq zqVar = (zq) obj3;
                int iIntValue2 = ((Integer) obj).intValue();
                ywc ywcVar = (ywc) obj2;
                if (!((zwc) obj4).b.c(ywcVar.f)) {
                    zqVar.i(iIntValue2, ywcVar);
                    zqVar.g.d(wefVar);
                }
                return wefVar;
            case 3:
                ((Integer) obj2).getClass();
                t72.c((j09) obj4, (l26) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 4:
                ((Integer) obj2).getClass();
                qk2.e((j09) obj4, (m40) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 5:
                ((Integer) obj2).getClass();
                kn2.w((String) obj4, (Integer) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 6:
                ((Integer) obj2).getClass();
                ((af8) obj4).V((dd2) obj3, (l46) obj, k99.P(7));
                return wefVar;
            case 7:
                dd2 dd2Var = (dd2) obj4;
                e31 e31Var = (e31) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dd2Var.m(e31Var, l46Var2, 0);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 8:
                r6e r6eVar = (r6e) obj;
                kl2 kl2Var = (kl2) obj2;
                return ((xn8) obj4).b(r6eVar, r6eVar.z0(new dd2(new h8(i2, (dd2) obj3, new e31(r6eVar, kl2Var.a)), true, -431986394), wefVar), kl2Var.a);
            case 9:
                pi1 pi1Var = (pi1) obj4;
                a26 a26Var = (a26) obj3;
                Bitmap bitmap = (Bitmap) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                bitmap.getClass();
                a26Var.getClass();
                pi1Var.X.setValue(Boolean.TRUE);
                ynb.V(hwf.a(pi1Var), null, null, new mi1(pi1Var, bitmap, fFloatValue2, a26Var, null), 3).E(new di1(pi1Var, 2));
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                uq1.n((bod) obj4, (TarotCardType) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                use useVar2 = (use) obj4;
                String str = (String) obj3;
                l46 l46Var3 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    j09 j09VarZ = ynb.Z(g09Var, 16.0f);
                    c92 c92VarA2 = a92.a(xc0.c, ndb.Y, l46Var3, 0);
                    int iHashCode2 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM2 = l46Var3.m();
                    j09 j09VarJ2 = m93.J(l46Var3, j09VarZ);
                    lf2.q.getClass();
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(hj6.z, l46Var3, c92VarA2);
                    dec.l(hj6.y, l46Var3, u8aVarM2);
                    dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode2));
                    dec.k(l46Var3);
                    dec.l(hj6.x, l46Var3, j09VarJ2);
                    pr4 pr4Var2 = r9f.a;
                    nte.b("JSON Config", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var3.k(pr4Var2)).i, l46Var3, 6, 0, 131070);
                    j09 j09VarD = b.d(kv2.e(g09Var, 8.0f, l46Var3, g09Var, 1.0f), 200.0f);
                    if (str != null) {
                        l46Var3.f0(-1588524046);
                        pr4Var = o82.a;
                        j = ((m82) l46Var3.k(pr4Var)).w;
                    } else {
                        l46Var3.f0(-1588522860);
                        pr4Var = o82.a;
                        j = ((m82) l46Var3.k(pr4Var)).A;
                    }
                    l46Var3.r(false);
                    tv0.b(useVar2, ynb.Z(db6.w(j09VarD, 1.0f, j, a7c.b(8.0f)), 12.0f), false, null, mue.a((mue) l46Var3.k(nte.a), ((m82) l46Var3.k(pr4Var)).q, w6c.l(12), null, yp5.d, 0L, null, 0, 0L, null, null, 16777180), null, null, null, null, null, new dtd(((m82) l46Var3.k(pr4Var)).a), null, null, l46Var3, 6, 0, 30684);
                    if (str != null) {
                        ib8.r(4.0f, -1999183506, l46Var3, l46Var3, g09Var);
                        nte.b(str, null, ((m82) l46Var3.k(pr4Var)).w, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var3.k(pr4Var2)).l, l46Var3, 0, 0, 131066);
                        l46Var3.r(false);
                    } else {
                        l46Var3.f0(-1998992267);
                        l46Var3.r(false);
                    }
                    l46Var3.r(true);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                gs1.i((Integer) obj4, (a26) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                ((m6c) obj4).V((dd2) obj3, (l46) obj, k99.P(7));
                return wefVar;
            case 14:
                ((Integer) obj2).getClass();
                vpf.a((nu1) obj4, (x16) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 15:
                ((Integer) obj2).getClass();
                ((cy1) obj4).V((dd2) obj3, (l46) obj, k99.P(7));
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                ((hy1) obj4).V((dd2) obj3, (l46) obj, k99.P(7));
                return wefVar;
            case 17:
                kmb kmbVar = (kmb) obj3;
                nv2 nv2Var = (nv2) obj2;
                ((wef) obj).getClass();
                nv2Var.getClass();
                int i3 = kmbVar.element;
                kmbVar.element = i3 + 1;
                ((pv2[]) obj4)[i3] = nv2Var;
                return wefVar;
            case 18:
                ((Integer) obj2).getClass();
                jgb.r((j09) obj4, (k00) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 19:
                h0e h0eVar = (h0e) obj4;
                gd4 gd4Var = (gd4) obj3;
                l46 l46Var4 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (l46Var4.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    l46Var4.f0(-1601966122);
                    CharSequence charSequenceI = (CharSequence) h0eVar.getValue();
                    if (charSequenceI.length() == 0) {
                        if (!gd4Var.a || gd4Var.h) {
                            charSequenceI = tec.i(l46Var4, -1019175456, R.string.chat_question_not_support_content, l46Var4, false);
                        } else {
                            l46Var4.f0(-1529606312);
                            l46Var4.r(false);
                            charSequenceI = "";
                        }
                    }
                    String str2 = (String) charSequenceI;
                    l46Var4.r(false);
                    mue mueVar = pue.a;
                    nte.b(str2, null, ((e8b) l46Var4.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var4), l46Var4, 0, 0, 131066);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 20:
                ((Integer) obj2).getClass();
                ((mn2) obj4).a((ln2) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 21:
                q7b q7bVar = (q7b) obj4;
                l46 l46Var5 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (l46Var5.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    wq2.h(q7bVar, l46Var5, 0);
                    p7b.a(q7bVar, obj3, b.c, l46Var5, 384);
                    wq2.k(q7bVar, l46Var5, 0);
                    wq2.f(q7bVar, l46Var5, 0);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 22:
                r0 r0Var = (r0) obj4;
                j09 j09Var = (j09) obj3;
                l46 l46Var6 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (l46Var6.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    hfc.a(48, l46Var6, j09Var, r0Var.G());
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 23:
                SharedConversationEntry sharedConversationEntry = (SharedConversationEntry) obj4;
                a26 a26Var2 = (a26) obj3;
                l46 l46Var7 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (l46Var7.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.y, l46Var7, 6);
                    int iHashCode3 = Long.hashCode(l46Var7.T);
                    u8a u8aVarM3 = l46Var7.m();
                    j09 j09VarJ3 = m93.J(l46Var7, g09Var);
                    lf2.q.getClass();
                    l46Var7.j0();
                    if (l46Var7.S) {
                        l46Var7.l(ov7Var);
                    } else {
                        l46Var7.s0();
                    }
                    dec.l(hj6.z, l46Var7, t7cVarA);
                    dec.l(hj6.y, l46Var7, u8aVarM3);
                    dec.l(hj6.X, l46Var7, Integer.valueOf(iHashCode3));
                    dec.k(l46Var7);
                    dec.l(hj6.x, l46Var7, j09VarJ3);
                    l46Var7.f0(-860189405);
                    Iterator<T> it = sharedConversationEntry.getCards().iterator();
                    while (it.hasNext()) {
                        b21.d(b.p(g09Var, 80.0f), (TarotCardChoice) it.next(), false, null, a26Var2, 0.0f, null, null, l46Var7, 196614, 204);
                    }
                    l46Var7.r(false);
                    l46Var7.r(true);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 24:
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj4;
                jx jxVar = (jx) obj3;
                l46 l46Var8 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (l46Var8.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    String strQ = afc.q(hfc.q(tarotSkinIdentify).m(), l46Var8);
                    mue mueVar2 = pue.a;
                    mue mueVarB = pue.b(l46Var8);
                    boolean zI = l46Var8.i(jxVar);
                    Object objR = l46Var8.R();
                    if (zI || objR == i8cVar) {
                        objR = new wt1(jxVar, 4);
                        l46Var8.p0(objR);
                    }
                    nte.b(strQ, bzd.x(g09Var, (a26) objR), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarB, l46Var8, 0, 0, 131068);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case 25:
                ((Integer) obj2).getClass();
                ((mp3) obj4).a((ta0) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 26:
                ((Integer) obj2).getClass();
                ((ss3) obj4).a((jkd) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 27:
                ume umeVar = (ume) obj4;
                hne hneVar = (hne) obj3;
                l46 l46Var9 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (l46Var9.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zG = l46Var9.g(umeVar);
                    Object objR2 = l46Var9.R();
                    if (zG || objR2 == i8cVar) {
                        objR2 = zrd.b(new sk3(0, umeVar, ume.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 2));
                        l46Var9.p0(objR2);
                    }
                    lt3.a(hneVar, (tme) ((h0e) objR2).getValue(), l46Var9, 0);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case 28:
                ((Integer) obj2).getClass();
                lt3.a((hne) obj4, (tme) obj3, (l46) obj, k99.P(1));
                return wefVar;
            default:
                aw2 aw2Var = (aw2) obj4;
                tc4 tc4Var = (tc4) obj3;
                l46 l46Var10 = (l46) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (l46Var10.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    boolean zI2 = l46Var10.i(aw2Var) | l46Var10.i(tc4Var);
                    Object objR3 = l46Var10.R();
                    if (zI2 || objR3 == i8cVar) {
                        objR3 = new jt3(i2, aw2Var, tc4Var);
                        l46Var10.p0(objR3);
                    }
                    j74.n("Refresh", (x16) objR3, l46Var10, 6);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ h8(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
