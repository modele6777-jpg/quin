package defpackage;

import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.share.ShareActivity;
import ai.askquin.ui.share.SharePayload$DrawnCards;
import ai.askquin.ui.share.SharedDivination;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w5d implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ShareActivity b;
    public final /* synthetic */ iad c;
    public final /* synthetic */ x6d d;
    public final /* synthetic */ String e;

    public /* synthetic */ w5d(iad iadVar, ShareActivity shareActivity, x6d x6dVar, String str, int i) {
        this.a = i;
        this.c = iadVar;
        this.b = shareActivity;
        this.d = x6dVar;
        this.e = str;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        MixedDeckSnapshot mixedDeck;
        Object obj5;
        Object obj6;
        Object obj7;
        int i = this.a;
        i8c i8cVar = sf2.a;
        wef wefVar = wef.a;
        final int i2 = 2;
        boolean z = false;
        final int i3 = 1;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i4 = ShareActivity.T0;
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                    return wefVar;
                }
                iad iadVar = this.c;
                if (iadVar instanceof had) {
                    l46Var.f0(1216909350);
                    boolean zI = l46Var.i(iadVar);
                    Object objR = l46Var.R();
                    if (zI || objR == i8cVar) {
                        obj3 = objR;
                        hla hlaVar = new hla(24, iadVar);
                        l46Var.p0(hlaVar);
                        obj3 = hlaVar;
                    }
                    x16 x16Var = (x16) obj3;
                    pwf pwfVarA = qd8.a(l46Var);
                    if (pwfVarA == null) {
                        qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    z5c.G(job.a.b(lbd.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var);
                    l46Var.r(false);
                } else {
                    l46Var.f0(1216990074);
                    l46Var.r(false);
                }
                Object objR2 = l46Var.R();
                Object obj8 = objR2;
                if (objR2 == i8cVar) {
                    a6d a6dVar = new a6d(2, null);
                    l46Var.p0(a6dVar);
                    obj8 = a6dVar;
                }
                af1.o((l26) obj8, l46Var, wefVar);
                o7c.a(false, null, af1.b0(385699670, new w5d(this.b, iadVar, this.d, this.e, 1), l46Var), l46Var, 384, 3);
                return wefVar;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i5 = ShareActivity.T0;
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    final ShareActivity shareActivity = this.b;
                    e89 e89VarT = tm7.t(((hod) shareActivity.Q0.getValue()).b, l46Var2);
                    Object objR3 = l46Var2.R();
                    if (objR3 == i8cVar) {
                        obj4 = objR3;
                        Object applicationContext = shareActivity.getApplicationContext();
                        applicationContext.getClass();
                        mib mibVarA = ((rkd) applicationContext).a(shareActivity);
                        l46Var2.p0(mibVarA);
                        obj4 = mibVarA;
                    }
                    obj4 = objR3;
                    aw6 aw6Var = (aw6) obj4;
                    boolean zG = l46Var2.g(aw6Var);
                    Object objR4 = l46Var2.R();
                    Object obj9 = objR4;
                    if (zG || objR4 == i8cVar) {
                        di2 di2Var = new di2(((mib) aw6Var).a);
                        ((p95) di2Var.v).a.put(yw6.f, Boolean.FALSE);
                        mib mibVarC = di2Var.c();
                        l46Var2.p0(mibVarC);
                        obj9 = mibVarC;
                    }
                    aw6 aw6Var2 = (aw6) obj9;
                    boolean zI2 = l46Var2.i(aw6Var2) | l46Var2.i(aw6Var);
                    Object objR5 = l46Var2.R();
                    Object obj10 = objR5;
                    if (zI2 || objR5 == i8cVar) {
                        h6b h6bVar = new h6b(20, aw6Var2, aw6Var);
                        l46Var2.p0(h6bVar);
                        obj10 = h6bVar;
                    }
                    af1.h(aw6Var, aw6Var2, (a26) obj10, l46Var2);
                    boolean zI3 = l46Var2.i(shareActivity);
                    Object objR6 = l46Var2.R();
                    Object obj11 = objR6;
                    if (zI3 || objR6 == i8cVar) {
                        final boolean z2 = z ? 1 : 0;
                        x16 x16Var2 = new x16() { // from class: x5d
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i6 = z2;
                                wef wefVar2 = wef.a;
                                ShareActivity shareActivity2 = shareActivity;
                                switch (i6) {
                                    case 0:
                                        int i7 = ShareActivity.T0;
                                        shareActivity2.getWindow().setNavigationBarColor(0);
                                        break;
                                    case 1:
                                        int i8 = ShareActivity.T0;
                                        shareActivity2.finish();
                                        break;
                                    case 2:
                                        int i9 = ShareActivity.T0;
                                        shareActivity2.finish();
                                        break;
                                    default:
                                        int i10 = ShareActivity.T0;
                                        shareActivity2.finish();
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var2.p0(x16Var2);
                        obj11 = x16Var2;
                    }
                    af1.u((x16) obj11, l46Var2);
                    mh3.b(new e1b[]{snd.a.a((die) e89VarT.getValue()), n72.a.a(aw6Var2)}, af1.b0(-1320909802, new w5d(this.c, shareActivity, this.d, this.e, 2), l46Var2), l46Var2, 48);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i6 = ShareActivity.T0;
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                    return wefVar;
                }
                iad iadVar2 = this.c;
                if (iadVar2 instanceof had) {
                    mixedDeck = ((had) iadVar2).a.getMixedDeck();
                } else {
                    if (!(iadVar2 instanceof SharePayload$DrawnCards)) {
                        ap.c();
                        return null;
                    }
                    mixedDeck = ((SharePayload$DrawnCards) iadVar2).getMixedDeck();
                }
                snd.a(mixedDeck, af1.b0(853899423, new w5d(this.b, iadVar2, this.d, this.e, 3), l46Var3), l46Var3, 48 | MixedDeckSnapshot.$stable);
                return wefVar;
            default:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i7 = ShareActivity.T0;
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    final ShareActivity shareActivity2 = this.b;
                    boolean zI4 = l46Var4.i(shareActivity2);
                    Object objR7 = l46Var4.R();
                    if (zI4 || objR7 == i8cVar) {
                        obj5 = objR7;
                        x16 x16Var3 = new x16() { // from class: x5d
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i8 = i3;
                                wef wefVar2 = wef.a;
                                ShareActivity shareActivity3 = shareActivity2;
                                switch (i8) {
                                    case 0:
                                        int i9 = ShareActivity.T0;
                                        shareActivity3.getWindow().setNavigationBarColor(0);
                                        break;
                                    case 1:
                                        int i10 = ShareActivity.T0;
                                        shareActivity3.finish();
                                        break;
                                    case 2:
                                        int i11 = ShareActivity.T0;
                                        shareActivity3.finish();
                                        break;
                                    default:
                                        int i12 = ShareActivity.T0;
                                        shareActivity3.finish();
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var4.p0(x16Var3);
                        obj5 = x16Var3;
                    }
                    if (mh3.S(null, (x16) obj5, l46Var4, 0, 1)) {
                        l46Var4.f0(-573456203);
                        iad iadVar3 = this.c;
                        if (iadVar3 instanceof had) {
                            l46Var4.f0(-573405828);
                            SharedDivination sharedDivination = ((had) iadVar3).a;
                            Bitmap bitmap = shareActivity2.S0;
                            boolean zI5 = l46Var4.i(shareActivity2);
                            Object objR8 = l46Var4.R();
                            if (zI5 || objR8 == i8cVar) {
                                obj7 = objR8;
                                x16 x16Var4 = new x16() { // from class: x5d
                                    @Override // defpackage.x16
                                    public final Object invoke() {
                                        int i8 = i2;
                                        wef wefVar2 = wef.a;
                                        ShareActivity shareActivity3 = shareActivity2;
                                        switch (i8) {
                                            case 0:
                                                int i9 = ShareActivity.T0;
                                                shareActivity3.getWindow().setNavigationBarColor(0);
                                                break;
                                            case 1:
                                                int i10 = ShareActivity.T0;
                                                shareActivity3.finish();
                                                break;
                                            case 2:
                                                int i11 = ShareActivity.T0;
                                                shareActivity3.finish();
                                                break;
                                            default:
                                                int i12 = ShareActivity.T0;
                                                shareActivity3.finish();
                                                break;
                                        }
                                        return wefVar2;
                                    }
                                };
                                l46Var4.p0(x16Var4);
                                obj7 = x16Var4;
                            }
                            h7d.e(sharedDivination, this.d, (x16) obj7, bitmap, l46Var4, SharedDivination.$stable | 64);
                            l46Var4.r(false);
                        } else {
                            if (!(iadVar3 instanceof SharePayload$DrawnCards)) {
                                throw tec.d(258596077, l46Var4, false);
                            }
                            l46Var4.f0(258606539);
                            SharePayload$DrawnCards sharePayload$DrawnCards = (SharePayload$DrawnCards) iadVar3;
                            boolean zI6 = l46Var4.i(shareActivity2);
                            Object objR9 = l46Var4.R();
                            if (zI6 || objR9 == i8cVar) {
                                obj6 = objR9;
                                final int i8 = 3;
                                x16 x16Var5 = new x16() { // from class: x5d
                                    @Override // defpackage.x16
                                    public final Object invoke() {
                                        int i9 = i8;
                                        wef wefVar2 = wef.a;
                                        ShareActivity shareActivity3 = shareActivity2;
                                        switch (i9) {
                                            case 0:
                                                int i10 = ShareActivity.T0;
                                                shareActivity3.getWindow().setNavigationBarColor(0);
                                                break;
                                            case 1:
                                                int i11 = ShareActivity.T0;
                                                shareActivity3.finish();
                                                break;
                                            case 2:
                                                int i12 = ShareActivity.T0;
                                                shareActivity3.finish();
                                                break;
                                            default:
                                                int i13 = ShareActivity.T0;
                                                shareActivity3.finish();
                                                break;
                                        }
                                        return wefVar2;
                                    }
                                };
                                l46Var4.p0(x16Var5);
                                obj6 = x16Var5;
                            }
                            g21.f(sharePayload$DrawnCards, this.e, (x16) obj6, l46Var4, SharePayload$DrawnCards.$stable);
                            l46Var4.r(false);
                        }
                        l46Var4.r(false);
                    } else {
                        l46Var4.f0(-572936829);
                        l46Var4.r(false);
                    }
                } else {
                    l46Var4.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ w5d(ShareActivity shareActivity, iad iadVar, x6d x6dVar, String str, int i) {
        this.a = i;
        this.b = shareActivity;
        this.c = iadVar;
        this.d = x6dVar;
        this.e = str;
    }
}
