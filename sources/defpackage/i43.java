package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.dailycard.DailyCardDrawRoute;
import ai.askquin.ui.dailycard.DailyCardEntry;
import ai.askquin.ui.dailycard.o;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i43 implements x16 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ i43(DailyCardEntry dailyCardEntry, e3b e3bVar, String str, ka9 ka9Var, boolean z, x16 x16Var) {
        this.d = dailyCardEntry;
        this.e = e3bVar;
        this.f = str;
        this.g = ka9Var;
        this.b = z;
        this.c = x16Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        x16 x16Var = this.c;
        boolean z = this.b;
        wef wefVar = wef.a;
        Object obj = this.g;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                dj6.i(this.b, (Context) obj3, (TarotSkinIdentify) obj2, this.c, (e89) obj4, (e89) obj);
                break;
            case 1:
                DailyCardEntry dailyCardEntry = (DailyCardEntry) obj3;
                String str = (String) obj4;
                ka9 ka9Var = (ka9) obj;
                if (!o.d(dailyCardEntry.getTargetDate(), e3b.a((e3b) obj2))) {
                    x16Var.invoke();
                } else {
                    ConcurrentHashMap concurrentHashMap = xfb.a;
                    xfb.i(str, "draw");
                    ka9.e(ka9Var, new DailyCardDrawRoute(dailyCardEntry.getTargetDate(), str, z), null, 6);
                }
                break;
            default:
                e89 e89Var = (e89) obj4;
                aw2 aw2Var = (aw2) obj3;
                ted tedVar = (ted) obj2;
                e89 e89Var2 = (e89) obj;
                if (z && !((Boolean) e89Var.getValue()).booleanValue()) {
                    e89Var.setValue(Boolean.TRUE);
                    ynb.V(aw2Var, null, null, new nka(tedVar, e89Var2, null), 3);
                    x16Var.invoke();
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ i43(boolean z, x16 x16Var, e89 e89Var, aw2 aw2Var, ted tedVar, e89 e89Var2) {
        this.b = z;
        this.c = x16Var;
        this.f = e89Var;
        this.d = aw2Var;
        this.e = tedVar;
        this.g = e89Var2;
    }

    public /* synthetic */ i43(boolean z, Context context, TarotSkinIdentify tarotSkinIdentify, x16 x16Var, e89 e89Var, e89 e89Var2) {
        this.b = z;
        this.d = context;
        this.e = tarotSkinIdentify;
        this.c = x16Var;
        this.f = e89Var;
        this.g = e89Var2;
    }
}
