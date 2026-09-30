package defpackage;

import ai.askquin.ui.settings.language.LanguagesActivity;
import ai.askquin.ui.web.WebViewActivity;
import android.content.Context;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y3d implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ y3d(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.x16
    public final Object invoke() throws Exception {
        int i = this.a;
        p05 p05Var = p05.a;
        wef wefVar = wef.a;
        Context context = this.b;
        switch (i) {
            case 0:
                ca2.a.getClass();
                kn2.z(context, ca2.c ? "https://discord.gg/Zdw56Hzm" : "https://quin.love/api/feedback/group-url");
                return wefVar;
            case 1:
                x1f x1fVar = x1f.a;
                x1f.k(p05Var, new e2d(4), 2);
                kn2.z(context, "https://work.weixin.qq.com/kfid/kfce247440cb54f4e1b");
                return wefVar;
            case 2:
                kn2.z(context, "https://quinlove.cn/personal-info");
                return wefVar;
            case 3:
                kn2.z(context, "https://quinlove.cn/third-party");
                return wefVar;
            case 4:
                Set set = r1c.a;
                context.getClass();
                int i2 = WebViewActivity.T0;
                pzd.i(context, "https://quin.love".concat("/cn/event/app-review"), (8 & 4) != 0 ? ozd.a : ozd.b, null);
                return wefVar;
            case 5:
                x57.V(context, LanguagesActivity.class, new iy9[0]);
                return wefVar;
            case 6:
                return Boolean.valueOf(!m7c.l(context));
            default:
                x1f x1fVar2 = x1f.a;
                x1f.k(p05Var, new ksf(27), 2);
                h5g h5gVar = h5g.a;
                r4g r4gVar = r4g.TodayFortune;
                w4g w4gVar = w4g.Account;
                h5g.g(r4gVar, w4gVar, null);
                h5g.g(r4g.QuickDecision, w4gVar, null);
                db6.y0(context);
                return wefVar;
        }
    }
}
