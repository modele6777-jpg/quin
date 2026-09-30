package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import androidx.compose.foundation.layout.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gj3 implements n26 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gj3(e89 e89Var, TarotSkinIdentify tarotSkinIdentify, e89 e89Var2, int i, e89 e89Var3) {
        this.c = e89Var;
        this.f = tarotSkinIdentify;
        this.d = e89Var2;
        this.b = i;
        this.e = e89Var3;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        e89 e89Var;
        int i = this.a;
        i8c i8cVar = sf2.a;
        int i2 = this.b;
        wef wefVar = wef.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        int i3 = 4;
        switch (i) {
            case 0:
                e89 e89Var2 = (e89) obj7;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj4;
                e89 e89Var3 = (e89) obj6;
                e89 e89Var4 = (e89) obj5;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else if (((xh3) e89Var4.getValue()) != xh3.d) {
                    l46Var.f0(-1845237733);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-1846650403);
                    boolean zG = l46Var.g(e89Var2) | l46Var.e(tarotSkinIdentify.ordinal()) | l46Var.g(e89Var3);
                    int i4 = this.b;
                    boolean zE = l46Var.e(i4) | zG;
                    Object objR = l46Var.R();
                    if (zE || objR == i8cVar) {
                        e89Var = e89Var2;
                        bl blVar = new bl(i4, e89Var, tarotSkinIdentify, e89Var3, 2);
                        l46Var.p0(blVar);
                        objR = blVar;
                    } else {
                        e89Var = e89Var2;
                    }
                    bm8.h((x16) objR, null, false, null, null, af1.b0(-941985888, new hr(e89Var, i3), l46Var), l46Var, 1572864, 62);
                    l46Var.r(false);
                }
                break;
            case 1:
                sdd sddVar = (sdd) obj6;
                oz ozVar = (oz) obj5;
                h0e h0eVar = (h0e) obj4;
                e89 e89Var5 = (e89) obj7;
                e31 e31Var = (e31) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                e31Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var2.g(e31Var) ? 4 : 2;
                }
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    l46Var2.Z();
                } else {
                    float f = ((yi4) i7h.D(new yi4(e31Var.d() * 0.7f), i7h.D(new yi4(e31Var.c() * snd.b(null, l46Var2, 1)), new yi4(240.0f)))).a;
                    float fFloatValue = ((Number) h0eVar.getValue()).floatValue();
                    g09 g09Var = g09.a;
                    if (fFloatValue > 90.0f) {
                        l46Var2.f0(-787304076);
                        TarotCardChoice tarotCardChoice = (TarotCardChoice) e89Var5.getValue();
                        if (tarotCardChoice == null) {
                            l46Var2.f0(-787304077);
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(-787304076);
                            j09 j09VarP = b.p(g09Var, f);
                            Object objR2 = l46Var2.R();
                            if (objR2 == i8cVar) {
                                objR2 = new hl4(8);
                                l46Var2.p0(objR2);
                            }
                            j09 j09VarX = bzd.x(j09VarP, (a26) objR2);
                            rdd rddVarB = sdd.b("selected_card_key", l46Var2);
                            Object objR3 = l46Var2.R();
                            if (objR3 == i8cVar) {
                                objR3 = new fv1(3);
                                l46Var2.p0(objR3);
                            }
                            o7c.d(sdd.d(sddVar, j09VarX, rddVarB, ozVar, (p21) objR3), q7c.r(tarotCardChoice), null, false, an2.d, 8.0f, null, false, l46Var2, 221184, 204);
                            l46Var2.r(false);
                        }
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-788070737);
                        j09 j09VarP2 = b.p(g09Var, f);
                        Object objR4 = l46Var2.R();
                        if (objR4 == i8cVar) {
                            objR4 = new hl4(9);
                            l46Var2.p0(objR4);
                        }
                        j09 j09VarX2 = bzd.x(j09VarP2, (a26) objR4);
                        rdd rddVarB2 = sdd.b("cover_key_" + i2, l46Var2);
                        Object objR5 = l46Var2.R();
                        if (objR5 == i8cVar) {
                            objR5 = new fv1(2);
                            l46Var2.p0(objR5);
                        }
                        dt1.a(sdd.d(sddVar, j09VarX2, rddVarB2, ozVar, (p21) objR5), null, true, null, 8.0f, null, null, Integer.valueOf(i2), l46Var2, 24960, 106);
                        l46Var2.r(false);
                    }
                }
                break;
            default:
                c4c c4cVar = (c4c) obj7;
                h88 h88Var = (h88) obj6;
                dd2 dd2Var = (dd2) obj5;
                List list = (List) obj4;
                int iIntValue3 = ((Integer) obj).intValue();
                l46 l46Var3 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= l46Var3.e(iIntValue3) ? 4 : 2;
                }
                if (!l46Var3.W(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    l46Var3.Z();
                } else {
                    o4c o4cVarB = q4c.b(c4cVar, l46Var3);
                    wue wueVar = h88Var.c;
                    l26 l26Var = (254 & 2) != 0 ? o4cVarB.b : null;
                    h88 h88Var2 = (254 & 4) != 0 ? o4cVarB.c : null;
                    f01 f01Var = o4cVarB.d;
                    t62 t62Var = o4cVarB.e;
                    ude udeVar = o4cVarB.f;
                    s27 s27Var = o4cVarB.g;
                    n4c n4cVar = (254 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? o4cVarB.h : null;
                    o4cVarB.getClass();
                    tq.a(null, new o4c(wueVar, l26Var, h88Var2, f01Var, t62Var, udeVar, s27Var, n4cVar), af1.b0(1766993238, new ur5(i2, dd2Var, list, iIntValue3), l46Var3), l46Var3, 384, 1);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ gj3(c4c c4cVar, h88 h88Var, int i, dd2 dd2Var, List list) {
        this.c = c4cVar;
        this.d = h88Var;
        this.b = i;
        this.e = dd2Var;
        this.f = list;
    }

    public /* synthetic */ gj3(sdd sddVar, int i, oz ozVar, h0e h0eVar, e89 e89Var) {
        this.d = sddVar;
        this.b = i;
        this.e = ozVar;
        this.f = h0eVar;
        this.c = e89Var;
    }
}
