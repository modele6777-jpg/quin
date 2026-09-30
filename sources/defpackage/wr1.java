package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wr1 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ e89 c;

    public /* synthetic */ wr1(Context context, e89 e89Var, int i) {
        this.a = i;
        this.b = context;
        this.c = e89Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                String str = (String) e89Var.getValue();
                Object systemService = context.getSystemService("clipboard");
                systemService.getClass();
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("CardLayoutConfig", str));
                jcc.k(0, "Config copied to clipboard");
                break;
            case 1:
                x04 x04Var = (x04) ua3.a().get(((Number) e89Var.getValue()).intValue() % ua3.a().size());
                ym8.N(context, x04Var);
                jcc.k(0, "发送 push_id=".concat(x04Var.b));
                e89Var.setValue(Integer.valueOf(((Number) e89Var.getValue()).intValue() + 1));
                break;
            default:
                ca2.a.getClass();
                boolean z = ca2.c;
                if (!z) {
                    try {
                        kn2.z(context, z ? "https://discord.gg/Zdw56Hzm" : "https://quin.love/api/feedback/group-url");
                    } catch (Throwable unused) {
                    }
                } else {
                    e89Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return wefVar;
    }
}
