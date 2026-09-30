package defpackage;

import ai.askquin.R;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.feedback.FeedbackReason;
import ai.askquin.ui.settings.language.LanguagesActivity;
import android.graphics.RectF;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import tech.chatmind.api.personality.PersonalitySection;
import tech.chatmind.api.personality.TraitItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        boolean zI;
        int i;
        int i2;
        l46 l46Var;
        List<TraitItem> list;
        TraitItem traitItem;
        int i3 = this.a;
        ov7 ov7Var = LayoutNode.h1;
        i8c i8cVar = sf2.a;
        g09 g09Var = g09.a;
        int i4 = 3;
        wef wefVar = wef.a;
        Object obj3 = this.b;
        switch (i3) {
            case 0:
                k1 k1Var = (k1) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k1Var.a(0, l46Var2);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 1:
                ((Integer) obj2).getClass();
                ((g4) obj3).L(k99.P(9), (l46) obj);
                return wefVar;
            case 2:
                y4 y4Var = (y4) obj3;
                ynb.V(y4Var.Z0(), null, null, new w4(y4Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 3:
                hkb hkbVarM0 = ynb.m0((RectF) obj);
                hkb hkbVarM1 = ynb.m0((RectF) obj2);
                switch (((cva) obj3).a) {
                    case 23:
                        zI = hkbVarM0.i(hkbVarM1);
                        break;
                    default:
                        zI = hkbVarM1.a(hkbVarM0.d());
                        break;
                }
                return Boolean.valueOf(zI);
            case 4:
                w10 w10Var = (w10) obj3;
                l46 l46Var3 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    an1.h(ynb.d0(0.0f, 0.0f, 0.0f, 72.0f, 7, g09.a), w10Var.d, l46Var3, 6);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 5:
                Long l = (Long) obj2;
                if (pwc.a((owc) obj3, l.longValue())) {
                    return l;
                }
                return null;
            case 6:
                ((Integer) obj2).getClass();
                ((nf2) obj3).a(k99.P(1), (l46) obj);
                return wefVar;
            case 7:
                l46 l46Var4 = (l46) obj3;
                j09 j09Var = (j09) obj;
                j09 j09VarI = (h09) obj2;
                if (j09VarI instanceof rf2) {
                    n26 n26Var = ((rf2) j09VarI).Z;
                    z7f.t(3, n26Var);
                    j09VarI = m93.I(l46Var4, (j09) n26Var.m(g09Var, l46Var4, 0));
                }
                return j09Var.D(j09VarI);
            case 8:
                bw bwVar = (bw) obj3;
                ((Integer) obj).getClass();
                if (obj2 instanceof ue2) {
                    ue2 ue2Var = (ue2) obj2;
                    x79 x79Var = (x79) bwVar.v;
                    if (x79Var == null) {
                        x79 x79Var2 = mec.a;
                        x79Var = new x79();
                        bwVar.v = x79Var;
                    }
                    x79Var.l(ue2Var);
                    ((p89) bwVar.f).b(ue2Var);
                }
                if (obj2 instanceof p46) {
                    bwVar.i((p46) obj2);
                }
                if (obj2 instanceof ojb) {
                    ((ojb) obj2).c();
                }
                return wefVar;
            case 9:
                ((Integer) obj2).getClass();
                wq2.c((hod) obj3, (l46) obj, k99.P(9));
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                r0 r0Var = (r0) obj3;
                List list2 = (List) obj;
                list2.getClass();
                r0Var.P1(sfb.DISLIKE, r0Var.T(), list2, (String) obj2);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                lmg.M((cre) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                int iIntValue3 = ((Integer) obj).intValue();
                cod codVar = (cod) obj2;
                codVar.getClass();
                a63.b(codVar);
                ((y63) obj3).n(iIntValue3);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return (fxd) obj3;
            case 14:
                oia oiaVar = (oia) obj;
                ((Float) obj2).getClass();
                oiaVar.a();
                z7c.h((ctf) obj3, oiaVar);
                return wefVar;
            case 15:
                l46 l46Var5 = (l46) obj;
                ((Integer) obj2).getClass();
                l46Var5.f0(666084174);
                String str = ((bne) obj3).b;
                l46Var5.r(false);
                return str;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                fcb fcbVar = (fcb) obj3;
                l46 l46Var6 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var6.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zI2 = l46Var6.i(fcbVar);
                    Object objR = l46Var6.R();
                    if (zI2 || objR == i8cVar) {
                        objR = new uo2(13, fcbVar);
                        l46Var6.p0(objR);
                    }
                    j74.n("Reset", (x16) objR, l46Var6, 6);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 17:
                q9b q9bVar = (q9b) obj3;
                l46 l46Var7 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (l46Var7.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zI3 = l46Var7.i(q9bVar);
                    Object objR2 = l46Var7.R();
                    if (zI3 || objR2 == i8cVar) {
                        objR2 = new fn0(q9bVar, i4);
                        l46Var7.p0(objR2);
                    }
                    j74.n("Apply", (x16) objR2, l46Var7, 6);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 18:
                aw2 aw2Var = (aw2) obj3;
                l46 l46Var8 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (l46Var8.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zI4 = l46Var8.i(aw2Var);
                    Object objR3 = l46Var8.R();
                    if (zI4 || objR3 == i8cVar) {
                        objR3 = new z04(aw2Var, false ? 1 : 0);
                        l46Var8.p0(objR3);
                    }
                    j74.n("清空 SKU + 实验分组缓存", (x16) objR3, l46Var8, 6);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case 19:
                ((Integer) obj2).getClass();
                od4.c((q84) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 20:
                ((Integer) obj2).getClass();
                ((o84) obj3).a(k99.P(1), (l46) obj);
                return wefVar;
            case 21:
                fh4 fh4Var = (fh4) obj3;
                l46 l46Var9 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (l46Var9.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    qk2.e(null, fh4Var.a(), l46Var9, 0);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case 22:
                oh4 oh4Var = (oh4) obj3;
                l46 l46Var10 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (l46Var10.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    qk2.e(null, oh4Var.a(), l46Var10, 0);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case 23:
                FeedbackReason feedbackReason = (FeedbackReason) obj3;
                l46 l46Var11 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (l46Var11.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    nte.b(afc.q(feedbackReason.getResId(), l46Var11), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var11, 0, 0, 262142);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            case 24:
                ((Integer) obj2).getClass();
                kj0.Q((mic) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 25:
                os5 os5Var = (os5) obj3;
                l46 l46Var12 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (l46Var12.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    feg.j(od4.A(g21.S(l46Var12) ? os5Var.d : os5Var.e, 0, l46Var12), null, ynb.Z(b.c(g09Var, 1.0f), 16.0f), null, an2.d, 0.0f, null, l46Var12, 25016, 104);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
            case 26:
                a56 a56Var = (a56) obj3;
                l46 l46Var13 = (l46) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (l46Var13.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    xn8 xn8VarC = s21.c(ndb.f, false);
                    int iHashCode = Long.hashCode(l46Var13.T);
                    u8a u8aVarM = l46Var13.m();
                    j09 j09VarJ = m93.J(l46Var13, j09VarC);
                    lf2.q.getClass();
                    l46Var13.j0();
                    if (l46Var13.S) {
                        l46Var13.l(ov7Var);
                    } else {
                        l46Var13.s0();
                    }
                    dec.l(hj6.z, l46Var13, xn8VarC);
                    dec.l(hj6.y, l46Var13, u8aVarM);
                    dec.l(hj6.X, l46Var13, Integer.valueOf(iHashCode));
                    dec.k(l46Var13);
                    dec.l(hj6.x, l46Var13, j09VarJ);
                    a56Var.getClass();
                    int iOrdinal = a56Var.ordinal();
                    if (iOrdinal == 0) {
                        i = -926829819;
                        i2 = R.string.gender_female;
                    } else if (iOrdinal == 1) {
                        i = -926826877;
                        i2 = R.string.gender_male;
                    } else {
                        if (iOrdinal != 2) {
                            ap.c();
                            return null;
                        }
                        i = -926823964;
                        i2 = R.string.gender_other;
                    }
                    String strI = tec.i(l46Var13, i, i2, l46Var13, false);
                    mue mueVar = pue.a;
                    nte.b(strI, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var13), l46Var13, 0, 0, 131070);
                    l46Var13.r(true);
                } else {
                    l46Var13.Z();
                }
                return wefVar;
            case 27:
                ((Integer) obj2).getClass();
                ((p27) obj3).a(k99.P(1), (l46) obj);
                return wefVar;
            case 28:
                LanguagesActivity languagesActivity = (LanguagesActivity) obj3;
                l46 l46Var14 = (l46) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i5 = LanguagesActivity.Q0;
                if (l46Var14.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    pwf pwfVarA = qd8.a(l46Var14);
                    if (pwfVarA == null) {
                        qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    o7c.a(false, null, af1.b0(1868553493, new rk6(i4, (lu7) fbc.m(job.a.b(lu7.class), pwfVarA, null, hcc.i(pwfVarA), l46Var14), languagesActivity), l46Var14), l46Var14, 384, 3);
                } else {
                    l46Var14.Z();
                }
                return wefVar;
            default:
                PersonalitySection personalitySection = (PersonalitySection) obj3;
                l46 l46Var15 = (l46) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (l46Var15.W(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    j09 j09VarD0 = ynb.d0(0.0f, 24.0f, 0.0f, 12.0f, 5, ynb.b0(36.0f, 0.0f, b.c(g09Var, 1.0f), 2));
                    c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var15, 6);
                    int iHashCode2 = Long.hashCode(l46Var15.T);
                    u8a u8aVarM2 = l46Var15.m();
                    j09 j09VarJ2 = m93.J(l46Var15, j09VarD0);
                    lf2.q.getClass();
                    l46Var15.j0();
                    if (l46Var15.S) {
                        l46Var15.l(ov7Var);
                    } else {
                        l46Var15.s0();
                    }
                    dec.l(hj6.z, l46Var15, c92VarA);
                    dec.l(hj6.y, l46Var15, u8aVarM2);
                    dec.l(hj6.X, l46Var15, Integer.valueOf(iHashCode2));
                    dec.k(l46Var15);
                    dec.l(hj6.x, l46Var15, j09VarJ2);
                    l46Var15.f0(-1780624330);
                    if (personalitySection == null || (list = personalitySection.getList()) == null || (traitItem = (TraitItem) s72.x0(list)) == null) {
                        l46Var = l46Var15;
                        l46Var.r(false);
                    } else {
                        String subTitle = traitItem.getSubTitle();
                        String str2 = subTitle == null ? "" : subTitle;
                        mue mueVar2 = pue.a;
                        nte.b(str2, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var15), 0L, 0L, ar5.d, ((y8b) l46Var15.k(x8b.a)).a, 0L, null, 0, w6c.k(40.5d), null, null, 16646107), l46Var15, 0, 0, 131070);
                        String desc = traitItem.getDesc();
                        String str3 = desc == null ? "" : desc;
                        mue mueVar3 = oue.a;
                        nte.b(str3, null, 0L, 0L, null, null, 0L, null, null, 0L, 2, false, 4, 0, null, pue.e(l46Var15), l46Var15, 0, 24960, 110590);
                        l46Var = l46Var15;
                        tec.u(g09Var, 60.0f, l46Var, false);
                    }
                    l46Var.r(true);
                } else {
                    l46Var15.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ i1(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
