package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qs2 implements x16 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ qs2(aw2 aw2Var, e89 e89Var, e89 e89Var2, gh6 gh6Var, jx jxVar, n69 n69Var, e89 e89Var3, e89 e89Var4) {
        this.e = aw2Var;
        this.b = e89Var;
        this.c = e89Var2;
        this.f = gh6Var;
        this.g = jxVar;
        this.v = n69Var;
        this.d = e89Var3;
        this.w = e89Var4;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.w;
        Object obj4 = this.v;
        Object obj5 = this.g;
        Object obj6 = this.e;
        Object obj7 = this.f;
        switch (i) {
            case 0:
                r0 r0Var = (r0) obj6;
                x16 x16Var = (x16) obj7;
                mma mmaVar = (mma) obj5;
                Context context = (Context) obj4;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj3;
                e89 e89Var = (e89) obj2;
                e89 e89Var2 = (e89) obj;
                if (r0Var.Q() || r0Var.e0()) {
                    lt2.c(mmaVar, context, r0Var, tarotSkinIdentify, this.b, e89Var, x16Var);
                } else {
                    e89Var2.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                aw2 aw2Var = (aw2) obj6;
                e89 e89Var3 = (e89) obj2;
                gh6 gh6Var = (gh6) obj7;
                jx jxVar = (jx) obj5;
                n69 n69Var = (n69) obj4;
                e89 e89Var4 = (e89) obj;
                e89 e89Var5 = (e89) obj3;
                e89 e89Var6 = this.b;
                if (((xh3) e89Var6.getValue()) == xh3.d) {
                    e89Var3.setValue(dwf.a);
                    e89Var6.setValue(xh3.c);
                    ynb.V(aw2Var, null, null, new rj3(gh6Var, jxVar, n69Var, e89Var6, e89Var4, e89Var5, null), 3);
                }
                break;
            default:
                x16 x16Var2 = (x16) obj7;
                String str = (String) obj6;
                String str2 = (String) obj5;
                aw2 aw2Var2 = (aw2) obj4;
                ted tedVar = (ted) obj3;
                x16 x16Var3 = (x16) obj2;
                x16 x16Var4 = (x16) obj;
                e89 e89Var7 = this.b;
                alc alcVar = new alc(v2c.k(e89Var7) ? "optout" : ((Boolean) x16Var2.invoke()).booleanValue() ? "swipe_down" : "tap_scrim", 16);
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new b92("close", str, 1, str2, alcVar, 5), 2);
                ynb.V(aw2Var2, null, null, new q4g(tedVar, x16Var3, x16Var4, e89Var7, null), 3);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ qs2(x16 x16Var, String str, String str2, aw2 aw2Var, e89 e89Var, ted tedVar, x16 x16Var2, x16 x16Var3) {
        this.f = x16Var;
        this.e = str;
        this.g = str2;
        this.v = aw2Var;
        this.b = e89Var;
        this.w = tedVar;
        this.c = x16Var2;
        this.d = x16Var3;
    }

    public /* synthetic */ qs2(r0 r0Var, x16 x16Var, mma mmaVar, Context context, TarotSkinIdentify tarotSkinIdentify, e89 e89Var, e89 e89Var2, e89 e89Var3) {
        this.e = r0Var;
        this.f = x16Var;
        this.g = mmaVar;
        this.v = context;
        this.w = tarotSkinIdentify;
        this.b = e89Var;
        this.c = e89Var2;
        this.d = e89Var3;
    }
}
