package defpackage;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b98 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b98(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                f98 f98Var = (f98) obj;
                d98 d98Var = f98Var.c;
                d98Var.getClass();
                for (e98 e98Var : f98Var.d) {
                    if (!e98Var.d && e98Var.c) {
                        ki5 ki5VarB = e98Var.b.b();
                        e98Var.b = new pk1(2);
                        e98Var.c = false;
                        d98Var.g(e98Var.a, ki5VarB);
                    }
                    jce jceVar = f98Var.b;
                    jceVar.getClass();
                    if (jceVar.a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                wo0 wo0Var = (wo0) obj;
                int i2 = message.what;
                if (i2 == 1) {
                    ((j5e) wo0Var.v).a();
                } else if (i2 == 2) {
                    ((k5e) wo0Var.w).a();
                } else if (i2 == 3) {
                    ((l5e) wo0Var.x).a();
                } else {
                    if (i2 != 4) {
                        return false;
                    }
                    ((m5e) wo0Var.y).a();
                }
                return true;
        }
    }
}
