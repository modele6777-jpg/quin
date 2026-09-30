package defpackage;

import ai.askquin.R;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.settings.profile.AccountProfileRoute$SetBios;
import ai.askquin.ui.settings.profile.AccountProfileRoute$SetBirthday;
import ai.askquin.ui.settings.profile.AccountProfileRoute$SetGender;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import tech.chatmind.api.Gender;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e8 implements n26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ e89 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ e8(rcf rcfVar, r0 r0Var, egd egdVar, boolean z, boolean z2, e89 e89Var, e89 e89Var2, e89 e89Var3, h0e h0eVar, s69 s69Var) {
        this.d = rcfVar;
        this.g = r0Var;
        this.v = egdVar;
        this.b = z;
        this.c = z2;
        this.f = e89Var;
        this.w = e89Var2;
        this.x = e89Var3;
        this.y = h0eVar;
        this.e = s69Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [int] */
    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        final int i;
        ?? r13;
        boolean z;
        y72 y72VarC;
        final boolean z2;
        boolean z3;
        int i2 = this.a;
        i8c i8cVar = sf2.a;
        wef wefVar = wef.a;
        Object obj4 = this.e;
        Object obj5 = this.y;
        Object obj6 = this.x;
        Object obj7 = this.w;
        Object obj8 = this.v;
        Object obj9 = this.g;
        Object obj10 = this.d;
        switch (i2) {
            case 0:
                String str = (String) obj10;
                j09 j09Var = (j09) obj8;
                j09 j09Var2 = (j09) obj7;
                String str2 = (String) obj9;
                final yof yofVar = (yof) obj6;
                final a26 a26Var = (a26) obj5;
                x16 x16Var = (x16) obj4;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    x8.d(afc.q(R.string.account_title, l46Var), str, j09Var, null, null, l46Var, 0, 24);
                    jgb.t(0, 0, l46Var, j09Var2);
                    if (str2 == null) {
                        l46Var.f0(1998732264);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1998732265);
                        x8.c(0, l46Var, j09Var, str2);
                        jgb.t(0, 0, l46Var, j09Var2);
                        l46Var.r(false);
                    }
                    String strQ = afc.q(R.string.account_profile_name_label, l46Var);
                    String str3 = yofVar.a;
                    Object objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = new i8(this.f, 2);
                        l46Var.p0(objR);
                    }
                    x8.d(strQ, str3, j09Var, null, (x16) objR, l46Var, 24576, 8);
                    jgb.t(0, 0, l46Var, j09Var2);
                    String strQ2 = afc.q(R.string.account_profile_gender_label, l46Var);
                    String str4 = yofVar.b;
                    boolean zG = l46Var.g(a26Var) | l46Var.i(yofVar);
                    Object objR2 = l46Var.R();
                    if (zG || objR2 == i8cVar) {
                        i = 0;
                        objR2 = new x16() { // from class: n8
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i3 = i;
                                wef wefVar2 = wef.a;
                                yof yofVar2 = yofVar;
                                a26 a26Var2 = a26Var;
                                switch (i3) {
                                    case 0:
                                        a26Var2.d(new AccountProfileRoute$SetGender(v4e.Q(yofVar2.b) ? null : Gender.valueOf(yofVar2.b)));
                                        break;
                                    case 1:
                                        a26Var2.d(new AccountProfileRoute$SetBirthday(yofVar2.c));
                                        break;
                                    default:
                                        a26Var2.d(new AccountProfileRoute$SetBios(yofVar2.d));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var.p0(objR2);
                    } else {
                        i = 0;
                    }
                    x8.d(strQ2, str4, j09Var, null, (x16) objR2, l46Var, 0, 8);
                    jgb.t(i, i, l46Var, j09Var2);
                    String strQ3 = afc.q(R.string.account_profile_birthday_label, l46Var);
                    String str5 = yofVar.c;
                    String str6 = "--";
                    try {
                        if (!v4e.Q(str5)) {
                            th5 th5Var = cye.b;
                            th5Var.getClass();
                            w57 w57Var = w57.a;
                            ma8 ma8VarA = gcc.E(mh3.Q(str5), th5Var).a();
                            str6 = ma8VarA.j() + "-" + ok8.x(ma8VarA.g()) + "-" + ma8VarA.b();
                        }
                    } catch (Exception e) {
                        tec.t(hf8.Q, "", "format birthday error", e);
                    }
                    String str7 = str6;
                    boolean zG2 = l46Var.g(a26Var) | l46Var.i(yofVar);
                    Object objR3 = l46Var.R();
                    if (zG2 || objR3 == i8cVar) {
                        final int i3 = 1;
                        objR3 = new x16() { // from class: n8
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i4 = i3;
                                wef wefVar2 = wef.a;
                                yof yofVar2 = yofVar;
                                a26 a26Var2 = a26Var;
                                switch (i4) {
                                    case 0:
                                        a26Var2.d(new AccountProfileRoute$SetGender(v4e.Q(yofVar2.b) ? null : Gender.valueOf(yofVar2.b)));
                                        break;
                                    case 1:
                                        a26Var2.d(new AccountProfileRoute$SetBirthday(yofVar2.c));
                                        break;
                                    default:
                                        a26Var2.d(new AccountProfileRoute$SetBios(yofVar2.d));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var.p0(objR3);
                    }
                    x8.d(strQ3, str7, j09Var, null, (x16) objR3, l46Var, 0, 8);
                    jgb.t(0, 0, l46Var, j09Var2);
                    String strQ4 = afc.q(R.string.account_profile_bios_label, l46Var);
                    String str8 = yofVar.d;
                    boolean zG3 = l46Var.g(a26Var) | l46Var.i(yofVar);
                    Object objR4 = l46Var.R();
                    if (zG3 || objR4 == i8cVar) {
                        final int i4 = 2;
                        objR4 = new x16() { // from class: n8
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i5 = i4;
                                wef wefVar2 = wef.a;
                                yof yofVar2 = yofVar;
                                a26 a26Var2 = a26Var;
                                switch (i5) {
                                    case 0:
                                        a26Var2.d(new AccountProfileRoute$SetGender(v4e.Q(yofVar2.b) ? null : Gender.valueOf(yofVar2.b)));
                                        break;
                                    case 1:
                                        a26Var2.d(new AccountProfileRoute$SetBirthday(yofVar2.c));
                                        break;
                                    default:
                                        a26Var2.d(new AccountProfileRoute$SetBios(yofVar2.d));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var.p0(objR4);
                    }
                    x8.d(strQ4, str8, j09Var, null, (x16) objR4, l46Var, 0, 8);
                    if (this.b) {
                        l46Var.f0(2000208640);
                        jgb.t(0, 0, l46Var, j09Var2);
                        String strQ5 = afc.q(R.string.auto_renew_title, l46Var);
                        boolean z4 = this.c;
                        String strQ6 = afc.q(z4 ? R.string.auto_renew_tag_on : R.string.auto_renew_tag_off, l46Var);
                        if (z4) {
                            l46Var.f0(-1320939752);
                            z = false;
                            y72VarC = tec.c(l46Var, false, ((m82) l46Var.k(o82.a)).a);
                        } else {
                            z = false;
                            l46Var.f0(2000553452);
                            l46Var.r(false);
                            y72VarC = null;
                        }
                        x8.d(strQ5, strQ6, j09Var, y72VarC, x16Var, l46Var, 0, 0);
                        l46Var.r(z);
                        r13 = z;
                    } else {
                        r13 = 0;
                        l46Var.f0(2000655505);
                        l46Var.r(false);
                    }
                    jgb.p(null, l46Var, r13, 1);
                }
                break;
            case 1:
                List list = (List) obj9;
                final yx9 yx9Var = (yx9) obj8;
                x48 x48Var = (x48) obj7;
                final String str9 = (String) obj10;
                final x16 x16Var2 = (x16) obj4;
                ii6 ii6Var = (ii6) obj6;
                osd osdVar = (osd) obj5;
                xw9 xw9Var = (xw9) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var2.g(xw9Var) ? 4 : 2;
                }
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    l46Var2.Z();
                } else if (!list.isEmpty()) {
                    l46Var2.f0(1470158858);
                    l46Var2.r(false);
                    final ghc ghcVarT = mh3.T(l46Var2);
                    Object objR5 = l46Var2.R();
                    if (objR5 == i8cVar) {
                        objR5 = af1.E(l46Var2);
                        l46Var2.p0(objR5);
                    }
                    final aw2 aw2Var = (aw2) objR5;
                    hzc hzcVar = yx9Var.d;
                    sz9 sz9Var = (sz9) hzcVar.c;
                    sz9 sz9Var2 = (sz9) hzcVar.c;
                    boolean z5 = sz9Var.j() >= list.size() + (-1);
                    FillElement fillElement = b.c;
                    j09 j09VarY = ynb.Y(fillElement, xw9Var);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarY);
                    lf2.q.getClass();
                    l46Var2.j0();
                    boolean z6 = l46Var2.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z6) {
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
                    j09 j09VarD0 = ynb.d0(0.0f, 8.0f, 0.0f, 96.0f, 5, ynb.b0(24.0f, 0.0f, mh3.d0(fillElement, ghcVarT, false, 14), 2));
                    boolean z7 = z5;
                    uc0 uc0Var = new uc0(20.0f, true, new qc0(0));
                    jx0 jx0Var = ndb.Y;
                    c92 c92VarA = a92.a(uc0Var, jx0Var, l46Var2, 6);
                    int iHashCode2 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM2 = l46Var2.m();
                    j09 j09VarJ2 = m93.J(l46Var2, j09VarD0);
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
                    g09 g09Var = g09.a;
                    j09 j09VarB0 = ynb.b0(0.0f, 24.0f, q6c.j(b.c(g09Var, 1.0f), ii6Var, l46Var2), 1);
                    c92 c92VarA2 = a92.a(new uc0(16.0f, true, new qc0(0)), jx0Var, l46Var2, 6);
                    int iHashCode3 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM3 = l46Var2.m();
                    j09 j09VarJ3 = m93.J(l46Var2, j09VarB0);
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var, l46Var2, c92VarA2);
                    dec.l(he2Var2, l46Var2, u8aVarM3);
                    ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
                    dec.l(he2Var4, l46Var2, j09VarJ3);
                    kn2.c(Integer.valueOf(sz9Var2.j()), ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2), null, null, "seasonal-reading-heading", null, af1.b0(155296860, new m4a(list, 1), l46Var2), l46Var2, 1597488, 44);
                    u3c.a(list, yx9Var, b.d(b.c(g09Var, 1.0f), 190.0f), 0.0f, false, l46Var2, 384);
                    l46Var2.r(true);
                    kn2.c(Integer.valueOf(sz9Var2.j()), null, null, null, "seasonal-reading-content", null, af1.b0(1736736914, new p93(list, ii6Var, osdVar, 6), l46Var2), l46Var2, 1597440, 46);
                    l46Var2.r(true);
                    boolean z8 = sz9Var2.j() == 0;
                    boolean zI = l46Var2.i(aw2Var) | l46Var2.g(yx9Var) | l46Var2.g(ghcVarT);
                    Object objR6 = l46Var2.R();
                    if (zI || objR6 == i8cVar) {
                        objR6 = new xg4(aw2Var, yx9Var, ghcVarT, 2);
                        l46Var2.p0(objR6);
                    }
                    x16 x16Var3 = (x16) objR6;
                    boolean zH = l46Var2.h(z7);
                    final boolean z9 = this.b;
                    boolean zH2 = zH | l46Var2.h(z9) | l46Var2.g(str9) | l46Var2.g(x16Var2) | l46Var2.i(aw2Var) | l46Var2.g(yx9Var) | l46Var2.g(ghcVarT);
                    Object objR7 = l46Var2.R();
                    if (zH2 || objR7 == i8cVar) {
                        z2 = z7;
                        objR7 = new x16() { // from class: qoc
                            @Override // defpackage.x16
                            public final Object invoke() {
                                if (z2) {
                                    if (z9) {
                                        x1f x1fVar = x1f.a;
                                        x1f.k(p05.a, new alc(str9, 2), 2);
                                    }
                                    x16Var2.invoke();
                                } else {
                                    ynb.V(aw2Var, null, null, new uoc(yx9Var, ghcVarT, null), 3);
                                }
                                return wef.a;
                            }
                        };
                        z3 = z9;
                        l46Var2.p0(objR7);
                    } else {
                        z2 = z7;
                        z3 = z9;
                    }
                    o5c.a(z8, z2, x16Var3, (x16) objR7, d31.a.a(g09Var, ndb.w), l46Var2, 0);
                    l46Var2.r(true);
                    Object[] objArr = {x48Var, yx9Var, "seasonal_reading_reading", Boolean.valueOf(z3)};
                    boolean zH3 = l46Var2.h(z3) | l46Var2.i(x48Var) | l46Var2.g(yx9Var);
                    boolean z10 = this.c;
                    boolean zH4 = zH3 | l46Var2.h(z10) | l46Var2.g(str9);
                    Object objR8 = l46Var2.R();
                    if (zH4 || objR8 == i8cVar) {
                        objR8 = new xoc(z3, x48Var, yx9Var, this.f, "seasonal_reading_reading", z10, str9, null);
                        l46Var2.p0(objR8);
                    }
                    af1.r(objArr, (l26) objR8, l46Var2);
                } else {
                    l46Var2.f0(1470066602);
                    s21.a(ynb.Y(b.c, xw9Var), l46Var2, 0);
                    l46Var2.r(false);
                }
                break;
            default:
                final rcf rcfVar = (rcf) obj10;
                final r0 r0Var = (r0) obj9;
                final egd egdVar = (egd) obj8;
                final e89 e89Var = (e89) obj7;
                final e89 e89Var2 = (e89) obj6;
                final h0e h0eVar = (h0e) obj5;
                final s69 s69Var = (s69) obj4;
                final xw9 xw9Var2 = (xw9) obj;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                xw9Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= l46Var3.g(xw9Var2) ? 4 : 2;
                }
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    l46Var3.Z();
                } else {
                    final boolean z11 = this.b;
                    final boolean z12 = this.c;
                    final e89 e89Var3 = this.f;
                    ded.a(null, af1.b0(-1014327614, new n26() { // from class: tbf
                        @Override // defpackage.n26
                        public final Object m(Object obj11, Object obj12, Object obj13) {
                            Object d60Var;
                            final rcf rcfVar2;
                            final sdd sddVar = (sdd) obj11;
                            l46 l46Var4 = (l46) obj12;
                            int iIntValue4 = ((Integer) obj13).intValue();
                            sddVar.getClass();
                            if ((iIntValue4 & 6) == 0) {
                                iIntValue4 |= l46Var4.g(sddVar) ? 4 : 2;
                            }
                            int i5 = iIntValue4;
                            if (l46Var4.W(i5 & 1, (i5 & 19) != 18)) {
                                rcf rcfVar3 = rcfVar;
                                boolean z13 = rcfVar3.g() == tn4.b;
                                Integer numH = rcfVar3.h();
                                boolean zI2 = l46Var4.i(rcfVar3);
                                Object objR9 = l46Var4.R();
                                i8c i8cVar2 = sf2.a;
                                if (zI2 || objR9 == i8cVar2) {
                                    d60Var = new d60(1, rcfVar3, rcf.class, "createNewCard", "createNewCard()Ltech/chatmind/api/TarotCardChoice;", 4, 6);
                                    rcfVar2 = rcfVar3;
                                    l46Var4.p0(d60Var);
                                } else {
                                    d60Var = objR9;
                                    rcfVar2 = rcfVar3;
                                }
                                a26 a26Var2 = (a26) d60Var;
                                boolean zI3 = l46Var4.i(rcfVar2);
                                Object objR10 = l46Var4.R();
                                if (zI3 || objR10 == i8cVar2) {
                                    yv9 yv9Var = new yv9(0, rcfVar2, rcf.class, "onCardDiscard", "onCardDiscard()V", 0, 26);
                                    l46Var4.p0(yv9Var);
                                    objR10 = yv9Var;
                                }
                                ym7 ym7Var = (ym7) objR10;
                                boolean zI4 = l46Var4.i(rcfVar2);
                                final r0 r0Var2 = r0Var;
                                boolean zI5 = zI4 | l46Var4.i(r0Var2);
                                Object objR11 = l46Var4.R();
                                if (zI5 || objR11 == i8cVar2) {
                                    objR11 = new p4c(20, rcfVar2, r0Var2);
                                    l46Var4.p0(objR11);
                                }
                                final egd egdVar2 = egdVar;
                                final xw9 xw9Var3 = xw9Var2;
                                final boolean z14 = z11;
                                final boolean z15 = z12;
                                final e89 e89Var4 = e89Var3;
                                final e89 e89Var5 = e89Var;
                                final e89 e89Var6 = e89Var2;
                                final h0e h0eVar2 = h0eVar;
                                final s69 s69Var2 = s69Var;
                                b21.e(sddVar, null, xw9Var3, numH, z13, a26Var2, (l26) objR11, (x16) ym7Var, af1.b0(-2116914958, new o26() { // from class: wbf
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.o26
                                    public final Object t(Object obj14, Object obj15, Object obj16, Object obj17) {
                                        int i6;
                                        Object obj18;
                                        a26 a26Var3;
                                        boolean z16;
                                        c31 c31Var = (c31) obj14;
                                        ft1 ft1Var = (ft1) obj15;
                                        l46 l46Var5 = (l46) obj16;
                                        int iIntValue5 = ((Integer) obj17).intValue();
                                        c31Var.getClass();
                                        if ((iIntValue5 & 6) == 0) {
                                            i6 = (l46Var5.g(c31Var) ? 4 : 2) | iIntValue5;
                                        } else {
                                            i6 = iIntValue5;
                                        }
                                        if ((iIntValue5 & 48) == 0) {
                                            i6 |= l46Var5.g(ft1Var) ? 32 : 16;
                                        }
                                        if (l46Var5.W(i6 & 1, (i6 & 147) != 146)) {
                                            egd egdVar3 = egdVar2;
                                            hgd hgdVarA = egdVar3.a();
                                            boolean zG4 = l46Var5.g(egdVar3);
                                            r0 r0Var3 = r0Var2;
                                            boolean zI6 = zG4 | l46Var5.i(r0Var3);
                                            Object objR12 = l46Var5.R();
                                            i8c i8cVar3 = sf2.a;
                                            if (zI6 || objR12 == i8cVar3) {
                                                objR12 = new kcf(egdVar3, r0Var3, null);
                                                l46Var5.p0(objR12);
                                            }
                                            af1.o((l26) objR12, l46Var5, hgdVarA);
                                            jgb.l(0, l46Var5);
                                            bx9 bx9VarR = ynb.r(0.0f, 0.0f, 0.0f, 148.0f, 7);
                                            rcf rcfVar4 = rcfVar2;
                                            dd2 dd2VarB0 = af1.b0(-774390826, new zbf(rcfVar4, 0), l46Var5);
                                            dd2 dd2VarB1 = af1.b0(1526266199, new zbf(rcfVar4, 1), l46Var5);
                                            boolean zI7 = l46Var5.i(r0Var3);
                                            Object objR13 = l46Var5.R();
                                            if (zI7 || objR13 == i8cVar3) {
                                                objR13 = new qj2(r0Var3, 17);
                                                l46Var5.p0(objR13);
                                            }
                                            x16 x16Var4 = (x16) objR13;
                                            boolean zI8 = l46Var5.i(r0Var3);
                                            Object objR14 = l46Var5.R();
                                            if (zI8 || objR14 == i8cVar3) {
                                                objR14 = new qj2(r0Var3, 18);
                                                l46Var5.p0(objR14);
                                            }
                                            x16 x16Var5 = (x16) objR14;
                                            int iJ = ((sz9) s69Var2).j();
                                            if (z15) {
                                                l46Var5.f0(-2006670125);
                                                e89 e89Var7 = e89Var4;
                                                boolean zG5 = l46Var5.g(e89Var7);
                                                e89 e89Var8 = e89Var5;
                                                boolean zG6 = zG5 | l46Var5.g(e89Var8);
                                                e89 e89Var9 = e89Var6;
                                                boolean zG7 = zG6 | l46Var5.g(e89Var9) | l46Var5.i(rcfVar4);
                                                Object objR15 = l46Var5.R();
                                                if (zG7 || objR15 == i8cVar3) {
                                                    objR15 = new lcf(e89Var7, rcfVar4, e89Var8, e89Var9, null);
                                                    l46Var5.p0(objR15);
                                                }
                                                l46Var5.r(false);
                                                z16 = false;
                                                a26Var3 = (a26) objR15;
                                                obj18 = null;
                                            } else {
                                                l46Var5.f0(-2006418281);
                                                boolean zI9 = l46Var5.i(r0Var3) | l46Var5.i(rcfVar4);
                                                Object objR16 = l46Var5.R();
                                                if (zI9 || objR16 == i8cVar3) {
                                                    obj18 = null;
                                                    objR16 = new mcf(null, rcfVar4, r0Var3);
                                                    l46Var5.p0(objR16);
                                                } else {
                                                    obj18 = null;
                                                }
                                                a26Var3 = (a26) objR16;
                                                z16 = false;
                                                l46Var5.r(false);
                                            }
                                            int i7 = rcf.x;
                                            xw9 xw9Var4 = xw9Var3;
                                            int i8 = z16;
                                            boolean z17 = z14;
                                            hcc.c(sddVar, rcfVar4, egdVar3, 40.0f, xw9Var4, bx9VarR, ft1Var, dd2VarB0, dd2VarB1, x16Var4, x16Var5, z17, iJ, a26Var3, l46Var5, 113442880 | ((i6 << 15) & 3670016), 0, 0);
                                            if (rcfVar4.g() == tn4.a) {
                                                l46Var5.f0(-2006163740);
                                                boolean zK = hcc.k(rcfVar4.g(), egdVar3, rcfVar4.h() != null ? 1 : i8, l46Var5, i8);
                                                Object[] objArr2 = new Object[i8];
                                                Object objR17 = l46Var5.R();
                                                if (objR17 == i8cVar3) {
                                                    objR17 = new mie(23);
                                                    l46Var5.p0(objR17);
                                                }
                                                e89 e89Var10 = (e89) vfh.I(objArr2, (x16) objR17, l46Var5, 48);
                                                Boolean boolValueOf = Boolean.valueOf(egdVar3.c());
                                                h0e h0eVar3 = h0eVar2;
                                                Boolean boolValueOf2 = Boolean.valueOf(((psc) h0eVar3.getValue()).a);
                                                boolean zG8 = l46Var5.g(egdVar3) | l46Var5.g(h0eVar3) | l46Var5.g(e89Var10);
                                                Object objR18 = l46Var5.R();
                                                if (zG8 || objR18 == i8cVar3) {
                                                    objR18 = new ncf(egdVar3, h0eVar3, e89Var10, null);
                                                    l46Var5.p0(objR18);
                                                }
                                                af1.p(boolValueOf, boolValueOf2, (l26) objR18, l46Var5);
                                                String strQ7 = afc.q(R.string.ai_recommend_stage2_failed_toast, l46Var5);
                                                Throwable th = ((psc) h0eVar3.getValue()).b;
                                                Boolean bool = (Boolean) e89Var10.getValue();
                                                bool.booleanValue();
                                                boolean zG9 = l46Var5.g(h0eVar3) | l46Var5.g(e89Var10) | l46Var5.i(rcfVar4) | l46Var5.g(strQ7);
                                                Object objR19 = l46Var5.R();
                                                if (zG9 || objR19 == i8cVar3) {
                                                    objR19 = new ocf(rcfVar4, strQ7, h0eVar3, e89Var10, null);
                                                    l46Var5.p0(objR19);
                                                }
                                                af1.p(th, bool, (l26) objR19, l46Var5);
                                                rs0.a(384, af1.b0(-1543335728, new o50(egdVar3, rcfVar4, z17, h0eVar3, 26), l46Var5), l46Var5, ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, ynb.b0(24.0f, 0.0f, ynb.Y(c31Var.a(g09.a, ndb.w), xw9Var4), 2)), zK);
                                                l46Var5.r(i8);
                                            } else {
                                                l46Var5.f0(-2004368592);
                                                l46Var5.r(i8);
                                            }
                                        } else {
                                            l46Var5.Z();
                                        }
                                        return wef.a;
                                    }
                                }, l46Var4), l46Var4, (i5 & 14) | 100663296, 1);
                            } else {
                                l46Var4.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var3), l46Var3, 48, 1);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ e8(String str, j09 j09Var, j09 j09Var2, String str2, yof yofVar, a26 a26Var, boolean z, boolean z2, x16 x16Var, e89 e89Var) {
        this.d = str;
        this.v = j09Var;
        this.w = j09Var2;
        this.g = str2;
        this.x = yofVar;
        this.y = a26Var;
        this.b = z;
        this.c = z2;
        this.e = x16Var;
        this.f = e89Var;
    }

    public /* synthetic */ e8(List list, yx9 yx9Var, x48 x48Var, boolean z, boolean z2, String str, x16 x16Var, ii6 ii6Var, osd osdVar, e89 e89Var) {
        this.g = list;
        this.v = yx9Var;
        this.w = x48Var;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = x16Var;
        this.x = ii6Var;
        this.y = osdVar;
        this.f = e89Var;
    }
}
