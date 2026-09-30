package defpackage;

import android.content.SharedPreferences;
import android.os.Message;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cy8 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hy8 b;

    public /* synthetic */ cy8(hy8 hy8Var, int i) {
        this.a = i;
        this.b = hy8Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        int i2 = 0;
        hy8 hy8Var = this.b;
        switch (i) {
            case 0:
                Class<bsa> cls = bsa.class;
                return new xx8(new vx7(1, xqa.n0, cls, "loadOrThrow", "loadOrThrow(Lnet/xmind/donut/common/utils/DefaultPreferencePair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 3), new ey8(2, null), new vx7(1, xqa.o0, cls, "loadOrThrow", "loadOrThrow(Lnet/xmind/donut/common/utils/DefaultPreferencePair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 4), new fy8(1, null), new cy8(hy8Var, 1));
            case 1:
                synchronized (hy8Var.b.a) {
                    tx8 tx8Var = hy8Var.a;
                    p9a p9aVar = tx8Var.g;
                    String str = tx8Var.e;
                    synchronized (p9aVar) {
                        p9aVar.o = false;
                        p9aVar.l(str);
                    }
                    tx8Var.k("$opt_in", null);
                }
                return wef.a;
            default:
                tx8 tx8Var2 = hy8Var.a;
                p9a p9aVar2 = tx8Var2.g;
                synchronized (p9aVar2) {
                    try {
                        SharedPreferences.Editor editorEdit = ((SharedPreferences) p9aVar2.a.get()).edit();
                        editorEdit.clear();
                        editorEdit.apply();
                        p9aVar2.g();
                        p9aVar2.d();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e.getCause());
                    }
                }
                zl zlVarD = tx8Var2.d();
                tl tlVar = new tl(tx8Var2.e);
                zlVarD.getClass();
                Message messageObtain = Message.obtain();
                messageObtain.what = 7;
                messageObtain.obj = tlVar;
                zlVarD.b.a(messageObtain);
                tx8Var2.g(p9aVar2.a(), false);
                tx8Var2.c();
                fb5 fb5Var = tx8Var2.m;
                fb5Var.e.post(new eb5(fb5Var, i2));
                tx8Var2.p.set(false);
                tx8Var2.k.getClass();
                return wef.a;
        }
    }
}
